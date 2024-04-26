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


public class CreateRefundRequestBuilder {

    private Optional<? extends String> shippoApiVersion = Optional.empty();
    private Optional<? extends com.shippo.shippo_java_sdk.models.components.RefundRequestBody> refundRequestBody = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateRefund sdk;

    public CreateRefundRequestBuilder(SDKMethodInterfaces.MethodCallCreateRefund sdk) {
        this.sdk = sdk;
    }
                
    public CreateRefundRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public CreateRefundRequestBuilder shippoApiVersion(Optional<? extends String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }
                
    public CreateRefundRequestBuilder refundRequestBody(com.shippo.shippo_java_sdk.models.components.RefundRequestBody refundRequestBody) {
        Utils.checkNotNull(refundRequestBody, "refundRequestBody");
        this.refundRequestBody = Optional.of(refundRequestBody);
        return this;
    }

    public CreateRefundRequestBuilder refundRequestBody(Optional<? extends com.shippo.shippo_java_sdk.models.components.RefundRequestBody> refundRequestBody) {
        Utils.checkNotNull(refundRequestBody, "refundRequestBody");
        this.refundRequestBody = refundRequestBody;
        return this;
    }

    public CreateRefundResponse call() throws Exception {

        return sdk.create(
            shippoApiVersion,
            refundRequestBody);
    }
}
