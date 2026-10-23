# UserParcelTemplates

## Overview

A user parcel template represents a package used for shipping that has preset dimensions and attributes defined 
by you. They are useful for capturing attributes of parcel-types you frequently use for shipping, allowing 
them to be defined once and then used for many shipments. These parcel templates can also be used for live rates.

User parcel templates can also be created using a carrier parcel template, where the dimensions will be copied from 
the carrier presets, but the weight can be configured by you.

### Available Operations

* [list](#list) - List all user parcel templates
* [create](#create) - Create a new user parcel template
* [delete](#delete) - Delete a user parcel template
* [get](#get) - Retrieves a user parcel template
* [update](#update) - Update an existing user parcel template

## list

Returns a list all of all user parcel template objects.

### Example Usage

<!-- UsageSnippet language="java" operationID="ListUserParcelTemplates" method="get" path="/user-parcel-templates" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.ListUserParcelTemplatesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        ListUserParcelTemplatesResponse res = sdk.userParcelTemplates().list()
                .call();

        if (res.userParcelTemplateList().isPresent()) {
            System.out.println(res.userParcelTemplateList().get());
        }
    }
}
```

### Response

**[ListUserParcelTemplatesResponse](../../models/operations/ListUserParcelTemplatesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## create

Creates a new user parcel template.

You can choose to create a
parcel template using a preset carrier template as a starting point, or
you can create an entirely custom one. To use a preset carrier template,
pass in a unique template token from [this list](/shippoapi/public-api/parcel-templates)
plus the weight fields (**weight** and **weight_unit**). Otherwise, omit
the template field and pass the other fields, for the weight, length, height,
and depth, as well as their units."

### Example Usage

<!-- UsageSnippet language="java" operationID="CreateUserParcelTemplate" method="post" path="/user-parcel-templates" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.*;
import com.goshippo.shippo_sdk.models.operations.CreateUserParcelTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        UserParcelTemplateCreateRequest req = UserParcelTemplateCreateRequest.of(UserParcelTemplateWithoutCarrierTemplateCreateRequest.builder()
                .distanceUnit(DistanceUnitEnum.IN)
                .height("6")
                .length("10")
                .name("My Custom Template")
                .width("8")
                .weight("12")
                .weightUnit(WeightUnitEnum.LB)
                .build());

        CreateUserParcelTemplateResponse res = sdk.userParcelTemplates().create()
                .request(req)
                .call();

        if (res.userParcelTemplate().isPresent()) {
            System.out.println(res.userParcelTemplate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [UserParcelTemplateCreateRequest](../../models/shared/UserParcelTemplateCreateRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateUserParcelTemplateResponse](../../models/operations/CreateUserParcelTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## delete

Deletes a user parcel template using an object ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="DeleteUserParcelTemplate" method="delete" path="/user-parcel-templates/{UserParcelTemplateObjectId}" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.DeleteUserParcelTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        DeleteUserParcelTemplateResponse res = sdk.userParcelTemplates().delete()
                .userParcelTemplateObjectId("<id>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                             | Type                                  | Required                              | Description                           |
| ------------------------------------- | ------------------------------------- | ------------------------------------- | ------------------------------------- |
| `userParcelTemplateObjectId`          | *String*                              | :heavy_check_mark:                    | Object ID of the user parcel template |

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

<!-- UsageSnippet language="java" operationID="GetUserParcelTemplate" method="get" path="/user-parcel-templates/{UserParcelTemplateObjectId}" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.GetUserParcelTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        GetUserParcelTemplateResponse res = sdk.userParcelTemplates().get()
                .userParcelTemplateObjectId("<id>")
                .call();

        if (res.userParcelTemplate().isPresent()) {
            System.out.println(res.userParcelTemplate().get());
        }
    }
}
```

### Parameters

| Parameter                             | Type                                  | Required                              | Description                           |
| ------------------------------------- | ------------------------------------- | ------------------------------------- | ------------------------------------- |
| `userParcelTemplateObjectId`          | *String*                              | :heavy_check_mark:                    | Object ID of the user parcel template |

### Response

**[GetUserParcelTemplateResponse](../../models/operations/GetUserParcelTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## update

Updates an existing user parcel template.

### Example Usage

<!-- UsageSnippet language="java" operationID="UpdateUserParcelTemplate" method="put" path="/user-parcel-templates/{UserParcelTemplateObjectId}" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.*;
import com.goshippo.shippo_sdk.models.operations.UpdateUserParcelTemplateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        UpdateUserParcelTemplateResponse res = sdk.userParcelTemplates().update()
                .userParcelTemplateObjectId("<id>")
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
            System.out.println(res.userParcelTemplate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `userParcelTemplateObjectId`                                                                             | *String*                                                                                                 | :heavy_check_mark:                                                                                       | Object ID of the user parcel template                                                                    |
| `userParcelTemplateUpdateRequest`                                                                        | [Optional\<UserParcelTemplateUpdateRequest>](../../models/components/UserParcelTemplateUpdateRequest.md) | :heavy_minus_sign:                                                                                       | N/A                                                                                                      |

### Response

**[UpdateUserParcelTemplateResponse](../../models/operations/UpdateUserParcelTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |