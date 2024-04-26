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


public class Pickup {

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

    /**
     * Date and time of Pickup creation.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object_created")
    private Optional<? extends OffsetDateTime> objectCreated;

    /**
     * Unique identifier of the given Pickup object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object_id")
    private Optional<? extends String> objectId;

    /**
     * Date and time of last Pickup update.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object_updated")
    private Optional<? extends OffsetDateTime> objectUpdated;

    /**
     * The earliest that your parcels will be ready for pickup, confirmed by the carrier. 
     * Expressed in the timezone specified in the response.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("confirmed_start_time")
    private Optional<? extends String> confirmedStartTime;

    /**
     * The latest that your parcels will be available for pickup, confirmed by the carrier. 
     * Expressed in the timezone specified in the response.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("confirmed_end_time")
    private Optional<? extends String> confirmedEndTime;

    /**
     * The latest time to cancel a pickup. Expressed in the timezone specified in the response. 
     * To cancel a pickup, you will need to contact the carrier directly. 
     * The ability to cancel a pickup through Shippo may be released in future iterations.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cancel_by_time")
    private Optional<? extends String> cancelByTime;

    /**
     * Indicates the status of the pickup.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends PickupStatus> status;

    /**
     * Pickup's confirmation code returned by the carrier. 
     * To edit or cancel a pickup, you will need to contact USPS or DHL Express directly and provide your `confirmation_code`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("confirmation_code")
    private Optional<? extends String> confirmationCode;

    /**
     * The pickup time windows will be in the time zone specified here, not UTC.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timezone")
    private Optional<? extends String> timezone;

    /**
     * An array containing strings of any messages generated during validation.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("messages")
    private Optional<? extends java.util.List<String>> messages;

    /**
     * Indicates whether the object has been created in test mode.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_test")
    private Optional<? extends Boolean> isTest;

    @JsonCreator
    public Pickup(
            @JsonProperty("carrier_account") String carrierAccount,
            @JsonProperty("location") Location location,
            @JsonProperty("metadata") Optional<? extends String> metadata,
            @JsonProperty("requested_end_time") OffsetDateTime requestedEndTime,
            @JsonProperty("requested_start_time") OffsetDateTime requestedStartTime,
            @JsonProperty("transactions") java.util.List<String> transactions,
            @JsonProperty("object_created") Optional<? extends OffsetDateTime> objectCreated,
            @JsonProperty("object_id") Optional<? extends String> objectId,
            @JsonProperty("object_updated") Optional<? extends OffsetDateTime> objectUpdated,
            @JsonProperty("confirmed_start_time") Optional<? extends String> confirmedStartTime,
            @JsonProperty("confirmed_end_time") Optional<? extends String> confirmedEndTime,
            @JsonProperty("cancel_by_time") Optional<? extends String> cancelByTime,
            @JsonProperty("status") Optional<? extends PickupStatus> status,
            @JsonProperty("confirmation_code") Optional<? extends String> confirmationCode,
            @JsonProperty("timezone") Optional<? extends String> timezone,
            @JsonProperty("messages") Optional<? extends java.util.List<String>> messages,
            @JsonProperty("is_test") Optional<? extends Boolean> isTest) {
        Utils.checkNotNull(carrierAccount, "carrierAccount");
        Utils.checkNotNull(location, "location");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(requestedEndTime, "requestedEndTime");
        Utils.checkNotNull(requestedStartTime, "requestedStartTime");
        Utils.checkNotNull(transactions, "transactions");
        Utils.checkNotNull(objectCreated, "objectCreated");
        Utils.checkNotNull(objectId, "objectId");
        Utils.checkNotNull(objectUpdated, "objectUpdated");
        Utils.checkNotNull(confirmedStartTime, "confirmedStartTime");
        Utils.checkNotNull(confirmedEndTime, "confirmedEndTime");
        Utils.checkNotNull(cancelByTime, "cancelByTime");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(confirmationCode, "confirmationCode");
        Utils.checkNotNull(timezone, "timezone");
        Utils.checkNotNull(messages, "messages");
        Utils.checkNotNull(isTest, "isTest");
        this.carrierAccount = carrierAccount;
        this.location = location;
        this.metadata = metadata;
        this.requestedEndTime = requestedEndTime;
        this.requestedStartTime = requestedStartTime;
        this.transactions = transactions;
        this.objectCreated = objectCreated;
        this.objectId = objectId;
        this.objectUpdated = objectUpdated;
        this.confirmedStartTime = confirmedStartTime;
        this.confirmedEndTime = confirmedEndTime;
        this.cancelByTime = cancelByTime;
        this.status = status;
        this.confirmationCode = confirmationCode;
        this.timezone = timezone;
        this.messages = messages;
        this.isTest = isTest;
    }
    
    public Pickup(
            String carrierAccount,
            Location location,
            OffsetDateTime requestedEndTime,
            OffsetDateTime requestedStartTime,
            java.util.List<String> transactions) {
        this(carrierAccount, location, Optional.empty(), requestedEndTime, requestedStartTime, transactions, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
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

    /**
     * Date and time of Pickup creation.
     */
    @JsonIgnore
    public Optional<? extends OffsetDateTime> objectCreated() {
        return objectCreated;
    }

