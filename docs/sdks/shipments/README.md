# Shipments
(*shipments()*)

## Overview

A shipment is the act of transporting goods. A shipment object contains **to** and **from** addresses, and the parcel details that you are shipping. You can use the shipment object to retrieve shipping rates and purchase a shipping label.
<SchemaDefinition schemaRef="#/components/schemas/Shipment"/>
 
# Shipment Extras
The following values are supported for the `extra` field of the shipment object.
<SchemaDefinition schemaRef="#/components/schemas/ShipmentExtra"/>

### Available Operations

* [list](#list) - List all shipments
* [create](#create) - Create a new shipment
* [get](#get) - Retrieve a shipment

## list

Returns a list of all shipment objects.<br><br>
In order to filter results, you must use the below path parameters. 
A maximum date range of 90 days is permitted. 
Provided dates should be ISO 8601 UTC dates (timezone offsets are currently not supported).<br><br>

Optional path parameters:<br>
  `object_created_gt`- object(s) created greater than a provided date time<br>
  `object_created_gte` - object(s) created greater than or equal to a provided date time<br>
  `object_created_lt` - object(s) created less than a provided date time<br>
  `object_created_lte` - object(s) created less than or equal to a provided date time<br>

  Date format examples:<br>
    `2017-01-01`<br>
    `2017-01-01T03:30:30` or `2017-01-01T03:30:30.5`<br>
    `2017-01-01T03:30:30Z`<br><br>

  Example URL:<br>
    `https://api.goshippo.com/shipments/?object_created_gte=2017-01-01T00:00:30&object_created_lt=2017-04-01T00:00:30`

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

            ListShipmentsResponse res = sdk.shipments().list()
                .page(1L)
                .results(25L)
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.shipmentPaginatedList().isPresent()) {
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
| `page`                                               | *Optional<? extends Long>*                           | :heavy_minus_sign:                                   | The page number you want to select                   |                                                      |
| `results`                                            | *Optional<? extends Long>*                           | :heavy_minus_sign:                                   | The number of results to return per page (max 100)   |                                                      |
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.ListShipmentsResponse>](../../models/operations/ListShipmentsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## create

Creates a new shipment object.

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

            CreateShipmentResponse res = sdk.shipments().create()
                .shippoApiVersion("2018-02-08")
                .shipmentCreateRequest(ShipmentCreateRequest.builder()
                    .addressFrom(AddressFrom.of(AddressCreateRequest.builder()
                                .country("US")
                                .name("Shwan Ippotle")
                                .company("Shippo")
                                .street1("215 Clayton St.")
                                .street3("")
                                .streetNo("")
                                .city("San Francisco")
                                .state("CA")
                                .zip("94117")
                                .phone("+1 555 341 9393")
                                .email("shippotle@shippo.com")
                                .isResidential(true)
                                .metadata("Customer ID 123456")
                                .validate(true)
                                .build()))
                    .addressTo(AddressTo.of(AddressCreateRequest.builder()
                                .country("US")
                                .name("Shwan Ippotle")
                                .company("Shippo")
                                .street1("215 Clayton St.")
                                .street3("")
                                .streetNo("")
                                .city("San Francisco")
                                .state("CA")
                                .zip("94117")
                                .phone("+1 555 341 9393")
                                .email("shippotle@shippo.com")
                                .isResidential(true)
                                .metadata("Customer ID 123456")
                                .validate(true)
                                .build()))
                    .parcels(java.util.List.of(
                            Parcels.of(ParcelCreateFromTemplateRequest.builder()
                                    .massUnit(WeightUnitEnum.LB)
                                    .weight("1")
                                    .template(ParcelTemplateEnumSet.of(AramexAustraliaParcelTemplate.FASTWAY_AUSTRALIA_SATCHEL_A3))
                                    .extra(ParcelExtra.builder()
                                        .cod(Cod.builder()
                                            .amount("5.5")
                                            .currency("USD")
                                            .paymentMethod(PaymentMethod.CASH)
                                            .build())
                                        .insurance(ParcelInsurance.builder()
                                            .amount("5.5")
                                            .content("Laptop")
                                            .currency("USD")
                                            .provider(ParcelInsuranceProvider.UPS)
                                            .build())
                                        .build())
                                    .metadata("Customer ID 123456")
                                    .build())))
                    .extra(ShipmentExtra.builder()
                        .accountsReceivableCustomerAccount(UPSReferenceFields.builder()
                            .prefix("ABC")
                            .value("value")
                            .refSort(1L)
                            .build())
                        .appropriationNumber(UPSReferenceFields.builder()
                            .prefix("ABC")
                            .value("value")
                            .refSort(1L)
                            .build())
                        .billOfLadingNumber(UPSReferenceFields.builder()
                            .prefix("ABC")
                            .value("value")
                            .refSort(1L)
                            .build())
                        .cod(Cod.builder()
                            .amount("5.5")
                            .currency("USD")
                            .paymentMethod(PaymentMethod.CASH)
                            .build())
                        .codNumber(UPSReferenceFields.builder()
                            .prefix("ABC")
                            .value("value")
                            .refSort(1L)
                            .build())
                        .customerReference(CustomerReference.builder()
                            .refSort(1L)
                            .build())
                        .dealerOrderNumber(UPSReferenceFields.builder()
                            .prefix("ABC")
                            .value("value")
                            .refSort(1L)
                            .build())
                        .deptNumber(DepartmentNumber.builder()
                            .refSort(3L)
                            .build())
                        .fdaProductCode(UPSReferenceFields.builder()
                            .prefix("ABC")
                            .value("value")
                            .refSort(1L)
                            .build())
                        .insurance(Insurance.builder()
                            .amount("5.5")
                            .currency("USD")
                            .build())
                        .invoiceNumber(InvoiceNumber.builder()
                            .refSort(2L)
                            .build())
                        .manifestNumber(UPSReferenceFields.builder()
                            .prefix("ABC")
                            .value("value")
                            .refSort(1L)
                            .build())
                        .modelNumber(UPSReferenceFields.builder()
                            .prefix("ABC")
                            .value("value")
                            .refSort(1L)
                            .build())
                        .partNumber(UPSReferenceFields.builder()
                            .prefix("ABC")
                            .value("value")
                            .refSort(1L)
                            .build())
                        .poNumber(PoNumber.builder()
                            .refSort(2L)
                            .build())
                        .productionCode(UPSReferenceFields.builder()
                            .prefix("ABC")
                            .value("value")
                            .refSort(1L)
                            .build())
                        .purchaseRequestNumber(UPSReferenceFields.builder()
                            .prefix("ABC")
                            .value("value")
                            .refSort(1L)
                            .build())
                        .rmaNumber(RmaNumber.builder()
                            .refSort(1L)
                            .build())
                        .salespersonNumber(UPSReferenceFields.builder()
                            .prefix("ABC")
                            .value("value")
                            .refSort(1L)
                            .build())
                        .serialNumber(UPSReferenceFields.builder()
                            .prefix("ABC")
                            .value("value")
                            .refSort(1L)
                            .build())
                        .storeNumber(UPSReferenceFields.builder()
                            .prefix("ABC")
                            .value("value")
                            .refSort(1L)
                            .build())
                        .transactionReferenceNumber(UPSReferenceFields.builder()
                            .prefix("ABC")
                            .value("value")
                            .refSort(1L)
                            .build())
                        .build())
                    .metadata("Customer ID 123456")
                    .shipmentDate("2021-03-22T12:00:00Z")
                    .addressReturn(AddressReturn.of(AddressCreateRequest.builder()
                                .country("US")
                                .name("Shwan Ippotle")
                                .company("Shippo")
                                .street1("215 Clayton St.")
                                .street3("")
                                .streetNo("")
                                .city("San Francisco")
                                .state("CA")
                                .zip("94117")
                                .phone("+1 555 341 9393")
                                .email("shippotle@shippo.com")
                                .isResidential(true)
                                .metadata("Customer ID 123456")
                                .validate(true)
                                .build()))
                    .customsDeclaration(ShipmentCreateRequestCustomsDeclaration.of(CustomsDeclarationCreateRequest.builder()
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
                                            .hsCode("0901.21")
                                            .build()))
                                .nonDeliveryOption(CustomsDeclarationNonDeliveryOptionEnum.RETURN_)
                                .b13aFilingOption(CustomsDeclarationB13AFilingOptionEnum.FILED_ELECTRONICALLY)
                                .contentsExplanation("T-Shirt purchase")
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
                                .build()))
                    .carrierAccounts(java.util.List.of(
                        "065a4a8c10d24a34ab932163a1b87f52",
                        "73f706f4bdb94b54a337563840ce52b0"))
                    .build())
                .call();

            if (res.shipment().isPresent()) {
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

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                | Example                                                                                                    |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `shippoApiVersion`                                                                                         | *Optional<? extends String>*                                                                               | :heavy_minus_sign:                                                                                         | String used to pick a non-default API version to use                                                       | 2018-02-08                                                                                                 |
| `shipmentCreateRequest`                                                                                    | [com.shippo.sdk.models.components.ShipmentCreateRequest](../../models/components/ShipmentCreateRequest.md) | :heavy_check_mark:                                                                                         | Shipment details and contact info.                                                                         |                                                                                                            |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.CreateShipmentResponse>](../../models/operations/CreateShipmentResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## get

Returns an existing shipment using an object ID

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

            GetShipmentResponse res = sdk.shipments().get()
                .shipmentId("<value>")
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.shipment().isPresent()) {
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
| `shipmentId`                                         | *String*                                             | :heavy_check_mark:                                   | Object ID of the shipment to update                  |                                                      |
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.GetShipmentResponse>](../../models/operations/GetShipmentResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
