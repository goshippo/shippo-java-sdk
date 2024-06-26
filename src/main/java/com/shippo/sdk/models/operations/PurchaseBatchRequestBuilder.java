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


public class PurchaseBatchRequestBuilder {

    private String batchId;
    private Optional<? extends String> shippoApiVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallPurchaseBatch sdk;

    public PurchaseBatchRequestBuilder(SDKMethodInterfaces.MethodCallPurchaseBatch sdk) {
        this.sdk = sdk;
    }

    public PurchaseBatchRequestBuilder batchId(String batchId) {
        Utils.checkNotNull(batchId, "batchId");
        this.batchId = batchId;
        return this;
    }
                
    public PurchaseBatchRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public PurchaseBatchRequestBuilder shippoApiVersion(Optional<? extends String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public PurchaseBatchResponse call() throws Exception {

        return sdk.purchase(
            batchId,
            shippoApiVersion);
    }
}
