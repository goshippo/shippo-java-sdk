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
 * ServiceGroupTypeEnum - The type of the service group.&lt;br&gt; `LIVE_RATE` - Shippo will make a rating request and return real-time rates for the shipping group, only falling back to the specified flat rate amount if no rates match a service level in the service group.&lt;br&gt; `FLAT_RATE` - Returns a shipping option with the specified flat rate amount.&lt;br&gt; `FREE_SHIPPING` - Returns a shipping option with a price of $0 only if the total cost of items exceeds the amount defined by `free_shipping_threshold_min`
 */
public enum ServiceGroupTypeEnum {
    LIVE_RATE("LIVE_RATE"),
    FLAT_RATE("FLAT_RATE"),
    FREE_SHIPPING("FREE_SHIPPING");

    @JsonValue
    private final String value;

    private ServiceGroupTypeEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
