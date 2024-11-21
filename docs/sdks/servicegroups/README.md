# ServiceGroups
(*serviceGroups()*)

## Overview

A service group is a set of service levels grouped together. 
Rates at checkout uses services groups to present available shipping options to customers in their shopping basket.
<SchemaDefinition schemaRef="#/components/schemas/ServiceGroup"/>

### Available Operations

* [list](#list) - List all service groups
* [create](#create) - Create a new service group
* [update](#update) - Update an existing service group
* [delete](#delete) - Delete a service group

## list

Returns a list of service group objects.

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.operations.ListServiceGroupsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        ListServiceGroupsResponse res = sdk.serviceGroups().list()
                .shippoApiVersion("2018-02-08")
                .call();

        if (res.serviceGroupListResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |

### Response

**[ListServiceGroupsResponse](../../models/operations/ListServiceGroupsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## create

Creates a new service group.

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.components.ServiceGroupAccountAndServiceLevel;
import com.shippo.sdk.models.components.ServiceGroupCreateRequest;
import com.shippo.sdk.models.components.ServiceGroupTypeEnum;
import com.shippo.sdk.models.operations.CreateServiceGroupResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        CreateServiceGroupResponse res = sdk.serviceGroups().create()
                .shippoApiVersion("2018-02-08")
                .serviceGroupCreateRequest(ServiceGroupCreateRequest.builder()
                    .description("USPS shipping options")
                    .name("USPS Shipping")
                    .type(ServiceGroupTypeEnum.FLAT_RATE)
                    .serviceLevels(List.of(
                        ServiceGroupAccountAndServiceLevel.builder()
                            .accountObjectId("80feb1633d4a43c898f0058506cfd82d")
                            .serviceLevelToken("ups_next_day_air_saver")
                            .build()))
                    .flatRate("5")
                    .flatRateCurrency("USD")
                    .freeShippingThresholdCurrency("USD")
                    .freeShippingThresholdMin("5")
                    .rateAdjustment(15L)
                    .build())
                .call();

        if (res.serviceGroup().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |
| `serviceGroupCreateRequest`                                                                                                                                        | [ServiceGroupCreateRequest](../../models/components/ServiceGroupCreateRequest.md)                                                                                  | :heavy_check_mark:                                                                                                                                                 | N/A                                                                                                                                                                |                                                                                                                                                                    |

### Response

**[CreateServiceGroupResponse](../../models/operations/CreateServiceGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## update

Updates an existing service group object. <br>The object_id cannot be updated as it is the unique identifier for the object.

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.components.ServiceGroupAccountAndServiceLevel;
import com.shippo.sdk.models.components.ServiceGroupTypeEnum;
import com.shippo.sdk.models.components.ServiceGroupUpdateRequest;
import com.shippo.sdk.models.operations.UpdateServiceGroupResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        UpdateServiceGroupResponse res = sdk.serviceGroups().update()
                .shippoApiVersion("2018-02-08")
                .serviceGroupUpdateRequest(ServiceGroupUpdateRequest.builder()
                    .description("USPS shipping options")
                    .name("USPS Shipping")
                    .type(ServiceGroupTypeEnum.FLAT_RATE)
                    .objectId("80feb1633d4a43c898f005850")
                    .isActive(true)
                    .serviceLevels(List.of(
                        ServiceGroupAccountAndServiceLevel.builder()
                            .accountObjectId("80feb1633d4a43c898f0058506cfd82d")
                            .serviceLevelToken("ups_next_day_air_saver")
                            .build()))
                    .flatRate("5")
                    .flatRateCurrency("USD")
                    .freeShippingThresholdCurrency("USD")
                    .freeShippingThresholdMin("5")
                    .rateAdjustment(15L)
                    .build())
                .call();

        if (res.serviceGroup().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |
| `serviceGroupUpdateRequest`                                                                                                                                        | [Optional\<ServiceGroupUpdateRequest>](../../models/components/ServiceGroupUpdateRequest.md)                                                                       | :heavy_minus_sign:                                                                                                                                                 | N/A                                                                                                                                                                |                                                                                                                                                                    |

### Response

**[UpdateServiceGroupResponse](../../models/operations/UpdateServiceGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## delete

Deletes an existing service group using an object ID.

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.operations.DeleteServiceGroupResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        DeleteServiceGroupResponse res = sdk.serviceGroups().delete()
                .serviceGroupId("<id>")
                .shippoApiVersion("2018-02-08")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `serviceGroupId`                                                                                                                                                   | *String*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | Object ID of the service group                                                                                                                                     |                                                                                                                                                                    |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |

### Response

**[DeleteServiceGroupResponse](../../models/operations/DeleteServiceGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |