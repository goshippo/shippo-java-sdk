# Rates
(*rates()*)

## Overview

A rate is the cost to ship a parcel from a carrier. The rate object details the service level including the cost and transit time. 
<SchemaDefinition schemaRef="#/components/schemas/Rate"/>

### Available Operations

* [get](#get) - Retrieve a rate
* [listShipmentRates](#listshipmentrates) - Retrieve shipment rates
* [listShipmentRatesByCurrencyCode](#listshipmentratesbycurrencycode) - Retrieve shipment rates in currency

## get

Returns an existing rate using a rate object ID.

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.operations.GetRateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        GetRateResponse res = sdk.rates().get()
                .rateId("<id>")
                .shippoApiVersion("2018-02-08")
                .call();

        if (res.rate().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `rateId`                                                                                                                                                           | *String*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | Object ID of the rate                                                                                                                                              |                                                                                                                                                                    |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |

### Response

**[GetRateResponse](../../models/operations/GetRateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listShipmentRates

Returns a paginated list of rates associated with a shipment

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.operations.ListShipmentRatesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        ListShipmentRatesResponse res = sdk.rates().listShipmentRates()
                .shipmentId("<id>")
                .page(1L)
                .results(25L)
                .shippoApiVersion("2018-02-08")
                .call();

        if (res.ratePaginatedList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `shipmentId`                                                                                                                                                       | *String*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | Object ID of the shipment to update                                                                                                                                |                                                                                                                                                                    |
| `page`                                                                                                                                                             | *Optional\<Long>*                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                 | The page number you want to select                                                                                                                                 |                                                                                                                                                                    |
| `results`                                                                                                                                                          | *Optional\<Long>*                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                 | The number of results to return per page (max 100)                                                                                                                 |                                                                                                                                                                    |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |

### Response

**[ListShipmentRatesResponse](../../models/operations/ListShipmentRatesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listShipmentRatesByCurrencyCode

Returns all available shipping rates for a shipment object.

When you create a new valid shipment object, Shippo automatically calculates all available rates. Depending on your shipment data, there may be none, one or multiple rates.

By default, the calculated rates will return the price in two currencies under the `amount` and `amount_local` keys, respectively. The `amount` key will contain the price of a rate expressed in the currency that is used in the country from where the parcel originates, and the `amount_local` key will contain the price expressed in the currency that is used in the country the parcel is shipped to. You can request rates with prices expressed in a different currency by adding the currency code to the end of the resource URL. The full list of supported currencies along with their codes can be viewed on <a href="http://openexchangerates.org/api/currencies.json">open exchange rates</a>.

Note: re-requesting the rates with a different currency code will re-queue the shipment (i.e. set the Shipment's `status` to `QUEUED`) and the converted currency rates will only be available when the Shipment's `status` is set to `SUCCESS`.

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.operations.ListShipmentRatesByCurrencyCodeRequest;
import com.shippo.sdk.models.operations.ListShipmentRatesByCurrencyCodeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        ListShipmentRatesByCurrencyCodeRequest req = ListShipmentRatesByCurrencyCodeRequest.builder()
                .shipmentId("<id>")
                .currencyCode("USD")
                .build();

        ListShipmentRatesByCurrencyCodeResponse res = sdk.rates().listShipmentRatesByCurrencyCode()
                .request(req)
                .call();

        if (res.ratePaginatedList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [ListShipmentRatesByCurrencyCodeRequest](../../models/operations/ListShipmentRatesByCurrencyCodeRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[ListShipmentRatesByCurrencyCodeResponse](../../models/operations/ListShipmentRatesByCurrencyCodeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |