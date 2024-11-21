/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ServiceLevelAramexAustraliaEnum - |Token | Service name|
 * |:---|:---|
 * | fastway_australia_parcel | Parcel|
 * | fastway_australia_satchel | Satchel|
 * | fastway_australia_box_small | Box Small|
 * | fastway_australia_box_medium | Box Medium|
 * | fastway_australia_box_large | Box Large|
 * 
 */
public enum ServiceLevelAramexAustraliaEnum {
    FASTWAY_AUSTRALIA_PARCEL("fastway_australia_parcel"),
    FASTWAY_AUSTRALIA_SATCHEL("fastway_australia_satchel"),
    FASTWAY_AUSTRALIA_BOX_SMALL("fastway_australia_box_small"),
    FASTWAY_AUSTRALIA_BOX_MEDIUM("fastway_australia_box_medium"),
    FASTWAY_AUSTRALIA_BOX_LARGE("fastway_australia_box_large");

    @JsonValue
    private final String value;

    private ServiceLevelAramexAustraliaEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}