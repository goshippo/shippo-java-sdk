import com.shippo.sdk.Shippo
import com.shippo.sdk.models.components.CarrierAccountWithExtraInfo
import com.shippo.sdk.models.components.CarriersEnum
import com.shippo.sdk.models.operations.ListCarrierAccountsRequest
import com.shippo.sdk.models.operations.ListCarrierAccountsResponse

trait SdkProvider {

    private static Shippo _sdk

    Shippo getSdk() {
        if (_sdk == null) {
            String token = System.getenv("SHIPPO_TOKEN")
            _sdk = Shippo.builder()
                    .apiKeyHeader(token)
                    .build()
        }
        return _sdk
    }

    CarrierAccountWithExtraInfo getCarrierAccount(CarriersEnum carrier) {
        return getCarrierAccounts(carrier).get(0)
    }

    List<CarrierAccountWithExtraInfo> getCarrierAccounts(CarriersEnum carrier) {
        ListCarrierAccountsResponse response = getSdk().carrierAccounts().list()
                .request(ListCarrierAccountsRequest.builder().carrier(carrier).build())
                .call()
        return response.carrierAccountPaginatedList().get().results().get()
    }

}
