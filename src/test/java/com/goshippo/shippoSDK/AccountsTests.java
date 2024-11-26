package com.goshippo.shippoSDK;

import com.goshippo.shippoSDK.models.components.ShippoAccountPaginatedList;
import com.goshippo.shippoSDK.models.operations.ListShippoAccountsResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AccountsTests extends SdkProvider {

    @Test
    public void shouldListAllAccounts() throws Exception {
        final var response = getSdk().shippoAccounts().list()
                .page(1L)
                .results(25L)
                .shippoApiVersion("2018-02-08")
                .call();

        assertInstanceOf(ListShippoAccountsResponse.class, response);
        assertNotNull(response);

        final var paginatedList = response.shippoAccountPaginatedList().get();
        assertInstanceOf(ShippoAccountPaginatedList.class, paginatedList);
        assertNotNull(paginatedList);

        final var results = paginatedList.results().get();
        assertNotNull(results);
        if (!results.isEmpty()) {
            for (var result : results) {
                assertInstanceOf(String.class, result.objectId().get());
                assertInstanceOf(String.class, result.email());
                assertInstanceOf(String.class, result.firstName());

                assertNotNull(result.objectId());
                assertNotNull(result.email());
                assertNotNull(result.firstName());
            }
        }
    }
}
