/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ServiceLevelEvriUKEnum - |Token | Service name|
 * |:---|:---|
 * | hermes_uk_courier_service | Courier Collection|
 * | hermes_uk_parcelshop_dropoff | ParcelShop Drop-Off|
 * | hermes_uk_parcelshop_dropoff_nextday | ParcelShop Drop-Off Next Day|
 * | hermes_uk_postable | Postable|
 * | hermes_uk_postable_nextday | Postable Next Day|
 * 
 */
public enum ServiceLevelEvriUKEnum {
    HERMES_UK_COURIER_SERVICE("hermes_uk_courier_service"),
    HERMES_UK_PARCELSHOP_DROPOFF("hermes_uk_parcelshop_dropoff"),
    HERMES_UK_PARCELSHOP_DROPOFF_NEXTDAY("hermes_uk_parcelshop_dropoff_nextday"),
    HERMES_UK_POSTABLE("hermes_uk_postable"),
    HERMES_UK_POSTABLE_NEXTDAY("hermes_uk_postable_nextday");

    @JsonValue
    private final String value;

    private ServiceLevelEvriUKEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
