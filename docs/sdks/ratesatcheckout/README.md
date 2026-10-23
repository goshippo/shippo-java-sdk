# RatesAtCheckout

## Overview

Rates at checkout is a tool for merchants to display up-to-date shipping estimates based on what's in their customers cart and where they’re shipping to.
Merchants set up curated shipping options for customers in the checkout flow based on data in the shopping cart. The request must include the **to** address and item information. Optional fields are the **from** address and package information. If the optional fields are not included, the service will use the default address and/or package configured for rates at checkout. The response is a list of shipping options based on the Service Group configuration.
(see [Service Group configuration](/shippoapi/public-api/service-groups) for details).



# Default Parcel Template
Assign one of your user parcel templates to be the default used when generating Live Rates. This template will be used by default when generating Live Rates, unless you explicitly provide a parcel in the Live Rates request.

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

<!-- UsageSnippet language="java" operationID="CreateLiveRate" method="post" path="/live-rates" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.*;
import com.goshippo.shippo_sdk.models.operations.CreateLiveRateResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        CreateLiveRateResponse res = sdk.ratesAtCheckout().create()
                .addressFrom(LiveRateCreateRequestAddressFrom.of("<value>"))
                .addressTo(LiveRateCreateRequestAddressTo.of("<value>"))
                .lineItems(List.of())
                .parcel(LiveRateCreateRequestParcel.of("5df144dca289442cv7a06"))
                .call();

        if (res.liveRatePaginatedList().isPresent()) {
            System.out.println(res.liveRatePaginatedList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                     | Type                                                                                                                                                                                                                                                                          | Required                                                                                                                                                                                                                                                                      | Description                                                                                                                                                                                                                                                                   | Example                                                                                                                                                                                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `addressFrom`                                                                                                                                                                                                                                                                 | [Optional\<LiveRateCreateRequestAddressFrom>](../../models/components/LiveRateCreateRequestAddressFrom.md)                                                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                                                                                                                            | The sender address, which includes your name, company name, street address, city, state, zip code, <br/>country, phone number, and email address (strings). Special characters should not be included in <br/>any address element, especially name, company, and email.       |                                                                                                                                                                                                                                                                               |
| `addressTo`                                                                                                                                                                                                                                                                   | [LiveRateCreateRequestAddressTo](../../models/components/LiveRateCreateRequestAddressTo.md)                                                                                                                                                                                   | :heavy_check_mark:                                                                                                                                                                                                                                                            | The recipient address, which includes the recipient's name, company name, street address, city, state, zip code, <br/>country, phone number, and email address (strings). Special characters should not be included in <br/>any address element, especially name, company, and email. |                                                                                                                                                                                                                                                                               |
| `lineItems`                                                                                                                                                                                                                                                                   | List\<[LineItem](../../models/components/LineItem.md)>                                                                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                                                                                                                            | Array of Line Item objects                                                                                                                                                                                                                                                    |                                                                                                                                                                                                                                                                               |
| `parcel`                                                                                                                                                                                                                                                                      | [Optional\<LiveRateCreateRequestParcel>](../../models/components/LiveRateCreateRequestParcel.md)                                                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                                                                                                                            | Object ID for an existing User Parcel Template OR a fully formed Parcel object.                                                                                                                                                                                               | 5df144dca289442cv7a06                                                                                                                                                                                                                                                         |

### Response

**[CreateLiveRateResponse](../../models/operations/CreateLiveRateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getDefaultParcelTemplate

Retrieve and display the currently configured default parcel template for live rates.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetDefaultParcelTemplate" method="get" path="/live-rates/settings/parcel-template" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.GetDefaultParcelTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        GetDefaultParcelTemplateResponse res = sdk.ratesAtCheckout().getDefaultParcelTemplate()
                .call();

        if (res.defaultParcelTemplate().isPresent()) {
            System.out.println(res.defaultParcelTemplate().get());
        }
    }
}
```

### Response

**[GetDefaultParcelTemplateResponse](../../models/operations/GetDefaultParcelTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateDefaultParcelTemplate

Update the currently configured default parcel template for live rates. The object_id in the request payload should identify the user parcel template to be the new default.

### Example Usage

<!-- UsageSnippet language="java" operationID="UpdateDefaultParcelTemplate" method="put" path="/live-rates/settings/parcel-template" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.UpdateDefaultParcelTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        UpdateDefaultParcelTemplateResponse res = sdk.ratesAtCheckout().updateDefaultParcelTemplate()
                .objectId("b958d3690bb04bb8b2986724872750f5")
                .call();

        if (res.defaultParcelTemplate().isPresent()) {
            System.out.println(res.defaultParcelTemplate().get());
        }
    }
}
```

### Parameters

| Parameter                        | Type                             | Required                         | Description                      | Example                          |
| -------------------------------- | -------------------------------- | -------------------------------- | -------------------------------- | -------------------------------- |
| `objectId`                       | *Optional\<String>*              | :heavy_minus_sign:               | N/A                              | b958d3690bb04bb8b2986724872750f5 |

### Response

**[UpdateDefaultParcelTemplateResponse](../../models/operations/UpdateDefaultParcelTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteDefaultParcelTemplate

Clears the currently configured default parcel template for live rates.

### Example Usage

<!-- UsageSnippet language="java" operationID="DeleteDefaultParcelTemplate" method="delete" path="/live-rates/settings/parcel-template" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.DeleteDefaultParcelTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        DeleteDefaultParcelTemplateResponse res = sdk.ratesAtCheckout().deleteDefaultParcelTemplate()
                .call();

        // handle response
    }
}
```

### Response

**[DeleteDefaultParcelTemplateResponse](../../models/operations/DeleteDefaultParcelTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |