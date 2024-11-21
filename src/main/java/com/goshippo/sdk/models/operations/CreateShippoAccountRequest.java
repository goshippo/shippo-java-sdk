/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.goshippo.sdk.models.components.ShippoAccountUpdateRequest;
import com.goshippo.sdk.utils.SpeakeasyMetadata;
import com.goshippo.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class CreateShippoAccountRequest {

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=SHIPPO-API-VERSION")
    private Optional<String> shippoApiVersion;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private ShippoAccountUpdateRequest shippoAccountUpdateRequest;

    @JsonCreator
    public CreateShippoAccountRequest(
            Optional<String> shippoApiVersion,
            ShippoAccountUpdateRequest shippoAccountUpdateRequest) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        Utils.checkNotNull(shippoAccountUpdateRequest, "shippoAccountUpdateRequest");
        this.shippoApiVersion = shippoApiVersion;
        this.shippoAccountUpdateRequest = shippoAccountUpdateRequest;
    }
    
    public CreateShippoAccountRequest(
            ShippoAccountUpdateRequest shippoAccountUpdateRequest) {
        this(Optional.empty(), shippoAccountUpdateRequest);
    }

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    @JsonIgnore
    public Optional<String> shippoApiVersion() {
        return shippoApiVersion;
    }

    @JsonIgnore
    public ShippoAccountUpdateRequest shippoAccountUpdateRequest() {
        return shippoAccountUpdateRequest;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    public CreateShippoAccountRequest withShippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
        return this;
    }

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    public CreateShippoAccountRequest withShippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public CreateShippoAccountRequest withShippoAccountUpdateRequest(ShippoAccountUpdateRequest shippoAccountUpdateRequest) {
        Utils.checkNotNull(shippoAccountUpdateRequest, "shippoAccountUpdateRequest");
        this.shippoAccountUpdateRequest = shippoAccountUpdateRequest;
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
        CreateShippoAccountRequest other = (CreateShippoAccountRequest) o;
        return 
            Objects.deepEquals(this.shippoApiVersion, other.shippoApiVersion) &&
            Objects.deepEquals(this.shippoAccountUpdateRequest, other.shippoAccountUpdateRequest);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            shippoApiVersion,
            shippoAccountUpdateRequest);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateShippoAccountRequest.class,
                "shippoApiVersion", shippoApiVersion,
                "shippoAccountUpdateRequest", shippoAccountUpdateRequest);
    }
    
    public final static class Builder {
 
        private Optional<String> shippoApiVersion = Optional.empty();
 
        private ShippoAccountUpdateRequest shippoAccountUpdateRequest;  
        
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

        public Builder shippoAccountUpdateRequest(ShippoAccountUpdateRequest shippoAccountUpdateRequest) {
            Utils.checkNotNull(shippoAccountUpdateRequest, "shippoAccountUpdateRequest");
            this.shippoAccountUpdateRequest = shippoAccountUpdateRequest;
            return this;
        }
        
        public CreateShippoAccountRequest build() {
            return new CreateShippoAccountRequest(
                shippoApiVersion,
                shippoAccountUpdateRequest);
        }
    }
}
