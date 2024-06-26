/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.sdk.models.errors.SDKError;
import com.shippo.sdk.utils.LazySingletonValue;
import com.shippo.sdk.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class CreateUserParcelTemplateRequestBuilder {

    private Optional<? extends String> shippoApiVersion = Optional.empty();
    private com.shippo.sdk.models.components.UserParcelTemplateCreateRequest userParcelTemplateCreateRequest;
    private final SDKMethodInterfaces.MethodCallCreateUserParcelTemplate sdk;

    public CreateUserParcelTemplateRequestBuilder(SDKMethodInterfaces.MethodCallCreateUserParcelTemplate sdk) {
        this.sdk = sdk;
    }
                
    public CreateUserParcelTemplateRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public CreateUserParcelTemplateRequestBuilder shippoApiVersion(Optional<? extends String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public CreateUserParcelTemplateRequestBuilder userParcelTemplateCreateRequest(com.shippo.sdk.models.components.UserParcelTemplateCreateRequest userParcelTemplateCreateRequest) {
        Utils.checkNotNull(userParcelTemplateCreateRequest, "userParcelTemplateCreateRequest");
        this.userParcelTemplateCreateRequest = userParcelTemplateCreateRequest;
        return this;
    }

    public CreateUserParcelTemplateResponse call() throws Exception {

        return sdk.create(
            shippoApiVersion,
            userParcelTemplateCreateRequest);
    }
}
