/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.sdk.models.components.CarrierParcelTemplate;
import com.shippo.sdk.models.components.CarrierParcelTemplateList;
import com.shippo.sdk.models.errors.SDKError;
import com.shippo.sdk.models.operations.GetCarrierParcelTemplateRequest;
import com.shippo.sdk.models.operations.GetCarrierParcelTemplateRequestBuilder;
import com.shippo.sdk.models.operations.GetCarrierParcelTemplateResponse;
import com.shippo.sdk.models.operations.Include;
import com.shippo.sdk.models.operations.ListCarrierParcelTemplatesRequest;
import com.shippo.sdk.models.operations.ListCarrierParcelTemplatesRequestBuilder;
import com.shippo.sdk.models.operations.ListCarrierParcelTemplatesResponse;
import com.shippo.sdk.models.operations.SDKMethodInterfaces.*;
import com.shippo.sdk.utils.HTTPClient;
import com.shippo.sdk.utils.HTTPRequest;
import com.shippo.sdk.utils.Hook.AfterErrorContextImpl;
import com.shippo.sdk.utils.Hook.AfterSuccessContextImpl;
import com.shippo.sdk.utils.Hook.BeforeRequestContextImpl;
import com.shippo.sdk.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

/**
 * A carrier parcel template represents a package used for shipping that has preset dimensions defined by a carrier. Some examples of a carrier parcel template include USPS Flat Rate Box and Fedex Small Pak. When using a carrier parcel template, the rates returned may be limited to the carrier that provides the box. You can create user parcel templates using a carrier parcel template. Shippo takes the dimensions of the carrier parcel template but you must configure the weight.
 * 
 * &lt;SchemaDefinition schemaRef="#/components/schemas/CarrierParcelTemplate"/&gt;
 */
public class CarrierParcelTemplates implements
            MethodCallListCarrierParcelTemplates,
            MethodCallGetCarrierParcelTemplate {

    private final SDKConfiguration sdkConfiguration;

    CarrierParcelTemplates(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * List all carrier parcel templates
     * List all carrier parcel template objects. &lt;br&gt; Use the following query string params to filter the results as needed. &lt;br&gt;
     * &lt;ul&gt;
     * &lt;li&gt;`include=all` (the default). Includes templates from all carriers &lt;/li&gt;
     * &lt;li&gt;`include=user`. Includes templates only from carriers which the user has added (whether or not they're currently enabled) &lt;/li&gt;
     * &lt;li&gt;`include=enabled`. includes templates only for carriers which the user has added and enabled &lt;/li&gt;
     * &lt;li&gt;`carrier=*token*`. filter by specific carrier, e.g. fedex, usps &lt;/li&gt;
     * &lt;/ul&gt;
     * @return The call builder
     */
    public ListCarrierParcelTemplatesRequestBuilder list() {
        return new ListCarrierParcelTemplatesRequestBuilder(this);
    }

    /**
     * List all carrier parcel templates
     * List all carrier parcel template objects. &lt;br&gt; Use the following query string params to filter the results as needed. &lt;br&gt;
     * &lt;ul&gt;
     * &lt;li&gt;`include=all` (the default). Includes templates from all carriers &lt;/li&gt;
     * &lt;li&gt;`include=user`. Includes templates only from carriers which the user has added (whether or not they're currently enabled) &lt;/li&gt;
     * &lt;li&gt;`include=enabled`. includes templates only for carriers which the user has added and enabled &lt;/li&gt;
     * &lt;li&gt;`carrier=*token*`. filter by specific carrier, e.g. fedex, usps &lt;/li&gt;
     * &lt;/ul&gt;
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListCarrierParcelTemplatesResponse listDirect() throws Exception {
        return list(Optional.empty(), Optional.empty(), Optional.empty());
    }
    
    /**
     * List all carrier parcel templates
     * List all carrier parcel template objects. &lt;br&gt; Use the following query string params to filter the results as needed. &lt;br&gt;
     * &lt;ul&gt;
     * &lt;li&gt;`include=all` (the default). Includes templates from all carriers &lt;/li&gt;
     * &lt;li&gt;`include=user`. Includes templates only from carriers which the user has added (whether or not they're currently enabled) &lt;/li&gt;
     * &lt;li&gt;`include=enabled`. includes templates only for carriers which the user has added and enabled &lt;/li&gt;
     * &lt;li&gt;`carrier=*token*`. filter by specific carrier, e.g. fedex, usps &lt;/li&gt;
     * &lt;/ul&gt;
     * @param include filter by user or enabled
     * @param carrier filter by specific carrier
     * @param shippoApiVersion Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListCarrierParcelTemplatesResponse list(
            Optional<? extends Include> include,
            Optional<String> carrier,
            Optional<String> shippoApiVersion) throws Exception {
        ListCarrierParcelTemplatesRequest request =
            ListCarrierParcelTemplatesRequest
                .builder()
                .include(include)
                .carrier(carrier)
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/parcel-templates");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                ListCarrierParcelTemplatesRequest.class,
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
                      "ListCarrierParcelTemplates", 
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
                            "ListCarrierParcelTemplates",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "ListCarrierParcelTemplates",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "ListCarrierParcelTemplates",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListCarrierParcelTemplatesResponse.Builder _resBuilder = 
            ListCarrierParcelTemplatesResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListCarrierParcelTemplatesResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                CarrierParcelTemplateList _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<CarrierParcelTemplateList>() {});
                _res.withCarrierParcelTemplateList(Optional.ofNullable(_out));
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
     * Retrieve a carrier parcel templates
     * Fetches the parcel template information for a specific carrier parcel template, identified by the token.
     * @return The call builder
     */
    public GetCarrierParcelTemplateRequestBuilder get() {
        return new GetCarrierParcelTemplateRequestBuilder(this);
    }

    /**
     * Retrieve a carrier parcel templates
     * Fetches the parcel template information for a specific carrier parcel template, identified by the token.
     * @param carrierParcelTemplateToken The unique string representation of the carrier parcel template
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetCarrierParcelTemplateResponse get(
            String carrierParcelTemplateToken) throws Exception {
        return get(carrierParcelTemplateToken, Optional.empty());
    }
    
    /**
     * Retrieve a carrier parcel templates
     * Fetches the parcel template information for a specific carrier parcel template, identified by the token.
     * @param carrierParcelTemplateToken The unique string representation of the carrier parcel template
     * @param shippoApiVersion Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetCarrierParcelTemplateResponse get(
            String carrierParcelTemplateToken,
            Optional<String> shippoApiVersion) throws Exception {
        GetCarrierParcelTemplateRequest request =
            GetCarrierParcelTemplateRequest
                .builder()
                .carrierParcelTemplateToken(carrierParcelTemplateToken)
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetCarrierParcelTemplateRequest.class,
                _baseUrl,
                "/parcel-templates/{CarrierParcelTemplateToken}",
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
                      "GetCarrierParcelTemplate", 
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
                            "GetCarrierParcelTemplate",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "GetCarrierParcelTemplate",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "GetCarrierParcelTemplate",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetCarrierParcelTemplateResponse.Builder _resBuilder = 
            GetCarrierParcelTemplateResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetCarrierParcelTemplateResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                CarrierParcelTemplate _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<CarrierParcelTemplate>() {});
                _res.withCarrierParcelTemplate(Optional.ofNullable(_out));
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
