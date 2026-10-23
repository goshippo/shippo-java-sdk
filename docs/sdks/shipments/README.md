# Shipments

## Overview

A shipment is the act of transporting goods. A shipment object contains **to** and **from** addresses, and the parcel details that you are shipping. You can use the shipment object to retrieve shipping rates and purchase a shipping label.

### Available Operations

* [list](#list) - List all shipments
* [create](#create) - Create a new shipment
* [get](#get) - Retrieve a shipment

## list

Returns a list of all shipment objects.

To filter results, use the optional query parameters below. Provided dates should be ISO 8601 UTC dates (timezone offsets are currently not supported).

- `object_created_gt`: object(s) created after the provided date time
- `object_created_gte`: object(s) created at or after the provided date time
- `object_created_lt`: object(s) created before the provided date time
- `object_created_lte`: object(s) created at or before the provided date time

Date format examples: `2017-01-01`, `2017-01-01T03:30:30` (or `2017-01-01T03:30:30.5`), `2017-01-01T03:30:30Z`

Example URL: `https://api.goshippo.com/shipments/?object_created_gte=2017-01-01T00:00:30&object_created_lt=2017-04-01T00:00:30`

Note: Shipment objects older than 390 days are not returned.

### Example Usage

<!-- UsageSnippet language="java" operationID="ListShipments" method="get" path="/shipments" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.ListShipmentsRequest;
import com.goshippo.shippo_sdk.models.operations.ListShipmentsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        ListShipmentsRequest req = ListShipmentsRequest.builder()
                .build();

        ListShipmentsResponse res = sdk.shipments().list()
                .request(req)
                .call();

        if (res.shipmentPaginatedList().isPresent()) {
            System.out.println(res.shipmentPaginatedList().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListShipmentsRequest](../../models/operations/ListShipmentsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListShipmentsResponse](../../models/operations/ListShipmentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## create

Creates a new shipment object.

### Example Usage

<!-- UsageSnippet language="java" operationID="CreateShipment" method="post" path="/shipments" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.*;
import com.goshippo.shippo_sdk.models.operations.CreateShipmentResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        ShipmentCreateRequest req = ShipmentCreateRequest.builder()
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
                .build();

        CreateShipmentResponse res = sdk.shipments().create()
                .request(req)
                .call();

        if (res.shipment().isPresent()) {
            System.out.println(res.shipment().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ShipmentCreateRequest](../../models/shared/ShipmentCreateRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[CreateShipmentResponse](../../models/operations/CreateShipmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Returns an existing shipment using an object ID. Shipment objects older than 390 days are not returned.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetShipment" method="get" path="/shipments/{ShipmentId}" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.GetShipmentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        GetShipmentResponse res = sdk.shipments().get()
                .shipmentId("<id>")
                .call();

        if (res.shipment().isPresent()) {
            System.out.println(res.shipment().get());
        }
    }
}
```

### Parameters

| Parameter                           | Type                                | Required                            | Description                         |
| ----------------------------------- | ----------------------------------- | ----------------------------------- | ----------------------------------- |
| `shipmentId`                        | *String*                            | :heavy_check_mark:                  | Object ID of the shipment to update |

### Response

**[GetShipmentResponse](../../models/operations/GetShipmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |