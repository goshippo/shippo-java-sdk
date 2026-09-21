# Parcels

## Overview

A parcel is an item you are shipping. The parcel object includes details about its physical make-up of the parcel. It includes dimensions and weight that Shippo uses to calculate rates.

### Available Operations

* [list](#list) - List all parcels
* [create](#create) - Create a new parcel
* [get](#get) - Retrieve an existing parcel

## list

Returns a list of all parcel objects.

### Example Usage

<!-- UsageSnippet language="java" operationID="ListParcels" method="get" path="/parcels" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.ListParcelsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        ListParcelsResponse res = sdk.parcels().list()
                .page(1L)
                .results(25L)
                .call();

        if (res.parcelPaginatedList().isPresent()) {
            System.out.println(res.parcelPaginatedList().get());
        }
    }
}
```

### Parameters

| Parameter                                          | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `page`                                             | *Optional\<Long>*                                  | :heavy_minus_sign:                                 | The page number you want to select                 |
| `results`                                          | *Optional\<Long>*                                  | :heavy_minus_sign:                                 | The number of results to return per page (max 100) |

### Response

**[ListParcelsResponse](../../models/operations/ListParcelsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## create

Creates a new parcel object.

### Example Usage

<!-- UsageSnippet language="java" operationID="CreateParcel" method="post" path="/parcels" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.*;
import com.goshippo.shippo_sdk.models.operations.CreateParcelRequestBody;
import com.goshippo.shippo_sdk.models.operations.CreateParcelResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        CreateParcelRequestBody req = CreateParcelRequestBody.of(ParcelCreateRequest.builder()
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
                .build());

        CreateParcelResponse res = sdk.parcels().create()
                .request(req)
                .call();

        if (res.parcel().isPresent()) {
            System.out.println(res.parcel().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateParcelRequestBody](../../models/operations/CreateParcelRequestBody.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateParcelResponse](../../models/operations/CreateParcelResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Returns parcel details using an existing parcel object ID (this will not return parcel details associated with un-purchased shipment/rate parcel object IDs).

### Example Usage

<!-- UsageSnippet language="java" operationID="GetParcel" method="get" path="/parcels/{ParcelId}" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.GetParcelResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        GetParcelResponse res = sdk.parcels().get()
                .parcelId("<id>")
                .call();

        if (res.parcel().isPresent()) {
            System.out.println(res.parcel().get());
        }
    }
}
```

### Parameters

| Parameter               | Type                    | Required                | Description             |
| ----------------------- | ----------------------- | ----------------------- | ----------------------- |
| `parcelId`              | *String*                | :heavy_check_mark:      | Object ID of the parcel |

### Response

**[GetParcelResponse](../../models/operations/GetParcelResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |