/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.shippo_java_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.shippo.shippo_java_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;


public class PickupBase {

    /**
     * The object ID of your USPS or DHL Express carrier account. 
     * You can retrieve this from your Rate requests or our &lt;a href="#tag/Carrier-Accounts/"&gt;Carrier Accounts&lt;/a&gt; endpoint.
     */
    @JsonProperty("carrier_account")
    private String carrierAccount;

    /**
     * Location where the parcel(s) will be picked up.
     */
    @JsonProperty("location")
    private Location location;

    /**
     * A string of up to 100 characters that can be filled with any additional information you 
     * want to attach to the object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends String> metadata;

    /**
     * The latest that you requested your parcels to be available for pickup. 
     * Expressed in the timezone specified in the response.
     */
    @JsonProperty("requested_end_time")
    private OffsetDateTime requestedEndTime;

    /**
     * The earliest that you requested your parcels to be ready for pickup. 
     * Expressed in the timezone specified in the response.
     */
    @JsonProperty("requested_start_time")
    private OffsetDateTime requestedStartTime;

    /**
     * The transaction(s) object ID(s) for the parcel(s) that need to be picked up.
     */
    @JsonProperty("transactions")
    private java.util.List<String> transactions;

    @JsonCreator
    public PickupBase(
            @JsonProperty("carrier_account") String carrierAccount,
            @JsonProperty("location") Location location,
            @JsonProperty("metadata") Optional<? extends String> metadata,
            @JsonProperty("requested_end_time") OffsetDateTime requestedEndTime,
            @JsonProperty("requested_start_time") OffsetDateTime requestedStartTime,
            @JsonProperty("transactions") java.util.List<String> transactions) {
        Utils.checkNotNull(carrierAccount, "carrierAccount");
        Utils.checkNotNull(location, "location");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(requestedEndTime, "requestedEndTime");
        Utils.checkNotNull(requestedStartTime, "requestedStartTime");
        Utils.checkNotNull(transactions, "transactions");
        this.carrierAccount = carrierAccount;
        this.location = location;
        this.metadata = metadata;
        this.requestedEndTime = requestedEndTime;
        this.requestedStartTime = requestedStartTime;
        this.transactions = transactions;
    }
    
    public PickupBase(
            String carrierAccount,
            Location location,
            OffsetDateTime requestedEndTime,
            OffsetDateTime requestedStartTime,
            java.util.List<String> transactions) {
        this(carrierAccount, location, Optional.empty(), requestedEndTime, requestedStartTime, transactions);
    }

    /**
     * The object ID of your USPS or DHL Express carrier account. 
     * You can retrieve this from your Rate requests or our &lt;a href="#tag/Carrier-Accounts/"&gt;Carrier Accounts&lt;/a&gt; endpoint.
     */
    @JsonIgnore
    public String carrierAccount() {
        return carrierAccount;
    }

    /**
     * Location where the parcel(s) will be picked up.
     */
    @JsonIgnore
    public Location location() {
        return location;
    }

    /**
     * A string of up to 100 characters that can be filled with any additional information you 
     * want to attach to the object.
     */
    @JsonIgnore
    public Optional<? extends String> metadata() {
        return metadata;
    }

    /**
     * The latest that you requested your parcels to be available for pickup. 
     * Expressed in the timezone specified in the response.
     */
    @JsonIgnore
    public OffsetDateTime requestedEndTime() {
        return requestedEndTime;
    }

    /**
     * The earliest that you requested your parcels to be ready for pickup. 
     * Expressed in the timezone specified in the response.
     */
    @JsonIgnore
    public OffsetDateTime requestedStartTime() {
        return requestedStartTime;
    }

