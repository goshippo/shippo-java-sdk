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

/**
 * ParcelTemplateEnumSet - If template is passed, `length`, `width`, `height`, and `distance_unit` are not required
 */

@JsonDeserialize(using = ParcelTemplateEnumSet._Deserializer.class)
public class ParcelTemplateEnumSet {

    @JsonValue
    private TypedObject value;
    
    private ParcelTemplateEnumSet(TypedObject value) {
        this.value = value;
    }

    public static ParcelTemplateEnumSet of(ParcelTemplateFedExEnum value) {
        Utils.checkNotNull(value, "value");
        return new ParcelTemplateEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ParcelTemplateFedExEnum>(){}));
    }

    public static ParcelTemplateEnumSet of(ParcelTemplateUPSEnum value) {
        Utils.checkNotNull(value, "value");
        return new ParcelTemplateEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ParcelTemplateUPSEnum>(){}));
    }

    public static ParcelTemplateEnumSet of(ParcelTemplateUSPSEnum value) {
        Utils.checkNotNull(value, "value");
        return new ParcelTemplateEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ParcelTemplateUSPSEnum>(){}));
    }

    public static ParcelTemplateEnumSet of(ParcelTemplateDHLeCommerceEnum value) {
        Utils.checkNotNull(value, "value");
        return new ParcelTemplateEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ParcelTemplateDHLeCommerceEnum>(){}));
    }

    public static ParcelTemplateEnumSet of(ParcelTemplateDPDUKEnum value) {
        Utils.checkNotNull(value, "value");
        return new ParcelTemplateEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ParcelTemplateDPDUKEnum>(){}));
    }

    public static ParcelTemplateEnumSet of(ParcelTemplateAramexAustraliaEnum value) {
        Utils.checkNotNull(value, "value");
        return new ParcelTemplateEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ParcelTemplateAramexAustraliaEnum>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ParcelTemplateFedExEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ParcelTemplateUPSEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ParcelTemplateUSPSEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ParcelTemplateDHLeCommerceEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ParcelTemplateDPDUKEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ParcelTemplateAramexAustraliaEnum}</li>
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
        ParcelTemplateEnumSet other = (ParcelTemplateEnumSet) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<ParcelTemplateEnumSet> {

        public _Deserializer() {
            super(ParcelTemplateEnumSet.class, false,
                  TypeReferenceWithShape.of(new TypeReference<ParcelTemplateAramexAustraliaEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ParcelTemplateDPDUKEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ParcelTemplateDHLeCommerceEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ParcelTemplateUSPSEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ParcelTemplateUPSEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ParcelTemplateFedExEnum>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(ParcelTemplateEnumSet.class,
                "value", value);
    }
 
}
