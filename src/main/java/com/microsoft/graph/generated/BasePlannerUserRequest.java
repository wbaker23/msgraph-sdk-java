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
 * The class for the Base Planner User Request.
 */
public class BasePlannerUserRequest extends BaseRequest implements IBasePlannerUserRequest {

    /**
     * The request for the PlannerUser
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     * @param responseClass The class of the reponse
     */
    public BasePlannerUserRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<Option> requestOptions,
            final Class responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * Gets the PlannerUser from the service
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<PlannerUser> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PlannerUser from the service
     * @return The PlannerUser from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public PlannerUser get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    public void delete(final ICallback<Void> callback) {{
        send(HttpMethod.DELETE, callback, null);
    }}

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {{
        send(HttpMethod.DELETE, null);
    }}

    /**
     * Patches this PlannerUser with a source
     * @param sourcePlannerUser The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    public void patch(final PlannerUser sourcePlannerUser, final ICallback<PlannerUser> callback) {
        send(HttpMethod.PATCH, callback, sourcePlannerUser);
    }

    /**
     * Patches this PlannerUser with a source
     * @param sourcePlannerUser The source object with updates
     * @return The updated PlannerUser
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public PlannerUser patch(final PlannerUser sourcePlannerUser) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlannerUser);
    }

    /**
     * Creates a PlannerUser with a new object
     * @param newPlannerUser The new object to create
     * @param callback The callback to be called after success or failure.
     */
    public void post(final PlannerUser newPlannerUser, final ICallback<PlannerUser> callback) {
        send(HttpMethod.POST, callback, newPlannerUser);
    }

    /**
     * Creates a PlannerUser with a new object
     * @param newPlannerUser The new object to create
     * @return The created PlannerUser
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    public PlannerUser post(final PlannerUser newPlannerUser) throws ClientException {
        return send(HttpMethod.POST, newPlannerUser);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
     public IPlannerUserRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (PlannerUserRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
     public IPlannerUserRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (PlannerUserRequest)this;
     }

}

