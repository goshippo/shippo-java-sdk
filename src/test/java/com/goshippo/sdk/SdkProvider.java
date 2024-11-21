package com.goshippo.sdk;

import com.goshippo.sdk.models.components.CarrierAccountWithExtraInfo;
import com.goshippo.sdk.models.components.CarriersEnum;
import com.goshippo.sdk.models.operations.ListCarrierAccountsRequest;

import java.util.List;

public abstract class SdkProvider {

    private static Shippo sdk;

    protected static Shippo getSdk() {
        if (sdk == null) {
            final var token = System.getenv("SHIPPO_TOKEN");
            sdk = Shippo.builder()
                    .apiKeyHeader(token)
                    .build();
        }
        return sdk;
    }

    public CarrierAccountWithExtraInfo getCarrierAccount(CarriersEnum carrier) throws Exception {
        return getCarrierAccounts(carrier).get(0);
    }

    public List<CarrierAccountWithExtraInfo> getCarrierAccounts(CarriersEnum carrier) throws Exception {
        final var request = ListCarrierAccountsRequest.builder()
                .carrier(carrier)
                .build();
        final var response = getSdk().carrierAccounts().list()
                .request(request)
                .call();
        return response.carrierAccountPaginatedList().get().results().get();
    }
}
