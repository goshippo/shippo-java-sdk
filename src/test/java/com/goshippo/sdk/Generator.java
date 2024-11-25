package com.goshippo.sdk;

import com.goshippo.sdk.models.components.AddressCreateRequest;
import com.goshippo.sdk.models.components.AddressFrom;
import com.goshippo.sdk.models.components.AddressTo;
import com.goshippo.sdk.models.components.BatchCreateRequest;
import com.goshippo.sdk.models.components.BatchShipmentCreateRequest;
import com.goshippo.sdk.models.components.DistanceUnitEnum;
import com.goshippo.sdk.models.components.ParcelCreateRequest;
import com.goshippo.sdk.models.components.Parcels;
import com.goshippo.sdk.models.components.ShipmentCreateRequest;
import com.goshippo.sdk.models.components.WeightUnitEnum;

import java.util.List;

// TODO should find a better way for us to generate test data
// Ideally language agnostic and could be used by all SDKs
public class Generator {
    public AddressFrom buildAddressFrom() {
        return AddressFrom.of(buildAddressCreateRequests().get(0));
    }

    public AddressTo buildAddressTo() {
        return AddressTo.of(buildAddressCreateRequests().get(1));
    }

    public List<Parcels> buildParcels() {
        return List.of(Parcels.of(buildParcelCreateRequest().get(0)));
    }

    public List<ParcelCreateRequest> buildParcelCreateRequest() {
        return List.of(ParcelCreateRequest.builder()
                        .distanceUnit(DistanceUnitEnum.IN)
                        .height("1")
                        .length("1")
                        .massUnit(WeightUnitEnum.LB)
                        .weight("1")
                        .width("1")
                        .build(),
                ParcelCreateRequest.builder()
                        .weight("5")
                        .length("10")
                        .width("5")
                        .height("4")
                        .distanceUnit(DistanceUnitEnum.IN)
                        .massUnit(WeightUnitEnum.LB)
                        .build()
        );
    }

    public ShipmentCreateRequest buildShipmentCreateRequest() {
        return ShipmentCreateRequest.builder()
                .addressFrom(buildAddressFrom())
                .addressTo(buildAddressTo())
                .parcels(buildParcels())
                .build();
    }

    public BatchCreateRequest buildBatchCreateRequest(ShipmentCreateRequest shipment, String carrierAccountObjectId) {
        return BatchCreateRequest.builder()
                .defaultCarrierAccount(carrierAccountObjectId)
                .defaultServicelevelToken("usps_priority")
                .batchShipments(List.of(
                        BatchShipmentCreateRequest.builder()
                                .shipment(shipment)
                                .carrierAccount(carrierAccountObjectId)
                                .build()))
                .build();
    }

    public List<AddressCreateRequest> buildAddressCreateRequests() {
        return List.of(
                AddressCreateRequest.builder()
                        .name("Rachael")
                        .street1("1092 Indian Summer Ct")
                        .city("San Jose")
                        .state("CA")
                        .zip("94117")
                        .country("US")
                        .phone("4159876543")
                        .email("rachael@alltheyarnz.com")
                        .build(),
                AddressCreateRequest.builder()
                        .name("Mr Hippo")
                        .street1("965 Mission St #572")
                        .city("San Francisco")
                        .state("CA")
                        .zip("94103")
                        .country("US")
                        .phone("4151234567")
                        .email("mrhippo@shippo.com")
                        .build(),
                AddressCreateRequest.builder()
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
                        .build(),
                AddressCreateRequest.builder()
                        .name("Sarah")
                        .company("We Sell Guitars")
                        .street1("215 Clayton St.")
                        .city("San Francisco")
                        .state("CA")
                        .zip("94117")
                        .country("US")
                        .phone("+1 555 341 9393")
                        .email("sarah@wesellguitars.net")
                        .isResidential(false)
                        .metadata("We Sell Guitars HQ")
                        .build(),
                AddressCreateRequest.builder()
                        .name("Tom Marks")
                        .street1("159 Broadhurst Gardens")
                        .city("London")
                        .zip("NW6 3AU")
                        .country("GB")
                        .phone("4159876543")
                        .email("tommarks@gmmail.com")
                        .build()
                );
    }
}
