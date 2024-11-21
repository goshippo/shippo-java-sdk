package com.goshippo.sdk;

import com.goshippo.sdk.models.components.Address;
import com.goshippo.sdk.models.components.ShipmentPaginatedList;
import com.goshippo.sdk.models.operations.ListShipmentsRequest;
import com.goshippo.sdk.models.operations.ListShipmentsResponse;
import org.junit.jupiter.api.Test;

import java.util.List;

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
        assertInstanceOf(ShipmentPaginatedList.class, paginatedList);
        assertNotNull(paginatedList);

        final var results = paginatedList.results().get();
        assertInstanceOf(List.class, results);
        assertNotNull(results);
        if (!results.isEmpty()) {
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
}
