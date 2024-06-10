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
 * ParcelTemplateCouriersPleaseEnum - |Token | Name | Dimensions|
 * |:---|:---|:---|
 * | couriersplease_500g_satchel | 500g Satchel | 22.00 x 33.50 x 0.10 cm|
 * | couriersplease_1kg_satchel | 1kg Satchel | 28.00 x 35.00 x 0.10 cm|
 * | couriersplease_3kg_satchel | 3kg Satchel | 34.00 x 42.00 x 0.10 cm|
 * | couriersplease_5kg_satchel | 5kg Satchel | 43.70 x 59.70 x 0.10 cm|
 * 
 */
public enum ParcelTemplateCouriersPleaseEnum {
    COURIERSPLEASE500G_SATCHEL("couriersplease_500g_satchel"),
    COURIERSPLEASE1KG_SATCHEL("couriersplease_1kg_satchel"),
    COURIERSPLEASE3KG_SATCHEL("couriersplease_3kg_satchel"),
    COURIERSPLEASE5KG_SATCHEL("couriersplease_5kg_satchel");

    @JsonValue
    private final String value;

    private ParcelTemplateCouriersPleaseEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}