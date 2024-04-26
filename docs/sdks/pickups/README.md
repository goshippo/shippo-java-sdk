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

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.AddressCompleteCreateRequest;
import com.shippo.shippo_java_sdk.models.components.BuildingLocationType;
import com.shippo.shippo_java_sdk.models.components.BuildingType;
import com.shippo.shippo_java_sdk.models.components.Location;
import com.shippo.shippo_java_sdk.models.components.PickupBase;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.CreatePickupRequest;
import com.shippo.shippo_java_sdk.models.operations.CreatePickupResponse;
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
                                    .street2("<value>")
                                    .street3("")
                                    .streetNo("")
                                    .phone("+1 555 341 9393")
                                    .email("shippotle@shippo.com")
                                    .isResidential(true)
                                    .metadata("Customer ID 123456")
                                    .latitude(4174.58d)
                                    .longitude(2884.08d)
                                    .validate(true)
                                    .build())
                            .buildingLocationType(BuildingLocationType.FRONT_DOOR)
                            .buildingType(BuildingType.APARTMENT)
                            .instructions("Behind screen door")
                            .build())
                    .requestedEndTime(OffsetDateTime.parse("2022-05-28T06:20:22.608Z"))
                    .requestedStartTime(OffsetDateTime.parse("2024-05-12T01:18:11.295Z"))
                    .transactions(java.util.List.of(
                            "adcfdddf8ec64b84ad22772bce3ea37a"))
                    .build())
                .call();

            if (res.pickup().isPresent()) {
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

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              | Example                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `shippoApiVersion`                                                                                                                       | *Optional<? extends String>*                                                                                                             | :heavy_minus_sign:                                                                                                                       | String used to pick a non-default API version to use                                                                                     | 2018-02-08                                                                                                                               |
| `pickupBase`                                                                                                                             | [Optional<? extends com.shippo.shippo_java_sdk.models.components.PickupBase>](../../models/components/PickupBase.md)                     | :heavy_minus_sign:                                                                                                                       | Shippo’s pickups endpoint allows you to schedule pickups with USPS and DHL Express for eligible shipments that you have already created. |                                                                                                                                          |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.CreatePickupResponse>](../../models/operations/CreatePickupResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
