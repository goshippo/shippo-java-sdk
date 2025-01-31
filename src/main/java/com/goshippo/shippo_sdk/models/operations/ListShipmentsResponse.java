/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.goshippo.shippo_sdk.models.components.ShipmentPaginatedList;
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


public class ListShipmentsResponse implements Response {

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

    private Optional<? extends ShipmentPaginatedList> shipmentPaginatedList;

    @JsonCreator
    public ListShipmentsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends ShipmentPaginatedList> shipmentPaginatedList) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(shipmentPaginatedList, "shipmentPaginatedList");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.shipmentPaginatedList = shipmentPaginatedList;
    }
    
    public ListShipmentsResponse(
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
    public Optional<ShipmentPaginatedList> shipmentPaginatedList() {
        return (Optional<ShipmentPaginatedList>) shipmentPaginatedList;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public ListShipmentsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListShipmentsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListShipmentsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    public ListShipmentsResponse withShipmentPaginatedList(ShipmentPaginatedList shipmentPaginatedList) {
        Utils.checkNotNull(shipmentPaginatedList, "shipmentPaginatedList");
        this.shipmentPaginatedList = Optional.ofNullable(shipmentPaginatedList);
        return this;
    }

    public ListShipmentsResponse withShipmentPaginatedList(Optional<? extends ShipmentPaginatedList> shipmentPaginatedList) {
        Utils.checkNotNull(shipmentPaginatedList, "shipmentPaginatedList");
        this.shipmentPaginatedList = shipmentPaginatedList;
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
        ListShipmentsResponse other = (ListShipmentsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.shipmentPaginatedList, other.shipmentPaginatedList);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            shipmentPaginatedList);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListShipmentsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "shipmentPaginatedList", shipmentPaginatedList);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends ShipmentPaginatedList> shipmentPaginatedList = Optional.empty();  
        
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

        public Builder shipmentPaginatedList(ShipmentPaginatedList shipmentPaginatedList) {
            Utils.checkNotNull(shipmentPaginatedList, "shipmentPaginatedList");
            this.shipmentPaginatedList = Optional.ofNullable(shipmentPaginatedList);
            return this;
        }

        public Builder shipmentPaginatedList(Optional<? extends ShipmentPaginatedList> shipmentPaginatedList) {
            Utils.checkNotNull(shipmentPaginatedList, "shipmentPaginatedList");
            this.shipmentPaginatedList = shipmentPaginatedList;
            return this;
        }
        
        public ListShipmentsResponse build() {
            return new ListShipmentsResponse(
                contentType,
                statusCode,
                rawResponse,
                shipmentPaginatedList);
        }
    }
}