    /**
     * Unique identifier of the given Pickup object.
     */
    @JsonIgnore
    public Optional<? extends String> objectId() {
        return objectId;
    }

    /**
     * Date and time of last Pickup update.
     */
    @JsonIgnore
    public Optional<? extends OffsetDateTime> objectUpdated() {
        return objectUpdated;
    }

    /**
     * The earliest that your parcels will be ready for pickup, confirmed by the carrier. 
     * Expressed in the timezone specified in the response.
     */
    @JsonIgnore
    public Optional<? extends String> confirmedStartTime() {
        return confirmedStartTime;
    }

    /**
     * The latest that your parcels will be available for pickup, confirmed by the carrier. 
     * Expressed in the timezone specified in the response.
     */
    @JsonIgnore
    public Optional<? extends String> confirmedEndTime() {
        return confirmedEndTime;
    }

    /**
     * The latest time to cancel a pickup. Expressed in the timezone specified in the response. 
     * To cancel a pickup, you will need to contact the carrier directly. 
     * The ability to cancel a pickup through Shippo may be released in future iterations.
     */
    @JsonIgnore
    public Optional<? extends String> cancelByTime() {
        return cancelByTime;
    }

    /**
     * Indicates the status of the pickup.
     */
    @JsonIgnore
    public Optional<? extends PickupStatus> status() {
        return status;
    }

    /**
     * Pickup's confirmation code returned by the carrier. 
     * To edit or cancel a pickup, you will need to contact USPS or DHL Express directly and provide your `confirmation_code`.
     */
    @JsonIgnore
    public Optional<? extends String> confirmationCode() {
        return confirmationCode;
    }

    /**
     * The pickup time windows will be in the time zone specified here, not UTC.
     */
    @JsonIgnore
    public Optional<? extends String> timezone() {
        return timezone;
    }

    /**
     * An array containing strings of any messages generated during validation.
     */
    @JsonIgnore
    public Optional<? extends java.util.List<String>> messages() {
        return messages;
    }

