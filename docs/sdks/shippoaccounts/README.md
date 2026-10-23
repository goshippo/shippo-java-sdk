# ShippoAccounts

## Overview

Shippo Accounts are used by Shippo Platform Accounts to create and manage Managed Shippo Accounts. 
Managed Shippo Accounts are headless accounts that represent your customers. They are opaque to your end customers, meaning customers do not need to create their own Shippo login or have a billing relationship with Shippo. 
They can be used by marketplaces, e-commerce platforms, and third-party logistics providers who want to offer, seamless, built-in shipping functionality to their customers. See our [guide](https://docs.goshippo.com/docs/platformaccounts/platform_accounts/) for more details.

### Available Operations

* [list](#list) - List all Shippo Accounts
* [create](#create) - Create a Shippo Account
* [get](#get) - Retrieve a Shippo Account
* [update](#update) - Update a Shippo Account

## list

Returns a list of Shippo Managed Accounts objects.

### Example Usage

<!-- UsageSnippet language="java" operationID="ListShippoAccounts" method="get" path="/shippo-accounts" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.ListShippoAccountsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        ListShippoAccountsResponse res = sdk.shippoAccounts().list()
                .page(1L)
                .results(25L)
                .call();

        if (res.shippoAccountPaginatedList().isPresent()) {
            System.out.println(res.shippoAccountPaginatedList().get());
        }
    }
}
```

### Parameters

| Parameter                                          | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `page`                                             | *Optional\<Long>*                                  | :heavy_minus_sign:                                 | The page number you want to select                 |
| `results`                                          | *Optional\<Long>*                                  | :heavy_minus_sign:                                 | The number of results to return per page (max 100) |

### Response

**[ListShippoAccountsResponse](../../models/operations/ListShippoAccountsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## create

Creates a new [Shippo Managed Account](https://docs.goshippo.com/docs/platformaccounts/platform_using_accounts/).

### Example Usage

<!-- UsageSnippet language="java" operationID="CreateShippoAccount" method="post" path="/shippo-accounts" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.CreateShippoAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        CreateShippoAccountResponse res = sdk.shippoAccounts().create()
                .email("hippo@shippo.com")
                .firstName("Shippo")
                .lastName("Meister")
                .companyName("Acme")
                .call();

        if (res.shippoAccount().isPresent()) {
            System.out.println(res.shippoAccount().get());
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        | Example            |
| ------------------ | ------------------ | ------------------ | ------------------ | ------------------ |
| `email`            | *String*           | :heavy_check_mark: | N/A                | hippo@shippo.com   |
| `firstName`        | *String*           | :heavy_check_mark: | N/A                | Shippo             |
| `lastName`         | *String*           | :heavy_check_mark: | N/A                | Meister            |
| `companyName`      | *String*           | :heavy_check_mark: | N/A                | Acme               |

### Response

**[CreateShippoAccountResponse](../../models/operations/CreateShippoAccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Returns a Shippo Managed Account using an object ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetShippoAccount" method="get" path="/shippo-accounts/{ShippoAccountId}" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.GetShippoAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        GetShippoAccountResponse res = sdk.shippoAccounts().get()
                .shippoAccountId("<id>")
                .call();

        if (res.shippoAccount().isPresent()) {
            System.out.println(res.shippoAccount().get());
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `shippoAccountId`              | *String*                       | :heavy_check_mark:             | Object ID of the ShippoAccount |

### Response

**[GetShippoAccountResponse](../../models/operations/GetShippoAccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## update

Updates a Shippo Managed Account using an object ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="UpdateShippoAccount" method="put" path="/shippo-accounts/{ShippoAccountId}" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.ShippoAccountUpdateRequest;
import com.goshippo.shippo_sdk.models.operations.UpdateShippoAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        UpdateShippoAccountResponse res = sdk.shippoAccounts().update()
                .shippoAccountId("<id>")
                .shippoAccountUpdateRequest(ShippoAccountUpdateRequest.builder()
                    .email("hippo@shippo.com")
                    .firstName("Shippo")
                    .lastName("Meister")
                    .companyName("Acme")
                    .build())
                .call();

        if (res.shippoAccount().isPresent()) {
            System.out.println(res.shippoAccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                      | Type                                                                                           | Required                                                                                       | Description                                                                                    |
| ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------- |
| `shippoAccountId`                                                                              | *String*                                                                                       | :heavy_check_mark:                                                                             | Object ID of the ShippoAccount                                                                 |
| `shippoAccountUpdateRequest`                                                                   | [Optional\<ShippoAccountUpdateRequest>](../../models/components/ShippoAccountUpdateRequest.md) | :heavy_minus_sign:                                                                             | N/A                                                                                            |

### Response

**[UpdateShippoAccountResponse](../../models/operations/UpdateShippoAccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |