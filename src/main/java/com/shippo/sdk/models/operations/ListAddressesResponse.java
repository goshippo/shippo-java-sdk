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

public class ListAddressesResponse implements com.shippo.sdk.utils.Response {

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

    private Optional<? extends com.shippo.sdk.models.components.AddressPaginatedList> addressPaginatedList;

    @JsonCreator
    public ListAddressesResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.shippo.sdk.models.components.AddressPaginatedList> addressPaginatedList) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(addressPaginatedList, "addressPaginatedList");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.addressPaginatedList = addressPaginatedList;
    }
    
    public ListAddressesResponse(
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
    public Optional<com.shippo.sdk.models.components.AddressPaginatedList> addressPaginatedList() {
        return (Optional<com.shippo.sdk.models.components.AddressPaginatedList>) addressPaginatedList;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public ListAddressesResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListAddressesResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListAddressesResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    public ListAddressesResponse withAddressPaginatedList(com.shippo.sdk.models.components.AddressPaginatedList addressPaginatedList) {
        Utils.checkNotNull(addressPaginatedList, "addressPaginatedList");
        this.addressPaginatedList = Optional.ofNullable(addressPaginatedList);
        return this;
    }

    public ListAddressesResponse withAddressPaginatedList(Optional<? extends com.shippo.sdk.models.components.AddressPaginatedList> addressPaginatedList) {
        Utils.checkNotNull(addressPaginatedList, "addressPaginatedList");
        this.addressPaginatedList = addressPaginatedList;
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
        ListAddressesResponse other = (ListAddressesResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.addressPaginatedList, other.addressPaginatedList);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            addressPaginatedList);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListAddressesResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "addressPaginatedList", addressPaginatedList);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.shippo.sdk.models.components.AddressPaginatedList> addressPaginatedList = Optional.empty();  
        
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

        public Builder addressPaginatedList(com.shippo.sdk.models.components.AddressPaginatedList addressPaginatedList) {
            Utils.checkNotNull(addressPaginatedList, "addressPaginatedList");
            this.addressPaginatedList = Optional.ofNullable(addressPaginatedList);
            return this;
        }

        public Builder addressPaginatedList(Optional<? extends com.shippo.sdk.models.components.AddressPaginatedList> addressPaginatedList) {
            Utils.checkNotNull(addressPaginatedList, "addressPaginatedList");
            this.addressPaginatedList = addressPaginatedList;
            return this;
        }
        
        public ListAddressesResponse build() {
            return new ListAddressesResponse(
                contentType,
                statusCode,
                rawResponse,
                addressPaginatedList);
        }
    }
}

