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


@JsonDeserialize(using = ServiceLevelEnumSet._Deserializer.class)
public class ServiceLevelEnumSet {

    @JsonValue
    private TypedObject value;
    
    private ServiceLevelEnumSet(TypedObject value) {
        this.value = value;
    }

    public static ServiceLevelEnumSet of(ServiceLevelUSPSEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelUSPSEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelFedExEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelFedExEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelUPSEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelUPSEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelAirterraEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelAirterraEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelAPCPostalEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelAPCPostalEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelAsendiaEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelAsendiaEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelAustraliaPostEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelAustraliaPostEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelAPGEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelAPGEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelBetterTrucksEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelBetterTrucksEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelCanadaPostEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelCanadaPostEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelCDLEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelCDLEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelChronopostEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelChronopostEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelCorreosEspanaEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelCorreosEspanaEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelColissimoEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelColissimoEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelPurolatorEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelPurolatorEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelDHLExpressEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelDHLExpressEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelDHLeCommerceEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelDHLeCommerceEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelDHLGermanyEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelDHLGermanyEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelDPDDEEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelDPDDEEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelDPDUKEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelDPDUKEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelDeutschePostEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelDeutschePostEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelAramexAustraliaEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelAramexAustraliaEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelGlobegisticsEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelGlobegisticsEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelGLSUSEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelGLSUSEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelLSOEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelLSOEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelMondialRelayEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelMondialRelayEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelParcelforceEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelParcelforceEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelPostItalianeEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelPostItalianeEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelePostGlobalEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelePostGlobalEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelRoyalMailEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelRoyalMailEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelSendleEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelSendleEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelOnTracEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelOnTracEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelJitsuEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelJitsuEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelLasershipEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelLasershipEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelEvriUKEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelEvriUKEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelUDSEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelUDSEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelVehoEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelVehoEnum>(){}));
    }

    public static ServiceLevelEnumSet of(ServiceLevelSwyftEnum value) {
        Utils.checkNotNull(value, "value");
        return new ServiceLevelEnumSet(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<ServiceLevelSwyftEnum>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelUSPSEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelFedExEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelUPSEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelAirterraEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelAPCPostalEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelAsendiaEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelAustraliaPostEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelAPGEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelBetterTrucksEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelCanadaPostEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelCDLEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelChronopostEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelCorreosEspanaEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelColissimoEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelPurolatorEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelDHLExpressEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelDHLeCommerceEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelDHLGermanyEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelDPDDEEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelDPDUKEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelDeutschePostEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelAramexAustraliaEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelGlobegisticsEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelGLSUSEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelLSOEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelMondialRelayEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelParcelforceEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelPostItalianeEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelePostGlobalEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelRoyalMailEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelSendleEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelOnTracEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelJitsuEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelLasershipEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelEvriUKEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelUDSEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelVehoEnum}</li>
     * <li>{@code com.goshippo.shippo_sdk.models.components.ServiceLevelSwyftEnum}</li>
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
        ServiceLevelEnumSet other = (ServiceLevelEnumSet) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<ServiceLevelEnumSet> {

        public _Deserializer() {
            super(ServiceLevelEnumSet.class, false,
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelSwyftEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelVehoEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelUDSEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelEvriUKEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelLasershipEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelJitsuEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelOnTracEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelSendleEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelRoyalMailEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelePostGlobalEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelPostItalianeEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelParcelforceEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelMondialRelayEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelLSOEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelGLSUSEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelGlobegisticsEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelAramexAustraliaEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelDeutschePostEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelDPDUKEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelDPDDEEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelDHLGermanyEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelDHLeCommerceEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelDHLExpressEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelPurolatorEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelColissimoEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelCorreosEspanaEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelChronopostEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelCDLEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelCanadaPostEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelBetterTrucksEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelAPGEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelAustraliaPostEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelAsendiaEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelAPCPostalEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelAirterraEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelUPSEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelFedExEnum>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<ServiceLevelUSPSEnum>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(ServiceLevelEnumSet.class,
                "value", value);
    }
 
}
