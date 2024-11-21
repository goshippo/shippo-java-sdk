/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.shippo.sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.sdk.models.components.ShippoAccount;
import com.shippo.sdk.models.components.ShippoAccountPaginatedList;
import com.shippo.sdk.models.components.ShippoAccountUpdateRequest;
import com.shippo.sdk.models.errors.SDKError;
import com.shippo.sdk.models.operations.CreateShippoAccountRequest;
import com.shippo.sdk.models.operations.CreateShippoAccountRequestBuilder;
import com.shippo.sdk.models.operations.CreateShippoAccountResponse;
import com.shippo.sdk.models.operations.GetShippoAccountRequest;
import com.shippo.sdk.models.operations.GetShippoAccountRequestBuilder;
import com.shippo.sdk.models.operations.GetShippoAccountResponse;
import com.shippo.sdk.models.operations.ListShippoAccountsRequest;
import com.shippo.sdk.models.operations.ListShippoAccountsRequestBuilder;
import com.shippo.sdk.models.operations.ListShippoAccountsResponse;
import com.shippo.sdk.models.operations.SDKMethodInterfaces.*;
import com.shippo.sdk.models.operations.UpdateShippoAccountRequest;
import com.shippo.sdk.models.operations.UpdateShippoAccountRequestBuilder;
import com.shippo.sdk.models.operations.UpdateShippoAccountResponse;
import com.shippo.sdk.utils.HTTPClient;
import com.shippo.sdk.utils.HTTPRequest;
import com.shippo.sdk.utils.Hook.AfterErrorContextImpl;
import com.shippo.sdk.utils.Hook.AfterSuccessContextImpl;
import com.shippo.sdk.utils.Hook.BeforeRequestContextImpl;
import com.shippo.sdk.utils.SerializedBody;
import com.shippo.sdk.utils.Utils.JsonShape;
import com.shippo.sdk.utils.Utils;
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
 * Shippo Accounts are used by Shippo Platform Accounts to create and manage Managed Shippo Accounts. 
 * Managed Shippo Accounts are headless accounts that represent your customers. They are opaque to your end customers, meaning customers do not need to create their own Shippo login or have a billing relationship with Shippo. 
 * They can be used by marketplaces, e-commerce platforms, and third-party logistics providers who want to offer, seamless, built-in shipping functionality to their customers. See our &lt;a href="https://docs.goshippo.com/docs/platformaccounts/platform_accounts/"&gt;guide&lt;/a&gt; for more details.
 * &lt;SchemaDefinition schemaRef="#/components/schemas/ShippoAccount"/&gt;
 */
