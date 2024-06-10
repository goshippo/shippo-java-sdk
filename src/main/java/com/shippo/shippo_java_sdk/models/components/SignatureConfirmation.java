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
 * SignatureConfirmation - Request standard or adult signature confirmation. You can alternatively request Certified Mail (USPS only) 
 * or Indirect signature (FedEx only) or Carrier Confirmation (Deutsche Post only).
 */
public enum SignatureConfirmation {
    STANDARD("STANDARD"),
    ADULT("ADULT"),
    CERTIFIED("CERTIFIED"),
    INDIRECT("INDIRECT"),
    CARRIER_CONFIRMATION("CARRIER_CONFIRMATION");

    @JsonValue
    private final String value;

    private SignatureConfirmation(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}