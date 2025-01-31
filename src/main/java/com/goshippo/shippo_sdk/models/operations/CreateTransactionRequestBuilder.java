/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk.models.operations;

import com.goshippo.shippo_sdk.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class CreateTransactionRequestBuilder {

    private Optional<String> shippoApiVersion = Optional.empty();
    private CreateTransactionRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallCreateTransaction sdk;

    public CreateTransactionRequestBuilder(SDKMethodInterfaces.MethodCallCreateTransaction sdk) {
        this.sdk = sdk;
    }
                
    public CreateTransactionRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public CreateTransactionRequestBuilder shippoApiVersion(Optional<String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public CreateTransactionRequestBuilder requestBody(CreateTransactionRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public CreateTransactionResponse call() throws Exception {

        return sdk.create(
            shippoApiVersion,
            requestBody);
    }
}
