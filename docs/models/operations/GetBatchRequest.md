# GetBatchRequest


## Fields

| Field                                                         | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `batchId`                                                     | *String*                                                      | :heavy_check_mark:                                            | Object ID of the batch                                        |
| `page`                                                        | *Optional\<Long>*                                             | :heavy_minus_sign:                                            | The page number you want to select                            |
| `results`                                                     | *Optional\<Long>*                                             | :heavy_minus_sign:                                            | The number of results to return per page (max 100, default 5) |