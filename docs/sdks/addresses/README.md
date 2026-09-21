# Addresses

## Overview

Addresses are the locations a parcel is being shipped **from** and **to**. They represent company and residential places. Among other things, you can use address objects to create shipments, calculate shipping rates, and purchase shipping labels.

### Available Operations

* [list](#list) - List all addresses
* [create](#create) - Create a new address
* [get](#get) - Retrieve an address
* [validate](#validate) - Validate an address

## list

Returns a list of all address objects that have been created in this account.

### Example Usage

<!-- UsageSnippet language="java" operationID="ListAddresses" method="get" path="/addresses" -->
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

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `page`                                                        | *Optional\<Long>*                                             | :heavy_minus_sign:                                            | The page number you want to select                            |
| `results`                                                     | *Optional\<Long>*                                             | :heavy_minus_sign:                                            | The number of results to return per page (max 100, default 5) |

### Response

**[ListAddressesResponse](../../models/operations/ListAddressesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## create

Creates a new address object. You can use address objects to create new shipments, calculate rates, and to create orders.

### Example Usage

<!-- UsageSnippet language="java" operationID="CreateAddress" method="post" path="/addresses" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.components.AddressCreateRequest;
import com.goshippo.shippo_sdk.models.operations.CreateAddressResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        AddressCreateRequest req = AddressCreateRequest.builder()
                .country("US")
                .name("Shwan Ippotle")
                .company("Shippo")
                .street1("215 Clayton St.")
                .street3("")
                .streetNo("")
                .city("San Francisco")
                .state("CA")
                .zip("94117")
                .phone("+1 555 341 9393")
                .email("shippotle@shippo.com")
                .isResidential(true)
                .metadata("Customer ID 123456")
                .validate(true)
                .build();

        CreateAddressResponse res = sdk.addresses().create()
                .request(req)
                .call();

        if (res.address().isPresent()) {
            System.out.println(res.address().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [AddressCreateRequest](../../models/shared/AddressCreateRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[CreateAddressResponse](../../models/operations/CreateAddressResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Returns an existing address using an object ID.

### Example Usage

<!-- UsageSnippet language="java" operationID="GetAddress" method="get" path="/addresses/{AddressId}" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.GetAddressResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        GetAddressResponse res = sdk.addresses().get()
                .addressId("<id>")
                .call();

        if (res.address().isPresent()) {
            System.out.println(res.address().get());
        }
    }
}
```

### Parameters

| Parameter                | Type                     | Required                 | Description              |
| ------------------------ | ------------------------ | ------------------------ | ------------------------ |
| `addressId`              | *String*                 | :heavy_check_mark:       | Object ID of the address |

### Response

**[GetAddressResponse](../../models/operations/GetAddressResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## validate

Validates an existing address using an object ID

### Example Usage

<!-- UsageSnippet language="java" operationID="ValidateAddress" method="get" path="/addresses/{AddressId}/validate" -->
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.ValidateAddressResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .shippoApiVersion("2018-02-08")
                .apiKeyHeader(System.getenv().getOrDefault("API_KEY_HEADER", ""))
            .build();

        ValidateAddressResponse res = sdk.addresses().validate()
                .addressId("<id>")
                .call();

        if (res.address().isPresent()) {
            System.out.println(res.address().get());
        }
    }
}
```

### Parameters

| Parameter                | Type                     | Required                 | Description              |
| ------------------------ | ------------------------ | ------------------------ | ------------------------ |
| `addressId`              | *String*                 | :heavy_check_mark:       | Object ID of the address |

### Response

**[ValidateAddressResponse](../../models/operations/ValidateAddressResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |