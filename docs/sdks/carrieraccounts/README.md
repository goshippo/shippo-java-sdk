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

            ListCarrierAccountsRequest req = ListCarrierAccountsRequest.builder()
                .build();

            ListCarrierAccountsResponse res = sdk.carrierAccounts().list()
                .request(req)
                .call();

            if (res.carrierAccountPaginatedList().isPresent()) {
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

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                            | [com.shippo.sdk.models.operations.ListCarrierAccountsRequest](../../models/operations/ListCarrierAccountsRequest.md) | :heavy_check_mark:                                                                                                   | The request object to use for the request.                                                                           |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.ListCarrierAccountsResponse>](../../models/operations/ListCarrierAccountsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## create

Creates a new carrier account or connects an existing carrier account to the Shippo account.

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

            CreateCarrierAccountResponse res = sdk.carrierAccounts().create()
                .shippoApiVersion("2018-02-08")
                .connectExistingOwnAccountRequest(ConnectExistingOwnAccountRequest.builder()
                    .accountId("321123")
                    .carrier("fedex")
                    .parameters(ConnectExistingOwnAccountRequestParameters.of(FedExConnectExistingOwnAccountParameters.builder()
                                .firstName("<value>")
                                .lastName("<value>")
                                .phoneNumber("<value>")
                                .fromAddressSt("<value>")
                                .fromAddressCity("<value>")
                                .fromAddressState("<value>")
                                .fromAddressZip("<value>")
                                .fromAddressCountryIso2("<value>")
                                .build()))
                    .metadata("FEDEX Account")
                    .test(false)
                    .build())
                .call();

            if (res.carrierAccount().isPresent()) {
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

| Parameter                                                                                                                        | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      | Example                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `shippoApiVersion`                                                                                                               | *Optional<? extends String>*                                                                                                     | :heavy_minus_sign:                                                                                                               | String used to pick a non-default API version to use                                                                             | 2018-02-08                                                                                                                       |
| `connectExistingOwnAccountRequest`                                                                                               | [com.shippo.sdk.models.components.ConnectExistingOwnAccountRequest](../../models/components/ConnectExistingOwnAccountRequest.md) | :heavy_check_mark:                                                                                                               | Examples.                                                                                                                        |                                                                                                                                  |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.CreateCarrierAccountResponse>](../../models/operations/CreateCarrierAccountResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## get

Returns an existing carrier account using an object ID.

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

            GetCarrierAccountResponse res = sdk.carrierAccounts().get()
                .carrierAccountId("<value>")
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.carrierAccount().isPresent()) {
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
| `carrierAccountId`                                   | *String*                                             | :heavy_check_mark:                                   | Object ID of the carrier account                     |                                                      |
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.GetCarrierAccountResponse>](../../models/operations/GetCarrierAccountResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## update

Updates an existing carrier account object. The account_id and carrier can't be updated. This is because they form the unique identifier together.

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

            UpdateCarrierAccountResponse res = sdk.carrierAccounts().update()
                .carrierAccountId("<value>")
                .shippoApiVersion("2018-02-08")
                .carrierAccountBase(CarrierAccountBase.builder()
                    .accountId("****")
                    .carrier("usps")
                    .parameters(CarrierAccountBaseParameters.of(UPSConnectExistingOwnAccountParameters.builder()
                                .accountNumber("94567e")
                                .billingAddressCity("San Francisco")
                                .billingAddressCountryIso2("US")
                                .billingAddressState("CA")
                                .billingAddressStreet1("731 Market St")
                                .billingAddressZip("94103")
                                .collecCountryIso2("US")
                                .collecZip("94103")
                                .company("Shippo")
                                .email("hippo@shippo.com")
                                .fullName("Shippo Meister")
                                .hasInvoice(false)
                                .phone("1112223333")
                                .title("Manager")
                                .upsAgreements(false)
                                .aiaCountryIso2("US")
                                .billingAddressStreet2("STE 200")
                                .currencyCode("USD")
                                .invoiceControlid("1234")
                                .invoiceDate("20210529")
                                .invoiceNumber("1112234")
                                .invoiceValue("11.23")
                                .build()))
                    .build())
                .call();

            if (res.carrierAccount().isPresent()) {
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

| Parameter                                                                                                                | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              | Example                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `carrierAccountId`                                                                                                       | *String*                                                                                                                 | :heavy_check_mark:                                                                                                       | Object ID of the carrier account                                                                                         |                                                                                                                          |
| `shippoApiVersion`                                                                                                       | *Optional<? extends String>*                                                                                             | :heavy_minus_sign:                                                                                                       | String used to pick a non-default API version to use                                                                     | 2018-02-08                                                                                                               |
| `carrierAccountBase`                                                                                                     | [Optional<? extends com.shippo.sdk.models.components.CarrierAccountBase>](../../models/components/CarrierAccountBase.md) | :heavy_minus_sign:                                                                                                       | Examples.                                                                                                                |                                                                                                                          |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.UpdateCarrierAccountResponse>](../../models/operations/UpdateCarrierAccountResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## initiateOauth2Signin

Used by client applications to setup or reconnect an existing carrier account with carriers that support OAuth 2.0

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

            InitiateOauth2SigninResponse res = sdk.carrierAccounts().initiateOauth2Signin()
                .carrierAccountObjectId("<value>")
                .redirectUri("http://fine-cummerbund.biz")
                .state("<value>")
                .shippoApiVersion("2018-02-08")
                .call();

            // handle response
        } catch (com.shippo.sdk.models.errors.InitiateOauth2SigninResponseBody e) {
            // handle exception
            throw e;
        } catch (com.shippo.sdk.models.errors.InitiateOauth2SigninCarrierAccountsResponseBody e) {
            // handle exception
            throw e;
        } catch (com.shippo.sdk.models.errors.InitiateOauth2SigninCarrierAccountsResponseResponseBody e) {
            // handle exception
            throw e;
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

| Parameter                                                                                                                                                                                                      | Type                                                                                                                                                                                                           | Required                                                                                                                                                                                                       | Description                                                                                                                                                                                                    | Example                                                                                                                                                                                                        |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `carrierAccountObjectId`                                                                                                                                                                                       | *String*                                                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                                                             | The carrier account ID (UUID) to start a signin process.                                                                                                                                                       |                                                                                                                                                                                                                |
| `redirectUri`                                                                                                                                                                                                  | *String*                                                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                                                             | Callback URL. The URL that tells the authorization server where to send the user back to after they approve the request.                                                                                       |                                                                                                                                                                                                                |
| `state`                                                                                                                                                                                                        | *Optional<? extends String>*                                                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                                                             | A random string generated by the consuming application and included in the request to prevent CSRF attacks. The consuming application checks that the same value is returned after the user authorizes Shippo. |                                                                                                                                                                                                                |
| `shippoApiVersion`                                                                                                                                                                                             | *Optional<? extends String>*                                                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                                                             | String used to pick a non-default API version to use                                                                                                                                                           | 2018-02-08                                                                                                                                                                                                     |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.InitiateOauth2SigninResponse>](../../models/operations/InitiateOauth2SigninResponse.md)**
### Errors

| Error Object                                                          | Status Code                                                           | Content Type                                                          |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| models/errors/InitiateOauth2SigninResponseBody                        | 400                                                                   | application/json                                                      |
| models/errors/InitiateOauth2SigninCarrierAccountsResponseBody         | 401                                                                   | application/json                                                      |
| models/errors/InitiateOauth2SigninCarrierAccountsResponseResponseBody | 404                                                                   | application/json                                                      |
| models/errors/SDKError                                                | 4xx-5xx                                                               | */*                                                                   |

## register

Adds a Shippo carrier account

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

            RegisterCarrierAccountResponse res = sdk.carrierAccounts().register()
                .shippoApiVersion("2018-02-08")
                .requestBody(com.shippo.sdk.models.operations.RegisterCarrierAccountRequestBody.of(CarrierAccountColissimoCreateRequest.builder()
                        .carrier("colissimo")
                        .parameters(CarrierAccountColissimoCreateRequestParameters.builder()
                                .build())
                        .build()))
                .call();

            if (res.carrierAccount().isPresent()) {
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

| Parameter                                                                                                                          | Type                                                                                                                               | Required                                                                                                                           | Description                                                                                                                        | Example                                                                                                                            |
| ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------- |
| `shippoApiVersion`                                                                                                                 | *Optional<? extends String>*                                                                                                       | :heavy_minus_sign:                                                                                                                 | String used to pick a non-default API version to use                                                                               | 2018-02-08                                                                                                                         |
| `requestBody`                                                                                                                      | [com.shippo.sdk.models.operations.RegisterCarrierAccountRequestBody](../../models/operations/RegisterCarrierAccountRequestBody.md) | :heavy_check_mark:                                                                                                                 | Examples.                                                                                                                          |                                                                                                                                    |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.RegisterCarrierAccountResponse>](../../models/operations/RegisterCarrierAccountResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## getRegistrationStatus

Returns the registration status for the given account for the given carrier

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

            GetCarrierRegistrationStatusResponse res = sdk.carrierAccounts().getRegistrationStatus()
                .carrier(Carrier.USPS)
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.carrierAccountRegistrationStatus().isPresent()) {
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

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    | Example                                                                        |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `carrier`                                                                      | [com.shippo.sdk.models.operations.Carrier](../../models/operations/Carrier.md) | :heavy_check_mark:                                                             | filter by specific carrier                                                     |                                                                                |
| `shippoApiVersion`                                                             | *Optional<? extends String>*                                                   | :heavy_minus_sign:                                                             | String used to pick a non-default API version to use                           | 2018-02-08                                                                     |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.GetCarrierRegistrationStatusResponse>](../../models/operations/GetCarrierRegistrationStatusResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
