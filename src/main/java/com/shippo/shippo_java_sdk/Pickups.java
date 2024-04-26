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
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

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
    public com.shippo.shippo_java_sdk.models.operations.CreatePickupRequestBuilder create() {
        return new com.shippo.shippo_java_sdk.models.operations.CreatePickupRequestBuilder(this);
    }

    /**
     * Create a pickup
     * Creates a pickup object. This request is for a carrier to come to a specified location to take a package for shipping.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.shippo_java_sdk.models.operations.CreatePickupResponse createDirect() throws Exception {
        return create(Optional.empty(), Optional.empty());
    }
    /**
     * Create a pickup
     * Creates a pickup object. This request is for a carrier to come to a specified location to take a package for shipping.
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @param pickupBase
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.shippo_java_sdk.models.operations.CreatePickupResponse create(
            Optional<? extends String> shippoApiVersion,
            Optional<? extends com.shippo.shippo_java_sdk.models.components.PickupBase> pickupBase) throws Exception {
        com.shippo.shippo_java_sdk.models.operations.CreatePickupRequest request =
            com.shippo.shippo_java_sdk.models.operations.CreatePickupRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .pickupBase(pickupBase)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/pickups");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<java.lang.Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "pickupBase", "json", false);
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
                  new BeforeRequestContextImpl("CreatePickup", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("CreatePickup", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("CreatePickup", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("CreatePickup", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.shippo.shippo_java_sdk.models.operations.CreatePickupResponse.Builder _resBuilder = 
            com.shippo.shippo_java_sdk.models.operations.CreatePickupResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.shippo.shippo_java_sdk.models.operations.CreatePickupResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "201")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                com.shippo.shippo_java_sdk.models.components.Pickup _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.shippo.shippo_java_sdk.models.components.Pickup>() {});
                _res.withPickup(java.util.Optional.ofNullable(_out));
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
