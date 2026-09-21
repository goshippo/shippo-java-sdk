# Pickups

## Overview

A pickup is when you schedule a carrier to collect a package for delivery.
Use Shippo’s pickups endpoint to schedule pickups with USPS and DHL Express for eligible shipments that you have already created.

### Available Operations

* [create](#create) - Create a pickup

## create

Creates a pickup object. This request is for a carrier to come to a specified location to take a package for shipping.

### Example Usage

<!-- UsageSnippet language="java" operationID="CreatePickup" method="post" path="/pickups" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.*;
import com.goshippo.shippo_sdk.models.operations.CreatePickupResponse;
import java.lang.Exception;
import java.time.OffsetDateTime;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        PickupBase req = PickupBase.builder()
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
                .requestedEndTime(OffsetDateTime.parse("2025-03-28T03:12:16.314Z"))
                .requestedStartTime(OffsetDateTime.parse("2024-05-20T03:35:43.192Z"))
                .transactions(List.of(
                    "adcfdddf8ec64b84ad22772bce3ea37a"))
                .build();

        CreatePickupResponse res = sdk.pickups().create()
                .request(req)
                .call();

        if (res.pickup().isPresent()) {
            System.out.println(res.pickup().get());
        }
    }
}
```

### Parameters

| Parameter                                       | Type                                            | Required                                        | Description                                     |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `request`                                       | [PickupBase](../../models/shared/PickupBase.md) | :heavy_check_mark:                              | The request object to use for the request.      |

### Response

**[CreatePickupResponse](../../models/operations/CreatePickupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |