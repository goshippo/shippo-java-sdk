# CarrierParcelTemplates

## Overview

A carrier parcel template represents a package used for shipping that has preset dimensions defined by a carrier. Some examples of a carrier parcel template include USPS Flat Rate Box and Fedex Small Pak. When using a carrier parcel template, the rates returned may be limited to the carrier that provides the box. You can create user parcel templates using a carrier parcel template. Shippo takes the dimensions of the carrier parcel template but you must configure the weight.

### Available Operations

* [list](#list) - List all carrier parcel templates
* [get](#get) - Retrieve a carrier parcel templates

## list

List all carrier parcel template objects.

Use the following query string params to filter the results as needed:

- `include=all` (the default): includes templates from all carriers
- `include=user`: includes templates only from carriers which the user has added (whether or not they're currently enabled)
- `include=enabled`: includes templates only for carriers which the user has added and enabled
- `carrier=<token>`: filter by specific carrier, e.g. `fedex`, `usps`

### Example Usage

<!-- UsageSnippet language="java" operationID="ListCarrierParcelTemplates" method="get" path="/parcel-templates" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.ListCarrierParcelTemplatesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        ListCarrierParcelTemplatesResponse res = sdk.carrierParcelTemplates().list()
                .carrier("fedex")
                .call();

        if (res.carrierParcelTemplateList().isPresent()) {
            System.out.println(res.carrierParcelTemplateList().get());
        }
    }
}
```

### Parameters

| Parameter                                                | Type                                                     | Required                                                 | Description                                              | Example                                                  |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| `include`                                                | [Optional\<Include>](../../models/operations/Include.md) | :heavy_minus_sign:                                       | filter by user or enabled                                |                                                          |
| `carrier`                                                | *Optional\<String>*                                      | :heavy_minus_sign:                                       | filter by specific carrier                               | fedex                                                    |

### Response

**[ListCarrierParcelTemplatesResponse](../../models/operations/ListCarrierParcelTemplatesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Fetches the parcel template information for a specific carrier parcel template, identified by the token.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetCarrierParcelTemplate" method="get" path="/parcel-templates/{CarrierParcelTemplateToken}" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.GetCarrierParcelTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        GetCarrierParcelTemplateResponse res = sdk.carrierParcelTemplates().get()
                .carrierParcelTemplateToken("<value>")
                .call();

        if (res.carrierParcelTemplate().isPresent()) {
            System.out.println(res.carrierParcelTemplate().get());
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `carrierParcelTemplateToken`                                    | *String*                                                        | :heavy_check_mark:                                              | The unique string representation of the carrier parcel template |

### Response

**[GetCarrierParcelTemplateResponse](../../models/operations/GetCarrierParcelTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |