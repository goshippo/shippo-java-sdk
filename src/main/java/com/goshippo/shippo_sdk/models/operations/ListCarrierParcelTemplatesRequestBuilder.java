/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.operations;

import com.goshippo.shippo_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class ListCarrierParcelTemplatesRequestBuilder {

    private Optional<? extends Include> include = Optional.empty();
    private Optional<String> carrier = Optional.empty();
    private Optional<String> shippoApiVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListCarrierParcelTemplates sdk;

    public ListCarrierParcelTemplatesRequestBuilder(SDKMethodInterfaces.MethodCallListCarrierParcelTemplates sdk) {
        this.sdk = sdk;
    }
                
    public ListCarrierParcelTemplatesRequestBuilder include(Include include) {
        Utils.checkNotNull(include, "include");
        this.include = Optional.of(include);
        return this;
    }

    public ListCarrierParcelTemplatesRequestBuilder include(Optional<? extends Include> include) {
        Utils.checkNotNull(include, "include");
        this.include = include;
        return this;
    }
                
    public ListCarrierParcelTemplatesRequestBuilder carrier(String carrier) {
        Utils.checkNotNull(carrier, "carrier");
        this.carrier = Optional.of(carrier);
        return this;
    }

    public ListCarrierParcelTemplatesRequestBuilder carrier(Optional<String> carrier) {
        Utils.checkNotNull(carrier, "carrier");
        this.carrier = carrier;
        return this;
    }
                
    public ListCarrierParcelTemplatesRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public ListCarrierParcelTemplatesRequestBuilder shippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public ListCarrierParcelTemplatesResponse call() throws Exception {

        return sdk.list(
            include,
            carrier,
            shippoApiVersion);
    }
}