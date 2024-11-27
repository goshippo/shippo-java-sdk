/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;


import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.goshippo.shippo_sdk.utils.OneOfDeserializer;
import com.goshippo.shippo_sdk.utils.TypedObject;
import com.goshippo.shippo_sdk.utils.Utils.JsonShape;
import com.goshippo.shippo_sdk.utils.Utils.TypeReferenceWithShape;
import com.goshippo.shippo_sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;


@JsonDeserialize(using = ShipmentCreateRequestCustomsDeclaration._Deserializer.class)
public class ShipmentCreateRequestCustomsDeclaration {

    @JsonValue
    private TypedObject value;
    
    private ShipmentCreateRequestCustomsDeclaration(TypedObject value) {
        this.value = value;
    }

    public static ShipmentCreateRequestCustomsDeclaration of(CustomsDeclarationCreateRequest value) {
        Utils.checkNotNull(value, "value");
        return new ShipmentCreateRequestCustomsDeclaration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<CustomsDeclarationCreateRequest>(){}));
    }

    public static ShipmentCreateRequestCustomsDeclaration of(String value) {
        Utils.checkNotNull(value, "value");
        return new ShipmentCreateRequestCustomsDeclaration(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<String>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.goshippo.shippo_sdk.models.components.CustomsDeclarationCreateRequest}</li>
     * <li>{@code java.lang.String}</li>
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
        ShipmentCreateRequestCustomsDeclaration other = (ShipmentCreateRequestCustomsDeclaration) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<ShipmentCreateRequestCustomsDeclaration> {

        public _Deserializer() {
            super(ShipmentCreateRequestCustomsDeclaration.class, false,
                  TypeReferenceWithShape.of(new TypeReference<String>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<CustomsDeclarationCreateRequest>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(ShipmentCreateRequestCustomsDeclaration.class,
                "value", value);
    }
 
}