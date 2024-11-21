/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.goshippo.sdk.models.components.ServiceGroup;
import com.goshippo.sdk.utils.Response;
import com.goshippo.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class ListServiceGroupsResponse implements Response {

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

    private Optional<? extends List<ServiceGroup>> serviceGroupListResponse;

    @JsonCreator
    public ListServiceGroupsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends List<ServiceGroup>> serviceGroupListResponse) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(serviceGroupListResponse, "serviceGroupListResponse");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.serviceGroupListResponse = serviceGroupListResponse;
    }
    
    public ListServiceGroupsResponse(
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
    public Optional<List<ServiceGroup>> serviceGroupListResponse() {
        return (Optional<List<ServiceGroup>>) serviceGroupListResponse;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public ListServiceGroupsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public ListServiceGroupsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public ListServiceGroupsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    public ListServiceGroupsResponse withServiceGroupListResponse(List<ServiceGroup> serviceGroupListResponse) {
        Utils.checkNotNull(serviceGroupListResponse, "serviceGroupListResponse");
        this.serviceGroupListResponse = Optional.ofNullable(serviceGroupListResponse);
        return this;
    }

    public ListServiceGroupsResponse withServiceGroupListResponse(Optional<? extends List<ServiceGroup>> serviceGroupListResponse) {
        Utils.checkNotNull(serviceGroupListResponse, "serviceGroupListResponse");
        this.serviceGroupListResponse = serviceGroupListResponse;
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
        ListServiceGroupsResponse other = (ListServiceGroupsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.serviceGroupListResponse, other.serviceGroupListResponse);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            serviceGroupListResponse);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListServiceGroupsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "serviceGroupListResponse", serviceGroupListResponse);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends List<ServiceGroup>> serviceGroupListResponse = Optional.empty();  
        
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

        public Builder serviceGroupListResponse(List<ServiceGroup> serviceGroupListResponse) {
            Utils.checkNotNull(serviceGroupListResponse, "serviceGroupListResponse");
            this.serviceGroupListResponse = Optional.ofNullable(serviceGroupListResponse);
            return this;
        }

        public Builder serviceGroupListResponse(Optional<? extends List<ServiceGroup>> serviceGroupListResponse) {
            Utils.checkNotNull(serviceGroupListResponse, "serviceGroupListResponse");
            this.serviceGroupListResponse = serviceGroupListResponse;
            return this;
        }
        
        public ListServiceGroupsResponse build() {
            return new ListServiceGroupsResponse(
                contentType,
                statusCode,
                rawResponse,
                serviceGroupListResponse);
        }
    }
}
