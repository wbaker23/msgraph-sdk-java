// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Device Request Builder.
 */
public class BaseDeviceRequestBuilder extends BaseRequestBuilder implements IBaseDeviceRequestBuilder {

    /**
     * The request builder for the Device
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseDeviceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IDeviceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public IDeviceRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new DeviceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDirectoryObjectCollectionWithReferencesRequestBuilder registeredOwners() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("registeredOwners"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder registeredOwners(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("registeredOwners") + "/" + id, getClient(), null);
    }
    public IDirectoryObjectCollectionWithReferencesRequestBuilder registeredUsers() {
        return new DirectoryObjectCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("registeredUsers"), getClient(), null);
    }

    public IDirectoryObjectWithReferenceRequestBuilder registeredUsers(final String id) {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("registeredUsers") + "/" + id, getClient(), null);
    }
    public IExtensionCollectionRequestBuilder extensions() {
        return new ExtensionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions"), getClient(), null);
    }

    public IExtensionRequestBuilder extensions(final String id) {
        return new ExtensionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions") + "/" + id, getClient(), null);
    }
}
