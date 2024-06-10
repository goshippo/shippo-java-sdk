# CustomsExporterIdentification

Additional exporter identification that may be required to ship in certain countries


## Fields

| Field                                                                                                                                                                                                                                                                                                                                                                                  | Type                                                                                                                                                                                                                                                                                                                                                                                   | Required                                                                                                                                                                                                                                                                                                                                                                               | Description                                                                                                                                                                                                                                                                                                                                                                            | Example                                                                                                                                                                                                                                                                                                                                                                                |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `eoriNumber`                                                                                                                                                                                                                                                                                                                                                                           | *Optional<? extends String>*                                                                                                                                                                                                                                                                                                                                                           | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                     | Economic Operators' Registration and Identification (EORI) number. Must start with a 2 character <br/>country code followed by a 6-17 character alphanumeric identifier (e.g. PL1234567890ABCDE).<br/><a href="https://ec.europa.eu/taxation_customs/business/customs-procedures/general-overview/economic-operators-registration-identification-number-eori_en">More information on EORI.</a> | PL123456790ABCDE                                                                                                                                                                                                                                                                                                                                                                       |
| `taxId`                                                                                                                                                                                                                                                                                                                                                                                | [Optional<? extends com.shippo.shippo_java_sdk.models.components.CustomsTaxIdentification>](../../models/components/CustomsTaxIdentification.md)                                                                                                                                                                                                                                       | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                     | Tax identification that may be required to ship in certain countries. Typically used to assess duties on <br/>goods that are crossing a border.                                                                                                                                                                                                                                        |                                                                                                                                                                                                                                                                                                                                                                                        |