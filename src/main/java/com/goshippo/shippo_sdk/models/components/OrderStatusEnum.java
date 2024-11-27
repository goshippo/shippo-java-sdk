/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * OrderStatusEnum - Current state of the order. See the &lt;a href="https://docs.goshippo.com/docs/orders/orders/"&gt;orders tutorial&lt;/a&gt; 
 * for the logic of how the status is handled.
 */
public enum OrderStatusEnum {
    UNKNOWN("UNKNOWN"),
    AWAITPAY("AWAITPAY"),
    PAID("PAID"),
    REFUNDED("REFUNDED"),
    CANCELLED("CANCELLED"),
    PARTIALLY_FULFILLED("PARTIALLY_FULFILLED"),
    SHIPPED("SHIPPED");

    @JsonValue
    private final String value;

    private OrderStatusEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}