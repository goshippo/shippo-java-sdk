/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum ShipmentExtraReturnServiceTypeLasershipEnum {
    NO_RETURN("NO_RETURN");

    @JsonValue
    private final String value;

    private ShipmentExtraReturnServiceTypeLasershipEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}