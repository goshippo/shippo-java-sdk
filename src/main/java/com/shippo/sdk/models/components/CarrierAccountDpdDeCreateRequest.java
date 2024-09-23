/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.shippo.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class CarrierAccountDpdDeCreateRequest {

    @JsonProperty("carrier")
    private String carrier;

    @JsonProperty("parameters")
    private CarrierAccountDpdDeCreateRequestParameters parameters;

    @JsonCreator
    public CarrierAccountDpdDeCreateRequest(
            @JsonProperty("carrier") String carrier,
            @JsonProperty("parameters") CarrierAccountDpdDeCreateRequestParameters parameters) {
        Utils.checkNotNull(carrier, "carrier");
        Utils.checkNotNull(parameters, "parameters");
        this.carrier = carrier;
        this.parameters = parameters;
    }

    @JsonIgnore
    public String carrier() {
        return carrier;
    }

    @JsonIgnore
    public CarrierAccountDpdDeCreateRequestParameters parameters() {
        return parameters;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CarrierAccountDpdDeCreateRequest withCarrier(String carrier) {
        Utils.checkNotNull(carrier, "carrier");
        this.carrier = carrier;
        return this;
    }

    public CarrierAccountDpdDeCreateRequest withParameters(CarrierAccountDpdDeCreateRequestParameters parameters) {
        Utils.checkNotNull(parameters, "parameters");
        this.parameters = parameters;
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
        CarrierAccountDpdDeCreateRequest other = (CarrierAccountDpdDeCreateRequest) o;
        return 
            Objects.deepEquals(this.carrier, other.carrier) &&
            Objects.deepEquals(this.parameters, other.parameters);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            carrier,
            parameters);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CarrierAccountDpdDeCreateRequest.class,
                "carrier", carrier,
                "parameters", parameters);
    }
    
    public final static class Builder {
 
        private String carrier;
 
        private CarrierAccountDpdDeCreateRequestParameters parameters;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder carrier(String carrier) {
            Utils.checkNotNull(carrier, "carrier");
            this.carrier = carrier;
            return this;
        }

        public Builder parameters(CarrierAccountDpdDeCreateRequestParameters parameters) {
            Utils.checkNotNull(parameters, "parameters");
            this.parameters = parameters;
            return this;
        }
        
        public CarrierAccountDpdDeCreateRequest build() {
            return new CarrierAccountDpdDeCreateRequest(
                carrier,
                parameters);
        }
    }
}

