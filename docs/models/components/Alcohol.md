# Alcohol

Indicates that a shipment contains Alcohol (Fedex and UPS only).


## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `containsAlcohol`                                                               | *Optional<Boolean>*                                                             | :heavy_minus_sign:                                                              | Mandatory for Fedex and UPS. Specifies that the package contains Alcohol.       |
| `recipientType`                                                                 | [Optional<RecipientType>](../../models/components/RecipientType.md)             | :heavy_minus_sign:                                                              | Mandatory for Fedex only. License type of the recipient of the Alcohol Package. |