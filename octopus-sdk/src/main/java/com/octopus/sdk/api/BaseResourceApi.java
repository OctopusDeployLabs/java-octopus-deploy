/*
 * Copyright (c) Octopus Deploy and contributors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * these files except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.octopus.sdk.api;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.gson.JsonSyntaxException;
import com.octopus.sdk.http.HttpException;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.BaseResource;
import com.octopus.sdk.model.PaginatedCollection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class BaseResourceApi <T extends BaseResource, U extends PaginatedCollection<T>> {

    private static final Logger LOG = LogManager.getLogger();

    protected final OctopusClient client;
    protected final String rootPath;
    private final Class<T> resourceType;
    private final Class<U> collectionType;

    public BaseResourceApi(final OctopusClient client, final String rootPath, final Class<T> resourceType,
                           final Class<U> collectionType) {
        this.client = client;
        this.rootPath = rootPath;
        this.resourceType = resourceType;
        this.collectionType = collectionType;
    }

    public Optional<T> getById(final String id) throws IOException {
        Preconditions.checkNotNull(id, "Cannot provide a resource with a null id");
        final String spacePath = String.format("%s/%s", rootPath, id);
        try {
            final T overview = client.get(RequestEndpoint.fromPath(spacePath), resourceType);
            return Optional.of(overview);
        } catch (final HttpException e) {
            LOG.error(
                "Failed to retrieve a space with an Id of {} (http {}:{})",
                id,
                e.getStatusCode(),
                e.getMessage());
            return Optional.empty();
        } catch (final JsonSyntaxException e) {
            final String error =
                String.format(
                    "Failed to deserialize returned resource for space %s on Octopus Server %s",
                    id, client.getServerUrl());
            throw new RuntimeException(error, e);
        }
    }

    public void delete(final T resource) throws IOException {
        client.delete(RequestEndpoint.fromPath(resource.getSelfLink()));
    }

    public T update(final T resourceToUpdate) throws IOException {
        return client.put(
            RequestEndpoint.fromPath(resourceToUpdate.getSelfLink()), resourceToUpdate, resourceType);
    }

    public T create(final T resourceToCreate) throws IOException {
        return client.post(RequestEndpoint.fromPath(rootPath), resourceToCreate, resourceType);
    }

    public List<T> getByQuery(final Map<String, List<String>> queryParams) throws IOException {
        final RequestEndpoint endpoint = new RequestEndpoint(rootPath, queryParams);
        final U itemCollection = client.get(endpoint, collectionType);
        return getItemsFromPages(itemCollection);
    }

    protected List<T> getItemsFromPages(final U collection) throws IOException {
        final List<T> result = Lists.newArrayList(collection.getItems());
        U localCollection = collection;

        while (localCollection.getPageNext() != null) {
            localCollection =
                client.get(
                    RequestEndpoint.fromPathAndQueryString(localCollection.getPageNext()),
                    collectionType);
            result.addAll(localCollection.getItems());
        }

        return result;
    }
}
