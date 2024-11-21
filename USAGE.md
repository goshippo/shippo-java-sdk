<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import com.goshippo.sdk.Shippo;
import com.goshippo.sdk.models.operations.ListAddressesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        ListAddressesResponse res = sdk.addresses().list()
                .page(1L)
                .results(5L)
                .shippoApiVersion("2018-02-08")
                .call();

        if (res.addressPaginatedList().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->