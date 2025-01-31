/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.goshippo.shippo_sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CarrierAccountDHLExpressCreateRequestParameters {

    /**
     * Whether or not the user agrees to the DHL Express Terms and Conditions. If passed in as false, request will fail with error 400
     */
    @JsonProperty("user_accepted_terms_and_conditions")
    private boolean userAcceptedTermsAndConditions;

    @JsonCreator
    public CarrierAccountDHLExpressCreateRequestParameters(
            @JsonProperty("user_accepted_terms_and_conditions") boolean userAcceptedTermsAndConditions) {
        Utils.checkNotNull(userAcceptedTermsAndConditions, "userAcceptedTermsAndConditions");
        this.userAcceptedTermsAndConditions = userAcceptedTermsAndConditions;
    }

    /**
     * Whether or not the user agrees to the DHL Express Terms and Conditions. If passed in as false, request will fail with error 400
     */
    @JsonIgnore
    public boolean userAcceptedTermsAndConditions() {
        return userAcceptedTermsAndConditions;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Whether or not the user agrees to the DHL Express Terms and Conditions. If passed in as false, request will fail with error 400
     */
    public CarrierAccountDHLExpressCreateRequestParameters withUserAcceptedTermsAndConditions(boolean userAcceptedTermsAndConditions) {
        Utils.checkNotNull(userAcceptedTermsAndConditions, "userAcceptedTermsAndConditions");
        this.userAcceptedTermsAndConditions = userAcceptedTermsAndConditions;
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
        CarrierAccountDHLExpressCreateRequestParameters other = (CarrierAccountDHLExpressCreateRequestParameters) o;
        return 
            Objects.deepEquals(this.userAcceptedTermsAndConditions, other.userAcceptedTermsAndConditions);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            userAcceptedTermsAndConditions);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CarrierAccountDHLExpressCreateRequestParameters.class,
                "userAcceptedTermsAndConditions", userAcceptedTermsAndConditions);
    }
    
    public final static class Builder {
 
        private Boolean userAcceptedTermsAndConditions;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Whether or not the user agrees to the DHL Express Terms and Conditions. If passed in as false, request will fail with error 400
         */
        public Builder userAcceptedTermsAndConditions(boolean userAcceptedTermsAndConditions) {
            Utils.checkNotNull(userAcceptedTermsAndConditions, "userAcceptedTermsAndConditions");
            this.userAcceptedTermsAndConditions = userAcceptedTermsAndConditions;
            return this;
        }
        
        public CarrierAccountDHLExpressCreateRequestParameters build() {
            return new CarrierAccountDHLExpressCreateRequestParameters(
                userAcceptedTermsAndConditions);
        }
    }
}

