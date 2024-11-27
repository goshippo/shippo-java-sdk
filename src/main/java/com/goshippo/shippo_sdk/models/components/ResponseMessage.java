/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.goshippo.shippo_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
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
    private Optional<String> source;

    /**
     * Classification of message
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private Optional<String> code;

    /**
     * Message content
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text")
    private Optional<String> text;

    @JsonCreator
    public ResponseMessage(
            @JsonProperty("source") Optional<String> source,
            @JsonProperty("code") Optional<String> code,
            @JsonProperty("text") Optional<String> text) {
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
    @JsonIgnore
    public Optional<String> source() {
        return source;
    }

    /**
     * Classification of message
     */
    @JsonIgnore
    public Optional<String> code() {
        return code;
    }

    /**
     * Message content
     */
    @JsonIgnore
    public Optional<String> text() {
        return text;
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
    public ResponseMessage withSource(Optional<String> source) {
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
    public ResponseMessage withCode(Optional<String> code) {
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
    public ResponseMessage withText(Optional<String> text) {
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
            Objects.deepEquals(this.source, other.source) &&
            Objects.deepEquals(this.code, other.code) &&
            Objects.deepEquals(this.text, other.text);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Optional<String> source = Optional.empty();
 
        private Optional<String> code = Optional.empty();
 
        private Optional<String> text = Optional.empty();  
        
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
        public Builder source(Optional<String> source) {
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
        public Builder code(Optional<String> code) {
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
        public Builder text(Optional<String> text) {
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
