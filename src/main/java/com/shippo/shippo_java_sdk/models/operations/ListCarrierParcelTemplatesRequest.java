/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.shippo_java_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.shippo_java_sdk.utils.SpeakeasyMetadata;
import com.shippo.shippo_java_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class ListCarrierParcelTemplatesRequest {

    /**
     * filter by user or enabled
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=include")
    private Optional<? extends Include> include;

    /**
     * filter by specific carrier
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=carrier")
    private Optional<? extends String> carrier;

    /**
     * String used to pick a non-default API version to use
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=SHIPPO-API-VERSION")
    private Optional<? extends String> shippoApiVersion;

    @JsonCreator
    public ListCarrierParcelTemplatesRequest(
            Optional<? extends Include> include,
            Optional<? extends String> carrier,
            Optional<? extends String> shippoApiVersion) {
        Utils.checkNotNull(include, "include");
        Utils.checkNotNull(carrier, "carrier");
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.include = include;
        this.carrier = carrier;
        this.shippoApiVersion = shippoApiVersion;
    }
    
    public ListCarrierParcelTemplatesRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * filter by user or enabled
     */
    @JsonIgnore
    public Optional<? extends Include> include() {
        return include;
    }

    /**
     * filter by specific carrier
     */
    @JsonIgnore
    public Optional<? extends String> carrier() {
        return carrier;
    }

    /**
     * String used to pick a non-default API version to use
     */
    @JsonIgnore
    public Optional<? extends String> shippoApiVersion() {
        return shippoApiVersion;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * filter by user or enabled
     */
    public ListCarrierParcelTemplatesRequest withInclude(Include include) {
        Utils.checkNotNull(include, "include");
        this.include = Optional.ofNullable(include);
        return this;
    }

    /**
     * filter by user or enabled
     */
    public ListCarrierParcelTemplatesRequest withInclude(Optional<? extends Include> include) {
        Utils.checkNotNull(include, "include");
        this.include = include;
        return this;
    }

    /**
     * filter by specific carrier
     */
    public ListCarrierParcelTemplatesRequest withCarrier(String carrier) {
        Utils.checkNotNull(carrier, "carrier");
        this.carrier = Optional.ofNullable(carrier);
        return this;
    }

    /**
     * filter by specific carrier
     */
    public ListCarrierParcelTemplatesRequest withCarrier(Optional<? extends String> carrier) {
        Utils.checkNotNull(carrier, "carrier");
        this.carrier = carrier;
        return this;
    }

    /**
     * String used to pick a non-default API version to use
     */
    public ListCarrierParcelTemplatesRequest withShippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
        return this;
    }

    /**
     * String used to pick a non-default API version to use
     */
    public ListCarrierParcelTemplatesRequest withShippoApiVersion(Optional<? extends String> shippoApiVersion) {
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
        ListCarrierParcelTemplatesRequest other = (ListCarrierParcelTemplatesRequest) o;
        return 
            java.util.Objects.deepEquals(this.include, other.include) &&
            java.util.Objects.deepEquals(this.carrier, other.carrier) &&
            java.util.Objects.deepEquals(this.shippoApiVersion, other.shippoApiVersion);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            include,
            carrier,
            shippoApiVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListCarrierParcelTemplatesRequest.class,
                "include", include,
                "carrier", carrier,
                "shippoApiVersion", shippoApiVersion);
    }
    
    public final static class Builder {
 
        private Optional<? extends Include> include = Optional.empty();
 
        private Optional<? extends String> carrier = Optional.empty();
 
        private Optional<? extends String> shippoApiVersion = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * filter by user or enabled
         */
        public Builder include(Include include) {
            Utils.checkNotNull(include, "include");
            this.include = Optional.ofNullable(include);
            return this;
        }

        /**
         * filter by user or enabled
         */
        public Builder include(Optional<? extends Include> include) {
            Utils.checkNotNull(include, "include");
            this.include = include;
            return this;
        }

        /**
         * filter by specific carrier
         */
        public Builder carrier(String carrier) {
            Utils.checkNotNull(carrier, "carrier");
            this.carrier = Optional.ofNullable(carrier);
            return this;
        }

        /**
         * filter by specific carrier
         */
        public Builder carrier(Optional<? extends String> carrier) {
            Utils.checkNotNull(carrier, "carrier");
            this.carrier = carrier;
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
        public Builder shippoApiVersion(Optional<? extends String> shippoApiVersion) {
            Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
            this.shippoApiVersion = shippoApiVersion;
            return this;
        }
        
        public ListCarrierParcelTemplatesRequest build() {
            return new ListCarrierParcelTemplatesRequest(
                include,
                carrier,
                shippoApiVersion);
        }
    }
}
