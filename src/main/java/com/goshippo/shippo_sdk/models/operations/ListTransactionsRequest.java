/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.goshippo.shippo_sdk.models.components.TrackingStatusEnum;
import com.goshippo.shippo_sdk.models.components.TransactionStatusEnum;
import com.goshippo.shippo_sdk.utils.LazySingletonValue;
import com.goshippo.shippo_sdk.utils.SpeakeasyMetadata;
import com.goshippo.shippo_sdk.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;


public class ListTransactionsRequest {

    /**
     * Filter by rate ID
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=rate")
    private Optional<String> rate;

    /**
     * Filter by object status
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=object_status")
    private Optional<? extends TransactionStatusEnum> objectStatus;

    /**
     * Filter by tracking status
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=tracking_status")
    private Optional<? extends TrackingStatusEnum> trackingStatus;

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
    public ListTransactionsRequest(
            Optional<String> rate,
            Optional<? extends TransactionStatusEnum> objectStatus,
            Optional<? extends TrackingStatusEnum> trackingStatus,
            Optional<Long> page,
            Optional<Long> results,
            Optional<String> shippoApiVersion) {
        Utils.checkNotNull(rate, "rate");
        Utils.checkNotNull(objectStatus, "objectStatus");
        Utils.checkNotNull(trackingStatus, "trackingStatus");
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(results, "results");
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.rate = rate;
        this.objectStatus = objectStatus;
        this.trackingStatus = trackingStatus;
        this.page = page;
        this.results = results;
        this.shippoApiVersion = shippoApiVersion;
    }
    
    public ListTransactionsRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Filter by rate ID
     */
    @JsonIgnore
    public Optional<String> rate() {
        return rate;
    }

    /**
     * Filter by object status
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TransactionStatusEnum> objectStatus() {
        return (Optional<TransactionStatusEnum>) objectStatus;
    }

    /**
     * Filter by tracking status
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TrackingStatusEnum> trackingStatus() {
        return (Optional<TrackingStatusEnum>) trackingStatus;
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
     * Filter by rate ID
     */
    public ListTransactionsRequest withRate(String rate) {
        Utils.checkNotNull(rate, "rate");
        this.rate = Optional.ofNullable(rate);
        return this;
    }

    /**
     * Filter by rate ID
     */
    public ListTransactionsRequest withRate(Optional<String> rate) {
        Utils.checkNotNull(rate, "rate");
        this.rate = rate;
        return this;
    }

    /**
     * Filter by object status
     */
    public ListTransactionsRequest withObjectStatus(TransactionStatusEnum objectStatus) {
        Utils.checkNotNull(objectStatus, "objectStatus");
        this.objectStatus = Optional.ofNullable(objectStatus);
        return this;
    }

    /**
     * Filter by object status
     */
    public ListTransactionsRequest withObjectStatus(Optional<? extends TransactionStatusEnum> objectStatus) {
        Utils.checkNotNull(objectStatus, "objectStatus");
        this.objectStatus = objectStatus;
        return this;
    }

    /**
     * Filter by tracking status
     */
    public ListTransactionsRequest withTrackingStatus(TrackingStatusEnum trackingStatus) {
        Utils.checkNotNull(trackingStatus, "trackingStatus");
        this.trackingStatus = Optional.ofNullable(trackingStatus);
        return this;
    }

    /**
     * Filter by tracking status
     */
    public ListTransactionsRequest withTrackingStatus(Optional<? extends TrackingStatusEnum> trackingStatus) {
        Utils.checkNotNull(trackingStatus, "trackingStatus");
        this.trackingStatus = trackingStatus;
        return this;
    }

    /**
     * The page number you want to select
     */
    public ListTransactionsRequest withPage(long page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    /**
     * The page number you want to select
     */
    public ListTransactionsRequest withPage(Optional<Long> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * The number of results to return per page (max 100)
     */
    public ListTransactionsRequest withResults(long results) {
        Utils.checkNotNull(results, "results");
        this.results = Optional.ofNullable(results);
        return this;
    }

    /**
     * The number of results to return per page (max 100)
     */
    public ListTransactionsRequest withResults(Optional<Long> results) {
        Utils.checkNotNull(results, "results");
        this.results = results;
        return this;
    }

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    public ListTransactionsRequest withShippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
        return this;
    }

    /**
     * Optional string used to pick a non-default API version to use. See our &lt;a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/"&gt;API version&lt;/a&gt; guide.
     */
    public ListTransactionsRequest withShippoApiVersion(Optional<String> shippoApiVersion) {
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
        ListTransactionsRequest other = (ListTransactionsRequest) o;
        return 
            Objects.deepEquals(this.rate, other.rate) &&
            Objects.deepEquals(this.objectStatus, other.objectStatus) &&
            Objects.deepEquals(this.trackingStatus, other.trackingStatus) &&
            Objects.deepEquals(this.page, other.page) &&
            Objects.deepEquals(this.results, other.results) &&
            Objects.deepEquals(this.shippoApiVersion, other.shippoApiVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            rate,
            objectStatus,
            trackingStatus,
            page,
            results,
            shippoApiVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListTransactionsRequest.class,
                "rate", rate,
                "objectStatus", objectStatus,
                "trackingStatus", trackingStatus,
                "page", page,
                "results", results,
                "shippoApiVersion", shippoApiVersion);
    }
    
    public final static class Builder {
 
        private Optional<String> rate = Optional.empty();
 
        private Optional<? extends TransactionStatusEnum> objectStatus = Optional.empty();
 
        private Optional<? extends TrackingStatusEnum> trackingStatus = Optional.empty();
 
        private Optional<Long> page;
 
        private Optional<Long> results;
 
        private Optional<String> shippoApiVersion = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Filter by rate ID
         */
        public Builder rate(String rate) {
            Utils.checkNotNull(rate, "rate");
            this.rate = Optional.ofNullable(rate);
            return this;
        }

        /**
         * Filter by rate ID
         */
        public Builder rate(Optional<String> rate) {
            Utils.checkNotNull(rate, "rate");
            this.rate = rate;
            return this;
        }

        /**
         * Filter by object status
         */
        public Builder objectStatus(TransactionStatusEnum objectStatus) {
            Utils.checkNotNull(objectStatus, "objectStatus");
            this.objectStatus = Optional.ofNullable(objectStatus);
            return this;
        }

        /**
         * Filter by object status
         */
        public Builder objectStatus(Optional<? extends TransactionStatusEnum> objectStatus) {
            Utils.checkNotNull(objectStatus, "objectStatus");
            this.objectStatus = objectStatus;
            return this;
        }

        /**
         * Filter by tracking status
         */
        public Builder trackingStatus(TrackingStatusEnum trackingStatus) {
            Utils.checkNotNull(trackingStatus, "trackingStatus");
            this.trackingStatus = Optional.ofNullable(trackingStatus);
            return this;
        }

        /**
         * Filter by tracking status
         */
        public Builder trackingStatus(Optional<? extends TrackingStatusEnum> trackingStatus) {
            Utils.checkNotNull(trackingStatus, "trackingStatus");
            this.trackingStatus = trackingStatus;
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
        
        public ListTransactionsRequest build() {
            if (page == null) {
                page = _SINGLETON_VALUE_Page.value();
            }
            if (results == null) {
                results = _SINGLETON_VALUE_Results.value();
            }            return new ListTransactionsRequest(
                rate,
                objectStatus,
                trackingStatus,
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

