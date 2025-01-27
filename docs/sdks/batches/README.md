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

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.AddressCreateRequest;
import com.goshippo.shippo_sdk.models.components.AddressFrom;
import com.goshippo.shippo_sdk.models.components.AddressImporter;
import com.goshippo.shippo_sdk.models.components.AddressReturn;
import com.goshippo.shippo_sdk.models.components.AddressTo;
import com.goshippo.shippo_sdk.models.components.BatchCreateRequest;
import com.goshippo.shippo_sdk.models.components.BatchShipmentCreateRequest;
import com.goshippo.shippo_sdk.models.components.Cod;
import com.goshippo.shippo_sdk.models.components.CustomerReference;
import com.goshippo.shippo_sdk.models.components.CustomsDeclarationB13AFilingOptionEnum;
import com.goshippo.shippo_sdk.models.components.CustomsDeclarationContentsTypeEnum;
import com.goshippo.shippo_sdk.models.components.CustomsDeclarationCreateRequest;
import com.goshippo.shippo_sdk.models.components.CustomsDeclarationCreateRequestAddress;
import com.goshippo.shippo_sdk.models.components.CustomsDeclarationCreateRequestType;
import com.goshippo.shippo_sdk.models.components.CustomsDeclarationEelPfcEnum;
import com.goshippo.shippo_sdk.models.components.CustomsDeclarationIncotermEnum;
import com.goshippo.shippo_sdk.models.components.CustomsDeclarationNonDeliveryOptionEnum;
import com.goshippo.shippo_sdk.models.components.CustomsExporterIdentification;
import com.goshippo.shippo_sdk.models.components.CustomsItemCreateRequest;
import com.goshippo.shippo_sdk.models.components.CustomsTaxIdentification;
import com.goshippo.shippo_sdk.models.components.CustomsTaxIdentificationType;
import com.goshippo.shippo_sdk.models.components.DepartmentNumber;
import com.goshippo.shippo_sdk.models.components.DistanceUnitEnum;
import com.goshippo.shippo_sdk.models.components.DutiesPayor;
import com.goshippo.shippo_sdk.models.components.Insurance;
import com.goshippo.shippo_sdk.models.components.InvoiceNumber;
import com.goshippo.shippo_sdk.models.components.LabelFileTypeEnum;
import com.goshippo.shippo_sdk.models.components.ParcelCreateRequest;
import com.goshippo.shippo_sdk.models.components.ParcelExtra;
import com.goshippo.shippo_sdk.models.components.ParcelInsurance;
import com.goshippo.shippo_sdk.models.components.ParcelInsuranceProvider;
import com.goshippo.shippo_sdk.models.components.Parcels;
import com.goshippo.shippo_sdk.models.components.PaymentMethod;
import com.goshippo.shippo_sdk.models.components.PoNumber;
import com.goshippo.shippo_sdk.models.components.RmaNumber;
import com.goshippo.shippo_sdk.models.components.ShipmentCreateRequest;
import com.goshippo.shippo_sdk.models.components.ShipmentCreateRequestCustomsDeclaration;
import com.goshippo.shippo_sdk.models.components.ShipmentExtra;
import com.goshippo.shippo_sdk.models.components.UPSReferenceFields;
import com.goshippo.shippo_sdk.models.components.WeightUnitEnum;
import com.goshippo.shippo_sdk.models.operations.CreateBatchResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        CreateBatchResponse res = sdk.batches().create()
                .shippoApiVersion("2018-02-08")
                .batchCreateRequest(BatchCreateRequest.builder()
                    .defaultCarrierAccount("078870331023437cb917f5187429b093")
                    .defaultServicelevelToken("usps_priority")
                    .batchShipments(List.of(
                        BatchShipmentCreateRequest.builder()
                            .shipment(ShipmentCreateRequest.builder()
                                .addressFrom(AddressFrom.of("d799c2679e644279b59fe661ac8fa488"))
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
                                .parcels(List.of(
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
                                        .build()),
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
                                        .build()),
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
                                            .build(),
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
                                            .build(),
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
                                    .build()))
                                .carrierAccounts(List.of(
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
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |
| `batchCreateRequest`                                                                                                                                               | [BatchCreateRequest](../../models/components/BatchCreateRequest.md)                                                                                                | :heavy_check_mark:                                                                                                                                                 | Batch details.                                                                                                                                                     |                                                                                                                                                                    |

### Response

**[CreateBatchResponse](../../models/operations/CreateBatchResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Returns a batch using an object ID. <br> Batch shipments are displayed 100 at a time.  You can iterate 
through each `page` using the `?page= query` parameter.  You can also filter based on batch shipment 
status, for example, by passing a query param like `?object_results=creation_failed`. <br> 
For more details on filtering results, see our guide on <a href="https://docs.goshippo.com/docs/api_concepts/filtering/" target="blank"> filtering</a>.

### Example Usage

```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.GetBatchResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        GetBatchResponse res = sdk.batches().get()
                .batchId("<id>")
                .page(1L)
                .results(5L)
                .shippoApiVersion("2018-02-08")
                .call();

        if (res.batch().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `batchId`                                                                                                                                                          | *String*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | Object ID of the batch                                                                                                                                             |                                                                                                                                                                    |
| `page`                                                                                                                                                             | *Optional\<Long>*                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                 | The page number you want to select                                                                                                                                 |                                                                                                                                                                    |
| `results`                                                                                                                                                          | *Optional\<Long>*                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                 | The number of results to return per page (max 100, default 5)                                                                                                      |                                                                                                                                                                    |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |

### Response

**[GetBatchResponse](../../models/operations/GetBatchResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## addShipments

Adds batch shipments to an existing batch.

### Example Usage

```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.AddressCreateRequest;
import com.goshippo.shippo_sdk.models.components.AddressFrom;
import com.goshippo.shippo_sdk.models.components.AddressImporter;
import com.goshippo.shippo_sdk.models.components.AddressReturn;
import com.goshippo.shippo_sdk.models.components.AddressTo;
import com.goshippo.shippo_sdk.models.components.BatchShipmentCreateRequest;
import com.goshippo.shippo_sdk.models.components.Cod;
import com.goshippo.shippo_sdk.models.components.CustomerReference;
import com.goshippo.shippo_sdk.models.components.CustomsDeclarationB13AFilingOptionEnum;
import com.goshippo.shippo_sdk.models.components.CustomsDeclarationContentsTypeEnum;
import com.goshippo.shippo_sdk.models.components.CustomsDeclarationCreateRequest;
import com.goshippo.shippo_sdk.models.components.CustomsDeclarationCreateRequestAddress;
import com.goshippo.shippo_sdk.models.components.CustomsDeclarationCreateRequestType;
import com.goshippo.shippo_sdk.models.components.CustomsDeclarationEelPfcEnum;
import com.goshippo.shippo_sdk.models.components.CustomsDeclarationIncotermEnum;
import com.goshippo.shippo_sdk.models.components.CustomsDeclarationNonDeliveryOptionEnum;
import com.goshippo.shippo_sdk.models.components.CustomsExporterIdentification;
import com.goshippo.shippo_sdk.models.components.CustomsTaxIdentification;
import com.goshippo.shippo_sdk.models.components.CustomsTaxIdentificationType;
import com.goshippo.shippo_sdk.models.components.DepartmentNumber;
import com.goshippo.shippo_sdk.models.components.DutiesPayor;
import com.goshippo.shippo_sdk.models.components.Insurance;
import com.goshippo.shippo_sdk.models.components.InvoiceNumber;
import com.goshippo.shippo_sdk.models.components.ParcelCreateFromTemplateRequest;
import com.goshippo.shippo_sdk.models.components.ParcelExtra;
import com.goshippo.shippo_sdk.models.components.ParcelInsurance;
import com.goshippo.shippo_sdk.models.components.ParcelInsuranceProvider;
import com.goshippo.shippo_sdk.models.components.ParcelTemplateDHLeCommerceEnum;
import com.goshippo.shippo_sdk.models.components.ParcelTemplateDPDUKEnum;
import com.goshippo.shippo_sdk.models.components.ParcelTemplateEnumSet;
import com.goshippo.shippo_sdk.models.components.ParcelTemplateUSPSEnum;
import com.goshippo.shippo_sdk.models.components.Parcels;
import com.goshippo.shippo_sdk.models.components.PaymentMethod;
import com.goshippo.shippo_sdk.models.components.PoNumber;
import com.goshippo.shippo_sdk.models.components.RmaNumber;
import com.goshippo.shippo_sdk.models.components.ShipmentCreateRequest;
import com.goshippo.shippo_sdk.models.components.ShipmentCreateRequestCustomsDeclaration;
import com.goshippo.shippo_sdk.models.components.ShipmentExtra;
import com.goshippo.shippo_sdk.models.components.UPSReferenceFields;
import com.goshippo.shippo_sdk.models.components.WeightUnitEnum;
import com.goshippo.shippo_sdk.models.operations.AddShipmentsToBatchResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        AddShipmentsToBatchResponse res = sdk.batches().addShipments()
                .batchId("<id>")
                .shippoApiVersion("2018-02-08")
                .requestBody(List.of(
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
                            .addressTo(AddressTo.of("d799c2679e644279b59fe661ac8fa489"))
                            .parcels(List.of(
                                Parcels.of("<value>"),
                                Parcels.of("<value>"),
                                Parcels.of(ParcelCreateFromTemplateRequest.builder()
                                    .massUnit(WeightUnitEnum.LB)
                                    .weight("1")
                                    .template(ParcelTemplateEnumSet.of(ParcelTemplateUSPSEnum.USPS_SMALL_FLAT_RATE_ENVELOPE))
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
                            .customsDeclaration(ShipmentCreateRequestCustomsDeclaration.of("adcfdddf8ec64b84ad22772bce3ea37a"))
                            .carrierAccounts(List.of(
                                "065a4a8c10d24a34ab932163a1b87f52",
                                "73f706f4bdb94b54a337563840ce52b0"))
                            .build())
                        .carrierAccount("a4391cd4ab974f478f55dc08b5c8e3b3")
                        .metadata("SHIPMENT #1")
                        .servicelevelToken("fedex_ground")
                        .build(),
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
                            .parcels(List.of(
                                Parcels.of(ParcelCreateFromTemplateRequest.builder()
                                    .massUnit(WeightUnitEnum.LB)
                                    .weight("1")
                                    .template(ParcelTemplateEnumSet.of(ParcelTemplateDPDUKEnum.DPDUK_EXPRESS_PAK))
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
                                    .build()),
                                Parcels.of(ParcelCreateFromTemplateRequest.builder()
                                    .massUnit(WeightUnitEnum.LB)
                                    .weight("1")
                                    .template(ParcelTemplateEnumSet.of(ParcelTemplateDHLeCommerceEnum.DH_LE_C_IRREGULAR))
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
                                .items(List.of(
                                ))
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
                                .build()))
                            .carrierAccounts(List.of(
                                "065a4a8c10d24a34ab932163a1b87f52",
                                "73f706f4bdb94b54a337563840ce52b0"))
                            .build())
                        .carrierAccount("a4391cd4ab974f478f55dc08b5c8e3b3")
                        .metadata("SHIPMENT #1")
                        .servicelevelToken("fedex_ground")
                        .build(),
                    BatchShipmentCreateRequest.builder()
                        .shipment(ShipmentCreateRequest.builder()
                            .addressFrom(AddressFrom.of("d799c2679e644279b59fe661ac8fa488"))
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
                            .parcels(List.of(
                            ))
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
                            .customsDeclaration(ShipmentCreateRequestCustomsDeclaration.of("adcfdddf8ec64b84ad22772bce3ea37a"))
                            .carrierAccounts(List.of(
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
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `batchId`                                                                                                                                                          | *String*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | Object ID of the batch                                                                                                                                             |                                                                                                                                                                    |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |
| `requestBody`                                                                                                                                                      | List\<[BatchShipmentCreateRequest](../../models/components/BatchShipmentCreateRequest.md)>                                                                         | :heavy_check_mark:                                                                                                                                                 | Array of shipments to add to the batch                                                                                                                             |                                                                                                                                                                    |

### Response

**[AddShipmentsToBatchResponse](../../models/operations/AddShipmentsToBatchResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## purchase

Purchases an existing batch with a status of `VALID`. 
Once you send a POST request to the purchase endpoint the batch status will change to `PURCHASING`. 
When all the shipments are purchased, the status will change to `PURCHASED` and you will receive a 
`batch_purchased` webhook indicating that the batch has been purchased

### Example Usage

```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.PurchaseBatchResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        PurchaseBatchResponse res = sdk.batches().purchase()
                .batchId("<id>")
                .shippoApiVersion("2018-02-08")
                .call();

        if (res.batch().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `batchId`                                                                                                                                                          | *String*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | Object ID of the batch                                                                                                                                             |                                                                                                                                                                    |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |

### Response

**[PurchaseBatchResponse](../../models/operations/PurchaseBatchResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeShipments

Removes shipments from an existing batch shipment.

### Example Usage

```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.RemoveShipmentsFromBatchResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        RemoveShipmentsFromBatchResponse res = sdk.batches().removeShipments()
                .batchId("<id>")
                .shippoApiVersion("2018-02-08")
                .requestBody(List.of(
                    "<value>",
                    "<value>",
                    "<value>"))
                .call();

        if (res.batch().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `batchId`                                                                                                                                                          | *String*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | Object ID of the batch                                                                                                                                             |                                                                                                                                                                    |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |
| `requestBody`                                                                                                                                                      | List\<*String*>                                                                                                                                                    | :heavy_check_mark:                                                                                                                                                 | Array of shipments object ids to remove from the batch                                                                                                             |                                                                                                                                                                    |

### Response

**[RemoveShipmentsFromBatchResponse](../../models/operations/RemoveShipmentsFromBatchResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |