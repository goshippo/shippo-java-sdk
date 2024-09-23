/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ServiceLevelParcelforceEnum - |Token | Service name|
 * |:---|:---|
 * | parcelforce_express48 | Express 48|
 * | parcelforce_express24 | Express 24|
 * | parcelforce_expressam | Express AM|
 * 
 */
public enum ServiceLevelParcelforceEnum {
    PARCELFORCE_EXPRESS48("parcelforce_express48"),
    PARCELFORCE_EXPRESS24("parcelforce_express24"),
    PARCELFORCE_EXPRESSAM("parcelforce_expressam");

    @JsonValue
    private final String value;

    private ServiceLevelParcelforceEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
