package com.goshippo.shippoSDK.hooks;

//
// This file is written once by speakeasy code generation and 
// thereafter will not be overwritten by speakeasy updates. As a
// consequence any customization of this class will be preserved.
//

import com.goshippo.shippoSDK.utils.Hooks;
import com.goshippo.shippoSDK.utils.Utils;

import java.util.Optional;

public final class SDKHooks {

    private SDKHooks() {
        // prevent instantiation
    }

    public static void initialize(Hooks hooks) {
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
