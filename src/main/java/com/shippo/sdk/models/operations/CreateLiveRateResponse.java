/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;

public class CreateLiveRateResponse implements com.shippo.sdk.utils.Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    private Optional<? extends com.shippo.sdk.models.components.LiveRatePaginatedList> liveRatePaginatedList;

    @JsonCreator
    public CreateLiveRateResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.shippo.sdk.models.components.LiveRatePaginatedList> liveRatePaginatedList) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(liveRatePaginatedList, "liveRatePaginatedList");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.liveRatePaginatedList = liveRatePaginatedList;
    }
    
    public CreateLiveRateResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.shippo.sdk.models.components.LiveRatePaginatedList> liveRatePaginatedList() {
        return (Optional<com.shippo.sdk.models.components.LiveRatePaginatedList>) liveRatePaginatedList;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public CreateLiveRateResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateLiveRateResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateLiveRateResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    public CreateLiveRateResponse withLiveRatePaginatedList(com.shippo.sdk.models.components.LiveRatePaginatedList liveRatePaginatedList) {
        Utils.checkNotNull(liveRatePaginatedList, "liveRatePaginatedList");
        this.liveRatePaginatedList = Optional.ofNullable(liveRatePaginatedList);
        return this;
    }

    public CreateLiveRateResponse withLiveRatePaginatedList(Optional<? extends com.shippo.sdk.models.components.LiveRatePaginatedList> liveRatePaginatedList) {
        Utils.checkNotNull(liveRatePaginatedList, "liveRatePaginatedList");
        this.liveRatePaginatedList = liveRatePaginatedList;
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
        CreateLiveRateResponse other = (CreateLiveRateResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.liveRatePaginatedList, other.liveRatePaginatedList);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            liveRatePaginatedList);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateLiveRateResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "liveRatePaginatedList", liveRatePaginatedList);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.shippo.sdk.models.components.LiveRatePaginatedList> liveRatePaginatedList = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        public Builder liveRatePaginatedList(com.shippo.sdk.models.components.LiveRatePaginatedList liveRatePaginatedList) {
            Utils.checkNotNull(liveRatePaginatedList, "liveRatePaginatedList");
            this.liveRatePaginatedList = Optional.ofNullable(liveRatePaginatedList);
            return this;
        }

        public Builder liveRatePaginatedList(Optional<? extends com.shippo.sdk.models.components.LiveRatePaginatedList> liveRatePaginatedList) {
            Utils.checkNotNull(liveRatePaginatedList, "liveRatePaginatedList");
            this.liveRatePaginatedList = liveRatePaginatedList;
            return this;
        }
        
        public CreateLiveRateResponse build() {
            return new CreateLiveRateResponse(
                contentType,
                statusCode,
                rawResponse,
                liveRatePaginatedList);
        }
    }
}

