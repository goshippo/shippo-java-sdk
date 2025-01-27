/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * ServiceLevelDPDUKEnum - |Token | Service name|
 * |:---|:---|
 * | dpd_uk_ship_to_shop | Ship to shop|
 * | dpd_uk_1030 | Door to door 10.30 next day|
 * | dpd_uk_1200 | Door to door 12.00 next day|
 * | dpd_uk_saturday | Saturday Delivery|
 * | dpd_uk_saturday_1030 | Saturday Delivery 10.30|
 * | dpd_uk_saturday_1200 | Saturday Delivery 12.00|
 * | dpd_uk_sunday | Sunday Delivery|
 * | dpd_uk_sunday_1030 | Sunday Delivery 10.30|
 * | dpd_uk_sunday_1200 | Sunday Delivery 12.00|
 * | dpd_uk_next_day | Next day|
 * | dpd_uk_two_day | Two day|
 * | dpd_uk_classic | DPD Classic|
 * | dpd_uk_air_classic | DPD Air Classic|
 * | dpd_uk_air_express | DPD Air Express|
 * | dpd_uk_direct | DPD Direct|
 * | dpd_uk_direct_tracked_mail| DPD Tracked Mail|
 * | dpd_uk_pickup_returns | Pickup Returns|
 * 
 */
public enum ServiceLevelDPDUKEnum {
    DPD_UK_SHIP_TO_SHOP("dpd_uk_ship_to_shop"),
    DPD_UK1030("dpd_uk_1030"),
    DPD_UK1200("dpd_uk_1200"),
    DPD_UK_SATURDAY("dpd_uk_saturday"),
    DPD_UK_SATURDAY1030("dpd_uk_saturday_1030"),
    DPD_UK_SATURDAY1200("dpd_uk_saturday_1200"),
    DPD_UK_SUNDAY("dpd_uk_sunday"),
    DPD_UK_SUNDAY1030("dpd_uk_sunday_1030"),
    DPD_UK_SUNDAY1200("dpd_uk_sunday_1200"),
    DPD_UK_NEXT_DAY("dpd_uk_next_day"),
    DPD_UK_TWO_DAY("dpd_uk_two_day"),
    DPD_UK_CLASSIC("dpd_uk_classic"),
    DPD_UK_AIR_CLASSIC("dpd_uk_air_classic"),
    DPD_UK_AIR_EXPRESS("dpd_uk_air_express"),
    DPD_UK_DIRECT("dpd_uk_direct"),
    DPD_UK_DIRECT_TRACKED_MAIL("dpd_uk_direct_tracked_mail"),
    DPD_UK_PICKUP_RETURNS("dpd_uk_pickup_returns");

    @JsonValue
    private final String value;

    private ServiceLevelDPDUKEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ServiceLevelDPDUKEnum> fromValue(String value) {
        for (ServiceLevelDPDUKEnum o: ServiceLevelDPDUKEnum.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
