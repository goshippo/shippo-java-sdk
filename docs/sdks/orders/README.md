# Orders
(*orders()*)

## Overview

An order is a request from a customer to purchase goods from a merchant. 
Use the orders object to load orders from your system to the Shippo dashboard.
You can use the orders object to create, retrieve, list, and manage orders programmatically. 
You can also retrieve shipping rates, purchase labels, and track shipments for each order.
<SchemaDefinition schemaRef="#/components/schemas/Order"/>

# Line Item
<p style="text-align: center; background-color: #F2F3F4;">
  </br>Line Items, and their corresponding abstract Products and Variants, might be exposed as a separate resource 
  in the future. Currently it's a nested object within the order resource.</br></br>
</p>
 A line item is an individual object in an order. For example, if your order contains a t-shirt, shorts, and a jacket, each item is represented by a line item.
<SchemaDefinition schemaRef="#/components/schemas/LineItem"/>

### Available Operations

* [list](#list) - List all orders
* [create](#create) - Create a new order
* [get](#get) - Retrieve an order

## list

Returns a list of all order objects.

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.ListOrdersRequest;
import com.shippo.shippo_java_sdk.models.operations.ListOrdersResponse;
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

            ListOrdersResponse res = sdk.orders().list()
                .page(1L)
                .results(25L)
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.orderPaginatedList().isPresent()) {
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
| `page`                                               | *Optional<? extends Long>*                           | :heavy_minus_sign:                                   | The page number you want to select                   |                                                      |
| `results`                                            | *Optional<? extends Long>*                           | :heavy_minus_sign:                                   | The number of results to return per page (max 100)   |                                                      |
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.ListOrdersResponse>](../../models/operations/ListOrdersResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## create

Creates a new order object.

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.AddressCreateRequest;
import com.shippo.shippo_java_sdk.models.components.LineItemBase;
import com.shippo.shippo_java_sdk.models.components.OrderCreateRequest;
import com.shippo.shippo_java_sdk.models.components.OrderStatusEnum;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.components.WeightUnitEnum;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.CreateOrderRequest;
import com.shippo.shippo_java_sdk.models.operations.CreateOrderResponse;
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

            CreateOrderResponse res = sdk.orders().create()
                .shippoApiVersion("2018-02-08")
                .orderCreateRequest(OrderCreateRequest.builder()
                    .placedAt("2016-09-23T01:28:12Z")
                    .toAddress(AddressCreateRequest.builder()
                            .country("US")
                            .name("Shwan Ippotle")
                            .company("Shippo")
                            .street1("215 Clayton St.")
                            .street2("<value>")
                            .street3("")
                            .streetNo("")
                            .city("San Francisco")
                            .state("CA")
                            .zip("94117")
                            .phone("+1 555 341 9393")
                            .email("shippotle@shippo.com")
                            .isResidential(true)
                            .metadata("Customer ID 123456")
                            .latitude(4865.89d)
                            .longitude(4893.82d)
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
                    .build())
                .call();

            if (res.order().isPresent()) {
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

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          | Example                                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `shippoApiVersion`                                                                                                                   | *Optional<? extends String>*                                                                                                         | :heavy_minus_sign:                                                                                                                   | String used to pick a non-default API version to use                                                                                 | 2018-02-08                                                                                                                           |
| `orderCreateRequest`                                                                                                                 | [Optional<? extends com.shippo.shippo_java_sdk.models.components.OrderCreateRequest>](../../models/components/OrderCreateRequest.md) | :heavy_minus_sign:                                                                                                                   | Order details.                                                                                                                       |                                                                                                                                      |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.CreateOrderResponse>](../../models/operations/CreateOrderResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## get

Retrieves an existing order using an object ID.

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.GetOrderRequest;
import com.shippo.shippo_java_sdk.models.operations.GetOrderResponse;
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

            GetOrderResponse res = sdk.orders().get()
                .orderId("<value>")
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.order().isPresent()) {
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
| `orderId`                                            | *String*                                             | :heavy_check_mark:                                   | Object ID of the order                               |                                                      |
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.GetOrderResponse>](../../models/operations/GetOrderResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
