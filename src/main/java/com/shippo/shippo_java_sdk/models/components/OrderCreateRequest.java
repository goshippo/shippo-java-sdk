/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.shippo_java_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.shippo_java_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;


public class OrderCreateRequest {

    /**
     * **Required if total_price is provided**&lt;br&gt;
     * Currency of the &lt;code&gt;total_price&lt;/code&gt; and &lt;code&gt;total_tax&lt;/code&gt; amounts.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("currency")
    private Optional<? extends String> currency;

    /**
     * Custom buyer- or seller-provided notes about the order.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("notes")
    private Optional<? extends String> notes;

    /**
     * An alphanumeric identifier for the order used by the seller/buyer. This identifier doesn't need to be unique.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order_number")
    private Optional<? extends String> orderNumber;

    /**
     * Current state of the order. See the &lt;a href="https://docs.goshippo.com/docs/orders/orders/"&gt;orders tutorial&lt;/a&gt; 
     * for the logic of how the status is handled.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order_status")
    private Optional<? extends OrderStatusEnum> orderStatus;

    /**
     * Date and time when the order was placed. This datetime can be different from the datetime of the order object creation on Shippo.
     */
    @JsonProperty("placed_at")
    private String placedAt;

    /**
     * Amount paid by the buyer for shipping. This amount can be different from the price the seller will actually pay for shipping.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shipping_cost")
    private Optional<? extends String> shippingCost;

    /**
     * **Required if shipping_cost is provided**&lt;br&gt;
     * Currency of the &lt;code&gt;shipping_cost&lt;/code&gt; amount.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shipping_cost_currency")
    private Optional<? extends String> shippingCostCurrency;

    /**
     * Shipping method (carrier + service or other free text description) chosen by the buyer. 
     * This value can be different from the shipping method the seller will actually choose.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("shipping_method")
    private Optional<? extends String> shippingMethod;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subtotal_price")
    private Optional<? extends String> subtotalPrice;

    /**
     * Total amount paid by the buyer for this order.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_price")
    private Optional<? extends String> totalPrice;

    /**
     * Total tax amount paid by the buyer for this order.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total_tax")
    private Optional<? extends String> totalTax;

    /**
     * Total weight of the order.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("weight")
    private Optional<? extends String> weight;

    /**
     * The unit used for weight.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("weight_unit")
    private Optional<? extends WeightUnitEnum> weightUnit;

    /**
     * &lt;a href="#tag/Addresses"&gt;Address&lt;/a&gt; object of the sender / seller. Will be returned expanded by default..
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("from_address")
    private Optional<? extends AddressCreateRequest> fromAddress;

    /**
     * &lt;a href="#tag/Addresses"&gt;Address&lt;/a&gt; object of the recipient / buyer. Will be returned expanded by default.
     */
    @JsonProperty("to_address")
    private AddressCreateRequest toAddress;

