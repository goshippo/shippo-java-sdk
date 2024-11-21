/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.goshippo.sdk.models.components.ManifestCreateRequest;
import com.goshippo.sdk.utils.SpeakeasyMetadata;
import com.goshippo.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class CreateManifestRequest {

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=SHIPPO-API-VERSION")
    private Optional<String> shippoApiVersion;

    /**
     * Manifest details and contact info.
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private ManifestCreateRequest manifestCreateRequest;

    @JsonCreator
    public CreateManifestRequest(
            Optional<String> shippoApiVersion,
            ManifestCreateRequest manifestCreateRequest) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        Utils.checkNotNull(manifestCreateRequest, "manifestCreateRequest");
        this.shippoApiVersion = shippoApiVersion;
        this.manifestCreateRequest = manifestCreateRequest;
    }
    
    public CreateManifestRequest(
            ManifestCreateRequest manifestCreateRequest) {
        this(Optional.empty(), manifestCreateRequest);
    }

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    @JsonIgnore
    public Optional<String> shippoApiVersion() {
        return shippoApiVersion;
    }

    /**
     * Manifest details and contact info.
     */
    @JsonIgnore
    public ManifestCreateRequest manifestCreateRequest() {
        return manifestCreateRequest;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    public CreateManifestRequest withShippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
        return this;
    }

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    public CreateManifestRequest withShippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    /**
     * Manifest details and contact info.
     */
    public CreateManifestRequest withManifestCreateRequest(ManifestCreateRequest manifestCreateRequest) {
        Utils.checkNotNull(manifestCreateRequest, "manifestCreateRequest");
        this.manifestCreateRequest = manifestCreateRequest;
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
        CreateManifestRequest other = (CreateManifestRequest) o;
        return 
            Objects.deepEquals(this.shippoApiVersion, other.shippoApiVersion) &&
            Objects.deepEquals(this.manifestCreateRequest, other.manifestCreateRequest);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            shippoApiVersion,
            manifestCreateRequest);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateManifestRequest.class,
                "shippoApiVersion", shippoApiVersion,
                "manifestCreateRequest", manifestCreateRequest);
    }
    
    public final static class Builder {
 
        private Optional<String> shippoApiVersion = Optional.empty();
 
        private ManifestCreateRequest manifestCreateRequest;  
        
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
         * Manifest details and contact info.
         */
        public Builder manifestCreateRequest(ManifestCreateRequest manifestCreateRequest) {
            Utils.checkNotNull(manifestCreateRequest, "manifestCreateRequest");
            this.manifestCreateRequest = manifestCreateRequest;
            return this;
        }
        
        public CreateManifestRequest build() {
            return new CreateManifestRequest(
                shippoApiVersion,
                manifestCreateRequest);
        }
    }
}
