# Transactions
(*transactions()*)

## Overview

A transaction is the purchase of a shipping label from a shipping provider for a specific service. You can print purchased labels and used them to ship a parcel with a carrier, such as USPS or FedEx.
<SchemaDefinition schemaRef="#/components/schemas/Transaction"/>

### Available Operations

* [list](#list) - List all shipping labels
* [create](#create) - Create a shipping label
* [get](#get) - Retrieve a shipping label

## list

Returns a list of all transaction objects.

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.components.TrackingStatusEnum;
import com.shippo.shippo_java_sdk.models.components.TransactionStatusEnum;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.ListTransactionsRequest;
import com.shippo.shippo_java_sdk.models.operations.ListTransactionsResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
                .build();

            ListTransactionsRequest req = ListTransactionsRequest.builder()
                .rate("<value>")
                .objectStatus(TransactionStatusEnum.SUCCESS)
                .trackingStatus(TrackingStatusEnum.DELIVERED)
                .page(768578L)
                .results(99895L)
                .build();

            ListTransactionsResponse res = sdk.transactions().list()
                .request(req)
                .call();

            if (res.transactionPaginatedList().isPresent()) {
                // handle response
            }
        } catch (com.shippo.shippo_java_sdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                  | [com.shippo.shippo_java_sdk.models.operations.ListTransactionsRequest](../../models/operations/ListTransactionsRequest.md) | :heavy_check_mark:                                                                                                         | The request object to use for the request.                                                                                 |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.ListTransactionsResponse>](../../models/operations/ListTransactionsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## create

Creates a new transaction object and purchases the shipping label using a rate object that has previously been created. <br> OR <br> Creates a new transaction object and purchases the shipping label instantly using shipment details, an existing carrier account, and an existing service level token.

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.AddressCreateRequest;
import com.shippo.shippo_java_sdk.models.components.Alcohol;
import com.shippo.shippo_java_sdk.models.components.AncillaryEndorsement;
import com.shippo.shippo_java_sdk.models.components.Billing;
import com.shippo.shippo_java_sdk.models.components.Cod;
import com.shippo.shippo_java_sdk.models.components.CustomerReference;
import com.shippo.shippo_java_sdk.models.components.DangerousGoodsBiologicalMaterial;
import com.shippo.shippo_java_sdk.models.components.DangerousGoodsCode;
import com.shippo.shippo_java_sdk.models.components.DangerousGoodsLithiumBatteries;
import com.shippo.shippo_java_sdk.models.components.DangerousGoodsObject;
import com.shippo.shippo_java_sdk.models.components.DepartmentNumber;
import com.shippo.shippo_java_sdk.models.components.DistanceUnitEnum;
import com.shippo.shippo_java_sdk.models.components.DryIce;
import com.shippo.shippo_java_sdk.models.components.InstantTransactionCreateRequest;
import com.shippo.shippo_java_sdk.models.components.Insurance;
import com.shippo.shippo_java_sdk.models.components.InvoiceNumber;
import com.shippo.shippo_java_sdk.models.components.LabelFileType;
import com.shippo.shippo_java_sdk.models.components.LabelFileTypeEnum;
import com.shippo.shippo_java_sdk.models.components.LasershipAttrs;
import com.shippo.shippo_java_sdk.models.components.ParcelCreateRequest;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateAramexAustraliaEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateCouriersPleaseEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateDHLeCommerceEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateDPDUKEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateFedExEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateUPSEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateUSPSEnum;
import com.shippo.shippo_java_sdk.models.components.PaymentMethod;
import com.shippo.shippo_java_sdk.models.components.PoNumber;
import com.shippo.shippo_java_sdk.models.components.PreferredDeliveryTimeframe;
import com.shippo.shippo_java_sdk.models.components.Provider;
import com.shippo.shippo_java_sdk.models.components.RecipientType;
import com.shippo.shippo_java_sdk.models.components.ReturnServiceType;
import com.shippo.shippo_java_sdk.models.components.RmaNumber;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.components.ShipmentCreateRequest;
import com.shippo.shippo_java_sdk.models.components.ShipmentExtra;
import com.shippo.shippo_java_sdk.models.components.SignatureConfirmation;
import com.shippo.shippo_java_sdk.models.components.TransactionCreateRequest;
import com.shippo.shippo_java_sdk.models.components.Type;
import com.shippo.shippo_java_sdk.models.components.WeightUnitEnum;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.CreateTransactionRequest;
import com.shippo.shippo_java_sdk.models.operations.CreateTransactionResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
                .build();

            CreateTransactionResponse res = sdk.transactions().create()
                .shippoApiVersion("2018-02-08")
                .requestBody(new Object())
                .call();

            if (res.transactionCreateResponse().isPresent()) {
                // handle response
            }
        } catch (com.shippo.shippo_java_sdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              | Example                                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `shippoApiVersion`                                                                                                                                       | *Optional<? extends String>*                                                                                                                             | :heavy_minus_sign:                                                                                                                                       | String used to pick a non-default API version to use                                                                                                     | 2018-02-08                                                                                                                                               |
| `requestBody`                                                                                                                                            | [Optional<? extends com.shippo.shippo_java_sdk.models.operations.CreateTransactionRequestBody>](../../models/operations/CreateTransactionRequestBody.md) | :heavy_minus_sign:                                                                                                                                       | Examples.                                                                                                                                                |                                                                                                                                                          |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.CreateTransactionResponse>](../../models/operations/CreateTransactionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## get

Returns an existing transaction using an object ID.

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.GetTransactionRequest;
import com.shippo.shippo_java_sdk.models.operations.GetTransactionResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
                .build();

            GetTransactionResponse res = sdk.transactions().get()
                .transactionId("<value>")
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.transaction().isPresent()) {
                // handle response
            }
        } catch (com.shippo.shippo_java_sdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                            | Type                                                 | Required                                             | Description                                          | Example                                              |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `transactionId`                                      | *String*                                             | :heavy_check_mark:                                   | Object ID of the transaction to update               |                                                      |
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.GetTransactionResponse>](../../models/operations/GetTransactionResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
