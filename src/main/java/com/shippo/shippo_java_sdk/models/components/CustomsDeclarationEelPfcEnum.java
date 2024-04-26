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
 * CustomsDeclarationEelPfcEnum - EEL / PFC type of the shipment. For most shipments from the US to CA, `NOEEI_30_36` is applicable; for most 
 * other shipments from the US, `NOEEI_30_37_a` is applicable.
 */
public enum CustomsDeclarationEelPfcEnum {
    NOEEI3037_A("NOEEI_30_37_a"),
    NOEEI3037_H("NOEEI_30_37_h"),
    NOEEI3037_F("NOEEI_30_37_f"),
    NOEEI3036("NOEEI_30_36"),
    AES_ITN("AES_ITN");

    @JsonValue
    private final String value;

    private CustomsDeclarationEelPfcEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
