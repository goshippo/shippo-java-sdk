# CarrierParcelTemplate


## Fields

| Field                                                                                                                            | Type                                                                                                                             | Required                                                                                                                         | Description                                                                                                                      | Example                                                                                                                          |
| -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| `carrier`                                                                                                                        | *Optional<? extends String>*                                                                                                     | :heavy_minus_sign:                                                                                                               | The name of the carrier that provides this parcel template                                                                       | FedEx                                                                                                                            |
| `distanceUnit`                                                                                                                   | [Optional<? extends com.shippo.shippo_java_sdk.models.components.DistanceUnitEnum>](../../models/components/DistanceUnitEnum.md) | :heavy_minus_sign:                                                                                                               | The measure unit used for length, width and height.                                                                              | in                                                                                                                               |
| `height`                                                                                                                         | *Optional<? extends String>*                                                                                                     | :heavy_minus_sign:                                                                                                               | The height of the package, in units specified by the distance_unit attribute                                                     | 1.5                                                                                                                              |
| `isVariableDimensions`                                                                                                           | *Optional<? extends String>*                                                                                                     | :heavy_minus_sign:                                                                                                               | True if the carrier parcel template allows custom dimensions, such as USPS Softpack.                                             | false                                                                                                                            |
| `length`                                                                                                                         | *Optional<? extends String>*                                                                                                     | :heavy_minus_sign:                                                                                                               | The length of the package, in units specified by the distance_unit attribute                                                     | 12.375                                                                                                                           |
| `name`                                                                                                                           | *Optional<? extends String>*                                                                                                     | :heavy_minus_sign:                                                                                                               | The name of the carrier parcel template                                                                                          | FedEx® Small Box (S1)                                                                                                            |
| `token`                                                                                                                          | *Optional<? extends String>*                                                                                                     | :heavy_minus_sign:                                                                                                               | The unique string representation of the carrier parcel template                                                                  | FedEx_Box_Small_1                                                                                                                |
| `width`                                                                                                                          | *Optional<? extends String>*                                                                                                     | :heavy_minus_sign:                                                                                                               | The width of the package, in units specified by the distance_unit attribute                                                      | 10.875                                                                                                                           |