/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.shippo_java_sdk.models.components;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.shippo_java_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * CarriersEnum - |Token | Carrier name|
 * |:---|:---|
 * | airterra | Airterra |
 * | apc_postal | APC Postal|
 * | apg | APG|
 * | aramex | Aramex|
 * | asendia_us | Asendia US|
 * | australia_post | Australia Post (also used for Startrack)|
 * | axlehire | Axlehire|
 * | better_trucks | BetterTrucks|
 * | borderguru | BorderGuru|
 * | boxberry | Boxberry|
 * | bring | Bring (also used for Posten Norge)|
 * | canada_post | Canada Post|
 * | cdl | CDL|
 * | chronopost | Chronopost|
 * | collect_plus | CollectPlus|
 * | correios_br | CorreiosBR|
 * | correos_espana | Correos España |
 * | couriersplease | Couriers Please|
 * | colissimo | Colissimo|
 * | deutsche_post | Deutsche Post|
 * | dhl_benelux | DHL Benelux|
 * | dhl_ecommerce | DHL eCommerce|
 * | dhl_express | DHL Express|
 * | dhl_germany_c2c | DHL Germany C2C|
 * | dhl_germany | DHL Germany|
 * | dpd_de | DPD GERMANY|
 * | dpd_uk | DPD UK|
 * | estafeta | Estafeta|
 * | fastway_australia | Aramex|
 * | fedex | FedEx|
 * | globegistics | Globegistics (now Asendia)|
 * | gls_us | GLS US|
 * | gophr | Gophr|
 * | gso | GSO|
 * | hermes_germany_b2c | Hermes Germany B2C|
 * | hermes_uk | Evri UK |
 * | hongkong_post | Hongkong Post|
 * | lasership | LaserShip|
 * | lso | LSO|
 * | mondial_relay | Mondial Relay|
 * | new_zealand_post | New Zealand Post (also used for Pace and CourierPost)|
 * | nippon_express | Nippon Express|
 * | ontrac | OnTrac|
 * | orangeds | OrangeDS|
 * | parcelforce | Parcelforce|
 * | parcel | Parcel|
 * | passport | Passport|
 * | pcf | PCF|
 * | poste_italiane | Poste Italiane |
 * | posti | Posti|
 * | purolator | Purolator|
 * | royal_mail | Royal Mail|
 * | rr_donnelley | ePost Global|
 * | russian_post | Russian Post|
 * | sendle | Sendle|
 * | skypostal | SkyPostal|
 * | stuart | Stuart|
 * | swyft | Swyft|
 * | uds | UDS (United Delivery Service)|
 * | ups | UPS|
 * | usps | USPS|
 * | veho | Veho |
 * | x_delivery | X Delivery (now Maergo)|
 * | yodel | Yodel|
 * 
 */
public enum CarriersEnum {
    AIRTERRA("airterra"),
    APC_POSTAL("apc_postal"),
    APG("apg"),
    ARAMEX("aramex"),
    ASENDIA_US("asendia_us"),
    AUSTRALIA_POST("australia_post"),
    AXLEHIRE("axlehire"),
    BETTER_TRUCKS("better_trucks"),
    BORDERGURU("borderguru"),
    BOXBERRY("boxberry"),
    BRING("bring"),
    CANADA_POST("canada_post"),
    CDL("cdl"),
    CHRONOPOST("chronopost"),
    COLLECT_PLUS("collect_plus"),
    CORREIOS_BR("correios_br"),
    CORREOS_ESPANA("correos_espana"),
    COURIERSPLEASE("couriersplease"),
    COLISSIMO("colissimo"),
    DEUTSCHE_POST("deutsche_post"),
    DHL_BENELUX("dhl_benelux"),
    DHL_ECOMMERCE("dhl_ecommerce"),
    DHL_EXPRESS("dhl_express"),
    DHL_GERMANY_C2C("dhl_germany_c2c"),
    DHL_GERMANY("dhl_germany"),
    DPD_DE("dpd_de"),
    DPD_UK("dpd_uk"),
    ESTAFETA("estafeta"),
    FASTWAY_AUSTRALIA("fastway_australia"),
    FEDEX("fedex"),
    GLOBEGISTICS("globegistics"),
    GLS_US("gls_us"),
    GOPHR("gophr"),
    GSO("gso"),
    HERMES_GERMANY_B2C("hermes_germany_b2c"),
    HERMES_UK("hermes_uk"),
    HONGKONG_POST("hongkong_post"),
    LASERSHIP("lasership"),
    LSO("lso"),
    MONDIAL_RELAY("mondial_relay"),
    NEW_ZEALAND_POST("new_zealand_post"),
    NIPPON_EXPRESS("nippon_express"),
    ONTRAC("ontrac"),
    ORANGEDS("orangeds"),
    PARCELFORCE("parcelforce"),
    PARCEL("parcel"),
    PASSPORT("passport"),
    PCF("pcf"),
    POSTE_ITALIANE("poste_italiane"),
    POSTI("posti"),
    PUROLATOR("purolator"),
    ROYAL_MAIL("royal_mail"),
    RR_DONNELLEY("rr_donnelley"),
    RUSSIAN_POST("russian_post"),
    SENDLE("sendle"),
    SKYPOSTAL("skypostal"),
    STUART("stuart"),
    SWYFT("swyft"),
    UDS("uds"),
    UPS("ups"),
    USPS("usps"),
    VEHO("veho"),
    X_DELIVERY("x_delivery"),
    YODEL("yodel");

    @JsonValue
    private final String value;

    private CarriersEnum(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
