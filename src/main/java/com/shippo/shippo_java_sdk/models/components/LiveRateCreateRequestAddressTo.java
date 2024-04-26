/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.shippo_java_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.shippo_java_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

import java.time.OffsetDateTime;
import java.time.LocalDate;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.shippo.shippo_java_sdk.utils.TypedObject;
import com.shippo.shippo_java_sdk.utils.Utils.JsonShape;

/**
 * LiveRateCreateRequestAddressTo - The recipient address, which includes the recipient's name, company name, street address, city, state, zip code, 
 * country, phone number, and email address (strings). Special characters should not be included in 
 * any address element, especially name, company, and email.
 */

@JsonDeserialize(using = LiveRateCreateRequestAddressTo._Deserializer.class)
public class LiveRateCreateRequestAddressTo {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private LiveRateCreateRequestAddressTo(TypedObject value) {
        this.value = value;
    }

    public static LiveRateCreateRequestAddressTo of(String value) {
        Utils.checkNotNull(value, "value");
        return new LiveRateCreateRequestAddressTo(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<String>(){}));
    }

    public static LiveRateCreateRequestAddressTo of(AddressCompleteCreateRequest value) {
        Utils.checkNotNull(value, "value");
        return new LiveRateCreateRequestAddressTo(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<AddressCompleteCreateRequest>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code String}</li>
     * <li>{@code AddressCompleteCreateRequest}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LiveRateCreateRequestAddressTo other = (LiveRateCreateRequestAddressTo) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.shippo.shippo_java_sdk.utils.OneOfDeserializer<LiveRateCreateRequestAddressTo> {

        public _Deserializer() {
            super(LiveRateCreateRequestAddressTo.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<String>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<AddressCompleteCreateRequest>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(LiveRateCreateRequestAddressTo.class,
                "value", value);
    }
 
}
