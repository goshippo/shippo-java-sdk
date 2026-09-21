# TrackingStatus

## Overview

<p style="text-align: center; background-color: #F2F3F4;"><br>
If you purchased your shipping label through Shippo, you can also get all the tracking details of your Shipment 
from the [Transaction](/shippoapi/public-api/transactions) object.
<br><br></p>
A tracking status of a package is an indication of current location of a package in the supply chain. For example,  sorting, warehousing, or out for delivery. Use the tracking status object to track the location of your shipments.

When using your [Test](https://docs.goshippo.com/docs/guides_general/authentication/) token for tracking, you need to use Shippo's 
predefined tokens for testing different tracking statuses. You can find more information in our 
[Tracking tutorial](https://docs.goshippo.com/docs/tracking/tracking/) on how to do this, and what the 
payloads look like.      

### Available Operations

* [create](#create) - Register a tracking webhook
* [get](#get) - Get a tracking status

## create

Registers a webhook that will send HTTP notifications to you when the status of your tracked package changes. For more details on creating a webhook, see our guides on [Webhooks](https://docs.goshippo.com/docs/tracking/webhooks/) and [Tracking](https://docs.goshippo.com/docs/tracking/tracking/).

### Example Usage

<!-- UsageSnippet language="java" operationID="CreateTrack" method="post" path="/tracks" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.CreateTrackResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        CreateTrackResponse res = sdk.trackingStatus().create()
                .carrier("usps")
                .metadata("Order 000123")
                .trackingNumber("9205590164917312751089")
                .call();

        if (res.track().isPresent()) {
            System.out.println(res.track().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                             | Type                                                                                                                  | Required                                                                                                              | Description                                                                                                           | Example                                                                                                               |
| --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| `carrier`                                                                                                             | *String*                                                                                                              | :heavy_check_mark:                                                                                                    | Name of the carrier of the shipment to track.                                                                         | usps                                                                                                                  |
| `metadata`                                                                                                            | *Optional\<String>*                                                                                                   | :heavy_minus_sign:                                                                                                    | A string of up to 100 characters that can be filled with any additional information you want to attach to the object. | Order 000123                                                                                                          |
| `trackingNumber`                                                                                                      | *String*                                                                                                              | :heavy_check_mark:                                                                                                    | Tracking number to track.                                                                                             | 9205590164917312751089                                                                                                |

### Response

**[CreateTrackResponse](../../models/operations/CreateTrackResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Returns the tracking status of a shipment using a carrier name and a tracking number.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetTrack" method="get" path="/tracks/{Carrier}/{TrackingNumber}" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.GetTrackResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        GetTrackResponse res = sdk.trackingStatus().get()
                .trackingNumber("<value>")
                .carrier("<value>")
                .call();

        if (res.track().isPresent()) {
            System.out.println(res.track().get());
        }
    }
}
```

### Parameters

| Parameter           | Type                | Required            | Description         |
| ------------------- | ------------------- | ------------------- | ------------------- |
| `trackingNumber`    | *String*            | :heavy_check_mark:  | Tracking number     |
| `carrier`           | *String*            | :heavy_check_mark:  | Name of the carrier |

### Response

**[GetTrackResponse](../../models/operations/GetTrackResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |