# CustomsItemCreateRequest


## Fields

| Field                                                                                                                                                                  | Type                                                                                                                                                                   | Required                                                                                                                                                               | Description                                                                                                                                                            | Example                                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `description`                                                                                                                                                          | *String*                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                     | Text description of your item.                                                                                                                                         | T-Shirt                                                                                                                                                                |
| `eccnEar99`                                                                                                                                                            | *Optional<? extends String>*                                                                                                                                           | :heavy_minus_sign:                                                                                                                                                     | Export Control Classification Number, required on some exports from the United States.                                                                                 |                                                                                                                                                                        |
| `massUnit`                                                                                                                                                             | [com.shippo.shippo_java_sdk.models.components.WeightUnitEnum](../../models/components/WeightUnitEnum.md)                                                               | :heavy_check_mark:                                                                                                                                                     | The unit used for weight.                                                                                                                                              | lb                                                                                                                                                                     |
| `metadata`                                                                                                                                                             | *Optional<? extends String>*                                                                                                                                           | :heavy_minus_sign:                                                                                                                                                     | A string of up to 100 characters that can be filled with any additional information you <br/>want to attach to the object.                                             | Order ID "123454"                                                                                                                                                      |
| `netWeight`                                                                                                                                                            | *String*                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                     | Total weight of this item, i.e. quantity * weight per item.                                                                                                            | 5                                                                                                                                                                      |
| `originCountry`                                                                                                                                                        | *String*                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                     | Country of origin of the item. Example: `US` or `DE`. <br/>All accepted values can be found on the <a href="http://www.iso.org/" target="_blank">Official ISO Website</a>. |                                                                                                                                                                        |
| `quantity`                                                                                                                                                             | *long*                                                                                                                                                                 | :heavy_check_mark:                                                                                                                                                     | Quantity of this item in the shipment you send.  Must be greater than 0.                                                                                               | 20                                                                                                                                                                     |
| `skuCode`                                                                                                                                                              | *Optional<? extends String>*                                                                                                                                           | :heavy_minus_sign:                                                                                                                                                     | SKU code of the item, which is required by some carriers.                                                                                                              | HM-123                                                                                                                                                                 |
| `tariffNumber`                                                                                                                                                         | *Optional<? extends String>*                                                                                                                                           | :heavy_minus_sign:                                                                                                                                                     | The tariff number of the item.                                                                                                                                         |                                                                                                                                                                        |
| `valueAmount`                                                                                                                                                          | *String*                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                     | Total value of this item, i.e. quantity * value per item.                                                                                                              | 200                                                                                                                                                                    |
| `valueCurrency`                                                                                                                                                        | *String*                                                                                                                                                               | :heavy_check_mark:                                                                                                                                                     | Currency used for value_amount. The <a href="http://www.xe.com/iso4217.php">official ISO 4217</a> <br/>currency codes are used, e.g.  `USD` or `EUR`.                  | USD                                                                                                                                                                    |