/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
/**
 * CustomsInvoicedCharges - Additional invoiced charges to be shown on the Customs Declaration Commercial Invoice.
 */

public class CustomsInvoicedCharges {

    /**
     * Currency for the invoiced charges amounts incurred on the end consumer.
     */
    @JsonProperty("currency")
    private String currency;

    /**
     * Total shipping paid by the buyer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_shipping")
    private Optional<? extends String> totalShipping;

    /**
     * Total taxes paid by the buyer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_taxes")
    private Optional<? extends String> totalTaxes;

    /**
     * Total duties paid by the buyer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_duties")
    private Optional<? extends String> totalDuties;

    /**
     * Other fees paid by the buyer.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("other_fees")
    private Optional<? extends String> otherFees;

    @JsonCreator
    public CustomsInvoicedCharges(
            @JsonProperty("currency") String currency,
            @JsonProperty("total_shipping") Optional<? extends String> totalShipping,
            @JsonProperty("total_taxes") Optional<? extends String> totalTaxes,
            @JsonProperty("total_duties") Optional<? extends String> totalDuties,
            @JsonProperty("other_fees") Optional<? extends String> otherFees) {
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(totalShipping, "totalShipping");
        Utils.checkNotNull(totalTaxes, "totalTaxes");
        Utils.checkNotNull(totalDuties, "totalDuties");
        Utils.checkNotNull(otherFees, "otherFees");
        this.currency = currency;
        this.totalShipping = totalShipping;
        this.totalTaxes = totalTaxes;
        this.totalDuties = totalDuties;
        this.otherFees = otherFees;
    }
    
    public CustomsInvoicedCharges(
            String currency) {
        this(currency, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Currency for the invoiced charges amounts incurred on the end consumer.
     */
    @JsonIgnore
    public String currency() {
        return currency;
    }

    /**
     * Total shipping paid by the buyer.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> totalShipping() {
        return (Optional<String>) totalShipping;
    }

    /**
     * Total taxes paid by the buyer.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> totalTaxes() {
        return (Optional<String>) totalTaxes;
    }

    /**
     * Total duties paid by the buyer.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> totalDuties() {
        return (Optional<String>) totalDuties;
    }

    /**
     * Other fees paid by the buyer.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> otherFees() {
        return (Optional<String>) otherFees;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Currency for the invoiced charges amounts incurred on the end consumer.
     */
    public CustomsInvoicedCharges withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    /**
     * Total shipping paid by the buyer.
     */
    public CustomsInvoicedCharges withTotalShipping(String totalShipping) {
        Utils.checkNotNull(totalShipping, "totalShipping");
        this.totalShipping = Optional.ofNullable(totalShipping);
        return this;
    }

    /**
     * Total shipping paid by the buyer.
     */
    public CustomsInvoicedCharges withTotalShipping(Optional<? extends String> totalShipping) {
        Utils.checkNotNull(totalShipping, "totalShipping");
        this.totalShipping = totalShipping;
        return this;
    }

    /**
     * Total taxes paid by the buyer.
     */
    public CustomsInvoicedCharges withTotalTaxes(String totalTaxes) {
        Utils.checkNotNull(totalTaxes, "totalTaxes");
        this.totalTaxes = Optional.ofNullable(totalTaxes);
        return this;
    }

    /**
     * Total taxes paid by the buyer.
     */
    public CustomsInvoicedCharges withTotalTaxes(Optional<? extends String> totalTaxes) {
        Utils.checkNotNull(totalTaxes, "totalTaxes");
        this.totalTaxes = totalTaxes;
        return this;
    }

    /**
     * Total duties paid by the buyer.
     */
    public CustomsInvoicedCharges withTotalDuties(String totalDuties) {
        Utils.checkNotNull(totalDuties, "totalDuties");
        this.totalDuties = Optional.ofNullable(totalDuties);
        return this;
    }

    /**
     * Total duties paid by the buyer.
     */
    public CustomsInvoicedCharges withTotalDuties(Optional<? extends String> totalDuties) {
        Utils.checkNotNull(totalDuties, "totalDuties");
        this.totalDuties = totalDuties;
        return this;
    }

    /**
     * Other fees paid by the buyer.
     */
    public CustomsInvoicedCharges withOtherFees(String otherFees) {
        Utils.checkNotNull(otherFees, "otherFees");
        this.otherFees = Optional.ofNullable(otherFees);
        return this;
    }

    /**
     * Other fees paid by the buyer.
     */
    public CustomsInvoicedCharges withOtherFees(Optional<? extends String> otherFees) {
        Utils.checkNotNull(otherFees, "otherFees");
        this.otherFees = otherFees;
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
        CustomsInvoicedCharges other = (CustomsInvoicedCharges) o;
        return 
            java.util.Objects.deepEquals(this.currency, other.currency) &&
            java.util.Objects.deepEquals(this.totalShipping, other.totalShipping) &&
            java.util.Objects.deepEquals(this.totalTaxes, other.totalTaxes) &&
            java.util.Objects.deepEquals(this.totalDuties, other.totalDuties) &&
            java.util.Objects.deepEquals(this.otherFees, other.otherFees);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            currency,
            totalShipping,
            totalTaxes,
            totalDuties,
            otherFees);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CustomsInvoicedCharges.class,
                "currency", currency,
                "totalShipping", totalShipping,
                "totalTaxes", totalTaxes,
                "totalDuties", totalDuties,
                "otherFees", otherFees);
    }
    
    public final static class Builder {
 
        private String currency;
 
        private Optional<? extends String> totalShipping = Optional.empty();
 
        private Optional<? extends String> totalTaxes = Optional.empty();
 
        private Optional<? extends String> totalDuties = Optional.empty();
 
        private Optional<? extends String> otherFees = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Currency for the invoiced charges amounts incurred on the end consumer.
         */
        public Builder currency(String currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = currency;
            return this;
        }

        /**
         * Total shipping paid by the buyer.
         */
        public Builder totalShipping(String totalShipping) {
            Utils.checkNotNull(totalShipping, "totalShipping");
            this.totalShipping = Optional.ofNullable(totalShipping);
            return this;
        }

        /**
         * Total shipping paid by the buyer.
         */
        public Builder totalShipping(Optional<? extends String> totalShipping) {
            Utils.checkNotNull(totalShipping, "totalShipping");
            this.totalShipping = totalShipping;
            return this;
        }

        /**
         * Total taxes paid by the buyer.
         */
        public Builder totalTaxes(String totalTaxes) {
            Utils.checkNotNull(totalTaxes, "totalTaxes");
            this.totalTaxes = Optional.ofNullable(totalTaxes);
            return this;
        }

        /**
         * Total taxes paid by the buyer.
         */
        public Builder totalTaxes(Optional<? extends String> totalTaxes) {
            Utils.checkNotNull(totalTaxes, "totalTaxes");
            this.totalTaxes = totalTaxes;
            return this;
        }

        /**
         * Total duties paid by the buyer.
         */
        public Builder totalDuties(String totalDuties) {
            Utils.checkNotNull(totalDuties, "totalDuties");
            this.totalDuties = Optional.ofNullable(totalDuties);
            return this;
        }

        /**
         * Total duties paid by the buyer.
         */
        public Builder totalDuties(Optional<? extends String> totalDuties) {
            Utils.checkNotNull(totalDuties, "totalDuties");
            this.totalDuties = totalDuties;
            return this;
        }

        /**
         * Other fees paid by the buyer.
         */
        public Builder otherFees(String otherFees) {
            Utils.checkNotNull(otherFees, "otherFees");
            this.otherFees = Optional.ofNullable(otherFees);
            return this;
        }

        /**
         * Other fees paid by the buyer.
         */
        public Builder otherFees(Optional<? extends String> otherFees) {
            Utils.checkNotNull(otherFees, "otherFees");
            this.otherFees = otherFees;
            return this;
        }
        
        public CustomsInvoicedCharges build() {
            return new CustomsInvoicedCharges(
                currency,
                totalShipping,
                totalTaxes,
                totalDuties,
                otherFees);
        }
    }
}

