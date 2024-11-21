# TrackingStatus
(*trackingStatus()*)

## Overview

<p style="text-align: center; background-color: #F2F3F4;"></br>
If you purchased your shipping label through Shippo, you can also get all the tracking details of your Shipment 
from the <a href="#tag/Transactions">Transaction</a> object.
</br></br></p>
A tracking status of a package is an indication of current location of a package in the supply chain. For example,  sorting, warehousing, or out for delivery. Use the tracking status object to track the location of your shipments.

When using your <a href="https://docs.goshippo.com/docs/guides_general/authentication/">Test</a> token for tracking, you need to use Shippo's 
predefined tokens for testing different tracking statuses. You can find more information in our 
<a href="https://docs.goshippo.com/docs/tracking/tracking/">Tracking tutorial</a> on how to do this, and what the 
payloads look like.      
<SchemaDefinition schemaRef="#/components/schemas/Track"/>

### Available Operations

* [create](#create) - Register a tracking webhook
* [get](#get) - Get a tracking status

## create

Registers a webhook that will send HTTP notifications to you when the status of your tracked package changes. For more details on creating a webhook, see our guides on <a href="https://docs.goshippo.com/docs/tracking/webhooks/">Webhooks</a> and <a href="https://docs.goshippo.com/docs/tracking/tracking/">Tracking</a>.

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.components.TracksRequest;
import com.shippo.sdk.models.operations.CreateTrackResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        CreateTrackResponse res = sdk.trackingStatus().create()
                .shippoApiVersion("2018-02-08")
                .tracksRequest(TracksRequest.builder()
                    .carrier("usps")
                    .trackingNumber("9205590164917312751089")
                    .metadata("Order 000123")
                    .build())
                .call();

        if (res.track().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |
| `tracksRequest`                                                                                                                                                    | [TracksRequest](../../models/components/TracksRequest.md)                                                                                                          | :heavy_check_mark:                                                                                                                                                 | N/A                                                                                                                                                                |                                                                                                                                                                    |

### Response

**[CreateTrackResponse](../../models/operations/CreateTrackResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Returns the tracking status of a shipment using a carrier name and a tracking number.

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.operations.GetTrackResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        GetTrackResponse res = sdk.trackingStatus().get()
                .trackingNumber("<value>")
                .carrier("<value>")
                .shippoApiVersion("2018-02-08")
                .call();

        if (res.track().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `trackingNumber`                                                                                                                                                   | *String*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | Tracking number                                                                                                                                                    |                                                                                                                                                                    |
| `carrier`                                                                                                                                                          | *String*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | Name of the carrier                                                                                                                                                |                                                                                                                                                                    |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |

### Response

**[GetTrackResponse](../../models/operations/GetTrackResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |