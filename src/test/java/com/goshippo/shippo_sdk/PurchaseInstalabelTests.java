package com.goshippo.shippo_sdk;


import com.goshippo.shippo_sdk.models.components.AddressCreateRequest;
import com.goshippo.shippo_sdk.models.components.AddressFrom;
import com.goshippo.shippo_sdk.models.components.AddressTo;
import com.goshippo.shippo_sdk.models.components.CarriersEnum;
import com.goshippo.shippo_sdk.models.components.DistanceUnitEnum;
import com.goshippo.shippo_sdk.models.components.InstantTransactionCreateRequest;
import com.goshippo.shippo_sdk.models.components.ParcelCreateRequest;
import com.goshippo.shippo_sdk.models.components.ShipmentCreateRequest;
import com.goshippo.shippo_sdk.models.components.Transaction;
import com.goshippo.shippo_sdk.models.components.WeightUnitEnum;
import com.goshippo.shippo_sdk.models.operations.CreateTransactionRequestBody;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PurchaseInstalabelTests extends SdkProvider {

    @Test
    public void shouldPurchaseInstalabel() throws Exception {
        final var carrierAccount = getCarrierAccount(CarriersEnum.USPS);

        final var addressFrom = AddressFrom.of(AddressCreateRequest.builder()
                .name("Rachael")
                .street1("1092 Indian Summer Ct")
                .city("San Jose")
                .state("CA")
                .zip("94117")
                .country("US")
                .phone("4159876543")
                .email("rachael@alltheyarnz.com")
                .build());

        final var addressTo = AddressTo.of(AddressCreateRequest.builder()
                .name("Mr Hippo")
                .street1("965 Mission St #572")
                .city("San Francisco")
                .state("CA")
                .zip("94103")
                .country("US")
                .phone("4151234567")
                .email("mrhippo@shippo.com")
                .build());

        final var parcels = List.of(com.goshippo.shippo_sdk.models.components.Parcels.of(ParcelCreateRequest.builder()
                .distanceUnit(DistanceUnitEnum.IN)
                .height("1")
                .length("1")
                .massUnit(WeightUnitEnum.LB)
                .weight("1")
                .width("1")
                .build()));

        final var shipment = ShipmentCreateRequest.builder()
                .addressFrom(addressFrom)
                .addressTo(addressTo)
                .parcels(parcels)
                .build();

        assertNotNull(shipment);
        assertNotNull(shipment.addressFrom());
        assertNotNull(shipment.addressTo());
        assertNotNull(shipment.parcels());

        final var request = CreateTransactionRequestBody.of(InstantTransactionCreateRequest.builder()
                .carrierAccount(carrierAccount.objectId().get())
                .servicelevelToken("usps_ground_advantage")
                .shipment(shipment)
                .build());

        final var response = getSdk().transactions().create()
                .requestBody(request)
                .call();

        assertInstanceOf(Transaction.class, response.transaction().get());
        assertInstanceOf(String.class, response.transaction().get().objectId().get());
        assertInstanceOf(String.class, response.transaction().get().objectOwner().get());

        assertNotNull(response.transaction().get());
        assertNotNull(response.transaction().get().objectId());
        assertNotNull(response.transaction().get().objectOwner().get());
    }
}

