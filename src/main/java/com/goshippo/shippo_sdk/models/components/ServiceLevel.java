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

/**
 * ServiceLevel - Used for some Service Levels to link to the more "generic" version of this Service Level - for example, 
 * if this Service Level is a variation specific to shipments to Europe("ups_saver_eu"), the "parent" is 
 * the fully generic version ("ups_saver"). Helpful when displaying Service Levels to users. Has the same 
 * structure of the servicelevel - "name", "token", "terms", and "extended_token", or it is otherwise null.
 */

public class ServiceLevel {

    /**
     * Name of the Rate's servicelevel, e.g. `International Priority` or `Standard Post`. 
     * A servicelevel commonly defines the transit time of a Shipment (e.g., Express vs. Standard), along with other properties. 
     * These names vary depending on the provider.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    /**
     * Further clarification of the service.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("terms")
    private Optional<String> terms;

    /**
     * Token of the Rate's servicelevel, e.g. `usps_priority` or `fedex_ground`. 
     * See &lt;a href="#tag/Service-Levels"&gt;servicelevels&lt;/a&gt;.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("token")
    private Optional<String> token;

    /**
     * Unique, extended version of the Service Level "token". 
     * Guaranteed to be unique across all Service Levels, and may help offer insight into the specific Service Level it describes.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("extended_token")
    private Optional<String> extendedToken;

    @JsonCreator
    public ServiceLevel(
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("terms") Optional<String> terms,
            @JsonProperty("token") Optional<String> token,
            @JsonProperty("extended_token") Optional<String> extendedToken) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(terms, "terms");
        Utils.checkNotNull(token, "token");
        Utils.checkNotNull(extendedToken, "extendedToken");
        this.name = name;
        this.terms = terms;
        this.token = token;
        this.extendedToken = extendedToken;
    }
    
    public ServiceLevel() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Name of the Rate's servicelevel, e.g. `International Priority` or `Standard Post`. 
     * A servicelevel commonly defines the transit time of a Shipment (e.g., Express vs. Standard), along with other properties. 
     * These names vary depending on the provider.
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    /**
     * Further clarification of the service.
     */
    @JsonIgnore
    public Optional<String> terms() {
        return terms;
    }

    /**
     * Token of the Rate's servicelevel, e.g. `usps_priority` or `fedex_ground`. 
     * See &lt;a href="#tag/Service-Levels"&gt;servicelevels&lt;/a&gt;.
     */
    @JsonIgnore
    public Optional<String> token() {
        return token;
    }

