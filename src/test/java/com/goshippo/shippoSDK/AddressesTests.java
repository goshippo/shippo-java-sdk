package com.goshippo.shippoSDK;

import com.goshippo.shippoSDK.models.components.Address;
import com.goshippo.shippoSDK.models.components.AddressCreateRequest;
import com.goshippo.shippoSDK.models.components.AddressPaginatedList;
import com.goshippo.shippoSDK.models.operations.CreateAddressResponse;
import com.goshippo.shippoSDK.models.operations.ListAddressesResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AddressesTests extends SdkProvider {

    @Test
    public void shouldListAllAddresses() throws Exception {
        final var response = getSdk().addresses().list()
                .call();

        assertInstanceOf(ListAddressesResponse.class, response);
        assertNotNull(response.addressPaginatedList());

        final var paginatedList = response.addressPaginatedList().get();
        assertInstanceOf(AddressPaginatedList.class, paginatedList);
        assertNotNull(paginatedList);

        final var results = paginatedList.results().get();
        assertNotNull(results);
        if (!results.isEmpty()) {
            for (var result : results) {
                assertInstanceOf(String.class, result.objectId().get());
                assertInstanceOf(String.class, result.objectOwner().get());
                assertInstanceOf(String.class, result.country());

                assertNotNull(result.objectId());
                assertNotNull(result.objectOwner());
                assertNotNull(result.country());
            }
        }
    }

    @Test public void shouldCreateAddress() throws Exception {
        final var addressCreateRequest = AddressCreateRequest.builder()
                .country("US")
                .name("Shwan Ippotle")
                .company("Shippo")
                .street1("215 Clayton St.")
                .street3("")
                .streetNo("")
                .city("San Francisco")
                .state("CA")
                .zip("94117")
                .phone("+1 555 341 9393")
                .email("shippotle@shippo.com")
                .isResidential(true)
                .metadata("Customer ID 123456")
                .validate(true)
                .build();
        final var response = getSdk().addresses().create()
                .addressCreateRequest(addressCreateRequest)
                .call();

        assertInstanceOf(CreateAddressResponse.class, response);
        assertNotNull(response);

        final var address = response.address().get();
        assertInstanceOf(Address.class, address);

        assertInstanceOf(String.class, address.objectId().get());
        assertInstanceOf(String.class, address.objectOwner().get());

        assertNotNull(address.objectId());
        assertNotNull(address.objectOwner());

        assertEquals(addressCreateRequest.country(), address.country());
        assertEquals(addressCreateRequest.name().get(), address.name().get());
        assertEquals(addressCreateRequest.company().get(), address.company().get());
        assertEquals(addressCreateRequest.state().get(), address.state().get());
        assertEquals(addressCreateRequest.isResidential().get(), address.isResidential().get());
    }
}