    /**
     * Indicates whether the object has been created in test mode.
     */
    @JsonIgnore
    public Optional<? extends Boolean> isTest() {
        return isTest;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The object ID of your USPS or DHL Express carrier account. 
     * You can retrieve this from your Rate requests or our &lt;a href="#tag/Carrier-Accounts/"&gt;Carrier Accounts&lt;/a&gt; endpoint.
     */
    public Pickup withCarrierAccount(String carrierAccount) {
        Utils.checkNotNull(carrierAccount, "carrierAccount");
        this.carrierAccount = carrierAccount;
        return this;
    }

    /**
     * Location where the parcel(s) will be picked up.
     */
    public Pickup withLocation(Location location) {
        Utils.checkNotNull(location, "location");
        this.location = location;
        return this;
    }

    /**
     * A string of up to 100 characters that can be filled with any additional information you 
     * want to attach to the object.
     */
    public Pickup withMetadata(String metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * A string of up to 100 characters that can be filled with any additional information you 
     * want to attach to the object.
     */
    public Pickup withMetadata(Optional<? extends String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    /**
     * The latest that you requested your parcels to be available for pickup. 
     * Expressed in the timezone specified in the response.
     */
    public Pickup withRequestedEndTime(OffsetDateTime requestedEndTime) {
        Utils.checkNotNull(requestedEndTime, "requestedEndTime");
        this.requestedEndTime = requestedEndTime;
        return this;
    }

    /**
     * The earliest that you requested your parcels to be ready for pickup. 
     * Expressed in the timezone specified in the response.
     */
    public Pickup withRequestedStartTime(OffsetDateTime requestedStartTime) {
        Utils.checkNotNull(requestedStartTime, "requestedStartTime");
        this.requestedStartTime = requestedStartTime;
        return this;
    }

    /**
     * The transaction(s) object ID(s) for the parcel(s) that need to be picked up.
     */
    public Pickup withTransactions(java.util.List<String> transactions) {
        Utils.checkNotNull(transactions, "transactions");
        this.transactions = transactions;
        return this;
    }

    /**
     * Date and time of Pickup creation.
     */
    public Pickup withObjectCreated(OffsetDateTime objectCreated) {
        Utils.checkNotNull(objectCreated, "objectCreated");
        this.objectCreated = Optional.ofNullable(objectCreated);
        return this;
    }

    /**
     * Date and time of Pickup creation.
     */
    public Pickup withObjectCreated(Optional<? extends OffsetDateTime> objectCreated) {
        Utils.checkNotNull(objectCreated, "objectCreated");
        this.objectCreated = objectCreated;
        return this;
    }

    /**
     * Unique identifier of the given Pickup object.
     */
    public Pickup withObjectId(String objectId) {
        Utils.checkNotNull(objectId, "objectId");
        this.objectId = Optional.ofNullable(objectId);
        return this;
    }

    /**
     * Unique identifier of the given Pickup object.
     */
    public Pickup withObjectId(Optional<? extends String> objectId) {
        Utils.checkNotNull(objectId, "objectId");
        this.objectId = objectId;
        return this;
    }

    /**
     * Date and time of last Pickup update.
     */
    public Pickup withObjectUpdated(OffsetDateTime objectUpdated) {
        Utils.checkNotNull(objectUpdated, "objectUpdated");
        this.objectUpdated = Optional.ofNullable(objectUpdated);
        return this;
    }

    /**
     * Date and time of last Pickup update.
     */
    public Pickup withObjectUpdated(Optional<? extends OffsetDateTime> objectUpdated) {
        Utils.checkNotNull(objectUpdated, "objectUpdated");
        this.objectUpdated = objectUpdated;
        return this;
    }

    /**
     * The earliest that your parcels will be ready for pickup, confirmed by the carrier. 
     * Expressed in the timezone specified in the response.
     */
    public Pickup withConfirmedStartTime(String confirmedStartTime) {
        Utils.checkNotNull(confirmedStartTime, "confirmedStartTime");
        this.confirmedStartTime = Optional.ofNullable(confirmedStartTime);
        return this;
    }

    /**
     * The earliest that your parcels will be ready for pickup, confirmed by the carrier. 
     * Expressed in the timezone specified in the response.
     */
    public Pickup withConfirmedStartTime(Optional<? extends String> confirmedStartTime) {
        Utils.checkNotNull(confirmedStartTime, "confirmedStartTime");
        this.confirmedStartTime = confirmedStartTime;
        return this;
    }

    /**
     * The latest that your parcels will be available for pickup, confirmed by the carrier. 
     * Expressed in the timezone specified in the response.
     */
    public Pickup withConfirmedEndTime(String confirmedEndTime) {
        Utils.checkNotNull(confirmedEndTime, "confirmedEndTime");
        this.confirmedEndTime = Optional.ofNullable(confirmedEndTime);
        return this;
    }

    /**
     * The latest that your parcels will be available for pickup, confirmed by the carrier. 
     * Expressed in the timezone specified in the response.
     */
    public Pickup withConfirmedEndTime(Optional<? extends String> confirmedEndTime) {
        Utils.checkNotNull(confirmedEndTime, "confirmedEndTime");
        this.confirmedEndTime = confirmedEndTime;
        return this;
    }

    /**
     * The latest time to cancel a pickup. Expressed in the timezone specified in the response. 
     * To cancel a pickup, you will need to contact the carrier directly. 
     * The ability to cancel a pickup through Shippo may be released in future iterations.
     */
    public Pickup withCancelByTime(String cancelByTime) {
        Utils.checkNotNull(cancelByTime, "cancelByTime");
        this.cancelByTime = Optional.ofNullable(cancelByTime);
        return this;
    }

    /**
     * The latest time to cancel a pickup. Expressed in the timezone specified in the response. 
     * To cancel a pickup, you will need to contact the carrier directly. 
     * The ability to cancel a pickup through Shippo may be released in future iterations.
     */
    public Pickup withCancelByTime(Optional<? extends String> cancelByTime) {
        Utils.checkNotNull(cancelByTime, "cancelByTime");
        this.cancelByTime = cancelByTime;
        return this;
    }

    /**
     * Indicates the status of the pickup.
     */
    public Pickup withStatus(PickupStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Indicates the status of the pickup.
     */
    public Pickup withStatus(Optional<? extends PickupStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Pickup's confirmation code returned by the carrier. 
     * To edit or cancel a pickup, you will need to contact USPS or DHL Express directly and provide your `confirmation_code`.
     */
    public Pickup withConfirmationCode(String confirmationCode) {
        Utils.checkNotNull(confirmationCode, "confirmationCode");
        this.confirmationCode = Optional.ofNullable(confirmationCode);
        return this;
    }

    /**
     * Pickup's confirmation code returned by the carrier. 
     * To edit or cancel a pickup, you will need to contact USPS or DHL Express directly and provide your `confirmation_code`.
     */
    public Pickup withConfirmationCode(Optional<? extends String> confirmationCode) {
        Utils.checkNotNull(confirmationCode, "confirmationCode");
        this.confirmationCode = confirmationCode;
        return this;
    }

    /**
     * The pickup time windows will be in the time zone specified here, not UTC.
     */
    public Pickup withTimezone(String timezone) {
        Utils.checkNotNull(timezone, "timezone");
        this.timezone = Optional.ofNullable(timezone);
        return this;
    }

    /**
     * The pickup time windows will be in the time zone specified here, not UTC.
     */
    public Pickup withTimezone(Optional<? extends String> timezone) {
        Utils.checkNotNull(timezone, "timezone");
        this.timezone = timezone;
        return this;
    }

    /**
     * An array containing strings of any messages generated during validation.
     */
    public Pickup withMessages(java.util.List<String> messages) {
        Utils.checkNotNull(messages, "messages");
        this.messages = Optional.ofNullable(messages);
        return this;
    }

    /**
     * An array containing strings of any messages generated during validation.
     */
    public Pickup withMessages(Optional<? extends java.util.List<String>> messages) {
        Utils.checkNotNull(messages, "messages");
        this.messages = messages;
        return this;
    }

    /**
     * Indicates whether the object has been created in test mode.
     */
    public Pickup withIsTest(boolean isTest) {
        Utils.checkNotNull(isTest, "isTest");
        this.isTest = Optional.ofNullable(isTest);
        return this;
    }

    /**
     * Indicates whether the object has been created in test mode.
     */
    public Pickup withIsTest(Optional<? extends Boolean> isTest) {
        Utils.checkNotNull(isTest, "isTest");
        this.isTest = isTest;
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
        Pickup other = (Pickup) o;
        return 
            java.util.Objects.deepEquals(this.carrierAccount, other.carrierAccount) &&
            java.util.Objects.deepEquals(this.location, other.location) &&
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.requestedEndTime, other.requestedEndTime) &&
            java.util.Objects.deepEquals(this.requestedStartTime, other.requestedStartTime) &&
            java.util.Objects.deepEquals(this.transactions, other.transactions) &&
            java.util.Objects.deepEquals(this.objectCreated, other.objectCreated) &&
            java.util.Objects.deepEquals(this.objectId, other.objectId) &&
            java.util.Objects.deepEquals(this.objectUpdated, other.objectUpdated) &&
            java.util.Objects.deepEquals(this.confirmedStartTime, other.confirmedStartTime) &&
            java.util.Objects.deepEquals(this.confirmedEndTime, other.confirmedEndTime) &&
            java.util.Objects.deepEquals(this.cancelByTime, other.cancelByTime) &&
            java.util.Objects.deepEquals(this.status, other.status) &&
            java.util.Objects.deepEquals(this.confirmationCode, other.confirmationCode) &&
            java.util.Objects.deepEquals(this.timezone, other.timezone) &&
            java.util.Objects.deepEquals(this.messages, other.messages) &&
            java.util.Objects.deepEquals(this.isTest, other.isTest);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            carrierAccount,
            location,
            metadata,
            requestedEndTime,
            requestedStartTime,
            transactions,
            objectCreated,
            objectId,
            objectUpdated,
            confirmedStartTime,
            confirmedEndTime,
            cancelByTime,
            status,
            confirmationCode,
            timezone,
            messages,
            isTest);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Pickup.class,
                "carrierAccount", carrierAccount,
                "location", location,
                "metadata", metadata,
                "requestedEndTime", requestedEndTime,
                "requestedStartTime", requestedStartTime,
                "transactions", transactions,
                "objectCreated", objectCreated,
                "objectId", objectId,
                "objectUpdated", objectUpdated,
                "confirmedStartTime", confirmedStartTime,
                "confirmedEndTime", confirmedEndTime,
                "cancelByTime", cancelByTime,
                "status", status,
                "confirmationCode", confirmationCode,
                "timezone", timezone,
                "messages", messages,
                "isTest", isTest);
    }
    
    public final static class Builder {
 
        private String carrierAccount;
 
        private Location location;
 
        private Optional<? extends String> metadata = Optional.empty();
 
        private OffsetDateTime requestedEndTime;
 
        private OffsetDateTime requestedStartTime;
 
        private java.util.List<String> transactions;
 
        private Optional<? extends OffsetDateTime> objectCreated = Optional.empty();
 
        private Optional<? extends String> objectId = Optional.empty();
 
        private Optional<? extends OffsetDateTime> objectUpdated = Optional.empty();
 
        private Optional<? extends String> confirmedStartTime = Optional.empty();
 
        private Optional<? extends String> confirmedEndTime = Optional.empty();
 
        private Optional<? extends String> cancelByTime = Optional.empty();
 
        private Optional<? extends PickupStatus> status = Optional.empty();
 
        private Optional<? extends String> confirmationCode = Optional.empty();
 
        private Optional<? extends String> timezone = Optional.empty();
 
        private Optional<? extends java.util.List<String>> messages = Optional.empty();
 
        private Optional<? extends Boolean> isTest = Optional.empty();  
        
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

        /**
         * Date and time of Pickup creation.
         */
        public Builder objectCreated(OffsetDateTime objectCreated) {
            Utils.checkNotNull(objectCreated, "objectCreated");
            this.objectCreated = Optional.ofNullable(objectCreated);
            return this;
        }

        /**
         * Date and time of Pickup creation.
         */
        public Builder objectCreated(Optional<? extends OffsetDateTime> objectCreated) {
            Utils.checkNotNull(objectCreated, "objectCreated");
            this.objectCreated = objectCreated;
            return this;
        }

        /**
         * Unique identifier of the given Pickup object.
         */
        public Builder objectId(String objectId) {
            Utils.checkNotNull(objectId, "objectId");
            this.objectId = Optional.ofNullable(objectId);
            return this;
        }

        /**
         * Unique identifier of the given Pickup object.
         */
        public Builder objectId(Optional<? extends String> objectId) {
            Utils.checkNotNull(objectId, "objectId");
            this.objectId = objectId;
            return this;
        }

        /**
         * Date and time of last Pickup update.
         */
        public Builder objectUpdated(OffsetDateTime objectUpdated) {
            Utils.checkNotNull(objectUpdated, "objectUpdated");
            this.objectUpdated = Optional.ofNullable(objectUpdated);
            return this;
        }

        /**
         * Date and time of last Pickup update.
         */
        public Builder objectUpdated(Optional<? extends OffsetDateTime> objectUpdated) {
            Utils.checkNotNull(objectUpdated, "objectUpdated");
            this.objectUpdated = objectUpdated;
            return this;
        }

        /**
         * The earliest that your parcels will be ready for pickup, confirmed by the carrier. 
         * Expressed in the timezone specified in the response.
         */
        public Builder confirmedStartTime(String confirmedStartTime) {
            Utils.checkNotNull(confirmedStartTime, "confirmedStartTime");
            this.confirmedStartTime = Optional.ofNullable(confirmedStartTime);
            return this;
        }

        /**
         * The earliest that your parcels will be ready for pickup, confirmed by the carrier. 
         * Expressed in the timezone specified in the response.
         */
        public Builder confirmedStartTime(Optional<? extends String> confirmedStartTime) {
            Utils.checkNotNull(confirmedStartTime, "confirmedStartTime");
            this.confirmedStartTime = confirmedStartTime;
            return this;
        }

        /**
         * The latest that your parcels will be available for pickup, confirmed by the carrier. 
         * Expressed in the timezone specified in the response.
         */
        public Builder confirmedEndTime(String confirmedEndTime) {
            Utils.checkNotNull(confirmedEndTime, "confirmedEndTime");
            this.confirmedEndTime = Optional.ofNullable(confirmedEndTime);
            return this;
        }

        /**
         * The latest that your parcels will be available for pickup, confirmed by the carrier. 
         * Expressed in the timezone specified in the response.
         */
        public Builder confirmedEndTime(Optional<? extends String> confirmedEndTime) {
            Utils.checkNotNull(confirmedEndTime, "confirmedEndTime");
            this.confirmedEndTime = confirmedEndTime;
            return this;
        }

        /**
         * The latest time to cancel a pickup. Expressed in the timezone specified in the response. 
         * To cancel a pickup, you will need to contact the carrier directly. 
         * The ability to cancel a pickup through Shippo may be released in future iterations.
         */
        public Builder cancelByTime(String cancelByTime) {
            Utils.checkNotNull(cancelByTime, "cancelByTime");
            this.cancelByTime = Optional.ofNullable(cancelByTime);
            return this;
        }

        /**
         * The latest time to cancel a pickup. Expressed in the timezone specified in the response. 
         * To cancel a pickup, you will need to contact the carrier directly. 
         * The ability to cancel a pickup through Shippo may be released in future iterations.
         */
        public Builder cancelByTime(Optional<? extends String> cancelByTime) {
            Utils.checkNotNull(cancelByTime, "cancelByTime");
            this.cancelByTime = cancelByTime;
            return this;
        }

        /**
         * Indicates the status of the pickup.
         */
        public Builder status(PickupStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Indicates the status of the pickup.
         */
        public Builder status(Optional<? extends PickupStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * Pickup's confirmation code returned by the carrier. 
         * To edit or cancel a pickup, you will need to contact USPS or DHL Express directly and provide your `confirmation_code`.
         */
        public Builder confirmationCode(String confirmationCode) {
            Utils.checkNotNull(confirmationCode, "confirmationCode");
            this.confirmationCode = Optional.ofNullable(confirmationCode);
            return this;
        }

        /**
         * Pickup's confirmation code returned by the carrier. 
         * To edit or cancel a pickup, you will need to contact USPS or DHL Express directly and provide your `confirmation_code`.
         */
        public Builder confirmationCode(Optional<? extends String> confirmationCode) {
            Utils.checkNotNull(confirmationCode, "confirmationCode");
            this.confirmationCode = confirmationCode;
            return this;
        }

        /**
         * The pickup time windows will be in the time zone specified here, not UTC.
         */
        public Builder timezone(String timezone) {
            Utils.checkNotNull(timezone, "timezone");
            this.timezone = Optional.ofNullable(timezone);
            return this;
        }

        /**
         * The pickup time windows will be in the time zone specified here, not UTC.
         */
        public Builder timezone(Optional<? extends String> timezone) {
            Utils.checkNotNull(timezone, "timezone");
            this.timezone = timezone;
            return this;
        }

        /**
         * An array containing strings of any messages generated during validation.
         */
        public Builder messages(java.util.List<String> messages) {
            Utils.checkNotNull(messages, "messages");
            this.messages = Optional.ofNullable(messages);
            return this;
        }

        /**
         * An array containing strings of any messages generated during validation.
         */
        public Builder messages(Optional<? extends java.util.List<String>> messages) {
            Utils.checkNotNull(messages, "messages");
            this.messages = messages;
            return this;
        }

        /**
         * Indicates whether the object has been created in test mode.
         */
        public Builder isTest(boolean isTest) {
            Utils.checkNotNull(isTest, "isTest");
            this.isTest = Optional.ofNullable(isTest);
            return this;
        }

        /**
         * Indicates whether the object has been created in test mode.
         */
        public Builder isTest(Optional<? extends Boolean> isTest) {
            Utils.checkNotNull(isTest, "isTest");
            this.isTest = isTest;
            return this;
        }
        
        public Pickup build() {
            return new Pickup(
                carrierAccount,
                location,
                metadata,
                requestedEndTime,
                requestedStartTime,
                transactions,
                objectCreated,
                objectId,
                objectUpdated,
                confirmedStartTime,
                confirmedEndTime,
                cancelByTime,
                status,
                confirmationCode,
                timezone,
                messages,
                isTest);
        }
    }
}

