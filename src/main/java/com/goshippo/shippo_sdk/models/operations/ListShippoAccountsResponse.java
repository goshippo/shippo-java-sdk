/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.goshippo.shippo_sdk.models.components.ShippoAccountPaginatedList;
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


public class ListShippoAccountsResponse implements Response {

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

    private Optional<? extends ShippoAccountPaginatedList> shippoAccountPaginatedList;

    @JsonCreator
    public ListShippoAccountsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends ShippoAccountPaginatedList> shippoAccountPaginatedList) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(shippoAccountPaginatedList, "shippoAccountPaginatedList");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.shippoAccountPaginatedList = shippoAccountPaginatedList;
    }
    
    public ListShippoAccountsResponse(
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
    public Optional<ShippoAccountPaginatedList> shippoAccountPaginatedList() {
        return (Optional<ShippoAccountPaginatedList>) shippoAccountPaginatedList;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public ListShippoAccountsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListShippoAccountsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListShippoAccountsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    public ListShippoAccountsResponse withShippoAccountPaginatedList(ShippoAccountPaginatedList shippoAccountPaginatedList) {
        Utils.checkNotNull(shippoAccountPaginatedList, "shippoAccountPaginatedList");
        this.shippoAccountPaginatedList = Optional.ofNullable(shippoAccountPaginatedList);
        return this;
    }

    public ListShippoAccountsResponse withShippoAccountPaginatedList(Optional<? extends ShippoAccountPaginatedList> shippoAccountPaginatedList) {
        Utils.checkNotNull(shippoAccountPaginatedList, "shippoAccountPaginatedList");
        this.shippoAccountPaginatedList = shippoAccountPaginatedList;
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
        ListShippoAccountsResponse other = (ListShippoAccountsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.shippoAccountPaginatedList, other.shippoAccountPaginatedList);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            shippoAccountPaginatedList);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListShippoAccountsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "shippoAccountPaginatedList", shippoAccountPaginatedList);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends ShippoAccountPaginatedList> shippoAccountPaginatedList = Optional.empty();  
        
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

        public Builder shippoAccountPaginatedList(ShippoAccountPaginatedList shippoAccountPaginatedList) {
            Utils.checkNotNull(shippoAccountPaginatedList, "shippoAccountPaginatedList");
            this.shippoAccountPaginatedList = Optional.ofNullable(shippoAccountPaginatedList);
            return this;
        }

        public Builder shippoAccountPaginatedList(Optional<? extends ShippoAccountPaginatedList> shippoAccountPaginatedList) {
            Utils.checkNotNull(shippoAccountPaginatedList, "shippoAccountPaginatedList");
            this.shippoAccountPaginatedList = shippoAccountPaginatedList;
            return this;
        }
        
        public ListShippoAccountsResponse build() {
            return new ListShippoAccountsResponse(
                contentType,
                statusCode,
                rawResponse,
                shippoAccountPaginatedList);
        }
    }
}

