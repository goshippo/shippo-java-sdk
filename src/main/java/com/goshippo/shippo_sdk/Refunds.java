/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.goshippo.shippo_sdk.models.components.Refund;
import com.goshippo.shippo_sdk.models.components.RefundPaginatedList;
import com.goshippo.shippo_sdk.models.components.RefundRequestBody;
import com.goshippo.shippo_sdk.models.errors.SDKError;
import com.goshippo.shippo_sdk.models.operations.CreateRefundRequest;
import com.goshippo.shippo_sdk.models.operations.CreateRefundRequestBuilder;
import com.goshippo.shippo_sdk.models.operations.CreateRefundResponse;
import com.goshippo.shippo_sdk.models.operations.GetRefundRequest;
import com.goshippo.shippo_sdk.models.operations.GetRefundRequestBuilder;
import com.goshippo.shippo_sdk.models.operations.GetRefundResponse;
import com.goshippo.shippo_sdk.models.operations.ListRefundsRequest;
import com.goshippo.shippo_sdk.models.operations.ListRefundsRequestBuilder;
import com.goshippo.shippo_sdk.models.operations.ListRefundsResponse;
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
 * Refunds are reimbursements for successfully created but unused shipping labels or other charges.
 * &lt;SchemaDefinition schemaRef="#/components/schemas/Refund"/&gt;
 */
public class Refunds implements
            MethodCallCreateRefund,
            MethodCallListRefunds,
            MethodCallGetRefund {

    private final SDKConfiguration sdkConfiguration;

    Refunds(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Create a refund
     * Creates a new refund object.
     * @return The call builder
     */
    public CreateRefundRequestBuilder create() {
        return new CreateRefundRequestBuilder(this);
    }

    /**
     * Create a refund
     * Creates a new refund object.
     * @param refundRequestBody
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateRefundResponse create(
            RefundRequestBody refundRequestBody) throws Exception {
        return create(Optional.empty(), refundRequestBody);
    }
    
    /**
     * Create a refund
     * Creates a new refund object.
     * @param shippoApiVersion Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide.
     * @param refundRequestBody
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateRefundResponse create(
            Optional<String> shippoApiVersion,
            RefundRequestBody refundRequestBody) throws Exception {
        CreateRefundRequest request =
            CreateRefundRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .refundRequestBody(refundRequestBody)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/refunds");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "refundRequestBody",
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
                      "CreateRefund", 
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
                            "CreateRefund",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "CreateRefund",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "CreateRefund",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateRefundResponse.Builder _resBuilder = 
            CreateRefundResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateRefundResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "201")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                Refund _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<Refund>() {});
                _res.withRefund(Optional.ofNullable(_out));
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
     * List all refunds
     * Returns a list all refund objects.
     * @return The call builder
     */
    public ListRefundsRequestBuilder list() {
        return new ListRefundsRequestBuilder(this);
    }

    /**
     * List all refunds
     * Returns a list all refund objects.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListRefundsResponse listDirect() throws Exception {
        return list(Optional.empty());
    }
    
    /**
     * List all refunds
     * Returns a list all refund objects.
     * @param shippoApiVersion Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListRefundsResponse list(
            Optional<String> shippoApiVersion) throws Exception {
        ListRefundsRequest request =
            ListRefundsRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/refunds/");
        
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
                      "ListRefunds", 
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
                            "ListRefunds",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "ListRefunds",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "ListRefunds",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListRefundsResponse.Builder _resBuilder = 
            ListRefundsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListRefundsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                RefundPaginatedList _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<RefundPaginatedList>() {});
                _res.withRefundPaginatedList(Optional.ofNullable(_out));
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
     * Retrieve a refund
     * Returns an existing rate using a rate object ID.
     * @return The call builder
     */
    public GetRefundRequestBuilder get() {
        return new GetRefundRequestBuilder(this);
    }

    /**
     * Retrieve a refund
     * Returns an existing rate using a rate object ID.
     * @param refundId Object ID of the refund to update
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetRefundResponse get(
            String refundId) throws Exception {
        return get(refundId, Optional.empty());
    }
    
    /**
     * Retrieve a refund
     * Returns an existing rate using a rate object ID.
     * @param refundId Object ID of the refund to update
     * @param shippoApiVersion Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetRefundResponse get(
            String refundId,
            Optional<String> shippoApiVersion) throws Exception {
        GetRefundRequest request =
            GetRefundRequest
                .builder()
                .refundId(refundId)
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetRefundRequest.class,
                _baseUrl,
                "/refunds/{RefundId}",
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
                      "GetRefund", 
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
                            "GetRefund",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "GetRefund",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "GetRefund",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetRefundResponse.Builder _resBuilder = 
            GetRefundResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetRefundResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                Refund _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<Refund>() {});
                _res.withRefund(Optional.ofNullable(_out));
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