# UPSConnectExistingOwnAccountParameters

An array of additional parameters for the account, such as e.g. password or token.
Please check the <a href="https://docs.goshippo.com/docs/carriers/carrieraccounts/">carrier accounts tutorial</a> page for the parameters per carrier.<br> 
To protect account information, this field will be masked in any API response.


## Fields

| Field                                                                                                                                                                           | Type                                                                                                                                                                            | Required                                                                                                                                                                        | Description                                                                                                                                                                     | Example                                                                                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `accountNumber`                                                                                                                                                                 | *String*                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                              | The UPS account number                                                                                                                                                          | 94567e                                                                                                                                                                          |
| `aiaCountryIso2`                                                                                                                                                                | *Optional<? extends String>*                                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                              | Only required if has_invoice is true. Country associated with the account that issued the invoice                                                                               | US                                                                                                                                                                              |
| `billingAddressCity`                                                                                                                                                            | *String*                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                              | N/A                                                                                                                                                                             | San Francisco                                                                                                                                                                   |
| `billingAddressCountryIso2`                                                                                                                                                     | *String*                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                              | N/A                                                                                                                                                                             | US                                                                                                                                                                              |
| `billingAddressState`                                                                                                                                                           | *String*                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                              | N/A                                                                                                                                                                             | CA                                                                                                                                                                              |
| `billingAddressStreet1`                                                                                                                                                         | *String*                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                              | N/A                                                                                                                                                                             | 731 Market St                                                                                                                                                                   |
| `billingAddressStreet2`                                                                                                                                                         | *Optional<? extends String>*                                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                              | Empty string acceptable for billing_address_street2                                                                                                                             | STE 200                                                                                                                                                                         |
| `billingAddressZip`                                                                                                                                                             | *String*                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                              | N/A                                                                                                                                                                             | 94103                                                                                                                                                                           |
| `collecCountryIso2`                                                                                                                                                             | *String*                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                              | N/A                                                                                                                                                                             | US                                                                                                                                                                              |
| `collecZip`                                                                                                                                                                     | *String*                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                              | Zip code of the collection/pickup address                                                                                                                                       | 94103                                                                                                                                                                           |
| `company`                                                                                                                                                                       | *String*                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                              | Company name. Full name is acceptable in this field if the user has no company name                                                                                             | Shippo                                                                                                                                                                          |
| `currencyCode`                                                                                                                                                                  | *Optional<? extends String>*                                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                              | Only required if has_invoice is true. 3-letter currency code associated with invoice_value                                                                                      | USD                                                                                                                                                                             |
| `email`                                                                                                                                                                         | *String*                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                              | N/A                                                                                                                                                                             | hippo@shippo.com                                                                                                                                                                |
| `fullName`                                                                                                                                                                      | *String*                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                              | N/A                                                                                                                                                                             | Shippo Meister                                                                                                                                                                  |
| `hasInvoice`                                                                                                                                                                    | *boolean*                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                              | true if user has been issued a UPS invoice within the past 90 days for the US or Canada; and 45 days for any other countries. User can use data from any of the last 3 invoices |                                                                                                                                                                                 |
| `invoiceControlid`                                                                                                                                                              | *Optional<? extends String>*                                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                              | Only required if aia_country_iso2 is US and has_invoice is true.                                                                                                                | 1234                                                                                                                                                                            |
| `invoiceDate`                                                                                                                                                                   | *Optional<? extends String>*                                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                              | Only required if has_invoice is true. Date the invoice was issued. yyyymmdd format                                                                                              | 20210529                                                                                                                                                                        |
| `invoiceNumber`                                                                                                                                                                 | *Optional<? extends String>*                                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                              | N/A                                                                                                                                                                             | 1112234                                                                                                                                                                         |
| `invoiceValue`                                                                                                                                                                  | *Optional<? extends String>*                                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                              | Only required if has_invoice is true. Max 16 digits before decimal and 2 digits after decimal                                                                                   | 11.23                                                                                                                                                                           |
| `phone`                                                                                                                                                                         | *String*                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                              | N/A                                                                                                                                                                             | 1112223333                                                                                                                                                                      |
| `title`                                                                                                                                                                         | *String*                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                              | User's title, e.g. including but not limited to Manager, Doctor, Artist, Engineer, Mr, Ms, Mrs, Mx                                                                              | Manager                                                                                                                                                                         |
| `upsAgreements`                                                                                                                                                                 | *boolean*                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                              | Whether the user agrees to the UPS terms and conditions or not. Error 400 will be returned if passed in as false                                                                |                                                                                                                                                                                 |