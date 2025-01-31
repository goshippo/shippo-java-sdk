/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

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
    WAITING("WAITING");

    @JsonValue
    private final String value;

    private ShipmentStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
