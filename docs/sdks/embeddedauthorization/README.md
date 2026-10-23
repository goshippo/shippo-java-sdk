# EmbeddedAuthorization

## Overview

Mint short-lived JSON Web Tokens (JWTs) for client-side applications, so you never ship a
long-lived API token to the browser. Authenticate the request with a Shippo API token or an
OAuth bearer token, then pass the returned token as `Authorization: JWT <JWT_TOKEN>`.
See our [Authentication using JWT guide](https://docs.goshippo.com/docs/guides_general/authentication_using_jwt/) for details.

### Available Operations

* [create](#create) - Create a JWT

## create

Creates a short-lived JSON Web Token (JWT) that client-side applications can use
to authenticate against the Shippo API without exposing a long-lived API token.

Authenticate this request with either a Shippo API token
(`Authorization: ShippoToken <API_TOKEN>`) or an OAuth bearer token
(`Authorization: Bearer <OAUTH_BEARER_TOKEN>`). Platform accounts can mint a token
on behalf of a Managed Shippo Account by setting the `SHIPPO-ACCOUNT-ID` header.

The returned token is valid for 12 hours. Send it on subsequent requests as
`Authorization: JWT <JWT_TOKEN>`.

### Example Usage

<!-- UsageSnippet language="java" operationID="CreateEmbeddedAuthorization" method="post" path="/embedded/authz" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.EmbeddedAuthorizationRequest;
import com.goshippo.shippo_sdk.models.operations.CreateEmbeddedAuthorizationResponse;
import com.goshippo.shippo_sdk.models.operations.CreateEmbeddedAuthorizationSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
            .build();

        CreateEmbeddedAuthorizationResponse res = sdk.embeddedAuthorization().create()
                .security(CreateEmbeddedAuthorizationSecurity.builder()
                    .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
                    .build())
                .shippoAccountId("e0b382dc7d754c0ca6358c09d5d2bdf7")
                .embeddedAuthorizationRequest(EmbeddedAuthorizationRequest.builder()
                    .scope("embedded:carriers")
                    .build())
                .call();

        if (res.embeddedAuthorization().isPresent()) {
            System.out.println(res.embeddedAuthorization().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                       | Type                                                                                                                                            | Required                                                                                                                                        | Description                                                                                                                                     | Example                                                                                                                                         |
| ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                      | [com.goshippo.shippo_sdk.models.operations.CreateEmbeddedAuthorizationSecurity](../../models/operations/CreateEmbeddedAuthorizationSecurity.md) | :heavy_check_mark:                                                                                                                              | The security requirements to use for the request.                                                                                               |                                                                                                                                                 |
| `shippoAccountId`                                                                                                                               | *Optional\<String>*                                                                                                                             | :heavy_minus_sign:                                                                                                                              | Optional. The object ID of a Managed Shippo Account. Platform accounts set this to<br/>mint a JWT scoped to one of their managed accounts.      | e0b382dc7d754c0ca6358c09d5d2bdf7                                                                                                                |
| `embeddedAuthorizationRequest`                                                                                                                  | [EmbeddedAuthorizationRequest](../../models/components/EmbeddedAuthorizationRequest.md)                                                         | :heavy_check_mark:                                                                                                                              | The scope to request for the token.                                                                                                             |                                                                                                                                                 |

### Response

**[CreateEmbeddedAuthorizationResponse](../../models/operations/CreateEmbeddedAuthorizationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |