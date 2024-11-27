/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.operations;

import com.goshippo.shippo_sdk.models.components.ServiceGroupCreateRequest;
import com.goshippo.shippo_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class CreateServiceGroupRequestBuilder {

    private Optional<String> shippoApiVersion = Optional.empty();
    private ServiceGroupCreateRequest serviceGroupCreateRequest;
    private final SDKMethodInterfaces.MethodCallCreateServiceGroup sdk;

    public CreateServiceGroupRequestBuilder(SDKMethodInterfaces.MethodCallCreateServiceGroup sdk) {
        this.sdk = sdk;
    }
                
    public CreateServiceGroupRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public CreateServiceGroupRequestBuilder shippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public CreateServiceGroupRequestBuilder serviceGroupCreateRequest(ServiceGroupCreateRequest serviceGroupCreateRequest) {
        Utils.checkNotNull(serviceGroupCreateRequest, "serviceGroupCreateRequest");
        this.serviceGroupCreateRequest = serviceGroupCreateRequest;
        return this;
    }

    public CreateServiceGroupResponse call() throws Exception {

        return sdk.create(
            shippoApiVersion,
            serviceGroupCreateRequest);
    }
}