# Transactions

## Overview

A transaction is the purchase of a shipping label from a shipping provider for a specific service. You can print purchased labels and used them to ship a parcel with a carrier, such as USPS or FedEx.

### Available Operations

* [list](#list) - List all shipping labels
* [create](#create) - Create a shipping label
* [get](#get) - Retrieve a shipping label

## list

Returns a list of all transaction objects.

To filter results by creation date, use the optional query parameters below. Provided dates should be ISO 8601 UTC dates (timezone offsets are currently not supported).

- `object_created_gt`: object(s) created after the provided date time
- `object_created_gte`: object(s) created at or after the provided date time
- `object_created_lt`: object(s) created before the provided date time
- `object_created_lte`: object(s) created at or before the provided date time

Provide at most one lower bound (`object_created_gt` or `object_created_gte`) and at most one upper bound (`object_created_lt` or `object_created_lte`) per request. Lower bounds must not be in the future.

Date format examples: `2017-01-01`, `2017-01-01T03:30:30` (or `2017-01-01T03:30:30.5`), `2017-01-01T03:30:30Z`

Example URL: `https://api.goshippo.com/transactions/?object_created_gte=2017-01-01T00:00:30&object_created_lt=2017-04-01T00:00:30`

### Example Usage

<!-- UsageSnippet language="java" operationID="ListTransactions" method="get" path="/transactions" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.TrackingStatusEnum;
import com.goshippo.shippo_sdk.models.components.TransactionStatusEnum;
import com.goshippo.shippo_sdk.models.operations.ListTransactionsRequest;
import com.goshippo.shippo_sdk.models.operations.ListTransactionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        ListTransactionsRequest req = ListTransactionsRequest.builder()
                .objectStatus(TransactionStatusEnum.SUCCESS)
                .trackingStatus(TrackingStatusEnum.DELIVERED)
                .build();

        ListTransactionsResponse res = sdk.transactions().list()
                .request(req)
                .call();

        if (res.transactionPaginatedList().isPresent()) {
            System.out.println(res.transactionPaginatedList().get());
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

Creates a new transaction object and purchases the shipping label using a rate object that has previously been created.

Alternatively, creates a new transaction object and purchases the shipping label instantly using shipment details, an existing carrier account, and an existing service level token.

### Example Usage

<!-- UsageSnippet language="java" operationID="CreateTransaction" method="post" path="/transactions" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.LabelFileTypeEnum;
import com.goshippo.shippo_sdk.models.components.TransactionCreateRequest;
import com.goshippo.shippo_sdk.models.operations.CreateTransactionRequestBody;
import com.goshippo.shippo_sdk.models.operations.CreateTransactionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        CreateTransactionRequestBody req = CreateTransactionRequestBody.of(TransactionCreateRequest.builder()
                .rate("ec9f0d3adc9441449c85d315f0997fd5")
                .async(false)
                .labelFileType(LabelFileTypeEnum.PDF4X6)
                .metadata("Order ID #12345")
                .order("adcfdddf8ec64b84ad22772bce3ea37a")
                .build());

        CreateTransactionResponse res = sdk.transactions().create()
                .request(req)
                .call();

        if (res.transaction().isPresent()) {
            System.out.println(res.transaction().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [CreateTransactionRequestBody](../../models/operations/CreateTransactionRequestBody.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[CreateTransactionResponse](../../models/operations/CreateTransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Returns an existing transaction using an object ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetTransaction" method="get" path="/transactions/{TransactionId}" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.GetTransactionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        GetTransactionResponse res = sdk.transactions().get()
                .transactionId("<id>")
                .call();

        if (res.transaction().isPresent()) {
            System.out.println(res.transaction().get());
        }
    }
}
```

### Parameters

| Parameter                              | Type                                   | Required                               | Description                            |
| -------------------------------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `transactionId`                        | *String*                               | :heavy_check_mark:                     | Object ID of the transaction to update |

### Response

**[GetTransactionResponse](../../models/operations/GetTransactionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |