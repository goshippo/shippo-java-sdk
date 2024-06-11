package com.shippo.sdk

import com.shippo.sdk.models.components.*
import com.shippo.sdk.models.operations.CreateShipmentResponse
import spock.lang.Specification

// https://docs.goshippo.com/docs/stories/intl_rating_guide/
class PurchaseLabelInternationalSpec extends Specification implements SdkProvider {

    def "should purchase international label"() {
        given:
        def addressFromCreateRequest = AddressCreateRequest.builder()
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
                .build()

        def addressToCreateRequest = AddressCreateRequest.builder()
                .name("Tom Marks")
                .street1("159 Broadhurst Gardens")
                .city("London")
                .zip("NW6 3AU")
                .country("GB")
                .phone("4159876543")
                .email("tommarks@gmmail.com")
                .build()

        def parcelCreateRequest = ParcelCreateRequest.builder()
                .weight("5")
                .length("10")
                .width("5")
                .height("4")
                .distanceUnit(DistanceUnitEnum.IN)
                .massUnit(WeightUnitEnum.LB)
                .build()

        def shipmentExtra = ShipmentExtra.builder()
                .insurance(Insurance.builder()
                        .amount("200")
                        .currency("USD")
                        .content("guitar pedal")
                        .build())
                .build()

        def customsItemCreateRequest = CustomsItemCreateRequest.builder()
                .description("Guitar Pedal")
                .quantity(1)
                .netWeight("5")
                .massUnit(WeightUnitEnum.LB)
                .valueAmount("200")
                .valueCurrency("USD")
                .originCountry("US")
                .build()

        def customsDeclarationCreateRequest = CustomsDeclarationCreateRequest.builder()
                .contentsType(CustomsDeclarationContentsTypeEnum.MERCHANDISE)
                .nonDeliveryOption(CustomsDeclarationNonDeliveryOptionEnum.RETURN_)
                .certify(true)
                .certifySigner("Tom Marks")
                .incoterm(CustomsDeclarationIncotermEnum.DDP)
                .items(List.of(customsItemCreateRequest))
                .build()

        when:
        Address addressFrom = getSdk().addresses().create()
                .addressCreateRequest(addressFromCreateRequest)
                .call().address().get()

        CustomsDeclaration customsDeclaration = getSdk().customsDeclarations().create()
                .customsDeclarationCreateRequest(customsDeclarationCreateRequest)
                .call().customsDeclaration().get()

        CreateShipmentResponse shipmentResponse = getSdk().shipments().create()
                .shipmentCreateRequest(ShipmentCreateRequest.builder()
                        .addressFrom(AddressFrom.of(addressFrom.objectId().get()))
                        .addressTo(AddressTo.of(addressToCreateRequest))
                        .parcels(List.of(com.shippo.sdk.models.components.Parcels.of(parcelCreateRequest)))
                        .customsDeclaration(ShipmentCreateRequestCustomsDeclaration.of(customsDeclaration.objectId().get()))
                        .extra(shipmentExtra)
                        .build())
                .call()

        then:
        shipmentResponse.shipment().get()
    }

}
