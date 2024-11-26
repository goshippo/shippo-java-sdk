# <img src="https://docs.goshippo.com/images/Logo.png" width="30" alt="Shippo logo"> Shippo Java SDK

Shippo is a shipping API that connects you with [multiple shipping carriers](https://goshippo.com/carriers) (such as USPS, UPS, DHL, Canada Post, 
Australia Post, and many others) through one interface.

You must register for a [Shippo account](https://apps.goshippo.com/join) to use our API. It's free to sign up. Only pay to print a live label, 
test labels are free.

To use the API, you must generate an [API Token](https://docs.goshippo.com/docs/guides_general/authentication/). In the following examples, replace `<YOUR_API_KEY_HERE>` with 
your own token.

For example.
```
Shippo sdk = Shippo.builder()
    .apiKeyHeader("<YOUR_API_KEY_HERE>")
    .build();
```

<!-- Start Summary [summary] -->
## Summary

Shippo external API.: Use this API to integrate with the Shippo service
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents

* [SDK Installation](#sdk-installation)
* [SDK Example Usage](#sdk-example-usage)
* [Available Resources and Operations](#available-resources-and-operations)
* [Error Handling](#error-handling)
* [Server Selection](#server-selection)
* [Authentication](#authentication)
<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'com.goshippo:shippoSDK:1.0.0-beta.1'
```

Maven:
```xml
<dependency>
    <groupId>com.goshippo</groupId>
    <artifactId>shippoSDK</artifactId>
    <version>1.0.0-beta.1</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.ListAddressesResponse;

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

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [addresses()](docs/sdks/addresses/README.md)

* [list](docs/sdks/addresses/README.md#list) - List all addresses
* [create](docs/sdks/addresses/README.md#create) - Create a new address
* [get](docs/sdks/addresses/README.md#get) - Retrieve an address
* [validate](docs/sdks/addresses/README.md#validate) - Validate an address

### [batches()](docs/sdks/batches/README.md)

* [create](docs/sdks/batches/README.md#create) - Create a batch
* [get](docs/sdks/batches/README.md#get) - Retrieve a batch
* [addShipments](docs/sdks/batches/README.md#addshipments) - Add shipments to a batch
* [purchase](docs/sdks/batches/README.md#purchase) - Purchase a batch
* [removeShipments](docs/sdks/batches/README.md#removeshipments) - Remove shipments from a batch

### [carrierAccounts()](docs/sdks/carrieraccounts/README.md)

* [list](docs/sdks/carrieraccounts/README.md#list) - List all carrier accounts
* [create](docs/sdks/carrieraccounts/README.md#create) - Create a new carrier account
* [get](docs/sdks/carrieraccounts/README.md#get) - Retrieve a carrier account
* [update](docs/sdks/carrieraccounts/README.md#update) - Update a carrier account
* [initiateOauth2Signin](docs/sdks/carrieraccounts/README.md#initiateoauth2signin) - Connect an existing carrier account using OAuth 2.0
* [register](docs/sdks/carrieraccounts/README.md#register) - Add a Shippo carrier account
* [getRegistrationStatus](docs/sdks/carrieraccounts/README.md#getregistrationstatus) - Get Carrier Registration status

### [carrierParcelTemplates()](docs/sdks/carrierparceltemplates/README.md)

* [list](docs/sdks/carrierparceltemplates/README.md#list) - List all carrier parcel templates
* [get](docs/sdks/carrierparceltemplates/README.md#get) - Retrieve a carrier parcel templates

### [customsDeclarations()](docs/sdks/customsdeclarations/README.md)

* [list](docs/sdks/customsdeclarations/README.md#list) - List all customs declarations
* [create](docs/sdks/customsdeclarations/README.md#create) - Create a new customs declaration
* [get](docs/sdks/customsdeclarations/README.md#get) - Retrieve a customs declaration

### [customsItems()](docs/sdks/customsitems/README.md)

* [list](docs/sdks/customsitems/README.md#list) - List all customs items
* [create](docs/sdks/customsitems/README.md#create) - Create a new customs item
* [get](docs/sdks/customsitems/README.md#get) - Retrieve a customs item

### [manifests()](docs/sdks/manifests/README.md)

* [list](docs/sdks/manifests/README.md#list) - List all manifests
* [create](docs/sdks/manifests/README.md#create) - Create a new manifest
* [get](docs/sdks/manifests/README.md#get) - Retrieve a manifest

### [orders()](docs/sdks/orders/README.md)

* [list](docs/sdks/orders/README.md#list) - List all orders
* [create](docs/sdks/orders/README.md#create) - Create a new order
* [get](docs/sdks/orders/README.md#get) - Retrieve an order

### [parcels()](docs/sdks/parcels/README.md)

* [list](docs/sdks/parcels/README.md#list) - List all parcels
* [create](docs/sdks/parcels/README.md#create) - Create a new parcel
* [get](docs/sdks/parcels/README.md#get) - Retrieve an existing parcel

### [pickups()](docs/sdks/pickups/README.md)

* [create](docs/sdks/pickups/README.md#create) - Create a pickup

### [rates()](docs/sdks/rates/README.md)

* [get](docs/sdks/rates/README.md#get) - Retrieve a rate
* [listShipmentRates](docs/sdks/rates/README.md#listshipmentrates) - Retrieve shipment rates
* [listShipmentRatesByCurrencyCode](docs/sdks/rates/README.md#listshipmentratesbycurrencycode) - Retrieve shipment rates in currency

### [ratesAtCheckout()](docs/sdks/ratesatcheckout/README.md)

* [create](docs/sdks/ratesatcheckout/README.md#create) - Generate a live rates request
* [getDefaultParcelTemplate](docs/sdks/ratesatcheckout/README.md#getdefaultparceltemplate) - Show current default parcel template
* [updateDefaultParcelTemplate](docs/sdks/ratesatcheckout/README.md#updatedefaultparceltemplate) - Update default parcel template
* [deleteDefaultParcelTemplate](docs/sdks/ratesatcheckout/README.md#deletedefaultparceltemplate) - Clear current default parcel template

### [refunds()](docs/sdks/refunds/README.md)

* [create](docs/sdks/refunds/README.md#create) - Create a refund
* [list](docs/sdks/refunds/README.md#list) - List all refunds
* [get](docs/sdks/refunds/README.md#get) - Retrieve a refund

### [serviceGroups()](docs/sdks/servicegroups/README.md)

* [list](docs/sdks/servicegroups/README.md#list) - List all service groups
* [create](docs/sdks/servicegroups/README.md#create) - Create a new service group
* [update](docs/sdks/servicegroups/README.md#update) - Update an existing service group
* [delete](docs/sdks/servicegroups/README.md#delete) - Delete a service group

### [shipments()](docs/sdks/shipments/README.md)

* [list](docs/sdks/shipments/README.md#list) - List all shipments
* [create](docs/sdks/shipments/README.md#create) - Create a new shipment
* [get](docs/sdks/shipments/README.md#get) - Retrieve a shipment


### [shippoAccounts()](docs/sdks/shippoaccounts/README.md)

* [list](docs/sdks/shippoaccounts/README.md#list) - List all Shippo Accounts
* [create](docs/sdks/shippoaccounts/README.md#create) - Create a Shippo Account
* [get](docs/sdks/shippoaccounts/README.md#get) - Retrieve a Shippo Account
* [update](docs/sdks/shippoaccounts/README.md#update) - Update a Shippo Account

### [trackingStatus()](docs/sdks/trackingstatus/README.md)

* [create](docs/sdks/trackingstatus/README.md#create) - Register a tracking webhook
* [get](docs/sdks/trackingstatus/README.md#get) - Get a tracking status

### [transactions()](docs/sdks/transactions/README.md)

* [list](docs/sdks/transactions/README.md#list) - List all shipping labels
* [create](docs/sdks/transactions/README.md#create) - Create a shipping label
* [get](docs/sdks/transactions/README.md#get) - Retrieve a shipping label

### [userParcelTemplates()](docs/sdks/userparceltemplates/README.md)

* [list](docs/sdks/userparceltemplates/README.md#list) - List all user parcel templates
* [create](docs/sdks/userparceltemplates/README.md#create) - Create a new user parcel template
* [delete](docs/sdks/userparceltemplates/README.md#delete) - Delete a user parcel template
* [get](docs/sdks/userparceltemplates/README.md#get) - Retrieves a user parcel template
* [update](docs/sdks/userparceltemplates/README.md#update) - Update an existing user parcel template

### [webhooks()](docs/sdks/webhooks/README.md)

* [createWebhook](docs/sdks/webhooks/README.md#createwebhook) - Create a new webhook
* [listWebhooks](docs/sdks/webhooks/README.md#listwebhooks) - List all webhooks
* [getWebhook](docs/sdks/webhooks/README.md#getwebhook) - Retrieve a specific webhook
* [updateWebhook](docs/sdks/webhooks/README.md#updatewebhook) - Update an existing webhook
* [deleteWebhook](docs/sdks/webhooks/README.md#deletewebhook) - Delete a specific webhook

</details>
<!-- End Available Resources and Operations [operations] -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!

## About Shippo
Connect with multiple different carriers, get discounted shipping labels, track parcels, and much more with just one integration.
You can use your own carrier accounts or take advantage of our discounted rates with the Shippo carrier accounts.
Using Shippo makes it easy to deal with multiple carrier integrations, rate shopping, tracking and other parts of the shipping workflow.
We provide the API and web app for all your shipping needs.<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.

By default, an API error will throw a `models/errors/SDKError` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `initiateOauth2Signin` method throws the following exceptions:

| Error Type                                                            | Status Code | Content Type     |
| --------------------------------------------------------------------- | ----------- | ---------------- |
| models/errors/InitiateOauth2SigninResponseBody                        | 400         | application/json |
| models/errors/InitiateOauth2SigninCarrierAccountsResponseBody         | 401         | application/json |
| models/errors/InitiateOauth2SigninCarrierAccountsResponseResponseBody | 404         | application/json |
| models/errors/SDKError                                                | 4XX, 5XX    | \*/\*            |

### Example

```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.errors.InitiateOauth2SigninCarrierAccountsResponseBody;
import com.goshippo.shippo_sdk.models.errors.InitiateOauth2SigninCarrierAccountsResponseResponseBody;
import com.goshippo.shippo_sdk.models.errors.InitiateOauth2SigninResponseBody;
import com.goshippo.shippo_sdk.models.operations.InitiateOauth2SigninResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws InitiateOauth2SigninResponseBody, InitiateOauth2SigninCarrierAccountsResponseBody, InitiateOauth2SigninCarrierAccountsResponseResponseBody, Exception {

        Shippo sdk = Shippo.builder()
                .apiKeyHeader("<YOUR_API_KEY_HERE>")
                .shippoApiVersion("2018-02-08")
            .build();

        InitiateOauth2SigninResponse res = sdk.carrierAccounts().initiateOauth2Signin()
                .carrierAccountObjectId("<id>")
                .redirectUri("https://enlightened-mortise.com/")
                .state("Louisiana")
                .shippoApiVersion("2018-02-08")
                .call();

        // handle response
    }
}
```
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Override Server URL Per-Client

The default server can also be overridden globally using the `.serverURL(String serverUrl)` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.ListAddressesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Shippo sdk = Shippo.builder()
                .serverURL("https://api.goshippo.com")
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
<!-- End Server Selection [server] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name           | Type   | Scheme  |
| -------------- | ------ | ------- |
| `apiKeyHeader` | apiKey | API key |

To authenticate with the API the `apiKeyHeader` parameter must be set when initializing the SDK client instance. For example:
```java
package hello.world;

import com.goshippo.shippo_sdk.Shippo;
import com.goshippo.shippo_sdk.models.operations.ListAddressesResponse;
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
<!-- End Authentication [security] -->



<!-- No SDK Installation -->
<!-- No SDK Example Usage -->
<!-- No SDK Available Operations -->
<!-- Placeholder for Future Speakeasy SDK Sections -->


