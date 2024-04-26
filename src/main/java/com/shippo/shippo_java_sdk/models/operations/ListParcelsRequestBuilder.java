/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.shippo.shippo_java_sdk.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.shippo.shippo_java_sdk.models.errors.SDKError;
import com.shippo.shippo_java_sdk.utils.LazySingletonValue;
import com.shippo.shippo_java_sdk.utils.Utils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import org.openapitools.jackson.nullable.JsonNullable;


public class ListParcelsRequestBuilder {

    private Optional<? extends Long> page = Utils.readDefaultOrConstValue(
                            "page",
                            "1",
                            new TypeReference<Optional<? extends Long>>() {});
    private Optional<? extends Long> results = Utils.readDefaultOrConstValue(
                            "results",
                            "25",
                            new TypeReference<Optional<? extends Long>>() {});
    private Optional<? extends String> shippoApiVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallListParcels sdk;

    public ListParcelsRequestBuilder(SDKMethodInterfaces.MethodCallListParcels sdk) {
        this.sdk = sdk;
    }
                
    public ListParcelsRequestBuilder page(long page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.of(page);
        return this;
    }

    public ListParcelsRequestBuilder page(Optional<? extends Long> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }
                
    public ListParcelsRequestBuilder results(long results) {
        Utils.checkNotNull(results, "results");
        this.results = Optional.of(results);
        return this;
    }

    public ListParcelsRequestBuilder results(Optional<? extends Long> results) {
        Utils.checkNotNull(results, "results");
        this.results = results;
        return this;
    }
                
    public ListParcelsRequestBuilder shippoApiVersion(String shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = Optional.of(shippoApiVersion);
        return this;
    }

    public ListParcelsRequestBuilder shippoApiVersion(Optional<? extends String> shippoApiVersion) {
        Utils.checkNotNull(shippoApiVersion, "shippoApiVersion");
        this.shippoApiVersion = shippoApiVersion;
        return this;
    }

    public ListParcelsResponse call() throws Exception {
        if (page == null) {
            page = _SINGLETON_VALUE_Page.value();
        }
        if (results == null) {
            results = _SINGLETON_VALUE_Results.value();
        }

        return sdk.list(
            page,
            results,
            shippoApiVersion);
    }

    private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Page =
            new LazySingletonValue<>(
                    "page",
                    "1",
                    new TypeReference<Optional<? extends Long>>() {});

    private static final LazySingletonValue<Optional<? extends Long>> _SINGLETON_VALUE_Results =
            new LazySingletonValue<>(
                    "results",
                    "25",
                    new TypeReference<Optional<? extends Long>>() {});
}
