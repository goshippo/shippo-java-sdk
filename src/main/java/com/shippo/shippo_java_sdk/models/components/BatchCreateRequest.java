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


public class BatchCreateRequest {

    /**
     * ID of the Carrier Account object to use as the default for all shipments in this Batch. 
     * The carrier account can be changed on a per-shipment basis by changing the carrier_account in the 
     * corresponding BatchShipment object.
     */
    @JsonProperty("default_carrier_account")
    private String defaultCarrierAccount;

    /**
     * Token of the service level to use as the default for all shipments in this Batch. 
     * The servicelevel can be changed on a per-shipment basis by changing the servicelevel_token in the 
     * corresponding BatchShipment object. &lt;a href="#tag/Service-Levels"&gt;Servicelevel tokens can be found here.&lt;/a&gt;
     */
    @JsonProperty("default_servicelevel_token")
    private String defaultServicelevelToken;

    /**
     * Print format of the &lt;a href="https://docs.goshippo.com/docs/shipments/shippinglabelsizes/"&gt;label&lt;/a&gt;. If empty, will use the default format set from 
     * &lt;a href="https://apps.goshippo.com/settings/labels"&gt;the Shippo dashboard.&lt;/a&gt;
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("label_filetype")
    private Optional<? extends LabelFileTypeEnum> labelFiletype;

    /**
     * A string of up to 100 characters that can be filled with any additional information you want to attach to the object.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends String> metadata;

    /**
     * Array of BatchShipment objects. The response keeps the same order as in the request array.
     */
    @JsonProperty("batch_shipments")
    private java.util.List<BatchShipmentBase> batchShipments;

    @JsonCreator
    public BatchCreateRequest(
            @JsonProperty("default_carrier_account") String defaultCarrierAccount,
            @JsonProperty("default_servicelevel_token") String defaultServicelevelToken,
            @JsonProperty("label_filetype") Optional<? extends LabelFileTypeEnum> labelFiletype,
            @JsonProperty("metadata") Optional<? extends String> metadata,
            @JsonProperty("batch_shipments") java.util.List<BatchShipmentBase> batchShipments) {
        Utils.checkNotNull(defaultCarrierAccount, "defaultCarrierAccount");
        Utils.checkNotNull(defaultServicelevelToken, "defaultServicelevelToken");
        Utils.checkNotNull(labelFiletype, "labelFiletype");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(batchShipments, "batchShipments");
        this.defaultCarrierAccount = defaultCarrierAccount;
        this.defaultServicelevelToken = defaultServicelevelToken;
        this.labelFiletype = labelFiletype;
        this.metadata = metadata;
        this.batchShipments = batchShipments;
    }
    
    public BatchCreateRequest(
            String defaultCarrierAccount,
            String defaultServicelevelToken,
            java.util.List<BatchShipmentBase> batchShipments) {
        this(defaultCarrierAccount, defaultServicelevelToken, Optional.empty(), Optional.empty(), batchShipments);
    }

    /**
     * ID of the Carrier Account object to use as the default for all shipments in this Batch. 
     * The carrier account can be changed on a per-shipment basis by changing the carrier_account in the 
     * corresponding BatchShipment object.
     */
    @JsonIgnore
    public String defaultCarrierAccount() {
        return defaultCarrierAccount;
    }

    /**
     * Token of the service level to use as the default for all shipments in this Batch. 
     * The servicelevel can be changed on a per-shipment basis by changing the servicelevel_token in the 
     * corresponding BatchShipment object. &lt;a href="#tag/Service-Levels"&gt;Servicelevel tokens can be found here.&lt;/a&gt;
     */
    @JsonIgnore
    public String defaultServicelevelToken() {
        return defaultServicelevelToken;
    }

