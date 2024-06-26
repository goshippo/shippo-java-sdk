# Batches
(*batches()*)

## Overview

A batch is a technique for creating multiple labels at once. Use the  batch object to create and purchase many shipments in two API calls. After creating the batch, retrieve the batch to verify that all shipments are valid. You can add and remove shipments after you have created the batch. When all shipments are valid you can purchase the batch and retrieve all the shipping labels.
<SchemaDefinition schemaRef="#/components/schemas/Batch"/>

# Batch Shipment
The batch shipment object is a wrapper around a shipment object, which include shipment-specific information 
for batch processing.

Note: batch shipments can only be created on the batch endpoint, either when creating a batch object or by through 
the `/batches/{BATCH_OBJECT_ID}/add_shipments` endpoint
<SchemaDefinition schemaRef="#/components/schemas/BatchShipment"/>

### Available Operations

* [create](#create) - Create a batch
* [get](#get) - Retrieve a batch
* [addShipments](#addshipments) - Add shipments to a batch
* [purchase](#purchase) - Purchase a batch
* [removeShipments](#removeshipments) - Remove shipments from a batch

## create

Creates a new batch object for purchasing shipping labels for many shipments at once. Batches are created asynchronously. This means that the API response won't include your batch shipments yet. You need to retrieve the batch later to verify that all batch shipments are valid.

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

            CreateBatchResponse res = sdk.batches().create()
                .shippoApiVersion("2018-02-08")
                .batchCreateRequest(BatchCreateRequest.builder()
                    .defaultCarrierAccount("078870331023437cb917f5187429b093")
                    .defaultServicelevelToken("usps_priority")
                    .batchShipments(java.util.List.of(
                            BatchShipmentCreateRequest.builder()
                                .shipment(ShipmentCreateRequest.builder()
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
                                .carrierAccount("a4391cd4ab974f478f55dc08b5c8e3b3")
                                .metadata("SHIPMENT #1")
                                .servicelevelToken("fedex_ground")
                                .build()))
                    .labelFiletype(LabelFileTypeEnum.PDF4X6)
                    .metadata("BATCH #1")
                    .build())
                .call();

            if (res.batch().isPresent()) {
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

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          | Example                                                                                              |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `shippoApiVersion`                                                                                   | *Optional<? extends String>*                                                                         | :heavy_minus_sign:                                                                                   | String used to pick a non-default API version to use                                                 | 2018-02-08                                                                                           |
| `batchCreateRequest`                                                                                 | [com.shippo.sdk.models.components.BatchCreateRequest](../../models/components/BatchCreateRequest.md) | :heavy_check_mark:                                                                                   | Batch details.                                                                                       |                                                                                                      |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.CreateBatchResponse>](../../models/operations/CreateBatchResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## get

Returns a batch using an object ID. <br> Batch shipments are displayed 100 at a time.  You can iterate 
through each `page` using the `?page= query` parameter.  You can also filter based on batch shipment 
status, for example, by passing a query param like `?object_results=creation_failed`. <br> 
For more details on filtering results, see our guide on <a href="https://docs.goshippo.com/docs/api_concepts/filtering/" target="blank"> filtering</a>.

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

            GetBatchResponse res = sdk.batches().get()
                .batchId("<value>")
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.batch().isPresent()) {
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
| `batchId`                                            | *String*                                             | :heavy_check_mark:                                   | Object ID of the batch                               |                                                      |
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.GetBatchResponse>](../../models/operations/GetBatchResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## addShipments

Adds batch shipments to an existing batch.

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

            AddShipmentsToBatchResponse res = sdk.batches().addShipments()
                .batchId("<value>")
                .shippoApiVersion("2018-02-08")
                .requestBody(java.util.List.of(
                    BatchShipmentCreateRequest.builder()
                        .shipment(ShipmentCreateRequest.builder()
                                .addressFrom(AddressFrom.of("d799c2679e644279b59fe661ac8fa488"))
                                .addressTo(AddressTo.of("d799c2679e644279b59fe661ac8fa489"))
                                .parcels(java.util.List.of(
                                        Parcels.of(ParcelCreateRequest.builder()
                                                .massUnit(WeightUnitEnum.LB)
                                                .weight("1")
                                                .distanceUnit(DistanceUnitEnum.IN)
                                                .height("1")
                                                .length("1")
                                                .width("1")
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
                                .addressReturn(AddressReturn.of("d799c2679e644279b59fe661ac8fa488"))
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
                        .carrierAccount("a4391cd4ab974f478f55dc08b5c8e3b3")
                        .metadata("SHIPMENT #1")
                        .servicelevelToken("fedex_ground")
                        .build()))
                .call();

            if (res.batch().isPresent()) {
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

| Parameter                                                                                                                  | Type                                                                                                                       | Required                                                                                                                   | Description                                                                                                                | Example                                                                                                                    |
| -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------- |
| `batchId`                                                                                                                  | *String*                                                                                                                   | :heavy_check_mark:                                                                                                         | Object ID of the batch                                                                                                     |                                                                                                                            |
| `shippoApiVersion`                                                                                                         | *Optional<? extends String>*                                                                                               | :heavy_minus_sign:                                                                                                         | String used to pick a non-default API version to use                                                                       | 2018-02-08                                                                                                                 |
| `requestBody`                                                                                                              | List<[com.shippo.sdk.models.components.BatchShipmentCreateRequest](../../models/components/BatchShipmentCreateRequest.md)> | :heavy_check_mark:                                                                                                         | Array of shipments to add to the batch                                                                                     |                                                                                                                            |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.AddShipmentsToBatchResponse>](../../models/operations/AddShipmentsToBatchResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## purchase

Purchases an existing batch with a status of `VALID`. 
Once you send a POST request to the purchase endpoint the batch status will change to `PURCHASING`. 
When all the shipments are purchased, the status will change to `PURCHASED` and you will receive a 
`batch_purchased` webhook indicating that the batch has been purchased

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

            PurchaseBatchResponse res = sdk.batches().purchase()
                .batchId("<value>")
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.batch().isPresent()) {
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
| `batchId`                                            | *String*                                             | :heavy_check_mark:                                   | Object ID of the batch                               |                                                      |
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.PurchaseBatchResponse>](../../models/operations/PurchaseBatchResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## removeShipments

Removes shipments from an existing batch shipment.

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

            RemoveShipmentsFromBatchResponse res = sdk.batches().removeShipments()
                .batchId("<value>")
                .shippoApiVersion("2018-02-08")
                .requestBody(java.util.List.of(
                    "<value>"))
                .call();

            if (res.batch().isPresent()) {
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

| Parameter                                              | Type                                                   | Required                                               | Description                                            | Example                                                |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `batchId`                                              | *String*                                               | :heavy_check_mark:                                     | Object ID of the batch                                 |                                                        |
| `shippoApiVersion`                                     | *Optional<? extends String>*                           | :heavy_minus_sign:                                     | String used to pick a non-default API version to use   | 2018-02-08                                             |
| `requestBody`                                          | List<*String*>                                         | :heavy_check_mark:                                     | Array of shipments object ids to remove from the batch |                                                        |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.RemoveShipmentsFromBatchResponse>](../../models/operations/RemoveShipmentsFromBatchResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
