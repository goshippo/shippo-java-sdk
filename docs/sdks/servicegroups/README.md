# ServiceGroups

## Overview

A service group is a set of service levels grouped together. 
Rates at checkout uses services groups to present available shipping options to customers in their shopping basket.

### Available Operations

* [list](#list) - List all service groups
* [create](#create) - Create a new service group
* [update](#update) - Update an existing service group
* [delete](#delete) - Delete a service group

## list

Returns a list of service group objects.

### Example Usage

<!-- UsageSnippet language="java" operationID="ListServiceGroups" method="get" path="/service-groups" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.ListServiceGroupsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        ListServiceGroupsResponse res = sdk.serviceGroups().list()
                .call();

        if (res.serviceGroupListResponse().isPresent()) {
            System.out.println(res.serviceGroupListResponse().get());
        }
    }
}
```

### Response

**[ListServiceGroupsResponse](../../models/operations/ListServiceGroupsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## create

Creates a new service group.

### Example Usage

<!-- UsageSnippet language="java" operationID="CreateServiceGroup" method="post" path="/service-groups" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.ServiceGroupCreateRequest;
import com.goshippo.shippo_sdk.models.components.ServiceGroupTypeEnum;
import com.goshippo.shippo_sdk.models.operations.CreateServiceGroupResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        ServiceGroupCreateRequest req = ServiceGroupCreateRequest.builder()
                .description("USPS shipping options")
                .name("USPS Shipping")
                .type(ServiceGroupTypeEnum.FLAT_RATE)
                .serviceLevels(List.of())
                .flatRate("5")
                .flatRateCurrency("USD")
                .freeShippingThresholdCurrency("USD")
                .freeShippingThresholdMin("5")
                .rateAdjustment(15L)
                .build();

        CreateServiceGroupResponse res = sdk.serviceGroups().create()
                .request(req)
                .call();

        if (res.serviceGroup().isPresent()) {
            System.out.println(res.serviceGroup().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ServiceGroupCreateRequest](../../models/shared/ServiceGroupCreateRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateServiceGroupResponse](../../models/operations/CreateServiceGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## update

Updates an existing service group object. The object_id cannot be updated as it is the unique identifier for the object.

### Example Usage

<!-- UsageSnippet language="java" operationID="UpdateServiceGroup" method="put" path="/service-groups" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.*;
import com.goshippo.shippo_sdk.models.operations.UpdateServiceGroupResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        ServiceGroupUpdateRequest req = ServiceGroupUpdateRequest.builder()
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
                .build();

        UpdateServiceGroupResponse res = sdk.serviceGroups().update()
                .request(req)
                .call();

        if (res.serviceGroup().isPresent()) {
            System.out.println(res.serviceGroup().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ServiceGroupUpdateRequest](../../models/shared/ServiceGroupUpdateRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[UpdateServiceGroupResponse](../../models/operations/UpdateServiceGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## delete

Deletes an existing service group using an object ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="DeleteServiceGroup" method="delete" path="/service-groups/{ServiceGroupId}" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.DeleteServiceGroupResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        DeleteServiceGroupResponse res = sdk.serviceGroups().delete()
                .serviceGroupId("<id>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serviceGroupId`               | *String*                       | :heavy_check_mark:             | Object ID of the service group |

### Response

**[DeleteServiceGroupResponse](../../models/operations/DeleteServiceGroupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |