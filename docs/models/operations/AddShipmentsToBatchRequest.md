# AddShipmentsToBatchRequest


## Fields

| Field                                                                                      | Type                                                                                       | Required                                                                                   | Description                                                                                |
| ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ |
| `batchId`                                                                                  | *String*                                                                                   | :heavy_check_mark:                                                                         | Object ID of the batch                                                                     |
| `requestBody`                                                                              | List\<[BatchShipmentCreateRequest](../../models/components/BatchShipmentCreateRequest.md)> | :heavy_check_mark:                                                                         | Array of shipments to add to the batch                                                     |