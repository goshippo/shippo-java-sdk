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
 * ServiceLevelMaergoEnum - |Token | Service name|
 * |:---|:---|
 * | x_delivery_expedited | Expedited|
 * 
 */
public enum ServiceLevelMaergoEnum {
    X_DELIVERY_EXPEDITED("x_delivery_expedited");

    @JsonValue
    private final String value;

    private ServiceLevelMaergoEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
