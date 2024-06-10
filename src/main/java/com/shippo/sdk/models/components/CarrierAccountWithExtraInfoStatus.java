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
 * CarrierAccountWithExtraInfoStatus - Current authentication status. Possible values: 'disconnected' (authorization lost, reconnect needed), 'connected' (authorized and active), 'authorization_pending' (awaiting initial authorization flow).
 */
public enum CarrierAccountWithExtraInfoStatus {
    DISCONNECTED("disconnected"),
    CONNECTED("connected"),
    AUTHORIZATION_PENDING("authorization_pending");

    @JsonValue
    private final String value;

    private CarrierAccountWithExtraInfoStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}