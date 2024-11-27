/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.operations;

import com.goshippo.shippo_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class RegisterCarrierAccountRequestBuilder {

    private Optional<String> shippoApiVersion = Optional.empty();
    private RegisterCarrierAccountRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallRegisterCarrierAccount sdk;

    public RegisterCarrierAccountRequestBuilder(SDKMethodInterfaces.MethodCallRegisterCarrierAccount sdk) {
        this.sdk = sdk;
    }
                
    public RegisterCarrierAccountRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public RegisterCarrierAccountRequestBuilder shippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public RegisterCarrierAccountRequestBuilder requestBody(RegisterCarrierAccountRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public RegisterCarrierAccountResponse call() throws Exception {

        return sdk.register(
            shippoApiVersion,
            requestBody);
    }
}