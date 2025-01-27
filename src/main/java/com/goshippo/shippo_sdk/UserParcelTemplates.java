/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.goshippo.shippo_sdk;

import com.fasterxml.jackson.core.type.TypeReference;
import com.goshippo.shippo_sdk.models.components.UserParcelTemplate;
import com.goshippo.shippo_sdk.models.components.UserParcelTemplateCreateRequest;
import com.goshippo.shippo_sdk.models.components.UserParcelTemplateList;
import com.goshippo.shippo_sdk.models.components.UserParcelTemplateUpdateRequest;
import com.goshippo.shippo_sdk.models.errors.SDKError;
import com.goshippo.shippo_sdk.models.operations.CreateUserParcelTemplateRequest;
import com.goshippo.shippo_sdk.models.operations.CreateUserParcelTemplateRequestBuilder;
import com.goshippo.shippo_sdk.models.operations.CreateUserParcelTemplateResponse;
import com.goshippo.shippo_sdk.models.operations.DeleteUserParcelTemplateRequest;
import com.goshippo.shippo_sdk.models.operations.DeleteUserParcelTemplateRequestBuilder;
import com.goshippo.shippo_sdk.models.operations.DeleteUserParcelTemplateResponse;
import com.goshippo.shippo_sdk.models.operations.GetUserParcelTemplateRequest;
import com.goshippo.shippo_sdk.models.operations.GetUserParcelTemplateRequestBuilder;
import com.goshippo.shippo_sdk.models.operations.GetUserParcelTemplateResponse;
import com.goshippo.shippo_sdk.models.operations.ListUserParcelTemplatesRequest;
import com.goshippo.shippo_sdk.models.operations.ListUserParcelTemplatesRequestBuilder;
import com.goshippo.shippo_sdk.models.operations.ListUserParcelTemplatesResponse;
import com.goshippo.shippo_sdk.models.operations.SDKMethodInterfaces.*;
import com.goshippo.shippo_sdk.models.operations.UpdateUserParcelTemplateRequest;
import com.goshippo.shippo_sdk.models.operations.UpdateUserParcelTemplateRequestBuilder;
import com.goshippo.shippo_sdk.models.operations.UpdateUserParcelTemplateResponse;
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
 * A user parcel template represents a package used for shipping that has preset dimensions and attributes defined 
 * by you. They are useful for capturing attributes of parcel-types you frequently use for shipping, allowing 
 * them to be defined once and then used for many shipments. These parcel templates can also be used for live rates.
 * 
 * User parcel templates can also be created using a carrier parcel template, where the dimensions will be copied from 
 * the carrier presets, but the weight can be configured by you.
 * &lt;SchemaDefinition schemaRef="#/components/schemas/UserParcelTemplate"/&gt;
 */
