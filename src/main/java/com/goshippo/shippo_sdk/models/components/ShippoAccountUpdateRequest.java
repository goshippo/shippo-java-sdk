/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.goshippo.shippo_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class ShippoAccountUpdateRequest {

    @JsonProperty("email")
    private String email;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("company_name")
    private String companyName;

    @JsonCreator
    public ShippoAccountUpdateRequest(
            @JsonProperty("email") String email,
            @JsonProperty("first_name") String firstName,
            @JsonProperty("last_name") String lastName,
            @JsonProperty("company_name") String companyName) {
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(companyName, "companyName");
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
    }

    @JsonIgnore
    public String email() {
        return email;
    }

    @JsonIgnore
    public String firstName() {
        return firstName;
    }

    @JsonIgnore
    public String lastName() {
        return lastName;
    }

    @JsonIgnore
    public String companyName() {
        return companyName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ShippoAccountUpdateRequest withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public ShippoAccountUpdateRequest withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    public ShippoAccountUpdateRequest withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    public ShippoAccountUpdateRequest withCompanyName(String companyName) {
        Utils.checkNotNull(companyName, "companyName");
        this.companyName = companyName;
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
        ShippoAccountUpdateRequest other = (ShippoAccountUpdateRequest) o;
        return 
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.firstName, other.firstName) &&
            Objects.deepEquals(this.lastName, other.lastName) &&
            Objects.deepEquals(this.companyName, other.companyName);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            email,
            firstName,
            lastName,
            companyName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ShippoAccountUpdateRequest.class,
                "email", email,
                "firstName", firstName,
                "lastName", lastName,
                "companyName", companyName);
    }
    
    public final static class Builder {
 
        private String email;
 
        private String firstName;
 
        private String lastName;
 
        private String companyName;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }

        public Builder companyName(String companyName) {
            Utils.checkNotNull(companyName, "companyName");
            this.companyName = companyName;
            return this;
        }
        
        public ShippoAccountUpdateRequest build() {
            return new ShippoAccountUpdateRequest(
                email,
                firstName,
                lastName,
                companyName);
        }
    }
}

