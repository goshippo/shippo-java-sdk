# LabelFileTypeEnum

Print format of the [label](https://docs.goshippo.com/docs/shipments/shippinglabelsizes/). If empty, will use the default format set from 
[the Shippo dashboard.](https://apps.goshippo.com/settings/labels)

## Example Usage

```java
import com.goshippo.shippo_sdk.models.components.LabelFileTypeEnum;

LabelFileTypeEnum value = LabelFileTypeEnum.PNG;
```


## Values

| Name        | Value       |
| ----------- | ----------- |
| `PNG`       | PNG         |
| `PNG23X75`  | PNG_2.3x7.5 |
| `PDF`       | PDF         |
| `PDF23X75`  | PDF_2.3x7.5 |
| `PDF4X6`    | PDF_4x6     |
| `PDF4X8`    | PDF_4x8     |
| `PDF_A4`    | PDF_A4      |
| `PDF_A5`    | PDF_A5      |
| `PDF_A6`    | PDF_A6      |
| `ZPLII`     | ZPLII       |