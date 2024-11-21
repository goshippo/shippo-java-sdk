
package com.goshippo.sdk.hooks;

//
// This file is written once by speakeasy code generation and
// thereafter will not be overwritten by speakeasy updates. As a
// consequence any customization of this class will be preserved.
//

import com.goshippo.sdk.utils.Utils;

import java.util.Optional;

public final class SDKHooks {

    private SDKHooks() {
        // prevent instantiation
    }

    public static void initialize(com.goshippo.sdk.utils.Hooks hooks) {
        hooks.registerBeforeRequest((context, request) -> {
            Optional<String> authHeader = request.headers().firstValue("authorization");
            if (authHeader.isPresent() && authHeader.get().startsWith("shippo_")) {
                return Utils.copy(request)
                        .setHeader("Authorization", "ShippoToken " + authHeader.get())
                        .build();
            } else {
                return request;
            }
        });
    }

}
