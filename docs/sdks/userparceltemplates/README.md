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

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.operations.ListUserParcelTemplatesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        ListUserParcelTemplatesResponse res = sdk.userParcelTemplates().list()
                .shippoApiVersion("2018-02-08")
                .call();

        if (res.userParcelTemplateList().isPresent()) {
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

**[ListUserParcelTemplatesResponse](../../models/operations/ListUserParcelTemplatesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.components.UserParcelTemplateCreateRequest;
import com.shippo.sdk.models.components.UserParcelTemplateWithCarrierTemplateCreateRequest;
import com.shippo.sdk.models.components.WeightUnitEnum;
import com.shippo.sdk.models.operations.CreateUserParcelTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        CreateUserParcelTemplateResponse res = sdk.userParcelTemplates().create()
                .shippoApiVersion("2018-02-08")
                .userParcelTemplateCreateRequest(UserParcelTemplateCreateRequest.of(UserParcelTemplateWithCarrierTemplateCreateRequest.builder()
                    .weight("12")
                    .weightUnit(WeightUnitEnum.LB)
                    .build()))
                .call();

        if (res.userParcelTemplate().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |
| `userParcelTemplateCreateRequest`                                                                                                                                  | [UserParcelTemplateCreateRequest](../../models/components/UserParcelTemplateCreateRequest.md)                                                                      | :heavy_check_mark:                                                                                                                                                 | N/A                                                                                                                                                                |                                                                                                                                                                    |

### Response

**[CreateUserParcelTemplateResponse](../../models/operations/CreateUserParcelTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## delete

Deletes a user parcel template using an object ID.

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.operations.DeleteUserParcelTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        DeleteUserParcelTemplateResponse res = sdk.userParcelTemplates().delete()
                .userParcelTemplateObjectId("<id>")
                .shippoApiVersion("2018-02-08")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `userParcelTemplateObjectId`                                                                                                                                       | *String*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | Object ID of the user parcel template                                                                                                                              |                                                                                                                                                                    |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |

### Response

**[DeleteUserParcelTemplateResponse](../../models/operations/DeleteUserParcelTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Returns the parcel template information for a specific user parcel
template, identified by the object ID.

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.operations.GetUserParcelTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        GetUserParcelTemplateResponse res = sdk.userParcelTemplates().get()
                .userParcelTemplateObjectId("<id>")
                .shippoApiVersion("2018-02-08")
                .call();

        if (res.userParcelTemplate().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `userParcelTemplateObjectId`                                                                                                                                       | *String*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | Object ID of the user parcel template                                                                                                                              |                                                                                                                                                                    |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |

### Response

**[GetUserParcelTemplateResponse](../../models/operations/GetUserParcelTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## update

Updates an existing user parcel template.

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.components.DistanceUnitEnum;
import com.shippo.sdk.models.components.UserParcelTemplateUpdateRequest;
import com.shippo.sdk.models.components.WeightUnitEnum;
import com.shippo.sdk.models.operations.UpdateUserParcelTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        UpdateUserParcelTemplateResponse res = sdk.userParcelTemplates().update()
                .userParcelTemplateObjectId("<id>")
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
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `userParcelTemplateObjectId`                                                                                                                                       | *String*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | Object ID of the user parcel template                                                                                                                              |                                                                                                                                                                    |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |
| `userParcelTemplateUpdateRequest`                                                                                                                                  | [Optional\<UserParcelTemplateUpdateRequest>](../../models/components/UserParcelTemplateUpdateRequest.md)                                                           | :heavy_minus_sign:                                                                                                                                                 | N/A                                                                                                                                                                |                                                                                                                                                                    |

### Response

**[UpdateUserParcelTemplateResponse](../../models/operations/UpdateUserParcelTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |