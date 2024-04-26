/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.shippo_java_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.shippo_java_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpResponse;
import java.util.Optional;


public class CreateServiceGroupResponse implements com.shippo.shippo_java_sdk.utils.Response {

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

    private Optional<? extends com.shippo.shippo_java_sdk.models.components.ServiceGroup> serviceGroup;

    @JsonCreator
    public CreateServiceGroupResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.shippo.shippo_java_sdk.models.components.ServiceGroup> serviceGroup) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(serviceGroup, "serviceGroup");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.serviceGroup = serviceGroup;
    }
    
    public CreateServiceGroupResponse(
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

    @JsonIgnore
    public Optional<? extends com.shippo.shippo_java_sdk.models.components.ServiceGroup> serviceGroup() {
        return serviceGroup;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public CreateServiceGroupResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public CreateServiceGroupResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public CreateServiceGroupResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    public CreateServiceGroupResponse withServiceGroup(com.shippo.shippo_java_sdk.models.components.ServiceGroup serviceGroup) {
        Utils.checkNotNull(serviceGroup, "serviceGroup");
        this.serviceGroup = Optional.ofNullable(serviceGroup);
        return this;
    }

    public CreateServiceGroupResponse withServiceGroup(Optional<? extends com.shippo.shippo_java_sdk.models.components.ServiceGroup> serviceGroup) {
        Utils.checkNotNull(serviceGroup, "serviceGroup");
        this.serviceGroup = serviceGroup;
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
        CreateServiceGroupResponse other = (CreateServiceGroupResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.serviceGroup, other.serviceGroup);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            serviceGroup);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateServiceGroupResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "serviceGroup", serviceGroup);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.shippo.shippo_java_sdk.models.components.ServiceGroup> serviceGroup = Optional.empty();  
        
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

        public Builder serviceGroup(com.shippo.shippo_java_sdk.models.components.ServiceGroup serviceGroup) {
            Utils.checkNotNull(serviceGroup, "serviceGroup");
            this.serviceGroup = Optional.ofNullable(serviceGroup);
            return this;
        }

        public Builder serviceGroup(Optional<? extends com.shippo.shippo_java_sdk.models.components.ServiceGroup> serviceGroup) {
            Utils.checkNotNull(serviceGroup, "serviceGroup");
            this.serviceGroup = serviceGroup;
            return this;
        }
        
        public CreateServiceGroupResponse build() {
            return new CreateServiceGroupResponse(
                contentType,
                statusCode,
                rawResponse,
                serviceGroup);
        }
    }
}

