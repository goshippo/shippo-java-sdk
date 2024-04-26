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


public class CreateShipmentRequestBuilder {

    private Optional<? extends String> shippoApiVersion = Optional.empty();
    private Optional<? extends com.shippo.shippo_java_sdk.models.components.ShipmentCreateRequest> shipmentCreateRequest = Optional.empty();
    private final SDKMethodInterfaces.MethodCallCreateShipment sdk;

    public CreateShipmentRequestBuilder(SDKMethodInterfaces.MethodCallCreateShipment sdk) {
        this.sdk = sdk;
    }
                
    public CreateShipmentRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public CreateShipmentRequestBuilder shippoApiVersion(Optional<? extends String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }
                
    public CreateShipmentRequestBuilder shipmentCreateRequest(com.shippo.shippo_java_sdk.models.components.ShipmentCreateRequest shipmentCreateRequest) {
        Utils.checkNotNull(shipmentCreateRequest, "shipmentCreateRequest");
        this.shipmentCreateRequest = Optional.of(shipmentCreateRequest);
        return this;
    }

    public CreateShipmentRequestBuilder shipmentCreateRequest(Optional<? extends com.shippo.shippo_java_sdk.models.components.ShipmentCreateRequest> shipmentCreateRequest) {
        Utils.checkNotNull(shipmentCreateRequest, "shipmentCreateRequest");
        this.shipmentCreateRequest = shipmentCreateRequest;
        return this;
    }

    public CreateShipmentResponse call() throws Exception {

        return sdk.create(
            shippoApiVersion,
            shipmentCreateRequest);
    }
}
