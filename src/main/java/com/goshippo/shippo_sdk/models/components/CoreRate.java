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
import java.util.Objects;
import java.util.Optional;


public class CoreRate {

    /**
     * Final Rate price, expressed in the currency used in the sender's country.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private Optional<String> amount;

    /**
     * Final Rate price, expressed in the currency used in the recipient's country.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount_local")
    private Optional<String> amountLocal;

    /**
     * Currency used in the sender's country, refers to `amount`. 
     * The &lt;a href="http://www.xe.com/iso4217.php"&gt;official ISO 4217&lt;/a&gt; currency codes are used, e.g. `USD` or `EUR`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private Optional<String> currency;

    /**
     * Currency used in the recipient's country, refers to `amount_local`. 
     * The &lt;a href="http://www.xe.com/iso4217.php"&gt;official ISO 4217&lt;/a&gt; currency codes are used, e.g. `USD` or "EUR".
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency_local")
    private Optional<String> currencyLocal;

    /**
     * Unique identifier of the Rate object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("object_id")
    private Optional<String> objectId;

    /**
     * Carrier offering the rate, e.g., `FedEx` or `Deutsche Post DHL`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("provider")
    private Optional<String> provider;

    /**
     * Object ID of the carrier account that has been used to retrieve the rate.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("carrier_account")
    private Optional<String> carrierAccount;

    /**
     * Service level name, e.g. `Priority Mail` or `FedEx Ground®`. 
     * A service level commonly defines the transit time of a Shipment (e.g., Express vs. Standard), 
     * along with other properties.  These names vary depending on the provider.&lt;br&gt;
     * See &lt;a href="#tag/Service-Levels"&gt;Service Levels&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("servicelevel_name")
    private Optional<String> servicelevelName;

    /**
     * Token of the Rate's servicelevel, e.g. `usps_priority` or `fedex_ground`.
     * See &lt;a href="#tag/Service-Levels"&gt;servicelevels&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("servicelevel_token")
    private Optional<String> servicelevelToken;

    @JsonCreator
    public CoreRate(
            @JsonProperty("amount") Optional<String> amount,
            @JsonProperty("amount_local") Optional<String> amountLocal,
            @JsonProperty("currency") Optional<String> currency,
            @JsonProperty("currency_local") Optional<String> currencyLocal,
            @JsonProperty("object_id") Optional<String> objectId,
            @JsonProperty("provider") Optional<String> provider,
            @JsonProperty("carrier_account") Optional<String> carrierAccount,
            @JsonProperty("servicelevel_name") Optional<String> servicelevelName,
            @JsonProperty("servicelevel_token") Optional<String> servicelevelToken) {
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(amountLocal, "amountLocal");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(currencyLocal, "currencyLocal");
        Utils.checkNotNull(objectId, "objectId");
        Utils.checkNotNull(provider, "provider");
        Utils.checkNotNull(carrierAccount, "carrierAccount");
        Utils.checkNotNull(servicelevelName, "servicelevelName");
        Utils.checkNotNull(servicelevelToken, "servicelevelToken");
        this.amount = amount;
        this.amountLocal = amountLocal;
        this.currency = currency;
        this.currencyLocal = currencyLocal;
        this.objectId = objectId;
        this.provider = provider;
        this.carrierAccount = carrierAccount;
        this.servicelevelName = servicelevelName;
        this.servicelevelToken = servicelevelToken;
    }
    
    public CoreRate() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Final Rate price, expressed in the currency used in the sender's country.
     */
    @JsonIgnore
    public Optional<String> amount() {
        return amount;
    }

    /**
     * Final Rate price, expressed in the currency used in the recipient's country.
     */
    @JsonIgnore
    public Optional<String> amountLocal() {
        return amountLocal;
    }

    /**
     * Currency used in the sender's country, refers to `amount`. 
     * The &lt;a href="http://www.xe.com/iso4217.php"&gt;official ISO 4217&lt;/a&gt; currency codes are used, e.g. `USD` or `EUR`.
     */
    @JsonIgnore
    public Optional<String> currency() {
        return currency;
    }

    /**
     * Currency used in the recipient's country, refers to `amount_local`. 
     * The &lt;a href="http://www.xe.com/iso4217.php"&gt;official ISO 4217&lt;/a&gt; currency codes are used, e.g. `USD` or "EUR".
     */
    @JsonIgnore
    public Optional<String> currencyLocal() {
        return currencyLocal;
    }

    /**
     * Unique identifier of the Rate object.
     */
    @JsonIgnore
    public Optional<String> objectId() {
        return objectId;
    }

    /**
     * Carrier offering the rate, e.g., `FedEx` or `Deutsche Post DHL`.
     */
    @JsonIgnore
    public Optional<String> provider() {
        return provider;
    }

    /**
     * Object ID of the carrier account that has been used to retrieve the rate.
     */
    @JsonIgnore
    public Optional<String> carrierAccount() {
        return carrierAccount;
    }

    /**
     * Service level name, e.g. `Priority Mail` or `FedEx Ground®`. 
     * A service level commonly defines the transit time of a Shipment (e.g., Express vs. Standard), 
     * along with other properties.  These names vary depending on the provider.&lt;br&gt;
     * See &lt;a href="#tag/Service-Levels"&gt;Service Levels&lt;/a&gt;.
     */
    @JsonIgnore
    public Optional<String> servicelevelName() {
        return servicelevelName;
    }

    /**
     * Token of the Rate's servicelevel, e.g. `usps_priority` or `fedex_ground`.
     * See &lt;a href="#tag/Service-Levels"&gt;servicelevels&lt;/a&gt;.
     */
    @JsonIgnore
    public Optional<String> servicelevelToken() {
        return servicelevelToken;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Final Rate price, expressed in the currency used in the sender's country.
     */
    public CoreRate withAmount(String amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }

    /**
     * Final Rate price, expressed in the currency used in the sender's country.
     */
    public CoreRate withAmount(Optional<String> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    /**
     * Final Rate price, expressed in the currency used in the recipient's country.
     */
    public CoreRate withAmountLocal(String amountLocal) {
        Utils.checkNotNull(amountLocal, "amountLocal");
        this.amountLocal = Optional.ofNullable(amountLocal);
        return this;
    }

    /**
     * Final Rate price, expressed in the currency used in the recipient's country.
     */
    public CoreRate withAmountLocal(Optional<String> amountLocal) {
        Utils.checkNotNull(amountLocal, "amountLocal");
        this.amountLocal = amountLocal;
        return this;
    }

    /**
     * Currency used in the sender's country, refers to `amount`. 
     * The &lt;a href="http://www.xe.com/iso4217.php"&gt;official ISO 4217&lt;/a&gt; currency codes are used, e.g. `USD` or `EUR`.
     */
    public CoreRate withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = Optional.ofNullable(currency);
        return this;
    }

    /**
     * Currency used in the sender's country, refers to `amount`. 
     * The &lt;a href="http://www.xe.com/iso4217.php"&gt;official ISO 4217&lt;/a&gt; currency codes are used, e.g. `USD` or `EUR`.
     */
    public CoreRate withCurrency(Optional<String> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    /**
     * Currency used in the recipient's country, refers to `amount_local`. 
     * The &lt;a href="http://www.xe.com/iso4217.php"&gt;official ISO 4217&lt;/a&gt; currency codes are used, e.g. `USD` or "EUR".
     */
    public CoreRate withCurrencyLocal(String currencyLocal) {
        Utils.checkNotNull(currencyLocal, "currencyLocal");
        this.currencyLocal = Optional.ofNullable(currencyLocal);
        return this;
    }

    /**
     * Currency used in the recipient's country, refers to `amount_local`. 
     * The &lt;a href="http://www.xe.com/iso4217.php"&gt;official ISO 4217&lt;/a&gt; currency codes are used, e.g. `USD` or "EUR".
     */
    public CoreRate withCurrencyLocal(Optional<String> currencyLocal) {
        Utils.checkNotNull(currencyLocal, "currencyLocal");
        this.currencyLocal = currencyLocal;
        return this;
    }

    /**
     * Unique identifier of the Rate object.
     */
    public CoreRate withObjectId(String objectId) {
        Utils.checkNotNull(objectId, "objectId");
        this.objectId = Optional.ofNullable(objectId);
        return this;
    }

    /**
     * Unique identifier of the Rate object.
     */
    public CoreRate withObjectId(Optional<String> objectId) {
        Utils.checkNotNull(objectId, "objectId");
        this.objectId = objectId;
        return this;
    }

    /**
     * Carrier offering the rate, e.g., `FedEx` or `Deutsche Post DHL`.
     */
    public CoreRate withProvider(String provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = Optional.ofNullable(provider);
        return this;
    }

    /**
     * Carrier offering the rate, e.g., `FedEx` or `Deutsche Post DHL`.
     */
    public CoreRate withProvider(Optional<String> provider) {
        Utils.checkNotNull(provider, "provider");
        this.provider = provider;
        return this;
    }

    /**
     * Object ID of the carrier account that has been used to retrieve the rate.
     */
    public CoreRate withCarrierAccount(String carrierAccount) {
        Utils.checkNotNull(carrierAccount, "carrierAccount");
        this.carrierAccount = Optional.ofNullable(carrierAccount);
        return this;
    }

    /**
     * Object ID of the carrier account that has been used to retrieve the rate.
     */
    public CoreRate withCarrierAccount(Optional<String> carrierAccount) {
        Utils.checkNotNull(carrierAccount, "carrierAccount");
        this.carrierAccount = carrierAccount;
        return this;
    }

    /**
     * Service level name, e.g. `Priority Mail` or `FedEx Ground®`. 
     * A service level commonly defines the transit time of a Shipment (e.g., Express vs. Standard), 
     * along with other properties.  These names vary depending on the provider.&lt;br&gt;
     * See &lt;a href="#tag/Service-Levels"&gt;Service Levels&lt;/a&gt;.
     */
    public CoreRate withServicelevelName(String servicelevelName) {
        Utils.checkNotNull(servicelevelName, "servicelevelName");
        this.servicelevelName = Optional.ofNullable(servicelevelName);
        return this;
    }

    /**
     * Service level name, e.g. `Priority Mail` or `FedEx Ground®`. 
     * A service level commonly defines the transit time of a Shipment (e.g., Express vs. Standard), 
     * along with other properties.  These names vary depending on the provider.&lt;br&gt;
     * See &lt;a href="#tag/Service-Levels"&gt;Service Levels&lt;/a&gt;.
     */
    public CoreRate withServicelevelName(Optional<String> servicelevelName) {
        Utils.checkNotNull(servicelevelName, "servicelevelName");
        this.servicelevelName = servicelevelName;
        return this;
    }

    /**
     * Token of the Rate's servicelevel, e.g. `usps_priority` or `fedex_ground`.
     * See &lt;a href="#tag/Service-Levels"&gt;servicelevels&lt;/a&gt;.
     */
    public CoreRate withServicelevelToken(String servicelevelToken) {
        Utils.checkNotNull(servicelevelToken, "servicelevelToken");
        this.servicelevelToken = Optional.ofNullable(servicelevelToken);
        return this;
    }

    /**
     * Token of the Rate's servicelevel, e.g. `usps_priority` or `fedex_ground`.
     * See &lt;a href="#tag/Service-Levels"&gt;servicelevels&lt;/a&gt;.
     */
    public CoreRate withServicelevelToken(Optional<String> servicelevelToken) {
        Utils.checkNotNull(servicelevelToken, "servicelevelToken");
        this.servicelevelToken = servicelevelToken;
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
        CoreRate other = (CoreRate) o;
        return 
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.amountLocal, other.amountLocal) &&
            Objects.deepEquals(this.currency, other.currency) &&
            Objects.deepEquals(this.currencyLocal, other.currencyLocal) &&
            Objects.deepEquals(this.objectId, other.objectId) &&
            Objects.deepEquals(this.provider, other.provider) &&
            Objects.deepEquals(this.carrierAccount, other.carrierAccount) &&
            Objects.deepEquals(this.servicelevelName, other.servicelevelName) &&
            Objects.deepEquals(this.servicelevelToken, other.servicelevelToken);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            amount,
            amountLocal,
            currency,
            currencyLocal,
            objectId,
            provider,
            carrierAccount,
            servicelevelName,
            servicelevelToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CoreRate.class,
                "amount", amount,
                "amountLocal", amountLocal,
                "currency", currency,
                "currencyLocal", currencyLocal,
                "objectId", objectId,
                "provider", provider,
                "carrierAccount", carrierAccount,
                "servicelevelName", servicelevelName,
                "servicelevelToken", servicelevelToken);
    }
    
    public final static class Builder {
 
        private Optional<String> amount = Optional.empty();
 
        private Optional<String> amountLocal = Optional.empty();
 
        private Optional<String> currency = Optional.empty();
 
        private Optional<String> currencyLocal = Optional.empty();
 
        private Optional<String> objectId = Optional.empty();
 
        private Optional<String> provider = Optional.empty();
 
        private Optional<String> carrierAccount = Optional.empty();
 
        private Optional<String> servicelevelName = Optional.empty();
 
        private Optional<String> servicelevelToken = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Final Rate price, expressed in the currency used in the sender's country.
         */
        public Builder amount(String amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = Optional.ofNullable(amount);
            return this;
        }

        /**
         * Final Rate price, expressed in the currency used in the sender's country.
         */
        public Builder amount(Optional<String> amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        /**
         * Final Rate price, expressed in the currency used in the recipient's country.
         */
        public Builder amountLocal(String amountLocal) {
            Utils.checkNotNull(amountLocal, "amountLocal");
            this.amountLocal = Optional.ofNullable(amountLocal);
            return this;
        }

        /**
         * Final Rate price, expressed in the currency used in the recipient's country.
         */
        public Builder amountLocal(Optional<String> amountLocal) {
            Utils.checkNotNull(amountLocal, "amountLocal");
            this.amountLocal = amountLocal;
            return this;
        }

        /**
         * Currency used in the sender's country, refers to `amount`. 
         * The &lt;a href="http://www.xe.com/iso4217.php"&gt;official ISO 4217&lt;/a&gt; currency codes are used, e.g. `USD` or `EUR`.
         */
        public Builder currency(String currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = Optional.ofNullable(currency);
            return this;
        }

        /**
         * Currency used in the sender's country, refers to `amount`. 
         * The &lt;a href="http://www.xe.com/iso4217.php"&gt;official ISO 4217&lt;/a&gt; currency codes are used, e.g. `USD` or `EUR`.
         */
        public Builder currency(Optional<String> currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = currency;
            return this;
        }

        /**
         * Currency used in the recipient's country, refers to `amount_local`. 
         * The &lt;a href="http://www.xe.com/iso4217.php"&gt;official ISO 4217&lt;/a&gt; currency codes are used, e.g. `USD` or "EUR".
         */
        public Builder currencyLocal(String currencyLocal) {
            Utils.checkNotNull(currencyLocal, "currencyLocal");
            this.currencyLocal = Optional.ofNullable(currencyLocal);
            return this;
        }

        /**
         * Currency used in the recipient's country, refers to `amount_local`. 
         * The &lt;a href="http://www.xe.com/iso4217.php"&gt;official ISO 4217&lt;/a&gt; currency codes are used, e.g. `USD` or "EUR".
         */
        public Builder currencyLocal(Optional<String> currencyLocal) {
            Utils.checkNotNull(currencyLocal, "currencyLocal");
            this.currencyLocal = currencyLocal;
            return this;
        }

        /**
         * Unique identifier of the Rate object.
         */
        public Builder objectId(String objectId) {
            Utils.checkNotNull(objectId, "objectId");
            this.objectId = Optional.ofNullable(objectId);
            return this;
        }

        /**
         * Unique identifier of the Rate object.
         */
        public Builder objectId(Optional<String> objectId) {
            Utils.checkNotNull(objectId, "objectId");
            this.objectId = objectId;
            return this;
        }

        /**
         * Carrier offering the rate, e.g., `FedEx` or `Deutsche Post DHL`.
         */
        public Builder provider(String provider) {
            Utils.checkNotNull(provider, "provider");
            this.provider = Optional.ofNullable(provider);
            return this;
        }

        /**
         * Carrier offering the rate, e.g., `FedEx` or `Deutsche Post DHL`.
         */
        public Builder provider(Optional<String> provider) {
            Utils.checkNotNull(provider, "provider");
            this.provider = provider;
            return this;
        }

        /**
         * Object ID of the carrier account that has been used to retrieve the rate.
         */
        public Builder carrierAccount(String carrierAccount) {
            Utils.checkNotNull(carrierAccount, "carrierAccount");
            this.carrierAccount = Optional.ofNullable(carrierAccount);
            return this;
        }

        /**
         * Object ID of the carrier account that has been used to retrieve the rate.
         */
        public Builder carrierAccount(Optional<String> carrierAccount) {
            Utils.checkNotNull(carrierAccount, "carrierAccount");
            this.carrierAccount = carrierAccount;
            return this;
        }

        /**
         * Service level name, e.g. `Priority Mail` or `FedEx Ground®`. 
         * A service level commonly defines the transit time of a Shipment (e.g., Express vs. Standard), 
         * along with other properties.  These names vary depending on the provider.&lt;br&gt;
         * See &lt;a href="#tag/Service-Levels"&gt;Service Levels&lt;/a&gt;.
         */
        public Builder servicelevelName(String servicelevelName) {
            Utils.checkNotNull(servicelevelName, "servicelevelName");
            this.servicelevelName = Optional.ofNullable(servicelevelName);
            return this;
        }

        /**
         * Service level name, e.g. `Priority Mail` or `FedEx Ground®`. 
         * A service level commonly defines the transit time of a Shipment (e.g., Express vs. Standard), 
         * along with other properties.  These names vary depending on the provider.&lt;br&gt;
         * See &lt;a href="#tag/Service-Levels"&gt;Service Levels&lt;/a&gt;.
         */
        public Builder servicelevelName(Optional<String> servicelevelName) {
            Utils.checkNotNull(servicelevelName, "servicelevelName");
            this.servicelevelName = servicelevelName;
            return this;
        }

        /**
         * Token of the Rate's servicelevel, e.g. `usps_priority` or `fedex_ground`.
         * See &lt;a href="#tag/Service-Levels"&gt;servicelevels&lt;/a&gt;.
         */
        public Builder servicelevelToken(String servicelevelToken) {
            Utils.checkNotNull(servicelevelToken, "servicelevelToken");
            this.servicelevelToken = Optional.ofNullable(servicelevelToken);
            return this;
        }

        /**
         * Token of the Rate's servicelevel, e.g. `usps_priority` or `fedex_ground`.
         * See &lt;a href="#tag/Service-Levels"&gt;servicelevels&lt;/a&gt;.
         */
        public Builder servicelevelToken(Optional<String> servicelevelToken) {
            Utils.checkNotNull(servicelevelToken, "servicelevelToken");
            this.servicelevelToken = servicelevelToken;
            return this;
        }
        
        public CoreRate build() {
            return new CoreRate(
                amount,
                amountLocal,
                currency,
                currencyLocal,
                objectId,
                provider,
                carrierAccount,
                servicelevelName,
                servicelevelToken);
        }
    }
}

