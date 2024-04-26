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
 * ServiceLevelLSOEnum - |Token | Service name|
 * |:---|:---|
 * | lso_ground | Ground|
 * | lso_economy_next_day | Economy Next Day|
 * | lso_saturday_delivery | Saturday Delivery|
 * | lso_2nd_day | 2nd Day|
 * | lso_priority_next_day | Priority Next Day|
 * | lso_early_overnight | Early Overnight|
 * 
 */
public enum ServiceLevelLSOEnum {
    LSO_GROUND("lso_ground"),
    LSO_ECONOMY_NEXT_DAY("lso_economy_next_day"),
    LSO_SATURDAY_DELIVERY("lso_saturday_delivery"),
    LSO2ND_DAY("lso_2nd_day"),
    LSO_PRIORITY_NEXT_DAY("lso_priority_next_day"),
    LSO_EARLY_OVERNIGHT("lso_early_overnight");

    @JsonValue
    private final String value;

    private ServiceLevelLSOEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
