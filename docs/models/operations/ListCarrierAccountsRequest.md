# ListCarrierAccountsRequest


## Fields

| Field                                                                                                                    | Type                                                                                                                     | Required                                                                                                                 | Description                                                                                                              | Example                                                                                                                  |
| ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------ |
| `serviceLevels`                                                                                                          | *Optional<? extends Boolean>*                                                                                            | :heavy_minus_sign:                                                                                                       | Appends the property `service_levels` to each returned carrier account                                                   |                                                                                                                          |
| `carrier`                                                                                                                | [Optional<? extends com.shippo.shippo_java_sdk.models.components.CarriersEnum>](../../models/components/CarriersEnum.md) | :heavy_minus_sign:                                                                                                       | Filter the response by the specified carrier                                                                             |                                                                                                                          |
| `accountId`                                                                                                              | *Optional<? extends String>*                                                                                             | :heavy_minus_sign:                                                                                                       | Filter the response by the specified carrier account Id                                                                  |                                                                                                                          |
| `page`                                                                                                                   | *Optional<? extends Long>*                                                                                               | :heavy_minus_sign:                                                                                                       | The page number you want to select                                                                                       |                                                                                                                          |
| `results`                                                                                                                | *Optional<? extends Long>*                                                                                               | :heavy_minus_sign:                                                                                                       | The number of results to return per page (max 100, default 5)                                                            |                                                                                                                          |
| `shippoApiVersion`                                                                                                       | *Optional<? extends String>*                                                                                             | :heavy_minus_sign:                                                                                                       | String used to pick a non-default API version to use                                                                     | 2018-02-08                                                                                                               |