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

import com.goshippo.sdk.Shippo;
import com.goshippo.sdk.models.operations.ListManifestsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

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
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `page`                                                                                                                                                             | *Optional\<Long>*                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                 | The page number you want to select                                                                                                                                 |                                                                                                                                                                    |
| `results`                                                                                                                                                          | *Optional\<Long>*                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                 | The number of results to return per page (max 100, default 5)                                                                                                      |                                                                                                                                                                    |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |

### Response

**[ListManifestsResponse](../../models/operations/ListManifestsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## create

Creates a new manifest object.

### Example Usage

```java
package hello.world;

import com.goshippo.sdk.Shippo;
import com.goshippo.sdk.models.components.AddressCreateRequest;
import com.goshippo.sdk.models.components.ManifestCreateRequest;
import com.goshippo.sdk.models.components.ManifestCreateRequestAddressFrom;
import com.goshippo.sdk.models.operations.CreateManifestResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

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
                        .street3("")
                        .streetNo("")
                        .city("San Francisco")
                        .state("CA")
                        .zip("94117")
                        .phone("+1 555 341 9393")
                        .email("shippotle@shippo.com")
                        .isResidential(true)
                        .metadata("Customer ID 123456")
                        .validate(true)
                        .build()))
                    .transactions(List.of(
                        "adcfdddf8ec64b84ad22772bce3ea37a"))
                    .build())
                .call();

        if (res.manifest().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |
| `manifestCreateRequest`                                                                                                                                            | [ManifestCreateRequest](../../models/components/ManifestCreateRequest.md)                                                                                          | :heavy_check_mark:                                                                                                                                                 | Manifest details and contact info.                                                                                                                                 |                                                                                                                                                                    |

### Response

**[CreateManifestResponse](../../models/operations/CreateManifestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Returns an existing manifest using an object ID.

### Example Usage

```java
package hello.world;

import com.goshippo.sdk.Shippo;
import com.goshippo.sdk.models.operations.GetManifestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        GetManifestResponse res = sdk.manifests().get()
                .manifestId("<id>")
                .shippoApiVersion("2018-02-08")
                .call();

        if (res.manifest().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `manifestId`                                                                                                                                                       | *String*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | Object ID of the manifest to update                                                                                                                                |                                                                                                                                                                    |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |

### Response

**[GetManifestResponse](../../models/operations/GetManifestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |