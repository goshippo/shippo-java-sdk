/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shippo.sdk.models.components.TracksRequest;
import com.shippo.sdk.utils.SpeakeasyMetadata;
import com.shippo.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class CreateTrackRequest {

    /**
     * String used to pick a non-default API version to use
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=SHIPPO-API-VERSION")
    private Optional<String> shippoApiVersion;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private TracksRequest tracksRequest;

    @JsonCreator
    public CreateTrackRequest(
            Optional<String> shippoApiVersion,
            TracksRequest tracksRequest) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        Utils.checkNotNull(tracksRequest, "tracksRequest");
        this.shippoApiVersion = shippoApiVersion;
        this.tracksRequest = tracksRequest;
    }
    
    public CreateTrackRequest(
            TracksRequest tracksRequest) {
        this(Optional.empty(), tracksRequest);
    }

    /**
     * String used to pick a non-default API version to use
     */
    @JsonIgnore
    public Optional<String> shippoApiVersion() {
        return shippoApiVersion;
    }

    @JsonIgnore
    public TracksRequest tracksRequest() {
        return tracksRequest;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * String used to pick a non-default API version to use
     */
    public CreateTrackRequest withShippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
        return this;
    }

    /**
     * String used to pick a non-default API version to use
     */
    public CreateTrackRequest withShippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public CreateTrackRequest withTracksRequest(TracksRequest tracksRequest) {
        Utils.checkNotNull(tracksRequest, "tracksRequest");
        this.tracksRequest = tracksRequest;
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
        CreateTrackRequest other = (CreateTrackRequest) o;
        return 
            Objects.deepEquals(this.shippoApiVersion, other.shippoApiVersion) &&
            Objects.deepEquals(this.tracksRequest, other.tracksRequest);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            shippoApiVersion,
            tracksRequest);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateTrackRequest.class,
                "shippoApiVersion", shippoApiVersion,
                "tracksRequest", tracksRequest);
    }
    
    public final static class Builder {
 
        private Optional<String> shippoApiVersion = Optional.empty();
 
        private TracksRequest tracksRequest;  
        
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
        public Builder shippoApiVersion(Optional<String> shippoApiVersion) {
            Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
            this.shippoApiVersion = shippoApiVersion;
            return this;
        }

        public Builder tracksRequest(TracksRequest tracksRequest) {
            Utils.checkNotNull(tracksRequest, "tracksRequest");
            this.tracksRequest = tracksRequest;
            return this;
        }
        
        public CreateTrackRequest build() {
            return new CreateTrackRequest(
                shippoApiVersion,
                tracksRequest);
        }
    }
}

