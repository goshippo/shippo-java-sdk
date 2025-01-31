/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * PaymentMethod - Secured funds include money orders, certified cheques and others (see 
 * &lt;a href="https://www.ups.com/content/us/en/shipping/time/service/value_added/cod.html"&gt;UPS&lt;/a&gt; for details). 
 * If no payment_method inputted the value defaults to "ANY".)
 */
public enum PaymentMethod {
    SECURED_FUNDS("SECURED_FUNDS"),
    CASH("CASH"),
    ANY("ANY");

    @JsonValue
    private final String value;

    private PaymentMethod(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
