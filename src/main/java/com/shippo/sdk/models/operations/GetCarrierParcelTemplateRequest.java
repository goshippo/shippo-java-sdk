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


public class GetCarrierParcelTemplateRequest {

    /**
     * The unique string representation of the carrier parcel template
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=CarrierParcelTemplateToken")
    private String carrierParcelTemplateToken;

    /**
     * String used to pick a non-default API version to use
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=SHIPPO-API-VERSION")
    private Optional<String> shippoApiVersion;

    @JsonCreator
    public GetCarrierParcelTemplateRequest(
            String carrierParcelTemplateToken,
            Optional<String> shippoApiVersion) {
        Utils.checkNotNull(carrierParcelTemplateToken, "carrierParcelTemplateToken");
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.carrierParcelTemplateToken = carrierParcelTemplateToken;
        this.shippoApiVersion = shippoApiVersion;
    }
    
    public GetCarrierParcelTemplateRequest(
            String carrierParcelTemplateToken) {
        this(carrierParcelTemplateToken, Optional.empty());
    }

    /**
     * The unique string representation of the carrier parcel template
     */
    @JsonIgnore
    public String carrierParcelTemplateToken() {
        return carrierParcelTemplateToken;
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
     * The unique string representation of the carrier parcel template
     */
    public GetCarrierParcelTemplateRequest withCarrierParcelTemplateToken(String carrierParcelTemplateToken) {
        Utils.checkNotNull(carrierParcelTemplateToken, "carrierParcelTemplateToken");
        this.carrierParcelTemplateToken = carrierParcelTemplateToken;
        return this;
    }

    /**
     * String used to pick a non-default API version to use
     */
    public GetCarrierParcelTemplateRequest withShippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
        return this;
    }

    /**
     * String used to pick a non-default API version to use
     */
    public GetCarrierParcelTemplateRequest withShippoApiVersion(Optional<String> shippoApiVersion) {
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
        GetCarrierParcelTemplateRequest other = (GetCarrierParcelTemplateRequest) o;
        return 
            Objects.deepEquals(this.carrierParcelTemplateToken, other.carrierParcelTemplateToken) &&
            Objects.deepEquals(this.shippoApiVersion, other.shippoApiVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            carrierParcelTemplateToken,
            shippoApiVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCarrierParcelTemplateRequest.class,
                "carrierParcelTemplateToken", carrierParcelTemplateToken,
                "shippoApiVersion", shippoApiVersion);
    }
    
    public final static class Builder {
 
        private String carrierParcelTemplateToken;
 
        private Optional<String> shippoApiVersion = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The unique string representation of the carrier parcel template
         */
        public Builder carrierParcelTemplateToken(String carrierParcelTemplateToken) {
            Utils.checkNotNull(carrierParcelTemplateToken, "carrierParcelTemplateToken");
            this.carrierParcelTemplateToken = carrierParcelTemplateToken;
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
        
        public GetCarrierParcelTemplateRequest build() {
            return new GetCarrierParcelTemplateRequest(
                carrierParcelTemplateToken,
                shippoApiVersion);
        }
    }
}

