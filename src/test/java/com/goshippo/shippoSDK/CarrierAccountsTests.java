package com.goshippo.shippoSDK;

import com.goshippo.shippoSDK.models.components.CarrierAccountPaginatedList;
import com.goshippo.shippoSDK.models.operations.ListCarrierAccountsRequest;
import com.goshippo.shippoSDK.models.operations.ListCarrierAccountsResponse;
import org.junit.jupiter.api.Test;

import static com.goshippo.shippoSDK.SdkProvider.getSdk;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarrierAccountsTests {

    @Test
    public void shouldGetAllCarrierAccounts() throws Exception {
        final var request = ListCarrierAccountsRequest.builder()
                .build();

        final var response = getSdk().carrierAccounts().list()
                .request(request)
                .call();

        assertInstanceOf(ListCarrierAccountsResponse.class, response);
        assertNotNull(response);
        assertInstanceOf(CarrierAccountPaginatedList.class, response.carrierAccountPaginatedList().get());
        assertNotNull(response.carrierAccountPaginatedList().get());
    }
}
