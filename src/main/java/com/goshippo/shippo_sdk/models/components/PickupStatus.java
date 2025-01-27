/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * PickupStatus - Indicates the status of the pickup.
 */
public enum PickupStatus {
    PENDING("PENDING"),
    CONFIRMED("CONFIRMED"),
    ERROR("ERROR"),
    CANCELLED("CANCELLED");

    @JsonValue
    private final String value;

    private PickupStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PickupStatus> fromValue(String value) {
        for (PickupStatus o: PickupStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
