# ShippoAccounts
(*shippoAccounts()*)

## Overview

Shippo Accounts are used by Shippo Platform Accounts to create and manage Managed Shippo Accounts. 
Managed Shippo Accounts are headless accounts that represent your customers. They are opaque to your end customers, meaning customers do not need to create their own Shippo login or have a billing relationship with Shippo. 
They can be used by marketplaces, e-commerce platforms, and third-party logistics providers who want to offer, seamless, built-in shipping functionality to their customers. 
<SchemaDefinition schemaRef="#/components/schemas/ShippoAccount"/>

### Available Operations

* [list](#list) - List all Shippo Accounts
* [create](#create) - Create a Shippo Account
* [get](#get) - Retrieve a Shippo Account
* [update](#update) - Update a Shippo Account

## list

Returns a list of Shippo Accounts objects

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.operations.ListShippoAccountsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        ListShippoAccountsResponse res = sdk.shippoAccounts().list()
                .page(1L)
                .results(25L)
                .shippoApiVersion("2018-02-08")
                .call();

        if (res.shippoAccountPaginatedList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                            | Type                                                 | Required                                             | Description                                          | Example                                              |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `page`                                               | *Optional<Long>*                                     | :heavy_minus_sign:                                   | The page number you want to select                   |                                                      |
| `results`                                            | *Optional<Long>*                                     | :heavy_minus_sign:                                   | The number of results to return per page (max 100)   |                                                      |
| `shippoApiVersion`                                   | *Optional<String>*                                   | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |

### Response

**[ListShippoAccountsResponse](../../models/operations/ListShippoAccountsResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## create

Creates a Shippo Account object

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.components.ShippoAccountUpdateRequest;
import com.shippo.sdk.models.operations.CreateShippoAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        CreateShippoAccountResponse res = sdk.shippoAccounts().create()
                .shippoApiVersion("2018-02-08")
                .shippoAccountUpdateRequest(ShippoAccountUpdateRequest.builder()
                    .email("hippo@shippo.com")
                    .firstName("Shippo")
                    .lastName("Meister")
                    .companyName("Acme")
                    .build())
                .call();

        if (res.shippoAccount().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         | Example                                                                             |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `shippoApiVersion`                                                                  | *Optional<String>*                                                                  | :heavy_minus_sign:                                                                  | String used to pick a non-default API version to use                                | 2018-02-08                                                                          |
| `shippoAccountUpdateRequest`                                                        | [ShippoAccountUpdateRequest](../../models/components/ShippoAccountUpdateRequest.md) | :heavy_check_mark:                                                                  | N/A                                                                                 |                                                                                     |

### Response

**[CreateShippoAccountResponse](../../models/operations/CreateShippoAccountResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## get

Returns a Shippo Account using an object ID

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.operations.GetShippoAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        GetShippoAccountResponse res = sdk.shippoAccounts().get()
                .shippoAccountId("<value>")
                .shippoApiVersion("2018-02-08")
                .call();

        if (res.shippoAccount().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                            | Type                                                 | Required                                             | Description                                          | Example                                              |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `shippoAccountId`                                    | *String*                                             | :heavy_check_mark:                                   | Object ID of the ShippoAccount                       |                                                      |
| `shippoApiVersion`                                   | *Optional<String>*                                   | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |

### Response

**[GetShippoAccountResponse](../../models/operations/GetShippoAccountResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## update

Updates a Shippo Account object

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.components.ShippoAccountUpdateRequest;
import com.shippo.sdk.models.operations.UpdateShippoAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        UpdateShippoAccountResponse res = sdk.shippoAccounts().update()
                .shippoAccountId("<value>")
                .shippoApiVersion("2018-02-08")
                .shippoAccountUpdateRequest(ShippoAccountUpdateRequest.builder()
                    .email("hippo@shippo.com")
                    .firstName("Shippo")
                    .lastName("Meister")
                    .companyName("Acme")
                    .build())
                .call();

        if (res.shippoAccount().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `shippoAccountId`                                                                             | *String*                                                                                      | :heavy_check_mark:                                                                            | Object ID of the ShippoAccount                                                                |                                                                                               |
| `shippoApiVersion`                                                                            | *Optional<String>*                                                                            | :heavy_minus_sign:                                                                            | String used to pick a non-default API version to use                                          | 2018-02-08                                                                                    |
| `shippoAccountUpdateRequest`                                                                  | [Optional<ShippoAccountUpdateRequest>](../../models/components/ShippoAccountUpdateRequest.md) | :heavy_minus_sign:                                                                            | N/A                                                                                           |                                                                                               |

### Response

**[UpdateShippoAccountResponse](../../models/operations/UpdateShippoAccountResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
