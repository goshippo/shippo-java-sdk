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


public class ShipmentPaginatedList {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    private Optional<? extends String> next;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("previous")
    private Optional<? extends String> previous;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("results")
    private Optional<? extends java.util.List<Shipment>> results;

    @JsonCreator
    public ShipmentPaginatedList(
            @JsonProperty("next") Optional<? extends String> next,
            @JsonProperty("previous") Optional<? extends String> previous,
            @JsonProperty("results") Optional<? extends java.util.List<Shipment>> results) {
        Utils.checkNotNull(next, "next");
        Utils.checkNotNull(previous, "previous");
        Utils.checkNotNull(results, "results");
        this.next = next;
        this.previous = previous;
        this.results = results;
    }
    
    public ShipmentPaginatedList() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<? extends String> next() {
        return next;
    }

    @JsonIgnore
    public Optional<? extends String> previous() {
        return previous;
    }

    @JsonIgnore
    public Optional<? extends java.util.List<Shipment>> results() {
        return results;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ShipmentPaginatedList withNext(String next) {
        Utils.checkNotNull(next, "next");
        this.next = Optional.ofNullable(next);
        return this;
    }

    public ShipmentPaginatedList withNext(Optional<? extends String> next) {
        Utils.checkNotNull(next, "next");
        this.next = next;
        return this;
    }

    public ShipmentPaginatedList withPrevious(String previous) {
        Utils.checkNotNull(previous, "previous");
        this.previous = Optional.ofNullable(previous);
        return this;
    }

    public ShipmentPaginatedList withPrevious(Optional<? extends String> previous) {
        Utils.checkNotNull(previous, "previous");
        this.previous = previous;
        return this;
    }

    public ShipmentPaginatedList withResults(java.util.List<Shipment> results) {
        Utils.checkNotNull(results, "results");
        this.results = Optional.ofNullable(results);
        return this;
    }

    public ShipmentPaginatedList withResults(Optional<? extends java.util.List<Shipment>> results) {
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
        ShipmentPaginatedList other = (ShipmentPaginatedList) o;
        return 
            java.util.Objects.deepEquals(this.next, other.next) &&
            java.util.Objects.deepEquals(this.previous, other.previous) &&
            java.util.Objects.deepEquals(this.results, other.results);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            next,
            previous,
            results);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ShipmentPaginatedList.class,
                "next", next,
                "previous", previous,
                "results", results);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> next = Optional.empty();
 
        private Optional<? extends String> previous = Optional.empty();
 
        private Optional<? extends java.util.List<Shipment>> results = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder next(String next) {
            Utils.checkNotNull(next, "next");
            this.next = Optional.ofNullable(next);
            return this;
        }

        public Builder next(Optional<? extends String> next) {
            Utils.checkNotNull(next, "next");
            this.next = next;
            return this;
        }

        public Builder previous(String previous) {
            Utils.checkNotNull(previous, "previous");
            this.previous = Optional.ofNullable(previous);
            return this;
        }

        public Builder previous(Optional<? extends String> previous) {
            Utils.checkNotNull(previous, "previous");
            this.previous = previous;
            return this;
        }

        public Builder results(java.util.List<Shipment> results) {
            Utils.checkNotNull(results, "results");
            this.results = Optional.ofNullable(results);
            return this;
        }

        public Builder results(Optional<? extends java.util.List<Shipment>> results) {
            Utils.checkNotNull(results, "results");
            this.results = results;
            return this;
        }
        
        public ShipmentPaginatedList build() {
            return new ShipmentPaginatedList(
                next,
                previous,
                results);
        }
    }
}