public class UserParcelTemplates implements
            MethodCallListUserParcelTemplates,
            MethodCallCreateUserParcelTemplate,
            MethodCallDeleteUserParcelTemplate,
            MethodCallGetUserParcelTemplate,
            MethodCallUpdateUserParcelTemplate {

    private final SDKConfiguration sdkConfiguration;

    UserParcelTemplates(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * List all user parcel templates
     * Returns a list all of all user parcel template objects.
     * @return The call builder
     */
    public ListUserParcelTemplatesRequestBuilder list() {
        return new ListUserParcelTemplatesRequestBuilder(this);
    }

    /**
     * List all user parcel templates
     * Returns a list all of all user parcel template objects.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListUserParcelTemplatesResponse listDirect() throws Exception {
        return list(Optional.empty());
    }
    
    /**
     * List all user parcel templates
     * Returns a list all of all user parcel template objects.
     * @param shippoApiVersion Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public ListUserParcelTemplatesResponse list(
            Optional<String> shippoApiVersion) throws Exception {
        ListUserParcelTemplatesRequest request =
            ListUserParcelTemplatesRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/user-parcel-templates");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "ListUserParcelTemplates", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "ListUserParcelTemplates",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "ListUserParcelTemplates",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "ListUserParcelTemplates",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        ListUserParcelTemplatesResponse.Builder _resBuilder = 
            ListUserParcelTemplatesResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        ListUserParcelTemplatesResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                UserParcelTemplateList _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<UserParcelTemplateList>() {});
                _res.withUserParcelTemplateList(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
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
     * Create a new user parcel template
     * Creates a new user parcel template. &lt;br&gt;You can choose to create a
     * parcel template using a preset carrier template as a starting point, or
     * you can create an entirely custom one. To use a preset carrier template,
     * pass in a unique template token from &lt;a href="#tag/Parcel-Templates"&gt;this list&lt;/a&gt;
     * plus the weight fields (**weight** and **weight_unit**). Otherwise, omit
     * the template field and pass the other fields, for the weight, length, height,
     * and depth, as well as their units."
     * @return The call builder
     */
    public CreateUserParcelTemplateRequestBuilder create() {
        return new CreateUserParcelTemplateRequestBuilder(this);
    }

    /**
     * Create a new user parcel template
     * Creates a new user parcel template. &lt;br&gt;You can choose to create a
     * parcel template using a preset carrier template as a starting point, or
     * you can create an entirely custom one. To use a preset carrier template,
     * pass in a unique template token from &lt;a href="#tag/Parcel-Templates"&gt;this list&lt;/a&gt;
     * plus the weight fields (**weight** and **weight_unit**). Otherwise, omit
     * the template field and pass the other fields, for the weight, length, height,
     * and depth, as well as their units."
     * @param userParcelTemplateCreateRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateUserParcelTemplateResponse create(
            UserParcelTemplateCreateRequest userParcelTemplateCreateRequest) throws Exception {
        return create(Optional.empty(), userParcelTemplateCreateRequest);
    }
    
    /**
     * Create a new user parcel template
     * Creates a new user parcel template. &lt;br&gt;You can choose to create a
     * parcel template using a preset carrier template as a starting point, or
     * you can create an entirely custom one. To use a preset carrier template,
     * pass in a unique template token from &lt;a href="#tag/Parcel-Templates"&gt;this list&lt;/a&gt;
     * plus the weight fields (**weight** and **weight_unit**). Otherwise, omit
     * the template field and pass the other fields, for the weight, length, height,
     * and depth, as well as their units."
     * @param shippoApiVersion Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide.
     * @param userParcelTemplateCreateRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public CreateUserParcelTemplateResponse create(
            Optional<String> shippoApiVersion,
            UserParcelTemplateCreateRequest userParcelTemplateCreateRequest) throws Exception {
        CreateUserParcelTemplateRequest request =
            CreateUserParcelTemplateRequest
                .builder()
                .shippoApiVersion(shippoApiVersion)
                .userParcelTemplateCreateRequest(userParcelTemplateCreateRequest)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/user-parcel-templates");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "userParcelTemplateCreateRequest",
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
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "CreateUserParcelTemplate", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "CreateUserParcelTemplate",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "CreateUserParcelTemplate",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "CreateUserParcelTemplate",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        CreateUserParcelTemplateResponse.Builder _resBuilder = 
            CreateUserParcelTemplateResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        CreateUserParcelTemplateResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                UserParcelTemplate _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<UserParcelTemplate>() {});
                _res.withUserParcelTemplate(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
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
     * Delete a user parcel template
     * Deletes a user parcel template using an object ID.
     * @return The call builder
     */
    public DeleteUserParcelTemplateRequestBuilder delete() {
        return new DeleteUserParcelTemplateRequestBuilder(this);
    }

    /**
     * Delete a user parcel template
     * Deletes a user parcel template using an object ID.
     * @param userParcelTemplateObjectId Object ID of the user parcel template
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public DeleteUserParcelTemplateResponse delete(
            String userParcelTemplateObjectId) throws Exception {
        return delete(userParcelTemplateObjectId, Optional.empty());
    }
    
    /**
     * Delete a user parcel template
     * Deletes a user parcel template using an object ID.
     * @param userParcelTemplateObjectId Object ID of the user parcel template
     * @param shippoApiVersion Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public DeleteUserParcelTemplateResponse delete(
            String userParcelTemplateObjectId,
            Optional<String> shippoApiVersion) throws Exception {
        DeleteUserParcelTemplateRequest request =
            DeleteUserParcelTemplateRequest
                .builder()
                .userParcelTemplateObjectId(userParcelTemplateObjectId)
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                DeleteUserParcelTemplateRequest.class,
                _baseUrl,
                "/user-parcel-templates/{UserParcelTemplateObjectId}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "DELETE");
        _req.addHeader("Accept", "*/*")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "DeleteUserParcelTemplate", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "DeleteUserParcelTemplate",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "DeleteUserParcelTemplate",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "DeleteUserParcelTemplate",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        DeleteUserParcelTemplateResponse.Builder _resBuilder = 
            DeleteUserParcelTemplateResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        DeleteUserParcelTemplateResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "204")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
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
     * Retrieves a user parcel template
     * Returns the parcel template information for a specific user parcel
     * template, identified by the object ID.
     * @return The call builder
     */
    public GetUserParcelTemplateRequestBuilder get() {
        return new GetUserParcelTemplateRequestBuilder(this);
    }

    /**
     * Retrieves a user parcel template
     * Returns the parcel template information for a specific user parcel
     * template, identified by the object ID.
     * @param userParcelTemplateObjectId Object ID of the user parcel template
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetUserParcelTemplateResponse get(
            String userParcelTemplateObjectId) throws Exception {
        return get(userParcelTemplateObjectId, Optional.empty());
    }
    
    /**
     * Retrieves a user parcel template
     * Returns the parcel template information for a specific user parcel
     * template, identified by the object ID.
     * @param userParcelTemplateObjectId Object ID of the user parcel template
     * @param shippoApiVersion Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetUserParcelTemplateResponse get(
            String userParcelTemplateObjectId,
            Optional<String> shippoApiVersion) throws Exception {
        GetUserParcelTemplateRequest request =
            GetUserParcelTemplateRequest
                .builder()
                .userParcelTemplateObjectId(userParcelTemplateObjectId)
                .shippoApiVersion(shippoApiVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetUserParcelTemplateRequest.class,
                _baseUrl,
                "/user-parcel-templates/{UserParcelTemplateObjectId}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "GetUserParcelTemplate", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "GetUserParcelTemplate",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "GetUserParcelTemplate",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "GetUserParcelTemplate",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetUserParcelTemplateResponse.Builder _resBuilder = 
            GetUserParcelTemplateResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetUserParcelTemplateResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                UserParcelTemplate _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<UserParcelTemplate>() {});
                _res.withUserParcelTemplate(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
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
     * Update an existing user parcel template
     * Updates an existing user parcel template.
     * @return The call builder
     */
    public UpdateUserParcelTemplateRequestBuilder update() {
        return new UpdateUserParcelTemplateRequestBuilder(this);
    }

    /**
     * Update an existing user parcel template
     * Updates an existing user parcel template.
     * @param userParcelTemplateObjectId Object ID of the user parcel template
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateUserParcelTemplateResponse update(
            String userParcelTemplateObjectId) throws Exception {
        return update(userParcelTemplateObjectId, Optional.empty(), Optional.empty());
    }
    
    /**
     * Update an existing user parcel template
     * Updates an existing user parcel template.
     * @param userParcelTemplateObjectId Object ID of the user parcel template
     * @param shippoApiVersion Optional string used to pick a non-default API version to use. See our <a href="https://docs.goshippo.com/docs/api_concepts/apiversioning/">API version</a> guide.
     * @param userParcelTemplateUpdateRequest
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public UpdateUserParcelTemplateResponse update(
            String userParcelTemplateObjectId,
            Optional<String> shippoApiVersion,
            Optional<? extends UserParcelTemplateUpdateRequest> userParcelTemplateUpdateRequest) throws Exception {
        UpdateUserParcelTemplateRequest request =
            UpdateUserParcelTemplateRequest
                .builder()
                .userParcelTemplateObjectId(userParcelTemplateObjectId)
                .shippoApiVersion(shippoApiVersion)
                .userParcelTemplateUpdateRequest(userParcelTemplateUpdateRequest)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                UpdateUserParcelTemplateRequest.class,
                _baseUrl,
                "/user-parcel-templates/{UserParcelTemplateObjectId}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "PUT");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "userParcelTemplateUpdateRequest",
                "json",
                false);
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, this.sdkConfiguration.globals));
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "UpdateUserParcelTemplate", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "UpdateUserParcelTemplate",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "UpdateUserParcelTemplate",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "UpdateUserParcelTemplate",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        UpdateUserParcelTemplateResponse.Builder _resBuilder = 
            UpdateUserParcelTemplateResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        UpdateUserParcelTemplateResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                UserParcelTemplate _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<UserParcelTemplate>() {});
                _res.withUserParcelTemplate(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
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
