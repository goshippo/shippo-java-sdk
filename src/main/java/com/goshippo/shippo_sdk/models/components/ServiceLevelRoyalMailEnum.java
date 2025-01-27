/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * ServiceLevelRoyalMailEnum - |Token | Service name|
 * |:---|:---|
 * | royal_mail_tracked_letter_boxable_24_no_signature | Royal Mail Tracked Letter-Boxable 24 No Signature|
 * | royal_mail_tracked_letter_boxable_48_no_signature | Royal Mail Tracked Letter-Boxable 48 No Signature|
 * | royal_mail_tracked_24_returns | Royal Mail Tracked Returns 24|
 * | royal_mail_tracked_48_returns | Royal Mail Tracked Returns 48|
 * | royal_mail_special_delivery_guaranteed_1pm | Special Delivery Guaranteed by 1pm
 * | royal_mail_special_delivery_guaranteed_9am | Special Delivery Guaranteed by 9am
 * | royal_mail_24 | RoyalMail 24
 * | royal_mail_48 | RoyalMail 48
 * | royal_mail_signed_for_first_class | Signed for First Class
 * | royal_mail_signed_for_second_class | Signed for Second Class
 * | royal_mail_standard_first_class | Standard First Class
 * | royal_mail_standard_second_class | Standard Second Class
 * | royal_mail_tracked_24_no_signature | Royal Mail Tracked 24 No Signature
 * | royal_mail_tracked_48_no_signature | Royal Mail Ttacked 48 No Signature
 * | royal_mail_intl_bus_mail_lrg_ltr_zone_sort_pri | International Business Mail Large Letter Zone Sort Priority
 * | royal_mail_intl_bus_parcels_tracked_zone_sort | International Business Parcels Tracked Zone Sort
 * | royal_mail_intl_bus_parcels_tracked_country_priced | International Business Parcels Tracked Country Priced
 * | royal_mail_intl_bus_parcels_tracked_signed_zone_srt | International Business Parcels &amp; Signed Zone Sort
 * | royal_mail_24_flat_rate | Royal Mail 24 Parcel Flat Rate
 * | royal_mail_48_flat_rate | Royal Mail 48 Parcel Flat Rate
 * 
 */
public enum ServiceLevelRoyalMailEnum {
    ROYAL_MAIL_TRACKED_LETTER_BOXABLE24_NO_SIGNATURE("royal_mail_tracked_letter_boxable_24_no_signature"),
    ROYAL_MAIL_TRACKED_LETTER_BOXABLE48_NO_SIGNATURE("royal_mail_tracked_letter_boxable_48_no_signature"),
    ROYAL_MAIL_TRACKED24_RETURNS("royal_mail_tracked_24_returns"),
    ROYAL_MAIL_TRACKED48_RETURNS("royal_mail_tracked_48_returns"),
    ROYAL_MAIL_SPECIAL_DELIVERY_GUARANTEED1PM("royal_mail_special_delivery_guaranteed_1pm"),
    ROYAL_MAIL_SPECIAL_DELIVERY_GUARANTEED9AM("royal_mail_special_delivery_guaranteed_9am"),
    ROYAL_MAIL24("royal_mail_24"),
    ROYAL_MAIL48("royal_mail_48"),
    ROYAL_MAIL_SIGNED_FOR_FIRST_CLASS("royal_mail_signed_for_first_class"),
    ROYAL_MAIL_SIGNED_FOR_SECOND_CLASS("royal_mail_signed_for_second_class"),
    ROYAL_MAIL_STANDARD_FIRST_CLASS("royal_mail_standard_first_class"),
    ROYAL_MAIL_STANDARD_SECOND_CLASS("royal_mail_standard_second_class"),
    ROYAL_MAIL_TRACKED24_NO_SIGNATURE("royal_mail_tracked_24_no_signature"),
    ROYAL_MAIL_TRACKED48_NO_SIGNATURE("royal_mail_tracked_48_no_signature"),
    ROYAL_MAIL_INTL_BUS_MAIL_LRG_LTR_ZONE_SORT_PRI("royal_mail_intl_bus_mail_lrg_ltr_zone_sort_pri"),
    ROYAL_MAIL_INTL_BUS_PARCELS_TRACKED_ZONE_SORT("royal_mail_intl_bus_parcels_tracked_zone_sort"),
    ROYAL_MAIL_INTL_BUS_PARCELS_TRACKED_COUNTRY_PRICED("royal_mail_intl_bus_parcels_tracked_country_priced"),
    ROYAL_MAIL_INTL_BUS_PARCELS_TRACKED_SIGNED_ZONE_SRT("royal_mail_intl_bus_parcels_tracked_signed_zone_srt"),
    ROYAL_MAIL24_FLAT_RATE("royal_mail_24_flat_rate"),
    ROYAL_MAIL48_FLAT_RATE("royal_mail_48_flat_rate");

    @JsonValue
    private final String value;

    private ServiceLevelRoyalMailEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ServiceLevelRoyalMailEnum> fromValue(String value) {
        for (ServiceLevelRoyalMailEnum o: ServiceLevelRoyalMailEnum.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
