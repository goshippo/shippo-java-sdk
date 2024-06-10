# CarrierAccountCanadaPostCreateParameters


## Fields

| Field                                                                                                          | Type                                                                                                           | Required                                                                                                       | Description                                                                                                    | Example                                                                                                        |
| -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| `canadaPostTerms`                                                                                              | *boolean*                                                                                                      | :heavy_check_mark:                                                                                             | Whether or not the user agrees to Canada Post's terms. If passed in as false, request will fail with error 400 |                                                                                                                |
| `company`                                                                                                      | *String*                                                                                                       | :heavy_check_mark:                                                                                             | N/A                                                                                                            | Shippo                                                                                                         |
| `email`                                                                                                        | *String*                                                                                                       | :heavy_check_mark:                                                                                             | N/A                                                                                                            | hippo@shippo.com                                                                                               |
| `fullName`                                                                                                     | *String*                                                                                                       | :heavy_check_mark:                                                                                             | N/A                                                                                                            | Shippo Meister                                                                                                 |
| `phone`                                                                                                        | *String*                                                                                                       | :heavy_check_mark:                                                                                             | Needs to be a valid phone number and cannot be null                                                            | 1112223333                                                                                                     |