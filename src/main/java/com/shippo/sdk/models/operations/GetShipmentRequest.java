/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shippo.sdk.utils.SpeakeasyMetadata;
import com.shippo.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class GetShipmentRequest {

    /**
     * Object ID of the shipment to update
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ShipmentId")
    private String shipmentId;

    /**
     * String used to pick a non-default API version to use
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=SHIPPO-API-VERSION")
    private Optional<String> shippoApiVersion;

    @JsonCreator
    public GetShipmentRequest(
            String shipmentId,
            Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shipmentId, "shipmentId");
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shipmentId = shipmentId;
        this.shippoApiVersion = shippoApiVersion;
    }
    
    public GetShipmentRequest(
            String shipmentId) {
        this(shipmentId, Optional.empty());
    }

    /**
     * Object ID of the shipment to update
     */
    @JsonIgnore
    public String shipmentId() {
        return shipmentId;
    }

    /**
     * String used to pick a non-default API version to use
     */
    @JsonIgnore
    public Optional<String> shippoApiVersion() {
        return shippoApiVersion;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Object ID of the shipment to update
     */
    public GetShipmentRequest withShipmentId(String shipmentId) {
        Utils.checkNotNull(shipmentId, "shipmentId");
        this.shipmentId = shipmentId;
        return this;
    }

    /**
     * String used to pick a non-default API version to use
     */
    public GetShipmentRequest withShippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
        return this;
    }

    /**
     * String used to pick a non-default API version to use
     */
    public GetShipmentRequest withShippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetShipmentRequest other = (GetShipmentRequest) o;
        return 
            Objects.deepEquals(this.shipmentId, other.shipmentId) &&
            Objects.deepEquals(this.shippoApiVersion, other.shippoApiVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            shipmentId,
            shippoApiVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetShipmentRequest.class,
                "shipmentId", shipmentId,
                "shippoApiVersion", shippoApiVersion);
    }
    
    public final static class Builder {
 
        private String shipmentId;
 
        private Optional<String> shippoApiVersion = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Object ID of the shipment to update
         */
        public Builder shipmentId(String shipmentId) {
            Utils.checkNotNull(shipmentId, "shipmentId");
            this.shipmentId = shipmentId;
            return this;
        }

        /**
         * String used to pick a non-default API version to use
         */
        public Builder shippoApiVersion(String shippoApiVersion) {
            Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
            this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
            return this;
        }

        /**
         * String used to pick a non-default API version to use
         */
        public Builder shippoApiVersion(Optional<String> shippoApiVersion) {
            Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
            this.shippoApiVersion = shippoApiVersion;
            return this;
        }
        
        public GetShipmentRequest build() {
            return new GetShipmentRequest(
                shipmentId,
                shippoApiVersion);
        }
    }
}

