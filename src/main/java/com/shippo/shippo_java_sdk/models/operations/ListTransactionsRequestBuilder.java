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


public class ListTransactionsRequestBuilder {

    private ListTransactionsRequest request;
    private final SDKMethodInterfaces.MethodCallListTransactions sdk;

    public ListTransactionsRequestBuilder(SDKMethodInterfaces.MethodCallListTransactions sdk) {
        this.sdk = sdk;
    }

    public ListTransactionsRequestBuilder request(ListTransactionsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListTransactionsResponse call() throws Exception {

        return sdk.list(
            request);
    }
}
