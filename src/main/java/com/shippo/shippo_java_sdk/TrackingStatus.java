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
 * &lt;p style="text-align: center; background-color: #F2F3F4;"&gt;&lt;/br&gt;
 * If you purchased your shipping label through Shippo, you can also get all the tracking details of your Shipment 
 * from the &lt;a href="#tag/Transactions"&gt;Transaction&lt;/a&gt; object.
 * &lt;/br&gt;&lt;/br&gt;&lt;/p&gt;
 * A tracking status of a package is an indication of current location of a package in the supply chain. For example,  sorting, warehousing, or out for delivery. Use the tracking status object to track the location of your shipments.
 * 
 * When using your &lt;a href="https://docs.goshippo.com/docs/guides_general/authentication/"&gt;Test&lt;/a&gt; token for tracking, you need to use Shippo's 
 * predefined tokens for testing different tracking statuses. You can find more information in our 
 * &lt;a href="https://docs.goshippo.com/docs/tracking/tracking/"&gt;Tracking tutorial&lt;/a&gt; on how to do this, and what the 
 * payloads look like.      
 * &lt;SchemaDefinition schemaRef="#/components/schemas/Track"/&gt;
 */
public class TrackingStatus implements
            MethodCallCreateTrack,
            MethodCallGetTrack {

    private final SDKConfiguration sdkConfiguration;

    TrackingStatus(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }

    /**
     * Register a tracking webhook
     * Registers a webhook that will send HTTP notifications to you when the status of your tracked package changes. For more details on creating a webhook, see our guides on &lt;a href="https://docs.goshippo.com/docs/tracking/webhooks/"&gt;Webhooks&lt;/a&gt; and &lt;a href="https://docs.goshippo.com/docs/tracking/tracking/"&gt;Tracking&lt;/a&gt;.
     * @return The call builder
     */
    public com.shippo.shippo_java_sdk.models.operations.CreateTrackRequestBuilder create() {
        return new com.shippo.shippo_java_sdk.models.operations.CreateTrackRequestBuilder(this);
    }

    /**
     * Register a tracking webhook
     * Registers a webhook that will send HTTP notifications to you when the status of your tracked package changes. For more details on creating a webhook, see our guides on &lt;a href="https://docs.goshippo.com/docs/tracking/webhooks/"&gt;Webhooks&lt;/a&gt; and &lt;a href="https://docs.goshippo.com/docs/tracking/tracking/"&gt;Tracking&lt;/a&gt;.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.shippo_java_sdk.models.operations.CreateTrackResponse createDirect() throws Exception {
        return create(Optional.empty(), Optional.empty());
    }
    /**
     * Register a tracking webhook
     * Registers a webhook that will send HTTP notifications to you when the status of your tracked package changes. For more details on creating a webhook, see our guides on &lt;a href="https://docs.goshippo.com/docs/tracking/webhooks/"&gt;Webhooks&lt;/a&gt; and &lt;a href="https://docs.goshippo.com/docs/tracking/tracking/"&gt;Tracking&lt;/a&gt;.
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @param tracksRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.shippo_java_sdk.models.operations.CreateTrackResponse create(
            Optional<? extends String> shippoApiVersion,
            Optional<? extends com.shippo.shippo_java_sdk.models.components.TracksRequest> tracksRequest) throws Exception {
        com.shippo.shippo_java_sdk.models.operations.CreateTrackRequest request =
            com.shippo.shippo_java_sdk.models.operations.CreateTrackRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .tracksRequest(tracksRequest)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/tracks");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(request, Utils.JsonShape.DEFAULT,
            new TypeReference<java.lang.Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, "tracksRequest", "json", false);
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
                  new BeforeRequestContextImpl("CreateTrack", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("CreateTrack", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("CreateTrack", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("CreateTrack", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.shippo.shippo_java_sdk.models.operations.CreateTrackResponse.Builder _resBuilder = 
            com.shippo.shippo_java_sdk.models.operations.CreateTrackResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.shippo.shippo_java_sdk.models.operations.CreateTrackResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "201")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                com.shippo.shippo_java_sdk.models.components.Track _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.shippo.shippo_java_sdk.models.components.Track>() {});
                _res.withTrack(java.util.Optional.ofNullable(_out));
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
     * Get a tracking status
     * Returns the tracking status of a shipment using a carrier name and a tracking number.
     * @return The call builder
     */
    public com.shippo.shippo_java_sdk.models.operations.GetTrackRequestBuilder get() {
        return new com.shippo.shippo_java_sdk.models.operations.GetTrackRequestBuilder(this);
    }

    /**
     * Get a tracking status
     * Returns the tracking status of a shipment using a carrier name and a tracking number.
     * @param trackingNumber Tracking number
     * @param carrier Name of the carrier
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.shippo_java_sdk.models.operations.GetTrackResponse get(
            String trackingNumber,
            String carrier) throws Exception {
        return get(trackingNumber, carrier, Optional.empty());
    }
    /**
     * Get a tracking status
     * Returns the tracking status of a shipment using a carrier name and a tracking number.
     * @param trackingNumber Tracking number
     * @param carrier Name of the carrier
     * @param shippoApiVersion String used to pick a non-default API version to use
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public com.shippo.shippo_java_sdk.models.operations.GetTrackResponse get(
            String trackingNumber,
            String carrier,
            Optional<? extends String> shippoApiVersion) throws Exception {
        com.shippo.shippo_java_sdk.models.operations.GetTrackRequest request =
            com.shippo.shippo_java_sdk.models.operations.GetTrackRequest
                .builder()
                .trackingNumber(trackingNumber)
                .carrier(carrier)
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                com.shippo.shippo_java_sdk.models.operations.GetTrackRequest.class,
                _baseUrl,
                "/tracks/{Carrier}/{TrackingNumber}",
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
                  new BeforeRequestContextImpl("GetTrack", sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("GetTrack", sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("GetTrack", sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("GetTrack", sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        com.shippo.shippo_java_sdk.models.operations.GetTrackResponse.Builder _resBuilder = 
            com.shippo.shippo_java_sdk.models.operations.GetTrackResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        com.shippo.shippo_java_sdk.models.operations.GetTrackResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ObjectMapper _mapper = JSON.getMapper();
                com.shippo.shippo_java_sdk.models.components.Track _out = _mapper.readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.shippo.shippo_java_sdk.models.components.Track>() {});
                _res.withTrack(java.util.Optional.ofNullable(_out));
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
