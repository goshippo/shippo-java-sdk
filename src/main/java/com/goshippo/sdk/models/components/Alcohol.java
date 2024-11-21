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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

/**
 * Alcohol - Indicates that a shipment contains Alcohol (Fedex and UPS only).
 */

public class Alcohol {

    /**
     * Mandatory for Fedex and UPS. Specifies that the package contains Alcohol.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contains_alcohol")
    private Optional<Boolean> containsAlcohol;

    /**
     * Mandatory for Fedex only. License type of the recipient of the Alcohol Package.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("recipient_type")
    private Optional<? extends RecipientType> recipientType;

    @JsonCreator
    public Alcohol(
            @JsonProperty("contains_alcohol") Optional<Boolean> containsAlcohol,
            @JsonProperty("recipient_type") Optional<? extends RecipientType> recipientType) {
        Utils.checkNotNull(containsAlcohol, "containsAlcohol");
        Utils.checkNotNull(recipientType, "recipientType");
        this.containsAlcohol = containsAlcohol;
        this.recipientType = recipientType;
    }
    
    public Alcohol() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * Mandatory for Fedex and UPS. Specifies that the package contains Alcohol.
     */
    @JsonIgnore
    public Optional<Boolean> containsAlcohol() {
        return containsAlcohol;
    }

    /**
     * Mandatory for Fedex only. License type of the recipient of the Alcohol Package.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<RecipientType> recipientType() {
        return (Optional<RecipientType>) recipientType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Mandatory for Fedex and UPS. Specifies that the package contains Alcohol.
     */
    public Alcohol withContainsAlcohol(boolean containsAlcohol) {
        Utils.checkNotNull(containsAlcohol, "containsAlcohol");
        this.containsAlcohol = Optional.ofNullable(containsAlcohol);
        return this;
    }

    /**
     * Mandatory for Fedex and UPS. Specifies that the package contains Alcohol.
     */
    public Alcohol withContainsAlcohol(Optional<Boolean> containsAlcohol) {
        Utils.checkNotNull(containsAlcohol, "containsAlcohol");
        this.containsAlcohol = containsAlcohol;
        return this;
    }

    /**
     * Mandatory for Fedex only. License type of the recipient of the Alcohol Package.
     */
    public Alcohol withRecipientType(RecipientType recipientType) {
        Utils.checkNotNull(recipientType, "recipientType");
        this.recipientType = Optional.ofNullable(recipientType);
        return this;
    }

    /**
     * Mandatory for Fedex only. License type of the recipient of the Alcohol Package.
     */
    public Alcohol withRecipientType(Optional<? extends RecipientType> recipientType) {
        Utils.checkNotNull(recipientType, "recipientType");
        this.recipientType = recipientType;
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
        Alcohol other = (Alcohol) o;
        return 
            Objects.deepEquals(this.containsAlcohol, other.containsAlcohol) &&
            Objects.deepEquals(this.recipientType, other.recipientType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            containsAlcohol,
            recipientType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Alcohol.class,
                "containsAlcohol", containsAlcohol,
                "recipientType", recipientType);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> containsAlcohol = Optional.empty();
 
        private Optional<? extends RecipientType> recipientType = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Mandatory for Fedex and UPS. Specifies that the package contains Alcohol.
         */
        public Builder containsAlcohol(boolean containsAlcohol) {
            Utils.checkNotNull(containsAlcohol, "containsAlcohol");
            this.containsAlcohol = Optional.ofNullable(containsAlcohol);
            return this;
        }

        /**
         * Mandatory for Fedex and UPS. Specifies that the package contains Alcohol.
         */
        public Builder containsAlcohol(Optional<Boolean> containsAlcohol) {
            Utils.checkNotNull(containsAlcohol, "containsAlcohol");
            this.containsAlcohol = containsAlcohol;
            return this;
        }

        /**
         * Mandatory for Fedex only. License type of the recipient of the Alcohol Package.
         */
        public Builder recipientType(RecipientType recipientType) {
            Utils.checkNotNull(recipientType, "recipientType");
            this.recipientType = Optional.ofNullable(recipientType);
            return this;
        }

        /**
         * Mandatory for Fedex only. License type of the recipient of the Alcohol Package.
         */
        public Builder recipientType(Optional<? extends RecipientType> recipientType) {
            Utils.checkNotNull(recipientType, "recipientType");
            this.recipientType = recipientType;
            return this;
        }
        
        public Alcohol build() {
            return new Alcohol(
                containsAlcohol,
                recipientType);
        }
    }
}
