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


public class CreateShippoAccountRequestBuilder {

    private Optional<? extends String> shippoApiVersion = Optional.empty();
    private Optional<? extends com.shippo.shippo_java_sdk.models.components.ShippoAccountUpdateRequest> shippoAccountUpdateRequest = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateShippoAccount sdk;

    public CreateShippoAccountRequestBuilder(SDKMethodInterfaces.MethodCallCreateShippoAccount sdk) {
        this.sdk = sdk;
    }
                
    public CreateShippoAccountRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public CreateShippoAccountRequestBuilder shippoApiVersion(Optional<? extends String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }
                
    public CreateShippoAccountRequestBuilder shippoAccountUpdateRequest(com.shippo.shippo_java_sdk.models.components.ShippoAccountUpdateRequest shippoAccountUpdateRequest) {
        Utils.checkNotNull(shippoAccountUpdateRequest, "shippoAccountUpdateRequest");
        this.shippoAccountUpdateRequest = Optional.of(shippoAccountUpdateRequest);
        return this;
    }

    public CreateShippoAccountRequestBuilder shippoAccountUpdateRequest(Optional<? extends com.shippo.shippo_java_sdk.models.components.ShippoAccountUpdateRequest> shippoAccountUpdateRequest) {
        Utils.checkNotNull(shippoAccountUpdateRequest, "shippoAccountUpdateRequest");
        this.shippoAccountUpdateRequest = shippoAccountUpdateRequest;
        return this;
    }

    public CreateShippoAccountResponse call() throws Exception {

        return sdk.create(
            shippoApiVersion,
            shippoAccountUpdateRequest);
    }
}