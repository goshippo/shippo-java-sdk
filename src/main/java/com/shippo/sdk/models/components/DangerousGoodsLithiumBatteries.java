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
 * DangerousGoodsLithiumBatteries - Container for specifying the presence of lithium batteries.
 */

public class DangerousGoodsLithiumBatteries {

    /**
     * Indicates if the shipment contains lithium batteries.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contains")
    private Optional<? extends Boolean> contains;

    @JsonCreator
    public DangerousGoodsLithiumBatteries(
            @JsonProperty("contains") Optional<? extends Boolean> contains) {
        Utils.checkNotNull(contains, "contains");
        this.contains = contains;
    }
    
    public DangerousGoodsLithiumBatteries() {
        this(Optional.empty());
    }

    /**
     * Indicates if the shipment contains lithium batteries.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> contains() {
        return (Optional<Boolean>) contains;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Indicates if the shipment contains lithium batteries.
     */
    public DangerousGoodsLithiumBatteries withContains(boolean contains) {
        Utils.checkNotNull(contains, "contains");
        this.contains = Optional.ofNullable(contains);
        return this;
    }

    /**
     * Indicates if the shipment contains lithium batteries.
     */
    public DangerousGoodsLithiumBatteries withContains(Optional<? extends Boolean> contains) {
        Utils.checkNotNull(contains, "contains");
        this.contains = contains;
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
        DangerousGoodsLithiumBatteries other = (DangerousGoodsLithiumBatteries) o;
        return 
            java.util.Objects.deepEquals(this.contains, other.contains);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contains);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DangerousGoodsLithiumBatteries.class,
                "contains", contains);
    }
    
    public final static class Builder {
 
        private Optional<? extends Boolean> contains = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Indicates if the shipment contains lithium batteries.
         */
        public Builder contains(boolean contains) {
            Utils.checkNotNull(contains, "contains");
            this.contains = Optional.ofNullable(contains);
            return this;
        }

        /**
         * Indicates if the shipment contains lithium batteries.
         */
        public Builder contains(Optional<? extends Boolean> contains) {
            Utils.checkNotNull(contains, "contains");
            this.contains = contains;
            return this;
        }
        
        public DangerousGoodsLithiumBatteries build() {
            return new DangerousGoodsLithiumBatteries(
                contains);
        }
    }
}

