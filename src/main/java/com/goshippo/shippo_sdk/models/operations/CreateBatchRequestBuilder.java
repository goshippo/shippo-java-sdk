/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.operations;

import com.goshippo.shippo_sdk.models.components.BatchCreateRequest;
import com.goshippo.shippo_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class CreateBatchRequestBuilder {

    private Optional<String> shippoApiVersion = Optional.empty();
    private BatchCreateRequest batchCreateRequest;
    private final SDKMethodInterfaces.MethodCallCreateBatch sdk;

    public CreateBatchRequestBuilder(SDKMethodInterfaces.MethodCallCreateBatch sdk) {
        this.sdk = sdk;
    }
                
    public CreateBatchRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public CreateBatchRequestBuilder shippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public CreateBatchRequestBuilder batchCreateRequest(BatchCreateRequest batchCreateRequest) {
        Utils.checkNotNull(batchCreateRequest, "batchCreateRequest");
        this.batchCreateRequest = batchCreateRequest;
        return this;
    }

    public CreateBatchResponse call() throws Exception {

        return sdk.create(
            shippoApiVersion,
            batchCreateRequest);
    }
}
