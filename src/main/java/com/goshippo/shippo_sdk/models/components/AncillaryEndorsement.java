/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * AncillaryEndorsement - Specify an ancillary service endorsement to provide the USPS with instructions on how to handle undeliverable-as-addressed pieces (DHL eCommerce only).
 */
public enum AncillaryEndorsement {
    FORWARDING_SERVICE_REQUESTED("FORWARDING_SERVICE_REQUESTED"),
    RETURN_SERVICE_REQUESTED("RETURN_SERVICE_REQUESTED");

    @JsonValue
    private final String value;

    private AncillaryEndorsement(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<AncillaryEndorsement> fromValue(String value) {
        for (AncillaryEndorsement o: AncillaryEndorsement.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
