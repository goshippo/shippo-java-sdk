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
 * DangerousGoodsCode - Dangerous Goods Code (DHL eCommerce only). See &lt;a href="https://api-legacy.dhlecs.com/docs/v2/appendix.html#dangerous-goods"&gt;Category Codes&lt;/a&gt;
 */
public enum DangerousGoodsCode {
    ONE("01"),
    TWO("02"),
    THREE("03"),
    FOUR("04"),
    FIVE("05"),
    SIX("06"),
    SEVEN("07"),
    EIGHT("08"),
    NINE("09");

    @JsonValue
    private final String value;

    private DangerousGoodsCode(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
