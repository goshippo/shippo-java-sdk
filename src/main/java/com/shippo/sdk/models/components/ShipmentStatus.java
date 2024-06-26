/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * ShipmentStatus - `Waiting` shipments have been successfully submitted but not yet been processed. 
 * `Queued` shipments are currently being processed. 
 * `Success` shipments have been processed successfully, meaning that rate generation has concluded. 
 * `Error` does not occur currently and is reserved for future use.
 */
public enum ShipmentStatus {
    ERROR("ERROR"),
    QUEUED("QUEUED"),
    SUCCESS("SUCCESS"),
    STATUS("STATUS");

    @JsonValue
    private final String value;

    private ShipmentStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
