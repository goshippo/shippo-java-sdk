/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.shippo_java_sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shippo.shippo_java_sdk.models.errors.SDKError;
import com.shippo.shippo_java_sdk.models.operations.SDKMethodInterfaces.*;
import com.shippo.shippo_java_sdk.utils.HTTPClient;
import com.shippo.shippo_java_sdk.utils.HTTPRequest;
import com.shippo.shippo_java_sdk.utils.Hook.AfterErrorContextImpl;
import com.shippo.shippo_java_sdk.utils.Hook.AfterSuccessContextImpl;
import com.shippo.shippo_java_sdk.utils.Hook.BeforeRequestContextImpl;
import com.shippo.shippo_java_sdk.utils.JSON;
import com.shippo.shippo_java_sdk.utils.Retries.NonRetryableException;
import com.shippo.shippo_java_sdk.utils.SerializedBody;
import com.shippo.shippo_java_sdk.utils.Utils;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A batch is a technique for creating multiple labels at once. Use the  batch object to create and purchase many shipments in two API calls. After creating the batch, retrieve the batch to verify that all shipments are valid. You can add and remove shipments after you have created the batch. When all shipments are valid you can purchase the batch and retrieve all the shipping labels.
 * &lt;SchemaDefinition schemaRef="#/components/schemas/Batch"/&gt;
 * 
 * # Batch Shipment
 * The batch shipment object is a wrapper around a shipment object, which include shipment-specific information 
 * for batch processing.
 * 
 * Note: batch shipments can only be created on the batch endpoint, either when creating a batch object or by through 
 * the `/batches/{BATCH_OBJECT_ID}/add_shipments` endpoint
 * &lt;SchemaDefinition schemaRef="#/components/schemas/BatchShipment"/&gt;
 */
