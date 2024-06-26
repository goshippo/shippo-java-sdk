/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

import java.time.OffsetDateTime;
import java.time.LocalDate;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.shippo.sdk.utils.TypedObject;
import com.shippo.sdk.utils.Utils.JsonShape;

/**
 * CreateParcelRequestBody - Parcel details.
 */

@JsonDeserialize(using = CreateParcelRequestBody._Deserializer.class)
public class CreateParcelRequestBody {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private CreateParcelRequestBody(TypedObject value) {
        this.value = value;
    }

    public static CreateParcelRequestBody of(com.shippo.sdk.models.components.ParcelCreateRequest value) {
        Utils.checkNotNull(value, "value");
        return new CreateParcelRequestBody(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<com.shippo.sdk.models.components.ParcelCreateRequest>(){}));
    }

    public static CreateParcelRequestBody of(com.shippo.sdk.models.components.ParcelCreateFromTemplateRequest value) {
        Utils.checkNotNull(value, "value");
        return new CreateParcelRequestBody(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<com.shippo.sdk.models.components.ParcelCreateFromTemplateRequest>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.shippo.sdk.models.components.ParcelCreateRequest}</li>
     * <li>{@code com.shippo.sdk.models.components.ParcelCreateFromTemplateRequest}</li>
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
        CreateParcelRequestBody other = (CreateParcelRequestBody) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.shippo.sdk.utils.OneOfDeserializer<CreateParcelRequestBody> {

        public _Deserializer() {
            super(CreateParcelRequestBody.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<com.shippo.sdk.models.components.ParcelCreateRequest>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<com.shippo.sdk.models.components.ParcelCreateFromTemplateRequest>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateParcelRequestBody.class,
                "value", value);
    }
 
}
