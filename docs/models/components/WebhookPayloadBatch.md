# WebhookPayloadBatch

Content of the webhook posted to the external URL


## Fields

| Field                                                                                                 | Type                                                                                                  | Required                                                                                              | Description                                                                                           |
| ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| `event`                                                                                               | [Optional\<WebhookEventTypeEnum>](../../models/components/WebhookEventTypeEnum.md)                    | :heavy_minus_sign:                                                                                    | Type of event that triggered the webhook.                                                             |
| `test`                                                                                                | *Optional\<Boolean>*                                                                                  | :heavy_minus_sign:                                                                                    | Determines whether the webhook is a test webhook or not.                                              |
| `data`                                                                                                | *Optional\<String>*                                                                                   | :heavy_minus_sign:                                                                                    | A string containing the batch object ID, of the form 'batch {batchId} (created\|processing complete)'. |