/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.goshippo.sdk.models.components.ConnectExistingOwnAccountRequest;
import com.goshippo.sdk.utils.SpeakeasyMetadata;
import com.goshippo.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class CreateCarrierAccountRequest {

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=SHIPPO-API-VERSION")
    private Optional<String> shippoApiVersion;

    /**
     * Examples.
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private ConnectExistingOwnAccountRequest connectExistingOwnAccountRequest;

    @JsonCreator
    public CreateCarrierAccountRequest(
            Optional<String> shippoApiVersion,
            ConnectExistingOwnAccountRequest connectExistingOwnAccountRequest) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        Utils.checkNotNull(connectExistingOwnAccountRequest, "connectExistingOwnAccountRequest");
        this.shippoApiVersion = shippoApiVersion;
        this.connectExistingOwnAccountRequest = connectExistingOwnAccountRequest;
    }
    
    public CreateCarrierAccountRequest(
            ConnectExistingOwnAccountRequest connectExistingOwnAccountRequest) {
        this(Optional.empty(), connectExistingOwnAccountRequest);
    }

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    @JsonIgnore
    public Optional<String> shippoApiVersion() {
        return shippoApiVersion;
    }

    /**
     * Examples.
     */
    @JsonIgnore
    public ConnectExistingOwnAccountRequest connectExistingOwnAccountRequest() {
        return connectExistingOwnAccountRequest;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    public CreateCarrierAccountRequest withShippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
        return this;
    }

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    public CreateCarrierAccountRequest withShippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    /**
     * Examples.
     */
    public CreateCarrierAccountRequest withConnectExistingOwnAccountRequest(ConnectExistingOwnAccountRequest connectExistingOwnAccountRequest) {
        Utils.checkNotNull(connectExistingOwnAccountRequest, "connectExistingOwnAccountRequest");
        this.connectExistingOwnAccountRequest = connectExistingOwnAccountRequest;
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
        CreateCarrierAccountRequest other = (CreateCarrierAccountRequest) o;
        return 
            Objects.deepEquals(this.shippoApiVersion, other.shippoApiVersion) &&
            Objects.deepEquals(this.connectExistingOwnAccountRequest, other.connectExistingOwnAccountRequest);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            shippoApiVersion,
            connectExistingOwnAccountRequest);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateCarrierAccountRequest.class,
                "shippoApiVersion", shippoApiVersion,
                "connectExistingOwnAccountRequest", connectExistingOwnAccountRequest);
    }
    
    public final static class Builder {
 
        private Optional<String> shippoApiVersion = Optional.empty();
 
        private ConnectExistingOwnAccountRequest connectExistingOwnAccountRequest;  
        
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
         * Examples.
         */
        public Builder connectExistingOwnAccountRequest(ConnectExistingOwnAccountRequest connectExistingOwnAccountRequest) {
            Utils.checkNotNull(connectExistingOwnAccountRequest, "connectExistingOwnAccountRequest");
            this.connectExistingOwnAccountRequest = connectExistingOwnAccountRequest;
            return this;
        }
        
        public CreateCarrierAccountRequest build() {
            return new CreateCarrierAccountRequest(
                shippoApiVersion,
                connectExistingOwnAccountRequest);
        }
    }
}
