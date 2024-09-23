# LiveRatePaginatedList


## Fields

| Field                                                 | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `next`                                                | *Optional<String>*                                    | :heavy_minus_sign:                                    | N/A                                                   | baseurl?page=3&results=10                             |
| `previous`                                            | *Optional<String>*                                    | :heavy_minus_sign:                                    | N/A                                                   | baseurl?page=1&results=10                             |
| `count`                                               | *Optional<Long>*                                      | :heavy_minus_sign:                                    | N/A                                                   | 123                                                   |
| `results`                                             | List<[LiveRate](../../models/components/LiveRate.md)> | :heavy_minus_sign:                                    | N/A                                                   |                                                       |