# CustomsItems

## Overview

Customs declarations are relevant information, including one or multiple customs items, you need to provide for customs clearance for your international shipments.

### Available Operations

* [list](#list) - List all customs items
* [create](#create) - Create a new customs item
* [get](#get) - Retrieve a customs item

## list

Returns a list all customs items objects.

### Example Usage

<!-- UsageSnippet language="java" operationID="ListCustomsItems" method="get" path="/customs/items" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.ListCustomsItemsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        ListCustomsItemsResponse res = sdk.customsItems().list()
                .page(1L)
                .results(25L)
                .call();

        if (res.customsItemPaginatedList().isPresent()) {
            System.out.println(res.customsItemPaginatedList().get());
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

**[ListCustomsItemsResponse](../../models/operations/ListCustomsItemsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## create

Creates a new customs item object.

### Example Usage

<!-- UsageSnippet language="java" operationID="CreateCustomsItem" method="post" path="/customs/items" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.CustomsItemCreateRequest;
import com.goshippo.shippo_sdk.models.components.WeightUnitEnum;
import com.goshippo.shippo_sdk.models.operations.CreateCustomsItemResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        CustomsItemCreateRequest req = CustomsItemCreateRequest.builder()
                .description("T-Shirt")
                .massUnit(WeightUnitEnum.LB)
                .netWeight("5")
                .originCountry("<value>")
                .quantity(20L)
                .valueAmount("200")
                .valueCurrency("USD")
                .metadata("Order ID \"123454\"")
                .skuCode("HM-123")
                .hsCode("0901.21")
                .build();

        CreateCustomsItemResponse res = sdk.customsItems().create()
                .request(req)
                .call();

        if (res.customsItem().isPresent()) {
            System.out.println(res.customsItem().get());
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CustomsItemCreateRequest](../../models/shared/CustomsItemCreateRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateCustomsItemResponse](../../models/operations/CreateCustomsItemResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Returns an existing customs item using an object ID

### Example Usage

<!-- UsageSnippet language="java" operationID="GetCustomsItem" method="get" path="/customs/items/{CustomsItemId}" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.GetCustomsItemResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        GetCustomsItemResponse res = sdk.customsItems().get()
                .customsItemId("<id>")
                .page(1L)
                .call();

        if (res.customsItem().isPresent()) {
            System.out.println(res.customsItem().get());
        }
    }
}
```

### Parameters

| Parameter                          | Type                               | Required                           | Description                        |
| ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- |
| `customsItemId`                    | *String*                           | :heavy_check_mark:                 | Object ID of the customs item      |
| `page`                             | *Optional\<Long>*                  | :heavy_minus_sign:                 | The page number you want to select |

### Response

**[GetCustomsItemResponse](../../models/operations/GetCustomsItemResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |