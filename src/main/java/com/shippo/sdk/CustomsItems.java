/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shippo.sdk.models.errors.SDKError;
import com.shippo.sdk.models.operations.SDKMethodInterfaces.*;
import com.shippo.sdk.utils.HTTPClient;
import com.shippo.sdk.utils.HTTPRequest;
import com.shippo.sdk.utils.Hook.AfterErrorContextImpl;
import com.shippo.sdk.utils.Hook.AfterSuccessContextImpl;
import com.shippo.sdk.utils.Hook.BeforeRequestContextImpl;
import com.shippo.sdk.utils.JSON;
import com.shippo.sdk.utils.Retries.NonRetryableException;
import com.shippo.sdk.utils.SerializedBody;
import com.shippo.sdk.utils.Utils;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.apache.http.NameValuePair;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Customs declarations are relevant information, including one or multiple customs items, you need to provide for customs clearance for your international shipments.
 * &lt;SchemaDefinition schemaRef="#/components/schemas/CustomsItem"/&gt;
 */
public class CustomsItems implements
            MethodCallListCustomsItems,
            MethodCallCreateCustomsItem,
            MethodCallGetCustomsItem {

    private final SDKConfiguration sdkConfiguration;

    CustomsItems(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * List all customs items
     * Returns a list all customs items objects.
     * @return The call builder
     */
    public com.shippo.sdk.models.operations.ListCustomsItemsRequestBuilder list() {
        return new com.shippo.sdk.models.operations.ListCustomsItemsRequestBuilder(this);
    }

    /**
     * List all customs items
     * Returns a list all customs items objects.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.sdk.models.operations.ListCustomsItemsResponse listDirect() throws Exception {
        return list(Optional.empty(), Optional.empty(), Optional.empty());
    }
    /**
     * List all customs items
     * Returns a list all customs items objects.
     * @param page The page number you want to select
     * @param results The number of results to return per page (max 100)
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.sdk.models.operations.ListCustomsItemsResponse list(
            Optional<? extends Long> page,
            Optional<? extends Long> results,
            Optional<? extends String> shippoApiVersion) throws Exception {
        com.shippo.sdk.models.operations.ListCustomsItemsRequest request =
            com.shippo.sdk.models.operations.ListCustomsItemsRequest
                .builder()
                .page(page)
                .results(results)
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/customs/items");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                com.shippo.sdk.models.operations.ListCustomsItemsRequest.class,
                request, 
                this.sdkConfiguration.globals));
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("ListCustomsItems", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("ListCustomsItems", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("ListCustomsItems", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("ListCustomsItems", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.shippo.sdk.models.operations.ListCustomsItemsResponse.Builder _resBuilder = 
            com.shippo.sdk.models.operations.ListCustomsItemsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.shippo.sdk.models.operations.ListCustomsItemsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                com.shippo.sdk.models.components.CustomsItemPaginatedList _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.shippo.sdk.models.components.CustomsItemPaginatedList>() {});
                _res.withCustomsItemPaginatedList(java.util.Optional.ofNullable(_out));
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
     * Create a new customs item
     * Creates a new customs item object.
     * @return The call builder
     */
    public com.shippo.sdk.models.operations.CreateCustomsItemRequestBuilder create() {
        return new com.shippo.sdk.models.operations.CreateCustomsItemRequestBuilder(this);
    }

    /**
     * Create a new customs item
     * Creates a new customs item object.
     * @param customsItemCreateRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.sdk.models.operations.CreateCustomsItemResponse create(
            com.shippo.sdk.models.components.CustomsItemCreateRequest customsItemCreateRequest) throws Exception {
        return create(Optional.empty(), customsItemCreateRequest);
    }
    /**
     * Create a new customs item
     * Creates a new customs item object.
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @param customsItemCreateRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.sdk.models.operations.CreateCustomsItemResponse create(
            Optional<? extends String> shippoApiVersion,
            com.shippo.sdk.models.components.CustomsItemCreateRequest customsItemCreateRequest) throws Exception {
        com.shippo.sdk.models.operations.CreateCustomsItemRequest request =
            com.shippo.sdk.models.operations.CreateCustomsItemRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .customsItemCreateRequest(customsItemCreateRequest)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/customs/items");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<java.lang.Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "customsItemCreateRequest", "json", false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
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
                  new BeforeRequestContextImpl("CreateCustomsItem", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("CreateCustomsItem", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("CreateCustomsItem", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("CreateCustomsItem", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.shippo.sdk.models.operations.CreateCustomsItemResponse.Builder _resBuilder = 
            com.shippo.sdk.models.operations.CreateCustomsItemResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.shippo.sdk.models.operations.CreateCustomsItemResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "201")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                com.shippo.sdk.models.components.CustomsItem _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.shippo.sdk.models.components.CustomsItem>() {});
                _res.withCustomsItem(java.util.Optional.ofNullable(_out));
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
     * Retrieve a customs item
     * Returns an existing customs item using an object ID
     * @return The call builder
     */
    public com.shippo.sdk.models.operations.GetCustomsItemRequestBuilder get() {
        return new com.shippo.sdk.models.operations.GetCustomsItemRequestBuilder(this);
    }

    /**
     * Retrieve a customs item
     * Returns an existing customs item using an object ID
     * @param customsItemId Object ID of the customs item
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.sdk.models.operations.GetCustomsItemResponse get(
            String customsItemId) throws Exception {
        return get(customsItemId, Optional.empty(), Optional.empty());
    }
    /**
     * Retrieve a customs item
     * Returns an existing customs item using an object ID
     * @param customsItemId Object ID of the customs item
     * @param page The page number you want to select
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.sdk.models.operations.GetCustomsItemResponse get(
            String customsItemId,
            Optional<? extends Long> page,
            Optional<? extends String> shippoApiVersion) throws Exception {
        com.shippo.sdk.models.operations.GetCustomsItemRequest request =
            com.shippo.sdk.models.operations.GetCustomsItemRequest
                .builder()
                .customsItemId(customsItemId)
                .page(page)
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                com.shippo.sdk.models.operations.GetCustomsItemRequest.class,
                _baseUrl,
                "/customs/items/{CustomsItemId}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                com.shippo.sdk.models.operations.GetCustomsItemRequest.class,
                request, 
                this.sdkConfiguration.globals));
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("GetCustomsItem", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("GetCustomsItem", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("GetCustomsItem", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("GetCustomsItem", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.shippo.sdk.models.operations.GetCustomsItemResponse.Builder _resBuilder = 
            com.shippo.sdk.models.operations.GetCustomsItemResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.shippo.sdk.models.operations.GetCustomsItemResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                com.shippo.sdk.models.components.CustomsItem _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.shippo.sdk.models.components.CustomsItem>() {});
                _res.withCustomsItem(java.util.Optional.ofNullable(_out));
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
