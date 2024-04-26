# CustomsDeclarations
(*customsDeclarations()*)

## Overview

Customs declarations are relevant information, including one or multiple customs items, you need to provide for 
customs clearance for your international shipments.
<SchemaDefinition schemaRef="#/components/schemas/CustomsDeclaration"/>

### Available Operations

* [list](#list) - List all customs declarations
* [create](#create) - Create a new customs declaration
* [get](#get) - Retrieve a customs declaration

## list

Returns a a list of all customs declaration objects

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.ListCustomsDeclarationsRequest;
import com.shippo.shippo_java_sdk.models.operations.ListCustomsDeclarationsResponse;
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

            ListCustomsDeclarationsResponse res = sdk.customsDeclarations().list()
                .page(1L)
                .results(5L)
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.customsDeclarationPaginatedList().isPresent()) {
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

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `page`                                                        | *Optional<? extends Long>*                                    | :heavy_minus_sign:                                            | The page number you want to select                            |                                                               |
| `results`                                                     | *Optional<? extends Long>*                                    | :heavy_minus_sign:                                            | The number of results to return per page (max 100, default 5) |                                                               |
| `shippoApiVersion`                                            | *Optional<? extends String>*                                  | :heavy_minus_sign:                                            | String used to pick a non-default API version to use          | 2018-02-08                                                    |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.ListCustomsDeclarationsResponse>](../../models/operations/ListCustomsDeclarationsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## create

Creates a new customs declaration object

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.AddressImporter;
import com.shippo.shippo_java_sdk.models.components.CustomsDeclarationB13AFilingOptionEnum;
import com.shippo.shippo_java_sdk.models.components.CustomsDeclarationContentsTypeEnum;
import com.shippo.shippo_java_sdk.models.components.CustomsDeclarationCreateRequest;
import com.shippo.shippo_java_sdk.models.components.CustomsDeclarationEelPfcEnum;
import com.shippo.shippo_java_sdk.models.components.CustomsDeclarationIncotermEnum;
import com.shippo.shippo_java_sdk.models.components.CustomsDeclarationNonDeliveryOptionEnum;
import com.shippo.shippo_java_sdk.models.components.CustomsItemCreateRequest;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.components.WeightUnitEnum;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.CreateCustomsDeclarationRequest;
import com.shippo.shippo_java_sdk.models.operations.CreateCustomsDeclarationResponse;
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

            CreateCustomsDeclarationResponse res = sdk.customsDeclarations().create()
                .shippoApiVersion("2018-02-08")
                .customsDeclarationCreateRequest(CustomsDeclarationCreateRequest.builder()
                    .certify(true)
                    .certifySigner("Shawn Ippotle")
                    .contentsType(CustomsDeclarationContentsTypeEnum.MERCHANDISE)
                    .nonDeliveryOption(CustomsDeclarationNonDeliveryOptionEnum.ABANDON)
                    .items(java.util.List.of(
                            CustomsItemCreateRequest.builder()
                                .description("T-Shirt")
                                .massUnit(WeightUnitEnum.LB)
                                .netWeight("5")
                                .originCountry("<value>")
                                .quantity(20L)
                                .valueAmount("200")
                                .valueCurrency("USD")
                                .metadata("Order ID \"123454\"")
                                .skuCode("HM-123")
                                .build()))
                    .contentsExplanation("T-Shirt purchase")
                    .eelPfc(CustomsDeclarationEelPfcEnum.NOEEI3037_A)
                    .incoterm(CustomsDeclarationIncotermEnum.DDP)
                    .invoice("#123123")
                    .metadata("Order ID #123123")
                    .test(true)
                    .build())
                .call();

            if (res.customsDeclaration().isPresent()) {
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
| `customsDeclarationCreateRequest`                                                                                                                              | [Optional<? extends com.shippo.shippo_java_sdk.models.components.CustomsDeclarationCreateRequest>](../../models/components/CustomsDeclarationCreateRequest.md) | :heavy_minus_sign:                                                                                                                                             | CustomsDeclaration details.                                                                                                                                    |                                                                                                                                                                |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.CreateCustomsDeclarationResponse>](../../models/operations/CreateCustomsDeclarationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## get

Returns an existing customs declaration using an object ID

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.GetCustomsDeclarationRequest;
import com.shippo.shippo_java_sdk.models.operations.GetCustomsDeclarationResponse;
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

            GetCustomsDeclarationResponse res = sdk.customsDeclarations().get()
                .customsDeclarationId("<value>")
                .page(1L)
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.customsDeclaration().isPresent()) {
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
| `customsDeclarationId`                               | *String*                                             | :heavy_check_mark:                                   | Object ID of the customs declaration                 |                                                      |
| `page`                                               | *Optional<? extends Long>*                           | :heavy_minus_sign:                                   | The page number you want to select                   |                                                      |
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.GetCustomsDeclarationResponse>](../../models/operations/GetCustomsDeclarationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
