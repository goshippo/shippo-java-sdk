/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.sdk.models.operations;

import com.goshippo.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class CreateParcelRequestBuilder {

    private Optional<String> shippoApiVersion = Optional.empty();
    private CreateParcelRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallCreateParcel sdk;

    public CreateParcelRequestBuilder(SDKMethodInterfaces.MethodCallCreateParcel sdk) {
        this.sdk = sdk;
    }
                
    public CreateParcelRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public CreateParcelRequestBuilder shippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public CreateParcelRequestBuilder requestBody(CreateParcelRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public CreateParcelResponse call() throws Exception {

        return sdk.create(
            shippoApiVersion,
            requestBody);
    }
}