/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.sdk.models.operations;

import com.goshippo.sdk.models.components.PickupBase;
import com.goshippo.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class CreatePickupRequestBuilder {

    private Optional<String> shippoApiVersion = Optional.empty();
    private PickupBase pickupBase;
    private final SDKMethodInterfaces.MethodCallCreatePickup sdk;

    public CreatePickupRequestBuilder(SDKMethodInterfaces.MethodCallCreatePickup sdk) {
        this.sdk = sdk;
    }
                
    public CreatePickupRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public CreatePickupRequestBuilder shippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public CreatePickupRequestBuilder pickupBase(PickupBase pickupBase) {
        Utils.checkNotNull(pickupBase, "pickupBase");
        this.pickupBase = pickupBase;
        return this;
    }

    public CreatePickupResponse call() throws Exception {

        return sdk.create(
            shippoApiVersion,
            pickupBase);
    }
}