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

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.AddressCompleteCreateRequest;
import com.shippo.shippo_java_sdk.models.components.Cod;
import com.shippo.shippo_java_sdk.models.components.DistanceUnitEnum;
import com.shippo.shippo_java_sdk.models.components.LineItem;
import com.shippo.shippo_java_sdk.models.components.LiveRateCreateRequest;
import com.shippo.shippo_java_sdk.models.components.ObjectState;
import com.shippo.shippo_java_sdk.models.components.Parcel;
import com.shippo.shippo_java_sdk.models.components.ParcelExtra;
import com.shippo.shippo_java_sdk.models.components.ParcelInsurance;
import com.shippo.shippo_java_sdk.models.components.ParcelInsuranceProvider;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateAramexAustraliaEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateCouriersPleaseEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateDHLeCommerceEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateDPDUKEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateFedExEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateUPSEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateUSPSEnum;
import com.shippo.shippo_java_sdk.models.components.PaymentMethod;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.components.WeightUnitEnum;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.CreateLiveRateRequest;
import com.shippo.shippo_java_sdk.models.operations.CreateLiveRateResponse;
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

            CreateLiveRateResponse res = sdk.ratesAtCheckout().create()
                .shippoApiVersion("2018-02-08")
                .liveRateCreateRequest(LiveRateCreateRequest.builder()
                    .addressTo(LiveRateCreateRequestAddressTo.of("<value>"))
                    .lineItems(java.util.List.of(
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
                new Object())
                    .build())
                .call();

            if (res.liveRatePaginatedList().isPresent()) {
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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                | Example                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `shippoApiVersion`                                                                                                                         | *Optional<? extends String>*                                                                                                               | :heavy_minus_sign:                                                                                                                         | String used to pick a non-default API version to use                                                                                       | 2018-02-08                                                                                                                                 |
| `liveRateCreateRequest`                                                                                                                    | [Optional<? extends com.shippo.shippo_java_sdk.models.components.LiveRateCreateRequest>](../../models/components/LiveRateCreateRequest.md) | :heavy_minus_sign:                                                                                                                         | Generate rates at checkout                                                                                                                 |                                                                                                                                            |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.CreateLiveRateResponse>](../../models/operations/CreateLiveRateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getDefaultParcelTemplate

Retrieve and display the currently configured default parcel template for live rates.

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.GetDefaultParcelTemplateRequest;
import com.shippo.shippo_java_sdk.models.operations.GetDefaultParcelTemplateResponse;
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

            GetDefaultParcelTemplateResponse res = sdk.ratesAtCheckout().getDefaultParcelTemplate()
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.defaultParcelTemplate().isPresent()) {
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
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.GetDefaultParcelTemplateResponse>](../../models/operations/GetDefaultParcelTemplateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateDefaultParcelTemplate

Update the currently configured default parcel template for live rates. The object_id in the request payload should identify the user parcel template to be the new default.

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.DefaultParcelTemplateUpdateRequest;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.UpdateDefaultParcelTemplateRequest;
import com.shippo.shippo_java_sdk.models.operations.UpdateDefaultParcelTemplateResponse;
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

            UpdateDefaultParcelTemplateResponse res = sdk.ratesAtCheckout().updateDefaultParcelTemplate()
                .shippoApiVersion("2018-02-08")
                .defaultParcelTemplateUpdateRequest(DefaultParcelTemplateUpdateRequest.builder()
                    .objectId("b958d3690bb04bb8b2986724872750f5")
                    .build())
                .call();

            if (res.defaultParcelTemplate().isPresent()) {
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

| Parameter                                                                                                                                                            | Type                                                                                                                                                                 | Required                                                                                                                                                             | Description                                                                                                                                                          | Example                                                                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `shippoApiVersion`                                                                                                                                                   | *Optional<? extends String>*                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                   | String used to pick a non-default API version to use                                                                                                                 | 2018-02-08                                                                                                                                                           |
| `defaultParcelTemplateUpdateRequest`                                                                                                                                 | [Optional<? extends com.shippo.shippo_java_sdk.models.components.DefaultParcelTemplateUpdateRequest>](../../models/components/DefaultParcelTemplateUpdateRequest.md) | :heavy_minus_sign:                                                                                                                                                   | N/A                                                                                                                                                                  |                                                                                                                                                                      |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.UpdateDefaultParcelTemplateResponse>](../../models/operations/UpdateDefaultParcelTemplateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteDefaultParcelTemplate

Clears the currently configured default parcel template for live rates.

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.DeleteDefaultParcelTemplateRequest;
import com.shippo.shippo_java_sdk.models.operations.DeleteDefaultParcelTemplateResponse;
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

            DeleteDefaultParcelTemplateResponse res = sdk.ratesAtCheckout().deleteDefaultParcelTemplate()
                .shippoApiVersion("2018-02-08")
                .call();

            // handle response
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
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.DeleteDefaultParcelTemplateResponse>](../../models/operations/DeleteDefaultParcelTemplateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
