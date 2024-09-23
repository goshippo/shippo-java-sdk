# WebhookPayloadTransaction

Content of the webhook posted to the external URL


## Fields

| Field                                                                             | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `event`                                                                           | [Optional<WebhookEventTypeEnum>](../../models/components/WebhookEventTypeEnum.md) | :heavy_minus_sign:                                                                | Type of event that triggered the webhook.                                         |
| `test`                                                                            | *Optional<Boolean>*                                                               | :heavy_minus_sign:                                                                | Determines whether the webhook is a test webhook or not.                          |
| `data`                                                                            | [Optional<Transaction>](../../models/components/Transaction.md)                   | :heavy_minus_sign:                                                                | N/A                                                                               |