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
 * The interface for the Base Workbook Request Builder.
 */
public interface IBaseWorkbookRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     */
    IWorkbookRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     */
    IWorkbookRequest buildRequest(final java.util.List<Option> requestOptions);

    /**
     * Gets the request builder for WorkbookApplication.
     */
    IWorkbookApplicationRequestBuilder application();

    IWorkbookNamedItemCollectionRequestBuilder names();

    IWorkbookNamedItemRequestBuilder names(final String id);

    IWorkbookTableCollectionRequestBuilder tables();

    IWorkbookTableRequestBuilder tables(final String id);

    IWorkbookWorksheetCollectionRequestBuilder worksheets();

    IWorkbookWorksheetRequestBuilder worksheets(final String id);

    /**
     * Gets the request builder for WorkbookFunctions.
     */
    IWorkbookFunctionsRequestBuilder functions();
    IWorkbookCreateSessionRequestBuilder createSession(final Boolean persistChanges);
    IWorkbookCloseSessionRequestBuilder closeSession();
    IWorkbookRefreshSessionRequestBuilder refreshSession();
    IWorkbookProcessQueryRequestBuilder processQuery(final byte[] input);

}
