/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.shippo_java_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.shippo_java_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class CarrierAccountCanadaPostCreateParameters {

    /**
     * Whether or not the user agrees to Canada Post's terms. If passed in as false, request will fail with error 400
     */
    @JsonProperty("canada_post_terms")
    private boolean canadaPostTerms;

    @JsonProperty("company")
    private String company;

    @JsonProperty("email")
    private String email;

    @JsonProperty("full_name")
    private String fullName;

    /**
     * Needs to be a valid phone number and cannot be null
     */
    @JsonProperty("phone")
    private String phone;

    @JsonCreator
    public CarrierAccountCanadaPostCreateParameters(
            @JsonProperty("canada_post_terms") boolean canadaPostTerms,
            @JsonProperty("company") String company,
            @JsonProperty("email") String email,
            @JsonProperty("full_name") String fullName,
            @JsonProperty("phone") String phone) {
        Utils.checkNotNull(canadaPostTerms, "canadaPostTerms");
        Utils.checkNotNull(company, "company");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(fullName, "fullName");
        Utils.checkNotNull(phone, "phone");
        this.canadaPostTerms = canadaPostTerms;
        this.company = company;
        this.email = email;
        this.fullName = fullName;
        this.phone = phone;
    }

    /**
     * Whether or not the user agrees to Canada Post's terms. If passed in as false, request will fail with error 400
     */
    @JsonIgnore
    public boolean canadaPostTerms() {
        return canadaPostTerms;
    }

    @JsonIgnore
    public String company() {
        return company;
    }

    @JsonIgnore
    public String email() {
        return email;
    }

    @JsonIgnore
    public String fullName() {
        return fullName;
    }

    /**
     * Needs to be a valid phone number and cannot be null
     */
    @JsonIgnore
    public String phone() {
        return phone;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Whether or not the user agrees to Canada Post's terms. If passed in as false, request will fail with error 400
     */
    public CarrierAccountCanadaPostCreateParameters withCanadaPostTerms(boolean canadaPostTerms) {
        Utils.checkNotNull(canadaPostTerms, "canadaPostTerms");
        this.canadaPostTerms = canadaPostTerms;
        return this;
    }

    public CarrierAccountCanadaPostCreateParameters withCompany(String company) {
        Utils.checkNotNull(company, "company");
        this.company = company;
        return this;
    }

    public CarrierAccountCanadaPostCreateParameters withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public CarrierAccountCanadaPostCreateParameters withFullName(String fullName) {
        Utils.checkNotNull(fullName, "fullName");
        this.fullName = fullName;
        return this;
    }

    /**
     * Needs to be a valid phone number and cannot be null
     */
    public CarrierAccountCanadaPostCreateParameters withPhone(String phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = phone;
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
        CarrierAccountCanadaPostCreateParameters other = (CarrierAccountCanadaPostCreateParameters) o;
        return 
            java.util.Objects.deepEquals(this.canadaPostTerms, other.canadaPostTerms) &&
            java.util.Objects.deepEquals(this.company, other.company) &&
            java.util.Objects.deepEquals(this.email, other.email) &&
            java.util.Objects.deepEquals(this.fullName, other.fullName) &&
            java.util.Objects.deepEquals(this.phone, other.phone);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            canadaPostTerms,
            company,
            email,
            fullName,
            phone);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CarrierAccountCanadaPostCreateParameters.class,
                "canadaPostTerms", canadaPostTerms,
                "company", company,
                "email", email,
                "fullName", fullName,
                "phone", phone);
    }
    
    public final static class Builder {
 
        private Boolean canadaPostTerms;
 
        private String company;
 
        private String email;
 
        private String fullName;
 
        private String phone;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Whether or not the user agrees to Canada Post's terms. If passed in as false, request will fail with error 400
         */
        public Builder canadaPostTerms(boolean canadaPostTerms) {
            Utils.checkNotNull(canadaPostTerms, "canadaPostTerms");
            this.canadaPostTerms = canadaPostTerms;
            return this;
        }

        public Builder company(String company) {
            Utils.checkNotNull(company, "company");
            this.company = company;
            return this;
        }

        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        public Builder fullName(String fullName) {
            Utils.checkNotNull(fullName, "fullName");
            this.fullName = fullName;
            return this;
        }

        /**
         * Needs to be a valid phone number and cannot be null
         */
        public Builder phone(String phone) {
            Utils.checkNotNull(phone, "phone");
            this.phone = phone;
            return this;
        }
        
        public CarrierAccountCanadaPostCreateParameters build() {
            return new CarrierAccountCanadaPostCreateParameters(
                canadaPostTerms,
                company,
                email,
                fullName,
                phone);
        }
    }
}

