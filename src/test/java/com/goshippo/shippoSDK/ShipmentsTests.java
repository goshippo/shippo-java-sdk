package com.goshippo.shippoSDK;

import com.goshippo.shippoSDK.models.components.Address;
import com.goshippo.shippoSDK.models.components.Shipment;
import com.goshippo.shippoSDK.models.components.ShipmentPaginatedList;
import com.goshippo.shippoSDK.models.operations.ListShipmentsRequest;
import com.goshippo.shippoSDK.models.operations.ListShipmentsResponse;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ShipmentsTests extends SdkProvider {

    @Test
    public void shouldListAllShipments() throws Exception {
        final var request = ListShipmentsRequest.builder()
                .build();

        final var response = getSdk().shipments().list()
                .request(request)
                .call();

        assertInstanceOf(ListShipmentsResponse.class, response);
        assertNotNull(response);

        final var paginatedList = response.shipmentPaginatedList().get();
        assertShipmentPaginatedList(paginatedList);
    }

    @Test
    public void shouldListAllShipmentsWithPageToken() throws Exception {
        final var request = ListShipmentsRequest.builder()
                .page(1L)
                .results(2L)
                .build();

        final var response = getSdk().shipments().list()
                .request(request)
                .call();

        assertInstanceOf(ListShipmentsResponse.class, response);
        assertNotNull(response);

        final var paginatedList = response.shipmentPaginatedList().get();
        assertShipmentPaginatedList(paginatedList);

        if (paginatedList.next().isPresent()) {
            final var nextUrl = paginatedList.next();
            final var pattern = Pattern.compile("page_token=([^&]+)");
            final var matcher = pattern.matcher(nextUrl.get());
            if (matcher.find()) {
                String pageToken = matcher.group(1);

                final var secondRequest = ListShipmentsRequest.builder()
                        .pageToken(pageToken)
                        .page(2L)
                        .results(2L)
                        .build();

                final var secondResponse = getSdk().shipments().list()
                        .request(secondRequest)
                        .call();

                assertInstanceOf(ListShipmentsResponse.class, secondResponse);
                assertNotNull(secondResponse);

                final var secondPaginatedList = secondResponse.shipmentPaginatedList().get();
                assertShipmentPaginatedList(secondPaginatedList);
            }
        }
    }

    private void assertShipmentPaginatedList(ShipmentPaginatedList paginatedList) {
        assertNotNull(paginatedList);
        final var results = paginatedList.results().get();
        assertInstanceOf(List.class, results);
        assertNotNull(results);
        if (!results.isEmpty()) {
            assertShipmentResults(results);
        }
    }

    private void assertShipmentResults(List<Shipment> results) {
        for (var result : results) {
            assertInstanceOf(String.class, result.objectId());
            assertInstanceOf(String.class, result.objectOwner());
            assertInstanceOf(Address.class, result.addressTo());
            assertInstanceOf(Address.class, result.addressFrom());

            assertNotNull(result.objectId());
            assertNotNull(result.objectOwner());
            assertNotNull(result.addressTo());
            assertNotNull(result.addressFrom());
        }
    }
}
