# WebhookPaginatedList


## Fields

| Field                                               | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `next`                                              | *Optional<String>*                                  | :heavy_minus_sign:                                  | N/A                                                 | baseurl?page=3&results=10                           |
| `previous`                                          | *Optional<String>*                                  | :heavy_minus_sign:                                  | N/A                                                 | baseurl?page=1&results=10                           |
| `count`                                             | *Optional<Long>*                                    | :heavy_minus_sign:                                  | N/A                                                 |                                                     |
| `results`                                           | List<[Webhook](../../models/components/Webhook.md)> | :heavy_minus_sign:                                  | N/A                                                 |                                                     |