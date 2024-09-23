/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ServiceLevelSwyftEnum - |Token | Service name|
 * |:---|:---|
 * | same_day | Next Day|
 * | next_day | Next Day|
 * 
 */
public enum ServiceLevelSwyftEnum {
    SAME_DAY("same_day"),
    NEXT_DAY("next_day");

    @JsonValue
    private final String value;

    private ServiceLevelSwyftEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
