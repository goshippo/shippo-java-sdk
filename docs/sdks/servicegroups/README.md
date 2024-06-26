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

            ListServiceGroupsResponse res = sdk.serviceGroups().list()
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.serviceGroupListResponse().isPresent()) {
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

| Parameter                                            | Type                                                 | Required                                             | Description                                          | Example                                              |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.ListServiceGroupsResponse>](../../models/operations/ListServiceGroupsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## create

Creates a new service group.

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

            CreateServiceGroupResponse res = sdk.serviceGroups().create()
                .shippoApiVersion("2018-02-08")
                .serviceGroupCreateRequest(ServiceGroupCreateRequest.builder()
                    .description("USPS shipping options")
                    .name("USPS Shipping")
                    .type(ServiceGroupTypeEnum.FLAT_RATE)
                    .serviceLevels(java.util.List.of(
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

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        | Example                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `shippoApiVersion`                                                                                                 | *Optional<? extends String>*                                                                                       | :heavy_minus_sign:                                                                                                 | String used to pick a non-default API version to use                                                               | 2018-02-08                                                                                                         |
| `serviceGroupCreateRequest`                                                                                        | [com.shippo.sdk.models.components.ServiceGroupCreateRequest](../../models/components/ServiceGroupCreateRequest.md) | :heavy_check_mark:                                                                                                 | N/A                                                                                                                |                                                                                                                    |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.CreateServiceGroupResponse>](../../models/operations/CreateServiceGroupResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## update

Updates an existing service group object. <br>The object_id cannot be updated as it is the unique identifier for the object.

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

            UpdateServiceGroupResponse res = sdk.serviceGroups().update()
                .shippoApiVersion("2018-02-08")
                .serviceGroupUpdateRequest(ServiceGroupUpdateRequest.builder()
                    .description("USPS shipping options")
                    .name("USPS Shipping")
                    .type(ServiceGroupTypeEnum.FLAT_RATE)
                    .objectId("80feb1633d4a43c898f005850")
                    .isActive(true)
                    .serviceLevels(java.util.List.of(
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

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            | Example                                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `shippoApiVersion`                                                                                                                     | *Optional<? extends String>*                                                                                                           | :heavy_minus_sign:                                                                                                                     | String used to pick a non-default API version to use                                                                                   | 2018-02-08                                                                                                                             |
| `serviceGroupUpdateRequest`                                                                                                            | [Optional<? extends com.shippo.sdk.models.components.ServiceGroupUpdateRequest>](../../models/components/ServiceGroupUpdateRequest.md) | :heavy_minus_sign:                                                                                                                     | N/A                                                                                                                                    |                                                                                                                                        |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.UpdateServiceGroupResponse>](../../models/operations/UpdateServiceGroupResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## delete

Deletes an existing service group using an object ID.

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

            DeleteServiceGroupResponse res = sdk.serviceGroups().delete()
                .serviceGroupId("<value>")
                .shippoApiVersion("2018-02-08")
                .call();

            // handle response
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

| Parameter                                            | Type                                                 | Required                                             | Description                                          | Example                                              |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `serviceGroupId`                                     | *String*                                             | :heavy_check_mark:                                   | Object ID of the service group                       |                                                      |
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.DeleteServiceGroupResponse>](../../models/operations/DeleteServiceGroupResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
