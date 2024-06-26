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


public class CreateTransactionRequestBuilder {

    private Optional<? extends String> shippoApiVersion = Optional.empty();
    private CreateTransactionRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallCreateTransaction sdk;

    public CreateTransactionRequestBuilder(SDKMethodInterfaces.MethodCallCreateTransaction sdk) {
        this.sdk = sdk;
    }
                
    public CreateTransactionRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public CreateTransactionRequestBuilder shippoApiVersion(Optional<? extends String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public CreateTransactionRequestBuilder requestBody(CreateTransactionRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public CreateTransactionResponse call() throws Exception {

        return sdk.create(
            shippoApiVersion,
            requestBody);
    }
}
