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
 * ServiceLevelePostGlobalEnum - |Token | Service name|
 * |:---|:---|
 * | rr_donnelley_domestic_economy_parcel | Domestic Economy Parcel|
 * | rr_donnelley_domestic_priority_parcel | Domestic Priority Parcel |
 * | rr_donnelley_domestic_parcel_bpm | Domestic Parcel BPM|
 * | rr_donnelley_priority_domestic_priority_parcel_bpm | Domestic Priority Parcel BPM|
 * | rr_donnelley_priority_parcel_delcon | International Priority Parcel DelCon|
 * | rr_donnelley_priority_parcel_nondelcon | International Priority Parcel NonDelcon|
 * | rr_donnelley_economy_parcel | Economy Parcel Service |
 * | rr_donnelley_ipa | International Priority Airmail (IPA)|
 * | rr_donnelley_courier | International Courier|
 * | rr_donnelley_isal | International Surface Air Lift (ISAL)|
 * | rr_donnelley_epacket | e-Packet|
 * | rr_donnelley_pmi | Priority Mail International|
 * | rr_donnelley_emi | Express Mail International|
 * 
 */
public enum ServiceLevelePostGlobalEnum {
    RR_DONNELLEY_DOMESTIC_ECONOMY_PARCEL("rr_donnelley_domestic_economy_parcel"),
    RR_DONNELLEY_DOMESTIC_PRIORITY_PARCEL("rr_donnelley_domestic_priority_parcel"),
    RR_DONNELLEY_DOMESTIC_PARCEL_BPM("rr_donnelley_domestic_parcel_bpm"),
    RR_DONNELLEY_PRIORITY_DOMESTIC_PRIORITY_PARCEL_BPM("rr_donnelley_priority_domestic_priority_parcel_bpm"),
    RR_DONNELLEY_PRIORITY_PARCEL_DELCON("rr_donnelley_priority_parcel_delcon"),
    RR_DONNELLEY_PRIORITY_PARCEL_NONDELCON("rr_donnelley_priority_parcel_nondelcon"),
    RR_DONNELLEY_ECONOMY_PARCEL("rr_donnelley_economy_parcel"),
    RR_DONNELLEY_IPA("rr_donnelley_ipa"),
    RR_DONNELLEY_COURIER("rr_donnelley_courier"),
    RR_DONNELLEY_ISAL("rr_donnelley_isal"),
    RR_DONNELLEY_EPACKET("rr_donnelley_epacket"),
    RR_DONNELLEY_PMI("rr_donnelley_pmi"),
    RR_DONNELLEY_EMI("rr_donnelley_emi");

    @JsonValue
    private final String value;

    private ServiceLevelePostGlobalEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
