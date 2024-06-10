/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.shippo_java_sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.shippo_java_sdk.models.errors.SDKError;
import com.shippo.shippo_java_sdk.utils.LazySingletonValue;
import com.shippo.shippo_java_sdk.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class CreateLiveRateRequestBuilder {

    private Optional<? extends String> shippoApiVersion = Optional.empty();
    private Optional<? extends com.shippo.shippo_java_sdk.models.components.LiveRateCreateRequest> liveRateCreateRequest = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateLiveRate sdk;

    public CreateLiveRateRequestBuilder(SDKMethodInterfaces.MethodCallCreateLiveRate sdk) {
        this.sdk = sdk;
    }
                
    public CreateLiveRateRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public CreateLiveRateRequestBuilder shippoApiVersion(Optional<? extends String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }
                
    public CreateLiveRateRequestBuilder liveRateCreateRequest(com.shippo.shippo_java_sdk.models.components.LiveRateCreateRequest liveRateCreateRequest) {
        Utils.checkNotNull(liveRateCreateRequest, "liveRateCreateRequest");
        this.liveRateCreateRequest = Optional.of(liveRateCreateRequest);
        return this;
    }

    public CreateLiveRateRequestBuilder liveRateCreateRequest(Optional<? extends com.shippo.shippo_java_sdk.models.components.LiveRateCreateRequest> liveRateCreateRequest) {
        Utils.checkNotNull(liveRateCreateRequest, "liveRateCreateRequest");
        this.liveRateCreateRequest = liveRateCreateRequest;
        return this;
    }

    public CreateLiveRateResponse call() throws Exception {

        return sdk.create(
            shippoApiVersion,
            liveRateCreateRequest);
    }
}