/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.goshippo.shippo_sdk.models.components.Pickup;
import com.goshippo.shippo_sdk.models.components.PickupBase;
import com.goshippo.shippo_sdk.models.errors.SDKError;
import com.goshippo.shippo_sdk.models.operations.CreatePickupRequest;
import com.goshippo.shippo_sdk.models.operations.CreatePickupRequestBuilder;
import com.goshippo.shippo_sdk.models.operations.CreatePickupResponse;
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
import java.lang.Object;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

/**
 * A pickup is when you schedule a carrier to collect a package for delivery.
 * Use Shippo’s pickups endpoint to schedule pickups with USPS and DHL Express for eligible shipments that you have already created.
 * &lt;SchemaDefinition schemaRef="#/components/schemas/Pickup"/&gt;
 */
public class Pickups implements
            MethodCallCreatePickup {

    private final SDKConfiguration sdkConfiguration;

    Pickups(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Create a pickup
     * Creates a pickup object. This request is for a carrier to come to a specified location to take a package for shipping.
     * @return The call builder
     */
    public CreatePickupRequestBuilder create() {
        return new CreatePickupRequestBuilder(this);
    }

    /**
     * Create a pickup
     * Creates a pickup object. This request is for a carrier to come to a specified location to take a package for shipping.
     * @param pickupBase
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreatePickupResponse create(
            PickupBase pickupBase) throws Exception {
        return create(Optional.empty(), pickupBase);
    }
    
    /**
     * Create a pickup
     * Creates a pickup object. This request is for a carrier to come to a specified location to take a package for shipping.
     * @param shippoApiVersion Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide.
     * @param pickupBase
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreatePickupResponse create(
            Optional<String> shippoApiVersion,
            PickupBase pickupBase) throws Exception {
        CreatePickupRequest request =
            CreatePickupRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .pickupBase(pickupBase)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/pickups");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "pickupBase",
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
                      "CreatePickup", 
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
                            "CreatePickup",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "CreatePickup",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "CreatePickup",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreatePickupResponse.Builder _resBuilder = 
            CreatePickupResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreatePickupResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "201")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                Pickup _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<Pickup>() {});
                _res.withPickup(Optional.ofNullable(_out));
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