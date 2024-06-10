# ConnectExistingOwnAccountRequest


## Fields

| Field                                                                                                                                                            | Type                                                                                                                                                             | Required                                                                                                                                                         | Description                                                                                                                                                      | Example                                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `accountId`                                                                                                                                                      | *String*                                                                                                                                                         | :heavy_check_mark:                                                                                                                                               | N/A                                                                                                                                                              | 321123                                                                                                                                                           |
| `active`                                                                                                                                                         | *Optional<? extends Boolean>*                                                                                                                                    | :heavy_minus_sign:                                                                                                                                               | N/A                                                                                                                                                              |                                                                                                                                                                  |
| `carrier`                                                                                                                                                        | *String*                                                                                                                                                         | :heavy_check_mark:                                                                                                                                               | N/A                                                                                                                                                              | fedex                                                                                                                                                            |
| `metadata`                                                                                                                                                       | *Optional<? extends String>*                                                                                                                                     | :heavy_minus_sign:                                                                                                                                               | N/A                                                                                                                                                              | FEDEX Account                                                                                                                                                    |
| `parameters`                                                                                                                                                     | [com.shippo.shippo_java_sdk.models.components.ConnectExistingOwnAccountRequestParameters](../../models/components/ConnectExistingOwnAccountRequestParameters.md) | :heavy_check_mark:                                                                                                                                               | N/A                                                                                                                                                              |                                                                                                                                                                  |
| `test`                                                                                                                                                           | *Optional<? extends Boolean>*                                                                                                                                    | :heavy_minus_sign:                                                                                                                                               | N/A                                                                                                                                                              | false                                                                                                                                                            |