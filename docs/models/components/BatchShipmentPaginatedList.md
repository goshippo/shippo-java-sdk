# BatchShipmentPaginatedList

Array of [BatchShipment](/shippoapi/public-api/batches/batchshipment) objects. 
The response keeps the same order as in the request array.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      | Example                                                          |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `next`                                                           | *Optional\<String>*                                              | :heavy_minus_sign:                                               | N/A                                                              | baseurl?page=3&results=10                                        |
| `previous`                                                       | *Optional\<String>*                                              | :heavy_minus_sign:                                               | N/A                                                              | baseurl?page=1&results=10                                        |
| `results`                                                        | List\<[BatchShipment](../../models/components/BatchShipment.md)> | :heavy_minus_sign:                                               | N/A                                                              |                                                                  |