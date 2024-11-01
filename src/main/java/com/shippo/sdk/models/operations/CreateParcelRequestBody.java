/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.shippo.sdk.models.components.ParcelCreateFromTemplateRequest;
import com.shippo.sdk.models.components.ParcelCreateRequest;
import com.shippo.sdk.utils.OneOfDeserializer;
import com.shippo.sdk.utils.TypedObject;
import com.shippo.sdk.utils.Utils.JsonShape;
import com.shippo.sdk.utils.Utils.TypeReferenceWithShape;
import com.shippo.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * CreateParcelRequestBody - Parcel details.
 */

@JsonDeserialize(using = CreateParcelRequestBody._Deserializer.class)
public class CreateParcelRequestBody {

    @JsonValue
    private TypedObject value;
    
    private CreateParcelRequestBody(TypedObject value) {
        this.value = value;
    }

    public static CreateParcelRequestBody of(ParcelCreateRequest value) {
        Utils.checkNotNull(value, "value");
        return new CreateParcelRequestBody(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ParcelCreateRequest>(){}));
    }

    public static CreateParcelRequestBody of(ParcelCreateFromTemplateRequest value) {
        Utils.checkNotNull(value, "value");
        return new CreateParcelRequestBody(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ParcelCreateFromTemplateRequest>(){}));
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
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<CreateParcelRequestBody> {

        public _Deserializer() {
            super(CreateParcelRequestBody.class, false,
                  TypeReferenceWithShape.of(new TypeReference<ParcelCreateRequest>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ParcelCreateFromTemplateRequest>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(CreateParcelRequestBody.class,
                "value", value);
    }
 
}