    /**
     * Array of &lt;a href="#section/Line-Item"&gt;line item&lt;/a&gt; objects representing the items in this order. 
     * All objects will be returned expanded by default.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("line_items")
    private Optional<? extends java.util.List<LineItemBase>> lineItems;

    @JsonCreator
    public OrderCreateRequest(
            @JsonProperty("currency") Optional<? extends String> currency,
            @JsonProperty("notes") Optional<? extends String> notes,
            @JsonProperty("order_number") Optional<? extends String> orderNumber,
            @JsonProperty("order_status") Optional<? extends OrderStatusEnum> orderStatus,
            @JsonProperty("placed_at") String placedAt,
            @JsonProperty("shipping_cost") Optional<? extends String> shippingCost,
            @JsonProperty("shipping_cost_currency") Optional<? extends String> shippingCostCurrency,
            @JsonProperty("shipping_method") Optional<? extends String> shippingMethod,
            @JsonProperty("subtotal_price") Optional<? extends String> subtotalPrice,
            @JsonProperty("total_price") Optional<? extends String> totalPrice,
            @JsonProperty("total_tax") Optional<? extends String> totalTax,
            @JsonProperty("weight") Optional<? extends String> weight,
            @JsonProperty("weight_unit") Optional<? extends WeightUnitEnum> weightUnit,
            @JsonProperty("from_address") Optional<? extends AddressCreateRequest> fromAddress,
            @JsonProperty("to_address") AddressCreateRequest toAddress,
            @JsonProperty("line_items") Optional<? extends java.util.List<LineItemBase>> lineItems) {
        Utils.checkNotNull(currency, "currency");
        Utils.checkNotNull(notes, "notes");
        Utils.checkNotNull(orderNumber, "orderNumber");
        Utils.checkNotNull(orderStatus, "orderStatus");
        Utils.checkNotNull(placedAt, "placedAt");
        Utils.checkNotNull(shippingCost, "shippingCost");
        Utils.checkNotNull(shippingCostCurrency, "shippingCostCurrency");
        Utils.checkNotNull(shippingMethod, "shippingMethod");
        Utils.checkNotNull(subtotalPrice, "subtotalPrice");
        Utils.checkNotNull(totalPrice, "totalPrice");
        Utils.checkNotNull(totalTax, "totalTax");
        Utils.checkNotNull(weight, "weight");
        Utils.checkNotNull(weightUnit, "weightUnit");
        Utils.checkNotNull(fromAddress, "fromAddress");
        Utils.checkNotNull(toAddress, "toAddress");
        Utils.checkNotNull(lineItems, "lineItems");
        this.currency = currency;
        this.notes = notes;
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
        this.placedAt = placedAt;
        this.shippingCost = shippingCost;
        this.shippingCostCurrency = shippingCostCurrency;
        this.shippingMethod = shippingMethod;
        this.subtotalPrice = subtotalPrice;
        this.totalPrice = totalPrice;
        this.totalTax = totalTax;
        this.weight = weight;
        this.weightUnit = weightUnit;
        this.fromAddress = fromAddress;
        this.toAddress = toAddress;
        this.lineItems = lineItems;
    }
    
    public OrderCreateRequest(
            String placedAt,
            AddressCreateRequest toAddress) {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), placedAt, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), toAddress, Optional.empty());
    }

    /**
     * **Required if total_price is provided**&lt;br&gt;
     * Currency of the &lt;code&gt;total_price&lt;/code&gt; and &lt;code&gt;total_tax&lt;/code&gt; amounts.
     */
    @JsonIgnore
    public Optional<? extends String> currency() {
        return currency;
    }

    /**
     * Custom buyer- or seller-provided notes about the order.
     */
    @JsonIgnore
    public Optional<? extends String> notes() {
        return notes;
    }

    /**
     * An alphanumeric identifier for the order used by the seller/buyer. This identifier doesn't need to be unique.
     */
    @JsonIgnore
    public Optional<? extends String> orderNumber() {
        return orderNumber;
    }

    /**
     * Current state of the order. See the &lt;a href="https://docs.goshippo.com/docs/orders/orders/"&gt;orders tutorial&lt;/a&gt; 
     * for the logic of how the status is handled.
     */
    @JsonIgnore
    public Optional<? extends OrderStatusEnum> orderStatus() {
        return orderStatus;
    }

    /**
     * Date and time when the order was placed. This datetime can be different from the datetime of the order object creation on Shippo.
     */
    @JsonIgnore
    public String placedAt() {
        return placedAt;
    }

    /**
     * Amount paid by the buyer for shipping. This amount can be different from the price the seller will actually pay for shipping.
     */
    @JsonIgnore
    public Optional<? extends String> shippingCost() {
        return shippingCost;
    }

    /**
     * **Required if shipping_cost is provided**&lt;br&gt;
     * Currency of the &lt;code&gt;shipping_cost&lt;/code&gt; amount.
     */
    @JsonIgnore
    public Optional<? extends String> shippingCostCurrency() {
        return shippingCostCurrency;
    }

    /**
     * Shipping method (carrier + service or other free text description) chosen by the buyer. 
     * This value can be different from the shipping method the seller will actually choose.
     */
    @JsonIgnore
    public Optional<? extends String> shippingMethod() {
        return shippingMethod;
    }

    @JsonIgnore
    public Optional<? extends String> subtotalPrice() {
        return subtotalPrice;
    }

