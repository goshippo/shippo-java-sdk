# Manifests

## Overview

A manifest is a single-page document with a barcode that carriers can scan to accept all packages into transit without the need to scan each item individually.
They are close-outs of shipping labels of a certain day. Some carriers require manifests to  process the shipments.

### Available Operations

* [list](#list) - List all manifests
* [create](#create) - Create a new manifest
* [get](#get) - Retrieve a manifest

## list

Returns a list of all manifest objects.

### Example Usage

<!-- UsageSnippet language="java" operationID="ListManifests" method="get" path="/manifests" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.ListManifestsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        ListManifestsResponse res = sdk.manifests().list()
                .page(1L)
                .results(5L)
                .call();

        if (res.manifestPaginatedList().isPresent()) {
            System.out.println(res.manifestPaginatedList().get());
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `page`                                                        | *Optional\<Long>*                                             | :heavy_minus_sign:                                            | The page number you want to select                            |
| `results`                                                     | *Optional\<Long>*                                             | :heavy_minus_sign:                                            | The number of results to return per page (max 100, default 5) |

### Response

**[ListManifestsResponse](../../models/operations/ListManifestsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## create

Creates a new manifest object.

### Example Usage

<!-- UsageSnippet language="java" operationID="CreateManifest" method="post" path="/manifests" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.ManifestCreateRequest;
import com.goshippo.shippo_sdk.models.components.ManifestCreateRequestAddressFrom;
import com.goshippo.shippo_sdk.models.operations.CreateManifestResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        ManifestCreateRequest req = ManifestCreateRequest.builder()
                .carrierAccount("adcfdddf8ec64b84ad22772bce3ea37a")
                .shipmentDate("2014-05-16T23:59:59Z")
                .addressFrom(ManifestCreateRequestAddressFrom.of("<value>"))
                .transactions(List.of(
                    "adcfdddf8ec64b84ad22772bce3ea37a"))
                .build();

        CreateManifestResponse res = sdk.manifests().create()
                .request(req)
                .call();

        if (res.manifest().isPresent()) {
            System.out.println(res.manifest().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ManifestCreateRequest](../../models/shared/ManifestCreateRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[CreateManifestResponse](../../models/operations/CreateManifestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Returns an existing manifest using an object ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetManifest" method="get" path="/manifests/{ManifestId}" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.GetManifestResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        GetManifestResponse res = sdk.manifests().get()
                .manifestId("<id>")
                .call();

        if (res.manifest().isPresent()) {
            System.out.println(res.manifest().get());
        }
    }
}
```

### Parameters

| Parameter                           | Type                                | Required                            | Description                         |
| ----------------------------------- | ----------------------------------- | ----------------------------------- | ----------------------------------- |
| `manifestId`                        | *String*                            | :heavy_check_mark:                  | Object ID of the manifest to update |

### Response

**[GetManifestResponse](../../models/operations/GetManifestResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |