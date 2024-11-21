/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.sdk.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.goshippo.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Cod - Specify collection on delivery details (UPS only).
 */

public class Cod {

    /**
     * Amount to be collected.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private Optional<String> amount;

    /**
     * Currency for the amount to be collected. Currently only USD is supported for UPS.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private Optional<String> currency;

    /**
     * Secured funds include money orders, certified cheques and others (see 
     * &lt;a href="https://www.ups.com/content/us/en/shipping/time/service/value_added/cod.html"&gt;UPS&lt;/a&gt; for details). 
     * If no payment_method inputted the value defaults to "ANY".)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_method")
    private Optional<? extends PaymentMethod> paymentMethod;

    @JsonCreator
    public Cod(
            @JsonProperty("amount") Optional<String> amount,
            @JsonProperty("currency") Optional<String> currency,
            @JsonProperty("payment_method") Optional<? extends PaymentMethod> paymentMethod) {
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(paymentMethod, "paymentMethod");
        this.amount = amount;
        this.currency = currency;
        this.paymentMethod = paymentMethod;
    }
    
    public Cod() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Amount to be collected.
     */
    @JsonIgnore
    public Optional<String> amount() {
        return amount;
    }

    /**
     * Currency for the amount to be collected. Currently only USD is supported for UPS.
     */
    @JsonIgnore
    public Optional<String> currency() {
        return currency;
    }

    /**
     * Secured funds include money orders, certified cheques and others (see 
     * &lt;a href="https://www.ups.com/content/us/en/shipping/time/service/value_added/cod.html"&gt;UPS&lt;/a&gt; for details). 
     * If no payment_method inputted the value defaults to "ANY".)
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PaymentMethod> paymentMethod() {
        return (Optional<PaymentMethod>) paymentMethod;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Amount to be collected.
     */
    public Cod withAmount(String amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }

    /**
     * Amount to be collected.
     */
    public Cod withAmount(Optional<String> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    /**
     * Currency for the amount to be collected. Currently only USD is supported for UPS.
     */
    public Cod withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = Optional.ofNullable(currency);
        return this;
    }

    /**
     * Currency for the amount to be collected. Currently only USD is supported for UPS.
     */
    public Cod withCurrency(Optional<String> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    /**
     * Secured funds include money orders, certified cheques and others (see 
     * &lt;a href="https://www.ups.com/content/us/en/shipping/time/service/value_added/cod.html"&gt;UPS&lt;/a&gt; for details). 
     * If no payment_method inputted the value defaults to "ANY".)
     */
    public Cod withPaymentMethod(PaymentMethod paymentMethod) {
        Utils.checkNotNull(paymentMethod, "paymentMethod");
        this.paymentMethod = Optional.ofNullable(paymentMethod);
        return this;
    }

    /**
     * Secured funds include money orders, certified cheques and others (see 
     * &lt;a href="https://www.ups.com/content/us/en/shipping/time/service/value_added/cod.html"&gt;UPS&lt;/a&gt; for details). 
     * If no payment_method inputted the value defaults to "ANY".)
     */
    public Cod withPaymentMethod(Optional<? extends PaymentMethod> paymentMethod) {
        Utils.checkNotNull(paymentMethod, "paymentMethod");
        this.paymentMethod = paymentMethod;
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
        Cod other = (Cod) o;
        return 
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.currency, other.currency) &&
            Objects.deepEquals(this.paymentMethod, other.paymentMethod);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            amount,
            currency,
            paymentMethod);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Cod.class,
                "amount", amount,
                "currency", currency,
                "paymentMethod", paymentMethod);
    }
    
    public final static class Builder {
 
        private Optional<String> amount = Optional.empty();
 
        private Optional<String> currency = Optional.empty();
 
        private Optional<? extends PaymentMethod> paymentMethod = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Amount to be collected.
         */
        public Builder amount(String amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = Optional.ofNullable(amount);
            return this;
        }

        /**
         * Amount to be collected.
         */
        public Builder amount(Optional<String> amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        /**
         * Currency for the amount to be collected. Currently only USD is supported for UPS.
         */
        public Builder currency(String currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = Optional.ofNullable(currency);
            return this;
        }

        /**
         * Currency for the amount to be collected. Currently only USD is supported for UPS.
         */
        public Builder currency(Optional<String> currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = currency;
            return this;
        }

        /**
         * Secured funds include money orders, certified cheques and others (see 
         * &lt;a href="https://www.ups.com/content/us/en/shipping/time/service/value_added/cod.html"&gt;UPS&lt;/a&gt; for details). 
         * If no payment_method inputted the value defaults to "ANY".)
         */
        public Builder paymentMethod(PaymentMethod paymentMethod) {
            Utils.checkNotNull(paymentMethod, "paymentMethod");
            this.paymentMethod = Optional.ofNullable(paymentMethod);
            return this;
        }

        /**
         * Secured funds include money orders, certified cheques and others (see 
         * &lt;a href="https://www.ups.com/content/us/en/shipping/time/service/value_added/cod.html"&gt;UPS&lt;/a&gt; for details). 
         * If no payment_method inputted the value defaults to "ANY".)
         */
        public Builder paymentMethod(Optional<? extends PaymentMethod> paymentMethod) {
            Utils.checkNotNull(paymentMethod, "paymentMethod");
            this.paymentMethod = paymentMethod;
            return this;
        }
        
        public Cod build() {
            return new Cod(
                amount,
                currency,
                paymentMethod);
        }
    }
}
