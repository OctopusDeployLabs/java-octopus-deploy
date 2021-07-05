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

package com.octopus.sdk.http;

import com.octopus.sdk.model.RootDocument;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URL;

import com.google.common.base.Preconditions;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OctopusClientFactory {

  private static final String ROOT_PATH = "api";

  private static final Logger LOG = LogManager.getLogger();

  public static OctopusClient createClientAt(
      final OkHttpClient httpClient, final URL serverUrl, final String apiKey) {
    final RootDocument rootDoc = fetchRootDocument(httpClient, serverUrl);
    return new OctopusClient(httpClient, serverUrl, rootDoc, apiKey);
  }

  public static RootDocument fetchRootDocument(final OkHttpClient httpClient, final URL serverUrl) {
    Preconditions.checkNotNull(
        httpClient, "Failed to specify a httpClient for Octopus server connection");
    Preconditions.checkNotNull(
        serverUrl, "Failed to specify the URL at which Octopus Server can be found");

    final HttpUrl.Builder urlBuilder = HttpUrl.parse(serverUrl.toString()).newBuilder();
    urlBuilder.addPathSegments(ROOT_PATH);
    final Request request = new Request.Builder().url(urlBuilder.build()).get().build();
    try (final Response response = httpClient.newCall(request).execute()) {
      return extractRootDocument(response);
    } catch (IOException e) {
      LOG.error("Failed to connect to an Octopus Server at " + serverUrl, e);
      throw new UncheckedIOException(e);
    }
  }

  private static RootDocument extractRootDocument(final Response response) throws IOException {
    final String responseBody = response.body().string();
    if (!response.isSuccessful()) {
      final String errorMessage =
          String.format(
              "Octopus Server at '%s' rejected request for the root document " + "(%d:%s)",
              response.request().url(), response.code(), responseBody);
      throw new RuntimeException(errorMessage);
    }

    try {
      return new Gson().fromJson(responseBody, RootDocument.class);
    } catch (final JsonSyntaxException e) {
      final String errorMessage =
          String.format(
              "Octopus Server at '%s' did not supply a valid root document %s",
              response.request().url(), responseBody);
      throw new RuntimeException(errorMessage, e);
    }
  }
}
