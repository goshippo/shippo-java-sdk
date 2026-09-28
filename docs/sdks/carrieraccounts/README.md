# CarrierAccounts

## Overview

Carriers are the companies who deliver your package. Shippo uses Carrier account objects as credentials to retrieve shipping rates and purchase labels from shipping Carriers.

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

Additionally, you can get information about the service levels associated with each carrier account by passing in the `?service_levels=true` query parameter.
Using it appends the property `service_levels` to each carrier account.
By default, if the query parameter is omitted, the `service_levels` property will not be included in the response.

### Example Usage

<!-- UsageSnippet language="java" operationID="ListCarrierAccounts" method="get" path="/carrier_accounts" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.ListCarrierAccountsRequest;
import com.goshippo.shippo_sdk.models.operations.ListCarrierAccountsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        ListCarrierAccountsRequest req = ListCarrierAccountsRequest.builder()
                .build();

        ListCarrierAccountsResponse res = sdk.carrierAccounts().list()
                .request(req)
                .call();

        if (res.carrierAccountPaginatedList().isPresent()) {
            System.out.println(res.carrierAccountPaginatedList().get());
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

<!-- UsageSnippet language="java" operationID="CreateCarrierAccount" method="post" path="/carrier_accounts" -->
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
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        ConnectExistingOwnAccountRequest req = ConnectExistingOwnAccountRequest.builder()
                .accountId("321123")
                .carrier("fedex")
                .parameters(ConnectExistingOwnAccountRequestParameters.of(Map.ofEntries(
                    Map.entry("first_name", "Abdullah"),
                    Map.entry("last_name", "Ward"),
                    Map.entry("phone_number", "915-577-4415 x207"),
                    Map.entry("from_address_st", "<value>"),
                    Map.entry("from_address_city", "<value>"),
                    Map.entry("from_address_state", "<value>"),
                    Map.entry("from_address_zip", "<value>"),
                    Map.entry("from_address_country_iso2", "<value>"),
                    Map.entry("use_multi_factor_registration", false),
                    Map.entry("verification_option", "SMS"),
                    Map.entry("verification_invoice_amount", "340"),
                    Map.entry("verification_invoice_date", "2024-03-09"),
                    Map.entry("verification_invoice_currency", "USD"))))
                .metadata("FEDEX Account")
                .test(false)
                .build();

        CreateCarrierAccountResponse res = sdk.carrierAccounts().create()
                .request(req)
                .call();

        if (res.carrierAccount().isPresent()) {
            System.out.println(res.carrierAccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [ConnectExistingOwnAccountRequest](../../models/shared/ConnectExistingOwnAccountRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[CreateCarrierAccountResponse](../../models/operations/CreateCarrierAccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Returns an existing carrier account using an object ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetCarrierAccount" method="get" path="/carrier_accounts/{CarrierAccountId}" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.GetCarrierAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        GetCarrierAccountResponse res = sdk.carrierAccounts().get()
                .carrierAccountId("<id>")
                .call();

        if (res.carrierAccount().isPresent()) {
            System.out.println(res.carrierAccount().get());
        }
    }
}
```

### Parameters

| Parameter                        | Type                             | Required                         | Description                      |
| -------------------------------- | -------------------------------- | -------------------------------- | -------------------------------- |
| `carrierAccountId`               | *String*                         | :heavy_check_mark:               | Object ID of the carrier account |

### Response

**[GetCarrierAccountResponse](../../models/operations/GetCarrierAccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## update

Updates an existing carrier account object. The account_id and carrier can't be updated. This is because they form the unique identifier together.

### Example Usage

<!-- UsageSnippet language="java" operationID="UpdateCarrierAccount" method="put" path="/carrier_accounts/{CarrierAccountId}" -->
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
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        UpdateCarrierAccountResponse res = sdk.carrierAccounts().update()
                .carrierAccountId("<id>")
                .carrierAccountBase(CarrierAccountBase.builder()
                    .accountId("****")
                    .carrier("usps")
                    .parameters(CarrierAccountBaseParameters.of(Map.ofEntries(
                        Map.entry("first_name", "Eldora"),
                        Map.entry("last_name", "Weber"),
                        Map.entry("phone_number", "1-505-428-6798"),
                        Map.entry("from_address_st", "<value>"),
                        Map.entry("from_address_city", "<value>"),
                        Map.entry("from_address_state", "<value>"),
                        Map.entry("from_address_zip", "<value>"),
                        Map.entry("from_address_country_iso2", "<value>"),
                        Map.entry("use_multi_factor_registration", false),
                        Map.entry("verification_option", "EMAIL"),
                        Map.entry("verification_invoice_amount", "340"),
                        Map.entry("verification_invoice_date", "2024-03-09"),
                        Map.entry("verification_invoice_currency", "USD"))))
                    .build())
                .call();

        if (res.carrierAccount().isPresent()) {
            System.out.println(res.carrierAccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `carrierAccountId`                                                             | *String*                                                                       | :heavy_check_mark:                                                             | Object ID of the carrier account                                               |
| `carrierAccountBase`                                                           | [Optional\<CarrierAccountBase>](../../models/components/CarrierAccountBase.md) | :heavy_minus_sign:                                                             | Examples.                                                                      |

### Response

**[UpdateCarrierAccountResponse](../../models/operations/UpdateCarrierAccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## initiateOauth2Signin

Used by client applications to setup or reconnect an existing carrier account with carriers that support OAuth 2.0

### Example Usage

<!-- UsageSnippet language="java" operationID="InitiateOauth2Signin" method="get" path="/carrier_accounts/{CarrierAccountObjectId}/signin/initiate" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.errors.*;
import com.goshippo.shippo_sdk.models.operations.InitiateOauth2SigninResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws InitiateOauth2SigninResponseBody, InitiateOauth2SigninCarrierAccountsResponseResponseBody, InitiateOauth2SigninCarrierAccountsResponseBody, Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        InitiateOauth2SigninResponse res = sdk.carrierAccounts().initiateOauth2Signin()
                .carrierAccountObjectId("<id>")
                .redirectUri("https://ashamed-reporter.biz")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                      | Type                                                                                                                                                                                                           | Required                                                                                                                                                                                                       | Description                                                                                                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `carrierAccountObjectId`                                                                                                                                                                                       | *String*                                                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                                                             | The carrier account ID (UUID) to start a signin process.                                                                                                                                                       |
| `redirectUri`                                                                                                                                                                                                  | *String*                                                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                                                             | Callback URL. The URL that tells the authorization server where to send the user back to after they approve the request.                                                                                       |
| `state`                                                                                                                                                                                                        | *Optional\<String>*                                                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                                             | A random string generated by the consuming application and included in the request to prevent CSRF attacks. The consuming application checks that the same value is returned after the user authorizes Shippo. |

### Response

**[InitiateOauth2SigninResponse](../../models/operations/InitiateOauth2SigninResponse.md)**

### Errors

| Error Type                                                            | Status Code                                                           | Content Type                                                          |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| models/errors/InitiateOauth2SigninResponseBody                        | 400                                                                   | application/json                                                      |
| models/errors/InitiateOauth2SigninCarrierAccountsResponseResponseBody | 401                                                                   | application/json                                                      |
| models/errors/InitiateOauth2SigninCarrierAccountsResponseBody         | 404                                                                   | application/json                                                      |
| models/errors/SDKError                                                | 4XX, 5XX                                                              | \*/\*                                                                 |

## register

Adds a Shippo carrier account

### Example Usage

<!-- UsageSnippet language="java" operationID="RegisterCarrierAccount" method="post" path="/carrier_accounts/register/new" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.CarrierAccountDeutschePostCreateRequest;
import com.goshippo.shippo_sdk.models.components.CarrierAccountDeutschePostCreateRequestParameters;
import com.goshippo.shippo_sdk.models.operations.RegisterCarrierAccountRequestBody;
import com.goshippo.shippo_sdk.models.operations.RegisterCarrierAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        RegisterCarrierAccountRequestBody req = CarrierAccountDeutschePostCreateRequest.builder()
                .parameters(CarrierAccountDeutschePostCreateRequestParameters.builder()
                    .build())
                .build();

        RegisterCarrierAccountResponse res = sdk.carrierAccounts().register()
                .request(req)
                .call();

        if (res.carrierAccount().isPresent()) {
            System.out.println(res.carrierAccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [RegisterCarrierAccountRequestBody](../../models/operations/RegisterCarrierAccountRequestBody.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[RegisterCarrierAccountResponse](../../models/operations/RegisterCarrierAccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getRegistrationStatus

Returns the registration status for the given account for the given carrier

### Example Usage

<!-- UsageSnippet language="java" operationID="GetCarrierRegistrationStatus" method="get" path="/carrier_accounts/reg-status" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.Carrier;
import com.goshippo.shippo_sdk.models.operations.GetCarrierRegistrationStatusResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        GetCarrierRegistrationStatusResponse res = sdk.carrierAccounts().getRegistrationStatus()
                .carrier(Carrier.UPS)
                .call();

        if (res.carrierAccountRegistrationStatus().isPresent()) {
            System.out.println(res.carrierAccountRegistrationStatus().get());
        }
    }
}
```

### Parameters

| Parameter                                     | Type                                          | Required                                      | Description                                   |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `carrier`                                     | [Carrier](../../models/operations/Carrier.md) | :heavy_check_mark:                            | filter by specific carrier                    |

### Response

**[GetCarrierRegistrationStatusResponse](../../models/operations/GetCarrierRegistrationStatusResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |