/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.sdk.utils.LazySingletonValue;
import com.shippo.sdk.utils.SpeakeasyMetadata;
import com.shippo.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

public class ListCarrierAccountsRequest {

    /**
     * Appends the property `service_levels` to each returned carrier account
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=service_levels")
    private Optional<? extends Boolean> serviceLevels;

    /**
     * Filter the response by the specified carrier
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=carrier")
    private Optional<? extends com.shippo.sdk.models.components.CarriersEnum> carrier;

    /**
     * Filter the response by the specified carrier account Id
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=account_id")
    private Optional<? extends String> accountId;

    /**
     * The page number you want to select
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page")
    private Optional<? extends Long> page;

    /**
     * The number of results to return per page (max 100, default 5)
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=results")
    private Optional<? extends Long> results;

    /**
     * String used to pick a non-default API version to use
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=SHIPPO-API-VERSION")
    private Optional<? extends String> shippoApiVersion;

    @JsonCreator
    public ListCarrierAccountsRequest(
            Optional<? extends Boolean> serviceLevels,
            Optional<? extends com.shippo.sdk.models.components.CarriersEnum> carrier,
            Optional<? extends String> accountId,
            Optional<? extends Long> page,
            Optional<? extends Long> results,
            Optional<? extends String> shippoApiVersion) {
        Utils.checkNotNull(serviceLevels, "serviceLevels");
        Utils.checkNotNull(carrier, "carrier");
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(results, "results");
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.serviceLevels = serviceLevels;
        this.carrier = carrier;
        this.accountId = accountId;
        this.page = page;
        this.results = results;
        this.shippoApiVersion = shippoApiVersion;
    }
    
    public ListCarrierAccountsRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Appends the property `service_levels` to each returned carrier account
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> serviceLevels() {
        return (Optional<Boolean>) serviceLevels;
    }

    /**
     * Filter the response by the specified carrier
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<com.shippo.sdk.models.components.CarriersEnum> carrier() {
        return (Optional<com.shippo.sdk.models.components.CarriersEnum>) carrier;
    }

    /**
     * Filter the response by the specified carrier account Id
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> accountId() {
        return (Optional<String>) accountId;
    }

    /**
     * The page number you want to select
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> page() {
        return (Optional<Long>) page;
    }

    /**
     * The number of results to return per page (max 100, default 5)
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> results() {
        return (Optional<Long>) results;
    }

    /**
     * String used to pick a non-default API version to use
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> shippoApiVersion() {
        return (Optional<String>) shippoApiVersion;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Appends the property `service_levels` to each returned carrier account
     */
    public ListCarrierAccountsRequest withServiceLevels(boolean serviceLevels) {
        Utils.checkNotNull(serviceLevels, "serviceLevels");
        this.serviceLevels = Optional.ofNullable(serviceLevels);
        return this;
    }

    /**
     * Appends the property `service_levels` to each returned carrier account
     */
    public ListCarrierAccountsRequest withServiceLevels(Optional<? extends Boolean> serviceLevels) {
        Utils.checkNotNull(serviceLevels, "serviceLevels");
        this.serviceLevels = serviceLevels;
        return this;
    }

    /**
     * Filter the response by the specified carrier
     */
    public ListCarrierAccountsRequest withCarrier(com.shippo.sdk.models.components.CarriersEnum carrier) {
        Utils.checkNotNull(carrier, "carrier");
        this.carrier = Optional.ofNullable(carrier);
        return this;
    }

    /**
     * Filter the response by the specified carrier
     */
    public ListCarrierAccountsRequest withCarrier(Optional<? extends com.shippo.sdk.models.components.CarriersEnum> carrier) {
        Utils.checkNotNull(carrier, "carrier");
        this.carrier = carrier;
        return this;
    }

    /**
     * Filter the response by the specified carrier account Id
     */
    public ListCarrierAccountsRequest withAccountId(String accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = Optional.ofNullable(accountId);
        return this;
    }

    /**
     * Filter the response by the specified carrier account Id
     */
    public ListCarrierAccountsRequest withAccountId(Optional<? extends String> accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    /**
     * The page number you want to select
     */
    public ListCarrierAccountsRequest withPage(long page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    /**
     * The page number you want to select
     */
    public ListCarrierAccountsRequest withPage(Optional<? extends Long> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * The number of results to return per page (max 100, default 5)
     */
    public ListCarrierAccountsRequest withResults(long results) {
        Utils.checkNotNull(results, "results");
        this.results = Optional.ofNullable(results);
        return this;
    }

    /**
     * The number of results to return per page (max 100, default 5)
     */
    public ListCarrierAccountsRequest withResults(Optional<? extends Long> results) {
        Utils.checkNotNull(results, "results");
        this.results = results;
        return this;
    }

    /**
     * String used to pick a non-default API version to use
     */
    public ListCarrierAccountsRequest withShippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.ofNullable(shippoApiVersion);
        return this;
    }

    /**
     * String used to pick a non-default API version to use
     */
    public ListCarrierAccountsRequest withShippoApiVersion(Optional<? extends String> shippoApiVersion) {
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
        ListCarrierAccountsRequest other = (ListCarrierAccountsRequest) o;
        return 
            java.util.Objects.deepEquals(this.serviceLevels, other.serviceLevels) &&
            java.util.Objects.deepEquals(this.carrier, other.carrier) &&
            java.util.Objects.deepEquals(this.accountId, other.accountId) &&
            java.util.Objects.deepEquals(this.page, other.page) &&
            java.util.Objects.deepEquals(this.results, other.results) &&
            java.util.Objects.deepEquals(this.shippoApiVersion, other.shippoApiVersion);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            serviceLevels,
            carrier,
            accountId,
            page,
            results,
            shippoApiVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ListCarrierAccountsRequest.class,
                "serviceLevels", serviceLevels,
                "carrier", carrier,
                "accountId", accountId,
                "page", page,
                "results", results,
                "shippoApiVersion", shippoApiVersion);
    }
    
    public final static class Builder {
 
        private Optional<? extends Boolean> serviceLevels = Optional.empty();
 
        private Optional<? extends com.shippo.sdk.models.components.CarriersEnum> carrier = Optional.empty();
 
        private Optional<? extends String> accountId = Optional.empty();
 
        private Optional<? extends Long> page;
 
        private Optional<? extends Long> results;
 
        private Optional<? extends String> shippoApiVersion = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Appends the property `service_levels` to each returned carrier account
         */
        public Builder serviceLevels(boolean serviceLevels) {
            Utils.checkNotNull(serviceLevels, "serviceLevels");
            this.serviceLevels = Optional.ofNullable(serviceLevels);
            return this;
        }

        /**
         * Appends the property `service_levels` to each returned carrier account
         */
        public Builder serviceLevels(Optional<? extends Boolean> serviceLevels) {
            Utils.checkNotNull(serviceLevels, "serviceLevels");
            this.serviceLevels = serviceLevels;
            return this;
        }

        /**
         * Filter the response by the specified carrier
         */
        public Builder carrier(com.shippo.sdk.models.components.CarriersEnum carrier) {
            Utils.checkNotNull(carrier, "carrier");
            this.carrier = Optional.ofNullable(carrier);
            return this;
        }

        /**
         * Filter the response by the specified carrier
         */
        public Builder carrier(Optional<? extends com.shippo.sdk.models.components.CarriersEnum> carrier) {
            Utils.checkNotNull(carrier, "carrier");
            this.carrier = carrier;
            return this;
        }

        /**
         * Filter the response by the specified carrier account Id
         */
        public Builder accountId(String accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = Optional.ofNullable(accountId);
            return this;
        }

        /**
         * Filter the response by the specified carrier account Id
         */
        public Builder accountId(Optional<? extends String> accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = accountId;
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
        public Builder page(Optional<? extends Long> page) {
            Utils.checkNotNull(page, "page");
            this.page = page;
            return this;
        }

        /**
         * The number of results to return per page (max 100, default 5)
         */
        public Builder results(long results) {
            Utils.checkNotNull(results, "results");
            this.results = Optional.ofNullable(results);
            return this;
        }

        /**
         * The number of results to return per page (max 100, default 5)
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
        
        public ListCarrierAccountsRequest build() {
            if (page == null) {
                page = _SINGLETON_VALUE_Page.value();
            }
            if (results == null) {
                results = _SINGLETON_VALUE_Results.value();
            }
            return new ListCarrierAccountsRequest(
                serviceLevels,
                carrier,
                accountId,
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
                        "5",
                        new TypeReference<Optional<? extends Long>>() {});
    }
}

