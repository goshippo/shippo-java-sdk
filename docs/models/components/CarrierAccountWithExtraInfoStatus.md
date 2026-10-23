# CarrierAccountWithExtraInfoStatus

Current authentication status. Possible values: 'disconnected' (authorization lost, reconnect needed), 'connected' (authorized and active), 'authorization_pending' (awaiting initial authorization flow).

## Example Usage

```java
import com.goshippo.shippo_sdk.models.components.CarrierAccountWithExtraInfoStatus;

CarrierAccountWithExtraInfoStatus value = CarrierAccountWithExtraInfoStatus.DISCONNECTED;
```


## Values

| Name                    | Value                   |
| ----------------------- | ----------------------- |
| `DISCONNECTED`          | disconnected            |
| `CONNECTED`             | connected               |
| `AUTHORIZATION_PENDING` | authorization_pending   |