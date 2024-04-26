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


public class UpdateUserParcelTemplateResponse implements com.shippo.shippo_java_sdk.utils.Response {

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

    private Optional<? extends com.shippo.shippo_java_sdk.models.components.UserParcelTemplate> userParcelTemplate;

    @JsonCreator
    public UpdateUserParcelTemplateResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends com.shippo.shippo_java_sdk.models.components.UserParcelTemplate> userParcelTemplate) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(userParcelTemplate, "userParcelTemplate");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.userParcelTemplate = userParcelTemplate;
    }
    
    public UpdateUserParcelTemplateResponse(
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
    public Optional<? extends com.shippo.shippo_java_sdk.models.components.UserParcelTemplate> userParcelTemplate() {
        return userParcelTemplate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public UpdateUserParcelTemplateResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public UpdateUserParcelTemplateResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public UpdateUserParcelTemplateResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    public UpdateUserParcelTemplateResponse withUserParcelTemplate(com.shippo.shippo_java_sdk.models.components.UserParcelTemplate userParcelTemplate) {
        Utils.checkNotNull(userParcelTemplate, "userParcelTemplate");
        this.userParcelTemplate = Optional.ofNullable(userParcelTemplate);
        return this;
    }

    public UpdateUserParcelTemplateResponse withUserParcelTemplate(Optional<? extends com.shippo.shippo_java_sdk.models.components.UserParcelTemplate> userParcelTemplate) {
        Utils.checkNotNull(userParcelTemplate, "userParcelTemplate");
        this.userParcelTemplate = userParcelTemplate;
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
        UpdateUserParcelTemplateResponse other = (UpdateUserParcelTemplateResponse) o;
        return 
            java.util.Objects.deepEquals(this.contentType, other.contentType) &&
            java.util.Objects.deepEquals(this.statusCode, other.statusCode) &&
            java.util.Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            java.util.Objects.deepEquals(this.userParcelTemplate, other.userParcelTemplate);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            userParcelTemplate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UpdateUserParcelTemplateResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "userParcelTemplate", userParcelTemplate);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends com.shippo.shippo_java_sdk.models.components.UserParcelTemplate> userParcelTemplate = Optional.empty();  
        
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

        public Builder userParcelTemplate(com.shippo.shippo_java_sdk.models.components.UserParcelTemplate userParcelTemplate) {
            Utils.checkNotNull(userParcelTemplate, "userParcelTemplate");
            this.userParcelTemplate = Optional.ofNullable(userParcelTemplate);
            return this;
        }

        public Builder userParcelTemplate(Optional<? extends com.shippo.shippo_java_sdk.models.components.UserParcelTemplate> userParcelTemplate) {
            Utils.checkNotNull(userParcelTemplate, "userParcelTemplate");
            this.userParcelTemplate = userParcelTemplate;
            return this;
        }
        
        public UpdateUserParcelTemplateResponse build() {
            return new UpdateUserParcelTemplateResponse(
                contentType,
                statusCode,
                rawResponse,
                userParcelTemplate);
        }
    }
}

