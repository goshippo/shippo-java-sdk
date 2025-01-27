/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum AddressValidationResultsMessageSourceEnum {
    SHIPPO_ADDRESS_VALIDATOR("Shippo Address Validator"),
    UPS("UPS");

    @JsonValue
    private final String value;

    private AddressValidationResultsMessageSourceEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<AddressValidationResultsMessageSourceEnum> fromValue(String value) {
        for (AddressValidationResultsMessageSourceEnum o: AddressValidationResultsMessageSourceEnum.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
