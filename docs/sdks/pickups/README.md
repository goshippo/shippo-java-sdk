# Pickups
(*pickups()*)

## Overview

A pickup is when you schedule a carrier to collect a package for delivery.
Use Shippo’s pickups endpoint to schedule pickups with USPS and DHL Express for eligible shipments that you have already created.
<SchemaDefinition schemaRef="#/components/schemas/Pickup"/>

### Available Operations

* [create](#create) - Create a pickup

## create

Creates a pickup object. This request is for a carrier to come to a specified location to take a package for shipping.

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

            CreatePickupResponse res = sdk.pickups().create()
                .shippoApiVersion("2018-02-08")
                .pickupBase(PickupBase.builder()
                    .carrierAccount("adcfdddf8ec64b84ad22772bce3ea37a")
                    .location(Location.builder()
                            .address(AddressCompleteCreateRequest.builder()
                                    .name("Shwan Ippotle")
                                    .street1("215 Clayton St.")
                                    .city("San Francisco")
                                    .state("CA")
                                    .zip("94117")
                                    .country("US")
                                    .company("Shippo")
                                    .street3("")
                                    .streetNo("")
                                    .phone("+1 555 341 9393")
                                    .email("shippotle@shippo.com")
                                    .isResidential(true)
                                    .metadata("Customer ID 123456")
                                    .validate(true)
                                    .build())
                            .buildingLocationType(BuildingLocationType.FRONT_DOOR)
                            .buildingType(BuildingType.APARTMENT)
                            .instructions("Behind screen door")
                            .build())
                    .requestedEndTime(OffsetDateTime.parse("2023-06-18T07:14:55.676Z"))
                    .requestedStartTime(OffsetDateTime.parse("2023-06-21T08:42:38.998Z"))
                    .transactions(java.util.List.of(
                            "adcfdddf8ec64b84ad22772bce3ea37a"))
                    .build())
                .call();

            if (res.pickup().isPresent()) {
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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              | Example                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `shippoApiVersion`                                                                                                                       | *Optional<? extends String>*                                                                                                             | :heavy_minus_sign:                                                                                                                       | String used to pick a non-default API version to use                                                                                     | 2018-02-08                                                                                                                               |
| `pickupBase`                                                                                                                             | [com.shippo.sdk.models.components.PickupBase](../../models/components/PickupBase.md)                                                     | :heavy_check_mark:                                                                                                                       | Shippo’s pickups endpoint allows you to schedule pickups with USPS and DHL Express for eligible shipments that you have already created. |                                                                                                                                          |


### Response

**[Optional<? extends com.shippo.sdk.models.operations.CreatePickupResponse>](../../models/operations/CreatePickupResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
