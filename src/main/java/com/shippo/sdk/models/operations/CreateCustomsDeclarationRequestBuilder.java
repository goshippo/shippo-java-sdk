/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;

import com.shippo.sdk.models.components.CustomsDeclarationCreateRequest;
import com.shippo.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class CreateCustomsDeclarationRequestBuilder {

    private Optional<String> shippoApiVersion = Optional.empty();
    private CustomsDeclarationCreateRequest customsDeclarationCreateRequest;
    private final SDKMethodInterfaces.MethodCallCreateCustomsDeclaration sdk;

    public CreateCustomsDeclarationRequestBuilder(SDKMethodInterfaces.MethodCallCreateCustomsDeclaration sdk) {
        this.sdk = sdk;
    }
                
    public CreateCustomsDeclarationRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public CreateCustomsDeclarationRequestBuilder shippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public CreateCustomsDeclarationRequestBuilder customsDeclarationCreateRequest(CustomsDeclarationCreateRequest customsDeclarationCreateRequest) {
        Utils.checkNotNull(customsDeclarationCreateRequest, "customsDeclarationCreateRequest");
        this.customsDeclarationCreateRequest = customsDeclarationCreateRequest;
        return this;
    }

    public CreateCustomsDeclarationResponse call() throws Exception {

        return sdk.create(
            shippoApiVersion,
            customsDeclarationCreateRequest);
    }
}
