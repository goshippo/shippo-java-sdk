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


public class GetAddressRequestBuilder {

    private String addressId;
    private Optional<? extends String> shippoApiVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetAddress sdk;

    public GetAddressRequestBuilder(SDKMethodInterfaces.MethodCallGetAddress sdk) {
        this.sdk = sdk;
    }

    public GetAddressRequestBuilder addressId(String addressId) {
        Utils.checkNotNull(addressId, "addressId");
        this.addressId = addressId;
        return this;
    }
                
    public GetAddressRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public GetAddressRequestBuilder shippoApiVersion(Optional<? extends String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public GetAddressResponse call() throws Exception {

        return sdk.get(
            addressId,
            shippoApiVersion);
    }
}
