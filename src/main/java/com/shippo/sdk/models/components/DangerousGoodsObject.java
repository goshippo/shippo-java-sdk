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
 * DangerousGoodsObject - Container for specifying the presence of dangerous materials. This is specific to USPS, and if any contents
 * are provided, only certain USPS service levels will be eligible. For more information, see our
 * &lt;a href="https://docs.goshippo.com/docs/shipments/hazmat/"&gt;guide on hazardous or dangerous materials shipping&lt;/a&gt;.
 */

public class DangerousGoodsObject {

    /**
     * Indicates if the shipment contains dangerous goods.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contains")
    private Optional<? extends Boolean> contains;

    /**
     * Container for specifying the presence of biological material.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("biological_material")
    private Optional<? extends DangerousGoodsBiologicalMaterial> biologicalMaterial;

    /**
     * Container for specifying the presence of lithium batteries.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lithium_batteries")
    private Optional<? extends DangerousGoodsLithiumBatteries> lithiumBatteries;

    @JsonCreator
    public DangerousGoodsObject(
            @JsonProperty("contains") Optional<? extends Boolean> contains,
            @JsonProperty("biological_material") Optional<? extends DangerousGoodsBiologicalMaterial> biologicalMaterial,
            @JsonProperty("lithium_batteries") Optional<? extends DangerousGoodsLithiumBatteries> lithiumBatteries) {
        Utils.checkNotNull(contains, "contains");
        Utils.checkNotNull(biologicalMaterial, "biologicalMaterial");
        Utils.checkNotNull(lithiumBatteries, "lithiumBatteries");
        this.contains = contains;
        this.biologicalMaterial = biologicalMaterial;
        this.lithiumBatteries = lithiumBatteries;
    }
    
    public DangerousGoodsObject() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Indicates if the shipment contains dangerous goods.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> contains() {
        return (Optional<Boolean>) contains;
    }

    /**
     * Container for specifying the presence of biological material.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DangerousGoodsBiologicalMaterial> biologicalMaterial() {
        return (Optional<DangerousGoodsBiologicalMaterial>) biologicalMaterial;
    }

    /**
     * Container for specifying the presence of lithium batteries.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<DangerousGoodsLithiumBatteries> lithiumBatteries() {
        return (Optional<DangerousGoodsLithiumBatteries>) lithiumBatteries;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Indicates if the shipment contains dangerous goods.
     */
    public DangerousGoodsObject withContains(boolean contains) {
        Utils.checkNotNull(contains, "contains");
        this.contains = Optional.ofNullable(contains);
        return this;
    }

    /**
     * Indicates if the shipment contains dangerous goods.
     */
    public DangerousGoodsObject withContains(Optional<? extends Boolean> contains) {
        Utils.checkNotNull(contains, "contains");
        this.contains = contains;
        return this;
    }

    /**
     * Container for specifying the presence of biological material.
     */
    public DangerousGoodsObject withBiologicalMaterial(DangerousGoodsBiologicalMaterial biologicalMaterial) {
        Utils.checkNotNull(biologicalMaterial, "biologicalMaterial");
        this.biologicalMaterial = Optional.ofNullable(biologicalMaterial);
        return this;
    }

    /**
     * Container for specifying the presence of biological material.
     */
    public DangerousGoodsObject withBiologicalMaterial(Optional<? extends DangerousGoodsBiologicalMaterial> biologicalMaterial) {
        Utils.checkNotNull(biologicalMaterial, "biologicalMaterial");
        this.biologicalMaterial = biologicalMaterial;
        return this;
    }

    /**
     * Container for specifying the presence of lithium batteries.
     */
    public DangerousGoodsObject withLithiumBatteries(DangerousGoodsLithiumBatteries lithiumBatteries) {
        Utils.checkNotNull(lithiumBatteries, "lithiumBatteries");
        this.lithiumBatteries = Optional.ofNullable(lithiumBatteries);
        return this;
    }

    /**
     * Container for specifying the presence of lithium batteries.
     */
    public DangerousGoodsObject withLithiumBatteries(Optional<? extends DangerousGoodsLithiumBatteries> lithiumBatteries) {
        Utils.checkNotNull(lithiumBatteries, "lithiumBatteries");
        this.lithiumBatteries = lithiumBatteries;
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
        DangerousGoodsObject other = (DangerousGoodsObject) o;
        return 
            java.util.Objects.deepEquals(this.contains, other.contains) &&
            java.util.Objects.deepEquals(this.biologicalMaterial, other.biologicalMaterial) &&
            java.util.Objects.deepEquals(this.lithiumBatteries, other.lithiumBatteries);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            contains,
            biologicalMaterial,
            lithiumBatteries);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DangerousGoodsObject.class,
                "contains", contains,
                "biologicalMaterial", biologicalMaterial,
                "lithiumBatteries", lithiumBatteries);
    }
    
    public final static class Builder {
 
        private Optional<? extends Boolean> contains = Optional.empty();
 
        private Optional<? extends DangerousGoodsBiologicalMaterial> biologicalMaterial = Optional.empty();
 
        private Optional<? extends DangerousGoodsLithiumBatteries> lithiumBatteries = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Indicates if the shipment contains dangerous goods.
         */
        public Builder contains(boolean contains) {
            Utils.checkNotNull(contains, "contains");
            this.contains = Optional.ofNullable(contains);
            return this;
        }

        /**
         * Indicates if the shipment contains dangerous goods.
         */
        public Builder contains(Optional<? extends Boolean> contains) {
            Utils.checkNotNull(contains, "contains");
            this.contains = contains;
            return this;
        }

        /**
         * Container for specifying the presence of biological material.
         */
        public Builder biologicalMaterial(DangerousGoodsBiologicalMaterial biologicalMaterial) {
            Utils.checkNotNull(biologicalMaterial, "biologicalMaterial");
            this.biologicalMaterial = Optional.ofNullable(biologicalMaterial);
            return this;
        }

        /**
         * Container for specifying the presence of biological material.
         */
        public Builder biologicalMaterial(Optional<? extends DangerousGoodsBiologicalMaterial> biologicalMaterial) {
            Utils.checkNotNull(biologicalMaterial, "biologicalMaterial");
            this.biologicalMaterial = biologicalMaterial;
            return this;
        }

        /**
         * Container for specifying the presence of lithium batteries.
         */
        public Builder lithiumBatteries(DangerousGoodsLithiumBatteries lithiumBatteries) {
            Utils.checkNotNull(lithiumBatteries, "lithiumBatteries");
            this.lithiumBatteries = Optional.ofNullable(lithiumBatteries);
            return this;
        }

        /**
         * Container for specifying the presence of lithium batteries.
         */
        public Builder lithiumBatteries(Optional<? extends DangerousGoodsLithiumBatteries> lithiumBatteries) {
            Utils.checkNotNull(lithiumBatteries, "lithiumBatteries");
            this.lithiumBatteries = lithiumBatteries;
            return this;
        }
        
        public DangerousGoodsObject build() {
            return new DangerousGoodsObject(
                contains,
                biologicalMaterial,
                lithiumBatteries);
        }
    }
}

