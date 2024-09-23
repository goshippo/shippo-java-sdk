/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk.models.operations;

import com.shippo.sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetTransactionRequestBuilder {

    private String transactionId;
    private Optional<String> shippoApiVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetTransaction sdk;

    public GetTransactionRequestBuilder(SDKMethodInterfaces.MethodCallGetTransaction sdk) {
        this.sdk = sdk;
    }

    public GetTransactionRequestBuilder transactionId(String transactionId) {
        Utils.checkNotNull(transactionId, "transactionId");
        this.transactionId = transactionId;
        return this;
    }
                
    public GetTransactionRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public GetTransactionRequestBuilder shippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public GetTransactionResponse call() throws Exception {

        return sdk.get(
            transactionId,
            shippoApiVersion);
    }
}
