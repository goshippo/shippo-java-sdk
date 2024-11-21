package com.goshippo.sdk;

import com.goshippo.sdk.models.components.*;
import com.goshippo.sdk.models.operations.ListOrdersRequest;

import com.goshippo.sdk.models.operations.ListOrdersResponse;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OrdersTests extends SdkProvider {

    @Test
    public void shouldListAllOrders() throws Exception {
        final var req = ListOrdersRequest.builder()
                .shopApp(OrderShopAppEnum.SHIPPO)
                .build();

        final var response = getSdk().orders().list()
                .request(req)
                .call();

        assertInstanceOf(ListOrdersResponse.class, response);
        assertNotNull(response.orderPaginatedList());

        final var paginatedList = response.orderPaginatedList().get();
        assertInstanceOf(OrderPaginatedList.class, paginatedList);
        assertNotNull(paginatedList);

        final var results = paginatedList.results().get();
        assertInstanceOf(List.class, results);
        assertNotNull(results);

        if (!results.isEmpty()) {
            for (var order : results) {
                assertInstanceOf(OrderShopAppEnum.class, order.shopApp().get());
                assertInstanceOf(OrderStatusEnum.class, order.orderStatus().get());
                assertInstanceOf(String.class, order.objectId().get());
                assertInstanceOf(Address.class, order.toAddress());
                assertInstanceOf(Address.class, order.fromAddress().get());
                assertInstanceOf(List.class, order.transactions().get());

                assertNotNull(order);
                assertEquals(OrderShopAppEnum.SHIPPO, order.shopApp().get());
                assertNotNull(order.orderStatus().get());
                assertNotNull(order.objectId().get());
                assertNotNull(order.toAddress());
                assertNotNull(order.fromAddress().get());
                assertNotNull(order.transactions().get());
            }
        }
    }
}

