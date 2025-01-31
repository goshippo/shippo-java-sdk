/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.operations;

import com.goshippo.shippo_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetDefaultParcelTemplateRequestBuilder {

    private Optional<String> shippoApiVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetDefaultParcelTemplate sdk;

    public GetDefaultParcelTemplateRequestBuilder(SDKMethodInterfaces.MethodCallGetDefaultParcelTemplate sdk) {
        this.sdk = sdk;
    }
                
    public GetDefaultParcelTemplateRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public GetDefaultParcelTemplateRequestBuilder shippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public GetDefaultParcelTemplateResponse call() throws Exception {

        return sdk.getDefaultParcelTemplate(
            shippoApiVersion);
    }
}
