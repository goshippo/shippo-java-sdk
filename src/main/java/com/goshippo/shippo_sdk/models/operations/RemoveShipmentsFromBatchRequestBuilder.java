/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.operations;

import com.goshippo.shippo_sdk.utils.Utils;
import java.lang.String;
import java.util.List;
import java.util.Optional;

public class RemoveShipmentsFromBatchRequestBuilder {

    private String batchId;
    private Optional<String> shippoApiVersion = Optional.empty();
    private List<String> requestBody;
    private final SDKMethodInterfaces.MethodCallRemoveShipmentsFromBatch sdk;

    public RemoveShipmentsFromBatchRequestBuilder(SDKMethodInterfaces.MethodCallRemoveShipmentsFromBatch sdk) {
        this.sdk = sdk;
    }

    public RemoveShipmentsFromBatchRequestBuilder batchId(String batchId) {
        Utils.checkNotNull(batchId, "batchId");
        this.batchId = batchId;
        return this;
    }
                
    public RemoveShipmentsFromBatchRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public RemoveShipmentsFromBatchRequestBuilder shippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public RemoveShipmentsFromBatchRequestBuilder requestBody(List<String> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public RemoveShipmentsFromBatchResponse call() throws Exception {

        return sdk.removeShipments(
            batchId,
            shippoApiVersion,
            requestBody);
    }
}
