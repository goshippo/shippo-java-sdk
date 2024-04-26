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


public class ListUserParcelTemplatesRequest {

    /**
     * String used to pick a non-default API version to use
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=SHIPPO-API-VERSION")
    private Optional<? extends String> shippoApiVersion;

    @JsonCreator
    public ListUserParcelTemplatesRequest(
            Optional<? extends String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
    }
    
    public ListUserParcelTemplatesRequest() {
        this(Optional.empty());
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
     * String used to pick a non-default API version to use
     */
    public ListUserParcelTemplatesRequest withShippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
        return this;
    }

    /**
     * String used to pick a non-default API version to use
     */
    public ListUserParcelTemplatesRequest withShippoApiVersion(Optional<? extends String> shippoApiVersion) {
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
        ListUserParcelTemplatesRequest other = (ListUserParcelTemplatesRequest) o;
        return 
            java.util.Objects.deepEquals(this.shippoApiVersion, other.shippoApiVersion);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            shippoApiVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListUserParcelTemplatesRequest.class,
                "shippoApiVersion", shippoApiVersion);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> shippoApiVersion = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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
        
        public ListUserParcelTemplatesRequest build() {
            return new ListUserParcelTemplatesRequest(
                shippoApiVersion);
        }
    }
}

