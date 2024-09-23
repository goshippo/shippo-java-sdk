# RemoveShipmentsFromBatchRequest


## Fields

| Field                                                  | Type                                                   | Required                                               | Description                                            | Example                                                |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `batchId`                                              | *String*                                               | :heavy_check_mark:                                     | Object ID of the batch                                 |                                                        |
| `shippoApiVersion`                                     | *Optional<String>*                                     | :heavy_minus_sign:                                     | String used to pick a non-default API version to use   | 2018-02-08                                             |
| `requestBody`                                          | List<*String*>                                         | :heavy_check_mark:                                     | Array of shipments object ids to remove from the batch |                                                        |