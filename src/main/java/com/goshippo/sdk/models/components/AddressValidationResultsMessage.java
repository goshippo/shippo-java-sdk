/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.sdk.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.goshippo.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class AddressValidationResultsMessage {

    /**
     * See &lt;a href="#tag/Address-Validation-Codes"&gt;Address Validation Codes&lt;/a&gt;
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private Optional<String> code;

    /**
     * See &lt;a href="#tag/Address-Validation-Source"&gt;Address Validation Source&lt;/a&gt;
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("source")
    private Optional<String> source;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("text")
    private Optional<String> text;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<String> type;

    @JsonCreator
    public AddressValidationResultsMessage(
            @JsonProperty("code") Optional<String> code,
            @JsonProperty("source") Optional<String> source,
            @JsonProperty("text") Optional<String> text,
            @JsonProperty("type") Optional<String> type) {
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(source, "source");
        Utils.checkNotNull(text, "text");
        Utils.checkNotNull(type, "type");
        this.code = code;
        this.source = source;
        this.text = text;
        this.type = type;
    }
    
    public AddressValidationResultsMessage() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * See &lt;a href="#tag/Address-Validation-Codes"&gt;Address Validation Codes&lt;/a&gt;
     */
    @JsonIgnore
    public Optional<String> code() {
        return code;
    }

    /**
     * See &lt;a href="#tag/Address-Validation-Source"&gt;Address Validation Source&lt;/a&gt;
     */
    @JsonIgnore
    public Optional<String> source() {
        return source;
    }

    @JsonIgnore
    public Optional<String> text() {
        return text;
    }

    @JsonIgnore
    public Optional<String> type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * See &lt;a href="#tag/Address-Validation-Codes"&gt;Address Validation Codes&lt;/a&gt;
     */
    public AddressValidationResultsMessage withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = Optional.ofNullable(code);
        return this;
    }

    /**
     * See &lt;a href="#tag/Address-Validation-Codes"&gt;Address Validation Codes&lt;/a&gt;
     */
    public AddressValidationResultsMessage withCode(Optional<String> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    /**
     * See &lt;a href="#tag/Address-Validation-Source"&gt;Address Validation Source&lt;/a&gt;
     */
    public AddressValidationResultsMessage withSource(String source) {
        Utils.checkNotNull(source, "source");
        this.source = Optional.ofNullable(source);
        return this;
    }

    /**
     * See &lt;a href="#tag/Address-Validation-Source"&gt;Address Validation Source&lt;/a&gt;
     */
    public AddressValidationResultsMessage withSource(Optional<String> source) {
        Utils.checkNotNull(source, "source");
        this.source = source;
        return this;
    }

    public AddressValidationResultsMessage withText(String text) {
        Utils.checkNotNull(text, "text");
        this.text = Optional.ofNullable(text);
        return this;
    }

    public AddressValidationResultsMessage withText(Optional<String> text) {
        Utils.checkNotNull(text, "text");
        this.text = text;
        return this;
    }

    public AddressValidationResultsMessage withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public AddressValidationResultsMessage withType(Optional<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        AddressValidationResultsMessage other = (AddressValidationResultsMessage) o;
        return 
            Objects.deepEquals(this.code, other.code) &&
            Objects.deepEquals(this.source, other.source) &&
            Objects.deepEquals(this.text, other.text) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            code,
            source,
            text,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(AddressValidationResultsMessage.class,
                "code", code,
                "source", source,
                "text", text,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<String> code = Optional.empty();
 
        private Optional<String> source = Optional.empty();
 
        private Optional<String> text = Optional.empty();
 
        private Optional<String> type = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * See &lt;a href="#tag/Address-Validation-Codes"&gt;Address Validation Codes&lt;/a&gt;
         */
        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = Optional.ofNullable(code);
            return this;
        }

        /**
         * See &lt;a href="#tag/Address-Validation-Codes"&gt;Address Validation Codes&lt;/a&gt;
         */
        public Builder code(Optional<String> code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        /**
         * See &lt;a href="#tag/Address-Validation-Source"&gt;Address Validation Source&lt;/a&gt;
         */
        public Builder source(String source) {
            Utils.checkNotNull(source, "source");
            this.source = Optional.ofNullable(source);
            return this;
        }

        /**
         * See &lt;a href="#tag/Address-Validation-Source"&gt;Address Validation Source&lt;/a&gt;
         */
        public Builder source(Optional<String> source) {
            Utils.checkNotNull(source, "source");
            this.source = source;
            return this;
        }

        public Builder text(String text) {
            Utils.checkNotNull(text, "text");
            this.text = Optional.ofNullable(text);
            return this;
        }

        public Builder text(Optional<String> text) {
            Utils.checkNotNull(text, "text");
            this.text = text;
            return this;
        }

        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public AddressValidationResultsMessage build() {
            return new AddressValidationResultsMessage(
                code,
                source,
                text,
                type);
        }
    }
}
