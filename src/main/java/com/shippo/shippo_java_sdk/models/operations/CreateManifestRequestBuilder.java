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


public class CreateManifestRequestBuilder {

    private Optional<? extends String> shippoApiVersion = Optional.empty();
    private Optional<? extends com.shippo.shippo_java_sdk.models.components.ManifestCreateRequest> manifestCreateRequest = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateManifest sdk;

    public CreateManifestRequestBuilder(SDKMethodInterfaces.MethodCallCreateManifest sdk) {
        this.sdk = sdk;
    }
                
    public CreateManifestRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public CreateManifestRequestBuilder shippoApiVersion(Optional<? extends String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }
                
    public CreateManifestRequestBuilder manifestCreateRequest(com.shippo.shippo_java_sdk.models.components.ManifestCreateRequest manifestCreateRequest) {
        Utils.checkNotNull(manifestCreateRequest, "manifestCreateRequest");
        this.manifestCreateRequest = Optional.of(manifestCreateRequest);
        return this;
    }

    public CreateManifestRequestBuilder manifestCreateRequest(Optional<? extends com.shippo.shippo_java_sdk.models.components.ManifestCreateRequest> manifestCreateRequest) {
        Utils.checkNotNull(manifestCreateRequest, "manifestCreateRequest");
        this.manifestCreateRequest = manifestCreateRequest;
        return this;
    }

    public CreateManifestResponse call() throws Exception {

        return sdk.create(
            shippoApiVersion,
            manifestCreateRequest);
    }
}
