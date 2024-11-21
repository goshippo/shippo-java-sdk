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
import com.shippo.sdk.models.operations.ListCustomsDeclarationsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

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
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `page`                                                                                                                                                             | *Optional\<Long>*                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                 | The page number you want to select                                                                                                                                 |                                                                                                                                                                    |
| `results`                                                                                                                                                          | *Optional\<Long>*                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                 | The number of results to return per page (max 100, default 5)                                                                                                      |                                                                                                                                                                    |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |

### Response

**[ListCustomsDeclarationsResponse](../../models/operations/ListCustomsDeclarationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## create

Creates a new customs declaration object

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.components.AddressImporter;
import com.shippo.sdk.models.components.CustomsDeclarationB13AFilingOptionEnum;
import com.shippo.sdk.models.components.CustomsDeclarationContentsTypeEnum;
import com.shippo.sdk.models.components.CustomsDeclarationCreateRequest;
import com.shippo.sdk.models.components.CustomsDeclarationCreateRequestAddress;
import com.shippo.sdk.models.components.CustomsDeclarationCreateRequestType;
import com.shippo.sdk.models.components.CustomsDeclarationEelPfcEnum;
import com.shippo.sdk.models.components.CustomsDeclarationIncotermEnum;
import com.shippo.sdk.models.components.CustomsDeclarationNonDeliveryOptionEnum;
import com.shippo.sdk.models.components.CustomsExporterIdentification;
import com.shippo.sdk.models.components.CustomsItemCreateRequest;
import com.shippo.sdk.models.components.CustomsTaxIdentification;
import com.shippo.sdk.models.components.CustomsTaxIdentificationType;
import com.shippo.sdk.models.components.DutiesPayor;
import com.shippo.sdk.models.components.WeightUnitEnum;
import com.shippo.sdk.models.operations.CreateCustomsDeclarationResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

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
                    .items(List.of(
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
                            .hsCode("0901.21")
                            .build()))
                    .nonDeliveryOption(CustomsDeclarationNonDeliveryOptionEnum.RETURN)
                    .b13aFilingOption(CustomsDeclarationB13AFilingOptionEnum.FILED_ELECTRONICALLY)
                    .contentsExplanation("T-Shirt purchase")
                    .dutiesPayor(DutiesPayor.builder()
                        .account("2323434543")
                        .type(CustomsDeclarationCreateRequestType.THIRD_PARTY)
                        .address(CustomsDeclarationCreateRequestAddress.builder()
                            .name("Patrick Kavanagh")
                            .zip("80331")
                            .country("DE")
                            .build())
                        .build())
                    .exporterIdentification(CustomsExporterIdentification.builder()
                        .eoriNumber("PL123456790ABCDE")
                        .taxId(CustomsTaxIdentification.builder()
                            .number("123456789")
                            .type(CustomsTaxIdentificationType.EIN)
                            .build())
                        .build())
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
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |
| `customsDeclarationCreateRequest`                                                                                                                                  | [CustomsDeclarationCreateRequest](../../models/components/CustomsDeclarationCreateRequest.md)                                                                      | :heavy_check_mark:                                                                                                                                                 | CustomsDeclaration details.                                                                                                                                        |                                                                                                                                                                    |

### Response

**[CreateCustomsDeclarationResponse](../../models/operations/CreateCustomsDeclarationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Returns an existing customs declaration using an object ID

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.operations.GetCustomsDeclarationResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        GetCustomsDeclarationResponse res = sdk.customsDeclarations().get()
                .customsDeclarationId("<id>")
                .page(1L)
                .shippoApiVersion("2018-02-08")
                .call();

        if (res.customsDeclaration().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `customsDeclarationId`                                                                                                                                             | *String*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | Object ID of the customs declaration                                                                                                                               |                                                                                                                                                                    |
| `page`                                                                                                                                                             | *Optional\<Long>*                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                 | The page number you want to select                                                                                                                                 |                                                                                                                                                                    |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |

### Response

**[GetCustomsDeclarationResponse](../../models/operations/GetCustomsDeclarationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |