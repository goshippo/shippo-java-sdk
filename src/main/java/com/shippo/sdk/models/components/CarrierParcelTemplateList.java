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

public class CarrierParcelTemplateList {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("results")
    private Optional<? extends java.util.List<CarrierParcelTemplate>> results;

    @JsonCreator
    public CarrierParcelTemplateList(
            @JsonProperty("results") Optional<? extends java.util.List<CarrierParcelTemplate>> results) {
        Utils.checkNotNull(results, "results");
        this.results = results;
    }
    
    public CarrierParcelTemplateList() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<CarrierParcelTemplate>> results() {
        return (Optional<java.util.List<CarrierParcelTemplate>>) results;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CarrierParcelTemplateList withResults(java.util.List<CarrierParcelTemplate> results) {
        Utils.checkNotNull(results, "results");
        this.results = Optional.ofNullable(results);
        return this;
    }

    public CarrierParcelTemplateList withResults(Optional<? extends java.util.List<CarrierParcelTemplate>> results) {
        Utils.checkNotNull(results, "results");
        this.results = results;
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
        CarrierParcelTemplateList other = (CarrierParcelTemplateList) o;
        return 
            java.util.Objects.deepEquals(this.results, other.results);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            results);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CarrierParcelTemplateList.class,
                "results", results);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<CarrierParcelTemplate>> results = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder results(java.util.List<CarrierParcelTemplate> results) {
            Utils.checkNotNull(results, "results");
            this.results = Optional.ofNullable(results);
            return this;
        }

        public Builder results(Optional<? extends java.util.List<CarrierParcelTemplate>> results) {
            Utils.checkNotNull(results, "results");
            this.results = results;
            return this;
        }
        
        public CarrierParcelTemplateList build() {
            return new CarrierParcelTemplateList(
                results);
        }
    }
}

