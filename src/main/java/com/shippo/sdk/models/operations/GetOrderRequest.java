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

public class GetOrderRequest {

    /**
     * Object ID of the order
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=OrderId")
    private String orderId;

    /**
     * String used to pick a non-default API version to use
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=SHIPPO-API-VERSION")
    private Optional<? extends String> shippoApiVersion;

    @JsonCreator
    public GetOrderRequest(
            String orderId,
            Optional<? extends String> shippoApiVersion) {
        Utils.checkNotNull(orderId, "orderId");
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.orderId = orderId;
        this.shippoApiVersion = shippoApiVersion;
    }
    
    public GetOrderRequest(
            String orderId) {
        this(orderId, Optional.empty());
    }

    /**
     * Object ID of the order
     */
    @JsonIgnore
    public String orderId() {
        return orderId;
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
     * Object ID of the order
     */
    public GetOrderRequest withOrderId(String orderId) {
        Utils.checkNotNull(orderId, "orderId");
        this.orderId = orderId;
        return this;
    }

    /**
     * String used to pick a non-default API version to use
     */
    public GetOrderRequest withShippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
        return this;
    }

    /**
     * String used to pick a non-default API version to use
     */
    public GetOrderRequest withShippoApiVersion(Optional<? extends String> shippoApiVersion) {
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
        GetOrderRequest other = (GetOrderRequest) o;
        return 
            java.util.Objects.deepEquals(this.orderId, other.orderId) &&
            java.util.Objects.deepEquals(this.shippoApiVersion, other.shippoApiVersion);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            orderId,
            shippoApiVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetOrderRequest.class,
                "orderId", orderId,
                "shippoApiVersion", shippoApiVersion);
    }
    
    public final static class Builder {
 
        private String orderId;
 
        private Optional<? extends String> shippoApiVersion = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Object ID of the order
         */
        public Builder orderId(String orderId) {
            Utils.checkNotNull(orderId, "orderId");
            this.orderId = orderId;
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
        
        public GetOrderRequest build() {
            return new GetOrderRequest(
                orderId,
                shippoApiVersion);
        }
    }
}

