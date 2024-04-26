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

public enum LabelFileType {
    PNG("PNG"),
    PNG23X75("PNG_2.3x7.5"),
    PDF("PDF"),
    PDF23X75("PDF_2.3x7.5"),
    PDF4X6("PDF_4x6"),
    PDF4X8("PDF_4x8"),
    PDF_A4("PDF_A4"),
    PDF_A6("PDF_A6"),
    ZPLII("ZPLII");

    @JsonValue
    private final String value;

    private LabelFileType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
