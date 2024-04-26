# UserParcelTemplates
(*userParcelTemplates()*)

## Overview

A user parcel template represents a package used for shipping that has preset dimensions and attributes defined 
by you. They are useful for capturing attributes of parcel-types you frequently use for shipping, allowing 
them to be defined once and then used for many shipments. These parcel templates can also be used for live rates.

User parcel templates can also be created using a carrier parcel template, where the dimensions will be copied from 
the carrier presets, but the weight can be configured by you.
<SchemaDefinition schemaRef="#/components/schemas/UserParcelTemplate"/>

### Available Operations

* [list](#list) - List all user parcel templates
* [create](#create) - Create a new user parcel template
* [delete](#delete) - Delete a user parcel template
* [get](#get) - Retrieves a user parcel template
* [update](#update) - Update an existing user parcel template

## list

Returns a list all of all user parcel template objects.

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.ListUserParcelTemplatesRequest;
import com.shippo.shippo_java_sdk.models.operations.ListUserParcelTemplatesResponse;
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

            ListUserParcelTemplatesResponse res = sdk.userParcelTemplates().list()
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.userParcelTemplateListResponse().isPresent()) {
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
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.ListUserParcelTemplatesResponse>](../../models/operations/ListUserParcelTemplatesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## create

Creates a new user parcel template. <br>You can choose to create a
parcel template using a preset carrier template as a starting point, or
you can create an entirely custom one. To use a preset carrier template,
pass in a unique template token from <a href="#tag/Parcel-Templates">this list</a>
plus the weight fields (**weight** and **weight_unit**). Otherwise, omit
the template field and pass the other fields, for the weight, length, height,
and depth, as well as their units."

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.DistanceUnitEnum;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.components.UserParcelTemplateWithCarrierTemplateCreateRequest;
import com.shippo.shippo_java_sdk.models.components.UserParcelTemplateWithoutCarrierTemplateCreateRequest;
import com.shippo.shippo_java_sdk.models.components.WeightUnitEnum;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.CreateUserParcelTemplateRequest;
import com.shippo.shippo_java_sdk.models.operations.CreateUserParcelTemplateResponse;
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

            CreateUserParcelTemplateResponse res = sdk.userParcelTemplates().create()
                .shippoApiVersion("2018-02-08")
                .userParcelTemplateCreateRequest(new Object())
                .call();

            if (res.userParcelTemplate().isPresent()) {
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

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    | Example                                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `shippoApiVersion`                                                                                                                                             | *Optional<? extends String>*                                                                                                                                   | :heavy_minus_sign:                                                                                                                                             | String used to pick a non-default API version to use                                                                                                           | 2018-02-08                                                                                                                                                     |
| `userParcelTemplateCreateRequest`                                                                                                                              | [Optional<? extends com.shippo.shippo_java_sdk.models.components.UserParcelTemplateCreateRequest>](../../models/components/UserParcelTemplateCreateRequest.md) | :heavy_minus_sign:                                                                                                                                             | N/A                                                                                                                                                            |                                                                                                                                                                |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.CreateUserParcelTemplateResponse>](../../models/operations/CreateUserParcelTemplateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## delete

Deletes a user parcel template using an object ID.

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.DeleteUserParcelTemplateRequest;
import com.shippo.shippo_java_sdk.models.operations.DeleteUserParcelTemplateResponse;
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

            DeleteUserParcelTemplateResponse res = sdk.userParcelTemplates().delete()
                .userParcelTemplateObjectId("<value>")
                .shippoApiVersion("2018-02-08")
                .call();

            // handle response
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
| `userParcelTemplateObjectId`                         | *String*                                             | :heavy_check_mark:                                   | Object ID of the user parcel template                |                                                      |
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.DeleteUserParcelTemplateResponse>](../../models/operations/DeleteUserParcelTemplateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## get

Returns the parcel template information for a specific user parcel
template, identified by the object ID.

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.GetUserParcelTemplateRequest;
import com.shippo.shippo_java_sdk.models.operations.GetUserParcelTemplateResponse;
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

            GetUserParcelTemplateResponse res = sdk.userParcelTemplates().get()
                .userParcelTemplateObjectId("<value>")
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.userParcelTemplate().isPresent()) {
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
| `userParcelTemplateObjectId`                         | *String*                                             | :heavy_check_mark:                                   | Object ID of the user parcel template                |                                                      |
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.GetUserParcelTemplateResponse>](../../models/operations/GetUserParcelTemplateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## update

Updates an existing user parcel template.

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.DistanceUnitEnum;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.components.UserParcelTemplateUpdateRequest;
import com.shippo.shippo_java_sdk.models.components.WeightUnitEnum;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.UpdateUserParcelTemplateRequest;
import com.shippo.shippo_java_sdk.models.operations.UpdateUserParcelTemplateResponse;
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

            UpdateUserParcelTemplateResponse res = sdk.userParcelTemplates().update()
                .userParcelTemplateObjectId("<value>")
                .shippoApiVersion("2018-02-08")
                .userParcelTemplateUpdateRequest(UserParcelTemplateUpdateRequest.builder()
                    .distanceUnit(DistanceUnitEnum.IN)
                    .height("6")
                    .length("10")
                    .name("My Custom Template")
                    .width("8")
                    .weight("12")
                    .weightUnit(WeightUnitEnum.LB)
                    .build())
                .call();

            if (res.userParcelTemplate().isPresent()) {
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

| Parameter                                                                                                                                                      | Type                                                                                                                                                           | Required                                                                                                                                                       | Description                                                                                                                                                    | Example                                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `userParcelTemplateObjectId`                                                                                                                                   | *String*                                                                                                                                                       | :heavy_check_mark:                                                                                                                                             | Object ID of the user parcel template                                                                                                                          |                                                                                                                                                                |
| `shippoApiVersion`                                                                                                                                             | *Optional<? extends String>*                                                                                                                                   | :heavy_minus_sign:                                                                                                                                             | String used to pick a non-default API version to use                                                                                                           | 2018-02-08                                                                                                                                                     |
| `userParcelTemplateUpdateRequest`                                                                                                                              | [Optional<? extends com.shippo.shippo_java_sdk.models.components.UserParcelTemplateUpdateRequest>](../../models/components/UserParcelTemplateUpdateRequest.md) | :heavy_minus_sign:                                                                                                                                             | N/A                                                                                                                                                            |                                                                                                                                                                |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.UpdateUserParcelTemplateResponse>](../../models/operations/UpdateUserParcelTemplateResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