    /**
     * Print format of the &lt;a href="https://docs.goshippo.com/docs/shipments/shippinglabelsizes/"&gt;label&lt;/a&gt;. If empty, will use the default format set from 
     * &lt;a href="https://apps.goshippo.com/settings/labels"&gt;the Shippo dashboard.&lt;/a&gt;
     */
    @JsonIgnore
    public Optional<? extends LabelFileTypeEnum> labelFiletype() {
        return labelFiletype;
    }

    /**
     * A string of up to 100 characters that can be filled with any additional information you want to attach to the object.
     */
    @JsonIgnore
    public Optional<? extends String> metadata() {
        return metadata;
    }

    /**
     * Array of BatchShipment objects. The response keeps the same order as in the request array.
     */
    @JsonIgnore
    public java.util.List<BatchShipmentBase> batchShipments() {
        return batchShipments;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * ID of the Carrier Account object to use as the default for all shipments in this Batch. 
     * The carrier account can be changed on a per-shipment basis by changing the carrier_account in the 
     * corresponding BatchShipment object.
     */
    public BatchCreateRequest withDefaultCarrierAccount(String defaultCarrierAccount) {
        Utils.checkNotNull(defaultCarrierAccount, "defaultCarrierAccount");
        this.defaultCarrierAccount = defaultCarrierAccount;
        return this;
    }

    /**
     * Token of the service level to use as the default for all shipments in this Batch. 
     * The servicelevel can be changed on a per-shipment basis by changing the servicelevel_token in the 
     * corresponding BatchShipment object. &lt;a href="#tag/Service-Levels"&gt;Servicelevel tokens can be found here.&lt;/a&gt;
     */
    public BatchCreateRequest withDefaultServicelevelToken(String defaultServicelevelToken) {
        Utils.checkNotNull(defaultServicelevelToken, "defaultServicelevelToken");
        this.defaultServicelevelToken = defaultServicelevelToken;
        return this;
    }

    /**
     * Print format of the &lt;a href="https://docs.goshippo.com/docs/shipments/shippinglabelsizes/"&gt;label&lt;/a&gt;. If empty, will use the default format set from 
     * &lt;a href="https://apps.goshippo.com/settings/labels"&gt;the Shippo dashboard.&lt;/a&gt;
     */
    public BatchCreateRequest withLabelFiletype(LabelFileTypeEnum labelFiletype) {
        Utils.checkNotNull(labelFiletype, "labelFiletype");
        this.labelFiletype = Optional.ofNullable(labelFiletype);
        return this;
    }

    /**
     * Print format of the &lt;a href="https://docs.goshippo.com/docs/shipments/shippinglabelsizes/"&gt;label&lt;/a&gt;. If empty, will use the default format set from 
     * &lt;a href="https://apps.goshippo.com/settings/labels"&gt;the Shippo dashboard.&lt;/a&gt;
     */
    public BatchCreateRequest withLabelFiletype(Optional<? extends LabelFileTypeEnum> labelFiletype) {
        Utils.checkNotNull(labelFiletype, "labelFiletype");
        this.labelFiletype = labelFiletype;
        return this;
    }

    /**
     * A string of up to 100 characters that can be filled with any additional information you want to attach to the object.
     */
    public BatchCreateRequest withMetadata(String metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * A string of up to 100 characters that can be filled with any additional information you want to attach to the object.
     */
    public BatchCreateRequest withMetadata(Optional<? extends String> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    /**
     * Array of BatchShipment objects. The response keeps the same order as in the request array.
     */
    public BatchCreateRequest withBatchShipments(java.util.List<BatchShipmentBase> batchShipments) {
        Utils.checkNotNull(batchShipments, "batchShipments");
        this.batchShipments = batchShipments;
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
        BatchCreateRequest other = (BatchCreateRequest) o;
        return 
            java.util.Objects.deepEquals(this.defaultCarrierAccount, other.defaultCarrierAccount) &&
            java.util.Objects.deepEquals(this.defaultServicelevelToken, other.defaultServicelevelToken) &&
            java.util.Objects.deepEquals(this.labelFiletype, other.labelFiletype) &&
            java.util.Objects.deepEquals(this.metadata, other.metadata) &&
            java.util.Objects.deepEquals(this.batchShipments, other.batchShipments);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            defaultCarrierAccount,
            defaultServicelevelToken,
            labelFiletype,
            metadata,
            batchShipments);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BatchCreateRequest.class,
                "defaultCarrierAccount", defaultCarrierAccount,
                "defaultServicelevelToken", defaultServicelevelToken,
                "labelFiletype", labelFiletype,
                "metadata", metadata,
                "batchShipments", batchShipments);
    }
    
    public final static class Builder {
 
        private String defaultCarrierAccount;
 
        private String defaultServicelevelToken;
 
        private Optional<? extends LabelFileTypeEnum> labelFiletype = Optional.empty();
 
        private Optional<? extends String> metadata = Optional.empty();
 
        private java.util.List<BatchShipmentBase> batchShipments;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * ID of the Carrier Account object to use as the default for all shipments in this Batch. 
         * The carrier account can be changed on a per-shipment basis by changing the carrier_account in the 
         * corresponding BatchShipment object.
         */
        public Builder defaultCarrierAccount(String defaultCarrierAccount) {
            Utils.checkNotNull(defaultCarrierAccount, "defaultCarrierAccount");
            this.defaultCarrierAccount = defaultCarrierAccount;
            return this;
        }

        /**
         * Token of the service level to use as the default for all shipments in this Batch. 
         * The servicelevel can be changed on a per-shipment basis by changing the servicelevel_token in the 
         * corresponding BatchShipment object. &lt;a href="#tag/Service-Levels"&gt;Servicelevel tokens can be found here.&lt;/a&gt;
         */
        public Builder defaultServicelevelToken(String defaultServicelevelToken) {
            Utils.checkNotNull(defaultServicelevelToken, "defaultServicelevelToken");
            this.defaultServicelevelToken = defaultServicelevelToken;
            return this;
        }

        /**
         * Print format of the &lt;a href="https://docs.goshippo.com/docs/shipments/shippinglabelsizes/"&gt;label&lt;/a&gt;. If empty, will use the default format set from 
         * &lt;a href="https://apps.goshippo.com/settings/labels"&gt;the Shippo dashboard.&lt;/a&gt;
         */
        public Builder labelFiletype(LabelFileTypeEnum labelFiletype) {
            Utils.checkNotNull(labelFiletype, "labelFiletype");
            this.labelFiletype = Optional.ofNullable(labelFiletype);
            return this;
        }

        /**
         * Print format of the &lt;a href="https://docs.goshippo.com/docs/shipments/shippinglabelsizes/"&gt;label&lt;/a&gt;. If empty, will use the default format set from 
         * &lt;a href="https://apps.goshippo.com/settings/labels"&gt;the Shippo dashboard.&lt;/a&gt;
         */
        public Builder labelFiletype(Optional<? extends LabelFileTypeEnum> labelFiletype) {
            Utils.checkNotNull(labelFiletype, "labelFiletype");
            this.labelFiletype = labelFiletype;
            return this;
        }

        /**
         * A string of up to 100 characters that can be filled with any additional information you want to attach to the object.
         */
        public Builder metadata(String metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        /**
         * A string of up to 100 characters that can be filled with any additional information you want to attach to the object.
         */
        public Builder metadata(Optional<? extends String> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        /**
         * Array of BatchShipment objects. The response keeps the same order as in the request array.
         */
        public Builder batchShipments(java.util.List<BatchShipmentBase> batchShipments) {
            Utils.checkNotNull(batchShipments, "batchShipments");
            this.batchShipments = batchShipments;
            return this;
        }
        
        public BatchCreateRequest build() {
            return new BatchCreateRequest(
                defaultCarrierAccount,
                defaultServicelevelToken,
                labelFiletype,
                metadata,
                batchShipments);
        }
    }
}

