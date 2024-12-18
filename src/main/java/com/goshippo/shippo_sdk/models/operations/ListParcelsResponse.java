/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.goshippo.shippo_sdk.models.components.ParcelPaginatedList;
import com.goshippo.shippo_sdk.utils.Response;
import com.goshippo.shippo_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;


public class ListParcelsResponse implements Response {

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

    private Optional<? extends ParcelPaginatedList> parcelPaginatedList;

    @JsonCreator
    public ListParcelsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends ParcelPaginatedList> parcelPaginatedList) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(parcelPaginatedList, "parcelPaginatedList");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.parcelPaginatedList = parcelPaginatedList;
    }
    
    public ListParcelsResponse(
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
    public Optional<ParcelPaginatedList> parcelPaginatedList() {
        return (Optional<ParcelPaginatedList>) parcelPaginatedList;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public ListParcelsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListParcelsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListParcelsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    public ListParcelsResponse withParcelPaginatedList(ParcelPaginatedList parcelPaginatedList) {
        Utils.checkNotNull(parcelPaginatedList, "parcelPaginatedList");
        this.parcelPaginatedList = Optional.ofNullable(parcelPaginatedList);
        return this;
    }

    public ListParcelsResponse withParcelPaginatedList(Optional<? extends ParcelPaginatedList> parcelPaginatedList) {
        Utils.checkNotNull(parcelPaginatedList, "parcelPaginatedList");
        this.parcelPaginatedList = parcelPaginatedList;
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
        ListParcelsResponse other = (ListParcelsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.parcelPaginatedList, other.parcelPaginatedList);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            parcelPaginatedList);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListParcelsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "parcelPaginatedList", parcelPaginatedList);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends ParcelPaginatedList> parcelPaginatedList = Optional.empty();  
        
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

        public Builder parcelPaginatedList(ParcelPaginatedList parcelPaginatedList) {
            Utils.checkNotNull(parcelPaginatedList, "parcelPaginatedList");
            this.parcelPaginatedList = Optional.ofNullable(parcelPaginatedList);
            return this;
        }

        public Builder parcelPaginatedList(Optional<? extends ParcelPaginatedList> parcelPaginatedList) {
            Utils.checkNotNull(parcelPaginatedList, "parcelPaginatedList");
            this.parcelPaginatedList = parcelPaginatedList;
            return this;
        }
        
        public ListParcelsResponse build() {
            return new ListParcelsResponse(
                contentType,
                statusCode,
                rawResponse,
                parcelPaginatedList);
        }
    }
}

