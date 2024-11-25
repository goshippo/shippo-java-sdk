package com.goshippo.sdk;

import com.goshippo.sdk.models.components.Batch;
import com.goshippo.sdk.models.operations.CreateBatchResponse;
import com.goshippo.sdk.models.operations.GetBatchResponse;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BatchesTests extends SdkProvider {

    private final Generator generator = new Generator();
    private static String BATCH_OBJECT_ID;

    @Test
    @Order(1)
    public void shouldCreateBatch() throws Exception {

        final var shipment = generator.buildShipmentCreateRequest();

        final var request = generator.buildBatchCreateRequest(
                shipment,
                getDefaultCarrierAccountObjectId());

        final var response = getSdk().batches().create()
                .shippoApiVersion("2018-02-08")
                .batchCreateRequest(request)
                .call();

        assertNotNull(response);
        assertInstanceOf(CreateBatchResponse.class, response);

        final var batch = response.batch().get();
        assertNotNull(batch);
        assertInstanceOf(Batch.class, batch);

        assertNotNull(batch.objectId());
        BATCH_OBJECT_ID = batch.objectId();
    }

    @Test
    @Order(2)
    public void shouldListAllBatches() throws Exception {
        final var response = getSdk().batches().get()
                .batchId(BATCH_OBJECT_ID)
                .page(1L)
                .results(5L)
                .call();

        assertNotNull(response);
        assertInstanceOf(GetBatchResponse.class, response);

        final var batch = response.batch().get();
        assertNotNull(batch);
        assertInstanceOf(Batch.class, batch);

        assertNotNull(batch.objectId());
        assertNotNull(batch.objectOwner());
        assertNotNull(batch.batchShipments());
    }
}
