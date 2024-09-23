# RatesAtCheckout
(*ratesAtCheckout()*)

## Overview

Rates at checkout is a tool for merchants to display up-to-date shipping estimates based on what's in their customers cart and where they’re shipping to.
Merchants set up curated shipping options for customers in the checkout flow based on data in the shopping cart. The request must include the **to** address and item information. Optional fields are the **from** address and package information. If the optional fields are not included, the service will use the default address and/or package configured for rates at checkout. The response is a list of shipping options based on the Service Group configuration.
(see <a href="#tag/Service-Groups">Service Group configuration</a> for details).
<SchemaDefinition schemaRef="#/components/schemas/LiveRate"/>


# Default Parcel Template
Assign one of your user parcel templates to be the default used when generating Live Rates. This template will be used by default when generating Live Rates, unless you explicitly provide a parcel in the Live Rates request.
<SchemaDefinition schemaRef="#/components/schemas/UserParcelTemplate"/>

### Available Operations

* [create](#create) - Generate a live rates request
* [getDefaultParcelTemplate](#getdefaultparceltemplate) - Show current default parcel template
* [updateDefaultParcelTemplate](#updatedefaultparceltemplate) - Update default parcel template
* [deleteDefaultParcelTemplate](#deletedefaultparceltemplate) - Clear current default parcel template

## create

Initiates a live rates request. Include either the object ID for
an existing address record or a fully formed address object when entering
an address value. You can also enter the object ID of an existing user parcel
template or a fully formed user parcel template object as the parcel value.

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.components.AddressCompleteCreateRequest;
import com.shippo.sdk.models.components.LineItem;
import com.shippo.sdk.models.components.LiveRateCreateRequest;
import com.shippo.sdk.models.components.LiveRateCreateRequestAddressFrom;
import com.shippo.sdk.models.components.LiveRateCreateRequestAddressTo;
import com.shippo.sdk.models.components.LiveRateCreateRequestParcel;
import com.shippo.sdk.models.components.WeightUnitEnum;
import com.shippo.sdk.models.operations.CreateLiveRateResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        CreateLiveRateResponse res = sdk.ratesAtCheckout().create()
                .shippoApiVersion("2018-02-08")
                .liveRateCreateRequest(LiveRateCreateRequest.builder()
                    .addressTo(LiveRateCreateRequestAddressTo.of("<value>"))
                    .lineItems(List.of(
                        LineItem.builder()
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
                            .objectId("abf7d5675d744b6ea9fdb6f796b28f28")
                            .build()))
                    .addressFrom(LiveRateCreateRequestAddressFrom.of(AddressCompleteCreateRequest.builder()
                        .name("Shwan Ippotle")
                        .street1("215 Clayton St.")
                        .city("San Francisco")
                        .state("CA")
                        .zip("94117")
                        .country("US")
                        .company("Shippo")
                        .street3("")
                        .streetNo("")
                        .phone("+1 555 341 9393")
                        .email("shippotle@shippo.com")
                        .isResidential(true)
                        .metadata("Customer ID 123456")
                        .validate(true)
                        .build()))
                    .parcel(LiveRateCreateRequestParcel.of("5df144dca289442cv7a06"))
                    .build())
                .call();

        if (res.liveRatePaginatedList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               | Example                                                                   |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `shippoApiVersion`                                                        | *Optional<String>*                                                        | :heavy_minus_sign:                                                        | String used to pick a non-default API version to use                      | 2018-02-08                                                                |
| `liveRateCreateRequest`                                                   | [LiveRateCreateRequest](../../models/components/LiveRateCreateRequest.md) | :heavy_check_mark:                                                        | Generate rates at checkout                                                |                                                                           |

### Response

**[CreateLiveRateResponse](../../models/operations/CreateLiveRateResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## getDefaultParcelTemplate

Retrieve and display the currently configured default parcel template for live rates.

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.operations.GetDefaultParcelTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        GetDefaultParcelTemplateResponse res = sdk.ratesAtCheckout().getDefaultParcelTemplate()
                .shippoApiVersion("2018-02-08")
                .call();

        if (res.defaultParcelTemplate().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                            | Type                                                 | Required                                             | Description                                          | Example                                              |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `shippoApiVersion`                                   | *Optional<String>*                                   | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |

### Response

**[GetDefaultParcelTemplateResponse](../../models/operations/GetDefaultParcelTemplateResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## updateDefaultParcelTemplate

Update the currently configured default parcel template for live rates. The object_id in the request payload should identify the user parcel template to be the new default.

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.components.DefaultParcelTemplateUpdateRequest;
import com.shippo.sdk.models.operations.UpdateDefaultParcelTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        UpdateDefaultParcelTemplateResponse res = sdk.ratesAtCheckout().updateDefaultParcelTemplate()
                .shippoApiVersion("2018-02-08")
                .defaultParcelTemplateUpdateRequest(DefaultParcelTemplateUpdateRequest.builder()
                    .objectId("b958d3690bb04bb8b2986724872750f5")
                    .build())
                .call();

        if (res.defaultParcelTemplate().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   | Example                                                                                                       |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `shippoApiVersion`                                                                                            | *Optional<String>*                                                                                            | :heavy_minus_sign:                                                                                            | String used to pick a non-default API version to use                                                          | 2018-02-08                                                                                                    |
| `defaultParcelTemplateUpdateRequest`                                                                          | [Optional<DefaultParcelTemplateUpdateRequest>](../../models/components/DefaultParcelTemplateUpdateRequest.md) | :heavy_minus_sign:                                                                                            | N/A                                                                                                           |                                                                                                               |

### Response

**[UpdateDefaultParcelTemplateResponse](../../models/operations/UpdateDefaultParcelTemplateResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## deleteDefaultParcelTemplate

Clears the currently configured default parcel template for live rates.

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.operations.DeleteDefaultParcelTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        DeleteDefaultParcelTemplateResponse res = sdk.ratesAtCheckout().deleteDefaultParcelTemplate()
                .shippoApiVersion("2018-02-08")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                            | Type                                                 | Required                                             | Description                                          | Example                                              |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `shippoApiVersion`                                   | *Optional<String>*                                   | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |

### Response

**[DeleteDefaultParcelTemplateResponse](../../models/operations/DeleteDefaultParcelTemplateResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