    /**
     * Total amount paid by the buyer for this order.
     */
    @JsonIgnore
    public Optional<? extends String> totalPrice() {
        return totalPrice;
    }

    /**
     * Total tax amount paid by the buyer for this order.
     */
    @JsonIgnore
    public Optional<? extends String> totalTax() {
        return totalTax;
    }

    /**
     * Total weight of the order.
     */
    @JsonIgnore
    public Optional<? extends String> weight() {
        return weight;
    }

    /**
     * The unit used for weight.
     */
    @JsonIgnore
    public Optional<? extends WeightUnitEnum> weightUnit() {
        return weightUnit;
    }

    /**
     * &lt;a href="#tag/Addresses"&gt;Address&lt;/a&gt; object of the sender / seller. Will be returned expanded by default..
     */
    @JsonIgnore
    public Optional<? extends AddressCreateRequest> fromAddress() {
        return fromAddress;
    }

    /**
     * &lt;a href="#tag/Addresses"&gt;Address&lt;/a&gt; object of the recipient / buyer. Will be returned expanded by default.
     */
    @JsonIgnore
    public AddressCreateRequest toAddress() {
        return toAddress;
    }

    /**
     * Array of &lt;a href="#section/Line-Item"&gt;line item&lt;/a&gt; objects representing the items in this order. 
     * All objects will be returned expanded by default.
     */
    @JsonIgnore
    public Optional<? extends java.util.List<LineItemBase>> lineItems() {
        return lineItems;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * **Required if total_price is provided**&lt;br&gt;
     * Currency of the &lt;code&gt;total_price&lt;/code&gt; and &lt;code&gt;total_tax&lt;/code&gt; amounts.
     */
    public OrderCreateRequest withCurrency(String currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = Optional.ofNullable(currency);
        return this;
    }

    /**
     * **Required if total_price is provided**&lt;br&gt;
     * Currency of the &lt;code&gt;total_price&lt;/code&gt; and &lt;code&gt;total_tax&lt;/code&gt; amounts.
     */
    public OrderCreateRequest withCurrency(Optional<? extends String> currency) {
        Utils.checkNotNull(currency, "currency");
        this.currency = currency;
        return this;
    }

    /**
     * Custom buyer- or seller-provided notes about the order.
     */
    public OrderCreateRequest withNotes(String notes) {
        Utils.checkNotNull(notes, "notes");
        this.notes = Optional.ofNullable(notes);
        return this;
    }

    /**
     * Custom buyer- or seller-provided notes about the order.
     */
    public OrderCreateRequest withNotes(Optional<? extends String> notes) {
        Utils.checkNotNull(notes, "notes");
        this.notes = notes;
        return this;
    }

    /**
     * An alphanumeric identifier for the order used by the seller/buyer. This identifier doesn't need to be unique.
     */
    public OrderCreateRequest withOrderNumber(String orderNumber) {
        Utils.checkNotNull(orderNumber, "orderNumber");
        this.orderNumber = Optional.ofNullable(orderNumber);
        return this;
    }

    /**
     * An alphanumeric identifier for the order used by the seller/buyer. This identifier doesn't need to be unique.
     */
    public OrderCreateRequest withOrderNumber(Optional<? extends String> orderNumber) {
        Utils.checkNotNull(orderNumber, "orderNumber");
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     * Current state of the order. See the &lt;a href="https://docs.goshippo.com/docs/orders/orders/"&gt;orders tutorial&lt;/a&gt; 
     * for the logic of how the status is handled.
     */
    public OrderCreateRequest withOrderStatus(OrderStatusEnum orderStatus) {
        Utils.checkNotNull(orderStatus, "orderStatus");
        this.orderStatus = Optional.ofNullable(orderStatus);
        return this;
    }

    /**
     * Current state of the order. See the &lt;a href="https://docs.goshippo.com/docs/orders/orders/"&gt;orders tutorial&lt;/a&gt; 
     * for the logic of how the status is handled.
     */
    public OrderCreateRequest withOrderStatus(Optional<? extends OrderStatusEnum> orderStatus) {
        Utils.checkNotNull(orderStatus, "orderStatus");
        this.orderStatus = orderStatus;
        return this;
    }

    /**
     * Date and time when the order was placed. This datetime can be different from the datetime of the order object creation on Shippo.
     */
    public OrderCreateRequest withPlacedAt(String placedAt) {
        Utils.checkNotNull(placedAt, "placedAt");
        this.placedAt = placedAt;
        return this;
    }

    /**
     * Amount paid by the buyer for shipping. This amount can be different from the price the seller will actually pay for shipping.
     */
    public OrderCreateRequest withShippingCost(String shippingCost) {
        Utils.checkNotNull(shippingCost, "shippingCost");
        this.shippingCost = Optional.ofNullable(shippingCost);
        return this;
    }

    /**
     * Amount paid by the buyer for shipping. This amount can be different from the price the seller will actually pay for shipping.
     */
    public OrderCreateRequest withShippingCost(Optional<? extends String> shippingCost) {
        Utils.checkNotNull(shippingCost, "shippingCost");
        this.shippingCost = shippingCost;
        return this;
    }

    /**
     * **Required if shipping_cost is provided**&lt;br&gt;
     * Currency of the &lt;code&gt;shipping_cost&lt;/code&gt; amount.
     */
    public OrderCreateRequest withShippingCostCurrency(String shippingCostCurrency) {
        Utils.checkNotNull(shippingCostCurrency, "shippingCostCurrency");
        this.shippingCostCurrency = Optional.ofNullable(shippingCostCurrency);
        return this;
    }

    /**
     * **Required if shipping_cost is provided**&lt;br&gt;
     * Currency of the &lt;code&gt;shipping_cost&lt;/code&gt; amount.
     */
    public OrderCreateRequest withShippingCostCurrency(Optional<? extends String> shippingCostCurrency) {
        Utils.checkNotNull(shippingCostCurrency, "shippingCostCurrency");
        this.shippingCostCurrency = shippingCostCurrency;
        return this;
    }

    /**
     * Shipping method (carrier + service or other free text description) chosen by the buyer. 
     * This value can be different from the shipping method the seller will actually choose.
     */
    public OrderCreateRequest withShippingMethod(String shippingMethod) {
        Utils.checkNotNull(shippingMethod, "shippingMethod");
        this.shippingMethod = Optional.ofNullable(shippingMethod);
        return this;
    }

    /**
     * Shipping method (carrier + service or other free text description) chosen by the buyer. 
     * This value can be different from the shipping method the seller will actually choose.
     */
    public OrderCreateRequest withShippingMethod(Optional<? extends String> shippingMethod) {
        Utils.checkNotNull(shippingMethod, "shippingMethod");
        this.shippingMethod = shippingMethod;
        return this;
    }

    public OrderCreateRequest withSubtotalPrice(String subtotalPrice) {
        Utils.checkNotNull(subtotalPrice, "subtotalPrice");
        this.subtotalPrice = Optional.ofNullable(subtotalPrice);
        return this;
    }

    public OrderCreateRequest withSubtotalPrice(Optional<? extends String> subtotalPrice) {
        Utils.checkNotNull(subtotalPrice, "subtotalPrice");
        this.subtotalPrice = subtotalPrice;
        return this;
    }

    /**
     * Total amount paid by the buyer for this order.
     */
    public OrderCreateRequest withTotalPrice(String totalPrice) {
        Utils.checkNotNull(totalPrice, "totalPrice");
        this.totalPrice = Optional.ofNullable(totalPrice);
        return this;
    }

    /**
     * Total amount paid by the buyer for this order.
     */
    public OrderCreateRequest withTotalPrice(Optional<? extends String> totalPrice) {
        Utils.checkNotNull(totalPrice, "totalPrice");
        this.totalPrice = totalPrice;
        return this;
    }

    /**
     * Total tax amount paid by the buyer for this order.
     */
    public OrderCreateRequest withTotalTax(String totalTax) {
        Utils.checkNotNull(totalTax, "totalTax");
        this.totalTax = Optional.ofNullable(totalTax);
        return this;
    }

    /**
     * Total tax amount paid by the buyer for this order.
     */
    public OrderCreateRequest withTotalTax(Optional<? extends String> totalTax) {
        Utils.checkNotNull(totalTax, "totalTax");
        this.totalTax = totalTax;
        return this;
    }

    /**
     * Total weight of the order.
     */
    public OrderCreateRequest withWeight(String weight) {
        Utils.checkNotNull(weight, "weight");
        this.weight = Optional.ofNullable(weight);
        return this;
    }

    /**
     * Total weight of the order.
     */
    public OrderCreateRequest withWeight(Optional<? extends String> weight) {
        Utils.checkNotNull(weight, "weight");
        this.weight = weight;
        return this;
    }

    /**
     * The unit used for weight.
     */
    public OrderCreateRequest withWeightUnit(WeightUnitEnum weightUnit) {
        Utils.checkNotNull(weightUnit, "weightUnit");
        this.weightUnit = Optional.ofNullable(weightUnit);
        return this;
    }

    /**
     * The unit used for weight.
     */
    public OrderCreateRequest withWeightUnit(Optional<? extends WeightUnitEnum> weightUnit) {
        Utils.checkNotNull(weightUnit, "weightUnit");
        this.weightUnit = weightUnit;
        return this;
    }

    /**
     * &lt;a href="#tag/Addresses"&gt;Address&lt;/a&gt; object of the sender / seller. Will be returned expanded by default..
     */
    public OrderCreateRequest withFromAddress(AddressCreateRequest fromAddress) {
        Utils.checkNotNull(fromAddress, "fromAddress");
        this.fromAddress = Optional.ofNullable(fromAddress);
        return this;
    }

    /**
     * &lt;a href="#tag/Addresses"&gt;Address&lt;/a&gt; object of the sender / seller. Will be returned expanded by default..
     */
    public OrderCreateRequest withFromAddress(Optional<? extends AddressCreateRequest> fromAddress) {
        Utils.checkNotNull(fromAddress, "fromAddress");
        this.fromAddress = fromAddress;
        return this;
    }

    /**
     * &lt;a href="#tag/Addresses"&gt;Address&lt;/a&gt; object of the recipient / buyer. Will be returned expanded by default.
     */
    public OrderCreateRequest withToAddress(AddressCreateRequest toAddress) {
        Utils.checkNotNull(toAddress, "toAddress");
        this.toAddress = toAddress;
        return this;
    }

    /**
     * Array of &lt;a href="#section/Line-Item"&gt;line item&lt;/a&gt; objects representing the items in this order. 
     * All objects will be returned expanded by default.
     */
    public OrderCreateRequest withLineItems(java.util.List<LineItemBase> lineItems) {
        Utils.checkNotNull(lineItems, "lineItems");
        this.lineItems = Optional.ofNullable(lineItems);
        return this;
    }

    /**
     * Array of &lt;a href="#section/Line-Item"&gt;line item&lt;/a&gt; objects representing the items in this order. 
     * All objects will be returned expanded by default.
     */
    public OrderCreateRequest withLineItems(Optional<? extends java.util.List<LineItemBase>> lineItems) {
        Utils.checkNotNull(lineItems, "lineItems");
        this.lineItems = lineItems;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderCreateRequest other = (OrderCreateRequest) o;
        return 
            java.util.Objects.deepEquals(this.currency, other.currency) &&
            java.util.Objects.deepEquals(this.notes, other.notes) &&
            java.util.Objects.deepEquals(this.orderNumber, other.orderNumber) &&
            java.util.Objects.deepEquals(this.orderStatus, other.orderStatus) &&
            java.util.Objects.deepEquals(this.placedAt, other.placedAt) &&
            java.util.Objects.deepEquals(this.shippingCost, other.shippingCost) &&
            java.util.Objects.deepEquals(this.shippingCostCurrency, other.shippingCostCurrency) &&
            java.util.Objects.deepEquals(this.shippingMethod, other.shippingMethod) &&
            java.util.Objects.deepEquals(this.subtotalPrice, other.subtotalPrice) &&
            java.util.Objects.deepEquals(this.totalPrice, other.totalPrice) &&
            java.util.Objects.deepEquals(this.totalTax, other.totalTax) &&
            java.util.Objects.deepEquals(this.weight, other.weight) &&
            java.util.Objects.deepEquals(this.weightUnit, other.weightUnit) &&
            java.util.Objects.deepEquals(this.fromAddress, other.fromAddress) &&
            java.util.Objects.deepEquals(this.toAddress, other.toAddress) &&
            java.util.Objects.deepEquals(this.lineItems, other.lineItems);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            currency,
            notes,
            orderNumber,
            orderStatus,
            placedAt,
            shippingCost,
            shippingCostCurrency,
            shippingMethod,
            subtotalPrice,
            totalPrice,
            totalTax,
            weight,
            weightUnit,
            fromAddress,
            toAddress,
            lineItems);
    }
    
    @Override
    public String toString() {
        return Utils.toString(OrderCreateRequest.class,
                "currency", currency,
                "notes", notes,
                "orderNumber", orderNumber,
                "orderStatus", orderStatus,
                "placedAt", placedAt,
                "shippingCost", shippingCost,
                "shippingCostCurrency", shippingCostCurrency,
                "shippingMethod", shippingMethod,
                "subtotalPrice", subtotalPrice,
                "totalPrice", totalPrice,
                "totalTax", totalTax,
                "weight", weight,
                "weightUnit", weightUnit,
                "fromAddress", fromAddress,
                "toAddress", toAddress,
                "lineItems", lineItems);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> currency = Optional.empty();
 
        private Optional<? extends String> notes = Optional.empty();
 
        private Optional<? extends String> orderNumber = Optional.empty();
 
        private Optional<? extends OrderStatusEnum> orderStatus = Optional.empty();
 
        private String placedAt;
 
        private Optional<? extends String> shippingCost = Optional.empty();
 
        private Optional<? extends String> shippingCostCurrency = Optional.empty();
 
        private Optional<? extends String> shippingMethod = Optional.empty();
 
        private Optional<? extends String> subtotalPrice = Optional.empty();
 
        private Optional<? extends String> totalPrice = Optional.empty();
 
        private Optional<? extends String> totalTax = Optional.empty();
 
        private Optional<? extends String> weight = Optional.empty();
 
        private Optional<? extends WeightUnitEnum> weightUnit = Optional.empty();
 
        private Optional<? extends AddressCreateRequest> fromAddress = Optional.empty();
 
        private AddressCreateRequest toAddress;
 
        private Optional<? extends java.util.List<LineItemBase>> lineItems = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * **Required if total_price is provided**&lt;br&gt;
         * Currency of the &lt;code&gt;total_price&lt;/code&gt; and &lt;code&gt;total_tax&lt;/code&gt; amounts.
         */
        public Builder currency(String currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = Optional.ofNullable(currency);
            return this;
        }

        /**
         * **Required if total_price is provided**&lt;br&gt;
         * Currency of the &lt;code&gt;total_price&lt;/code&gt; and &lt;code&gt;total_tax&lt;/code&gt; amounts.
         */
        public Builder currency(Optional<? extends String> currency) {
            Utils.checkNotNull(currency, "currency");
            this.currency = currency;
            return this;
        }

        /**
         * Custom buyer- or seller-provided notes about the order.
         */
        public Builder notes(String notes) {
            Utils.checkNotNull(notes, "notes");
            this.notes = Optional.ofNullable(notes);
            return this;
        }

        /**
         * Custom buyer- or seller-provided notes about the order.
         */
        public Builder notes(Optional<? extends String> notes) {
            Utils.checkNotNull(notes, "notes");
            this.notes = notes;
            return this;
        }

        /**
         * An alphanumeric identifier for the order used by the seller/buyer. This identifier doesn't need to be unique.
         */
        public Builder orderNumber(String orderNumber) {
            Utils.checkNotNull(orderNumber, "orderNumber");
            this.orderNumber = Optional.ofNullable(orderNumber);
            return this;
        }

        /**
         * An alphanumeric identifier for the order used by the seller/buyer. This identifier doesn't need to be unique.
         */
        public Builder orderNumber(Optional<? extends String> orderNumber) {
            Utils.checkNotNull(orderNumber, "orderNumber");
            this.orderNumber = orderNumber;
            return this;
        }

        /**
         * Current state of the order. See the &lt;a href="https://docs.goshippo.com/docs/orders/orders/"&gt;orders tutorial&lt;/a&gt; 
         * for the logic of how the status is handled.
         */
        public Builder orderStatus(OrderStatusEnum orderStatus) {
            Utils.checkNotNull(orderStatus, "orderStatus");
            this.orderStatus = Optional.ofNullable(orderStatus);
            return this;
        }

        /**
         * Current state of the order. See the &lt;a href="https://docs.goshippo.com/docs/orders/orders/"&gt;orders tutorial&lt;/a&gt; 
         * for the logic of how the status is handled.
         */
        public Builder orderStatus(Optional<? extends OrderStatusEnum> orderStatus) {
            Utils.checkNotNull(orderStatus, "orderStatus");
            this.orderStatus = orderStatus;
            return this;
        }

        /**
         * Date and time when the order was placed. This datetime can be different from the datetime of the order object creation on Shippo.
         */
        public Builder placedAt(String placedAt) {
            Utils.checkNotNull(placedAt, "placedAt");
            this.placedAt = placedAt;
            return this;
        }

        /**
         * Amount paid by the buyer for shipping. This amount can be different from the price the seller will actually pay for shipping.
         */
        public Builder shippingCost(String shippingCost) {
            Utils.checkNotNull(shippingCost, "shippingCost");
            this.shippingCost = Optional.ofNullable(shippingCost);
            return this;
        }

        /**
         * Amount paid by the buyer for shipping. This amount can be different from the price the seller will actually pay for shipping.
         */
        public Builder shippingCost(Optional<? extends String> shippingCost) {
            Utils.checkNotNull(shippingCost, "shippingCost");
            this.shippingCost = shippingCost;
            return this;
        }

        /**
         * **Required if shipping_cost is provided**&lt;br&gt;
         * Currency of the &lt;code&gt;shipping_cost&lt;/code&gt; amount.
         */
        public Builder shippingCostCurrency(String shippingCostCurrency) {
            Utils.checkNotNull(shippingCostCurrency, "shippingCostCurrency");
            this.shippingCostCurrency = Optional.ofNullable(shippingCostCurrency);
            return this;
        }

        /**
         * **Required if shipping_cost is provided**&lt;br&gt;
         * Currency of the &lt;code&gt;shipping_cost&lt;/code&gt; amount.
         */
        public Builder shippingCostCurrency(Optional<? extends String> shippingCostCurrency) {
            Utils.checkNotNull(shippingCostCurrency, "shippingCostCurrency");
            this.shippingCostCurrency = shippingCostCurrency;
            return this;
        }

        /**
         * Shipping method (carrier + service or other free text description) chosen by the buyer. 
         * This value can be different from the shipping method the seller will actually choose.
         */
        public Builder shippingMethod(String shippingMethod) {
            Utils.checkNotNull(shippingMethod, "shippingMethod");
            this.shippingMethod = Optional.ofNullable(shippingMethod);
            return this;
        }

        /**
         * Shipping method (carrier + service or other free text description) chosen by the buyer. 
         * This value can be different from the shipping method the seller will actually choose.
         */
        public Builder shippingMethod(Optional<? extends String> shippingMethod) {
            Utils.checkNotNull(shippingMethod, "shippingMethod");
            this.shippingMethod = shippingMethod;
            return this;
        }

        public Builder subtotalPrice(String subtotalPrice) {
            Utils.checkNotNull(subtotalPrice, "subtotalPrice");
            this.subtotalPrice = Optional.ofNullable(subtotalPrice);
            return this;
        }

        public Builder subtotalPrice(Optional<? extends String> subtotalPrice) {
            Utils.checkNotNull(subtotalPrice, "subtotalPrice");
            this.subtotalPrice = subtotalPrice;
            return this;
        }

        /**
         * Total amount paid by the buyer for this order.
         */
        public Builder totalPrice(String totalPrice) {
            Utils.checkNotNull(totalPrice, "totalPrice");
            this.totalPrice = Optional.ofNullable(totalPrice);
            return this;
        }

        /**
         * Total amount paid by the buyer for this order.
         */
        public Builder totalPrice(Optional<? extends String> totalPrice) {
            Utils.checkNotNull(totalPrice, "totalPrice");
            this.totalPrice = totalPrice;
            return this;
        }

        /**
         * Total tax amount paid by the buyer for this order.
         */
        public Builder totalTax(String totalTax) {
            Utils.checkNotNull(totalTax, "totalTax");
            this.totalTax = Optional.ofNullable(totalTax);
            return this;
        }

        /**
         * Total tax amount paid by the buyer for this order.
         */
        public Builder totalTax(Optional<? extends String> totalTax) {
            Utils.checkNotNull(totalTax, "totalTax");
            this.totalTax = totalTax;
            return this;
        }

        /**
         * Total weight of the order.
         */
        public Builder weight(String weight) {
            Utils.checkNotNull(weight, "weight");
            this.weight = Optional.ofNullable(weight);
            return this;
        }

        /**
         * Total weight of the order.
         */
        public Builder weight(Optional<? extends String> weight) {
            Utils.checkNotNull(weight, "weight");
            this.weight = weight;
            return this;
        }

        /**
         * The unit used for weight.
         */
        public Builder weightUnit(WeightUnitEnum weightUnit) {
            Utils.checkNotNull(weightUnit, "weightUnit");
            this.weightUnit = Optional.ofNullable(weightUnit);
            return this;
        }

        /**
         * The unit used for weight.
         */
        public Builder weightUnit(Optional<? extends WeightUnitEnum> weightUnit) {
            Utils.checkNotNull(weightUnit, "weightUnit");
            this.weightUnit = weightUnit;
            return this;
        }

        /**
         * &lt;a href="#tag/Addresses"&gt;Address&lt;/a&gt; object of the sender / seller. Will be returned expanded by default..
         */
        public Builder fromAddress(AddressCreateRequest fromAddress) {
            Utils.checkNotNull(fromAddress, "fromAddress");
            this.fromAddress = Optional.ofNullable(fromAddress);
            return this;
        }

        /**
         * &lt;a href="#tag/Addresses"&gt;Address&lt;/a&gt; object of the sender / seller. Will be returned expanded by default..
         */
        public Builder fromAddress(Optional<? extends AddressCreateRequest> fromAddress) {
            Utils.checkNotNull(fromAddress, "fromAddress");
            this.fromAddress = fromAddress;
            return this;
        }

        /**
         * &lt;a href="#tag/Addresses"&gt;Address&lt;/a&gt; object of the recipient / buyer. Will be returned expanded by default.
         */
        public Builder toAddress(AddressCreateRequest toAddress) {
            Utils.checkNotNull(toAddress, "toAddress");
            this.toAddress = toAddress;
            return this;
        }

        /**
         * Array of &lt;a href="#section/Line-Item"&gt;line item&lt;/a&gt; objects representing the items in this order. 
         * All objects will be returned expanded by default.
         */
        public Builder lineItems(java.util.List<LineItemBase> lineItems) {
            Utils.checkNotNull(lineItems, "lineItems");
            this.lineItems = Optional.ofNullable(lineItems);
            return this;
        }

        /**
         * Array of &lt;a href="#section/Line-Item"&gt;line item&lt;/a&gt; objects representing the items in this order. 
         * All objects will be returned expanded by default.
         */
        public Builder lineItems(Optional<? extends java.util.List<LineItemBase>> lineItems) {
            Utils.checkNotNull(lineItems, "lineItems");
            this.lineItems = lineItems;
            return this;
        }
        
        public OrderCreateRequest build() {
            return new OrderCreateRequest(
                currency,
                notes,
                orderNumber,
                orderStatus,
                placedAt,
                shippingCost,
                shippingCostCurrency,
                shippingMethod,
                subtotalPrice,
                totalPrice,
                totalTax,
                weight,
                weightUnit,
                fromAddress,
                toAddress,
                lineItems);
        }
    }
}

