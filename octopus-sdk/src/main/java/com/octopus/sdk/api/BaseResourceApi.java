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

import com.octopus.sdk.http.HttpException;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.http.RequestEndpoint;
import com.octopus.sdk.model.BaseResource;
import com.octopus.sdk.model.PaginatedCollection;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.gson.JsonSyntaxException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class BaseResourceApi<
    CREATE_TYPE extends BaseResource,
    RESPONSE_TYPE extends BaseResource,
    PAGINATION_TYPE extends PaginatedCollection<RESPONSE_TYPE>,
    WRAPPED_TYPE> {

  private static final Logger LOG = LogManager.getLogger();

  protected final OctopusClient client;
  protected final String rootPath;
  private final Class<RESPONSE_TYPE> responseType;
  private final Class<PAGINATION_TYPE> collectionType;

  public BaseResourceApi(
      final OctopusClient client,
      final String rootPath,
      final Class<RESPONSE_TYPE> responseType,
      final Class<PAGINATION_TYPE> collectionType) {
    this.client = client;
    this.rootPath = rootPath;
    this.responseType = responseType;
    this.collectionType = collectionType;
  }

  public Optional<WRAPPED_TYPE> getById(final String id) throws IOException {
    Optional<RESPONSE_TYPE> response = getRawTypeById(id);
    return response.map(this::createServerObject);
  }

  protected Optional<RESPONSE_TYPE> getRawTypeById(final String id) throws IOException {
    Preconditions.checkNotNull(id, "Cannot provide a resource with a null id");
    final String spacePath = String.format("%s/%s", rootPath, id);
    try {
      final RESPONSE_TYPE overview = client.get(RequestEndpoint.fromPath(spacePath), responseType);
      return Optional.of(overview);
    } catch (final HttpException e) {
      LOG.error(
          "Failed to retrieve a resource with an Id of {} (http {}:{})",
          id,
          e.getStatusCode(),
          e.getMessage());
      return Optional.empty();
    } catch (final JsonSyntaxException e) {
      final String error =
          String.format(
              "Failed to deserialize returned resource of id %s from Octopus Server %s",
              id, client.getServerUrl());
      throw new RuntimeException(error, e);
    }
  }

  public void delete(final String id) throws IOException {
    final Optional<RESPONSE_TYPE> resource = getRawTypeById(id);
    if (resource.isPresent()) {
      client.delete(RequestEndpoint.fromPath(resource.get().getSelfLink()));
    }
  }

  public void delete(final CREATE_TYPE resource) throws IOException {
    client.delete(RequestEndpoint.fromPath(resource.getSelfLink()));
  }

  public WRAPPED_TYPE update(final CREATE_TYPE resourceToUpdate) throws IOException {
    return createServerObject(
        client.put(
            RequestEndpoint.fromPath(resourceToUpdate.getSelfLink()),
            resourceToUpdate,
            responseType));
  }

  public WRAPPED_TYPE create(final CREATE_TYPE resourceToCreate) throws IOException {
    return createServerObject(
        client.post(RequestEndpoint.fromPath(rootPath), resourceToCreate, responseType));
  }

  public List<WRAPPED_TYPE> getByQuery(final Map<String, List<String>> queryParams)
      throws IOException {
    final RequestEndpoint endpoint = new RequestEndpoint(rootPath, queryParams);
    final PAGINATION_TYPE itemCollection = client.get(endpoint, collectionType);
    return getItemsFromPages(itemCollection).stream()
        .map(this::createServerObject)
        .collect(Collectors.toList());
  }

  protected List<RESPONSE_TYPE> getRawByQuery(final Map<String, List<String>> queryParams)
      throws IOException {
    final RequestEndpoint endpoint = new RequestEndpoint(rootPath, queryParams);
    final PAGINATION_TYPE itemCollection = client.get(endpoint, collectionType);
    return getItemsFromPages(itemCollection);
  }

  public List<WRAPPED_TYPE> getAll() throws IOException {
    final RequestEndpoint endpoint = RequestEndpoint.fromPath(rootPath);
    final PAGINATION_TYPE itemCollection = client.get(endpoint, collectionType);
    return getItemsFromPages(itemCollection).stream()
        .map(this::createServerObject)
        .collect(Collectors.toList());
  }

  protected List<RESPONSE_TYPE> getItemsFromPages(final PAGINATION_TYPE collection)
      throws IOException {
    final List<RESPONSE_TYPE> result = Lists.newArrayList(collection.getItems());
    PAGINATION_TYPE localCollection = collection;

    while (localCollection.getPageNext() != null) {
      localCollection =
          client.get(
              RequestEndpoint.fromPathWithQueryString(localCollection.getPageNext()),
              collectionType);
      result.addAll(localCollection.getItems());
    }

    return result;
  }

  public abstract WRAPPED_TYPE createServerObject(final RESPONSE_TYPE resource);
}
