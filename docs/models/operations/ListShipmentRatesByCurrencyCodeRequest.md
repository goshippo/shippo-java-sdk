# ListShipmentRatesByCurrencyCodeRequest


## Fields

| Field                                                | Type                                                 | Required                                             | Description                                          | Example                                              |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `shipmentId`                                         | *String*                                             | :heavy_check_mark:                                   | Object ID of the shipment to update                  |                                                      |
| `currencyCode`                                       | *String*                                             | :heavy_check_mark:                                   | ISO currency code for the rates                      |                                                      |
| `page`                                               | *Optional<Long>*                                     | :heavy_minus_sign:                                   | The page number you want to select                   |                                                      |
| `results`                                            | *Optional<Long>*                                     | :heavy_minus_sign:                                   | The number of results to return per page (max 100)   |                                                      |
| `shippoApiVersion`                                   | *Optional<String>*                                   | :heavy_minus_sign:                                   | String used to pick a non-default API version to use | 2018-02-08                                           |