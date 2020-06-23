// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.IpNamedLocation;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Ip Named Location Request.
 */
public interface IIpNamedLocationRequest extends IHttpRequest {

    /**
     * Gets the IpNamedLocation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<IpNamedLocation> callback);

    /**
     * Gets the IpNamedLocation from the service
     *
     * @return the IpNamedLocation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IpNamedLocation get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<IpNamedLocation> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this IpNamedLocation with a source
     *
     * @param sourceIpNamedLocation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final IpNamedLocation sourceIpNamedLocation, final ICallback<IpNamedLocation> callback);

    /**
     * Patches this IpNamedLocation with a source
     *
     * @param sourceIpNamedLocation the source object with updates
     * @return the updated IpNamedLocation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IpNamedLocation patch(final IpNamedLocation sourceIpNamedLocation) throws ClientException;

    /**
     * Posts a IpNamedLocation with a new object
     *
     * @param newIpNamedLocation the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final IpNamedLocation newIpNamedLocation, final ICallback<IpNamedLocation> callback);

    /**
     * Posts a IpNamedLocation with a new object
     *
     * @param newIpNamedLocation the new object to create
     * @return the created IpNamedLocation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IpNamedLocation post(final IpNamedLocation newIpNamedLocation) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IIpNamedLocationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IIpNamedLocationRequest expand(final String value);

}
