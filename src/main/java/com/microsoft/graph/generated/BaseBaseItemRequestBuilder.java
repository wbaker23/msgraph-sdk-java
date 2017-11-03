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
 * The class for the Base Base Item Request Builder.
 */
public class BaseBaseItemRequestBuilder extends BaseRequestBuilder implements IBaseBaseItemRequestBuilder {

    /**
     * The request builder for the BaseItem
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseBaseItemRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IBaseItemRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public IBaseItemRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new BaseItemRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDriveRequestBuilder drive() {
        return new DriveRequestBuilder(getRequestUrlWithAdditionalSegment("drive"), getClient(), null);
    }

    public ISiteRequestBuilder site() {
        return new SiteRequestBuilder(getRequestUrlWithAdditionalSegment("site"), getClient(), null);
    }

    public IDriveItemRequestBuilder driveItem() {
        return new DriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("driveItem"), getClient(), null);
    }

    public IListRequestBuilder list() {
        return new ListRequestBuilder(getRequestUrlWithAdditionalSegment("list"), getClient(), null);
    }

    public IListItemRequestBuilder listItem() {
        return new ListItemRequestBuilder(getRequestUrlWithAdditionalSegment("listItem"), getClient(), null);
    }

    public ISharedDriveItemRequestBuilder sharedDriveItem() {
        return new SharedDriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("sharedDriveItem"), getClient(), null);
    }

    /**
     * Gets the request builder for User.
     */
    public IUserWithReferenceRequestBuilder createdByUser() {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdByUser"), getClient(), null);
    }

    /**
     * Gets the request builder for User.
     */
    public IUserWithReferenceRequestBuilder lastModifiedByUser() {
        return new UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("lastModifiedByUser"), getClient(), null);
    }
}
