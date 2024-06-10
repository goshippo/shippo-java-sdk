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

            ListCustomsDeclarationsResponse res = sdk.customsDeclarations().list()
                .page(1L)
                .results(5L)
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.customsDeclarationPaginatedList().isPresent()) {
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

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `page`                                                        | *Optional<? extends Long>*                                    | :heavy_minus_sign:                                            | The page number you want to select                            |                                                               |
| `results`                                                     | *Optional<? extends Long>*                                    | :heavy_minus_sign:                                            | The number of results to return per page (max 100, default 5) |                                                               |
| `shippoApiVersion`                                            | *Optional<? extends String>*                                  | :heavy_minus_sign:                                            | String used to pick a non-default API version to use          | 2018-02-08                                                    |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.ListCustomsDeclarationsResponse>](../../models/operations/ListCustomsDeclarationsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## create

Creates a new customs declaration object

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

            CreateCustomsDeclarationResponse res = sdk.customsDeclarations().create()
                .shippoApiVersion("2018-02-08")
                .customsDeclarationCreateRequest(CustomsDeclarationCreateRequest.builder()
                    .certify(true)
                    .certifySigner("Shawn Ippotle")
                    .contentsType(CustomsDeclarationContentsTypeEnum.MERCHANDISE)
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
                    .nonDeliveryOption(CustomsDeclarationNonDeliveryOptionEnum.RETURN_)
                    .b13aFilingOption(CustomsDeclarationB13AFilingOptionEnum.FILED_ELECTRONICALLY)
                    .contentsExplanation("T-Shirt purchase")
                    .invoice("#123123")
                    .metadata("Order ID #123123")
                    .addressImporter(AddressImporter.builder()
                        .name("Shwan Ippotle")
                        .company("Shippo")
                        .street1("Blumenstraße")
                        .street3("")
                        .streetNo("22")
                        .city("München")
                        .state("CA")
                        .zip("80331")
                        .country("DE")
                        .phone("80331")
                        .email("shippotle@shippo.com")
                        .isResidential(true)
                        .build())
                    .eelPfc(CustomsDeclarationEelPfcEnum.NOEEI3037_A)
                    .incoterm(CustomsDeclarationIncotermEnum.DDP)
                    .test(true)
                    .build())
                .call();

            if (res.customsDeclaration().isPresent()) {
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

| Parameter                                                                                                                      | Type                                                                                                                           | Required                                                                                                                       | Description                                                                                                                    | Example                                                                                                                        |
| ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------ |
| `shippoApiVersion`                                                                                                             | *Optional<? extends String>*                                                                                                   | :heavy_minus_sign:                                                                                                             | String used to pick a non-default API version to use                                                                           | 2018-02-08                                                                                                                     |
| `customsDeclarationCreateRequest`                                                                                              | [com.shippo.sdk.models.components.CustomsDeclarationCreateRequest](../../models/components/CustomsDeclarationCreateRequest.md) | :heavy_check_mark:                                                                                                             | CustomsDeclaration details.                                                                                                    |                                                                                                                                |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.CreateCustomsDeclarationResponse>](../../models/operations/CreateCustomsDeclarationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## get

Returns an existing customs declaration using an object ID

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

            GetCustomsDeclarationResponse res = sdk.customsDeclarations().get()
                .customsDeclarationId("<value>")
                .page(1L)
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.customsDeclaration().isPresent()) {
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
| `customsDeclarationId`                               | *String*                                             | :heavy_check_mark:                                   | Object ID of the customs declaration                 |                                                      |
| `page`                                               | *Optional<? extends Long>*                           | :heavy_minus_sign:                                   | The page number you want to select                   |                                                      |
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.GetCustomsDeclarationResponse>](../../models/operations/GetCustomsDeclarationResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
