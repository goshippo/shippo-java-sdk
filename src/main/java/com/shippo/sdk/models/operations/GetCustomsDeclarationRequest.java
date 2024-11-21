/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.sdk.utils.LazySingletonValue;
import com.shippo.sdk.utils.SpeakeasyMetadata;
import com.shippo.sdk.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class GetCustomsDeclarationRequest {

    /**
     * Object ID of the customs declaration
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=CustomsDeclarationId")
    private String customsDeclarationId;

    /**
     * The page number you want to select
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page")
    private Optional<Long> page;

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=SHIPPO-API-VERSION")
    private Optional<String> shippoApiVersion;

    @JsonCreator
    public GetCustomsDeclarationRequest(
            String customsDeclarationId,
            Optional<Long> page,
            Optional<String> shippoApiVersion) {
        Utils.checkNotNull(customsDeclarationId, "customsDeclarationId");
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.customsDeclarationId = customsDeclarationId;
        this.page = page;
        this.shippoApiVersion = shippoApiVersion;
    }
    
    public GetCustomsDeclarationRequest(
            String customsDeclarationId) {
        this(customsDeclarationId, Optional.empty(), Optional.empty());
    }

    /**
     * Object ID of the customs declaration
     */
    @JsonIgnore
    public String customsDeclarationId() {
        return customsDeclarationId;
    }

    /**
     * The page number you want to select
     */
    @JsonIgnore
    public Optional<Long> page() {
        return page;
    }

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    @JsonIgnore
    public Optional<String> shippoApiVersion() {
        return shippoApiVersion;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Object ID of the customs declaration
     */
    public GetCustomsDeclarationRequest withCustomsDeclarationId(String customsDeclarationId) {
        Utils.checkNotNull(customsDeclarationId, "customsDeclarationId");
        this.customsDeclarationId = customsDeclarationId;
        return this;
    }

    /**
     * The page number you want to select
     */
    public GetCustomsDeclarationRequest withPage(long page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    /**
     * The page number you want to select
     */
    public GetCustomsDeclarationRequest withPage(Optional<Long> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    public GetCustomsDeclarationRequest withShippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
        return this;
    }

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    public GetCustomsDeclarationRequest withShippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
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
        GetCustomsDeclarationRequest other = (GetCustomsDeclarationRequest) o;
        return 
            Objects.deepEquals(this.customsDeclarationId, other.customsDeclarationId) &&
            Objects.deepEquals(this.page, other.page) &&
            Objects.deepEquals(this.shippoApiVersion, other.shippoApiVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            customsDeclarationId,
            page,
            shippoApiVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCustomsDeclarationRequest.class,
                "customsDeclarationId", customsDeclarationId,
                "page", page,
                "shippoApiVersion", shippoApiVersion);
    }
    
    public final static class Builder {
 
        private String customsDeclarationId;
 
        private Optional<Long> page;
 
        private Optional<String> shippoApiVersion = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Object ID of the customs declaration
         */
        public Builder customsDeclarationId(String customsDeclarationId) {
            Utils.checkNotNull(customsDeclarationId, "customsDeclarationId");
            this.customsDeclarationId = customsDeclarationId;
            return this;
        }

        /**
         * The page number you want to select
         */
        public Builder page(long page) {
            Utils.checkNotNull(page, "page");
            this.page = Optional.ofNullable(page);
            return this;
        }

        /**
         * The page number you want to select
         */
        public Builder page(Optional<Long> page) {
            Utils.checkNotNull(page, "page");
            this.page = page;
            return this;
        }

        /**
         * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
         */
        public Builder shippoApiVersion(String shippoApiVersion) {
            Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
            this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
            return this;
        }

        /**
         * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
         */
        public Builder shippoApiVersion(Optional<String> shippoApiVersion) {
            Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
            this.shippoApiVersion = shippoApiVersion;
            return this;
        }
        
        public GetCustomsDeclarationRequest build() {
            if (page == null) {
                page = _SINGLETON_VALUE_Page.value();
            }            return new GetCustomsDeclarationRequest(
                customsDeclarationId,
                page,
                shippoApiVersion);
        }

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_Page =
                new LazySingletonValue<>(
                        "page",
                        "1",
                        new TypeReference<Optional<Long>>() {});
    }
}

