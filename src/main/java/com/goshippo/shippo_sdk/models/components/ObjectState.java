/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * ObjectState - A Parcel will only be valid when all required values have been sent and validated successfully.
 */
public enum ObjectState {
    VALID("VALID");

    @JsonValue
    private final String value;

    private ObjectState(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ObjectState> fromValue(String value) {
        for (ObjectState o: ObjectState.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
