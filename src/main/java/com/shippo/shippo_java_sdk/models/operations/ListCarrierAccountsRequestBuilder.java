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


public class ListCarrierAccountsRequestBuilder {

    private ListCarrierAccountsRequest request;
    private final SDKMethodInterfaces.MethodCallListCarrierAccounts sdk;

    public ListCarrierAccountsRequestBuilder(SDKMethodInterfaces.MethodCallListCarrierAccounts sdk) {
        this.sdk = sdk;
    }

    public ListCarrierAccountsRequestBuilder request(ListCarrierAccountsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public ListCarrierAccountsResponse call() throws Exception {

        return sdk.list(
            request);
    }
}