    /**
     * Unique, extended version of the Service Level "token". 
     * Guaranteed to be unique across all Service Levels, and may help offer insight into the specific Service Level it describes.
     */
    @JsonIgnore
    public Optional<String> extendedToken() {
        return extendedToken;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Name of the Rate's servicelevel, e.g. `International Priority` or `Standard Post`. 
     * A servicelevel commonly defines the transit time of a Shipment (e.g., Express vs. Standard), along with other properties. 
     * These names vary depending on the provider.
     */
    public ServiceLevel withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Name of the Rate's servicelevel, e.g. `International Priority` or `Standard Post`. 
     * A servicelevel commonly defines the transit time of a Shipment (e.g., Express vs. Standard), along with other properties. 
     * These names vary depending on the provider.
     */
    public ServiceLevel withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Further clarification of the service.
     */
    public ServiceLevel withTerms(String terms) {
        Utils.checkNotNull(terms, "terms");
        this.terms = Optional.ofNullable(terms);
        return this;
    }

    /**
     * Further clarification of the service.
     */
    public ServiceLevel withTerms(Optional<String> terms) {
        Utils.checkNotNull(terms, "terms");
        this.terms = terms;
        return this;
    }

    /**
     * Token of the Rate's servicelevel, e.g. `usps_priority` or `fedex_ground`. 
     * See &lt;a href="#tag/Service-Levels"&gt;servicelevels&lt;/a&gt;.
     */
    public ServiceLevel withToken(String token) {
        Utils.checkNotNull(token, "token");
        this.token = Optional.ofNullable(token);
        return this;
    }

    /**
     * Token of the Rate's servicelevel, e.g. `usps_priority` or `fedex_ground`. 
     * See &lt;a href="#tag/Service-Levels"&gt;servicelevels&lt;/a&gt;.
     */
    public ServiceLevel withToken(Optional<String> token) {
        Utils.checkNotNull(token, "token");
        this.token = token;
        return this;
    }

    /**
     * Unique, extended version of the Service Level "token". 
     * Guaranteed to be unique across all Service Levels, and may help offer insight into the specific Service Level it describes.
     */
    public ServiceLevel withExtendedToken(String extendedToken) {
        Utils.checkNotNull(extendedToken, "extendedToken");
        this.extendedToken = Optional.ofNullable(extendedToken);
        return this;
    }

    /**
     * Unique, extended version of the Service Level "token". 
     * Guaranteed to be unique across all Service Levels, and may help offer insight into the specific Service Level it describes.
     */
    public ServiceLevel withExtendedToken(Optional<String> extendedToken) {
        Utils.checkNotNull(extendedToken, "extendedToken");
        this.extendedToken = extendedToken;
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
        ServiceLevel other = (ServiceLevel) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.terms, other.terms) &&
            Objects.deepEquals(this.token, other.token) &&
            Objects.deepEquals(this.extendedToken, other.extendedToken);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            terms,
            token,
            extendedToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ServiceLevel.class,
                "name", name,
                "terms", terms,
                "token", token,
                "extendedToken", extendedToken);
    }
    
    public final static class Builder {
 
        private Optional<String> name = Optional.empty();
 
        private Optional<String> terms = Optional.empty();
 
        private Optional<String> token = Optional.empty();
 
        private Optional<String> extendedToken = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Name of the Rate's servicelevel, e.g. `International Priority` or `Standard Post`. 
         * A servicelevel commonly defines the transit time of a Shipment (e.g., Express vs. Standard), along with other properties. 
         * These names vary depending on the provider.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * Name of the Rate's servicelevel, e.g. `International Priority` or `Standard Post`. 
         * A servicelevel commonly defines the transit time of a Shipment (e.g., Express vs. Standard), along with other properties. 
         * These names vary depending on the provider.
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Further clarification of the service.
         */
        public Builder terms(String terms) {
            Utils.checkNotNull(terms, "terms");
            this.terms = Optional.ofNullable(terms);
            return this;
        }

        /**
         * Further clarification of the service.
         */
        public Builder terms(Optional<String> terms) {
            Utils.checkNotNull(terms, "terms");
            this.terms = terms;
            return this;
        }

        /**
         * Token of the Rate's servicelevel, e.g. `usps_priority` or `fedex_ground`. 
         * See &lt;a href="#tag/Service-Levels"&gt;servicelevels&lt;/a&gt;.
         */
        public Builder token(String token) {
            Utils.checkNotNull(token, "token");
            this.token = Optional.ofNullable(token);
            return this;
        }

        /**
         * Token of the Rate's servicelevel, e.g. `usps_priority` or `fedex_ground`. 
         * See &lt;a href="#tag/Service-Levels"&gt;servicelevels&lt;/a&gt;.
         */
        public Builder token(Optional<String> token) {
            Utils.checkNotNull(token, "token");
            this.token = token;
            return this;
        }

        /**
         * Unique, extended version of the Service Level "token". 
         * Guaranteed to be unique across all Service Levels, and may help offer insight into the specific Service Level it describes.
         */
        public Builder extendedToken(String extendedToken) {
            Utils.checkNotNull(extendedToken, "extendedToken");
            this.extendedToken = Optional.ofNullable(extendedToken);
            return this;
        }

        /**
         * Unique, extended version of the Service Level "token". 
         * Guaranteed to be unique across all Service Levels, and may help offer insight into the specific Service Level it describes.
         */
        public Builder extendedToken(Optional<String> extendedToken) {
            Utils.checkNotNull(extendedToken, "extendedToken");
            this.extendedToken = extendedToken;
            return this;
        }
        
        public ServiceLevel build() {
            return new ServiceLevel(
                name,
                terms,
                token,
                extendedToken);
        }
    }
}
