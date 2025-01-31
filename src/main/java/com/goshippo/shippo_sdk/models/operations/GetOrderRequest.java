/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.goshippo.shippo_sdk.utils.SpeakeasyMetadata;
import com.goshippo.shippo_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class GetOrderRequest {

    /**
     * Object ID of the order
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=OrderId")
    private String orderId;

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=SHIPPO-API-VERSION")
    private Optional<String> shippoApiVersion;

    @JsonCreator
    public GetOrderRequest(
            String orderId,
            Optional<String> shippoApiVersion) {
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
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    @JsonIgnore
    public Optional<String> shippoApiVersion() {
        return shippoApiVersion;
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
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    public GetOrderRequest withShippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
        return this;
    }

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    public GetOrderRequest withShippoApiVersion(Optional<String> shippoApiVersion) {
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
            Objects.deepEquals(this.orderId, other.orderId) &&
            Objects.deepEquals(this.shippoApiVersion, other.shippoApiVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Optional<String> shippoApiVersion = Optional.empty();  
        
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
         * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
         */
        public Builder shippoApiVersion(String shippoApiVersion) {
            Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
            this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
            return this;
        }

        /**
         * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
         */
        public Builder shippoApiVersion(Optional<String> shippoApiVersion) {
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

