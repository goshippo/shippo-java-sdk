/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.operations;

import com.goshippo.shippo_sdk.models.components.RefundRequestBody;
import com.goshippo.shippo_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class CreateRefundRequestBuilder {

    private Optional<String> shippoApiVersion = Optional.empty();
    private RefundRequestBody refundRequestBody;
    private final SDKMethodInterfaces.MethodCallCreateRefund sdk;

    public CreateRefundRequestBuilder(SDKMethodInterfaces.MethodCallCreateRefund sdk) {
        this.sdk = sdk;
    }
                
    public CreateRefundRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public CreateRefundRequestBuilder shippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public CreateRefundRequestBuilder refundRequestBody(RefundRequestBody refundRequestBody) {
        Utils.checkNotNull(refundRequestBody, "refundRequestBody");
        this.refundRequestBody = refundRequestBody;
        return this;
    }

    public CreateRefundResponse call() throws Exception {

        return sdk.create(
            shippoApiVersion,
            refundRequestBody);
    }
}