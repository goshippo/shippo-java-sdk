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
import com.shippo.shippo_java_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class LiveRateCreateRequest {

    /**
     * The sender address, which includes your name, company name, street address, city, state, zip code, 
     * country, phone number, and email address (strings). Special characters should not be included in 
     * any address element, especially name, company, and email.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("address_from")
    private Optional<? extends LiveRateCreateRequestAddressFrom> addressFrom;

    /**
     * The recipient address, which includes the recipient's name, company name, street address, city, state, zip code, 
     * country, phone number, and email address (strings). Special characters should not be included in 
     * any address element, especially name, company, and email.
     */
    @JsonProperty("address_to")
    private LiveRateCreateRequestAddressTo addressTo;

    /**
     * Array of Line Item objects
     */
    @JsonProperty("line_items")
    private java.util.List<LineItem> lineItems;

    /**
     * Object ID for an existing User Parcel Template OR a fully formed Parcel object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("parcel")
    private Optional<? extends LiveRateCreateRequestParcel> parcel;

    @JsonCreator
    public LiveRateCreateRequest(
            @JsonProperty("address_from") Optional<? extends LiveRateCreateRequestAddressFrom> addressFrom,
            @JsonProperty("address_to") LiveRateCreateRequestAddressTo addressTo,
            @JsonProperty("line_items") java.util.List<LineItem> lineItems,
            @JsonProperty("parcel") Optional<? extends LiveRateCreateRequestParcel> parcel) {
        Utils.checkNotNull(addressFrom, "addressFrom");
        Utils.checkNotNull(addressTo, "addressTo");
        Utils.checkNotNull(lineItems, "lineItems");
        Utils.checkNotNull(parcel, "parcel");
        this.addressFrom = addressFrom;
        this.addressTo = addressTo;
        this.lineItems = lineItems;
        this.parcel = parcel;
    }
    
    public LiveRateCreateRequest(
            LiveRateCreateRequestAddressTo addressTo,
            java.util.List<LineItem> lineItems) {
        this(Optional.empty(), addressTo, lineItems, Optional.empty());
    }

    /**
     * The sender address, which includes your name, company name, street address, city, state, zip code, 
     * country, phone number, and email address (strings). Special characters should not be included in 
     * any address element, especially name, company, and email.
     */
    @JsonIgnore
    public Optional<? extends LiveRateCreateRequestAddressFrom> addressFrom() {
        return addressFrom;
    }

    /**
     * The recipient address, which includes the recipient's name, company name, street address, city, state, zip code, 
     * country, phone number, and email address (strings). Special characters should not be included in 
     * any address element, especially name, company, and email.
     */
    @JsonIgnore
    public LiveRateCreateRequestAddressTo addressTo() {
        return addressTo;
    }

    /**
     * Array of Line Item objects
     */
    @JsonIgnore
    public java.util.List<LineItem> lineItems() {
        return lineItems;
    }

    /**
     * Object ID for an existing User Parcel Template OR a fully formed Parcel object.
     */
    @JsonIgnore
    public Optional<? extends LiveRateCreateRequestParcel> parcel() {
        return parcel;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The sender address, which includes your name, company name, street address, city, state, zip code, 
     * country, phone number, and email address (strings). Special characters should not be included in 
     * any address element, especially name, company, and email.
     */
    public LiveRateCreateRequest withAddressFrom(LiveRateCreateRequestAddressFrom addressFrom) {
        Utils.checkNotNull(addressFrom, "addressFrom");
        this.addressFrom = Optional.ofNullable(addressFrom);
        return this;
    }

    /**
     * The sender address, which includes your name, company name, street address, city, state, zip code, 
     * country, phone number, and email address (strings). Special characters should not be included in 
     * any address element, especially name, company, and email.
     */
    public LiveRateCreateRequest withAddressFrom(Optional<? extends LiveRateCreateRequestAddressFrom> addressFrom) {
        Utils.checkNotNull(addressFrom, "addressFrom");
        this.addressFrom = addressFrom;
        return this;
    }

    /**
     * The recipient address, which includes the recipient's name, company name, street address, city, state, zip code, 
     * country, phone number, and email address (strings). Special characters should not be included in 
     * any address element, especially name, company, and email.
     */
    public LiveRateCreateRequest withAddressTo(LiveRateCreateRequestAddressTo addressTo) {
        Utils.checkNotNull(addressTo, "addressTo");
        this.addressTo = addressTo;
        return this;
    }

    /**
     * Array of Line Item objects
     */
    public LiveRateCreateRequest withLineItems(java.util.List<LineItem> lineItems) {
        Utils.checkNotNull(lineItems, "lineItems");
        this.lineItems = lineItems;
        return this;
    }

    /**
     * Object ID for an existing User Parcel Template OR a fully formed Parcel object.
     */
    public LiveRateCreateRequest withParcel(LiveRateCreateRequestParcel parcel) {
        Utils.checkNotNull(parcel, "parcel");
        this.parcel = Optional.ofNullable(parcel);
        return this;
    }

    /**
     * Object ID for an existing User Parcel Template OR a fully formed Parcel object.
     */
    public LiveRateCreateRequest withParcel(Optional<? extends LiveRateCreateRequestParcel> parcel) {
        Utils.checkNotNull(parcel, "parcel");
        this.parcel = parcel;
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
        LiveRateCreateRequest other = (LiveRateCreateRequest) o;
        return 
            java.util.Objects.deepEquals(this.addressFrom, other.addressFrom) &&
            java.util.Objects.deepEquals(this.addressTo, other.addressTo) &&
            java.util.Objects.deepEquals(this.lineItems, other.lineItems) &&
            java.util.Objects.deepEquals(this.parcel, other.parcel);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            addressFrom,
            addressTo,
            lineItems,
            parcel);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LiveRateCreateRequest.class,
                "addressFrom", addressFrom,
                "addressTo", addressTo,
                "lineItems", lineItems,
                "parcel", parcel);
    }
    
    public final static class Builder {
 
        private Optional<? extends LiveRateCreateRequestAddressFrom> addressFrom = Optional.empty();
 
        private LiveRateCreateRequestAddressTo addressTo;
 
        private java.util.List<LineItem> lineItems;
 
        private Optional<? extends LiveRateCreateRequestParcel> parcel = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The sender address, which includes your name, company name, street address, city, state, zip code, 
         * country, phone number, and email address (strings). Special characters should not be included in 
         * any address element, especially name, company, and email.
         */
        public Builder addressFrom(LiveRateCreateRequestAddressFrom addressFrom) {
            Utils.checkNotNull(addressFrom, "addressFrom");
            this.addressFrom = Optional.ofNullable(addressFrom);
            return this;
        }

        /**
         * The sender address, which includes your name, company name, street address, city, state, zip code, 
         * country, phone number, and email address (strings). Special characters should not be included in 
         * any address element, especially name, company, and email.
         */
        public Builder addressFrom(Optional<? extends LiveRateCreateRequestAddressFrom> addressFrom) {
            Utils.checkNotNull(addressFrom, "addressFrom");
            this.addressFrom = addressFrom;
            return this;
        }

        /**
         * The recipient address, which includes the recipient's name, company name, street address, city, state, zip code, 
         * country, phone number, and email address (strings). Special characters should not be included in 
         * any address element, especially name, company, and email.
         */
        public Builder addressTo(LiveRateCreateRequestAddressTo addressTo) {
            Utils.checkNotNull(addressTo, "addressTo");
            this.addressTo = addressTo;
            return this;
        }

        /**
         * Array of Line Item objects
         */
        public Builder lineItems(java.util.List<LineItem> lineItems) {
            Utils.checkNotNull(lineItems, "lineItems");
            this.lineItems = lineItems;
            return this;
        }

        /**
         * Object ID for an existing User Parcel Template OR a fully formed Parcel object.
         */
        public Builder parcel(LiveRateCreateRequestParcel parcel) {
            Utils.checkNotNull(parcel, "parcel");
            this.parcel = Optional.ofNullable(parcel);
            return this;
        }

        /**
         * Object ID for an existing User Parcel Template OR a fully formed Parcel object.
         */
        public Builder parcel(Optional<? extends LiveRateCreateRequestParcel> parcel) {
            Utils.checkNotNull(parcel, "parcel");
            this.parcel = parcel;
            return this;
        }
        
        public LiveRateCreateRequest build() {
            return new LiveRateCreateRequest(
                addressFrom,
                addressTo,
                lineItems,
                parcel);
        }
    }
}

