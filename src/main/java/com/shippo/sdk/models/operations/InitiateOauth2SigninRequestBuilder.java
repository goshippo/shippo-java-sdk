/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;

import com.shippo.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class InitiateOauth2SigninRequestBuilder {

    private String carrierAccountObjectId;
    private String redirectUri;
    private Optional<String> state = Optional.empty();
    private Optional<String> shippoApiVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallInitiateOauth2Signin sdk;

    public InitiateOauth2SigninRequestBuilder(SDKMethodInterfaces.MethodCallInitiateOauth2Signin sdk) {
        this.sdk = sdk;
    }

    public InitiateOauth2SigninRequestBuilder carrierAccountObjectId(String carrierAccountObjectId) {
        Utils.checkNotNull(carrierAccountObjectId, "carrierAccountObjectId");
        this.carrierAccountObjectId = carrierAccountObjectId;
        return this;
    }

    public InitiateOauth2SigninRequestBuilder redirectUri(String redirectUri) {
        Utils.checkNotNull(redirectUri, "redirectUri");
        this.redirectUri = redirectUri;
        return this;
    }
                
    public InitiateOauth2SigninRequestBuilder state(String state) {
        Utils.checkNotNull(state, "state");
        this.state = Optional.of(state);
        return this;
    }

    public InitiateOauth2SigninRequestBuilder state(Optional<String> state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }
                
    public InitiateOauth2SigninRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public InitiateOauth2SigninRequestBuilder shippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public InitiateOauth2SigninResponse call() throws Exception {

        return sdk.initiateOauth2Signin(
            carrierAccountObjectId,
            redirectUri,
            state,
            shippoApiVersion);
    }
}
