import com.shippo.sdk.models.components.*
import com.shippo.sdk.models.operations.CreateTransactionRequestBody
import com.shippo.sdk.models.operations.CreateTransactionResponse
import spock.lang.Specification

class PurchaseInstalabelSpec extends Specification implements SdkProvider {

    def "should purchase instalabel"() {
        def carrierAccount = getCarrierAccount(CarriersEnum.USPS)

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
        CreateTransactionResponse res = getSdk().transactions().create()
                .requestBody(CreateTransactionRequestBody.of(InstantTransactionCreateRequest.builder()
                        .carrierAccount(carrierAccount.objectId().get())
                        .servicelevelToken("usps_ground_advantage")
                        .shipment(shipment)
                        .build()))
                .call()

        then:
        res.transaction().get()
    }

}
