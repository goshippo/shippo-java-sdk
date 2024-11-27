/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.goshippo.shippo_sdk.utils.SpeakeasyMetadata;
import com.goshippo.shippo_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class DeleteWebhookRequest {

    /**
     * Object ID of the webhook to delete
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=webhookId")
    private String webhookId;

    @JsonCreator
    public DeleteWebhookRequest(
            String webhookId) {
        Utils.checkNotNull(webhookId, "webhookId");
        this.webhookId = webhookId;
    }

    /**
     * Object ID of the webhook to delete
     */
    @JsonIgnore
    public String webhookId() {
        return webhookId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Object ID of the webhook to delete
     */
    public DeleteWebhookRequest withWebhookId(String webhookId) {
        Utils.checkNotNull(webhookId, "webhookId");
        this.webhookId = webhookId;
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
        DeleteWebhookRequest other = (DeleteWebhookRequest) o;
        return 
            Objects.deepEquals(this.webhookId, other.webhookId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            webhookId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteWebhookRequest.class,
                "webhookId", webhookId);
    }
    
    public final static class Builder {
 
        private String webhookId;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Object ID of the webhook to delete
         */
        public Builder webhookId(String webhookId) {
            Utils.checkNotNull(webhookId, "webhookId");
            this.webhookId = webhookId;
            return this;
        }
        
        public DeleteWebhookRequest build() {
            return new DeleteWebhookRequest(
                webhookId);
        }
    }
}
