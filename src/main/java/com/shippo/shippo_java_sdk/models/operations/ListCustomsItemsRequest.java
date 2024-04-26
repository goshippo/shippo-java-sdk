/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.shippo_java_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.shippo_java_sdk.utils.LazySingletonValue;
import com.shippo.shippo_java_sdk.utils.SpeakeasyMetadata;
import com.shippo.shippo_java_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class ListCustomsItemsRequest {

    /**
     * The page number you want to select
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page")
    private Optional<? extends Long> page;

    /**
     * The number of results to return per page (max 100)
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=results")
    private Optional<? extends Long> results;

    /**
     * String used to pick a non-default API version to use
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=SHIPPO-API-VERSION")
    private Optional<? extends String> shippoApiVersion;

    @JsonCreator
    public ListCustomsItemsRequest(
            Optional<? extends Long> page,
            Optional<? extends Long> results,
            Optional<? extends String> shippoApiVersion) {
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(results, "results");
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.page = page;
        this.results = results;
        this.shippoApiVersion = shippoApiVersion;
    }
    
    public ListCustomsItemsRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The page number you want to select
     */
    @JsonIgnore
    public Optional<? extends Long> page() {
        return page;
    }

    /**
     * The number of results to return per page (max 100)
     */
    @JsonIgnore
    public Optional<? extends Long> results() {
        return results;
    }

    /**
     * String used to pick a non-default API version to use
     */
    @JsonIgnore
    public Optional<? extends String> shippoApiVersion() {
        return shippoApiVersion;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The page number you want to select
     */
    public ListCustomsItemsRequest withPage(long page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    /**
     * The page number you want to select
     */
    public ListCustomsItemsRequest withPage(Optional<? extends Long> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * The number of results to return per page (max 100)
     */
    public ListCustomsItemsRequest withResults(long results) {
        Utils.checkNotNull(results, "results");
        this.results = Optional.ofNullable(results);
        return this;
    }

    /**
     * The number of results to return per page (max 100)
     */
    public ListCustomsItemsRequest withResults(Optional<? extends Long> results) {
        Utils.checkNotNull(results, "results");
        this.results = results;
        return this;
    }

    /**
     * String used to pick a non-default API version to use
     */
    public ListCustomsItemsRequest withShippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
        return this;
    }

    /**
     * String used to pick a non-default API version to use
     */
    public ListCustomsItemsRequest withShippoApiVersion(Optional<? extends String> shippoApiVersion) {
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
        ListCustomsItemsRequest other = (ListCustomsItemsRequest) o;
        return 
            java.util.Objects.deepEquals(this.page, other.page) &&
            java.util.Objects.deepEquals(this.results, other.results) &&
            java.util.Objects.deepEquals(this.shippoApiVersion, other.shippoApiVersion);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            page,
            results,
            shippoApiVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListCustomsItemsRequest.class,
                "page", page,
                "results", results,
                "shippoApiVersion", shippoApiVersion);
    }
    
    public final static class Builder {
 
        private Optional<? extends Long> page;
 
        private Optional<? extends Long> results;
 
        private Optional<? extends String> shippoApiVersion = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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
        public Builder page(Optional<? extends Long> page) {
            Utils.checkNotNull(page, "page");
            this.page = page;
            return this;
        }

        /**
         * The number of results to return per page (max 100)
         */
        public Builder results(long results) {
            Utils.checkNotNull(results, "results");
            this.results = Optional.ofNullable(results);
            return this;
        }

        /**
         * The number of results to return per page (max 100)
         */
        public Builder results(Optional<? extends Long> results) {
            Utils.checkNotNull(results, "results");
            this.results = results;
            return this;
        }

        /**
         * String used to pick a non-default API version to use
         */
        public Builder shippoApiVersion(String shippoApiVersion) {
            Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
            this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
            return this;
        }

        /**
         * String used to pick a non-default API version to use
         */
        public Builder shippoApiVersion(Optional<? extends String> shippoApiVersion) {
            Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
            this.shippoApiVersion = shippoApiVersion;
            return this;
        }
        
        public ListCustomsItemsRequest build() {
            if (page == null) {
                page = _SINGLETON_VALUE_Page.value();
            }
            if (results == null) {
                results = _SINGLETON_VALUE_Results.value();
            }
            return new ListCustomsItemsRequest(
                page,
                results,
                shippoApiVersion);
        }

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Page =
                new LazySingletonValue<>(
                        "page",
                        "1",
                        new TypeReference<Optional<? extends Long>>() {});

        private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Results =
                new LazySingletonValue<>(
                        "results",
                        "25",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}

