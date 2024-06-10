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
 * Rates at checkout is a tool for merchants to display up-to-date shipping estimates based on what's in their customers cart and where they’re shipping to.
 * Merchants set up curated shipping options for customers in the checkout flow based on data in the shopping cart. The request must include the **to** address and item information. Optional fields are the **from** address and package information. If the optional fields are not included, the service will use the default address and/or package configured for rates at checkout. The response is a list of shipping options based on the Service Group configuration.
 * (see &lt;a href="#tag/Service-Groups"&gt;Service Group configuration&lt;/a&gt; for details).
 * &lt;SchemaDefinition schemaRef="#/components/schemas/LiveRate"/&gt;
 * 
 * 
 * # Default Parcel Template
 * Assign one of your user parcel templates to be the default used when generating Live Rates. This template will be used by default when generating Live Rates, unless you explicitly provide a parcel in the Live Rates request.
 * &lt;SchemaDefinition schemaRef="#/components/schemas/UserParcelTemplate"/&gt;
 */
public class RatesAtCheckout implements
            MethodCallCreateLiveRate,
            MethodCallGetDefaultParcelTemplate,
            MethodCallUpdateDefaultParcelTemplate,
            MethodCallDeleteDefaultParcelTemplate {

    private final SDKConfiguration sdkConfiguration;

    RatesAtCheckout(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * Generate a live rates request
     * Initiates a live rates request. Include either the object ID for
     * an existing address record or a fully formed address object when entering
     * an address value. You can also enter the object ID of an existing user parcel
     * template or a fully formed user parcel template object as the parcel value.
     * @return The call builder
     */
    public com.shippo.shippo_java_sdk.models.operations.CreateLiveRateRequestBuilder create() {
        return new com.shippo.shippo_java_sdk.models.operations.CreateLiveRateRequestBuilder(this);
    }

    /**
     * Generate a live rates request
     * Initiates a live rates request. Include either the object ID for
     * an existing address record or a fully formed address object when entering
     * an address value. You can also enter the object ID of an existing user parcel
     * template or a fully formed user parcel template object as the parcel value.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.shippo_java_sdk.models.operations.CreateLiveRateResponse createDirect() throws Exception {
        return create(Optional.empty(), Optional.empty());
    }
    /**
     * Generate a live rates request
     * Initiates a live rates request. Include either the object ID for
     * an existing address record or a fully formed address object when entering
     * an address value. You can also enter the object ID of an existing user parcel
     * template or a fully formed user parcel template object as the parcel value.
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @param liveRateCreateRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.shippo_java_sdk.models.operations.CreateLiveRateResponse create(
            Optional<? extends String> shippoApiVersion,
            Optional<? extends com.shippo.shippo_java_sdk.models.components.LiveRateCreateRequest> liveRateCreateRequest) throws Exception {
        com.shippo.shippo_java_sdk.models.operations.CreateLiveRateRequest request =
            com.shippo.shippo_java_sdk.models.operations.CreateLiveRateRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .liveRateCreateRequest(liveRateCreateRequest)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/live-rates");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<java.lang.Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "liveRateCreateRequest", "json", false);
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
                  new BeforeRequestContextImpl("CreateLiveRate", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("CreateLiveRate", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("CreateLiveRate", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("CreateLiveRate", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.shippo.shippo_java_sdk.models.operations.CreateLiveRateResponse.Builder _resBuilder = 
            com.shippo.shippo_java_sdk.models.operations.CreateLiveRateResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.shippo.shippo_java_sdk.models.operations.CreateLiveRateResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                com.shippo.shippo_java_sdk.models.components.LiveRatePaginatedList _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.shippo.shippo_java_sdk.models.components.LiveRatePaginatedList>() {});
                _res.withLiveRatePaginatedList(java.util.Optional.ofNullable(_out));
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
     * Show current default parcel template
     * Retrieve and display the currently configured default parcel template for live rates.
     * @return The call builder
     */
    public com.shippo.shippo_java_sdk.models.operations.GetDefaultParcelTemplateRequestBuilder getDefaultParcelTemplate() {
        return new com.shippo.shippo_java_sdk.models.operations.GetDefaultParcelTemplateRequestBuilder(this);
    }

    /**
     * Show current default parcel template
     * Retrieve and display the currently configured default parcel template for live rates.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.shippo_java_sdk.models.operations.GetDefaultParcelTemplateResponse getDefaultParcelTemplateDirect() throws Exception {
        return getDefaultParcelTemplate(Optional.empty());
    }
    /**
     * Show current default parcel template
     * Retrieve and display the currently configured default parcel template for live rates.
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.shippo_java_sdk.models.operations.GetDefaultParcelTemplateResponse getDefaultParcelTemplate(
            Optional<? extends String> shippoApiVersion) throws Exception {
        com.shippo.shippo_java_sdk.models.operations.GetDefaultParcelTemplateRequest request =
            com.shippo.shippo_java_sdk.models.operations.GetDefaultParcelTemplateRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/live-rates/settings/parcel-template");
        
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
                  new BeforeRequestContextImpl("GetDefaultParcelTemplate", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("GetDefaultParcelTemplate", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("GetDefaultParcelTemplate", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("GetDefaultParcelTemplate", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.shippo.shippo_java_sdk.models.operations.GetDefaultParcelTemplateResponse.Builder _resBuilder = 
            com.shippo.shippo_java_sdk.models.operations.GetDefaultParcelTemplateResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.shippo.shippo_java_sdk.models.operations.GetDefaultParcelTemplateResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                com.shippo.shippo_java_sdk.models.components.DefaultParcelTemplate _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.shippo.shippo_java_sdk.models.components.DefaultParcelTemplate>() {});
                _res.withDefaultParcelTemplate(java.util.Optional.ofNullable(_out));
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
     * Update default parcel template
     * Update the currently configured default parcel template for live rates. The object_id in the request payload should identify the user parcel template to be the new default.
     * @return The call builder
     */
    public com.shippo.shippo_java_sdk.models.operations.UpdateDefaultParcelTemplateRequestBuilder updateDefaultParcelTemplate() {
        return new com.shippo.shippo_java_sdk.models.operations.UpdateDefaultParcelTemplateRequestBuilder(this);
    }

    /**
     * Update default parcel template
     * Update the currently configured default parcel template for live rates. The object_id in the request payload should identify the user parcel template to be the new default.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.shippo_java_sdk.models.operations.UpdateDefaultParcelTemplateResponse updateDefaultParcelTemplateDirect() throws Exception {
        return updateDefaultParcelTemplate(Optional.empty(), Optional.empty());
    }
    /**
     * Update default parcel template
     * Update the currently configured default parcel template for live rates. The object_id in the request payload should identify the user parcel template to be the new default.
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @param defaultParcelTemplateUpdateRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.shippo_java_sdk.models.operations.UpdateDefaultParcelTemplateResponse updateDefaultParcelTemplate(
            Optional<? extends String> shippoApiVersion,
            Optional<? extends com.shippo.shippo_java_sdk.models.components.DefaultParcelTemplateUpdateRequest> defaultParcelTemplateUpdateRequest) throws Exception {
        com.shippo.shippo_java_sdk.models.operations.UpdateDefaultParcelTemplateRequest request =
            com.shippo.shippo_java_sdk.models.operations.UpdateDefaultParcelTemplateRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .defaultParcelTemplateUpdateRequest(defaultParcelTemplateUpdateRequest)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/live-rates/settings/parcel-template");
        
        HTTPRequest _req = new HTTPRequest(_url, "PUT");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<java.lang.Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "defaultParcelTemplateUpdateRequest", "json", false);
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
                  new BeforeRequestContextImpl("UpdateDefaultParcelTemplate", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("UpdateDefaultParcelTemplate", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("UpdateDefaultParcelTemplate", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("UpdateDefaultParcelTemplate", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.shippo.shippo_java_sdk.models.operations.UpdateDefaultParcelTemplateResponse.Builder _resBuilder = 
            com.shippo.shippo_java_sdk.models.operations.UpdateDefaultParcelTemplateResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.shippo.shippo_java_sdk.models.operations.UpdateDefaultParcelTemplateResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                com.shippo.shippo_java_sdk.models.components.DefaultParcelTemplate _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.shippo.shippo_java_sdk.models.components.DefaultParcelTemplate>() {});
                _res.withDefaultParcelTemplate(java.util.Optional.ofNullable(_out));
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
     * Clear current default parcel template
     * Clears the currently configured default parcel template for live rates.
     * @return The call builder
     */
    public com.shippo.shippo_java_sdk.models.operations.DeleteDefaultParcelTemplateRequestBuilder deleteDefaultParcelTemplate() {
        return new com.shippo.shippo_java_sdk.models.operations.DeleteDefaultParcelTemplateRequestBuilder(this);
    }

    /**
     * Clear current default parcel template
     * Clears the currently configured default parcel template for live rates.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.shippo_java_sdk.models.operations.DeleteDefaultParcelTemplateResponse deleteDefaultParcelTemplateDirect() throws Exception {
        return deleteDefaultParcelTemplate(Optional.empty());
    }
    /**
     * Clear current default parcel template
     * Clears the currently configured default parcel template for live rates.
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.shippo_java_sdk.models.operations.DeleteDefaultParcelTemplateResponse deleteDefaultParcelTemplate(
            Optional<? extends String> shippoApiVersion) throws Exception {
        com.shippo.shippo_java_sdk.models.operations.DeleteDefaultParcelTemplateRequest request =
            com.shippo.shippo_java_sdk.models.operations.DeleteDefaultParcelTemplateRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/live-rates/settings/parcel-template");
        
        HTTPRequest _req = new HTTPRequest(_url, "DELETE");
        _req.addHeader("Accept", "*/*")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("DeleteDefaultParcelTemplate", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("DeleteDefaultParcelTemplate", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("DeleteDefaultParcelTemplate", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("DeleteDefaultParcelTemplate", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.shippo.shippo_java_sdk.models.operations.DeleteDefaultParcelTemplateResponse.Builder _resBuilder = 
            com.shippo.shippo_java_sdk.models.operations.DeleteDefaultParcelTemplateResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.shippo.shippo_java_sdk.models.operations.DeleteDefaultParcelTemplateResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "204")) {
            // no content 
            return _res;
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