/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * Carrier - filter by specific carrier
 */
public enum Carrier {
    UPS("ups"),
    USPS("usps"),
    CANADA_POST("canada_post");

    @JsonValue
    private final String value;

    private Carrier(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Carrier> fromValue(String value) {
        for (Carrier o: Carrier.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
