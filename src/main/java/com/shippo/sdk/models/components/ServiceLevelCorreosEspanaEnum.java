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
 * ServiceLevelCorreosEspanaEnum - |Token | Service name|
 * |:---|:---|
 * | correos_standard_home| Paquete Estándar|
 * | correos_premium_home | Paquete Premium|
 * 
 */
public enum ServiceLevelCorreosEspanaEnum {
    CORREOS_STANDARD_HOME("correos_standard_home"),
    CORREOS_PREMIUM_HOME("correos_premium_home");

    @JsonValue
    private final String value;

    private ServiceLevelCorreosEspanaEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