public class ShippoAccounts implements
            MethodCallListShippoAccounts,
            MethodCallCreateShippoAccount,
            MethodCallGetShippoAccount,
            MethodCallUpdateShippoAccount {

    private final SDKConfiguration sdkConfiguration;

    ShippoAccounts(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * List all Shippo Accounts
     * Returns a list of Shippo Managed Accounts objects.
     * @return The call builder
     */
    public ListShippoAccountsRequestBuilder list() {
        return new ListShippoAccountsRequestBuilder(this);
    }

    /**
     * List all Shippo Accounts
     * Returns a list of Shippo Managed Accounts objects.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListShippoAccountsResponse listDirect() throws Exception {
        return list(Optional.empty(), Optional.empty(), Optional.empty());
    }
    
    /**
     * List all Shippo Accounts
     * Returns a list of Shippo Managed Accounts objects.
     * @param page The page number you want to select
     * @param results The number of results to return per page (max 100)
     * @param shippoApiVersion Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListShippoAccountsResponse list(
            Optional<Long> page,
            Optional<Long> results,
            Optional<String> shippoApiVersion) throws Exception {
        ListShippoAccountsRequest request =
            ListShippoAccountsRequest
                .builder()
                .page(page)
                .results(results)
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/shippo-accounts");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                ListShippoAccountsRequest.class,
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
                      "ListShippoAccounts", 
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
                            "ListShippoAccounts",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "ListShippoAccounts",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "ListShippoAccounts",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListShippoAccountsResponse.Builder _resBuilder = 
            ListShippoAccountsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListShippoAccountsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ShippoAccountPaginatedList _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ShippoAccountPaginatedList>() {});
                _res.withShippoAccountPaginatedList(Optional.ofNullable(_out));
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
     * Create a Shippo Account
     * Creates a new &lt;a href="https://docs.goshippo.com/docs/platformaccounts/platform_using_accounts/"&gt;Shippo Managed Account&lt;/a&gt;.
     * @return The call builder
     */
    public CreateShippoAccountRequestBuilder create() {
        return new CreateShippoAccountRequestBuilder(this);
    }

    /**
     * Create a Shippo Account
     * Creates a new &lt;a href="https://docs.goshippo.com/docs/platformaccounts/platform_using_accounts/"&gt;Shippo Managed Account&lt;/a&gt;.
     * @param shippoAccountUpdateRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateShippoAccountResponse create(
            ShippoAccountUpdateRequest shippoAccountUpdateRequest) throws Exception {
        return create(Optional.empty(), shippoAccountUpdateRequest);
    }
    
    /**
     * Create a Shippo Account
     * Creates a new &lt;a href="https://docs.goshippo.com/docs/platformaccounts/platform_using_accounts/"&gt;Shippo Managed Account&lt;/a&gt;.
     * @param shippoApiVersion Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide.
     * @param shippoAccountUpdateRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateShippoAccountResponse create(
            Optional<String> shippoApiVersion,
            ShippoAccountUpdateRequest shippoAccountUpdateRequest) throws Exception {
        CreateShippoAccountRequest request =
            CreateShippoAccountRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .shippoAccountUpdateRequest(shippoAccountUpdateRequest)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/shippo-accounts");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "shippoAccountUpdateRequest",
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
                      "CreateShippoAccount", 
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
                            "CreateShippoAccount",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "CreateShippoAccount",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "CreateShippoAccount",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateShippoAccountResponse.Builder _resBuilder = 
            CreateShippoAccountResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateShippoAccountResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "201")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ShippoAccount _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ShippoAccount>() {});
                _res.withShippoAccount(Optional.ofNullable(_out));
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
     * Retrieve a Shippo Account
     * Returns a Shippo Managed Account using an object ID.
     * @return The call builder
     */
    public GetShippoAccountRequestBuilder get() {
        return new GetShippoAccountRequestBuilder(this);
    }

    /**
     * Retrieve a Shippo Account
     * Returns a Shippo Managed Account using an object ID.
     * @param shippoAccountId Object ID of the ShippoAccount
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetShippoAccountResponse get(
            String shippoAccountId) throws Exception {
        return get(shippoAccountId, Optional.empty());
    }
    
    /**
     * Retrieve a Shippo Account
     * Returns a Shippo Managed Account using an object ID.
     * @param shippoAccountId Object ID of the ShippoAccount
     * @param shippoApiVersion Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetShippoAccountResponse get(
            String shippoAccountId,
            Optional<String> shippoApiVersion) throws Exception {
        GetShippoAccountRequest request =
            GetShippoAccountRequest
                .builder()
                .shippoAccountId(shippoAccountId)
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetShippoAccountRequest.class,
                _baseUrl,
                "/shippo-accounts/{ShippoAccountId}",
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
                      "GetShippoAccount", 
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
                            "GetShippoAccount",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "GetShippoAccount",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "GetShippoAccount",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetShippoAccountResponse.Builder _resBuilder = 
            GetShippoAccountResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetShippoAccountResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ShippoAccount _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ShippoAccount>() {});
                _res.withShippoAccount(Optional.ofNullable(_out));
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
     * Update a Shippo Account
     * Updates a Shippo Managed Account using an object ID.
     * @return The call builder
     */
    public UpdateShippoAccountRequestBuilder update() {
        return new UpdateShippoAccountRequestBuilder(this);
    }

    /**
     * Update a Shippo Account
     * Updates a Shippo Managed Account using an object ID.
     * @param shippoAccountId Object ID of the ShippoAccount
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateShippoAccountResponse update(
            String shippoAccountId) throws Exception {
        return update(shippoAccountId, Optional.empty(), Optional.empty());
    }
    
    /**
     * Update a Shippo Account
     * Updates a Shippo Managed Account using an object ID.
     * @param shippoAccountId Object ID of the ShippoAccount
     * @param shippoApiVersion Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide.
     * @param shippoAccountUpdateRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateShippoAccountResponse update(
            String shippoAccountId,
            Optional<String> shippoApiVersion,
            Optional<? extends ShippoAccountUpdateRequest> shippoAccountUpdateRequest) throws Exception {
        UpdateShippoAccountRequest request =
            UpdateShippoAccountRequest
                .builder()
                .shippoAccountId(shippoAccountId)
                .shippoApiVersion(shippoApiVersion)
                .shippoAccountUpdateRequest(shippoAccountUpdateRequest)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                UpdateShippoAccountRequest.class,
                _baseUrl,
                "/shippo-accounts/{ShippoAccountId}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "PUT");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "shippoAccountUpdateRequest",
                "json",
                false);
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
                      "UpdateShippoAccount", 
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
                            "UpdateShippoAccount",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "UpdateShippoAccount",
                            Optional.of(List.of()), 
                            sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "UpdateShippoAccount",
                            Optional.of(List.of()),
                            sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        UpdateShippoAccountResponse.Builder _resBuilder = 
            UpdateShippoAccountResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        UpdateShippoAccountResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ShippoAccount _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ShippoAccount>() {});
                _res.withShippoAccount(Optional.ofNullable(_out));
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
