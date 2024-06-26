# Webhooks
(*webhooks()*)

## Overview

Webhooks are a way for Shippo to notify your application when a specific event occurs. For example, when a label is purchased or when a shipment tracking status has changed. You can use webhooks to trigger actions in your application, such as sending an email or updating a database.
<SchemaDefinition schemaRef="#/components/schemas/Webhook"/>

### Available Operations

* [createWebhook](#createwebhook) - Create a new webhook
* [listWebhooks](#listwebhooks) - List all webhooks
* [getWebhook](#getwebhook) - Retrieve a specific webhook
* [updateWebhook](#updatewebhook) - Update an existing webhook
* [deleteWebhook](#deletewebhook) - Delete a specific webhook

## createWebhook

Creates a new webhook to send notifications to a URL when a specific event occurs.

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

            WebhookUpdateRequest req = WebhookUpdateRequest.builder()
                .event(WebhookEventTypeEnum.BATCH_CREATED)
                .url("<value>")
                .build();

            CreateWebhookResponse res = sdk.webhooks().createWebhook()
                .request(req)
                .call();

            if (res.webhook().isPresent()) {
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

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [com.shippo.sdk.models.components.WebhookUpdateRequest](../../models/shared/WebhookUpdateRequest.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.CreateWebhookResponse>](../../models/operations/CreateWebhookResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## listWebhooks

Returns a list of all webhooks you have created.

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

            ListWebhooksResponse res = sdk.webhooks().listWebhooks()
                .call();

            if (res.webhookPaginatedList().isPresent()) {
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


### Response

**[Optional<? extends com.shippo.sdk.models.operations.ListWebhooksResponse>](../../models/operations/ListWebhooksResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getWebhook

Returns the details of a specific webhook using the webhook object ID.

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

            GetWebhookResponse res = sdk.webhooks().getWebhook()
                .webhookId("<value>")
                .call();

            if (res.webhook().isPresent()) {
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

| Parameter                            | Type                                 | Required                             | Description                          |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `webhookId`                          | *String*                             | :heavy_check_mark:                   | Object ID of the webhook to retrieve |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.GetWebhookResponse>](../../models/operations/GetWebhookResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## updateWebhook

Updates an existing webhook using the webhook object ID.

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

            UpdateWebhookResponse res = sdk.webhooks().updateWebhook()
                .webhookId("<value>")
                .webhookUpdateRequest(WebhookUpdateRequest.builder()
                    .event(WebhookEventTypeEnum.BATCH_CREATED)
                    .url("<value>")
                    .build())
                .call();

            if (res.webhook().isPresent()) {
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

| Parameter                                                                                                | Type                                                                                                     | Required                                                                                                 | Description                                                                                              |
| -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| `webhookId`                                                                                              | *String*                                                                                                 | :heavy_check_mark:                                                                                       | Object ID of the webhook to retrieve                                                                     |
| `webhookUpdateRequest`                                                                                   | [com.shippo.sdk.models.components.WebhookUpdateRequest](../../models/components/WebhookUpdateRequest.md) | :heavy_check_mark:                                                                                       | N/A                                                                                                      |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.UpdateWebhookResponse>](../../models/operations/UpdateWebhookResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## deleteWebhook

Deletes a specific webhook using the webhook object ID.

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

            DeleteWebhookResponse res = sdk.webhooks().deleteWebhook()
                .webhookId("<value>")
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

| Parameter                          | Type                               | Required                           | Description                        |
| ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- |
| `webhookId`                        | *String*                           | :heavy_check_mark:                 | Object ID of the webhook to delete |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.DeleteWebhookResponse>](../../models/operations/DeleteWebhookResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
