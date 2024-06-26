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
 * A parcel is an item you are shipping. The parcel object includes details about its physical make-up of the parcel. It includes dimensions and weight that Shippo uses to calculate rates. 
 * &lt;SchemaDefinition schemaRef="#/components/schemas/Parcel"/&gt;
 * 
 * # Parcel Extras
 * The following values are supported for the `extra` field of the parcel object.
 * &lt;SchemaDefinition schemaRef="#/components/schemas/ParcelExtra"/&gt;
 */
public class Parcels implements
            MethodCallListParcels,
            MethodCallCreateParcel,
            MethodCallGetParcel {

    private final SDKConfiguration sdkConfiguration;

    Parcels(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * List all parcels
     * Returns a list of all parcel objects.
     * @return The call builder
     */
    public com.shippo.sdk.models.operations.ListParcelsRequestBuilder list() {
        return new com.shippo.sdk.models.operations.ListParcelsRequestBuilder(this);
    }

    /**
     * List all parcels
     * Returns a list of all parcel objects.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.sdk.models.operations.ListParcelsResponse listDirect() throws Exception {
        return list(Optional.empty(), Optional.empty(), Optional.empty());
    }
    /**
     * List all parcels
     * Returns a list of all parcel objects.
     * @param page The page number you want to select
     * @param results The number of results to return per page (max 100)
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.sdk.models.operations.ListParcelsResponse list(
            Optional<? extends Long> page,
            Optional<? extends Long> results,
            Optional<? extends String> shippoApiVersion) throws Exception {
        com.shippo.sdk.models.operations.ListParcelsRequest request =
            com.shippo.sdk.models.operations.ListParcelsRequest
                .builder()
                .page(page)
                .results(results)
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/parcels");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        _req.addQueryParams(Utils.getQueryParams(
                com.shippo.sdk.models.operations.ListParcelsRequest.class,
                request, 
                this.sdkConfiguration.globals));
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("ListParcels", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("ListParcels", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("ListParcels", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("ListParcels", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.shippo.sdk.models.operations.ListParcelsResponse.Builder _resBuilder = 
            com.shippo.sdk.models.operations.ListParcelsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.shippo.sdk.models.operations.ListParcelsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                com.shippo.sdk.models.components.ParcelPaginatedList _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.shippo.sdk.models.components.ParcelPaginatedList>() {});
                _res.withParcelPaginatedList(java.util.Optional.ofNullable(_out));
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
     * Create a new parcel
     * Creates a new parcel object.
     * @return The call builder
     */
    public com.shippo.sdk.models.operations.CreateParcelRequestBuilder create() {
        return new com.shippo.sdk.models.operations.CreateParcelRequestBuilder(this);
    }

    /**
     * Create a new parcel
     * Creates a new parcel object.
     * @param requestBody Parcel details.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.sdk.models.operations.CreateParcelResponse create(
            com.shippo.sdk.models.operations.CreateParcelRequestBody requestBody) throws Exception {
        return create(Optional.empty(), requestBody);
    }
    /**
     * Create a new parcel
     * Creates a new parcel object.
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @param requestBody Parcel details.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.sdk.models.operations.CreateParcelResponse create(
            Optional<? extends String> shippoApiVersion,
            com.shippo.sdk.models.operations.CreateParcelRequestBody requestBody) throws Exception {
        com.shippo.sdk.models.operations.CreateParcelRequest request =
            com.shippo.sdk.models.operations.CreateParcelRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .requestBody(requestBody)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/parcels");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<java.lang.Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "requestBody", "json", false);
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
                  new BeforeRequestContextImpl("CreateParcel", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("CreateParcel", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("CreateParcel", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("CreateParcel", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.shippo.sdk.models.operations.CreateParcelResponse.Builder _resBuilder = 
            com.shippo.sdk.models.operations.CreateParcelResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.shippo.sdk.models.operations.CreateParcelResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "201")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                com.shippo.sdk.models.components.Parcel _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.shippo.sdk.models.components.Parcel>() {});
                _res.withParcel(java.util.Optional.ofNullable(_out));
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
     * Retrieve an existing parcel
     * Returns parcel details using an existing parcel object ID (this will not return parcel details associated with un-purchased shipment/rate parcel object IDs).
     * @return The call builder
     */
    public com.shippo.sdk.models.operations.GetParcelRequestBuilder get() {
        return new com.shippo.sdk.models.operations.GetParcelRequestBuilder(this);
    }

    /**
     * Retrieve an existing parcel
     * Returns parcel details using an existing parcel object ID (this will not return parcel details associated with un-purchased shipment/rate parcel object IDs).
     * @param parcelId Object ID of the parcel
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.sdk.models.operations.GetParcelResponse get(
            String parcelId) throws Exception {
        return get(parcelId, Optional.empty());
    }
    /**
     * Retrieve an existing parcel
     * Returns parcel details using an existing parcel object ID (this will not return parcel details associated with un-purchased shipment/rate parcel object IDs).
     * @param parcelId Object ID of the parcel
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.sdk.models.operations.GetParcelResponse get(
            String parcelId,
            Optional<? extends String> shippoApiVersion) throws Exception {
        com.shippo.sdk.models.operations.GetParcelRequest request =
            com.shippo.sdk.models.operations.GetParcelRequest
                .builder()
                .parcelId(parcelId)
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                com.shippo.sdk.models.operations.GetParcelRequest.class,
                _baseUrl,
                "/parcels/{ParcelId}",
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
                  new BeforeRequestContextImpl("GetParcel", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("GetParcel", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("GetParcel", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("GetParcel", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.shippo.sdk.models.operations.GetParcelResponse.Builder _resBuilder = 
            com.shippo.sdk.models.operations.GetParcelResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.shippo.sdk.models.operations.GetParcelResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                com.shippo.sdk.models.components.Parcel _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.shippo.sdk.models.components.Parcel>() {});
                _res.withParcel(java.util.Optional.ofNullable(_out));
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
