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

public class ListCarrierParcelTemplatesResponse implements com.shippo.sdk.utils.Response {

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

    private Optional<? extends com.shippo.sdk.models.components.CarrierParcelTemplateList> carrierParcelTemplateList;

    @JsonCreator
    public ListCarrierParcelTemplatesResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.shippo.sdk.models.components.CarrierParcelTemplateList> carrierParcelTemplateList) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(carrierParcelTemplateList, "carrierParcelTemplateList");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.carrierParcelTemplateList = carrierParcelTemplateList;
    }
    
    public ListCarrierParcelTemplatesResponse(
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
    public Optional<com.shippo.sdk.models.components.CarrierParcelTemplateList> carrierParcelTemplateList() {
        return (Optional<com.shippo.sdk.models.components.CarrierParcelTemplateList>) carrierParcelTemplateList;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public ListCarrierParcelTemplatesResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListCarrierParcelTemplatesResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListCarrierParcelTemplatesResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    public ListCarrierParcelTemplatesResponse withCarrierParcelTemplateList(com.shippo.sdk.models.components.CarrierParcelTemplateList carrierParcelTemplateList) {
        Utils.checkNotNull(carrierParcelTemplateList, "carrierParcelTemplateList");
        this.carrierParcelTemplateList = Optional.ofNullable(carrierParcelTemplateList);
        return this;
    }

    public ListCarrierParcelTemplatesResponse withCarrierParcelTemplateList(Optional<? extends com.shippo.sdk.models.components.CarrierParcelTemplateList> carrierParcelTemplateList) {
        Utils.checkNotNull(carrierParcelTemplateList, "carrierParcelTemplateList");
        this.carrierParcelTemplateList = carrierParcelTemplateList;
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
        ListCarrierParcelTemplatesResponse other = (ListCarrierParcelTemplatesResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.carrierParcelTemplateList, other.carrierParcelTemplateList);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            carrierParcelTemplateList);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListCarrierParcelTemplatesResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "carrierParcelTemplateList", carrierParcelTemplateList);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.shippo.sdk.models.components.CarrierParcelTemplateList> carrierParcelTemplateList = Optional.empty();  
        
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

        public Builder carrierParcelTemplateList(com.shippo.sdk.models.components.CarrierParcelTemplateList carrierParcelTemplateList) {
            Utils.checkNotNull(carrierParcelTemplateList, "carrierParcelTemplateList");
            this.carrierParcelTemplateList = Optional.ofNullable(carrierParcelTemplateList);
            return this;
        }

        public Builder carrierParcelTemplateList(Optional<? extends com.shippo.sdk.models.components.CarrierParcelTemplateList> carrierParcelTemplateList) {
            Utils.checkNotNull(carrierParcelTemplateList, "carrierParcelTemplateList");
            this.carrierParcelTemplateList = carrierParcelTemplateList;
            return this;
        }
        
        public ListCarrierParcelTemplatesResponse build() {
            return new ListCarrierParcelTemplatesResponse(
                contentType,
                statusCode,
                rawResponse,
                carrierParcelTemplateList);
        }
    }
}

