/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ServiceLevelOnTracEnum - |Token | Service name|
 * |:---|:---|
 * | ontrac_ground | Ground|
 * | ontrac_sunrise_gold | Sunrise Gold|
 * | ontrac_sunrise | Sunrise|
 * 
 */
public enum ServiceLevelOnTracEnum {
    ONTRAC_GROUND("ontrac_ground"),
    ONTRAC_SUNRISE_GOLD("ontrac_sunrise_gold"),
    ONTRAC_SUNRISE("ontrac_sunrise");

    @JsonValue
    private final String value;

    private ServiceLevelOnTracEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}