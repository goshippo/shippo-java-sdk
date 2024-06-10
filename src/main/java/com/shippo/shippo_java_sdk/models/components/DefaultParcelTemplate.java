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


public class DefaultParcelTemplate {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("result")
    private Optional<? extends UserParcelTemplate> result;

    @JsonCreator
    public DefaultParcelTemplate(
            @JsonProperty("result") Optional<? extends UserParcelTemplate> result) {
        Utils.checkNotNull(result, "result");
        this.result = result;
    }
    
    public DefaultParcelTemplate() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<? extends UserParcelTemplate> result() {
        return result;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DefaultParcelTemplate withResult(UserParcelTemplate result) {
        Utils.checkNotNull(result, "result");
        this.result = Optional.ofNullable(result);
        return this;
    }

    public DefaultParcelTemplate withResult(Optional<? extends UserParcelTemplate> result) {
        Utils.checkNotNull(result, "result");
        this.result = result;
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
        DefaultParcelTemplate other = (DefaultParcelTemplate) o;
        return 
            java.util.Objects.deepEquals(this.result, other.result);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            result);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DefaultParcelTemplate.class,
                "result", result);
    }
    
    public final static class Builder {
 
        private Optional<? extends UserParcelTemplate> result = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder result(UserParcelTemplate result) {
            Utils.checkNotNull(result, "result");
            this.result = Optional.ofNullable(result);
            return this;
        }

        public Builder result(Optional<? extends UserParcelTemplate> result) {
            Utils.checkNotNull(result, "result");
            this.result = result;
            return this;
        }
        
        public DefaultParcelTemplate build() {
            return new DefaultParcelTemplate(
                result);
        }
    }
}
