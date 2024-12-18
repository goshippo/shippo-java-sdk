/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * Status - `INVALID` batch shipments cannot be purchased and will have to be removed, fixed, and added to the batch again.&lt;br&gt;
 * `VALID` batch shipments can be purchased. &lt;br&gt;
 * Batch shipments with the status `TRANSACTION_FAILED` were not able to be purchased and the error will be displayed on the message field&lt;br&gt; 
 * `INCOMPLETE` batch shipments have an issue with the Address and will need to be removed, fixed, and added to the batch again.
 */
public enum Status {
    INVALID("INVALID"),
    VALID("VALID"),
    INCOMPLETE("INCOMPLETE"),
    TRANSACTION_FAILED("TRANSACTION_FAILED");

    @JsonValue
    private final String value;

    private Status(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
