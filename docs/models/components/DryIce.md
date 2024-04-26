# DryIce

Specify that the package contains Dry Ice (FedEx, Veho, and UPS only).


## Fields

| Field                                                                         | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `containsDryIce`                                                              | *Optional<? extends Boolean>*                                                 | :heavy_minus_sign:                                                            | Mandatory. Specifies that the package contains Dry Ice.                       |
| `weight`                                                                      | *Optional<? extends String>*                                                  | :heavy_minus_sign:                                                            | Mandatory. Units must be in Kilograms. Cannot be greater than package weight. |