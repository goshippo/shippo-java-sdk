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

public class CreateCarrierAccountRequest {

    /**
     * String used to pick a non-default API version to use
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=SHIPPO-API-VERSION")
    private Optional<? extends String> shippoApiVersion;

    /**
     * Examples.
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private com.shippo.sdk.models.components.ConnectExistingOwnAccountRequest connectExistingOwnAccountRequest;

    @JsonCreator
    public CreateCarrierAccountRequest(
            Optional<? extends String> shippoApiVersion,
            com.shippo.sdk.models.components.ConnectExistingOwnAccountRequest connectExistingOwnAccountRequest) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        Utils.checkNotNull(connectExistingOwnAccountRequest, "connectExistingOwnAccountRequest");
        this.shippoApiVersion = shippoApiVersion;
        this.connectExistingOwnAccountRequest = connectExistingOwnAccountRequest;
    }
    
    public CreateCarrierAccountRequest(
            com.shippo.sdk.models.components.ConnectExistingOwnAccountRequest connectExistingOwnAccountRequest) {
        this(Optional.empty(), connectExistingOwnAccountRequest);
    }

    /**
     * String used to pick a non-default API version to use
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> shippoApiVersion() {
        return (Optional<String>) shippoApiVersion;
    }

    /**
     * Examples.
     */
    @JsonIgnore
    public com.shippo.sdk.models.components.ConnectExistingOwnAccountRequest connectExistingOwnAccountRequest() {
        return connectExistingOwnAccountRequest;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * String used to pick a non-default API version to use
     */
    public CreateCarrierAccountRequest withShippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
        return this;
    }

    /**
     * String used to pick a non-default API version to use
     */
    public CreateCarrierAccountRequest withShippoApiVersion(Optional<? extends String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    /**
     * Examples.
     */
    public CreateCarrierAccountRequest withConnectExistingOwnAccountRequest(com.shippo.sdk.models.components.ConnectExistingOwnAccountRequest connectExistingOwnAccountRequest) {
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
            java.util.Objects.deepEquals(this.shippoApiVersion, other.shippoApiVersion) &&
            java.util.Objects.deepEquals(this.connectExistingOwnAccountRequest, other.connectExistingOwnAccountRequest);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
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
 
        private Optional<? extends String> shippoApiVersion = Optional.empty();
 
        private com.shippo.sdk.models.components.ConnectExistingOwnAccountRequest connectExistingOwnAccountRequest;  
        
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

        /**
         * Examples.
         */
        public Builder connectExistingOwnAccountRequest(com.shippo.sdk.models.components.ConnectExistingOwnAccountRequest connectExistingOwnAccountRequest) {
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
