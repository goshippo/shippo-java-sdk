/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.goshippo.shippo_sdk.models.components.RefundRequestBody;
import com.goshippo.shippo_sdk.utils.SpeakeasyMetadata;
import com.goshippo.shippo_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class CreateRefundRequest {

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=SHIPPO-API-VERSION")
    private Optional<String> shippoApiVersion;

    /**
     * Refund details
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private RefundRequestBody refundRequestBody;

    @JsonCreator
    public CreateRefundRequest(
            Optional<String> shippoApiVersion,
            RefundRequestBody refundRequestBody) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        Utils.checkNotNull(refundRequestBody, "refundRequestBody");
        this.shippoApiVersion = shippoApiVersion;
        this.refundRequestBody = refundRequestBody;
    }
    
    public CreateRefundRequest(
            RefundRequestBody refundRequestBody) {
        this(Optional.empty(), refundRequestBody);
    }

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    @JsonIgnore
    public Optional<String> shippoApiVersion() {
        return shippoApiVersion;
    }

    /**
     * Refund details
     */
    @JsonIgnore
    public RefundRequestBody refundRequestBody() {
        return refundRequestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    public CreateRefundRequest withShippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
        return this;
    }

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    public CreateRefundRequest withShippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    /**
     * Refund details
     */
    public CreateRefundRequest withRefundRequestBody(RefundRequestBody refundRequestBody) {
        Utils.checkNotNull(refundRequestBody, "refundRequestBody");
        this.refundRequestBody = refundRequestBody;
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
        CreateRefundRequest other = (CreateRefundRequest) o;
        return 
            Objects.deepEquals(this.shippoApiVersion, other.shippoApiVersion) &&
            Objects.deepEquals(this.refundRequestBody, other.refundRequestBody);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            shippoApiVersion,
            refundRequestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateRefundRequest.class,
                "shippoApiVersion", shippoApiVersion,
                "refundRequestBody", refundRequestBody);
    }
    
    public final static class Builder {
 
        private Optional<String> shippoApiVersion = Optional.empty();
 
        private RefundRequestBody refundRequestBody;  
        
        private Builder() {
          // force use of static builder() method
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

        /**
         * Refund details
         */
        public Builder refundRequestBody(RefundRequestBody refundRequestBody) {
            Utils.checkNotNull(refundRequestBody, "refundRequestBody");
            this.refundRequestBody = refundRequestBody;
            return this;
        }
        
        public CreateRefundRequest build() {
            return new CreateRefundRequest(
                shippoApiVersion,
                refundRequestBody);
        }
    }
}

