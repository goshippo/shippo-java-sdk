/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.shippo_java_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.shippo_java_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;


public class CarrierAccountHermesUKCreateRequestParameters {

    @JsonCreator
    public CarrierAccountHermesUKCreateRequestParameters() {
        
        
    }

    public final static Builder builder() {
        return new Builder();
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            );
    }
    
    @Override
    public String toString() {
        return Utils.toString(CarrierAccountHermesUKCreateRequestParameters.class);
    }
    
    public final static class Builder {  
        
        private Builder() {
          // force use of static builder() method
        }
        
        public CarrierAccountHermesUKCreateRequestParameters build() {
            return new CarrierAccountHermesUKCreateRequestParameters(
                );
        }
    }
}

