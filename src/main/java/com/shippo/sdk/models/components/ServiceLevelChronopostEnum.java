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
 * ServiceLevelChronopostEnum - |Token | Service name|
 * |:---|:---|
 * | chronopost_13 | Chrono 13|
 * | chronopost_10 | Chrono 10|
 * | chronopost_18| Chrono 18|
 * | chronopost_relais_fr | Chrono Point Relais|
 * | chronopost_classic | Chrono Classic International|
 * | chronopost_express | Chrono Express International|
 * 
 */
public enum ServiceLevelChronopostEnum {
    CHRONOPOST13("chronopost_13"),
    CHRONOPOST10("chronopost_10"),
    CHRONOPOST18("chronopost_18"),
    CHRONOPOST_RELAIS_FR("chronopost_relais_fr"),
    CHRONOPOST_CLASSIC("chronopost_classic"),
    CHRONOPOST_EXPRESS("chronopost_express");

    @JsonValue
    private final String value;

    private ServiceLevelChronopostEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
