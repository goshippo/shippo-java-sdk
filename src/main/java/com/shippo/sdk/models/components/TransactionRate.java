/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.sdk.models.components;

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
 * TransactionRate - ID of the Rate object for which a Label has to be obtained.  
 * If you purchase a label by calling the transaction endpoint without a rate (instalabel), 
 * this field will be a simplified Rate object in the Transaction model returned from the POST request.
 * &lt;/br&gt;Note, only rates less than 7 days old can be purchased to ensure up-to-date pricing.
 */

@JsonDeserialize(using = TransactionRate._Deserializer.class)
public class TransactionRate {

    @com.fasterxml.jackson.annotation.JsonValue
    private TypedObject value;
    
    private TransactionRate(TypedObject value) {
        this.value = value;
    }

    public static TransactionRate of(CoreRate value) {
        Utils.checkNotNull(value, "value");
        return new TransactionRate(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<CoreRate>(){}));
    }

    public static TransactionRate of(String value) {
        Utils.checkNotNull(value, "value");
        return new TransactionRate(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<String>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code CoreRate}</li>
     * <li>{@code String}</li>
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
        TransactionRate other = (TransactionRate) o;
        return java.util.Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends com.shippo.sdk.utils.OneOfDeserializer<TransactionRate> {

        public _Deserializer() {
            super(TransactionRate.class,
                  Utils.TypeReferenceWithShape.of(new TypeReference<CoreRate>() {}, Utils.JsonShape.DEFAULT),
                  Utils.TypeReferenceWithShape.of(new TypeReference<String>() {}, Utils.JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(TransactionRate.class,
                "value", value);
    }
 
}
