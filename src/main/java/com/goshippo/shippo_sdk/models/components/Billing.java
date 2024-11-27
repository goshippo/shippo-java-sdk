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
import java.util.Objects;
import java.util.Optional;

/**
 * Billing - Specify billing details (UPS, FedEx, and DHL Germany only).
 */

public class Billing {

    /**
     * Account number to be billed. (For DHL Germany, leave this field blank.)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account")
    private Optional<String> account;

    /**
     * Country iso2 code of account number to be billed (required for UPS third party billing only).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    private Optional<String> country;

    /**
     * 2 digit code used to override your default participation code associated with your DHL Germany account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("participation_code")
    private Optional<String> participationCode;

    /**
     * Party to be billed. (Leave blank for DHL Germany.)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends Type> type;

    /**
     * ZIP code of account number to be billed (required for UPS if there is a zip on the billing account).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("zip")
    private Optional<String> zip;

    @JsonCreator
    public Billing(
            @JsonProperty("account") Optional<String> account,
            @JsonProperty("country") Optional<String> country,
            @JsonProperty("participation_code") Optional<String> participationCode,
            @JsonProperty("type") Optional<? extends Type> type,
            @JsonProperty("zip") Optional<String> zip) {
        Utils.checkNotNull(account, "account");
        Utils.checkNotNull(country, "country");
        Utils.checkNotNull(participationCode, "participationCode");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(zip, "zip");
        this.account = account;
        this.country = country;
        this.participationCode = participationCode;
        this.type = type;
        this.zip = zip;
    }
    
    public Billing() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Account number to be billed. (For DHL Germany, leave this field blank.)
     */
    @JsonIgnore
    public Optional<String> account() {
        return account;
    }

    /**
     * Country iso2 code of account number to be billed (required for UPS third party billing only).
     */
    @JsonIgnore
    public Optional<String> country() {
        return country;
    }

    /**
     * 2 digit code used to override your default participation code associated with your DHL Germany account.
     */
    @JsonIgnore
    public Optional<String> participationCode() {
        return participationCode;
    }

    /**
     * Party to be billed. (Leave blank for DHL Germany.)
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Type> type() {
        return (Optional<Type>) type;
    }

    /**
     * ZIP code of account number to be billed (required for UPS if there is a zip on the billing account).
     */
    @JsonIgnore
    public Optional<String> zip() {
        return zip;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Account number to be billed. (For DHL Germany, leave this field blank.)
     */
    public Billing withAccount(String account) {
        Utils.checkNotNull(account, "account");
        this.account = Optional.ofNullable(account);
        return this;
    }

    /**
     * Account number to be billed. (For DHL Germany, leave this field blank.)
     */
    public Billing withAccount(Optional<String> account) {
        Utils.checkNotNull(account, "account");
        this.account = account;
        return this;
    }

    /**
     * Country iso2 code of account number to be billed (required for UPS third party billing only).
     */
    public Billing withCountry(String country) {
        Utils.checkNotNull(country, "country");
        this.country = Optional.ofNullable(country);
        return this;
    }

    /**
     * Country iso2 code of account number to be billed (required for UPS third party billing only).
     */
    public Billing withCountry(Optional<String> country) {
        Utils.checkNotNull(country, "country");
        this.country = country;
        return this;
    }

    /**
     * 2 digit code used to override your default participation code associated with your DHL Germany account.
     */
    public Billing withParticipationCode(String participationCode) {
        Utils.checkNotNull(participationCode, "participationCode");
        this.participationCode = Optional.ofNullable(participationCode);
        return this;
    }

    /**
     * 2 digit code used to override your default participation code associated with your DHL Germany account.
     */
    public Billing withParticipationCode(Optional<String> participationCode) {
        Utils.checkNotNull(participationCode, "participationCode");
        this.participationCode = participationCode;
        return this;
    }

    /**
     * Party to be billed. (Leave blank for DHL Germany.)
     */
    public Billing withType(Type type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * Party to be billed. (Leave blank for DHL Germany.)
     */
    public Billing withType(Optional<? extends Type> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * ZIP code of account number to be billed (required for UPS if there is a zip on the billing account).
     */
    public Billing withZip(String zip) {
        Utils.checkNotNull(zip, "zip");
        this.zip = Optional.ofNullable(zip);
        return this;
    }

    /**
     * ZIP code of account number to be billed (required for UPS if there is a zip on the billing account).
     */
    public Billing withZip(Optional<String> zip) {
        Utils.checkNotNull(zip, "zip");
        this.zip = zip;
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
        Billing other = (Billing) o;
        return 
            Objects.deepEquals(this.account, other.account) &&
            Objects.deepEquals(this.country, other.country) &&
            Objects.deepEquals(this.participationCode, other.participationCode) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.zip, other.zip);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            account,
            country,
            participationCode,
            type,
            zip);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Billing.class,
                "account", account,
                "country", country,
                "participationCode", participationCode,
                "type", type,
                "zip", zip);
    }
    
    public final static class Builder {
 
        private Optional<String> account = Optional.empty();
 
        private Optional<String> country = Optional.empty();
 
        private Optional<String> participationCode = Optional.empty();
 
        private Optional<? extends Type> type = Optional.empty();
 
        private Optional<String> zip = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Account number to be billed. (For DHL Germany, leave this field blank.)
         */
        public Builder account(String account) {
            Utils.checkNotNull(account, "account");
            this.account = Optional.ofNullable(account);
            return this;
        }

        /**
         * Account number to be billed. (For DHL Germany, leave this field blank.)
         */
        public Builder account(Optional<String> account) {
            Utils.checkNotNull(account, "account");
            this.account = account;
            return this;
        }

        /**
         * Country iso2 code of account number to be billed (required for UPS third party billing only).
         */
        public Builder country(String country) {
            Utils.checkNotNull(country, "country");
            this.country = Optional.ofNullable(country);
            return this;
        }

        /**
         * Country iso2 code of account number to be billed (required for UPS third party billing only).
         */
        public Builder country(Optional<String> country) {
            Utils.checkNotNull(country, "country");
            this.country = country;
            return this;
        }

        /**
         * 2 digit code used to override your default participation code associated with your DHL Germany account.
         */
        public Builder participationCode(String participationCode) {
            Utils.checkNotNull(participationCode, "participationCode");
            this.participationCode = Optional.ofNullable(participationCode);
            return this;
        }

        /**
         * 2 digit code used to override your default participation code associated with your DHL Germany account.
         */
        public Builder participationCode(Optional<String> participationCode) {
            Utils.checkNotNull(participationCode, "participationCode");
            this.participationCode = participationCode;
            return this;
        }

        /**
         * Party to be billed. (Leave blank for DHL Germany.)
         */
        public Builder type(Type type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        /**
         * Party to be billed. (Leave blank for DHL Germany.)
         */
        public Builder type(Optional<? extends Type> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * ZIP code of account number to be billed (required for UPS if there is a zip on the billing account).
         */
        public Builder zip(String zip) {
            Utils.checkNotNull(zip, "zip");
            this.zip = Optional.ofNullable(zip);
            return this;
        }

        /**
         * ZIP code of account number to be billed (required for UPS if there is a zip on the billing account).
         */
        public Builder zip(Optional<String> zip) {
            Utils.checkNotNull(zip, "zip");
            this.zip = zip;
            return this;
        }
        
        public Billing build() {
            return new Billing(
                account,
                country,
                participationCode,
                type,
                zip);
        }
    }
}
