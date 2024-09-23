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


public class CarrierAccountCorreosCreateRequest {

    @JsonProperty("carrier")
    private String carrier;

    @JsonProperty("parameters")
    private CarrierAccountCorreosCreateRequestParameters parameters;

    @JsonCreator
    public CarrierAccountCorreosCreateRequest(
            @JsonProperty("carrier") String carrier,
            @JsonProperty("parameters") CarrierAccountCorreosCreateRequestParameters parameters) {
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
    public CarrierAccountCorreosCreateRequestParameters parameters() {
        return parameters;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CarrierAccountCorreosCreateRequest withCarrier(String carrier) {
        Utils.checkNotNull(carrier, "carrier");
        this.carrier = carrier;
        return this;
    }

    public CarrierAccountCorreosCreateRequest withParameters(CarrierAccountCorreosCreateRequestParameters parameters) {
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
        CarrierAccountCorreosCreateRequest other = (CarrierAccountCorreosCreateRequest) o;
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
        return Utils.toString(CarrierAccountCorreosCreateRequest.class,
                "carrier", carrier,
                "parameters", parameters);
    }
    
    public final static class Builder {
 
        private String carrier;
 
        private CarrierAccountCorreosCreateRequestParameters parameters;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder carrier(String carrier) {
            Utils.checkNotNull(carrier, "carrier");
            this.carrier = carrier;
            return this;
        }

        public Builder parameters(CarrierAccountCorreosCreateRequestParameters parameters) {
            Utils.checkNotNull(parameters, "parameters");
            this.parameters = parameters;
            return this;
        }
        
        public CarrierAccountCorreosCreateRequest build() {
            return new CarrierAccountCorreosCreateRequest(
                carrier,
                parameters);
        }
    }
}

