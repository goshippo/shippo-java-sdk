# Addresses
(*addresses()*)

## Overview

Addresses are the locations a parcel is being shipped **from** and **to**. They represent company and residential places. Among other things, you can use address objects to create shipments, calculate shipping rates, and purchase shipping labels.
<SchemaDefinition schemaRef="#/components/schemas/Address"/>

### Available Operations

* [list](#list) - List all addresses
* [create](#create) - Create a new address
* [get](#get) - Retrieve an address
* [validate](#validate) - Validate an address

## list

Returns a list of all address objects that have been created in this account.

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.operations.ListAddressesResponse;
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

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `page`                                                                                                                                                             | *Optional\<Long>*                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                 | The page number you want to select                                                                                                                                 |                                                                                                                                                                    |
| `results`                                                                                                                                                          | *Optional\<Long>*                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                 | The number of results to return per page (max 100, default 5)                                                                                                      |                                                                                                                                                                    |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |

### Response

**[ListAddressesResponse](../../models/operations/ListAddressesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## create

Creates a new address object. You can use address objects to create new shipments, calculate rates, and to create orders.

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.components.AddressCreateRequest;
import com.shippo.sdk.models.operations.CreateAddressResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        CreateAddressResponse res = sdk.addresses().create()
                .shippoApiVersion("2018-02-08")
                .addressCreateRequest(AddressCreateRequest.builder()
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
                    .build())
                .call();

        if (res.address().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |
| `addressCreateRequest`                                                                                                                                             | [AddressCreateRequest](../../models/components/AddressCreateRequest.md)                                                                                            | :heavy_check_mark:                                                                                                                                                 | Address details.                                                                                                                                                   |                                                                                                                                                                    |

### Response

**[CreateAddressResponse](../../models/operations/CreateAddressResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## get

Returns an existing address using an object ID.

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.operations.GetAddressResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        GetAddressResponse res = sdk.addresses().get()
                .addressId("<id>")
                .shippoApiVersion("2018-02-08")
                .call();

        if (res.address().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `addressId`                                                                                                                                                        | *String*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | Object ID of the address                                                                                                                                           |                                                                                                                                                                    |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |

### Response

**[GetAddressResponse](../../models/operations/GetAddressResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## validate

Validates an existing address using an object ID

### Example Usage

```java
package hello.world;

import com.shippo.sdk.Shippo;
import com.shippo.sdk.models.operations.ValidateAddressResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        ValidateAddressResponse res = sdk.addresses().validate()
                .addressId("<id>")
                .shippoApiVersion("2018-02-08")
                .call();

        if (res.address().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                          | Type                                                                                                                                                               | Required                                                                                                                                                           | Description                                                                                                                                                        | Example                                                                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `addressId`                                                                                                                                                        | *String*                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                 | Object ID of the address                                                                                                                                           |                                                                                                                                                                    |
| `shippoApiVersion`                                                                                                                                                 | *Optional\<String>*                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                 | Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide. | 2018-02-08                                                                                                                                                         |

### Response

**[ValidateAddressResponse](../../models/operations/ValidateAddressResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |