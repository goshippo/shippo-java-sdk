# CarrierAccounts
(*carrierAccounts()*)

## Overview

Carriers are the companies who deliver your package. Shippo uses Carrier account objects as credentials to retrieve shipping rates and purchase labels from shipping Carriers.

<SchemaDefinition schemaRef="#/components/schemas/CarrierAccount"/>

### Available Operations

* [list](#list) - List all carrier accounts
* [create](#create) - Create a new carrier account
* [get](#get) - Retrieve a carrier account
* [update](#update) - Update a carrier account
* [initiateOauth2Signin](#initiateoauth2signin) - Connect an existing carrier account using OAuth 2.0
* [register](#register) - Add a Shippo carrier account
* [getRegistrationStatus](#getregistrationstatus) - Get Carrier Registration status

## list

Returns a list of all carrier accounts connected to your Shippo account. These carrier accounts include both Shippo carrier accounts and your own carrier accounts that you have connected to your Shippo account.

Additionally, you can get information about the service levels associated with each carrier account by passing in the `?service_levels=true` query parameter. <br>
Using it appends the property `service_levels` to each carrier account. <br>
By default, if the query parameter is omitted, the `service_levels` property will not be included in the response.

### Example Usage

```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.ListCarrierAccountsRequest;
import com.goshippo.shippo_sdk.models.operations.ListCarrierAccountsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        ListCarrierAccountsRequest req = ListCarrierAccountsRequest.builder()
                .page(1L)
                .results(5L)
                .build();

        ListCarrierAccountsResponse res = sdk.carrierAccounts().list()
                .request(req)
                .call();

        if (res.carrierAccountPaginatedList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ListCarrierAccountsRequest](../../models/operations/ListCarrierAccountsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListCarrierAccountsResponse](../../models/operations/ListCarrierAccountsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## create

Creates a new carrier account or connects an existing carrier account to the Shippo account.

### Example Usage

```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.ConnectExistingOwnAccountRequest;
import com.goshippo.shippo_sdk.models.components.ConnectExistingOwnAccountRequestParameters;
import com.goshippo.shippo_sdk.models.operations.CreateCarrierAccountResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        CreateCarrierAccountResponse res = sdk.carrierAccounts().create()
                .shippoApiVersion("2018-02-08")
                .connectExistingOwnAccountRequest(ConnectExistingOwnAccountRequest.builder()
                    .accountId("321123")
                    .carrier("fedex")
                    .parameters(ConnectExistingOwnAccountRequestParameters.of(Map.ofEntries(
                        Map.entry("first_name", "Loyal"),
                        Map.entry("last_name", "Collier"),
                        Map.entry("phone_number", "(890) 307-8579"),
                        Map.entry("from_address_st", "<value>"),
                        Map.entry("from_address_city", "<value>"),
                        Map.entry("from_address_state", "<value>"),
                        Map.entry("from_address_zip", "<value>"),
                        Map.entry("from_address_country_iso2", "<value>"))))
                    .metadata("FEDEX Account")
                    .test(false)
                    .build())
                .call();

        if (res.carrierAccount().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |
| `connectExistingOwnAccountRequest`                                                                                                                                 | [ConnectExistingOwnAccountRequest](../../models/components/ConnectExistingOwnAccountRequest.md)                                                                    | :heavy_check_mark:                                                                                                                                                 | Examples.                                                                                                                                                          |                                                                                                                                                                    |

### Response

**[CreateCarrierAccountResponse](../../models/operations/CreateCarrierAccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Returns an existing carrier account using an object ID.

### Example Usage

```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.GetCarrierAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        GetCarrierAccountResponse res = sdk.carrierAccounts().get()
                .carrierAccountId("<id>")
                .shippoApiVersion("2018-02-08")
                .call();

        if (res.carrierAccount().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `carrierAccountId`                                                                                                                                                 | *String*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | Object ID of the carrier account                                                                                                                                   |                                                                                                                                                                    |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |

### Response

**[GetCarrierAccountResponse](../../models/operations/GetCarrierAccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## update

Updates an existing carrier account object. The account_id and carrier can't be updated. This is because they form the unique identifier together.

### Example Usage

```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.CarrierAccountBase;
import com.goshippo.shippo_sdk.models.components.CarrierAccountBaseParameters;
import com.goshippo.shippo_sdk.models.operations.UpdateCarrierAccountResponse;
import java.lang.Exception;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        UpdateCarrierAccountResponse res = sdk.carrierAccounts().update()
                .carrierAccountId("<id>")
                .shippoApiVersion("2018-02-08")
                .carrierAccountBase(CarrierAccountBase.builder()
                    .accountId("****")
                    .carrier("usps")
                    .parameters(CarrierAccountBaseParameters.of(Map.ofEntries(
                        Map.entry("account_number", "94567e"),
                        Map.entry("aia_country_iso2", "US"),
                        Map.entry("billing_address_city", "San Francisco"),
                        Map.entry("billing_address_country_iso2", "US"),
                        Map.entry("billing_address_state", "CA"),
                        Map.entry("billing_address_street1", "731 Market St"),
                        Map.entry("billing_address_street2", "STE 200"),
                        Map.entry("billing_address_zip", "94103"),
                        Map.entry("collec_country_iso2", "US"),
                        Map.entry("collec_zip", "94103"),
                        Map.entry("company", "Shippo"),
                        Map.entry("currency_code", "USD"),
                        Map.entry("email", "hippo@shippo.com"),
                        Map.entry("full_name", "Shippo Meister"),
                        Map.entry("has_invoice", false),
                        Map.entry("invoice_controlid", "1234"),
                        Map.entry("invoice_date", "20210529"),
                        Map.entry("invoice_number", "1112234"),
                        Map.entry("invoice_value", "11.23"),
                        Map.entry("phone", "1112223333"),
                        Map.entry("title", "Manager"),
                        Map.entry("ups_agreements", true))))
                    .build())
                .call();

        if (res.carrierAccount().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `carrierAccountId`                                                                                                                                                 | *String*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | Object ID of the carrier account                                                                                                                                   |                                                                                                                                                                    |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |
| `carrierAccountBase`                                                                                                                                               | [Optional\<CarrierAccountBase>](../../models/components/CarrierAccountBase.md)                                                                                     | :heavy_minus_sign:                                                                                                                                                 | Examples.                                                                                                                                                          |                                                                                                                                                                    |

### Response

**[UpdateCarrierAccountResponse](../../models/operations/UpdateCarrierAccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## initiateOauth2Signin

Used by client applications to setup or reconnect an existing carrier account with carriers that support OAuth 2.0

### Example Usage

```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.errors.InitiateOauth2SigninCarrierAccountsResponseBody;
import com.goshippo.shippo_sdk.models.errors.InitiateOauth2SigninCarrierAccountsResponseResponseBody;
import com.goshippo.shippo_sdk.models.errors.InitiateOauth2SigninResponseBody;
import com.goshippo.shippo_sdk.models.operations.InitiateOauth2SigninResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws InitiateOauth2SigninResponseBody, InitiateOauth2SigninCarrierAccountsResponseBody, InitiateOauth2SigninCarrierAccountsResponseResponseBody, Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        InitiateOauth2SigninResponse res = sdk.carrierAccounts().initiateOauth2Signin()
                .carrierAccountObjectId("<id>")
                .redirectUri("https://enlightened-mortise.com/")
                .state("Florida")
                .shippoApiVersion("2018-02-08")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                      | Type                                                                                                                                                                                                           | Required                                                                                                                                                                                                       | Description                                                                                                                                                                                                    | Example                                                                                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `carrierAccountObjectId`                                                                                                                                                                                       | *String*                                                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                                                             | The carrier account ID (UUID) to start a signin process.                                                                                                                                                       |                                                                                                                                                                                                                |
| `redirectUri`                                                                                                                                                                                                  | *String*                                                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                                                             | Callback URL. The URL that tells the authorization server where to send the user back to after they approve the request.                                                                                       |                                                                                                                                                                                                                |
| `state`                                                                                                                                                                                                        | *Optional\<String>*                                                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                                             | A random string generated by the consuming application and included in the request to prevent CSRF attacks. The consuming application checks that the same value is returned after the user authorizes Shippo. |                                                                                                                                                                                                                |
| `shippoApiVersion`                                                                                                                                                                                             | *Optional\<String>*                                                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                                             | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide.                                             | 2018-02-08                                                                                                                                                                                                     |

### Response

**[InitiateOauth2SigninResponse](../../models/operations/InitiateOauth2SigninResponse.md)**

### Errors

| Error Type                                                            | Status Code                                                           | Content Type                                                          |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| models/errors/InitiateOauth2SigninResponseBody                        | 400                                                                   | application/json                                                      |
| models/errors/InitiateOauth2SigninCarrierAccountsResponseBody         | 401                                                                   | application/json                                                      |
| models/errors/InitiateOauth2SigninCarrierAccountsResponseResponseBody | 404                                                                   | application/json                                                      |
| models/errors/SDKError                                                | 4XX, 5XX                                                              | \*/\*                                                                 |

## register

Adds a Shippo carrier account

### Example Usage

```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.CarrierAccountChronopostCreateRequest;
import com.goshippo.shippo_sdk.models.components.CarrierAccountChronopostCreateRequestParameters;
import com.goshippo.shippo_sdk.models.operations.RegisterCarrierAccountRequestBody;
import com.goshippo.shippo_sdk.models.operations.RegisterCarrierAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        RegisterCarrierAccountResponse res = sdk.carrierAccounts().register()
                .shippoApiVersion("2018-02-08")
                .requestBody(RegisterCarrierAccountRequestBody.of(CarrierAccountChronopostCreateRequest.builder()
                    .carrier("correos")
                    .parameters(CarrierAccountChronopostCreateRequestParameters.builder()
                        .build())
                    .build()))
                .call();

        if (res.carrierAccount().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |
| `requestBody`                                                                                                                                                      | [RegisterCarrierAccountRequestBody](../../models/operations/RegisterCarrierAccountRequestBody.md)                                                                  | :heavy_check_mark:                                                                                                                                                 | Examples.                                                                                                                                                          |                                                                                                                                                                    |

### Response

**[RegisterCarrierAccountResponse](../../models/operations/RegisterCarrierAccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getRegistrationStatus

Returns the registration status for the given account for the given carrier

### Example Usage

```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.Carrier;
import com.goshippo.shippo_sdk.models.operations.GetCarrierRegistrationStatusResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        GetCarrierRegistrationStatusResponse res = sdk.carrierAccounts().getRegistrationStatus()
                .carrier(Carrier.USPS)
                .shippoApiVersion("2018-02-08")
                .call();

        if (res.carrierAccountRegistrationStatus().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `carrier`                                                                                                                                                          | [Carrier](../../models/operations/Carrier.md)                                                                                                                      | :heavy_check_mark:                                                                                                                                                 | filter by specific carrier                                                                                                                                         |                                                                                                                                                                    |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |

### Response

**[GetCarrierRegistrationStatusResponse](../../models/operations/GetCarrierRegistrationStatusResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |