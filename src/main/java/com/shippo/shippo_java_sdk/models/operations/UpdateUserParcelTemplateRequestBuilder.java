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


public class UpdateUserParcelTemplateRequestBuilder {

    private String userParcelTemplateObjectId;
    private Optional<? extends String> shippoApiVersion = Optional.empty();
    private Optional<? extends com.shippo.shippo_java_sdk.models.components.UserParcelTemplateUpdateRequest> userParcelTemplateUpdateRequest = Optional.empty();
    private final SDKMethodInterfaces.MethodCallUpdateUserParcelTemplate sdk;

    public UpdateUserParcelTemplateRequestBuilder(SDKMethodInterfaces.MethodCallUpdateUserParcelTemplate sdk) {
        this.sdk = sdk;
    }

    public UpdateUserParcelTemplateRequestBuilder userParcelTemplateObjectId(String userParcelTemplateObjectId) {
        Utils.checkNotNull(userParcelTemplateObjectId, "userParcelTemplateObjectId");
        this.userParcelTemplateObjectId = userParcelTemplateObjectId;
        return this;
    }
                
    public UpdateUserParcelTemplateRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public UpdateUserParcelTemplateRequestBuilder shippoApiVersion(Optional<? extends String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }
                
    public UpdateUserParcelTemplateRequestBuilder userParcelTemplateUpdateRequest(com.shippo.shippo_java_sdk.models.components.UserParcelTemplateUpdateRequest userParcelTemplateUpdateRequest) {
        Utils.checkNotNull(userParcelTemplateUpdateRequest, "userParcelTemplateUpdateRequest");
        this.userParcelTemplateUpdateRequest = Optional.of(userParcelTemplateUpdateRequest);
        return this;
    }

    public UpdateUserParcelTemplateRequestBuilder userParcelTemplateUpdateRequest(Optional<? extends com.shippo.shippo_java_sdk.models.components.UserParcelTemplateUpdateRequest> userParcelTemplateUpdateRequest) {
        Utils.checkNotNull(userParcelTemplateUpdateRequest, "userParcelTemplateUpdateRequest");
        this.userParcelTemplateUpdateRequest = userParcelTemplateUpdateRequest;
        return this;
    }

    public UpdateUserParcelTemplateResponse call() throws Exception {

        return sdk.update(
            userParcelTemplateObjectId,
            shippoApiVersion,
            userParcelTemplateUpdateRequest);
    }
}
