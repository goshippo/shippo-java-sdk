/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.operations;

import com.goshippo.shippo_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetOrderRequestBuilder {

    private String orderId;
    private Optional<String> shippoApiVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetOrder sdk;

    public GetOrderRequestBuilder(SDKMethodInterfaces.MethodCallGetOrder sdk) {
        this.sdk = sdk;
    }

    public GetOrderRequestBuilder orderId(String orderId) {
        Utils.checkNotNull(orderId, "orderId");
        this.orderId = orderId;
        return this;
    }
                
    public GetOrderRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public GetOrderRequestBuilder shippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public GetOrderResponse call() throws Exception {

        return sdk.get(
            orderId,
            shippoApiVersion);
    }
}
