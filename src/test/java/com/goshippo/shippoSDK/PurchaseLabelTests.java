package com.goshippo.shippoSDK;


import com.goshippo.shippoSDK.models.components.Address;
import com.goshippo.shippoSDK.models.components.AddressCreateRequest;
import com.goshippo.shippoSDK.models.components.AddressFrom;
import com.goshippo.shippoSDK.models.components.AddressReturn;
import com.goshippo.shippoSDK.models.components.AddressTo;
import com.goshippo.shippoSDK.models.components.CustomsDeclarationContentsTypeEnum;
import com.goshippo.shippoSDK.models.components.CustomsDeclarationCreateRequest;
import com.goshippo.shippoSDK.models.components.CustomsDeclarationIncotermEnum;
import com.goshippo.shippoSDK.models.components.CustomsDeclarationNonDeliveryOptionEnum;
import com.goshippo.shippoSDK.models.components.CustomsItemCreateRequest;
import com.goshippo.shippoSDK.models.components.DistanceUnitEnum;
import com.goshippo.shippoSDK.models.components.Insurance;
import com.goshippo.shippoSDK.models.components.Parcels;
import com.goshippo.shippoSDK.models.components.ParcelCreateRequest;
import com.goshippo.shippoSDK.models.components.Shipment;
import com.goshippo.shippoSDK.models.components.ShipmentCreateRequest;
import com.goshippo.shippoSDK.models.components.ShipmentCreateRequestCustomsDeclaration;
import com.goshippo.shippoSDK.models.components.ShipmentExtra;
import com.goshippo.shippoSDK.models.components.Transaction;
import com.goshippo.shippoSDK.models.components.TransactionCreateRequest;
import com.goshippo.shippoSDK.models.components.WeightUnitEnum;
import com.goshippo.shippoSDK.models.operations.CreateTransactionRequestBody;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PurchaseLabelTests extends SdkProvider {

    @Test
    public void shouldPurchaseLabel() throws Exception {
        final var shipment = ShipmentCreateRequest.builder()
                .addressFrom(AddressFrom.of(AddressCreateRequest.builder()
                        .name("Rachael")
                        .street1("1092 Indian Summer Ct")
                        .city("San Jose")
                        .state("CA")
                        .zip("94117")
                        .country("US")
                        .phone("4159876543")
                        .email("rachael@alltheyarnz.com")
                        .build()))
                .addressTo(AddressTo.of(AddressCreateRequest.builder()
                        .name("Mr Hippo")
                        .street1("965 Mission St #572")
                        .city("San Francisco")
                        .state("CA")
                        .zip("94103")
                        .country("US")
                        .phone("4151234567")
                        .email("mrhippo@shippo.com")
                        .build()))
                .parcels(List.of(com.goshippo.shippoSDK.models.components.Parcels.of(ParcelCreateRequest.builder()
                        .distanceUnit(DistanceUnitEnum.IN)
                        .height("1")
                        .length("1")
                        .massUnit(WeightUnitEnum.LB)
                        .weight("1")
                        .width("1")
                        .build())))
                .build();

        final var shipmentResponse = getSdk().shipments().create()
                .shipmentCreateRequest(shipment)
                .call();

        assertInstanceOf(Shipment.class, shipmentResponse.shipment().get());
        assertInstanceOf(String.class, shipmentResponse.shipment().get().objectId());
        assertInstanceOf(Address.class, shipmentResponse.shipment().get().addressFrom());
        assertInstanceOf(Address.class, shipmentResponse.shipment().get().addressTo());
        assertInstanceOf(List.class, shipmentResponse.shipment().get().parcels());

        assertNotNull(shipmentResponse.shipment().get());
        assertNotNull(shipmentResponse.shipment().get().objectId());
        assertNotNull(shipmentResponse.shipment().get().addressFrom());
        assertNotNull(shipmentResponse.shipment().get().addressTo());
        assertNotNull(shipmentResponse.shipment().get().parcels());

        final var rateId = shipmentResponse.shipment().get().rates().get(0).objectId();
        final var transactionResponse = getSdk().transactions().create()
                .requestBody(CreateTransactionRequestBody.of(
                        TransactionCreateRequest.builder().rate(rateId).build()))
                .call();

        assertInstanceOf(Transaction.class, transactionResponse.transaction().get());
        assertNotNull(transactionResponse.transaction().get());
        assertInstanceOf(String.class, transactionResponse.transaction().get().objectId().get());
        assertNotNull(transactionResponse.transaction().get().objectId());
        assertInstanceOf(String.class, transactionResponse.transaction().get().objectOwner().get());
        assertNotNull(transactionResponse.transaction().get().objectOwner().get());
    }

    @Test
    public void shouldPurchaseLabelUsingReferenceIds() throws Exception {
        final var addressFromCreateRequest = AddressCreateRequest.builder()
                .name("Rachael")
                .street1("1092 Indian Summer Ct")
                .city("San Jose")
                .state("CA")
                .zip("95122")
                .country("US")
                .phone("4159876543")
                .email("rachael@alltheyarnz.com")
                .build();
        final var addressToCreateRequest = AddressCreateRequest.builder()
                .name("Mr Hippo")
                .street1("965 Mission St #572")
                .city("San Francisco")
                .state("CA")
                .zip("94103")
                .country("US")
                .phone("4151234567")
                .email("mrhippo@shippo.com")
                .build();
        final var parcelCreateRequest = ParcelCreateRequest.builder()
                .weight("5")
                .length("10")
                .width("5")
                .height("4")
                .distanceUnit(DistanceUnitEnum.IN)
                .massUnit(WeightUnitEnum.LB)
                .build();

        final var addressFrom = getSdk().addresses().create()
                .addressCreateRequest(addressFromCreateRequest)
                .call().address().get();
        final var addressTo = getSdk().addresses().create()
                .addressCreateRequest(addressToCreateRequest)
                .call().address().get();
        final var shipmentResponse = getSdk().shipments().create()
                .shipmentCreateRequest(ShipmentCreateRequest.builder()
                        .addressFrom(AddressFrom.of(addressFrom.objectId().get()))
                        .addressReturn(AddressReturn.of(addressFrom.objectId().get()))
                        .addressTo(AddressTo.of(addressTo.objectId().get()))
                        .parcels(List.of(Parcels.of(parcelCreateRequest)))
                        .build())
                .call();

        assertInstanceOf(Shipment.class, shipmentResponse.shipment().get());
        assertInstanceOf(String.class, shipmentResponse.shipment().get().objectId());
        assertInstanceOf(Address.class, shipmentResponse.shipment().get().addressFrom());
        assertInstanceOf(Address.class, shipmentResponse.shipment().get().addressTo());
        assertInstanceOf(Address.class, shipmentResponse.shipment().get().addressReturn().get());
        assertInstanceOf(List.class, shipmentResponse.shipment().get().parcels());

        assertNotNull(shipmentResponse.shipment().get());
        assertNotNull(shipmentResponse.shipment().get().objectId());
        assertNotNull(shipmentResponse.shipment().get().parcels());

        assertEquals(addressFrom.objectId(), shipmentResponse.shipment().get().addressFrom().objectId());
        assertEquals(addressTo.objectId(), shipmentResponse.shipment().get().addressTo().objectId());
        assertEquals(addressFrom.objectId(), shipmentResponse.shipment().get().addressReturn().get().objectId());

        String rateId = shipmentResponse.shipment().get().rates().get(0).objectId();
        final var transactionResponse = getSdk().transactions().create()
                .requestBody(CreateTransactionRequestBody.of(
                        TransactionCreateRequest.builder().rate(rateId).build()))
                .call();

        assertInstanceOf(Transaction.class, transactionResponse.transaction().get());
        assertInstanceOf(String.class, transactionResponse.transaction().get().objectId().get());
        assertInstanceOf(String.class, transactionResponse.transaction().get().objectOwner().get());

        assertNotNull(transactionResponse.transaction().get());
        assertNotNull(transactionResponse.transaction().get().objectId());
        assertNotNull(transactionResponse.transaction().get().objectOwner().get());
    }

    @Test
    public void shouldPurchaseInternationalLabel() throws Exception {
        final var addressFromCreateRequest = AddressCreateRequest.builder()
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
                .build();

        final var addressToCreateRequest = AddressCreateRequest.builder()
                .name("Tom Marks")
                .street1("159 Broadhurst Gardens")
                .city("London")
                .zip("NW6 3AU")
                .country("GB")
                .phone("4159876543")
                .email("tommarks@gmmail.com")
                .build();

        final var parcelCreateRequest = ParcelCreateRequest.builder()
                .weight("5")
                .length("10")
                .width("5")
                .height("4")
                .distanceUnit(DistanceUnitEnum.IN)
                .massUnit(WeightUnitEnum.LB)
                .build();

        final var shipmentExtra = ShipmentExtra.builder()
                .insurance(Insurance.builder()
                        .amount("200")
                        .currency("USD")
                        .content("guitar pedal")
                        .build())
                .build();

        final var customsItemCreateRequest = CustomsItemCreateRequest.builder()
                .description("Guitar Pedal")
                .quantity(1)
                .netWeight("5")
                .massUnit(WeightUnitEnum.LB)
                .valueAmount("200")
                .valueCurrency("USD")
                .originCountry("US")
                .build();

        final var customsDeclarationCreateRequest = CustomsDeclarationCreateRequest.builder()
                .contentsType(CustomsDeclarationContentsTypeEnum.MERCHANDISE)
                .nonDeliveryOption(CustomsDeclarationNonDeliveryOptionEnum.RETURN)
                .certify(true)
                .certifySigner("Tom Marks")
                .incoterm(CustomsDeclarationIncotermEnum.DDP)
                .items(List.of(customsItemCreateRequest))
                .build();

        final var addressFrom = getSdk().addresses().create()
                .addressCreateRequest(addressFromCreateRequest)
                .call().address().get();

        final var customsDeclaration = getSdk().customsDeclarations().create()
                .customsDeclarationCreateRequest(customsDeclarationCreateRequest)
                .call().customsDeclaration().get();

        final var shipmentResponse = getSdk().shipments().create()
                .shipmentCreateRequest(ShipmentCreateRequest.builder()
                        .addressFrom(AddressFrom.of(addressFrom.objectId().get()))
                        .addressTo(AddressTo.of(addressToCreateRequest))
                        .parcels(List.of(Parcels.of(parcelCreateRequest)))
                        .customsDeclaration(ShipmentCreateRequestCustomsDeclaration.of(customsDeclaration.objectId().get()))
                        .extra(shipmentExtra)
                        .build())
                .call();

        assertInstanceOf(Shipment.class, shipmentResponse.shipment().get());
        assertInstanceOf(String.class, shipmentResponse.shipment().get().objectId());
        assertInstanceOf(Address.class, shipmentResponse.shipment().get().addressFrom());
        assertInstanceOf(Address.class, shipmentResponse.shipment().get().addressTo());
        assertInstanceOf(List.class, shipmentResponse.shipment().get().parcels());

        assertNotNull(shipmentResponse.shipment().get());
        assertNotNull(shipmentResponse.shipment().get().objectId());
        assertNotNull(shipmentResponse.shipment().get().addressFrom());
        assertNotNull(shipmentResponse.shipment().get().addressTo());
        assertNotNull(shipmentResponse.shipment().get().parcels());

        final var rateId = shipmentResponse.shipment().get().rates().get(0).objectId();
        final var transactionResponse = getSdk().transactions().create()
                .requestBody(CreateTransactionRequestBody.of(
                        TransactionCreateRequest.builder().rate(rateId).build()))
                .call();

        assertInstanceOf(Transaction.class, transactionResponse.transaction().get());
        assertInstanceOf(String.class, transactionResponse.transaction().get().objectId().get());
        assertInstanceOf(String.class, transactionResponse.transaction().get().objectOwner().get());

        assertNotNull(transactionResponse.transaction().get());
        assertNotNull(transactionResponse.transaction().get().objectId());
        assertNotNull(transactionResponse.transaction().get().objectOwner().get());
    }
}
