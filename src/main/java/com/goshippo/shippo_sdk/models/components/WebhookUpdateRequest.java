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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class WebhookUpdateRequest {

    /**
     * Type of event that triggered the webhook.
     */
    @JsonProperty("event")
    private WebhookEventTypeEnum event;

    /**
     * URL webhook events are sent to.
     */
    @JsonProperty("url")
    private String url;

    /**
     * Determines whether the webhook is active or not.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("active")
    private Optional<Boolean> active;

    /**
     * Determines whether the webhook is a test webhook or not.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("is_test")
    private Optional<Boolean> isTest;

    @JsonCreator
    public WebhookUpdateRequest(
            @JsonProperty("event") WebhookEventTypeEnum event,
            @JsonProperty("url") String url,
            @JsonProperty("active") Optional<Boolean> active,
            @JsonProperty("is_test") Optional<Boolean> isTest) {
        Utils.checkNotNull(event, "event");
        Utils.checkNotNull(url, "url");
        Utils.checkNotNull(active, "active");
        Utils.checkNotNull(isTest, "isTest");
        this.event = event;
        this.url = url;
        this.active = active;
        this.isTest = isTest;
    }
    
    public WebhookUpdateRequest(
            WebhookEventTypeEnum event,
            String url) {
        this(event, url, Optional.empty(), Optional.empty());
    }

    /**
     * Type of event that triggered the webhook.
     */
    @JsonIgnore
    public WebhookEventTypeEnum event() {
        return event;
    }

    /**
     * URL webhook events are sent to.
     */
    @JsonIgnore
    public String url() {
        return url;
    }

    /**
     * Determines whether the webhook is active or not.
     */
    @JsonIgnore
    public Optional<Boolean> active() {
        return active;
    }

    /**
     * Determines whether the webhook is a test webhook or not.
     */
    @JsonIgnore
    public Optional<Boolean> isTest() {
        return isTest;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Type of event that triggered the webhook.
     */
    public WebhookUpdateRequest withEvent(WebhookEventTypeEnum event) {
        Utils.checkNotNull(event, "event");
        this.event = event;
        return this;
    }

    /**
     * URL webhook events are sent to.
     */
    public WebhookUpdateRequest withUrl(String url) {
        Utils.checkNotNull(url, "url");
        this.url = url;
        return this;
    }

    /**
     * Determines whether the webhook is active or not.
     */
    public WebhookUpdateRequest withActive(boolean active) {
        Utils.checkNotNull(active, "active");
        this.active = Optional.ofNullable(active);
        return this;
    }

    /**
     * Determines whether the webhook is active or not.
     */
    public WebhookUpdateRequest withActive(Optional<Boolean> active) {
        Utils.checkNotNull(active, "active");
        this.active = active;
        return this;
    }

    /**
     * Determines whether the webhook is a test webhook or not.
     */
    public WebhookUpdateRequest withIsTest(boolean isTest) {
        Utils.checkNotNull(isTest, "isTest");
        this.isTest = Optional.ofNullable(isTest);
        return this;
    }

    /**
     * Determines whether the webhook is a test webhook or not.
     */
    public WebhookUpdateRequest withIsTest(Optional<Boolean> isTest) {
        Utils.checkNotNull(isTest, "isTest");
        this.isTest = isTest;
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
        WebhookUpdateRequest other = (WebhookUpdateRequest) o;
        return 
            Objects.deepEquals(this.event, other.event) &&
            Objects.deepEquals(this.url, other.url) &&
            Objects.deepEquals(this.active, other.active) &&
            Objects.deepEquals(this.isTest, other.isTest);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            event,
            url,
            active,
            isTest);
    }
    
    @Override
    public String toString() {
        return Utils.toString(WebhookUpdateRequest.class,
                "event", event,
                "url", url,
                "active", active,
                "isTest", isTest);
    }
    
    public final static class Builder {
 
        private WebhookEventTypeEnum event;
 
        private String url;
 
        private Optional<Boolean> active = Optional.empty();
 
        private Optional<Boolean> isTest = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Type of event that triggered the webhook.
         */
        public Builder event(WebhookEventTypeEnum event) {
            Utils.checkNotNull(event, "event");
            this.event = event;
            return this;
        }

        /**
         * URL webhook events are sent to.
         */
        public Builder url(String url) {
            Utils.checkNotNull(url, "url");
            this.url = url;
            return this;
        }

        /**
         * Determines whether the webhook is active or not.
         */
        public Builder active(boolean active) {
            Utils.checkNotNull(active, "active");
            this.active = Optional.ofNullable(active);
            return this;
        }

        /**
         * Determines whether the webhook is active or not.
         */
        public Builder active(Optional<Boolean> active) {
            Utils.checkNotNull(active, "active");
            this.active = active;
            return this;
        }

        /**
         * Determines whether the webhook is a test webhook or not.
         */
        public Builder isTest(boolean isTest) {
            Utils.checkNotNull(isTest, "isTest");
            this.isTest = Optional.ofNullable(isTest);
            return this;
        }

        /**
         * Determines whether the webhook is a test webhook or not.
         */
        public Builder isTest(Optional<Boolean> isTest) {
            Utils.checkNotNull(isTest, "isTest");
            this.isTest = isTest;
            return this;
        }
        
        public WebhookUpdateRequest build() {
            return new WebhookUpdateRequest(
                event,
                url,
                active,
                isTest);
        }
    }
}

