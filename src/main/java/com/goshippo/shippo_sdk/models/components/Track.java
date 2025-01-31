/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.goshippo.shippo_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class Track {

    /**
     * The sender address with city, state, zip and country information.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address_from")
    private Optional<? extends TrackingStatusLocationBase> addressFrom;

    /**
     * The recipient address with city, state, zip and country information.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address_to")
    private Optional<? extends TrackingStatusLocationBase> addressTo;

    /**
     * Name of the carrier of the shipment to track. See &lt;a href="#tag/Carriers"&gt;Carriers&lt;/a&gt;.
     */
    @JsonProperty("carrier")
    private String carrier;

    /**
     * The estimated time of arrival according to the carrier, this might be updated by carriers during the life of the shipment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("eta")
    private Optional<OffsetDateTime> eta;

    @JsonProperty("messages")
    private List<String> messages;

    /**
     * A string of up to 100 characters that can be filled with any additional information you want to attach to the object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<String> metadata;

    /**
     * The estimated time of arrival according to the carrier at the time the shipment first entered the system.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("original_eta")
    private Optional<OffsetDateTime> originalEta;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("servicelevel")
    private Optional<? extends ServiceLevelWithParent> servicelevel;

    /**
     * A list of tracking events, following the same structure as &lt;code&gt;tracking_status&lt;/code&gt;. 
     * It contains a full history of all tracking statuses, starting with the earlier tracking event first.
     */
    @JsonProperty("tracking_history")
    private List<TrackingStatus> trackingHistory;

    /**
     * Tracking number to track.
     */
    @JsonProperty("tracking_number")
    private String trackingNumber;

    /**
     * The latest tracking information of this shipment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tracking_status")
    private Optional<? extends TrackingStatus> trackingStatus;

    /**
     * The &lt;code&gt;object_id&lt;/code&gt; of the transaction associated with this tracking object. 
     * This field is visible only to the object owner of the transaction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transaction")
    private Optional<String> transaction;

    @JsonCreator
    public Track(
            @JsonProperty("address_from") Optional<? extends TrackingStatusLocationBase> addressFrom,
            @JsonProperty("address_to") Optional<? extends TrackingStatusLocationBase> addressTo,
            @JsonProperty("carrier") String carrier,
            @JsonProperty("eta") Optional<OffsetDateTime> eta,
            @JsonProperty("messages") List<String> messages,
            @JsonProperty("metadata") Optional<String> metadata,
            @JsonProperty("original_eta") Optional<OffsetDateTime> originalEta,
            @JsonProperty("servicelevel") Optional<? extends ServiceLevelWithParent> servicelevel,
            @JsonProperty("tracking_history") List<TrackingStatus> trackingHistory,
            @JsonProperty("tracking_number") String trackingNumber,
            @JsonProperty("tracking_status") Optional<? extends TrackingStatus> trackingStatus,
            @JsonProperty("transaction") Optional<String> transaction) {
        Utils.checkNotNull(addressFrom, "addressFrom");
        Utils.checkNotNull(addressTo, "addressTo");
        Utils.checkNotNull(carrier, "carrier");
        Utils.checkNotNull(eta, "eta");
        Utils.checkNotNull(messages, "messages");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(originalEta, "originalEta");
        Utils.checkNotNull(servicelevel, "servicelevel");
        Utils.checkNotNull(trackingHistory, "trackingHistory");
        Utils.checkNotNull(trackingNumber, "trackingNumber");
        Utils.checkNotNull(trackingStatus, "trackingStatus");
        Utils.checkNotNull(transaction, "transaction");
        this.addressFrom = addressFrom;
        this.addressTo = addressTo;
        this.carrier = carrier;
        this.eta = eta;
        this.messages = messages;
        this.metadata = metadata;
        this.originalEta = originalEta;
        this.servicelevel = servicelevel;
        this.trackingHistory = trackingHistory;
        this.trackingNumber = trackingNumber;
        this.trackingStatus = trackingStatus;
        this.transaction = transaction;
    }
    
    public Track(
            String carrier,
            List<String> messages,
            List<TrackingStatus> trackingHistory,
            String trackingNumber) {
        this(Optional.empty(), Optional.empty(), carrier, Optional.empty(), messages, Optional.empty(), Optional.empty(), Optional.empty(), trackingHistory, trackingNumber, Optional.empty(), Optional.empty());
    }

    /**
     * The sender address with city, state, zip and country information.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TrackingStatusLocationBase> addressFrom() {
        return (Optional<TrackingStatusLocationBase>) addressFrom;
    }

    /**
     * The recipient address with city, state, zip and country information.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TrackingStatusLocationBase> addressTo() {
        return (Optional<TrackingStatusLocationBase>) addressTo;
    }

    /**
     * Name of the carrier of the shipment to track. See &lt;a href="#tag/Carriers"&gt;Carriers&lt;/a&gt;.
     */
    @JsonIgnore
    public String carrier() {
        return carrier;
    }

    /**
     * The estimated time of arrival according to the carrier, this might be updated by carriers during the life of the shipment.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> eta() {
        return eta;
    }

    @JsonIgnore
    public List<String> messages() {
        return messages;
    }

    /**
     * A string of up to 100 characters that can be filled with any additional information you want to attach to the object.
     */
    @JsonIgnore
    public Optional<String> metadata() {
        return metadata;
    }

    /**
     * The estimated time of arrival according to the carrier at the time the shipment first entered the system.
     */
    @JsonIgnore
    public Optional<OffsetDateTime> originalEta() {
        return originalEta;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ServiceLevelWithParent> servicelevel() {
        return (Optional<ServiceLevelWithParent>) servicelevel;
    }

    /**
     * A list of tracking events, following the same structure as &lt;code&gt;tracking_status&lt;/code&gt;. 
     * It contains a full history of all tracking statuses, starting with the earlier tracking event first.
     */
    @JsonIgnore
    public List<TrackingStatus> trackingHistory() {
        return trackingHistory;
    }

    /**
     * Tracking number to track.
     */
    @JsonIgnore
    public String trackingNumber() {
        return trackingNumber;
    }

    /**
     * The latest tracking information of this shipment.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TrackingStatus> trackingStatus() {
        return (Optional<TrackingStatus>) trackingStatus;
    }

    /**
     * The &lt;code&gt;object_id&lt;/code&gt; of the transaction associated with this tracking object. 
     * This field is visible only to the object owner of the transaction.
     */
    @JsonIgnore
    public Optional<String> transaction() {
        return transaction;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The sender address with city, state, zip and country information.
     */
    public Track withAddressFrom(TrackingStatusLocationBase addressFrom) {
        Utils.checkNotNull(addressFrom, "addressFrom");
        this.addressFrom = Optional.ofNullable(addressFrom);
        return this;
    }

    /**
     * The sender address with city, state, zip and country information.
     */
    public Track withAddressFrom(Optional<? extends TrackingStatusLocationBase> addressFrom) {
        Utils.checkNotNull(addressFrom, "addressFrom");
        this.addressFrom = addressFrom;
        return this;
    }

    /**
     * The recipient address with city, state, zip and country information.
     */
    public Track withAddressTo(TrackingStatusLocationBase addressTo) {
        Utils.checkNotNull(addressTo, "addressTo");
        this.addressTo = Optional.ofNullable(addressTo);
        return this;
    }

    /**
     * The recipient address with city, state, zip and country information.
     */
    public Track withAddressTo(Optional<? extends TrackingStatusLocationBase> addressTo) {
        Utils.checkNotNull(addressTo, "addressTo");
        this.addressTo = addressTo;
        return this;
    }

    /**
     * Name of the carrier of the shipment to track. See &lt;a href="#tag/Carriers"&gt;Carriers&lt;/a&gt;.
     */
    public Track withCarrier(String carrier) {
        Utils.checkNotNull(carrier, "carrier");
        this.carrier = carrier;
        return this;
    }

    /**
     * The estimated time of arrival according to the carrier, this might be updated by carriers during the life of the shipment.
     */
    public Track withEta(OffsetDateTime eta) {
        Utils.checkNotNull(eta, "eta");
        this.eta = Optional.ofNullable(eta);
        return this;
    }

    /**
     * The estimated time of arrival according to the carrier, this might be updated by carriers during the life of the shipment.
     */
    public Track withEta(Optional<OffsetDateTime> eta) {
        Utils.checkNotNull(eta, "eta");
        this.eta = eta;
        return this;
    }

    public Track withMessages(List<String> messages) {
        Utils.checkNotNull(messages, "messages");
        this.messages = messages;
        return this;
    }

    /**
     * A string of up to 100 characters that can be filled with any additional information you want to attach to the object.
     */
    public Track withMetadata(String metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * A string of up to 100 characters that can be filled with any additional information you want to attach to the object.
     */
    public Track withMetadata(Optional<String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    /**
     * The estimated time of arrival according to the carrier at the time the shipment first entered the system.
     */
    public Track withOriginalEta(OffsetDateTime originalEta) {
        Utils.checkNotNull(originalEta, "originalEta");
        this.originalEta = Optional.ofNullable(originalEta);
        return this;
    }

    /**
     * The estimated time of arrival according to the carrier at the time the shipment first entered the system.
     */
    public Track withOriginalEta(Optional<OffsetDateTime> originalEta) {
        Utils.checkNotNull(originalEta, "originalEta");
        this.originalEta = originalEta;
        return this;
    }

    public Track withServicelevel(ServiceLevelWithParent servicelevel) {
        Utils.checkNotNull(servicelevel, "servicelevel");
        this.servicelevel = Optional.ofNullable(servicelevel);
        return this;
    }

    public Track withServicelevel(Optional<? extends ServiceLevelWithParent> servicelevel) {
        Utils.checkNotNull(servicelevel, "servicelevel");
        this.servicelevel = servicelevel;
        return this;
    }

    /**
     * A list of tracking events, following the same structure as &lt;code&gt;tracking_status&lt;/code&gt;. 
     * It contains a full history of all tracking statuses, starting with the earlier tracking event first.
     */
    public Track withTrackingHistory(List<TrackingStatus> trackingHistory) {
        Utils.checkNotNull(trackingHistory, "trackingHistory");
        this.trackingHistory = trackingHistory;
        return this;
    }

    /**
     * Tracking number to track.
     */
    public Track withTrackingNumber(String trackingNumber) {
        Utils.checkNotNull(trackingNumber, "trackingNumber");
        this.trackingNumber = trackingNumber;
        return this;
    }

    /**
     * The latest tracking information of this shipment.
     */
    public Track withTrackingStatus(TrackingStatus trackingStatus) {
        Utils.checkNotNull(trackingStatus, "trackingStatus");
        this.trackingStatus = Optional.ofNullable(trackingStatus);
        return this;
    }

    /**
     * The latest tracking information of this shipment.
     */
    public Track withTrackingStatus(Optional<? extends TrackingStatus> trackingStatus) {
        Utils.checkNotNull(trackingStatus, "trackingStatus");
        this.trackingStatus = trackingStatus;
        return this;
    }

    /**
     * The &lt;code&gt;object_id&lt;/code&gt; of the transaction associated with this tracking object. 
     * This field is visible only to the object owner of the transaction.
     */
    public Track withTransaction(String transaction) {
        Utils.checkNotNull(transaction, "transaction");
        this.transaction = Optional.ofNullable(transaction);
        return this;
    }

    /**
     * The &lt;code&gt;object_id&lt;/code&gt; of the transaction associated with this tracking object. 
     * This field is visible only to the object owner of the transaction.
     */
    public Track withTransaction(Optional<String> transaction) {
        Utils.checkNotNull(transaction, "transaction");
        this.transaction = transaction;
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
        Track other = (Track) o;
        return 
            Objects.deepEquals(this.addressFrom, other.addressFrom) &&
            Objects.deepEquals(this.addressTo, other.addressTo) &&
            Objects.deepEquals(this.carrier, other.carrier) &&
            Objects.deepEquals(this.eta, other.eta) &&
            Objects.deepEquals(this.messages, other.messages) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.originalEta, other.originalEta) &&
            Objects.deepEquals(this.servicelevel, other.servicelevel) &&
            Objects.deepEquals(this.trackingHistory, other.trackingHistory) &&
            Objects.deepEquals(this.trackingNumber, other.trackingNumber) &&
            Objects.deepEquals(this.trackingStatus, other.trackingStatus) &&
            Objects.deepEquals(this.transaction, other.transaction);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            addressFrom,
            addressTo,
            carrier,
            eta,
            messages,
            metadata,
            originalEta,
            servicelevel,
            trackingHistory,
            trackingNumber,
            trackingStatus,
            transaction);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Track.class,
                "addressFrom", addressFrom,
                "addressTo", addressTo,
                "carrier", carrier,
                "eta", eta,
                "messages", messages,
                "metadata", metadata,
                "originalEta", originalEta,
                "servicelevel", servicelevel,
                "trackingHistory", trackingHistory,
                "trackingNumber", trackingNumber,
                "trackingStatus", trackingStatus,
                "transaction", transaction);
    }
    
    public final static class Builder {
 
        private Optional<? extends TrackingStatusLocationBase> addressFrom = Optional.empty();
 
        private Optional<? extends TrackingStatusLocationBase> addressTo = Optional.empty();
 
        private String carrier;
 
        private Optional<OffsetDateTime> eta = Optional.empty();
 
        private List<String> messages;
 
        private Optional<String> metadata = Optional.empty();
 
        private Optional<OffsetDateTime> originalEta = Optional.empty();
 
        private Optional<? extends ServiceLevelWithParent> servicelevel = Optional.empty();
 
        private List<TrackingStatus> trackingHistory;
 
        private String trackingNumber;
 
        private Optional<? extends TrackingStatus> trackingStatus = Optional.empty();
 
        private Optional<String> transaction = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The sender address with city, state, zip and country information.
         */
        public Builder addressFrom(TrackingStatusLocationBase addressFrom) {
            Utils.checkNotNull(addressFrom, "addressFrom");
            this.addressFrom = Optional.ofNullable(addressFrom);
            return this;
        }

        /**
         * The sender address with city, state, zip and country information.
         */
        public Builder addressFrom(Optional<? extends TrackingStatusLocationBase> addressFrom) {
            Utils.checkNotNull(addressFrom, "addressFrom");
            this.addressFrom = addressFrom;
            return this;
        }

        /**
         * The recipient address with city, state, zip and country information.
         */
        public Builder addressTo(TrackingStatusLocationBase addressTo) {
            Utils.checkNotNull(addressTo, "addressTo");
            this.addressTo = Optional.ofNullable(addressTo);
            return this;
        }

        /**
         * The recipient address with city, state, zip and country information.
         */
        public Builder addressTo(Optional<? extends TrackingStatusLocationBase> addressTo) {
            Utils.checkNotNull(addressTo, "addressTo");
            this.addressTo = addressTo;
            return this;
        }

        /**
         * Name of the carrier of the shipment to track. See &lt;a href="#tag/Carriers"&gt;Carriers&lt;/a&gt;.
         */
        public Builder carrier(String carrier) {
            Utils.checkNotNull(carrier, "carrier");
            this.carrier = carrier;
            return this;
        }

        /**
         * The estimated time of arrival according to the carrier, this might be updated by carriers during the life of the shipment.
         */
        public Builder eta(OffsetDateTime eta) {
            Utils.checkNotNull(eta, "eta");
            this.eta = Optional.ofNullable(eta);
            return this;
        }

        /**
         * The estimated time of arrival according to the carrier, this might be updated by carriers during the life of the shipment.
         */
        public Builder eta(Optional<OffsetDateTime> eta) {
            Utils.checkNotNull(eta, "eta");
            this.eta = eta;
            return this;
        }

        public Builder messages(List<String> messages) {
            Utils.checkNotNull(messages, "messages");
            this.messages = messages;
            return this;
        }

        /**
         * A string of up to 100 characters that can be filled with any additional information you want to attach to the object.
         */
        public Builder metadata(String metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        /**
         * A string of up to 100 characters that can be filled with any additional information you want to attach to the object.
         */
        public Builder metadata(Optional<String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        /**
         * The estimated time of arrival according to the carrier at the time the shipment first entered the system.
         */
        public Builder originalEta(OffsetDateTime originalEta) {
            Utils.checkNotNull(originalEta, "originalEta");
            this.originalEta = Optional.ofNullable(originalEta);
            return this;
        }

        /**
         * The estimated time of arrival according to the carrier at the time the shipment first entered the system.
         */
        public Builder originalEta(Optional<OffsetDateTime> originalEta) {
            Utils.checkNotNull(originalEta, "originalEta");
            this.originalEta = originalEta;
            return this;
        }

        public Builder servicelevel(ServiceLevelWithParent servicelevel) {
            Utils.checkNotNull(servicelevel, "servicelevel");
            this.servicelevel = Optional.ofNullable(servicelevel);
            return this;
        }

        public Builder servicelevel(Optional<? extends ServiceLevelWithParent> servicelevel) {
            Utils.checkNotNull(servicelevel, "servicelevel");
            this.servicelevel = servicelevel;
            return this;
        }

        /**
         * A list of tracking events, following the same structure as &lt;code&gt;tracking_status&lt;/code&gt;. 
         * It contains a full history of all tracking statuses, starting with the earlier tracking event first.
         */
        public Builder trackingHistory(List<TrackingStatus> trackingHistory) {
            Utils.checkNotNull(trackingHistory, "trackingHistory");
            this.trackingHistory = trackingHistory;
            return this;
        }

        /**
         * Tracking number to track.
         */
        public Builder trackingNumber(String trackingNumber) {
            Utils.checkNotNull(trackingNumber, "trackingNumber");
            this.trackingNumber = trackingNumber;
            return this;
        }

        /**
         * The latest tracking information of this shipment.
         */
        public Builder trackingStatus(TrackingStatus trackingStatus) {
            Utils.checkNotNull(trackingStatus, "trackingStatus");
            this.trackingStatus = Optional.ofNullable(trackingStatus);
            return this;
        }

        /**
         * The latest tracking information of this shipment.
         */
        public Builder trackingStatus(Optional<? extends TrackingStatus> trackingStatus) {
            Utils.checkNotNull(trackingStatus, "trackingStatus");
            this.trackingStatus = trackingStatus;
            return this;
        }

        /**
         * The &lt;code&gt;object_id&lt;/code&gt; of the transaction associated with this tracking object. 
         * This field is visible only to the object owner of the transaction.
         */
        public Builder transaction(String transaction) {
            Utils.checkNotNull(transaction, "transaction");
            this.transaction = Optional.ofNullable(transaction);
            return this;
        }

        /**
         * The &lt;code&gt;object_id&lt;/code&gt; of the transaction associated with this tracking object. 
         * This field is visible only to the object owner of the transaction.
         */
        public Builder transaction(Optional<String> transaction) {
            Utils.checkNotNull(transaction, "transaction");
            this.transaction = transaction;
            return this;
        }
        
        public Track build() {
            return new Track(
                addressFrom,
                addressTo,
                carrier,
                eta,
                messages,
                metadata,
                originalEta,
                servicelevel,
                trackingHistory,
                trackingNumber,
                trackingStatus,
                transaction);
        }
    }
}

