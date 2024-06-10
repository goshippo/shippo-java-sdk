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
 * ResponseMessage - Message returned with supporting information from a request. In some cases this can be an error message, 
 * for example a timeout from a carrier. If available, the origin of the message is displayed in `source`.
 */

public class ResponseMessage {

    /**
     * Origin of message
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source")
    private Optional<? extends String> source;

    /**
     * Classification of message
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private Optional<? extends String> code;

    /**
     * Message content
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text")
    private Optional<? extends String> text;

    @JsonCreator
    public ResponseMessage(
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
    
    public ResponseMessage() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Origin of message
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> source() {
        return (Optional<String>) source;
    }

    /**
     * Classification of message
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> code() {
        return (Optional<String>) code;
    }

    /**
     * Message content
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> text() {
        return (Optional<String>) text;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Origin of message
     */
    public ResponseMessage withSource(String source) {
        Utils.checkNotNull(source, "source");
        this.source = Optional.ofNullable(source);
        return this;
    }

    /**
     * Origin of message
     */
    public ResponseMessage withSource(Optional<? extends String> source) {
        Utils.checkNotNull(source, "source");
        this.source = source;
        return this;
    }

    /**
     * Classification of message
     */
    public ResponseMessage withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = Optional.ofNullable(code);
        return this;
    }

    /**
     * Classification of message
     */
    public ResponseMessage withCode(Optional<? extends String> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    /**
     * Message content
     */
    public ResponseMessage withText(String text) {
        Utils.checkNotNull(text, "text");
        this.text = Optional.ofNullable(text);
        return this;
    }

    /**
     * Message content
     */
    public ResponseMessage withText(Optional<? extends String> text) {
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
        ResponseMessage other = (ResponseMessage) o;
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
        return Utils.toString(ResponseMessage.class,
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

        /**
         * Origin of message
         */
        public Builder source(String source) {
            Utils.checkNotNull(source, "source");
            this.source = Optional.ofNullable(source);
            return this;
        }

        /**
         * Origin of message
         */
        public Builder source(Optional<? extends String> source) {
            Utils.checkNotNull(source, "source");
            this.source = source;
            return this;
        }

        /**
         * Classification of message
         */
        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = Optional.ofNullable(code);
            return this;
        }

        /**
         * Classification of message
         */
        public Builder code(Optional<? extends String> code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        /**
         * Message content
         */
        public Builder text(String text) {
            Utils.checkNotNull(text, "text");
            this.text = Optional.ofNullable(text);
            return this;
        }

        /**
         * Message content
         */
        public Builder text(Optional<? extends String> text) {
            Utils.checkNotNull(text, "text");
            this.text = text;
            return this;
        }
        
        public ResponseMessage build() {
            return new ResponseMessage(
                source,
                code,
                text);
        }
    }
}
