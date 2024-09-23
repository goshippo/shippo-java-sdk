# ListCarrierParcelTemplatesRequest


## Fields

| Field                                                   | Type                                                    | Required                                                | Description                                             | Example                                                 |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `include`                                               | [Optional<Include>](../../models/operations/Include.md) | :heavy_minus_sign:                                      | filter by user or enabled                               |                                                         |
| `carrier`                                               | *Optional<String>*                                      | :heavy_minus_sign:                                      | filter by specific carrier                              | fedex                                                   |
| `shippoApiVersion`                                      | *Optional<String>*                                      | :heavy_minus_sign:                                      | String used to pick a non-default API version to use    | 2018-02-08                                              |