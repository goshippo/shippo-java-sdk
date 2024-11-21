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


public class ListShipmentRatesRequest {

    /**
     * Object ID of the shipment to update
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ShipmentId")
    private String shipmentId;

    /**
     * The page number you want to select
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page")
    private Optional<Long> page;

    /**
     * The number of results to return per page (max 100)
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=results")
    private Optional<Long> results;

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=SHIPPO-API-VERSION")
    private Optional<String> shippoApiVersion;

    @JsonCreator
    public ListShipmentRatesRequest(
            String shipmentId,
            Optional<Long> page,
            Optional<Long> results,
            Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shipmentId, "shipmentId");
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(results, "results");
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shipmentId = shipmentId;
        this.page = page;
        this.results = results;
        this.shippoApiVersion = shippoApiVersion;
    }
    
    public ListShipmentRatesRequest(
            String shipmentId) {
        this(shipmentId, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Object ID of the shipment to update
     */
    @JsonIgnore
    public String shipmentId() {
        return shipmentId;
    }

    /**
     * The page number you want to select
     */
    @JsonIgnore
    public Optional<Long> page() {
        return page;
    }

    /**
     * The number of results to return per page (max 100)
     */
    @JsonIgnore
    public Optional<Long> results() {
        return results;
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
     * Object ID of the shipment to update
     */
    public ListShipmentRatesRequest withShipmentId(String shipmentId) {
        Utils.checkNotNull(shipmentId, "shipmentId");
        this.shipmentId = shipmentId;
        return this;
    }

    /**
     * The page number you want to select
     */
    public ListShipmentRatesRequest withPage(long page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    /**
     * The page number you want to select
     */
    public ListShipmentRatesRequest withPage(Optional<Long> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * The number of results to return per page (max 100)
     */
    public ListShipmentRatesRequest withResults(long results) {
        Utils.checkNotNull(results, "results");
        this.results = Optional.ofNullable(results);
        return this;
    }

    /**
     * The number of results to return per page (max 100)
     */
    public ListShipmentRatesRequest withResults(Optional<Long> results) {
        Utils.checkNotNull(results, "results");
        this.results = results;
        return this;
    }

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    public ListShipmentRatesRequest withShippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
        return this;
    }

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    public ListShipmentRatesRequest withShippoApiVersion(Optional<String> shippoApiVersion) {
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
        ListShipmentRatesRequest other = (ListShipmentRatesRequest) o;
        return 
            Objects.deepEquals(this.shipmentId, other.shipmentId) &&
            Objects.deepEquals(this.page, other.page) &&
            Objects.deepEquals(this.results, other.results) &&
            Objects.deepEquals(this.shippoApiVersion, other.shippoApiVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            shipmentId,
            page,
            results,
            shippoApiVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListShipmentRatesRequest.class,
                "shipmentId", shipmentId,
                "page", page,
                "results", results,
                "shippoApiVersion", shippoApiVersion);
    }
    
    public final static class Builder {
 
        private String shipmentId;
 
        private Optional<Long> page;
 
        private Optional<Long> results;
 
        private Optional<String> shippoApiVersion = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Object ID of the shipment to update
         */
        public Builder shipmentId(String shipmentId) {
            Utils.checkNotNull(shipmentId, "shipmentId");
            this.shipmentId = shipmentId;
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
        public Builder results(Optional<Long> results) {
            Utils.checkNotNull(results, "results");
            this.results = results;
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
        
        public ListShipmentRatesRequest build() {
            if (page == null) {
                page = _SINGLETON_VALUE_Page.value();
            }
            if (results == null) {
                results = _SINGLETON_VALUE_Results.value();
            }            return new ListShipmentRatesRequest(
                shipmentId,
                page,
                results,
                shippoApiVersion);
        }

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_Page =
                new LazySingletonValue<>(
                        "page",
                        "1",
                        new TypeReference<Optional<Long>>() {});

        private static final LazySingletonValue<Optional<Long>> _SINGLETON_VALUE_Results =
                new LazySingletonValue<>(
                        "results",
                        "25",
                        new TypeReference<Optional<Long>>() {});
    }
}

