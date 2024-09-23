# DangerousGoodsObject

Container for specifying the presence of dangerous materials. This is specific to USPS, and if any contents
are provided, only certain USPS service levels will be eligible. For more information, see our
<a href="https://docs.goshippo.com/docs/shipments/hazmat/">guide on hazardous or dangerous materials shipping</a>.


## Fields

| Field                                                                                                     | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `contains`                                                                                                | *Optional<Boolean>*                                                                                       | :heavy_minus_sign:                                                                                        | Indicates if the shipment contains dangerous goods.                                                       |
| `biologicalMaterial`                                                                                      | [Optional<DangerousGoodsBiologicalMaterial>](../../models/components/DangerousGoodsBiologicalMaterial.md) | :heavy_minus_sign:                                                                                        | Container for specifying the presence of biological material.                                             |
| `lithiumBatteries`                                                                                        | [Optional<DangerousGoodsLithiumBatteries>](../../models/components/DangerousGoodsLithiumBatteries.md)     | :heavy_minus_sign:                                                                                        | Container for specifying the presence of lithium batteries.                                               |