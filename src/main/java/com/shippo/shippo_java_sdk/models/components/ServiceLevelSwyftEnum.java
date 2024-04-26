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
