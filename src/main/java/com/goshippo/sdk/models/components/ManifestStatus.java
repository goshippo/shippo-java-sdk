/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * ManifestStatus - Indicates the status of the manifest.
 */
public enum ManifestStatus {
    QUEUED("QUEUED"),
    SUCCESS("SUCCESS"),
    ERROR("ERROR");

    @JsonValue
    private final String value;

    private ManifestStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}