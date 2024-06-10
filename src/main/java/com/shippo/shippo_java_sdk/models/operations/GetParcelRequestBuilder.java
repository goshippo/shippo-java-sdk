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


public class GetParcelRequestBuilder {

    private String parcelId;
    private Optional<? extends String> shippoApiVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetParcel sdk;

    public GetParcelRequestBuilder(SDKMethodInterfaces.MethodCallGetParcel sdk) {
        this.sdk = sdk;
    }

    public GetParcelRequestBuilder parcelId(String parcelId) {
        Utils.checkNotNull(parcelId, "parcelId");
        this.parcelId = parcelId;
        return this;
    }
                
    public GetParcelRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public GetParcelRequestBuilder shippoApiVersion(Optional<? extends String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public GetParcelResponse call() throws Exception {

        return sdk.get(
            parcelId,
            shippoApiVersion);
    }
}