# CarrierParcelTemplates
(*carrierParcelTemplates()*)

## Overview

A carrier parcel template represents a package used for shipping that has preset dimensions defined by a carrier. Some examples of a carrier parcel template include USPS Flat Rate Box and Fedex Small Pak. When using a carrier parcel template, the rates returned may be limited to the carrier that provides the box. You can create user parcel templates using a carrier parcel template. Shippo takes the dimensions of the carrier parcel template but you must configure the weight.

<SchemaDefinition schemaRef="#/components/schemas/CarrierParcelTemplate"/>

### Available Operations

* [list](#list) - List all carrier parcel templates
* [get](#get) - Retrieve a carrier parcel templates

## list

List all carrier parcel template objects. <br> Use the following query string params to filter the results as needed. <br>
<ul>
<li>`include=all` (the default). Includes templates from all carriers </li>
<li>`include=user`. Includes templates only from carriers which the user has added (whether or not they're currently enabled) </li>
<li>`include=enabled`. includes templates only for carriers which the user has added and enabled </li>
<li>`carrier=*token*`. filter by specific carrier, e.g. fedex, usps </li>
</ul>

### Example Usage

```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.Include;
import com.goshippo.shippo_sdk.models.operations.ListCarrierParcelTemplatesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        ListCarrierParcelTemplatesResponse res = sdk.carrierParcelTemplates().list()
                .include(Include.ENABLED)
                .carrier("fedex")
                .shippoApiVersion("2018-02-08")
                .call();

        if (res.carrierParcelTemplateList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `include`                                                                                                                                                          | [Optional\<Include>](../../models/operations/Include.md)                                                                                                           | :heavy_minus_sign:                                                                                                                                                 | filter by user or enabled                                                                                                                                          |                                                                                                                                                                    |
| `carrier`                                                                                                                                                          | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | filter by specific carrier                                                                                                                                         | fedex                                                                                                                                                              |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |

### Response

**[ListCarrierParcelTemplatesResponse](../../models/operations/ListCarrierParcelTemplatesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Fetches the parcel template information for a specific carrier parcel template, identified by the token.

### Example Usage

```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.GetCarrierParcelTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        GetCarrierParcelTemplateResponse res = sdk.carrierParcelTemplates().get()
                .carrierParcelTemplateToken("<value>")
                .shippoApiVersion("2018-02-08")
                .call();

        if (res.carrierParcelTemplate().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `carrierParcelTemplateToken`                                                                                                                                       | *String*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | The unique string representation of the carrier parcel template                                                                                                    |                                                                                                                                                                    |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |

### Response

**[GetCarrierParcelTemplateResponse](../../models/operations/GetCarrierParcelTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |