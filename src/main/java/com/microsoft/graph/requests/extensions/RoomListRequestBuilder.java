// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IRoomListRequest;
import com.microsoft.graph.requests.extensions.RoomListRequest;
import com.microsoft.graph.requests.extensions.IRoomCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoomCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoomRequestBuilder;
import com.microsoft.graph.requests.extensions.RoomRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Room List Request Builder.
 */
public class RoomListRequestBuilder extends BaseRequestBuilder implements IRoomListRequestBuilder {

    /**
     * The request builder for the RoomList
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RoomListRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IRoomListRequest instance
     */
    public IRoomListRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IRoomListRequest instance
     */
    public IRoomListRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new RoomListRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IRoomCollectionRequestBuilder rooms() {
        return new RoomCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("rooms"), getClient(), null);
    }

    public IRoomRequestBuilder rooms(final String id) {
        return new RoomRequestBuilder(getRequestUrlWithAdditionalSegment("rooms") + "/" + id, getClient(), null);
    }
}
