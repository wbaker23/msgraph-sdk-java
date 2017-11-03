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
 * The class for the Base Workbook Chart Point Collection Request Builder.
 */
public class BaseWorkbookChartPointCollectionRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookChartPointCollectionRequestBuilder {

    /**
     * The request builder for this collection of WorkbookChartSeries
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookChartPointCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IWorkbookChartPointCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IWorkbookChartPointCollectionRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new WorkbookChartPointCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWorkbookChartPointRequestBuilder byId(final String id) {
        return new WorkbookChartPointRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }

    public IWorkbookChartPointItemAtRequestBuilder itemAt(final Integer index) {
        return new WorkbookChartPointItemAtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.itemAt"), getClient(), null, index);
    }

    public IWorkbookChartPointCountRequestBuilder count() {
        return new WorkbookChartPointCountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.count"), getClient(), null);
    }
}
