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

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.operations.ListParcelsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

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
    }
}
```

### Parameters

| Parameter                                            | Type                                                 | Required                                             | Description                                          | Example                                              |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `page`                                               | *Optional<Long>*                                     | :heavy_minus_sign:                                   | The page number you want to select                   |                                                      |
| `results`                                            | *Optional<Long>*                                     | :heavy_minus_sign:                                   | The number of results to return per page (max 100)   |                                                      |
| `shippoApiVersion`                                   | *Optional<String>*                                   | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |

### Response

**[ListParcelsResponse](../../models/operations/ListParcelsResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## create

Creates a new parcel object.

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.components.Cod;
import com.shippo.sdk.models.components.DistanceUnitEnum;
import com.shippo.sdk.models.components.ParcelCreateRequest;
import com.shippo.sdk.models.components.ParcelExtra;
import com.shippo.sdk.models.components.ParcelInsurance;
import com.shippo.sdk.models.components.ParcelInsuranceProvider;
import com.shippo.sdk.models.components.PaymentMethod;
import com.shippo.sdk.models.components.WeightUnitEnum;
import com.shippo.sdk.models.operations.CreateParcelRequestBody;
import com.shippo.sdk.models.operations.CreateParcelResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        CreateParcelResponse res = sdk.parcels().create()
                .shippoApiVersion("2018-02-08")
                .requestBody(CreateParcelRequestBody.of(ParcelCreateRequest.builder()
                    .massUnit(WeightUnitEnum.LB)
                    .weight("1")
                    .distanceUnit(DistanceUnitEnum.IN)
                    .height("1")
                    .length("1")
                    .width("1")
                    .extra(ParcelExtra.builder()
                        .cod(Cod.builder()
                            .amount("5.5")
                            .currency("USD")
                            .paymentMethod(PaymentMethod.CASH)
                            .build())
                        .insurance(ParcelInsurance.builder()
                            .amount("5.5")
                            .content("Laptop")
                            .currency("USD")
                            .provider(ParcelInsuranceProvider.UPS)
                            .build())
                        .build())
                    .metadata("Customer ID 123456")
                    .build()))
                .call();

        if (res.parcel().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   | Example                                                                       |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `shippoApiVersion`                                                            | *Optional<String>*                                                            | :heavy_minus_sign:                                                            | String used to pick a non-default API version to use                          | 2018-02-08                                                                    |
| `requestBody`                                                                 | [CreateParcelRequestBody](../../models/operations/CreateParcelRequestBody.md) | :heavy_check_mark:                                                            | Parcel details.                                                               |                                                                               |

### Response

**[CreateParcelResponse](../../models/operations/CreateParcelResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |


## get

Returns parcel details using an existing parcel object ID (this will not return parcel details associated with un-purchased shipment/rate parcel object IDs).

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.operations.GetParcelResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

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
    }
}
```

### Parameters

| Parameter                                            | Type                                                 | Required                                             | Description                                          | Example                                              |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `parcelId`                                           | *String*                                             | :heavy_check_mark:                                   | Object ID of the parcel                              |                                                      |
| `shippoApiVersion`                                   | *Optional<String>*                                   | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |

### Response

**[GetParcelResponse](../../models/operations/GetParcelResponse.md)**

### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | \*\/*                  |
