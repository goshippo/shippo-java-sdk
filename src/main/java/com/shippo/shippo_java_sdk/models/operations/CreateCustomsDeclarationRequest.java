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


public class CreateCustomsDeclarationRequest {

    /**
     * String used to pick a non-default API version to use
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=SHIPPO-API-VERSION")
    private Optional<? extends String> shippoApiVersion;

    /**
     * CustomsDeclaration details.
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private Optional<? extends com.shippo.shippo_java_sdk.models.components.CustomsDeclarationCreateRequest> customsDeclarationCreateRequest;

    @JsonCreator
    public CreateCustomsDeclarationRequest(
            Optional<? extends String> shippoApiVersion,
            Optional<? extends com.shippo.shippo_java_sdk.models.components.CustomsDeclarationCreateRequest> customsDeclarationCreateRequest) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        Utils.checkNotNull(customsDeclarationCreateRequest, "customsDeclarationCreateRequest");
        this.shippoApiVersion = shippoApiVersion;
        this.customsDeclarationCreateRequest = customsDeclarationCreateRequest;
    }
    
    public CreateCustomsDeclarationRequest() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * String used to pick a non-default API version to use
     */
    @JsonIgnore
    public Optional<? extends String> shippoApiVersion() {
        return shippoApiVersion;
    }

    /**
     * CustomsDeclaration details.
     */
    @JsonIgnore
    public Optional<? extends com.shippo.shippo_java_sdk.models.components.CustomsDeclarationCreateRequest> customsDeclarationCreateRequest() {
        return customsDeclarationCreateRequest;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * String used to pick a non-default API version to use
     */
    public CreateCustomsDeclarationRequest withShippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
        return this;
    }

    /**
     * String used to pick a non-default API version to use
     */
    public CreateCustomsDeclarationRequest withShippoApiVersion(Optional<? extends String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    /**
     * CustomsDeclaration details.
     */
    public CreateCustomsDeclarationRequest withCustomsDeclarationCreateRequest(com.shippo.shippo_java_sdk.models.components.CustomsDeclarationCreateRequest customsDeclarationCreateRequest) {
        Utils.checkNotNull(customsDeclarationCreateRequest, "customsDeclarationCreateRequest");
        this.customsDeclarationCreateRequest = Optional.ofNullable(customsDeclarationCreateRequest);
        return this;
    }

    /**
     * CustomsDeclaration details.
     */
    public CreateCustomsDeclarationRequest withCustomsDeclarationCreateRequest(Optional<? extends com.shippo.shippo_java_sdk.models.components.CustomsDeclarationCreateRequest> customsDeclarationCreateRequest) {
        Utils.checkNotNull(customsDeclarationCreateRequest, "customsDeclarationCreateRequest");
        this.customsDeclarationCreateRequest = customsDeclarationCreateRequest;
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
        CreateCustomsDeclarationRequest other = (CreateCustomsDeclarationRequest) o;
        return 
            java.util.Objects.deepEquals(this.shippoApiVersion, other.shippoApiVersion) &&
            java.util.Objects.deepEquals(this.customsDeclarationCreateRequest, other.customsDeclarationCreateRequest);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            shippoApiVersion,
            customsDeclarationCreateRequest);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateCustomsDeclarationRequest.class,
                "shippoApiVersion", shippoApiVersion,
                "customsDeclarationCreateRequest", customsDeclarationCreateRequest);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> shippoApiVersion = Optional.empty();
 
        private Optional<? extends com.shippo.shippo_java_sdk.models.components.CustomsDeclarationCreateRequest> customsDeclarationCreateRequest = Optional.empty();  
        
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
         * CustomsDeclaration details.
         */
        public Builder customsDeclarationCreateRequest(com.shippo.shippo_java_sdk.models.components.CustomsDeclarationCreateRequest customsDeclarationCreateRequest) {
            Utils.checkNotNull(customsDeclarationCreateRequest, "customsDeclarationCreateRequest");
            this.customsDeclarationCreateRequest = Optional.ofNullable(customsDeclarationCreateRequest);
            return this;
        }

        /**
         * CustomsDeclaration details.
         */
        public Builder customsDeclarationCreateRequest(Optional<? extends com.shippo.shippo_java_sdk.models.components.CustomsDeclarationCreateRequest> customsDeclarationCreateRequest) {
            Utils.checkNotNull(customsDeclarationCreateRequest, "customsDeclarationCreateRequest");
            this.customsDeclarationCreateRequest = customsDeclarationCreateRequest;
            return this;
        }
        
        public CreateCustomsDeclarationRequest build() {
            return new CreateCustomsDeclarationRequest(
                shippoApiVersion,
                customsDeclarationCreateRequest);
        }
    }
}

