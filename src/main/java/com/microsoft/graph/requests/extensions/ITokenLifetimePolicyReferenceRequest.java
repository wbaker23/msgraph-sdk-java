// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Token Lifetime Policy Reference Request.
 */
public interface ITokenLifetimePolicyReferenceRequest extends IHttpRequest {

    void delete(final ICallback<TokenLifetimePolicy> callback);

    TokenLifetimePolicy delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITokenLifetimePolicyReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITokenLifetimePolicyReferenceRequest expand(final String value);

    /**
     * Puts the TokenLifetimePolicy
     *
     * @param srcTokenLifetimePolicy the TokenLifetimePolicy to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(TokenLifetimePolicy srcTokenLifetimePolicy, final ICallback<TokenLifetimePolicy> callback);

    /**
     * Puts the TokenLifetimePolicy
     *
     * @param srcTokenLifetimePolicy the TokenLifetimePolicy to PUT
     * @return the TokenLifetimePolicy
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    TokenLifetimePolicy put(TokenLifetimePolicy srcTokenLifetimePolicy) throws ClientException;
}
