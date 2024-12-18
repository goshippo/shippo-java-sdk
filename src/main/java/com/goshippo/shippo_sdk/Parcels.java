/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.goshippo.shippo_sdk.models.components.Parcel;
import com.goshippo.shippo_sdk.models.components.ParcelPaginatedList;
import com.goshippo.shippo_sdk.models.errors.SDKError;
import com.goshippo.shippo_sdk.models.operations.CreateParcelRequest;
import com.goshippo.shippo_sdk.models.operations.CreateParcelRequestBody;
import com.goshippo.shippo_sdk.models.operations.CreateParcelRequestBuilder;
import com.goshippo.shippo_sdk.models.operations.CreateParcelResponse;
import com.goshippo.shippo_sdk.models.operations.GetParcelRequest;
import com.goshippo.shippo_sdk.models.operations.GetParcelRequestBuilder;
import com.goshippo.shippo_sdk.models.operations.GetParcelResponse;
import com.goshippo.shippo_sdk.models.operations.ListParcelsRequest;
import com.goshippo.shippo_sdk.models.operations.ListParcelsRequestBuilder;
import com.goshippo.shippo_sdk.models.operations.ListParcelsResponse;
import com.goshippo.shippo_sdk.models.operations.SDKMethodInterfaces.*;
import com.goshippo.shippo_sdk.utils.HTTPClient;
import com.goshippo.shippo_sdk.utils.HTTPRequest;
import com.goshippo.shippo_sdk.utils.Hook.AfterErrorContextImpl;
import com.goshippo.shippo_sdk.utils.Hook.AfterSuccessContextImpl;
import com.goshippo.shippo_sdk.utils.Hook.BeforeRequestContextImpl;
import com.goshippo.shippo_sdk.utils.SerializedBody;
import com.goshippo.shippo_sdk.utils.Utils.JsonShape;
import com.goshippo.shippo_sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

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
    public ListParcelsRequestBuilder list() {
        return new ListParcelsRequestBuilder(this);
    }

    /**
     * List all parcels
     * Returns a list of all parcel objects.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListParcelsResponse listDirect() throws Exception {
        return list(Optional.empty(), Optional.empty(), Optional.empty());
    }
    
    /**
     * List all parcels
     * Returns a list of all parcel objects.
     * @param page The page number you want to select
     * @param results The number of results to return per page (max 100)
     * @param shippoApiVersion Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListParcelsResponse list(
            Optional<Long> page,
            Optional<Long> results,
            Optional<String> shippoApiVersion) throws Exception {
        ListParcelsRequest request =
            ListParcelsRequest
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
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                ListParcelsRequest.class,
                request, 
                this.sdkConfiguration.globals));
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "ListParcels", 
                      Optional.of(List.of()), 
                      sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "ListParcels",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "ListParcels",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "ListParcels",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListParcelsResponse.Builder _resBuilder = 
            ListParcelsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListParcelsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ParcelPaginatedList _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ParcelPaginatedList>() {});
                _res.withParcelPaginatedList(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }



    /**
     * Create a new parcel
     * Creates a new parcel object.
     * @return The call builder
     */
    public CreateParcelRequestBuilder create() {
        return new CreateParcelRequestBuilder(this);
    }

    /**
     * Create a new parcel
     * Creates a new parcel object.
     * @param requestBody Parcel details.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateParcelResponse create(
            CreateParcelRequestBody requestBody) throws Exception {
        return create(Optional.empty(), requestBody);
    }
    
    /**
     * Create a new parcel
     * Creates a new parcel object.
     * @param shippoApiVersion Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide.
     * @param requestBody Parcel details.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateParcelResponse create(
            Optional<String> shippoApiVersion,
            CreateParcelRequestBody requestBody) throws Exception {
        CreateParcelRequest request =
            CreateParcelRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .requestBody(requestBody)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/parcels");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "requestBody",
                "json",
                false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "CreateParcel", 
                      Optional.of(List.of()), 
                      sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "CreateParcel",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "CreateParcel",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "CreateParcel",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateParcelResponse.Builder _resBuilder = 
            CreateParcelResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateParcelResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "201")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                Parcel _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<Parcel>() {});
                _res.withParcel(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }



    /**
     * Retrieve an existing parcel
     * Returns parcel details using an existing parcel object ID (this will not return parcel details associated with un-purchased shipment/rate parcel object IDs).
     * @return The call builder
     */
    public GetParcelRequestBuilder get() {
        return new GetParcelRequestBuilder(this);
    }

    /**
     * Retrieve an existing parcel
     * Returns parcel details using an existing parcel object ID (this will not return parcel details associated with un-purchased shipment/rate parcel object IDs).
     * @param parcelId Object ID of the parcel
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetParcelResponse get(
            String parcelId) throws Exception {
        return get(parcelId, Optional.empty());
    }
    
    /**
     * Retrieve an existing parcel
     * Returns parcel details using an existing parcel object ID (this will not return parcel details associated with un-purchased shipment/rate parcel object IDs).
     * @param parcelId Object ID of the parcel
     * @param shippoApiVersion Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetParcelResponse get(
            String parcelId,
            Optional<String> shippoApiVersion) throws Exception {
        GetParcelRequest request =
            GetParcelRequest
                .builder()
                .parcelId(parcelId)
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetParcelRequest.class,
                _baseUrl,
                "/parcels/{ParcelId}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "GetParcel", 
                      Optional.of(List.of()), 
                      sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "GetParcel",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "GetParcel",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "GetParcel",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetParcelResponse.Builder _resBuilder = 
            GetParcelResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetParcelResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                Parcel _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<Parcel>() {});
                _res.withParcel(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }

}
