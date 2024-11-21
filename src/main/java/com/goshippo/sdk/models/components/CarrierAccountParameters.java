/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.sdk.models.components;


import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.goshippo.sdk.utils.OneOfDeserializer;
import com.goshippo.sdk.utils.TypedObject;
import com.goshippo.sdk.utils.Utils.JsonShape;
import com.goshippo.sdk.utils.Utils.TypeReferenceWithShape;
import com.goshippo.sdk.utils.Utils;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Map;
import java.util.Objects;


@JsonDeserialize(using = CarrierAccountParameters._Deserializer.class)
public class CarrierAccountParameters {

    @JsonValue
    private TypedObject value;
    
    private CarrierAccountParameters(TypedObject value) {
        this.value = value;
    }

    public static CarrierAccountParameters of(Map<String, Object> value) {
        Utils.checkNotNull(value, "value");
        return new CarrierAccountParameters(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<Map<String, Object>>(){}));
    }

    public static CarrierAccountParameters of(FedExConnectExistingOwnAccountParameters value) {
        Utils.checkNotNull(value, "value");
        return new CarrierAccountParameters(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<FedExConnectExistingOwnAccountParameters>(){}));
    }

    public static CarrierAccountParameters of(UPSConnectExistingOwnAccountParameters value) {
        Utils.checkNotNull(value, "value");
        return new CarrierAccountParameters(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<UPSConnectExistingOwnAccountParameters>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code java.util.Map<java.lang.String, java.lang.Object>}</li>
     * <li>{@code com.goshippo.sdk.models.components.FedExConnectExistingOwnAccountParameters}</li>
     * <li>{@code com.goshippo.sdk.models.components.UPSConnectExistingOwnAccountParameters}</li>
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
        CarrierAccountParameters other = (CarrierAccountParameters) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<CarrierAccountParameters> {

        public _Deserializer() {
            super(CarrierAccountParameters.class, false,
                  TypeReferenceWithShape.of(new TypeReference<Map<String, Object>>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<UPSConnectExistingOwnAccountParameters>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<FedExConnectExistingOwnAccountParameters>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(CarrierAccountParameters.class,
                "value", value);
    }
 
}