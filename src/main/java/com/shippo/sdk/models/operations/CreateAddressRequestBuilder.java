/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;

import com.shippo.sdk.models.components.AddressCreateRequest;
import com.shippo.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class CreateAddressRequestBuilder {

    private Optional<String> shippoApiVersion = Optional.empty();
    private AddressCreateRequest addressCreateRequest;
    private final SDKMethodInterfaces.MethodCallCreateAddress sdk;

    public CreateAddressRequestBuilder(SDKMethodInterfaces.MethodCallCreateAddress sdk) {
        this.sdk = sdk;
    }
                
    public CreateAddressRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public CreateAddressRequestBuilder shippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public CreateAddressRequestBuilder addressCreateRequest(AddressCreateRequest addressCreateRequest) {
        Utils.checkNotNull(addressCreateRequest, "addressCreateRequest");
        this.addressCreateRequest = addressCreateRequest;
        return this;
    }

    public CreateAddressResponse call() throws Exception {

        return sdk.create(
            shippoApiVersion,
            addressCreateRequest);
    }
}
