/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * TrackingStatusEnum - Indicates the high level status of the shipment.
 */
public enum TrackingStatusEnum {
    UNKNOWN("UNKNOWN"),
    PRE_TRANSIT("PRE_TRANSIT"),
    TRANSIT("TRANSIT"),
    DELIVERED("DELIVERED"),
    RETURNED("RETURNED"),
    FAILURE("FAILURE");

    @JsonValue
    private final String value;

    private TrackingStatusEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}