/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * Include - filter by user or enabled
 */
public enum Include {
    ALL("all"),
    USER("user"),
    ENABLED("enabled");

    @JsonValue
    private final String value;

    private Include(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Include> fromValue(String value) {
        for (Include o: Include.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
