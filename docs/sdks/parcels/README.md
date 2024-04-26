# Parcels
(*parcels()*)

## Overview

A parcel is an item you are shipping. The parcel object includes details about its physical make-up of the parcel. It includes dimensions and weight that Shippo uses to calculate rates. 
<SchemaDefinition schemaRef="#/components/schemas/Parcel"/>

# Parcel Extras
The following values are supported for the `extra` field of the parcel object.
<SchemaDefinition schemaRef="#/components/schemas/ParcelExtra"/>

### Available Operations

* [list](#list) - List all parcels
* [create](#create) - Create a new parcel
* [get](#get) - Retrieve an existing parcel

## list

Returns a list of all parcel objects.

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.ListParcelsRequest;
import com.shippo.shippo_java_sdk.models.operations.ListParcelsResponse;
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

            ListParcelsResponse res = sdk.parcels().list()
                .page(1L)
                .results(25L)
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.parcelPaginatedList().isPresent()) {
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

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.ListParcelsResponse>](../../models/operations/ListParcelsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## create

Creates a new parcel object.

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.Cod;
import com.shippo.shippo_java_sdk.models.components.DistanceUnitEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelExtra;
import com.shippo.shippo_java_sdk.models.components.ParcelInsurance;
import com.shippo.shippo_java_sdk.models.components.ParcelInsuranceProvider;
import com.shippo.shippo_java_sdk.models.components.ParcelRequest;
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
import com.shippo.shippo_java_sdk.models.operations.CreateParcelRequest;
import com.shippo.shippo_java_sdk.models.operations.CreateParcelResponse;
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

            CreateParcelResponse res = sdk.parcels().create()
                .shippoApiVersion("2018-02-08")
                .parcelRequest(ParcelRequest.builder()
                    .distanceUnit(DistanceUnitEnum.IN)
                    .height("1")
                    .length("1")
                    .massUnit(WeightUnitEnum.LB)
                    .weight("1")
                    .width("1")
                    .build())
                .call();

            if (res.parcel().isPresent()) {
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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                | Example                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `shippoApiVersion`                                                                                                         | *Optional<? extends String>*                                                                                               | :heavy_minus_sign:                                                                                                         | String used to pick a non-default API version to use                                                                       | 2018-02-08                                                                                                                 |
| `parcelRequest`                                                                                                            | [Optional<? extends com.shippo.shippo_java_sdk.models.components.ParcelRequest>](../../models/components/ParcelRequest.md) | :heavy_minus_sign:                                                                                                         | Parcel details.                                                                                                            |                                                                                                                            |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.CreateParcelResponse>](../../models/operations/CreateParcelResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## get

Returns parcel details using an existing parcel object ID (this will not return parcel details associated with un-purchased shipment/rate parcel object IDs).

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.GetParcelRequest;
import com.shippo.shippo_java_sdk.models.operations.GetParcelResponse;
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

            GetParcelResponse res = sdk.parcels().get()
                .parcelId("<value>")
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.parcel().isPresent()) {
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
| `parcelId`                                           | *String*                                             | :heavy_check_mark:                                   | Object ID of the parcel                              |                                                      |
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.GetParcelResponse>](../../models/operations/GetParcelResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
