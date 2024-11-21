/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.sdk.models.operations;

import com.goshippo.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class ListUserParcelTemplatesRequestBuilder {

    private Optional<String> shippoApiVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListUserParcelTemplates sdk;

    public ListUserParcelTemplatesRequestBuilder(SDKMethodInterfaces.MethodCallListUserParcelTemplates sdk) {
        this.sdk = sdk;
    }
                
    public ListUserParcelTemplatesRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public ListUserParcelTemplatesRequestBuilder shippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public ListUserParcelTemplatesResponse call() throws Exception {

        return sdk.list(
            shippoApiVersion);
    }
}