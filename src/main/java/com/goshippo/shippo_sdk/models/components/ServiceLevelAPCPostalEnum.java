/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * ServiceLevelAPCPostalEnum - |Token | Service name|
 * |:---|:---|
 * | apc_postal_parcelconnect_expedited | parcelConnect Expedited|
 * | apc_postal_parcelconnect_priority | parcelConnect Priority|
 * | apc_postal_parcelconnect_priority_delcon | parcelConnect Priority Delcon|
 * | apc_postal_parcelconnect_priority_pqw | parcelConnect Priority PQW|
 * | apc_postal_parcelconnect_book_service | parcelConnect Book Service|
 * | apc_postal_parcelconnect_standard | parcelConnect Standard|
 * | apc_postal_parcelconnect_epmi | parcelConnect ePMI|
 * | apc_postal_parcelconnect_epacket | parcelConnect ePacket|
 * | apc_postal_parcelconnect_epmei | parcelConnect ePMEI|
 * 
 */
public enum ServiceLevelAPCPostalEnum {
    APC_POSTAL_PARCELCONNECT_EXPEDITED("apc_postal_parcelconnect_expedited"),
    APC_POSTAL_PARCELCONNECT_PRIORITY("apc_postal_parcelconnect_priority"),
    APC_POSTAL_PARCELCONNECT_PRIORITY_DELCON("apc_postal_parcelconnect_priority_delcon"),
    APC_POSTAL_PARCELCONNECT_PRIORITY_PQW("apc_postal_parcelconnect_priority_pqw"),
    APC_POSTAL_PARCELCONNECT_BOOK_SERVICE("apc_postal_parcelconnect_book_service"),
    APC_POSTAL_PARCELCONNECT_STANDARD("apc_postal_parcelconnect_standard"),
    APC_POSTAL_PARCELCONNECT_EPMI("apc_postal_parcelconnect_epmi"),
    APC_POSTAL_PARCELCONNECT_EPACKET("apc_postal_parcelconnect_epacket"),
    APC_POSTAL_PARCELCONNECT_EPMEI("apc_postal_parcelconnect_epmei");

    @JsonValue
    private final String value;

    private ServiceLevelAPCPostalEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ServiceLevelAPCPostalEnum> fromValue(String value) {
        for (ServiceLevelAPCPostalEnum o: ServiceLevelAPCPostalEnum.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
