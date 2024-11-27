/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * CarrierAccountWithExtraInfoType - Authentication method used by this account.
 */
public enum CarrierAccountWithExtraInfoType {
    DEFAULT("default"),
    OAUTH("oauth");

    @JsonValue
    private final String value;

    private CarrierAccountWithExtraInfoType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}