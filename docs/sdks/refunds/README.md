# Refunds

## Overview

Refunds are reimbursements for successfully created but unused shipping labels or other charges.

### Available Operations

* [create](#create) - Create a refund
* [list](#list) - List all refunds
* [get](#get) - Retrieve a refund

## create

Creates a new refund object.

### Example Usage

<!-- UsageSnippet language="java" operationID="CreateRefund" method="post" path="/refunds" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.CreateRefundResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        CreateRefundResponse res = sdk.refunds().create()
                .async(false)
                .transaction("915d94940ea54c3a80cbfa328722f5a1")
                .call();

        if (res.refund().isPresent()) {
            System.out.println(res.refund().get());
        }
    }
}
```

### Parameters

| Parameter                        | Type                             | Required                         | Description                      | Example                          |
| -------------------------------- | -------------------------------- | -------------------------------- | -------------------------------- | -------------------------------- |
| `async`                          | *Optional\<Boolean>*             | :heavy_minus_sign:               | N/A                              | false                            |
| `transaction`                    | *String*                         | :heavy_check_mark:               | N/A                              | 915d94940ea54c3a80cbfa328722f5a1 |

### Response

**[CreateRefundResponse](../../models/operations/CreateRefundResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## list

Returns a list all refund objects.

### Example Usage

<!-- UsageSnippet language="java" operationID="ListRefunds" method="get" path="/refunds/" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.ListRefundsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        ListRefundsResponse res = sdk.refunds().list()
                .call();

        if (res.refundPaginatedList().isPresent()) {
            System.out.println(res.refundPaginatedList().get());
        }
    }
}
```

### Response

**[ListRefundsResponse](../../models/operations/ListRefundsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Returns an existing rate using a rate object ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetRefund" method="get" path="/refunds/{RefundId}" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.GetRefundResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        GetRefundResponse res = sdk.refunds().get()
                .refundId("<id>")
                .call();

        if (res.refund().isPresent()) {
            System.out.println(res.refund().get());
        }
    }
}
```

### Parameters

| Parameter                         | Type                              | Required                          | Description                       |
| --------------------------------- | --------------------------------- | --------------------------------- | --------------------------------- |
| `refundId`                        | *String*                          | :heavy_check_mark:                | Object ID of the refund to update |

### Response

**[GetRefundResponse](../../models/operations/GetRefundResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |