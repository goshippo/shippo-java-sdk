# Orders

## Overview

An order is a request from a customer to purchase goods from a merchant.
Use the orders object to load orders from your system to the Shippo dashboard.
You can use the orders object to create, retrieve, list, and manage orders programmatically.
You can also retrieve shipping rates, purchase labels, and track shipments for each order.

### Available Operations

* [list](#list) - List all orders
* [create](#create) - Create a new order
* [get](#get) - Retrieve an order

## list

Returns a list of all order objects.

### Example Usage

<!-- UsageSnippet language="java" operationID="ListOrders" method="get" path="/orders" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.OrderShopAppEnum;
import com.goshippo.shippo_sdk.models.components.OrderStatusEnum;
import com.goshippo.shippo_sdk.models.operations.ListOrdersRequest;
import com.goshippo.shippo_sdk.models.operations.ListOrdersResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        ListOrdersRequest req = ListOrdersRequest.builder()
                .orderStatus(List.of(
                    OrderStatusEnum.PAID))
                .shopApp(OrderShopAppEnum.SHIPPO)
                .build();

        ListOrdersResponse res = sdk.orders().list()
                .request(req)
                .call();

        if (res.orderPaginatedList().isPresent()) {
            System.out.println(res.orderPaginatedList().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [ListOrdersRequest](../../models/operations/ListOrdersRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[ListOrdersResponse](../../models/operations/ListOrdersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## create

Creates a new order object.

### Example Usage

<!-- UsageSnippet language="java" operationID="CreateOrder" method="post" path="/orders" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.*;
import com.goshippo.shippo_sdk.models.operations.CreateOrderResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        OrderCreateRequest req = OrderCreateRequest.builder()
                .placedAt("2016-09-23T01:28:12Z")
                .toAddress(AddressCreateRequest.builder()
                    .country("US")
                    .name("Shwan Ippotle")
                    .company("Shippo")
                    .street1("215 Clayton St.")
                    .street3("")
                    .streetNo("")
                    .city("San Francisco")
                    .state("CA")
                    .zip("94117")
                    .phone("+1 555 341 9393")
                    .email("shippotle@shippo.com")
                    .isResidential(true)
                    .metadata("Customer ID 123456")
                    .validate(true)
                    .build())
                .currency("USD")
                .notes("This customer is a VIP")
                .orderNumber("#1068")
                .orderStatus(OrderStatusEnum.PAID)
                .shippingCost("12.83")
                .shippingCostCurrency("USD")
                .shippingMethod("USPS First Class Package")
                .subtotalPrice("12.1")
                .totalPrice("24.93")
                .totalTax("0.0")
                .weight("0.4")
                .weightUnit(WeightUnitEnum.LB)
                .fromAddress(AddressCreateRequest.builder()
                    .country("US")
                    .name("Shwan Ippotle")
                    .company("Shippo")
                    .street1("215 Clayton St.")
                    .street3("")
                    .streetNo("")
                    .city("San Francisco")
                    .state("CA")
                    .zip("94117")
                    .phone("+1 555 341 9393")
                    .email("shippotle@shippo.com")
                    .isResidential(true)
                    .metadata("Customer ID 123456")
                    .validate(true)
                    .build())
                .lineItems(List.of(
                    LineItemBase.builder()
                        .currency("USD")
                        .manufactureCountry("US")
                        .maxDeliveryTime(OffsetDateTime.parse("2016-07-23T00:00:00Z"))
                        .maxShipTime(OffsetDateTime.parse("2016-07-23T00:00:00Z"))
                        .quantity(20L)
                        .sku("HM-123")
                        .title("Hippo Magazines")
                        .totalPrice("12.1")
                        .variantTitle("June Edition")
                        .weight("0.4")
                        .weightUnit(WeightUnitEnum.LB)
                        .build()))
                .build();

        CreateOrderResponse res = sdk.orders().create()
                .request(req)
                .call();

        if (res.order().isPresent()) {
            System.out.println(res.order().get());
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [OrderCreateRequest](../../models/shared/OrderCreateRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[CreateOrderResponse](../../models/operations/CreateOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Retrieves an existing order using an object ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetOrder" method="get" path="/orders/{OrderId}" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.GetOrderResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        GetOrderResponse res = sdk.orders().get()
                .orderId("<id>")
                .call();

        if (res.order().isPresent()) {
            System.out.println(res.order().get());
        }
    }
}
```

### Parameters

| Parameter              | Type                   | Required               | Description            |
| ---------------------- | ---------------------- | ---------------------- | ---------------------- |
| `orderId`              | *String*               | :heavy_check_mark:     | Object ID of the order |

### Response

**[GetOrderResponse](../../models/operations/GetOrderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |