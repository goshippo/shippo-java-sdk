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

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.ListShipmentsRequest;
import com.shippo.shippo_java_sdk.models.operations.ListShipmentsResponse;
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

            ListShipmentsResponse res = sdk.shipments().list()
                .page(1L)
                .results(25L)
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.shipmentPaginatedList().isPresent()) {
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
| `page`                                               | *Optional<? extends Long>*                           | :heavy_minus_sign:                                   | The page number you want to select                   |                                                      |
| `results`                                            | *Optional<? extends Long>*                           | :heavy_minus_sign:                                   | The number of results to return per page (max 100)   |                                                      |
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.ListShipmentsResponse>](../../models/operations/ListShipmentsResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## create

Creates a new shipment object.

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.AddressCreateRequest;
import com.shippo.shippo_java_sdk.models.components.Alcohol;
import com.shippo.shippo_java_sdk.models.components.AncillaryEndorsement;
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
import com.shippo.shippo_java_sdk.models.operations.CreateShipmentRequest;
import com.shippo.shippo_java_sdk.models.operations.CreateShipmentResponse;
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

            CreateShipmentResponse res = sdk.shipments().create()
                .shippoApiVersion("2018-02-08")
                .shipmentCreateRequest(ShipmentCreateRequest.builder()
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
                                .latitude(4865.89d)
                                .longitude(4893.82d)
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
                                .latitude(6384.24d)
                                .longitude(8592.13d)
                                .validate(true)
                                .build()))
                    .parcels(java.util.List.of(
                            new Object()))
                    .customsDeclaration("adcfdddf8ec64b84ad22772bce3ea37a")
                    .metadata("Customer ID 123456")
                    .shipmentDate("2021-03-22T12:00:00Z")
                    .carrierAccounts(java.util.List.of(
                        "065a4a8c10d24a34ab932163a1b87f52",
                        "73f706f4bdb94b54a337563840ce52b0"))
                    .build())
                .call();

            if (res.shipment().isPresent()) {
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

| Parameter                                                                                                                                  | Type                                                                                                                                       | Required                                                                                                                                   | Description                                                                                                                                | Example                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------ |
| `shippoApiVersion`                                                                                                                         | *Optional<? extends String>*                                                                                                               | :heavy_minus_sign:                                                                                                                         | String used to pick a non-default API version to use                                                                                       | 2018-02-08                                                                                                                                 |
| `shipmentCreateRequest`                                                                                                                    | [Optional<? extends com.shippo.shippo_java_sdk.models.components.ShipmentCreateRequest>](../../models/components/ShipmentCreateRequest.md) | :heavy_minus_sign:                                                                                                                         | Shipment details and contact info.                                                                                                         |                                                                                                                                            |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.CreateShipmentResponse>](../../models/operations/CreateShipmentResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## get

Returns an existing shipment using an object ID

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.GetShipmentRequest;
import com.shippo.shippo_java_sdk.models.operations.GetShipmentResponse;
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

            GetShipmentResponse res = sdk.shipments().get()
                .shipmentId("<value>")
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.shipment().isPresent()) {
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
| `shipmentId`                                         | *String*                                             | :heavy_check_mark:                                   | Object ID of the shipment to update                  |                                                      |
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.GetShipmentResponse>](../../models/operations/GetShipmentResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
