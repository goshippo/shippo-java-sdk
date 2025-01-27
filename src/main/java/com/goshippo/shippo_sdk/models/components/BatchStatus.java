/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * BatchStatus - Batches that are `VALIDATING` are being created and validated&lt;br&gt;
 * `VALID` batches can be purchased&lt;br&gt;
 * `INVALID` batches cannot be purchased, `INVALID` BatchShipments must be removed&lt;br&gt;
 * Batches that are in the `PURCHASING` state are being purchased&lt;br&gt;
 * `PURCHASED` batches are finished purchasing.
 */
public enum BatchStatus {
    VALIDATING("VALIDATING"),
    VALID("VALID"),
    INVALID("INVALID"),
    PURCHASING("PURCHASING"),
    PURCHASED("PURCHASED");

    @JsonValue
    private final String value;

    private BatchStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<BatchStatus> fromValue(String value) {
        for (BatchStatus o: BatchStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
