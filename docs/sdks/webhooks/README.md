# Webhooks

## Overview

Webhooks are a way for Shippo to notify your application when a specific event occurs. For example, when a label is purchased or when a shipment tracking status has changed. You can use webhooks to trigger actions in your application, such as sending an email or updating a database.

### Available Operations

* [createWebhook](#createwebhook) - Create a new webhook
* [listWebhooks](#listwebhooks) - List all webhooks
* [getWebhook](#getwebhook) - Retrieve a specific webhook
* [updateWebhook](#updatewebhook) - Update an existing webhook
* [deleteWebhook](#deletewebhook) - Delete a specific webhook

## createWebhook

Creates a new webhook to send notifications to a URL when a specific event occurs.

### Example Usage

<!-- UsageSnippet language="java" operationID="createWebhook" method="post" path="/webhooks" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.WebhookEventTypeEnum;
import com.goshippo.shippo_sdk.models.components.WebhookUpdateRequest;
import com.goshippo.shippo_sdk.models.operations.CreateWebhookResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        WebhookUpdateRequest req = WebhookUpdateRequest.builder()
                .event(WebhookEventTypeEnum.TRANSACTION_UPDATED)
                .url("https://example.com/shippo-webhook")
                .active(true)
                .isTest(false)
                .build();

        CreateWebhookResponse res = sdk.webhooks().createWebhook()
                .request(req)
                .call();

        if (res.webhook().isPresent()) {
            System.out.println(res.webhook().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [WebhookUpdateRequest](../../models/shared/WebhookUpdateRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[CreateWebhookResponse](../../models/operations/CreateWebhookResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listWebhooks

Returns a list of all webhooks you have created.

### Example Usage

<!-- UsageSnippet language="java" operationID="listWebhooks" method="get" path="/webhooks" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.ListWebhooksResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        ListWebhooksResponse res = sdk.webhooks().listWebhooks()
                .call();

        if (res.webhookPaginatedList().isPresent()) {
            System.out.println(res.webhookPaginatedList().get());
        }
    }
}
```

### Response

**[ListWebhooksResponse](../../models/operations/ListWebhooksResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getWebhook

Returns the details of a specific webhook using the webhook object ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="getWebhook" method="get" path="/webhooks/{webhookId}" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.GetWebhookResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        GetWebhookResponse res = sdk.webhooks().getWebhook()
                .webhookId("<id>")
                .call();

        if (res.webhook().isPresent()) {
            System.out.println(res.webhook().get());
        }
    }
}
```

### Parameters

| Parameter                            | Type                                 | Required                             | Description                          |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `webhookId`                          | *String*                             | :heavy_check_mark:                   | Object ID of the webhook to retrieve |

### Response

**[GetWebhookResponse](../../models/operations/GetWebhookResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateWebhook

Updates an existing webhook using the webhook object ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateWebhook" method="put" path="/webhooks/{webhookId}" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.WebhookEventTypeEnum;
import com.goshippo.shippo_sdk.models.components.WebhookUpdateRequest;
import com.goshippo.shippo_sdk.models.operations.UpdateWebhookResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        UpdateWebhookResponse res = sdk.webhooks().updateWebhook()
                .webhookId("<id>")
                .webhookUpdateRequest(WebhookUpdateRequest.builder()
                    .event(WebhookEventTypeEnum.ALL)
                    .url("https://example.com/shippo-webhook")
                    .active(true)
                    .isTest(false)
                    .build())
                .call();

        if (res.webhook().isPresent()) {
            System.out.println(res.webhook().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `webhookId`                                                             | *String*                                                                | :heavy_check_mark:                                                      | Object ID of the webhook to retrieve                                    |
| `webhookUpdateRequest`                                                  | [WebhookUpdateRequest](../../models/components/WebhookUpdateRequest.md) | :heavy_check_mark:                                                      | N/A                                                                     |

### Response

**[UpdateWebhookResponse](../../models/operations/UpdateWebhookResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteWebhook

Deletes a specific webhook using the webhook object ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteWebhook" method="delete" path="/webhooks/{webhookId}" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.DeleteWebhookResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        DeleteWebhookResponse res = sdk.webhooks().deleteWebhook()
                .webhookId("<id>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                          | Type                               | Required                           | Description                        |
| ---------------------------------- | ---------------------------------- | ---------------------------------- | ---------------------------------- |
| `webhookId`                        | *String*                           | :heavy_check_mark:                 | Object ID of the webhook to delete |

### Response

**[DeleteWebhookResponse](../../models/operations/DeleteWebhookResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |