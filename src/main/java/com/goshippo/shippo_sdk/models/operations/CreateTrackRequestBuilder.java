/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.operations;

import com.goshippo.shippo_sdk.models.components.TracksRequest;
import com.goshippo.shippo_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class CreateTrackRequestBuilder {

    private Optional<String> shippoApiVersion = Optional.empty();
    private TracksRequest tracksRequest;
    private final SDKMethodInterfaces.MethodCallCreateTrack sdk;

    public CreateTrackRequestBuilder(SDKMethodInterfaces.MethodCallCreateTrack sdk) {
        this.sdk = sdk;
    }
                
    public CreateTrackRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public CreateTrackRequestBuilder shippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public CreateTrackRequestBuilder tracksRequest(TracksRequest tracksRequest) {
        Utils.checkNotNull(tracksRequest, "tracksRequest");
        this.tracksRequest = tracksRequest;
        return this;
    }

    public CreateTrackResponse call() throws Exception {

        return sdk.create(
            shippoApiVersion,
            tracksRequest);
    }
}