    /**
     * The transaction(s) object ID(s) for the parcel(s) that need to be picked up.
     */
    @JsonIgnore
    public java.util.List<String> transactions() {
        return transactions;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The object ID of your USPS or DHL Express carrier account. 
     * You can retrieve this from your Rate requests or our &lt;a href="#tag/Carrier-Accounts/"&gt;Carrier Accounts&lt;/a&gt; endpoint.
     */
    public PickupBase withCarrierAccount(String carrierAccount) {
        Utils.checkNotNull(carrierAccount, "carrierAccount");
        this.carrierAccount = carrierAccount;
        return this;
    }

    /**
     * Location where the parcel(s) will be picked up.
     */
    public PickupBase withLocation(Location location) {
        Utils.checkNotNull(location, "location");
        this.location = location;
        return this;
    }

    /**
     * A string of up to 100 characters that can be filled with any additional information you 
     * want to attach to the object.
     */
    public PickupBase withMetadata(String metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * A string of up to 100 characters that can be filled with any additional information you 
     * want to attach to the object.
     */
    public PickupBase withMetadata(Optional<? extends String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    /**
     * The latest that you requested your parcels to be available for pickup. 
     * Expressed in the timezone specified in the response.
     */
    public PickupBase withRequestedEndTime(OffsetDateTime requestedEndTime) {
        Utils.checkNotNull(requestedEndTime, "requestedEndTime");
        this.requestedEndTime = requestedEndTime;
        return this;
    }

    /**
     * The earliest that you requested your parcels to be ready for pickup. 
     * Expressed in the timezone specified in the response.
     */
    public PickupBase withRequestedStartTime(OffsetDateTime requestedStartTime) {
        Utils.checkNotNull(requestedStartTime, "requestedStartTime");
        this.requestedStartTime = requestedStartTime;
        return this;
    }

    /**
     * The transaction(s) object ID(s) for the parcel(s) that need to be picked up.
     */
    public PickupBase withTransactions(java.util.List<String> transactions) {
        Utils.checkNotNull(transactions, "transactions");
        this.transactions = transactions;
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
        PickupBase other = (PickupBase) o;
        return 
            java.util.Objects.deepEquals(this.carrierAccount, other.carrierAccount) &&
            java.util.Objects.deepEquals(this.location, other.location) &&
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.requestedEndTime, other.requestedEndTime) &&
            java.util.Objects.deepEquals(this.requestedStartTime, other.requestedStartTime) &&
            java.util.Objects.deepEquals(this.transactions, other.transactions);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            carrierAccount,
            location,
            metadata,
            requestedEndTime,
            requestedStartTime,
            transactions);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PickupBase.class,
                "carrierAccount", carrierAccount,
                "location", location,
                "metadata", metadata,
                "requestedEndTime", requestedEndTime,
                "requestedStartTime", requestedStartTime,
                "transactions", transactions);
    }
    
    public final static class Builder {
 
        private String carrierAccount;
 
        private Location location;
 
        private Optional<? extends String> metadata = Optional.empty();
 
        private OffsetDateTime requestedEndTime;
 
        private OffsetDateTime requestedStartTime;
 
        private java.util.List<String> transactions;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The object ID of your USPS or DHL Express carrier account. 
         * You can retrieve this from your Rate requests or our &lt;a href="#tag/Carrier-Accounts/"&gt;Carrier Accounts&lt;/a&gt; endpoint.
         */
        public Builder carrierAccount(String carrierAccount) {
            Utils.checkNotNull(carrierAccount, "carrierAccount");
            this.carrierAccount = carrierAccount;
            return this;
        }

        /**
         * Location where the parcel(s) will be picked up.
         */
        public Builder location(Location location) {
            Utils.checkNotNull(location, "location");
            this.location = location;
            return this;
        }

        /**
         * A string of up to 100 characters that can be filled with any additional information you 
         * want to attach to the object.
         */
        public Builder metadata(String metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        /**
         * A string of up to 100 characters that can be filled with any additional information you 
         * want to attach to the object.
         */
        public Builder metadata(Optional<? extends String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        /**
         * The latest that you requested your parcels to be available for pickup. 
         * Expressed in the timezone specified in the response.
         */
        public Builder requestedEndTime(OffsetDateTime requestedEndTime) {
            Utils.checkNotNull(requestedEndTime, "requestedEndTime");
            this.requestedEndTime = requestedEndTime;
            return this;
        }

        /**
         * The earliest that you requested your parcels to be ready for pickup. 
         * Expressed in the timezone specified in the response.
         */
        public Builder requestedStartTime(OffsetDateTime requestedStartTime) {
            Utils.checkNotNull(requestedStartTime, "requestedStartTime");
            this.requestedStartTime = requestedStartTime;
            return this;
        }

        /**
         * The transaction(s) object ID(s) for the parcel(s) that need to be picked up.
         */
        public Builder transactions(java.util.List<String> transactions) {
            Utils.checkNotNull(transactions, "transactions");
            this.transactions = transactions;
            return this;
        }
        
        public PickupBase build() {
            return new PickupBase(
                carrierAccount,
                location,
                metadata,
                requestedEndTime,
                requestedStartTime,
                transactions);
        }
    }
}

