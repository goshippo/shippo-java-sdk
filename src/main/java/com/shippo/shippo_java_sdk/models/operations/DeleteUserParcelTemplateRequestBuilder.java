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


public class DeleteUserParcelTemplateRequestBuilder {

    private String userParcelTemplateObjectId;
    private Optional<? extends String> shippoApiVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallDeleteUserParcelTemplate sdk;

    public DeleteUserParcelTemplateRequestBuilder(SDKMethodInterfaces.MethodCallDeleteUserParcelTemplate sdk) {
        this.sdk = sdk;
    }

    public DeleteUserParcelTemplateRequestBuilder userParcelTemplateObjectId(String userParcelTemplateObjectId) {
        Utils.checkNotNull(userParcelTemplateObjectId, "userParcelTemplateObjectId");
        this.userParcelTemplateObjectId = userParcelTemplateObjectId;
        return this;
    }
                
    public DeleteUserParcelTemplateRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public DeleteUserParcelTemplateRequestBuilder shippoApiVersion(Optional<? extends String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public DeleteUserParcelTemplateResponse call() throws Exception {

        return sdk.delete(
            userParcelTemplateObjectId,
            shippoApiVersion);
    }
}
