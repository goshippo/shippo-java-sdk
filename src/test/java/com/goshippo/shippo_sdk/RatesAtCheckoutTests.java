package com.goshippo.shippo_sdk;

import com.goshippo.shippo_sdk.models.components.AddressCompleteCreateRequest;
import com.goshippo.shippo_sdk.models.components.CarriersEnum;
import com.goshippo.shippo_sdk.models.components.DistanceUnitEnum;
import com.goshippo.shippo_sdk.models.components.LineItem;
import com.goshippo.shippo_sdk.models.components.LiveRateCreateRequest;
import com.goshippo.shippo_sdk.models.components.LiveRateCreateRequestAddressFrom;
import com.goshippo.shippo_sdk.models.components.LiveRateCreateRequestAddressTo;
import com.goshippo.shippo_sdk.models.components.LiveRateCreateRequestParcel;
import com.goshippo.shippo_sdk.models.components.Parcel;
import com.goshippo.shippo_sdk.models.components.ServiceGroupAccountAndServiceLevel;
import com.goshippo.shippo_sdk.models.components.ServiceGroupCreateRequest;
import com.goshippo.shippo_sdk.models.components.ServiceGroupTypeEnum;
import com.goshippo.shippo_sdk.models.components.ServiceLevelUPSEnum;
import com.goshippo.shippo_sdk.models.components.WeightUnitEnum;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class RatesAtCheckoutTests extends SdkProvider {

    @BeforeAll
    static void setupSpec() throws Exception {
        deleteAllServiceGroups();
    }

    private static void deleteAllServiceGroups() throws Exception {
        final var response = getSdk().serviceGroups().listDirect();
        for (var sg : response.serviceGroupListResponse().get()) {
            getSdk().serviceGroups().delete(sg.objectId());
        }
    }

    @Test
    public void shouldRetrieveRateAtCheckout() throws Exception {
        final var carrierAccount = getCarrierAccount(CarriersEnum.UPS);
        final var upsAccountId = carrierAccount.objectId().get();

        List<ServiceGroupAccountAndServiceLevel> serviceLevels = new ArrayList<>();
        for (var availableServiceLevel : List.of(ServiceLevelUPSEnum.UPS_GROUND, ServiceLevelUPSEnum.UPS_NEXT_DAY_AIR_SAVER)) {
            serviceLevels.add(ServiceGroupAccountAndServiceLevel.builder()
                    .accountObjectId(upsAccountId)
                    .serviceLevelToken(availableServiceLevel.value())
                    .build());
        }

        final var serviceGroupResponse = getSdk().serviceGroups().create()
                .serviceGroupCreateRequest(
                        ServiceGroupCreateRequest.builder()
                                .name("UPS shipping")
                                .description("UPS shipping options")
                                .flatRate("5")
                                .flatRateCurrency("USD")
                                .type(ServiceGroupTypeEnum.LIVE_RATE)
                                .serviceLevels(serviceLevels)
                                .build())
                .call();

        final var serviceGroup = serviceGroupResponse.serviceGroup().get();
        assertNotNull(serviceGroup);

        final var ratesAtCheckoutResponse = getSdk().ratesAtCheckout().create(
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
                        .build());

        final var ratesAtCheckout = ratesAtCheckoutResponse.liveRatePaginatedList().get().results().get();
        assertInstanceOf(List.class, ratesAtCheckout);
        assertNotNull(ratesAtCheckout);
        assertFalse(ratesAtCheckout.isEmpty());

        for (var liveRate : ratesAtCheckout) {
            assertEquals(serviceGroup.name(), liveRate.title().get());
        }
    }
}

