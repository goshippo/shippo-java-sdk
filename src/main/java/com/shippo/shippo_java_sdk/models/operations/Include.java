/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.shippo_java_sdk.models.operations;

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
 * Include - filter by user or enabled
 */
public enum Include {
    ALL("all"),
    USER("user"),
    ENABLED("enabled");

    @JsonValue
    private final String value;

    private Include(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
