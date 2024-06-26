/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.sdk.utils.SpeakeasyMetadata;
import com.shippo.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class DeleteServiceGroupRequest {

    /**
     * Object ID of the service group
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ServiceGroupId")
    private String serviceGroupId;

    /**
     * String used to pick a non-default API version to use
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=SHIPPO-API-VERSION")
    private Optional<? extends String> shippoApiVersion;

    @JsonCreator
    public DeleteServiceGroupRequest(
            String serviceGroupId,
            Optional<? extends String> shippoApiVersion) {
        Utils.checkNotNull(serviceGroupId, "serviceGroupId");
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.serviceGroupId = serviceGroupId;
        this.shippoApiVersion = shippoApiVersion;
    }
    
    public DeleteServiceGroupRequest(
            String serviceGroupId) {
        this(serviceGroupId, Optional.empty());
    }

    /**
     * Object ID of the service group
     */
    @JsonIgnore
    public String serviceGroupId() {
        return serviceGroupId;
    }

    /**
     * String used to pick a non-default API version to use
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> shippoApiVersion() {
        return (Optional<String>) shippoApiVersion;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Object ID of the service group
     */
    public DeleteServiceGroupRequest withServiceGroupId(String serviceGroupId) {
        Utils.checkNotNull(serviceGroupId, "serviceGroupId");
        this.serviceGroupId = serviceGroupId;
        return this;
    }

    /**
     * String used to pick a non-default API version to use
     */
    public DeleteServiceGroupRequest withShippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
        return this;
    }

    /**
     * String used to pick a non-default API version to use
     */
    public DeleteServiceGroupRequest withShippoApiVersion(Optional<? extends String> shippoApiVersion) {
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
        DeleteServiceGroupRequest other = (DeleteServiceGroupRequest) o;
        return 
            java.util.Objects.deepEquals(this.serviceGroupId, other.serviceGroupId) &&
            java.util.Objects.deepEquals(this.shippoApiVersion, other.shippoApiVersion);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            serviceGroupId,
            shippoApiVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteServiceGroupRequest.class,
                "serviceGroupId", serviceGroupId,
                "shippoApiVersion", shippoApiVersion);
    }
    
    public final static class Builder {
 
        private String serviceGroupId;
 
        private Optional<? extends String> shippoApiVersion = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Object ID of the service group
         */
        public Builder serviceGroupId(String serviceGroupId) {
            Utils.checkNotNull(serviceGroupId, "serviceGroupId");
            this.serviceGroupId = serviceGroupId;
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
        
        public DeleteServiceGroupRequest build() {
            return new DeleteServiceGroupRequest(
                serviceGroupId,
                shippoApiVersion);
        }
    }
}

