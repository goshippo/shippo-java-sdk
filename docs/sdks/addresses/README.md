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

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.ListAddressesRequest;
import com.shippo.shippo_java_sdk.models.operations.ListAddressesResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
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
        } catch (com.shippo.shippo_java_sdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `page`                                                        | *Optional<? extends Long>*                                    | :heavy_minus_sign:                                            | The page number you want to select                            |                                                               |
| `results`                                                     | *Optional<? extends Long>*                                    | :heavy_minus_sign:                                            | The number of results to return per page (max 100, default 5) |                                                               |
| `shippoApiVersion`                                            | *Optional<? extends String>*                                  | :heavy_minus_sign:                                            | String used to pick a non-default API version to use          | 2018-02-08                                                    |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.ListAddressesResponse>](../../models/operations/ListAddressesResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## create

Creates a new address object. You can use address objects to create new shipments, calculate rates, and to create orders.

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.AddressCreateRequest;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.CreateAddressRequest;
import com.shippo.shippo_java_sdk.models.operations.CreateAddressResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
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
        } catch (com.shippo.shippo_java_sdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                | Type                                                                                                                                     | Required                                                                                                                                 | Description                                                                                                                              | Example                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------- |
| `shippoApiVersion`                                                                                                                       | *Optional<? extends String>*                                                                                                             | :heavy_minus_sign:                                                                                                                       | String used to pick a non-default API version to use                                                                                     | 2018-02-08                                                                                                                               |
| `addressCreateRequest`                                                                                                                   | [Optional<? extends com.shippo.shippo_java_sdk.models.components.AddressCreateRequest>](../../models/components/AddressCreateRequest.md) | :heavy_minus_sign:                                                                                                                       | Address details.                                                                                                                         |                                                                                                                                          |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.CreateAddressResponse>](../../models/operations/CreateAddressResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## get

Returns an existing address using an object ID.

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.GetAddressRequest;
import com.shippo.shippo_java_sdk.models.operations.GetAddressResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
                .build();

            GetAddressResponse res = sdk.addresses().get()
                .addressId("<value>")
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.address().isPresent()) {
                // handle response
            }
        } catch (com.shippo.shippo_java_sdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                            | Type                                                 | Required                                             | Description                                          | Example                                              |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `addressId`                                          | *String*                                             | :heavy_check_mark:                                   | Object ID of the address                             |                                                      |
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.GetAddressResponse>](../../models/operations/GetAddressResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |

## validate

Validates an existing address using an object ID

### Example Usage

```java
package hello.world;

import com.shippo.shippo_java_sdk.Shippo;
import com.shippo.shippo_java_sdk.models.components.*;
import com.shippo.shippo_java_sdk.models.components.Security;
import com.shippo.shippo_java_sdk.models.operations.*;
import com.shippo.shippo_java_sdk.models.operations.ValidateAddressRequest;
import com.shippo.shippo_java_sdk.models.operations.ValidateAddressResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) {
        try {
            Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
                .build();

            ValidateAddressResponse res = sdk.addresses().validate()
                .addressId("<value>")
                .shippoApiVersion("2018-02-08")
                .call();

            if (res.address().isPresent()) {
                // handle response
            }
        } catch (com.shippo.shippo_java_sdk.models.errors.SDKError e) {
            // handle exception
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                            | Type                                                 | Required                                             | Description                                          | Example                                              |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `addressId`                                          | *String*                                             | :heavy_check_mark:                                   | Object ID of the address                             |                                                      |
| `shippoApiVersion`                                   | *Optional<? extends String>*                         | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |


### Response

**[Optional<? extends com.shippo.shippo_java_sdk.models.operations.ValidateAddressResponse>](../../models/operations/ValidateAddressResponse.md)**
### Errors

| Error Object           | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4xx-5xx                | */*                    |
