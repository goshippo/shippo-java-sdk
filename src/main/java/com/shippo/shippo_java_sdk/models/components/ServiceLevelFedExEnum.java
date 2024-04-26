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
 * ServiceLevelFedExEnum - |Token | Service name|
 * |:---|:---|
 * | fedex_ground | FedEx Ground®|
 * | fedex_home_delivery | FedEx Home Delivery®|
 * | fedex_ground_economy | FedEx Ground® Economy|
 * | fedex_2_day | FedEx 2Day®|
 * | fedex_2_day_am | FedEx 2Day® A.M.|
 * | fedex_express_saver | FedEx Express Saver®|
 * | fedex_standard_overnight | FedEx Standard Overnight®|
 * | fedex_priority_overnight | FedEx Priority Overnight®|
 * | fedex_first_overnight | FedEx First Overnight®|
 * | fedex_freight_priority | FedEx Freight® Priority|
 * | fedex_next_day_freight | FedEx Next Day Freight|
 * | fedex_freight_economy | FedEx Freight® Economy|
 * | fedex_first_freight | FedEx First Freight|
 * | fedex_international_economy | FedEx International Economy®|
 * | fedex_international_priority | FedEx International Priority®|
 * | fedex_international_first | FedEx International First®|
 * | fedex_europe_first_international_priority | FedEx International First®|
 * | fedex_international_connect_plus | FedEx International Connect Plus|
 * | international_economy_freight | FedEx International Economy® Freight|
 * | international_priority_freight | FedEx International Priority® Freight|
 * 
 */
public enum ServiceLevelFedExEnum {
    FEDEX_GROUND("fedex_ground"),
    FEDEX_HOME_DELIVERY("fedex_home_delivery"),
    FEDEX_SMART_POST("fedex_smart_post"),
    FEDEX_GROUND_ECONOMY("fedex_ground_economy"),
    FEDEX2_DAY("fedex_2_day"),
    FEDEX2_DAY_AM("fedex_2_day_am"),
    FEDEX_EXPRESS_SAVER("fedex_express_saver"),
    FEDEX_STANDARD_OVERNIGHT("fedex_standard_overnight"),
    FEDEX_PRIORITY_OVERNIGHT("fedex_priority_overnight"),
    FEDEX_FIRST_OVERNIGHT("fedex_first_overnight"),
    FEDEX_FREIGHT_PRIORITY("fedex_freight_priority"),
    FEDEX_NEXT_DAY_FREIGHT("fedex_next_day_freight"),
    FEDEX_FREIGHT_ECONOMY("fedex_freight_economy"),
    FEDEX_FIRST_FREIGHT("fedex_first_freight"),
    FEDEX_INTERNATIONAL_ECONOMY("fedex_international_economy"),
    FEDEX_INTERNATIONAL_PRIORITY("fedex_international_priority"),
    FEDEX_INTERNATIONAL_FIRST("fedex_international_first"),
    FEDEX_EUROPE_FIRST_INTERNATIONAL_PRIORITY("fedex_europe_first_international_priority"),
    FEDEX_INTERNATIONAL_CONNECT_PLUS("fedex_international_connect_plus"),
    INTERNATIONAL_ECONOMY_FREIGHT("international_economy_freight"),
    INTERNATIONAL_PRIORITY_FREIGHT("international_priority_freight");

    @JsonValue
    private final String value;

    private ServiceLevelFedExEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
