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
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class AddressPaginatedList {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("next")
    private Optional<String> next;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("previous")
    private Optional<String> previous;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("results")
    private Optional<? extends List<Address>> results;

    @JsonCreator
    public AddressPaginatedList(
            @JsonProperty("next") Optional<String> next,
            @JsonProperty("previous") Optional<String> previous,
            @JsonProperty("results") Optional<? extends List<Address>> results) {
        Utils.checkNotNull(next, "next");
        Utils.checkNotNull(previous, "previous");
        Utils.checkNotNull(results, "results");
        this.next = next;
        this.previous = previous;
        this.results = results;
    }
    
    public AddressPaginatedList() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> next() {
        return next;
    }

    @JsonIgnore
    public Optional<String> previous() {
        return previous;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Address>> results() {
        return (Optional<List<Address>>) results;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public AddressPaginatedList withNext(String next) {
        Utils.checkNotNull(next, "next");
        this.next = Optional.ofNullable(next);
        return this;
    }

    public AddressPaginatedList withNext(Optional<String> next) {
        Utils.checkNotNull(next, "next");
        this.next = next;
        return this;
    }

    public AddressPaginatedList withPrevious(String previous) {
        Utils.checkNotNull(previous, "previous");
        this.previous = Optional.ofNullable(previous);
        return this;
    }

    public AddressPaginatedList withPrevious(Optional<String> previous) {
        Utils.checkNotNull(previous, "previous");
        this.previous = previous;
        return this;
    }

    public AddressPaginatedList withResults(List<Address> results) {
        Utils.checkNotNull(results, "results");
        this.results = Optional.ofNullable(results);
        return this;
    }

    public AddressPaginatedList withResults(Optional<? extends List<Address>> results) {
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
        AddressPaginatedList other = (AddressPaginatedList) o;
        return 
            Objects.deepEquals(this.next, other.next) &&
            Objects.deepEquals(this.previous, other.previous) &&
            Objects.deepEquals(this.results, other.results);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            next,
            previous,
            results);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AddressPaginatedList.class,
                "next", next,
                "previous", previous,
                "results", results);
    }
    
    public final static class Builder {
 
        private Optional<String> next = Optional.empty();
 
        private Optional<String> previous = Optional.empty();
 
        private Optional<? extends List<Address>> results = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder next(String next) {
            Utils.checkNotNull(next, "next");
            this.next = Optional.ofNullable(next);
            return this;
        }

        public Builder next(Optional<String> next) {
            Utils.checkNotNull(next, "next");
            this.next = next;
            return this;
        }

        public Builder previous(String previous) {
            Utils.checkNotNull(previous, "previous");
            this.previous = Optional.ofNullable(previous);
            return this;
        }

        public Builder previous(Optional<String> previous) {
            Utils.checkNotNull(previous, "previous");
            this.previous = previous;
            return this;
        }

        public Builder results(List<Address> results) {
            Utils.checkNotNull(results, "results");
            this.results = Optional.ofNullable(results);
            return this;
        }

        public Builder results(Optional<? extends List<Address>> results) {
            Utils.checkNotNull(results, "results");
            this.results = results;
            return this;
        }
        
        public AddressPaginatedList build() {
            return new AddressPaginatedList(
                next,
                previous,
                results);
        }
    }
}
