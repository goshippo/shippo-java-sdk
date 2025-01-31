/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * BuildingType - The type of building where the pickup is located.
 */
public enum BuildingType {
    APARTMENT("apartment"),
    BUILDING("building"),
    DEPARTMENT("department"),
    FLOOR("floor"),
    ROOM("room"),
    SUITE("suite");

    @JsonValue
    private final String value;

    private BuildingType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
