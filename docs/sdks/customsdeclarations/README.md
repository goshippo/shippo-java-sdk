# CustomsDeclarations

## Overview

Customs declarations are relevant information, including one or multiple customs items, you need to provide for 
customs clearance for your international shipments.

### Available Operations

* [list](#list) - List all customs declarations
* [create](#create) - Create a new customs declaration
* [get](#get) - Retrieve a customs declaration

## list

Returns a list of all customs declaration objects

### Example Usage

<!-- UsageSnippet language="java" operationID="ListCustomsDeclarations" method="get" path="/customs/declarations" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.ListCustomsDeclarationsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        ListCustomsDeclarationsResponse res = sdk.customsDeclarations().list()
                .page(1L)
                .results(5L)
                .call();

        if (res.customsDeclarationPaginatedList().isPresent()) {
            System.out.println(res.customsDeclarationPaginatedList().get());
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `page`                                                        | *Optional\<Long>*                                             | :heavy_minus_sign:                                            | The page number you want to select                            |
| `results`                                                     | *Optional\<Long>*                                             | :heavy_minus_sign:                                            | The number of results to return per page (max 100, default 5) |

### Response

**[ListCustomsDeclarationsResponse](../../models/operations/ListCustomsDeclarationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## create

Creates a new customs declaration object

### Example Usage

<!-- UsageSnippet language="java" operationID="CreateCustomsDeclaration" method="post" path="/customs/declarations" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.*;
import com.goshippo.shippo_sdk.models.operations.CreateCustomsDeclarationResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        CustomsDeclarationCreateRequest req = CustomsDeclarationCreateRequest.builder()
                .certify(true)
                .certifySigner("Shawn Ippotle")
                .contentsType(CustomsDeclarationContentsTypeEnum.MERCHANDISE)
                .items(List.of())
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
                .build();

        CreateCustomsDeclarationResponse res = sdk.customsDeclarations().create()
                .request(req)
                .call();

        if (res.customsDeclaration().isPresent()) {
            System.out.println(res.customsDeclaration().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [CustomsDeclarationCreateRequest](../../models/shared/CustomsDeclarationCreateRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[CreateCustomsDeclarationResponse](../../models/operations/CreateCustomsDeclarationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Returns an existing customs declaration using an object ID

### Example Usage

<!-- UsageSnippet language="java" operationID="GetCustomsDeclaration" method="get" path="/customs/declarations/{CustomsDeclarationId}" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.GetCustomsDeclarationResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        GetCustomsDeclarationResponse res = sdk.customsDeclarations().get()
                .customsDeclarationId("<id>")
                .page(1L)
                .call();

        if (res.customsDeclaration().isPresent()) {
            System.out.println(res.customsDeclaration().get());
        }
    }
}
```

### Parameters

| Parameter                            | Type                                 | Required                             | Description                          |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `customsDeclarationId`               | *String*                             | :heavy_check_mark:                   | Object ID of the customs declaration |
| `page`                               | *Optional\<Long>*                    | :heavy_minus_sign:                   | The page number you want to select   |

### Response

**[GetCustomsDeclarationResponse](../../models/operations/GetCustomsDeclarationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |