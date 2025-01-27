/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * SignatureConfirmation - Request standard or adult signature confirmation. You can alternatively request Certified Mail (USPS only) 
 * or Indirect signature (FedEx only) or Carrier Confirmation (Deutsche Post only).
 */
public enum SignatureConfirmation {
    STANDARD("STANDARD"),
    ADULT("ADULT"),
    CERTIFIED("CERTIFIED"),
    INDIRECT("INDIRECT"),
    CARRIER_CONFIRMATION("CARRIER_CONFIRMATION");

    @JsonValue
    private final String value;

    private SignatureConfirmation(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<SignatureConfirmation> fromValue(String value) {
        for (SignatureConfirmation o: SignatureConfirmation.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
