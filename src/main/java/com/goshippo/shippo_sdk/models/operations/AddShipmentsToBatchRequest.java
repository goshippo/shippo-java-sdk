/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.goshippo.shippo_sdk.models.components.BatchShipmentCreateRequest;
import com.goshippo.shippo_sdk.utils.SpeakeasyMetadata;
import com.goshippo.shippo_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class AddShipmentsToBatchRequest {

    /**
     * Object ID of the batch
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=BatchId")
    private String batchId;

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=SHIPPO-API-VERSION")
    private Optional<String> shippoApiVersion;

    /**
     * Array of shipments to add to the batch
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private List<BatchShipmentCreateRequest> requestBody;

    @JsonCreator
    public AddShipmentsToBatchRequest(
            String batchId,
            Optional<String> shippoApiVersion,
            List<BatchShipmentCreateRequest> requestBody) {
        Utils.checkNotNull(batchId, "batchId");
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        Utils.checkNotNull(requestBody, "requestBody");
        this.batchId = batchId;
        this.shippoApiVersion = shippoApiVersion;
        this.requestBody = requestBody;
    }
    
    public AddShipmentsToBatchRequest(
            String batchId,
            List<BatchShipmentCreateRequest> requestBody) {
        this(batchId, Optional.empty(), requestBody);
    }

    /**
     * Object ID of the batch
     */
    @JsonIgnore
    public String batchId() {
        return batchId;
    }

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    @JsonIgnore
    public Optional<String> shippoApiVersion() {
        return shippoApiVersion;
    }

    /**
     * Array of shipments to add to the batch
     */
    @JsonIgnore
    public List<BatchShipmentCreateRequest> requestBody() {
        return requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Object ID of the batch
     */
    public AddShipmentsToBatchRequest withBatchId(String batchId) {
        Utils.checkNotNull(batchId, "batchId");
        this.batchId = batchId;
        return this;
    }

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    public AddShipmentsToBatchRequest withShippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
        return this;
    }

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    public AddShipmentsToBatchRequest withShippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    /**
     * Array of shipments to add to the batch
     */
    public AddShipmentsToBatchRequest withRequestBody(List<BatchShipmentCreateRequest> requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
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
        AddShipmentsToBatchRequest other = (AddShipmentsToBatchRequest) o;
        return 
            Objects.deepEquals(this.batchId, other.batchId) &&
            Objects.deepEquals(this.shippoApiVersion, other.shippoApiVersion) &&
            Objects.deepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            batchId,
            shippoApiVersion,
            requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AddShipmentsToBatchRequest.class,
                "batchId", batchId,
                "shippoApiVersion", shippoApiVersion,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private String batchId;
 
        private Optional<String> shippoApiVersion = Optional.empty();
 
        private List<BatchShipmentCreateRequest> requestBody;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Object ID of the batch
         */
        public Builder batchId(String batchId) {
            Utils.checkNotNull(batchId, "batchId");
            this.batchId = batchId;
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

        /**
         * Array of shipments to add to the batch
         */
        public Builder requestBody(List<BatchShipmentCreateRequest> requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public AddShipmentsToBatchRequest build() {
            return new AddShipmentsToBatchRequest(
                batchId,
                shippoApiVersion,
                requestBody);
        }
    }
}
