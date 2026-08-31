# Rates

## Overview

A rate is the cost to ship a parcel from a carrier. The rate object details the service level including the cost and transit time. 

### Available Operations

* [get](#get) - Retrieve a rate
* [listShipmentRates](#listshipmentrates) - Retrieve shipment rates
* [listShipmentRatesByCurrencyCode](#listshipmentratesbycurrencycode) - Retrieve shipment rates in currency

## get

Returns an existing rate using a rate object ID. Rates older than 390 days are not returned.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetRate" method="get" path="/rates/{RateId}" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.GetRateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        GetRateResponse res = sdk.rates().get()
                .rateId("<id>")
                .call();

        if (res.rate().isPresent()) {
            System.out.println(res.rate().get());
        }
    }
}
```

### Parameters

| Parameter             | Type                  | Required              | Description           |
| --------------------- | --------------------- | --------------------- | --------------------- |
| `rateId`              | *String*              | :heavy_check_mark:    | Object ID of the rate |

### Response

**[GetRateResponse](../../models/operations/GetRateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listShipmentRates

Returns a paginated list of rates associated with a shipment. Rates for shipments older than 390 days are not returned.

### Example Usage

<!-- UsageSnippet language="java" operationID="ListShipmentRates" method="get" path="/shipments/{ShipmentId}/rates" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.ListShipmentRatesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        ListShipmentRatesResponse res = sdk.rates().listShipmentRates()
                .shipmentId("<id>")
                .page(1L)
                .results(25L)
                .call();

        if (res.ratePaginatedList().isPresent()) {
            System.out.println(res.ratePaginatedList().get());
        }
    }
}
```

### Parameters

| Parameter                                          | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `shipmentId`                                       | *String*                                           | :heavy_check_mark:                                 | Object ID of the shipment to update                |
| `page`                                             | *Optional\<Long>*                                  | :heavy_minus_sign:                                 | The page number you want to select                 |
| `results`                                          | *Optional\<Long>*                                  | :heavy_minus_sign:                                 | The number of results to return per page (max 100) |

### Response

**[ListShipmentRatesResponse](../../models/operations/ListShipmentRatesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listShipmentRatesByCurrencyCode

Returns all available shipping rates for a shipment object.

When you create a new valid shipment object, Shippo automatically calculates all available rates. Depending on your shipment data, there may be none, one or multiple rates.

By default, the calculated rates will return the price in two currencies under the `amount` and `amount_local` keys, respectively. The `amount` key will contain the price of a rate expressed in the currency that is used in the country from where the parcel originates, and the `amount_local` key will contain the price expressed in the currency that is used in the country the parcel is shipped to. You can request rates with prices expressed in a different currency by adding the currency code to the end of the resource URL. The full list of supported currencies along with their codes can be viewed on [open exchange rates](http://openexchangerates.org/api/currencies.json).

Note: re-requesting the rates with a different currency code will re-queue the shipment (i.e. set the Shipment's `status` to `QUEUED`) and the converted currency rates will only be available when the Shipment's `status` is set to `SUCCESS`.

Rates for shipments older than 390 days are not returned.

### Example Usage

<!-- UsageSnippet language="java" operationID="ListShipmentRatesByCurrencyCode" method="get" path="/shipments/{ShipmentId}/rates/{CurrencyCode}" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.ListShipmentRatesByCurrencyCodeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        ListShipmentRatesByCurrencyCodeResponse res = sdk.rates().listShipmentRatesByCurrencyCode()
                .shipmentId("<id>")
                .currencyCode("USD")
                .page(1L)
                .results(25L)
                .call();

        if (res.ratePaginatedList().isPresent()) {
            System.out.println(res.ratePaginatedList().get());
        }
    }
}
```

### Parameters

| Parameter                                          | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `shipmentId`                                       | *String*                                           | :heavy_check_mark:                                 | Object ID of the shipment to update                |
| `currencyCode`                                     | *String*                                           | :heavy_check_mark:                                 | ISO currency code for the rates                    |
| `page`                                             | *Optional\<Long>*                                  | :heavy_minus_sign:                                 | The page number you want to select                 |
| `results`                                          | *Optional\<Long>*                                  | :heavy_minus_sign:                                 | The number of results to return per page (max 100) |

### Response

**[ListShipmentRatesByCurrencyCodeResponse](../../models/operations/ListShipmentRatesByCurrencyCodeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |