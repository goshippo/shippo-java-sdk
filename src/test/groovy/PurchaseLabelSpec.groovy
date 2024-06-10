import com.shippo.sdk.models.components.*
import com.shippo.sdk.models.operations.CreateShipmentResponse
import com.shippo.sdk.models.operations.CreateTransactionRequestBody
import spock.lang.Specification

class PurchaseLabelSpec extends Specification implements SdkProvider {

    def "should purchase label"() {
        given:
        ShipmentCreateRequest shipment = ShipmentCreateRequest.builder()
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
                .parcels(List.of(Parcels.of(ParcelCreateRequest.builder()
                        .distanceUnit(DistanceUnitEnum.IN)
                        .height("1")
                        .length("1")
                        .massUnit(WeightUnitEnum.LB)
                        .weight("1")
                        .width("1")
                        .build())))
                .build()

        when:
        CreateShipmentResponse shipmentResponse = getSdk().shipments().create()
                .shipmentCreateRequest(shipment)
                .call()

        then:
        shipmentResponse.shipment().get()

        when:
        String rateId = shipmentResponse.shipment().get().rates().get(0).objectId()
        Transaction transaction = getSdk().transactions().create()
                .requestBody(CreateTransactionRequestBody.of(
                        TransactionCreateRequest.builder().rate(rateId).build()))
                .call().transaction().get()

        then:
        assert transaction.rate().get().value() instanceof String
    }

    def "should purchase label using reference ids"() {
        given:
        def addressFromCreateRequest = AddressCreateRequest.builder()
                .name("Rachael")
                .street1("1092 Indian Summer Ct")
                .city("San Jose")
                .state("CA")
                .zip("95122")
                .country("US")
                .phone("4159876543")
                .email("rachael@alltheyarnz.com")
                .build()
        def addressToCreateRequest = AddressCreateRequest.builder()
                .name("Mr Hippo")
                .street1("965 Mission St #572")
                .city("San Francisco")
                .state("CA")
                .zip("94103")
                .country("US")
                .phone("4151234567")
                .email("mrhippo@shippo.com")
                .build()
        def parcelRequest = ParcelRequest.builder()
                .length("5")
                .width("5")
                .height("5")
                .distanceUnit(DistanceUnitEnum.CM)
                .weight("2")
                .massUnit(WeightUnitEnum.LB)
                .metadata("Wool Box1")
                .build()

        when:
        Address addressFrom = getSdk().addresses().create()
                .addressCreateRequest(addressFromCreateRequest)
                .call().address().get()
        Address addressTo = getSdk().addresses().create()
                .addressCreateRequest(addressToCreateRequest)
                .call().address().get()
        Parcel parcel = getSdk().parcels().create()
                .parcelRequest(parcelRequest)
                .call().parcel().get()
        Shipment shipment = getSdk().shipments().create()
                .shipmentCreateRequest(ShipmentCreateRequest.builder()
                        .addressFrom(AddressFrom.of(addressFrom.objectId().get()))
                        .addressReturn(AddressReturn.of(addressFrom.objectId().get()))
                        .addressTo(AddressTo.of(addressTo.objectId().get()))
                        .parcels(List.of(parcel))
                        .build())
                .call().shipment().get()

        then:
        assert shipment.addressTo().objectId() == addressTo.objectId()
        assert shipment.addressFrom().objectId() == addressFrom.objectId()
        assert shipment.addressReturn().get().objectId() == addressFrom.objectId()

        when:
        String rateId = shipment.rates().get(0).objectId()
        Transaction transaction = getSdk().transactions().create()
                .requestBody(CreateTransactionRequestBody.of(
                        TransactionCreateRequest.builder().rate(rateId).build()))
                .call().transaction().get()

        then:
        assert transaction.rate().get().value() instanceof String
    }

}
