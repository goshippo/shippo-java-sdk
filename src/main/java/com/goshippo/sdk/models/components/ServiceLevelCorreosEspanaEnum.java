/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

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