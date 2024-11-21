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

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.components.TrackingStatusEnum;
import com.shippo.sdk.models.components.TransactionStatusEnum;
import com.shippo.sdk.models.operations.ListTransactionsRequest;
import com.shippo.sdk.models.operations.ListTransactionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        ListTransactionsRequest req = ListTransactionsRequest.builder()
                .objectStatus(TransactionStatusEnum.SUCCESS)
                .trackingStatus(TrackingStatusEnum.DELIVERED)
                .build();

        ListTransactionsResponse res = sdk.transactions().list()
                .request(req)
                .call();

        if (res.transactionPaginatedList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ListTransactionsRequest](../../models/operations/ListTransactionsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ListTransactionsResponse](../../models/operations/ListTransactionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## create

Creates a new transaction object and purchases the shipping label using a rate object that has previously been created. <br> OR <br> Creates a new transaction object and purchases the shipping label instantly using shipment details, an existing carrier account, and an existing service level token.

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.components.LabelFileTypeEnum;
import com.shippo.sdk.models.components.TransactionCreateRequest;
import com.shippo.sdk.models.operations.CreateTransactionRequestBody;
import com.shippo.sdk.models.operations.CreateTransactionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        CreateTransactionResponse res = sdk.transactions().create()
                .shippoApiVersion("2018-02-08")
                .requestBody(CreateTransactionRequestBody.of(TransactionCreateRequest.builder()
                    .rate("ec9f0d3adc9441449c85d315f0997fd5")
                    .async(false)
                    .labelFileType(LabelFileTypeEnum.PDF4X6)
                    .metadata("Order ID #12345")
                    .order("adcfdddf8ec64b84ad22772bce3ea37a")
                    .build()))
                .call();

        if (res.transaction().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |
| `requestBody`                                                                                                                                                      | [CreateTransactionRequestBody](../../models/operations/CreateTransactionRequestBody.md)                                                                            | :heavy_check_mark:                                                                                                                                                 | Examples.                                                                                                                                                          |                                                                                                                                                                    |

### Response

**[CreateTransactionResponse](../../models/operations/CreateTransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Returns an existing transaction using an object ID.

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.operations.GetTransactionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        GetTransactionResponse res = sdk.transactions().get()
                .transactionId("<id>")
                .shippoApiVersion("2018-02-08")
                .call();

        if (res.transaction().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `transactionId`                                                                                                                                                    | *String*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | Object ID of the transaction to update                                                                                                                             |                                                                                                                                                                    |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |

### Response

**[GetTransactionResponse](../../models/operations/GetTransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |