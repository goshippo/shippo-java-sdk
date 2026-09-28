# Batches

## Overview

A batch is a technique for creating multiple labels at once. Use the  batch object to create and purchase many shipments in two API calls. After creating the batch, retrieve the batch to verify that all shipments are valid. You can add and remove shipments after you have created the batch. When all shipments are valid you can purchase the batch and retrieve all the shipping labels.

### Available Operations

* [create](#create) - Create a batch
* [get](#get) - Retrieve a batch
* [addShipments](#addshipments) - Add shipments to a batch
* [purchase](#purchase) - Purchase a batch
* [removeShipments](#removeshipments) - Remove shipments from a batch

## create

Creates a new batch object for purchasing shipping labels for many shipments at once. Batches are created asynchronously. This means that the API response won't include your batch shipments yet. You need to retrieve the batch later to verify that all batch shipments are valid.

### Example Usage

<!-- UsageSnippet language="java" operationID="CreateBatch" method="post" path="/batches" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.BatchCreateRequest;
import com.goshippo.shippo_sdk.models.components.LabelFileTypeEnum;
import com.goshippo.shippo_sdk.models.operations.CreateBatchResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        BatchCreateRequest req = BatchCreateRequest.builder()
                .defaultCarrierAccount("078870331023437cb917f5187429b093")
                .defaultServicelevelToken("usps_priority")
                .batchShipments(List.of())
                .labelFiletype(LabelFileTypeEnum.PDF4X6)
                .metadata("BATCH #1")
                .build();

        CreateBatchResponse res = sdk.batches().create()
                .request(req)
                .call();

        if (res.batch().isPresent()) {
            System.out.println(res.batch().get());
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [BatchCreateRequest](../../models/shared/BatchCreateRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[CreateBatchResponse](../../models/operations/CreateBatchResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Returns a batch using an object ID.

Batch shipments are displayed 100 at a time. You can iterate through each page using the `?page=` query parameter. You can also filter based on batch shipment status, for example, by passing a query param like `?object_results=creation_failed`.

For more details on filtering results, see our guide on [filtering](https://docs.goshippo.com/docs/api_concepts/filtering/).

### Example Usage

<!-- UsageSnippet language="java" operationID="GetBatch" method="get" path="/batches/{BatchId}" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.GetBatchResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        GetBatchResponse res = sdk.batches().get()
                .batchId("<id>")
                .page(1L)
                .results(5L)
                .call();

        if (res.batch().isPresent()) {
            System.out.println(res.batch().get());
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `batchId`                                                     | *String*                                                      | :heavy_check_mark:                                            | Object ID of the batch                                        |
| `page`                                                        | *Optional\<Long>*                                             | :heavy_minus_sign:                                            | The page number you want to select                            |
| `results`                                                     | *Optional\<Long>*                                             | :heavy_minus_sign:                                            | The number of results to return per page (max 100, default 5) |

### Response

**[GetBatchResponse](../../models/operations/GetBatchResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## addShipments

Adds batch shipments to an existing batch.

### Example Usage

<!-- UsageSnippet language="java" operationID="AddShipmentsToBatch" method="post" path="/batches/{BatchId}/add_shipments" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.*;
import com.goshippo.shippo_sdk.models.operations.AddShipmentsToBatchResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        AddShipmentsToBatchResponse res = sdk.batches().addShipments()
                .batchId("<id>")
                .requestBody(List.of(
                    BatchShipmentCreateRequest.builder()
                        .shipment(ShipmentCreateRequest.builder()
                            .addressFrom(AddressFrom.of("d799c2679e644279b59fe661ac8fa488"))
                            .addressTo(AddressTo.of("d799c2679e644279b59fe661ac8fa489"))
                            .parcels(List.of(
                                Parcels.of("<value>")))
                            .extra(ShipmentExtra.builder()
                                .accountsReceivableCustomerAccount(UPSReferenceFields.builder()
                                    .prefix("ABC")
                                    .value("value")
                                    .refSort(1L)
                                    .build())
                                .appropriationNumber(UPSReferenceFields.builder()
                                    .prefix("ABC")
                                    .value("value")
                                    .refSort(1L)
                                    .build())
                                .billOfLadingNumber(UPSReferenceFields.builder()
                                    .prefix("ABC")
                                    .value("value")
                                    .refSort(1L)
                                    .build())
                                .cod(Cod.builder()
                                    .amount("5.5")
                                    .currency("USD")
                                    .paymentMethod(PaymentMethod.CASH)
                                    .build())
                                .codNumber(UPSReferenceFields.builder()
                                    .prefix("ABC")
                                    .value("value")
                                    .refSort(1L)
                                    .build())
                                .customerReference(CustomerReference.builder()
                                    .refSort(1L)
                                    .build())
                                .dealerOrderNumber(UPSReferenceFields.builder()
                                    .prefix("ABC")
                                    .value("value")
                                    .refSort(1L)
                                    .build())
                                .deptNumber(DepartmentNumber.builder()
                                    .refSort(3L)
                                    .build())
                                .fdaProductCode(UPSReferenceFields.builder()
                                    .prefix("ABC")
                                    .value("value")
                                    .refSort(1L)
                                    .build())
                                .insurance(Insurance.builder()
                                    .amount("5.5")
                                    .currency("USD")
                                    .build())
                                .invoiceNumber(InvoiceNumber.builder()
                                    .refSort(2L)
                                    .build())
                                .manifestNumber(UPSReferenceFields.builder()
                                    .prefix("ABC")
                                    .value("value")
                                    .refSort(1L)
                                    .build())
                                .modelNumber(UPSReferenceFields.builder()
                                    .prefix("ABC")
                                    .value("value")
                                    .refSort(1L)
                                    .build())
                                .partNumber(UPSReferenceFields.builder()
                                    .prefix("ABC")
                                    .value("value")
                                    .refSort(1L)
                                    .build())
                                .poNumber(PoNumber.builder()
                                    .refSort(2L)
                                    .build())
                                .productionCode(UPSReferenceFields.builder()
                                    .prefix("ABC")
                                    .value("value")
                                    .refSort(1L)
                                    .build())
                                .purchaseRequestNumber(UPSReferenceFields.builder()
                                    .prefix("ABC")
                                    .value("value")
                                    .refSort(1L)
                                    .build())
                                .rmaNumber(RmaNumber.builder()
                                    .refSort(1L)
                                    .build())
                                .salespersonNumber(UPSReferenceFields.builder()
                                    .prefix("ABC")
                                    .value("value")
                                    .refSort(1L)
                                    .build())
                                .serialNumber(UPSReferenceFields.builder()
                                    .prefix("ABC")
                                    .value("value")
                                    .refSort(1L)
                                    .build())
                                .storeNumber(UPSReferenceFields.builder()
                                    .prefix("ABC")
                                    .value("value")
                                    .refSort(1L)
                                    .build())
                                .transactionReferenceNumber(UPSReferenceFields.builder()
                                    .prefix("ABC")
                                    .value("value")
                                    .refSort(1L)
                                    .build())
                                .build())
                            .metadata("Customer ID 123456")
                            .shipmentDate("2021-03-22T12:00:00Z")
                            .addressReturn(AddressReturn.of("d799c2679e644279b59fe661ac8fa488"))
                            .customsDeclaration(ShipmentCreateRequestCustomsDeclaration.of("adcfdddf8ec64b84ad22772bce3ea37a"))
                            .carrierAccounts(List.of(
                                "065a4a8c10d24a34ab932163a1b87f52",
                                "73f706f4bdb94b54a337563840ce52b0"))
                            .build())
                        .carrierAccount("a4391cd4ab974f478f55dc08b5c8e3b3")
                        .metadata("SHIPMENT #1")
                        .servicelevelToken("fedex_ground")
                        .build()))
                .call();

        if (res.batch().isPresent()) {
            System.out.println(res.batch().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                  | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `batchId`                                                                                  | *String*                                                                                   | :heavy_check_mark:                                                                         | Object ID of the batch                                                                     |
| `requestBody`                                                                              | List\<[BatchShipmentCreateRequest](../../models/components/BatchShipmentCreateRequest.md)> | :heavy_check_mark:                                                                         | Array of shipments to add to the batch                                                     |

### Response

**[AddShipmentsToBatchResponse](../../models/operations/AddShipmentsToBatchResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## purchase

Purchases an existing batch with a status of `VALID`. 
Once you send a POST request to the purchase endpoint the batch status will change to `PURCHASING`. 
When all the shipments are purchased, the status will change to `PURCHASED` and you will receive a 
`batch_purchased` webhook indicating that the batch has been purchased

### Example Usage

<!-- UsageSnippet language="java" operationID="PurchaseBatch" method="post" path="/batches/{BatchId}/purchase" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.PurchaseBatchResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        PurchaseBatchResponse res = sdk.batches().purchase()
                .batchId("<id>")
                .call();

        if (res.batch().isPresent()) {
            System.out.println(res.batch().get());
        }
    }
}
```

### Parameters

| Parameter              | Type                   | Required               | Description            |
| ---------------------- | ---------------------- | ---------------------- | ---------------------- |
| `batchId`              | *String*               | :heavy_check_mark:     | Object ID of the batch |

### Response

**[PurchaseBatchResponse](../../models/operations/PurchaseBatchResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeShipments

Removes shipments from an existing batch shipment.

### Example Usage

<!-- UsageSnippet language="java" operationID="RemoveShipmentsFromBatch" method="post" path="/batches/{BatchId}/remove_shipments" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.RemoveShipmentsFromBatchResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        RemoveShipmentsFromBatchResponse res = sdk.batches().removeShipments()
                .batchId("<id>")
                .requestBody(List.of(
                    "<value 1>"))
                .call();

        if (res.batch().isPresent()) {
            System.out.println(res.batch().get());
        }
    }
}
```

### Parameters

| Parameter                                              | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `batchId`                                              | *String*                                               | :heavy_check_mark:                                     | Object ID of the batch                                 |
| `requestBody`                                          | List\<*String*>                                        | :heavy_check_mark:                                     | Array of shipments object ids to remove from the batch |

### Response

**[RemoveShipmentsFromBatchResponse](../../models/operations/RemoveShipmentsFromBatchResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |