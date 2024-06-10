import com.github.tomakehurst.wiremock.WireMockServer
import com.shippo.sdk.Shippo
import com.shippo.sdk.models.components.AddressPaginatedList
import spock.lang.Shared
import spock.lang.Specification

import static com.github.tomakehurst.wiremock.client.WireMock.*
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options

class HooksSpec extends Specification {

    @Shared
    WireMockServer wiremockServer

    def setupSpec() {
        wiremockServer = new WireMockServer(options().dynamicPort())
        wiremockServer.start()
    }

    def cleanupSpec() {
        wiremockServer.stop()
    }

    def cleanup() {
        wiremockServer.resetAll()
    }

    def "should add prefix if api token"() {
        given:
        Shippo sdk = Shippo.builder()
                .serverURL(wiremockServer.baseUrl())
                .apiKeyHeader(apiToken)
                .build()

        wiremockServer.stubFor(get(urlMatching("/addresses.*")).willReturn(
                ok('{"results": []}').withHeader("Content-Type", "application/json")
        ))

        when:
        AddressPaginatedList response = sdk.addresses().list().call().addressPaginatedList().get()

        then:
        assert response.results().get().isEmpty()
        def expectedValue  = shouldPrefix ? "ShippoToken ${apiToken}" : apiToken
        wiremockServer.verify(getRequestedFor(urlMatching("/addresses.*"))
                .withHeader("Authorization", equalTo(expectedValue)))

        where:
        apiToken                                      | shouldPrefix
        "shippo_test_12345"                           | true
        "shippo_live_12345"                           | true
        "ShippoToken shippo_test_12345"               | false
        "JWT eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..." | false
    }

}
