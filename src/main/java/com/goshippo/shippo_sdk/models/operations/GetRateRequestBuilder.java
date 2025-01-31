/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.operations;

import com.goshippo.shippo_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetRateRequestBuilder {

    private String rateId;
    private Optional<String> shippoApiVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetRate sdk;

    public GetRateRequestBuilder(SDKMethodInterfaces.MethodCallGetRate sdk) {
        this.sdk = sdk;
    }

    public GetRateRequestBuilder rateId(String rateId) {
        Utils.checkNotNull(rateId, "rateId");
        this.rateId = rateId;
        return this;
    }
                
    public GetRateRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public GetRateRequestBuilder shippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public GetRateResponse call() throws Exception {

        return sdk.get(
            rateId,
            shippoApiVersion);
    }
}