public class Batches implements
            MethodCallCreateBatch,
            MethodCallGetBatch,
            MethodCallAddShipmentsToBatch,
            MethodCallPurchaseBatch,
            MethodCallRemoveShipmentsFromBatch {

    private final SDKConfiguration sdkConfiguration;

    Batches(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * Create a batch
     * Creates a new batch object for purchasing shipping labels for many shipments at once. Batches are created asynchronously. This means that the API response won't include your batch shipments yet. You need to retrieve the batch later to verify that all batch shipments are valid.
     * @return The call builder
     */
    public com.shippo.shippo_java_sdk.models.operations.CreateBatchRequestBuilder create() {
        return new com.shippo.shippo_java_sdk.models.operations.CreateBatchRequestBuilder(this);
    }

    /**
     * Create a batch
     * Creates a new batch object for purchasing shipping labels for many shipments at once. Batches are created asynchronously. This means that the API response won't include your batch shipments yet. You need to retrieve the batch later to verify that all batch shipments are valid.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.shippo_java_sdk.models.operations.CreateBatchResponse createDirect() throws Exception {
        return create(Optional.empty(), Optional.empty());
    }
    /**
     * Create a batch
     * Creates a new batch object for purchasing shipping labels for many shipments at once. Batches are created asynchronously. This means that the API response won't include your batch shipments yet. You need to retrieve the batch later to verify that all batch shipments are valid.
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @param batchCreateRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.shippo_java_sdk.models.operations.CreateBatchResponse create(
            Optional<? extends String> shippoApiVersion,
            Optional<? extends com.shippo.shippo_java_sdk.models.components.BatchCreateRequest> batchCreateRequest) throws Exception {
        com.shippo.shippo_java_sdk.models.operations.CreateBatchRequest request =
            com.shippo.shippo_java_sdk.models.operations.CreateBatchRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .batchCreateRequest(batchCreateRequest)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/batches");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<java.lang.Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "batchCreateRequest", "json", false);
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("CreateBatch", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("CreateBatch", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("CreateBatch", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("CreateBatch", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.shippo.shippo_java_sdk.models.operations.CreateBatchResponse.Builder _resBuilder = 
            com.shippo.shippo_java_sdk.models.operations.CreateBatchResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.shippo.shippo_java_sdk.models.operations.CreateBatchResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                com.shippo.shippo_java_sdk.models.components.Batch _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.shippo.shippo_java_sdk.models.components.Batch>() {});
                _res.withBatch(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }


    /**
     * Retrieve a batch
     * Returns a batch using an object ID. &lt;br&gt; Batch shipments are displayed 100 at a time.  You can iterate 
     * through each `page` using the `?page= query` parameter.  You can also filter based on batch shipment 
     * status, for example, by passing a query param like `?object_results=creation_failed`. &lt;br&gt; 
     * For more details on filtering results, see our guide on &lt;a href="https://docs.goshippo.com/docs/api_concepts/filtering/" target="blank"&gt; filtering&lt;/a&gt;.
     * @return The call builder
     */
    public com.shippo.shippo_java_sdk.models.operations.GetBatchRequestBuilder get() {
        return new com.shippo.shippo_java_sdk.models.operations.GetBatchRequestBuilder(this);
    }

    /**
     * Retrieve a batch
     * Returns a batch using an object ID. &lt;br&gt; Batch shipments are displayed 100 at a time.  You can iterate 
     * through each `page` using the `?page= query` parameter.  You can also filter based on batch shipment 
     * status, for example, by passing a query param like `?object_results=creation_failed`. &lt;br&gt; 
     * For more details on filtering results, see our guide on &lt;a href="https://docs.goshippo.com/docs/api_concepts/filtering/" target="blank"&gt; filtering&lt;/a&gt;.
     * @param batchId Object ID of the batch
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.shippo_java_sdk.models.operations.GetBatchResponse get(
            String batchId) throws Exception {
        return get(batchId, Optional.empty());
    }
    /**
     * Retrieve a batch
     * Returns a batch using an object ID. &lt;br&gt; Batch shipments are displayed 100 at a time.  You can iterate 
     * through each `page` using the `?page= query` parameter.  You can also filter based on batch shipment 
     * status, for example, by passing a query param like `?object_results=creation_failed`. &lt;br&gt; 
     * For more details on filtering results, see our guide on &lt;a href="https://docs.goshippo.com/docs/api_concepts/filtering/" target="blank"&gt; filtering&lt;/a&gt;.
     * @param batchId Object ID of the batch
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.shippo_java_sdk.models.operations.GetBatchResponse get(
            String batchId,
            Optional<? extends String> shippoApiVersion) throws Exception {
        com.shippo.shippo_java_sdk.models.operations.GetBatchRequest request =
            com.shippo.shippo_java_sdk.models.operations.GetBatchRequest
                .builder()
                .batchId(batchId)
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                com.shippo.shippo_java_sdk.models.operations.GetBatchRequest.class,
                _baseUrl,
                "/batches/{BatchId}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("GetBatch", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("GetBatch", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("GetBatch", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("GetBatch", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.shippo.shippo_java_sdk.models.operations.GetBatchResponse.Builder _resBuilder = 
            com.shippo.shippo_java_sdk.models.operations.GetBatchResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.shippo.shippo_java_sdk.models.operations.GetBatchResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                com.shippo.shippo_java_sdk.models.components.Batch _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.shippo.shippo_java_sdk.models.components.Batch>() {});
                _res.withBatch(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }


    /**
     * Add shipments to a batch
     * Adds batch shipments to an existing batch.
     * @return The call builder
     */
    public com.shippo.shippo_java_sdk.models.operations.AddShipmentsToBatchRequestBuilder addShipments() {
        return new com.shippo.shippo_java_sdk.models.operations.AddShipmentsToBatchRequestBuilder(this);
    }

    /**
     * Add shipments to a batch
     * Adds batch shipments to an existing batch.
     * @param batchId Object ID of the batch
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.shippo_java_sdk.models.operations.AddShipmentsToBatchResponse addShipments(
            String batchId) throws Exception {
        return addShipments(batchId, Optional.empty(), Optional.empty());
    }
    /**
     * Add shipments to a batch
     * Adds batch shipments to an existing batch.
     * @param batchId Object ID of the batch
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @param requestBody Array of shipments to add to the batch
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.shippo_java_sdk.models.operations.AddShipmentsToBatchResponse addShipments(
            String batchId,
            Optional<? extends String> shippoApiVersion,
            Optional<? extends java.util.List<com.shippo.shippo_java_sdk.models.components.BatchShipmentBase>> requestBody) throws Exception {
        com.shippo.shippo_java_sdk.models.operations.AddShipmentsToBatchRequest request =
            com.shippo.shippo_java_sdk.models.operations.AddShipmentsToBatchRequest
                .builder()
                .batchId(batchId)
                .shippoApiVersion(shippoApiVersion)
                .requestBody(requestBody)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                com.shippo.shippo_java_sdk.models.operations.AddShipmentsToBatchRequest.class,
                _baseUrl,
                "/batches/{BatchId}/add_shipments",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<java.lang.Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "requestBody", "json", false);
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("AddShipmentsToBatch", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("AddShipmentsToBatch", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("AddShipmentsToBatch", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("AddShipmentsToBatch", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.shippo.shippo_java_sdk.models.operations.AddShipmentsToBatchResponse.Builder _resBuilder = 
            com.shippo.shippo_java_sdk.models.operations.AddShipmentsToBatchResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.shippo.shippo_java_sdk.models.operations.AddShipmentsToBatchResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                com.shippo.shippo_java_sdk.models.components.Batch _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.shippo.shippo_java_sdk.models.components.Batch>() {});
                _res.withBatch(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }


    /**
     * Purchase a batch
     * Purchases an existing batch with a status of `VALID`. 
     * Once you send a POST request to the purchase endpoint the batch status will change to `PURCHASING`. 
     * When all the shipments are purchased, the status will change to `PURCHASED` and you will receive a 
     * `batch_purchased` webhook indicating that the batch has been purchased
     * @return The call builder
     */
    public com.shippo.shippo_java_sdk.models.operations.PurchaseBatchRequestBuilder purchase() {
        return new com.shippo.shippo_java_sdk.models.operations.PurchaseBatchRequestBuilder(this);
    }

    /**
     * Purchase a batch
     * Purchases an existing batch with a status of `VALID`. 
     * Once you send a POST request to the purchase endpoint the batch status will change to `PURCHASING`. 
     * When all the shipments are purchased, the status will change to `PURCHASED` and you will receive a 
     * `batch_purchased` webhook indicating that the batch has been purchased
     * @param batchId Object ID of the batch
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.shippo_java_sdk.models.operations.PurchaseBatchResponse purchase(
            String batchId) throws Exception {
        return purchase(batchId, Optional.empty());
    }
    /**
     * Purchase a batch
     * Purchases an existing batch with a status of `VALID`. 
     * Once you send a POST request to the purchase endpoint the batch status will change to `PURCHASING`. 
     * When all the shipments are purchased, the status will change to `PURCHASED` and you will receive a 
     * `batch_purchased` webhook indicating that the batch has been purchased
     * @param batchId Object ID of the batch
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.shippo_java_sdk.models.operations.PurchaseBatchResponse purchase(
            String batchId,
            Optional<? extends String> shippoApiVersion) throws Exception {
        com.shippo.shippo_java_sdk.models.operations.PurchaseBatchRequest request =
            com.shippo.shippo_java_sdk.models.operations.PurchaseBatchRequest
                .builder()
                .batchId(batchId)
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                com.shippo.shippo_java_sdk.models.operations.PurchaseBatchRequest.class,
                _baseUrl,
                "/batches/{BatchId}/purchase",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("PurchaseBatch", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("PurchaseBatch", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("PurchaseBatch", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("PurchaseBatch", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.shippo.shippo_java_sdk.models.operations.PurchaseBatchResponse.Builder _resBuilder = 
            com.shippo.shippo_java_sdk.models.operations.PurchaseBatchResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.shippo.shippo_java_sdk.models.operations.PurchaseBatchResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                com.shippo.shippo_java_sdk.models.components.Batch _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.shippo.shippo_java_sdk.models.components.Batch>() {});
                _res.withBatch(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }


    /**
     * Remove shipments from a batch
     * Removes shipments from an existing batch shipment.
     * @return The call builder
     */
    public com.shippo.shippo_java_sdk.models.operations.RemoveShipmentsFromBatchRequestBuilder removeShipments() {
        return new com.shippo.shippo_java_sdk.models.operations.RemoveShipmentsFromBatchRequestBuilder(this);
    }

    /**
     * Remove shipments from a batch
     * Removes shipments from an existing batch shipment.
     * @param batchId Object ID of the batch
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.shippo_java_sdk.models.operations.RemoveShipmentsFromBatchResponse removeShipments(
            String batchId) throws Exception {
        return removeShipments(batchId, Optional.empty(), Optional.empty());
    }
    /**
     * Remove shipments from a batch
     * Removes shipments from an existing batch shipment.
     * @param batchId Object ID of the batch
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @param requestBody Array of shipments object ids to remove from the batch
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.shippo_java_sdk.models.operations.RemoveShipmentsFromBatchResponse removeShipments(
            String batchId,
            Optional<? extends String> shippoApiVersion,
            Optional<? extends java.util.List<String>> requestBody) throws Exception {
        com.shippo.shippo_java_sdk.models.operations.RemoveShipmentsFromBatchRequest request =
            com.shippo.shippo_java_sdk.models.operations.RemoveShipmentsFromBatchRequest
                .builder()
                .batchId(batchId)
                .shippoApiVersion(shippoApiVersion)
                .requestBody(requestBody)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                com.shippo.shippo_java_sdk.models.operations.RemoveShipmentsFromBatchRequest.class,
                _baseUrl,
                "/batches/{BatchId}/remove_shipments",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<java.lang.Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "requestBody", "json", false);
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("RemoveShipmentsFromBatch", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("RemoveShipmentsFromBatch", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("RemoveShipmentsFromBatch", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("RemoveShipmentsFromBatch", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.shippo.shippo_java_sdk.models.operations.RemoveShipmentsFromBatchResponse.Builder _resBuilder = 
            com.shippo.shippo_java_sdk.models.operations.RemoveShipmentsFromBatchResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.shippo.shippo_java_sdk.models.operations.RemoveShipmentsFromBatchResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                com.shippo.shippo_java_sdk.models.components.Batch _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.shippo.shippo_java_sdk.models.components.Batch>() {});
                _res.withBatch(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }

}
