/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.operations;

import com.goshippo.shippo_sdk.utils.Utils;

public class ListShipmentsRequestBuilder {

    private ListShipmentsRequest request;
    private final SDKMethodInterfaces.MethodCallListShipments sdk;

    public ListShipmentsRequestBuilder(SDKMethodInterfaces.MethodCallListShipments sdk) {
        this.sdk = sdk;
    }

    public ListShipmentsRequestBuilder request(ListShipmentsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListShipmentsResponse call() throws Exception {

        return sdk.list(
            request);
    }
}