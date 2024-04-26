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


public class RateMessage {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source")
    private Optional<? extends String> source;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private Optional<? extends String> code;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text")
    private Optional<? extends String> text;

    @JsonCreator
    public RateMessage(
            @JsonProperty("source") Optional<? extends String> source,
            @JsonProperty("code") Optional<? extends String> code,
            @JsonProperty("text") Optional<? extends String> text) {
        Utils.checkNotNull(source, "source");
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(text, "text");
        this.source = source;
        this.code = code;
        this.text = text;
    }
    
    public RateMessage() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<? extends String> source() {
        return source;
    }

    @JsonIgnore
    public Optional<? extends String> code() {
        return code;
    }

    @JsonIgnore
    public Optional<? extends String> text() {
        return text;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public RateMessage withSource(String source) {
        Utils.checkNotNull(source, "source");
        this.source = Optional.ofNullable(source);
        return this;
    }

    public RateMessage withSource(Optional<? extends String> source) {
        Utils.checkNotNull(source, "source");
        this.source = source;
        return this;
    }

    public RateMessage withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = Optional.ofNullable(code);
        return this;
    }

    public RateMessage withCode(Optional<? extends String> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    public RateMessage withText(String text) {
        Utils.checkNotNull(text, "text");
        this.text = Optional.ofNullable(text);
        return this;
    }

    public RateMessage withText(Optional<? extends String> text) {
        Utils.checkNotNull(text, "text");
        this.text = text;
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
        RateMessage other = (RateMessage) o;
        return 
            java.util.Objects.deepEquals(this.source, other.source) &&
            java.util.Objects.deepEquals(this.code, other.code) &&
            java.util.Objects.deepEquals(this.text, other.text);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            source,
            code,
            text);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RateMessage.class,
                "source", source,
                "code", code,
                "text", text);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> source = Optional.empty();
 
        private Optional<? extends String> code = Optional.empty();
 
        private Optional<? extends String> text = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder source(String source) {
            Utils.checkNotNull(source, "source");
            this.source = Optional.ofNullable(source);
            return this;
        }

        public Builder source(Optional<? extends String> source) {
            Utils.checkNotNull(source, "source");
            this.source = source;
            return this;
        }

        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = Optional.ofNullable(code);
            return this;
        }

        public Builder code(Optional<? extends String> code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        public Builder text(String text) {
            Utils.checkNotNull(text, "text");
            this.text = Optional.ofNullable(text);
            return this;
        }

        public Builder text(Optional<? extends String> text) {
            Utils.checkNotNull(text, "text");
            this.text = text;
            return this;
        }
        
        public RateMessage build() {
            return new RateMessage(
                source,
                code,
                text);
        }
    }
}

