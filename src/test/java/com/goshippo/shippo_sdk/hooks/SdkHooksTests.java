package com.goshippo.shippo_sdk.hooks;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.goshippo.shippo_sdk.Shippo;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SdkHooksTests {

    private static WireMockServer wiremockServer;

    @BeforeAll
    public static void setup() {
        wiremockServer = new WireMockServer(options().dynamicPort());
        wiremockServer.start();
    }

    @AfterAll
    public static void cleanup() {
        wiremockServer.stop();
    }

    @Test
    public void shouldAddPrefixIfApiToken() throws Exception {
        String[] apiTokens = {
                "shippo_test_12345",
                "shippo_live_12345",
                "ShippoToken shippo_test_12345",
                "JWT eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
        };
        boolean[] shouldPrefixValues = {true, true, false, false};

        for (int i = 0; i < apiTokens.length; i++) {
            final var apiToken = apiTokens[i];
            final var shouldPrefix = shouldPrefixValues[i];

            final var sdk = Shippo.builder()
                    .serverURL(wiremockServer.baseUrl())
                    .apiKeyHeader(apiToken)
                    .build();

            wiremockServer.stubFor(get(urlMatching("/addresses.*"))
                    .willReturn(ok("{\"results\": []}").withHeader("Content-Type", "application/json"))
            );

            final var response = sdk.addresses().list().call().addressPaginatedList().get();

            assertTrue(response.results().get().isEmpty());

            final var expectedValue = shouldPrefix ? "ShippoToken " + apiToken : apiToken;
            wiremockServer.verify(getRequestedFor(urlMatching("/addresses.*"))
                    .withHeader("Authorization", equalTo(expectedValue)));
        }
    }
}


