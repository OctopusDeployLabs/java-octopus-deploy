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

import static java.util.Collections.singletonList;

import com.octopus.sdk.model.LoginBody;
import com.octopus.sdk.model.RootDocument;

import java.io.IOException;
import java.net.URL;
import java.net.UnknownHostException;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// TODO(tmm): Is this really a client, or is it a server?! I.e. according to everyone who uses it -
// it looks a LOT
// like a server.
public class OctopusClient {
  private static final Logger LOG = LogManager.getLogger();

  private final OkHttpClient httpClient;
  private final Gson gson;
  private final URL serverUrl;
  private final RootDocument rootDocument;
  private final Map<String, List<String>> requiredHeaders = new HashMap<>();

  public OctopusClient(
      final OkHttpClient httpClient,
      final URL serverUrl,
      final RootDocument rootDocument,
      final String apiKey) {
    this.httpClient = httpClient;
    this.serverUrl = serverUrl;
    this.rootDocument = rootDocument;
    requiredHeaders.put("X-Octopus-ApiKey", singletonList(apiKey));
    requiredHeaders.put("Content-Type", singletonList("application/json"));
    requiredHeaders.put("Accept-encoding", singletonList("application/json"));

    this.gson =
        new GsonBuilder()
            .registerTypeAdapter(
                OffsetDateTime.class, new Deserialisers.OffsetDateTimeDeserialiser())
            .create();
  }

  public OctopusClient(final URL serverUrl, final RootDocument rootDocument) {
    this(
        new OkHttpClient.Builder().cookieJar(new InMemoryCookieJar()).build(),
        serverUrl,
        rootDocument,
        "");
  }

  public URL getServerUrl() {
    return serverUrl;
  }

  public RootDocument getRootDocument() {
    return rootDocument;
  }

  public <T> T get(final RequestEndpoint endpoint, final Class<T> responseType) throws IOException {
    final Call call = createCall(endpoint, "GET", null);
    return executeCall(call, responseType);
  }

  public <T, U> U post(
      final RequestEndpoint endpoint, final T bodyObject, final Class<U> responseType)
      throws IOException {
    final Call call = createCall(endpoint, "POST", bodyObject);
    return executeCall(call, responseType);
  }

  public <T, U> U put(
      final RequestEndpoint endpoint, final T bodyObject, final Class<U> responseType)
      throws IOException {
    final Call call = createCall(endpoint, "PUT", bodyObject);
    return executeCall(call, responseType);
  }

  public void delete(final RequestEndpoint endpoint) throws IOException {
    final Call call = createCall(endpoint, "DELETE", null);
    executeCall(call, Void.class);
  }

  private String generateUrl(final RequestEndpoint endpoint) {
    final HttpUrl.Builder builder = HttpUrl.parse(serverUrl.toString()).newBuilder();
    builder.addPathSegments(endpoint.getPath());
    endpoint
        .getQueryParameters()
        .forEach((k, v) -> v.forEach(i -> builder.addQueryParameter(k, i)));

    // There MAY be a double "/" in the URL (which is legal, but may cause issues with some
    // frameworks)
    return builder.build().url().toString().replace("//", "/");
  }

  private <T> Call createCall(
      final RequestEndpoint endpoint, final String method, final T bodyObject) {

    final String url = generateUrl(endpoint);
    RequestBody body = null;
    if (bodyObject != null) {
      body = RequestBody.create(MediaType.parse("application/json"), gson.toJson(bodyObject));
    }
    final Request.Builder builder = new Request.Builder().method(method, body).url(url);
    requiredHeaders.forEach(
        (headerName, items) ->
            items.forEach(headerVal -> builder.addHeader(headerName, headerVal)));
    return httpClient.newCall(builder.build());
  }

  private <T> T executeCall(final Call call, final Class<T> responseType) throws IOException {
    try (final Response response = call.execute()) {
      final String responseBody = response.body().string();
      if (response.isSuccessful()) {
        try {
          final T result = gson.fromJson(responseBody, responseType);
          return result;
        } catch (final JsonSyntaxException e) {
          LOG.error(
              "Failed to decode the response body '{}' as a {}",
              responseBody,
              responseType.getSimpleName());
          throw e;
        }
      } else {
        throw new HttpException(response.code(), responseBody);
      }
    } catch (final UnknownHostException e) {
      LOG.error("Failed to connect to Octopus Server at {}", call.request().url());
      throw e;
    }
  }

  public boolean login(final String username, final String password) throws IOException {
    final LoginBody login = new LoginBody(username, password);
    final String loginPath = getRootDocument().getSignInLink();

    final Call loginCall = createCall(RequestEndpoint.fromPath(loginPath), "POST", login);
    try (final Response response = loginCall.execute()) {
      if (response.isSuccessful()) {
        final String csrfCookieContent = response.headers("Set-Cookie").get(1);
        final String csrfToken = getCsrfTokenFromCookies(csrfCookieContent);
        requiredHeaders.put("X-Octopus-Csrf-Token", singletonList(csrfToken));
      } else {
        LOG.error("Failed to login to {}", serverUrl);
        throw new HttpException(response.code(), response.message());
      }
    } catch (final UnknownHostException e) {
      LOG.error("Failed to connect to Octopus Server at {}", loginCall.request().url());
      throw e;
    }
    return true;
  }

  public boolean supportsSpaces() {
    return rootDocument.getSpacesLink() != null;
  }

  public boolean supportsChannels() {
    return rootDocument.getChannelsLink() != null;
  }

  // The 'accounts' link is only valid within a space, and thus will only be non-null in the rootDoc
  // if a default
  // space is enabled (OR OctpopusServer is a pre-space version).
  public boolean defaultSpaceAvailable() {
    return rootDocument.getAccountsLink() != null;
  }

  public static String getCsrfTokenFromCookies(final String csrfCookieContent) {
    try {
      final Pattern splittingRegex = Pattern.compile("^.*?=([^;]*).*");
      final Matcher matcher = splittingRegex.matcher(csrfCookieContent);
      matcher.matches();
      return matcher.group(1);
    } catch (final Exception e) {
      LOG.error("Failed to extract csrf token from '{}'", csrfCookieContent);
      throw e;
    }
  }
}
