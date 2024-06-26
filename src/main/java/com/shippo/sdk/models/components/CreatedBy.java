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
 * CreatedBy - An object with details about the user who created the Transaction (purchased the label).
 * A value will be returned only for Transactions that can be associated with a specific user, e.g. when a logged-in
 * user purchases a label via the Shippo Web application; but not for Transactions purchased e.g. via the API using a ShippoToken,
 * which is associated with the account but not any specific user.
 */

public class CreatedBy {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("first_name")
    private Optional<? extends String> firstName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_name")
    private Optional<? extends String> lastName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("username")
    private Optional<? extends String> username;

    @JsonCreator
    public CreatedBy(
            @JsonProperty("first_name") Optional<? extends String> firstName,
            @JsonProperty("last_name") Optional<? extends String> lastName,
            @JsonProperty("username") Optional<? extends String> username) {
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(username, "username");
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }
    
    public CreatedBy() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> firstName() {
        return (Optional<String>) firstName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> lastName() {
        return (Optional<String>) lastName;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> username() {
        return (Optional<String>) username;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CreatedBy withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = Optional.ofNullable(firstName);
        return this;
    }

    public CreatedBy withFirstName(Optional<? extends String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    public CreatedBy withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = Optional.ofNullable(lastName);
        return this;
    }

    public CreatedBy withLastName(Optional<? extends String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    public CreatedBy withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = Optional.ofNullable(username);
        return this;
    }

    public CreatedBy withUsername(Optional<? extends String> username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
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
        CreatedBy other = (CreatedBy) o;
        return 
            java.util.Objects.deepEquals(this.firstName, other.firstName) &&
            java.util.Objects.deepEquals(this.lastName, other.lastName) &&
            java.util.Objects.deepEquals(this.username, other.username);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            firstName,
            lastName,
            username);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreatedBy.class,
                "firstName", firstName,
                "lastName", lastName,
                "username", username);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> firstName = Optional.empty();
 
        private Optional<? extends String> lastName = Optional.empty();
 
        private Optional<? extends String> username = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = Optional.ofNullable(firstName);
            return this;
        }

        public Builder firstName(Optional<? extends String> firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = Optional.ofNullable(lastName);
            return this;
        }

        public Builder lastName(Optional<? extends String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }

        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = Optional.ofNullable(username);
            return this;
        }

        public Builder username(Optional<? extends String> username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }
        
        public CreatedBy build() {
            return new CreatedBy(
                firstName,
                lastName,
                username);
        }
    }
}
