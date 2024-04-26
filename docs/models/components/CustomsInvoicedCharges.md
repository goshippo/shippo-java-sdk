# CustomsInvoicedCharges

Additional invoiced charges to be shown on the Customs Declaration Commercial Invoice.


## Fields

| Field                                                                   | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `currency`                                                              | *String*                                                                | :heavy_check_mark:                                                      | Currency for the invoiced charges amounts incurred on the end consumer. |
| `totalShipping`                                                         | *Optional<? extends String>*                                            | :heavy_minus_sign:                                                      | Total shipping paid by the buyer.                                       |
| `totalTaxes`                                                            | *Optional<? extends String>*                                            | :heavy_minus_sign:                                                      | Total taxes paid by the buyer.                                          |
| `totalDuties`                                                           | *Optional<? extends String>*                                            | :heavy_minus_sign:                                                      | Total duties paid by the buyer.                                         |
| `otherFees`                                                             | *Optional<? extends String>*                                            | :heavy_minus_sign:                                                      | Other fees paid by the buyer.                                           |