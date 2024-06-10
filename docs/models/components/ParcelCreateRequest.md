# ParcelCreateRequest


## Fields

| Field                                                                                                                                                   | Type                                                                                                                                                    | Required                                                                                                                                                | Description                                                                                                                                             | Example                                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `distanceUnit`                                                                                                                                          | [com.shippo.shippo_java_sdk.models.components.DistanceUnitEnum](../../models/components/DistanceUnitEnum.md)                                            | :heavy_check_mark:                                                                                                                                      | The measure unit used for length, width and height.                                                                                                     | in                                                                                                                                                      |
| `height`                                                                                                                                                | *String*                                                                                                                                                | :heavy_check_mark:                                                                                                                                      | **Required if template is not specified**<br><br/>Height of the parcel. Up to six digits in front and four digits after the decimal separator are accepted. | 1                                                                                                                                                       |
| `length`                                                                                                                                                | *String*                                                                                                                                                | :heavy_check_mark:                                                                                                                                      | **Required if template is not specified**<br><br/>Length of the Parcel. Up to six digits in front and four digits after the decimal separator are accepted. | 1                                                                                                                                                       |
| `massUnit`                                                                                                                                              | [com.shippo.shippo_java_sdk.models.components.WeightUnitEnum](../../models/components/WeightUnitEnum.md)                                                | :heavy_check_mark:                                                                                                                                      | The unit used for weight.                                                                                                                               | lb                                                                                                                                                      |
| `template`                                                                                                                                              | [Optional<? extends com.shippo.shippo_java_sdk.models.components.ParcelTemplateEnumSet>](../../models/components/ParcelTemplateEnumSet.md)              | :heavy_minus_sign:                                                                                                                                      | If template is passed, `length`, `width`, `height`, and `distance_unit` are not required                                                                |                                                                                                                                                         |
| `weight`                                                                                                                                                | *String*                                                                                                                                                | :heavy_check_mark:                                                                                                                                      | Weight of the parcel. Up to six digits in front and four digits after the decimal separator are accepted.                                               | 1                                                                                                                                                       |
| `width`                                                                                                                                                 | *String*                                                                                                                                                | :heavy_check_mark:                                                                                                                                      | **Required if template is not specified**<br><br/>Width of the Parcel. Up to six digits in front and four digits after the decimal separator are accepted. | 1                                                                                                                                                       |
| `metadata`                                                                                                                                              | *Optional<? extends String>*                                                                                                                            | :heavy_minus_sign:                                                                                                                                      | N/A                                                                                                                                                     | Customer ID 123456                                                                                                                                      |