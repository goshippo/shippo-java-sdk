/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * Provider - To have insurance cover provided by a carrier directly instead of Shippo's provider (XCover), set `provider` to `FEDEX`, `UPS`, or `ONTRAC`.
 */
public enum Provider {
    FEDEX("FEDEX"),
    UPS("UPS"),
    ONTRAC("ONTRAC");

    @JsonValue
    private final String value;

    private Provider(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Provider> fromValue(String value) {
        for (Provider o: Provider.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
