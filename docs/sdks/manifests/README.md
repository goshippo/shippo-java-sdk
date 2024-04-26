# Manifests
(*manifests()*)

## Overview

A manifest is a single-page document with a barcode that carriers can scan to accept all packages into transit without the need to scan each item individually. 
They are close-outs of shipping labels of a certain day. Some carriers require manifests to  process the shipments.

<SchemaDefinition schemaRef="#/components/schemas/Manifest"/>

# Manifest Errors
The following codes and messages are the possible errors that may occur when creating Manifests.
<SchemaDefinition schemaRef="#/components/schemas/ManifestErrors"/>

### Available Operations

* [list](#list) - List all manifests
* [create](#create) - Create a new manifest
* [get](#get) - Retrieve a manifest

## list

Returns a list of all manifest objects.

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.ListManifestsRequest;
import com.shippo.shippo_java_sdk.models.operations.ListManifestsResponse;
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

            ListManifestsResponse res = sdk.manifests().list()
                .page(1L)
                .results(5L)
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.manifestPaginatedList().isPresent()) {
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

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `page`                                                        | *Optional<? extends Long>*                                    | :heavy_minus_sign:                                            | The page number you want to select                            |                                                               |
| `results`                                                     | *Optional<? extends Long>*                                    | :heavy_minus_sign:                                            | The number of results to return per page (max 100, default 5) |                                                               |
| `shippoApiVersion`                                            | *Optional<? extends String>*                                  | :heavy_minus_sign:                                            | String used to pick a non-default API version to use          | 2018-02-08                                                    |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.ListManifestsResponse>](../../models/operations/ListManifestsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## create

Creates a new manifest object.

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.AddressCreateRequest;
import com.shippo.shippo_java_sdk.models.components.ManifestCreateRequest;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.CreateManifestRequest;
import com.shippo.shippo_java_sdk.models.operations.CreateManifestResponse;
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

            CreateManifestResponse res = sdk.manifests().create()
                .shippoApiVersion("2018-02-08")
                .manifestCreateRequest(ManifestCreateRequest.builder()
                    .carrierAccount("adcfdddf8ec64b84ad22772bce3ea37a")
                    .shipmentDate("2014-05-16T23:59:59Z")
                    .addressFrom(ManifestCreateRequestAddressFrom.of(AddressCreateRequest.builder()
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
                                .build()))
                    .transactions(java.util.List.of(
                        "adcfdddf8ec64b84ad22772bce3ea37a"))
                    .build())
                .call();

            if (res.manifest().isPresent()) {
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
| `manifestCreateRequest`                                                                                                                    | [Optional<? extends com.shippo.shippo_java_sdk.models.components.ManifestCreateRequest>](../../models/components/ManifestCreateRequest.md) | :heavy_minus_sign:                                                                                                                         | Manifest details and contact info.                                                                                                         |                                                                                                                                            |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.CreateManifestResponse>](../../models/operations/CreateManifestResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## get

Returns an existing manifest using an object ID.

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.GetManifestRequest;
import com.shippo.shippo_java_sdk.models.operations.GetManifestResponse;
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

            GetManifestResponse res = sdk.manifests().get()
                .manifestId("<value>")
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.manifest().isPresent()) {
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
| `manifestId`                                         | *String*                                             | :heavy_check_mark:                                   | Object ID of the manifest to update                  |                                                      |
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.GetManifestResponse>](../../models/operations/GetManifestResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
