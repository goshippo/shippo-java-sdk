/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * Type - Party to be billed. (Leave blank for DHL Germany.)
 */
public enum Type {
    SENDER("SENDER"),
    RECIPIENT("RECIPIENT"),
    THIRD_PARTY("THIRD_PARTY"),
    THIRD_PARTY_CONSIGNEE("THIRD_PARTY_CONSIGNEE"),
    COLLECT("COLLECT");

    @JsonValue
    private final String value;

    private Type(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
