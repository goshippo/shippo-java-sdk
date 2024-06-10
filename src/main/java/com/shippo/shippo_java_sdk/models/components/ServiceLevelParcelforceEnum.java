/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.shippo_java_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.shippo_java_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

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