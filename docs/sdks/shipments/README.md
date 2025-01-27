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

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.ListShipmentsRequest;
import com.goshippo.shippo_sdk.models.operations.ListShipmentsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        ListShipmentsRequest req = ListShipmentsRequest.builder()
                .page(1L)
                .results(25L)
                .build();

        ListShipmentsResponse res = sdk.shipments().list()
                .request(req)
                .call();

        if (res.shipmentPaginatedList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListShipmentsRequest](../../models/operations/ListShipmentsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListShipmentsResponse](../../models/operations/ListShipmentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## create

Creates a new shipment object.

### Example Usage

```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.AddressCreateRequest;
import com.goshippo.shippo_sdk.models.components.AddressFrom;
import com.goshippo.shippo_sdk.models.components.AddressImporter;
import com.goshippo.shippo_sdk.models.components.AddressReturn;
import com.goshippo.shippo_sdk.models.components.AddressTo;
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
import com.goshippo.shippo_sdk.models.components.DistanceUnitEnum;
import com.goshippo.shippo_sdk.models.components.DutiesPayor;
import com.goshippo.shippo_sdk.models.components.Insurance;
import com.goshippo.shippo_sdk.models.components.InvoiceNumber;
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
import com.goshippo.shippo_sdk.models.operations.CreateShipmentResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

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
                    .parcels(List.of(
                        Parcels.of("<value>"),
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
                    .addressReturn(AddressReturn.of("d799c2679e644279b59fe661ac8fa488"))
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
                .call();

        if (res.shipment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |
| `shipmentCreateRequest`                                                                                                                                            | [ShipmentCreateRequest](../../models/components/ShipmentCreateRequest.md)                                                                                          | :heavy_check_mark:                                                                                                                                                 | Shipment details and contact info.                                                                                                                                 |                                                                                                                                                                    |

### Response

**[CreateShipmentResponse](../../models/operations/CreateShipmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Returns an existing shipment using an object ID

### Example Usage

```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.GetShipmentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        GetShipmentResponse res = sdk.shipments().get()
                .shipmentId("<id>")
                .shippoApiVersion("2018-02-08")
                .call();

        if (res.shipment().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `shipmentId`                                                                                                                                                       | *String*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | Object ID of the shipment to update                                                                                                                                |                                                                                                                                                                    |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |

### Response

**[GetShipmentResponse](../../models/operations/GetShipmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |