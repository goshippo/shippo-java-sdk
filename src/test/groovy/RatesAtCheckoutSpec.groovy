import com.shippo.sdk.models.components.AddressCompleteCreateRequest
import com.shippo.sdk.models.components.CarriersEnum
import com.shippo.sdk.models.components.DistanceUnitEnum
import com.shippo.sdk.models.components.LineItem
import com.shippo.sdk.models.components.LiveRateCreateRequest
import com.shippo.sdk.models.components.LiveRateCreateRequestAddressFrom
import com.shippo.sdk.models.components.LiveRateCreateRequestAddressTo
import com.shippo.sdk.models.components.LiveRateCreateRequestParcel
import com.shippo.sdk.models.components.Parcel
import com.shippo.sdk.models.components.ServiceGroupAccountAndServiceLevel
import com.shippo.sdk.models.components.ServiceGroupCreateRequest
import com.shippo.sdk.models.components.ServiceGroupTypeEnum
import com.shippo.sdk.models.components.ServiceLevelUPSEnum
import com.shippo.sdk.models.components.WeightUnitEnum
import spock.lang.Specification

class RatesAtCheckoutSpec extends Specification implements SdkProvider {

    def setupSpec() {
        deleteAllServiceGroups()
    }

    def private deleteAllServiceGroups() {
        def response = getSdk().serviceGroups().listDirect()
        for (sg in response.serviceGroupListResponse().get()) {
            getSdk().serviceGroups().delete(sg.objectId())
        }
    }

    def "should retrieve rate at checkout"() {
        given:
        def carrierAccount = getCarrierAccount(CarriersEnum.UPS)
        def upsAccountId = carrierAccount.objectId().get()

        def serviceLevels = []
        for (availableServiceLevel in [ServiceLevelUPSEnum.UPS_GROUND, ServiceLevelUPSEnum.UPS_NEXT_DAY_AIR_SAVER]) {
            serviceLevels << ServiceGroupAccountAndServiceLevel.builder()
                    .accountObjectId(upsAccountId)
                    .serviceLevelToken(availableServiceLevel.value())
                    .build()
        }

        when:
        def serviceGroupCreateRequest = getSdk().serviceGroups().create()
                .serviceGroupCreateRequest(
                        ServiceGroupCreateRequest.builder()
                                .name("UPS shipping")
                                .description("UPS shipping options")
                                .flatRate("5")
                                .flatRateCurrency("USD")
                                .type(ServiceGroupTypeEnum.LIVE_RATE)
                                .serviceLevels(serviceLevels)
                                .build()
                ).call()

        then:
        def serviceGroup = serviceGroupCreateRequest.serviceGroup().get()

        when:
        def ratesAtCheckoutResponse = getSdk().ratesAtCheckout().create(
                LiveRateCreateRequest.builder()
                        .addressFrom(LiveRateCreateRequestAddressFrom.of(
                                AddressCompleteCreateRequest.builder()
                                        .name("S. Hippo")
                                        .company("Shippo")
                                        .street1("731 Market St #200")
                                        .city("San Francisco")
                                        .state("CA")
                                        .zip("94103")
                                        .country("US")
                                        .build()))
                        .addressTo(LiveRateCreateRequestAddressTo.of(
                                AddressCompleteCreateRequest.builder()
                                        .name("Bob Bloat")
                                        .company("SF Zoo")
                                        .street1("Sloat Blvd. & Upper Great Hwy.")
                                        .city("San Francisco")
                                        .state("CA")
                                        .zip("94132")
                                        .country("US")
                                        .build()))
                        .lineItems(List.of(LineItem.builder()
                                .quantity(1)
                                .totalPrice("12.00")
                                .currency("USD")
                                .weight("1.0")
                                .weightUnit(WeightUnitEnum.LB)
                                .title("Hippo Snax")
                                .manufactureCountry("US")
                                .sku("HM-123")
                                .build()))
                        .parcel(LiveRateCreateRequestParcel.of(Parcel.builder()
                                .length("10")
                                .width("15")
                                .height("10")
                                .distanceUnit(DistanceUnitEnum.IN)
                                .weight("1")
                                .massUnit(WeightUnitEnum.LB)
                                .build()))
                        .build()
        )

        then:
        def ratesAtCheckout = ratesAtCheckoutResponse.liveRatePaginatedList().get().results().get()
        assert ratesAtCheckout.size() > 0
        for (liveRate in ratesAtCheckout) {
            assert liveRate.title().get() == serviceGroup.name()
        }
    }

}
