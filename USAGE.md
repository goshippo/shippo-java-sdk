<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.ListAddressesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        ListAddressesResponse res = sdk.addresses().list()
                .page(1L)
                .results(5L)
                .call();

        if (res.addressPaginatedList().isPresent()) {
            System.out.println(res.addressPaginatedList().get());
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->