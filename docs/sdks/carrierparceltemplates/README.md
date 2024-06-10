# CarrierParcelTemplates
(*carrierParcelTemplates()*)

## Overview

A carrier parcel template represents a package used for shipping that has preset dimensions defined by a carrier. Some examples of a carrier parcel template include USPS Flat Rate Box and Fedex Small Pak. When using a carrier parcel template, the rates returned may be limited to the carrier that provides the box. You can create user parcel templates using a carrier parcel template. Shippo takes the dimensions of the carrier parcel template but you must configure the weight.

<SchemaDefinition schemaRef="#/components/schemas/CarrierParcelTemplate"/>

### Available Operations

* [list](#list) - List all carrier parcel templates
* [get](#get) - Retrieve a carrier parcel templates

## list

List all carrier parcel template objects. <br> Use the following query string params to filter the results as needed. <br> <ul> <li>`include=all` (the default). Includes templates from all carriers </li> <li>`include=user`. Includes templates only from carriers which the user has added (whether or not they're currently enabled) </li> <li>`include=enabled`. includes templates only for carriers which the user has added and enabled </li> <li>`carrier=*token*`. filter by specific carrier, e.g. fedex, usps </li> </ul>

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.components.*;
import com.shippo.sdk.models.components.Security;
import com.shippo.sdk.models.operations.*;
import com.shippo.sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
        } catch (com.shippo.sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                                                          | Type                                                                                               | Required                                                                                           | Description                                                                                        | Example                                                                                            |
| -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- |
| `include`                                                                                          | [Optional<? extends com.shippo.sdk.models.operations.Include>](../../models/operations/Include.md) | :heavy_minus_sign:                                                                                 | filter by user or enabled                                                                          |                                                                                                    |
| `carrier`                                                                                          | *Optional<? extends String>*                                                                       | :heavy_minus_sign:                                                                                 | filter by specific carrier                                                                         | fedex                                                                                              |
| `shippoApiVersion`                                                                                 | *Optional<? extends String>*                                                                       | :heavy_minus_sign:                                                                                 | String used to pick a non-default API version to use                                               | 2018-02-08                                                                                         |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.ListCarrierParcelTemplatesResponse>](../../models/operations/ListCarrierParcelTemplatesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## get

Fetches the parcel template information for a specific carrier parcel template, identified by the token.

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.components.*;
import com.shippo.sdk.models.components.Security;
import com.shippo.sdk.models.operations.*;
import com.shippo.sdk.utils.EventStream;
import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
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
        } catch (com.shippo.sdk.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     | Example                                                         |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `carrierParcelTemplateToken`                                    | *String*                                                        | :heavy_check_mark:                                              | The unique string representation of the carrier parcel template |                                                                 |
| `shippoApiVersion`                                              | *Optional<? extends String>*                                    | :heavy_minus_sign:                                              | String used to pick a non-default API version to use            | 2018-02-08                                                      |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.GetCarrierParcelTemplateResponse>](../../models/operations/GetCarrierParcelTemplateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
