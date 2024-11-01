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


public class GetParcelRequest {

    /**
     * Object ID of the parcel
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ParcelId")
    private String parcelId;

    /**
     * String used to pick a non-default API version to use
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=SHIPPO-API-VERSION")
    private Optional<String> shippoApiVersion;

    @JsonCreator
    public GetParcelRequest(
            String parcelId,
            Optional<String> shippoApiVersion) {
        Utils.checkNotNull(parcelId, "parcelId");
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.parcelId = parcelId;
        this.shippoApiVersion = shippoApiVersion;
    }
    
    public GetParcelRequest(
            String parcelId) {
        this(parcelId, Optional.empty());
    }

    /**
     * Object ID of the parcel
     */
    @JsonIgnore
    public String parcelId() {
        return parcelId;
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
     * Object ID of the parcel
     */
    public GetParcelRequest withParcelId(String parcelId) {
        Utils.checkNotNull(parcelId, "parcelId");
        this.parcelId = parcelId;
        return this;
    }

    /**
     * String used to pick a non-default API version to use
     */
    public GetParcelRequest withShippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
        return this;
    }

    /**
     * String used to pick a non-default API version to use
     */
    public GetParcelRequest withShippoApiVersion(Optional<String> shippoApiVersion) {
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
        GetParcelRequest other = (GetParcelRequest) o;
        return 
            Objects.deepEquals(this.parcelId, other.parcelId) &&
            Objects.deepEquals(this.shippoApiVersion, other.shippoApiVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            parcelId,
            shippoApiVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetParcelRequest.class,
                "parcelId", parcelId,
                "shippoApiVersion", shippoApiVersion);
    }
    
    public final static class Builder {
 
        private String parcelId;
 
        private Optional<String> shippoApiVersion = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Object ID of the parcel
         */
        public Builder parcelId(String parcelId) {
            Utils.checkNotNull(parcelId, "parcelId");
            this.parcelId = parcelId;
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
        
        public GetParcelRequest build() {
            return new GetParcelRequest(
                parcelId,
                shippoApiVersion);
        }
    }
}

