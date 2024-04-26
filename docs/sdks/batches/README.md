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

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.AddressCreateRequest;
import com.shippo.shippo_java_sdk.models.components.Alcohol;
import com.shippo.shippo_java_sdk.models.components.AncillaryEndorsement;
import com.shippo.shippo_java_sdk.models.components.BatchCreateRequest;
import com.shippo.shippo_java_sdk.models.components.BatchShipmentBase;
import com.shippo.shippo_java_sdk.models.components.Billing;
import com.shippo.shippo_java_sdk.models.components.Cod;
import com.shippo.shippo_java_sdk.models.components.CustomerReference;
import com.shippo.shippo_java_sdk.models.components.DangerousGoodsBiologicalMaterial;
import com.shippo.shippo_java_sdk.models.components.DangerousGoodsCode;
import com.shippo.shippo_java_sdk.models.components.DangerousGoodsLithiumBatteries;
import com.shippo.shippo_java_sdk.models.components.DangerousGoodsObject;
import com.shippo.shippo_java_sdk.models.components.DepartmentNumber;
import com.shippo.shippo_java_sdk.models.components.DistanceUnitEnum;
import com.shippo.shippo_java_sdk.models.components.DryIce;
import com.shippo.shippo_java_sdk.models.components.Insurance;
import com.shippo.shippo_java_sdk.models.components.InvoiceNumber;
import com.shippo.shippo_java_sdk.models.components.LabelFileTypeEnum;
import com.shippo.shippo_java_sdk.models.components.LasershipAttrs;
import com.shippo.shippo_java_sdk.models.components.ParcelCreateRequest;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateAramexAustraliaEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateCouriersPleaseEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateDHLeCommerceEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateDPDUKEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateFedExEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateUPSEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateUSPSEnum;
import com.shippo.shippo_java_sdk.models.components.PaymentMethod;
import com.shippo.shippo_java_sdk.models.components.PoNumber;
import com.shippo.shippo_java_sdk.models.components.PreferredDeliveryTimeframe;
import com.shippo.shippo_java_sdk.models.components.Provider;
import com.shippo.shippo_java_sdk.models.components.RecipientType;
import com.shippo.shippo_java_sdk.models.components.ReturnServiceType;
import com.shippo.shippo_java_sdk.models.components.RmaNumber;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.components.ShipmentCreateRequest;
import com.shippo.shippo_java_sdk.models.components.ShipmentExtra;
import com.shippo.shippo_java_sdk.models.components.SignatureConfirmation;
import com.shippo.shippo_java_sdk.models.components.Type;
import com.shippo.shippo_java_sdk.models.components.WeightUnitEnum;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.CreateBatchRequest;
import com.shippo.shippo_java_sdk.models.operations.CreateBatchResponse;
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

            CreateBatchResponse res = sdk.batches().create()
                .shippoApiVersion("2018-02-08")
                .batchCreateRequest(BatchCreateRequest.builder()
                    .defaultCarrierAccount("078870331023437cb917f5187429b093")
                    .defaultServicelevelToken("usps_priority")
                    .batchShipments(java.util.List.of(
                            BatchShipmentBase.builder()
                                .shipment(ShipmentCreateRequest.builder()
                                        .addressFrom(AddressFrom.of(AddressCreateRequest.builder()
                                                    .country("US")
                                                    .name("Shwan Ippotle")
                                                    .company("Shippo")
                                                    .street1("215 Clayton St.")
                                                    .street2("<value>")
                                                    .street3("")
                                                    .streetNo("")
                                                    .city("San Francisco")
                                                    .state("CA")
                                                    .zip("94117")
                                                    .phone("+1 555 341 9393")
                                                    .email("shippotle@shippo.com")
                                                    .isResidential(true)
                                                    .metadata("Customer ID 123456")
                                                    .latitude(3229.97d)
                                                    .longitude(8946.95d)
                                                    .validate(true)
                                                    .build()))
                                        .addressTo(AddressTo.of(AddressCreateRequest.builder()
                                                    .country("US")
                                                    .name("Shwan Ippotle")
                                                    .company("Shippo")
                                                    .street1("215 Clayton St.")
                                                    .street2("<value>")
                                                    .street3("")
                                                    .streetNo("")
                                                    .city("San Francisco")
                                                    .state("CA")
                                                    .zip("94117")
                                                    .phone("+1 555 341 9393")
                                                    .email("shippotle@shippo.com")
                                                    .isResidential(true)
                                                    .metadata("Customer ID 123456")
                                                    .latitude(1856.93d)
                                                    .longitude(4157.14d)
                                                    .validate(true)
                                                    .build()))
                                        .parcels(java.util.List.of(
                                                new Object()))
                                        .customsDeclaration("adcfdddf8ec64b84ad22772bce3ea37a")
                                        .extra(ShipmentExtra.builder()
                                            .ancillaryEndorsement(AncillaryEndorsement.FORWARDING_SERVICE_REQUESTED)
                                            .authorityToLeave(false)
                                            .alcohol(Alcohol.builder()
                                                .containsAlcohol(false)
                                                .recipientType(RecipientType.CONSUMER)
                                                .build())
                                            .billing(Billing.builder()
                                                .account("13613808")
                                                .country("<value>")
                                                .participationCode("<value>")
                                                .type(Type.THIRD_PARTY_CONSIGNEE)
                                                .zip("60210-9530")
                                                .build())
                                            .bypassAddressValidation(false)
                                            .carbonNeutral(false)
                                            .carrierHubId("<value>")
                                            .carrierHubTravelTime(272321L)
                                            .cod(Cod.builder()
                                                .amount("5.5")
                                                .currency("USD")
                                                .paymentMethod(PaymentMethod.CASH)
                                                .build())
                                            .containerType("<value>")
                                            .criticalPullTime("<value>")
                                            .customerBranch("<value>")
                                            .customerReference(CustomerReference.builder()
                                                .prefix("<value>")
                                                .value("<value>")
                                                .build())
                                            .dangerousGoodsCode(DangerousGoodsCode.SIX)
                                            .dangerousGoods(DangerousGoodsObject.builder()
                                                .contains(false)
                                                .biologicalMaterial(DangerousGoodsBiologicalMaterial.builder()
                                                    .contains(false)
                                                    .build())
                                                .lithiumBatteries(DangerousGoodsLithiumBatteries.builder()
                                                    .contains(false)
                                                    .build())
                                                .build())
                                            .deliveryInstructions("<value>")
                                            .deptNumber(DepartmentNumber.builder()
                                                .prefix("<value>")
                                                .value("<value>")
                                                .build())
                                            .dryIce(DryIce.builder()
                                                .containsDryIce(false)
                                                .weight("<value>")
                                                .build())
                                            .fulfillmentCenter("<value>")
                                            .insurance(Insurance.builder()
                                                .amount("5.5")
                                                .content("<value>")
                                                .currency("USD")
                                                .provider(Provider.UPS)
                                                .build())
                                            .invoiceNumber(InvoiceNumber.builder()
                                                .prefix("<value>")
                                                .value("<value>")
                                                .build())
                                            .isReturn(false)
                                            .lasershipAttrs(LasershipAttrs.CONTROLLED_SUBSTANCE)
                                            .lasershipDeclaredValue("<value>")
                                            .poNumber(PoNumber.builder()
                                                .prefix("<value>")
                                                .value("<value>")
                                                .build())
                                            .preferredDeliveryTimeframe(PreferredDeliveryTimeframe.EIGHTEEN_MILLION_TWO_THOUSAND)
                                            .premium(false)
                                            .qrCodeRequested(false)
                                            .reference1("<value>")
                                            .reference2("<value>")
                                            .requestRetailRates(false)
                                            .returnServiceType(ReturnServiceType.ELECTRONIC_LABEL)
                                            .rmaNumber(RmaNumber.builder()
                                                .prefix("<value>")
                                                .value("<value>")
                                                .build())
                                            .saturdayDelivery(false)
                                            .signatureConfirmation(SignatureConfirmation.CERTIFIED)
                                            .build())
                                        .metadata("Customer ID 123456")
                                        .shipmentDate("2021-03-22T12:00:00Z")
                                        .addressReturn(AddressReturn.of(AddressCreateRequest.builder()
                                                    .country("US")
                                                    .name("Shwan Ippotle")
                                                    .company("Shippo")
                                                    .street1("215 Clayton St.")
                                                    .street2("<value>")
                                                    .street3("")
                                                    .streetNo("")
                                                    .city("San Francisco")
                                                    .state("CA")
                                                    .zip("94117")
                                                    .phone("+1 555 341 9393")
                                                    .email("shippotle@shippo.com")
                                                    .isResidential(true)
                                                    .metadata("Customer ID 123456")
                                                    .latitude(4522.24d)
                                                    .longitude(7395.06d)
                                                    .validate(true)
                                                    .build()))
                                        .async(false)
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
        } catch (com.shippo.shippo_java_sdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                            | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          | Example                                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `shippoApiVersion`                                                                                                                   | *Optional<? extends String>*                                                                                                         | :heavy_minus_sign:                                                                                                                   | String used to pick a non-default API version to use                                                                                 | 2018-02-08                                                                                                                           |
| `batchCreateRequest`                                                                                                                 | [Optional<? extends com.shippo.shippo_java_sdk.models.components.BatchCreateRequest>](../../models/components/BatchCreateRequest.md) | :heavy_minus_sign:                                                                                                                   | Batch details.                                                                                                                       |                                                                                                                                      |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.CreateBatchResponse>](../../models/operations/CreateBatchResponse.md)**
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

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.GetBatchRequest;
import com.shippo.shippo_java_sdk.models.operations.GetBatchResponse;
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

            GetBatchResponse res = sdk.batches().get()
                .batchId("<value>")
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.batch().isPresent()) {
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
| `batchId`                                            | *String*                                             | :heavy_check_mark:                                   | Object ID of the batch                               |                                                      |
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.GetBatchResponse>](../../models/operations/GetBatchResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## addShipments

Adds batch shipments to an existing batch.

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.AddressCreateRequest;
import com.shippo.shippo_java_sdk.models.components.Alcohol;
import com.shippo.shippo_java_sdk.models.components.AncillaryEndorsement;
import com.shippo.shippo_java_sdk.models.components.BatchShipmentBase;
import com.shippo.shippo_java_sdk.models.components.Billing;
import com.shippo.shippo_java_sdk.models.components.Cod;
import com.shippo.shippo_java_sdk.models.components.CustomerReference;
import com.shippo.shippo_java_sdk.models.components.DangerousGoodsBiologicalMaterial;
import com.shippo.shippo_java_sdk.models.components.DangerousGoodsCode;
import com.shippo.shippo_java_sdk.models.components.DangerousGoodsLithiumBatteries;
import com.shippo.shippo_java_sdk.models.components.DangerousGoodsObject;
import com.shippo.shippo_java_sdk.models.components.DepartmentNumber;
import com.shippo.shippo_java_sdk.models.components.DistanceUnitEnum;
import com.shippo.shippo_java_sdk.models.components.DryIce;
import com.shippo.shippo_java_sdk.models.components.Insurance;
import com.shippo.shippo_java_sdk.models.components.InvoiceNumber;
import com.shippo.shippo_java_sdk.models.components.LasershipAttrs;
import com.shippo.shippo_java_sdk.models.components.ParcelCreateRequest;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateAramexAustraliaEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateCouriersPleaseEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateDHLeCommerceEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateDPDUKEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateFedExEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateUPSEnum;
import com.shippo.shippo_java_sdk.models.components.ParcelTemplateUSPSEnum;
import com.shippo.shippo_java_sdk.models.components.PaymentMethod;
import com.shippo.shippo_java_sdk.models.components.PoNumber;
import com.shippo.shippo_java_sdk.models.components.PreferredDeliveryTimeframe;
import com.shippo.shippo_java_sdk.models.components.Provider;
import com.shippo.shippo_java_sdk.models.components.RecipientType;
import com.shippo.shippo_java_sdk.models.components.ReturnServiceType;
import com.shippo.shippo_java_sdk.models.components.RmaNumber;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.components.ShipmentCreateRequest;
import com.shippo.shippo_java_sdk.models.components.ShipmentExtra;
import com.shippo.shippo_java_sdk.models.components.SignatureConfirmation;
import com.shippo.shippo_java_sdk.models.components.Type;
import com.shippo.shippo_java_sdk.models.components.WeightUnitEnum;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.AddShipmentsToBatchRequest;
import com.shippo.shippo_java_sdk.models.operations.AddShipmentsToBatchResponse;
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

            AddShipmentsToBatchResponse res = sdk.batches().addShipments()
                .batchId("<value>")
                .shippoApiVersion("2018-02-08")
                .requestBody(java.util.List.of(
                    BatchShipmentBase.builder()
                        .shipment(ShipmentCreateRequest.builder()
                                .addressFrom(AddressFrom.of(AddressCreateRequest.builder()
                                            .country("US")
                                            .name("Shwan Ippotle")
                                            .company("Shippo")
                                            .street1("215 Clayton St.")
                                            .street2("<value>")
                                            .street3("")
                                            .streetNo("")
                                            .city("San Francisco")
                                            .state("CA")
                                            .zip("94117")
                                            .phone("+1 555 341 9393")
                                            .email("shippotle@shippo.com")
                                            .isResidential(true)
                                            .metadata("Customer ID 123456")
                                            .latitude(1024d)
                                            .longitude(5558.79d)
                                            .validate(true)
                                            .build()))
                                .addressTo(AddressTo.of(AddressCreateRequest.builder()
                                            .country("US")
                                            .name("Shwan Ippotle")
                                            .company("Shippo")
                                            .street1("215 Clayton St.")
                                            .street2("<value>")
                                            .street3("")
                                            .streetNo("")
                                            .city("San Francisco")
                                            .state("CA")
                                            .zip("94117")
                                            .phone("+1 555 341 9393")
                                            .email("shippotle@shippo.com")
                                            .isResidential(true)
                                            .metadata("Customer ID 123456")
                                            .latitude(8527.39d)
                                            .longitude(6056.55d)
                                            .validate(true)
                                            .build()))
                                .parcels(java.util.List.of(
                                        new Object()))
                                .customsDeclaration("adcfdddf8ec64b84ad22772bce3ea37a")
                                .extra(ShipmentExtra.builder()
                                    .ancillaryEndorsement(AncillaryEndorsement.RETURN_SERVICE_REQUESTED)
                                    .authorityToLeave(false)
                                    .alcohol(Alcohol.builder()
                                        .containsAlcohol(false)
                                        .recipientType(RecipientType.LICENSEE)
                                        .build())
                                    .billing(Billing.builder()
                                        .account("86768169")
                                        .country("<value>")
                                        .participationCode("<value>")
                                        .type(Type.RECIPIENT)
                                        .zip("97342")
                                        .build())
                                    .bypassAddressValidation(false)
                                    .carbonNeutral(false)
                                    .carrierHubId("<value>")
                                    .carrierHubTravelTime(441087L)
                                    .cod(Cod.builder()
                                        .amount("5.5")
                                        .currency("USD")
                                        .paymentMethod(PaymentMethod.CASH)
                                        .build())
                                    .containerType("<value>")
                                    .criticalPullTime("<value>")
                                    .customerBranch("<value>")
                                    .customerReference(CustomerReference.builder()
                                        .prefix("<value>")
                                        .value("<value>")
                                        .build())
                                    .dangerousGoodsCode(DangerousGoodsCode.FOUR)
                                    .dangerousGoods(DangerousGoodsObject.builder()
                                        .contains(false)
                                        .biologicalMaterial(DangerousGoodsBiologicalMaterial.builder()
                                            .contains(false)
                                            .build())
                                        .lithiumBatteries(DangerousGoodsLithiumBatteries.builder()
                                            .contains(false)
                                            .build())
                                        .build())
                                    .deliveryInstructions("<value>")
                                    .deptNumber(DepartmentNumber.builder()
                                        .prefix("<value>")
                                        .value("<value>")
                                        .build())
                                    .dryIce(DryIce.builder()
                                        .containsDryIce(false)
                                        .weight("<value>")
                                        .build())
                                    .fulfillmentCenter("<value>")
                                    .insurance(Insurance.builder()
                                        .amount("5.5")
                                        .content("<value>")
                                        .currency("USD")
                                        .provider(Provider.FEDEX)
                                        .build())
                                    .invoiceNumber(InvoiceNumber.builder()
                                        .prefix("<value>")
                                        .value("<value>")
                                        .build())
                                    .isReturn(false)
                                    .lasershipAttrs(LasershipAttrs.TWO_PERSON_DELIVERY)
                                    .lasershipDeclaredValue("<value>")
                                    .poNumber(PoNumber.builder()
                                        .prefix("<value>")
                                        .value("<value>")
                                        .build())
                                    .preferredDeliveryTimeframe(PreferredDeliveryTimeframe.TWELVE_MILLION_ONE_THOUSAND_FOUR_HUNDRED)
                                    .premium(false)
                                    .qrCodeRequested(false)
                                    .reference1("<value>")
                                    .reference2("<value>")
                                    .requestRetailRates(false)
                                    .returnServiceType(ReturnServiceType.PRINT_AND_MAIL)
                                    .rmaNumber(RmaNumber.builder()
                                        .prefix("<value>")
                                        .value("<value>")
                                        .build())
                                    .saturdayDelivery(false)
                                    .signatureConfirmation(SignatureConfirmation.INDIRECT)
                                    .build())
                                .metadata("Customer ID 123456")
                                .shipmentDate("2021-03-22T12:00:00Z")
                                .addressReturn(AddressReturn.of(AddressCreateRequest.builder()
                                            .country("US")
                                            .name("Shwan Ippotle")
                                            .company("Shippo")
                                            .street1("215 Clayton St.")
                                            .street2("<value>")
                                            .street3("")
                                            .streetNo("")
                                            .city("San Francisco")
                                            .state("CA")
                                            .zip("94117")
                                            .phone("+1 555 341 9393")
                                            .email("shippotle@shippo.com")
                                            .isResidential(true)
                                            .metadata("Customer ID 123456")
                                            .latitude(5126.95d)
                                            .longitude(5142.15d)
                                            .validate(true)
                                            .build()))
                                .async(false)
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
        } catch (com.shippo.shippo_java_sdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                            | Type                                                                                                                 | Required                                                                                                             | Description                                                                                                          | Example                                                                                                              |
| -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `batchId`                                                                                                            | *String*                                                                                                             | :heavy_check_mark:                                                                                                   | Object ID of the batch                                                                                               |                                                                                                                      |
| `shippoApiVersion`                                                                                                   | *Optional<? extends String>*                                                                                         | :heavy_minus_sign:                                                                                                   | String used to pick a non-default API version to use                                                                 | 2018-02-08                                                                                                           |
| `requestBody`                                                                                                        | List<[com.shippo.shippo_java_sdk.models.components.BatchShipmentBase](../../models/components/BatchShipmentBase.md)> | :heavy_minus_sign:                                                                                                   | Array of shipments to add to the batch                                                                               |                                                                                                                      |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.AddShipmentsToBatchResponse>](../../models/operations/AddShipmentsToBatchResponse.md)**
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

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.PurchaseBatchRequest;
import com.shippo.shippo_java_sdk.models.operations.PurchaseBatchResponse;
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

            PurchaseBatchResponse res = sdk.batches().purchase()
                .batchId("<value>")
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.batch().isPresent()) {
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
| `batchId`                                            | *String*                                             | :heavy_check_mark:                                   | Object ID of the batch                               |                                                      |
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.PurchaseBatchResponse>](../../models/operations/PurchaseBatchResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## removeShipments

Removes shipments from an existing batch shipment.

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.RemoveShipmentsFromBatchRequest;
import com.shippo.shippo_java_sdk.models.operations.RemoveShipmentsFromBatchResponse;
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

            RemoveShipmentsFromBatchResponse res = sdk.batches().removeShipments()
                .batchId("<value>")
                .shippoApiVersion("2018-02-08")
                .requestBody(java.util.List.of(
                    "<value>"))
                .call();

            if (res.batch().isPresent()) {
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

| Parameter                                              | Type                                                   | Required                                               | Description                                            | Example                                                |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `batchId`                                              | *String*                                               | :heavy_check_mark:                                     | Object ID of the batch                                 |                                                        |
| `shippoApiVersion`                                     | *Optional<? extends String>*                           | :heavy_minus_sign:                                     | String used to pick a non-default API version to use   | 2018-02-08                                             |
| `requestBody`                                          | List<*String*>                                         | :heavy_minus_sign:                                     | Array of shipments object ids to remove from the batch |                                                        |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.RemoveShipmentsFromBatchResponse>](../../models/operations/RemoveShipmentsFromBatchResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
