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

import com.octopus.sdk.exceptions.OctopusRequestException;
import com.octopus.sdk.exceptions.OctopusServerException;
import com.octopus.sdk.model.ErrorResponse;
import com.octopus.sdk.model.RootDocument;
import com.octopus.sdk.model.login.LoginBody;

import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URL;
import java.net.UnknownHostException;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.api.client.http.HttpStatusCodes;
import com.google.common.base.Preconditions;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import okhttp3.Call;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OctopusClient {
  private static final Logger LOG = LogManager.getLogger();
  private static final String ROOT_PATH = "api";

  private final OkHttpClient httpClient;
  private final Gson gson;
  private final URL serverUrl;
  private final Map<String, List<String>> requiredHeaders = new HashMap<>();

  public OctopusClient(final OkHttpClient httpClient, final URL serverUrl) {
    this.httpClient = httpClient;
    this.serverUrl = serverUrl;
    requiredHeaders.put("Content-Type", singletonList("application/json"));
    requiredHeaders.put("Accept-encoding", singletonList("application/json"));

    this.gson =
        new GsonBuilder()
            .registerTypeAdapter(
                OffsetDateTime.class, new GsonTypeConverters.OffsetDateTimeDeserializer())
            .registerTypeAdapter(
                OffsetDateTime.class, new GsonTypeConverters.OffsetDateTimeSerializer())
            .disableHtmlEscaping()
            .create();
  }

  public OctopusClient(final OkHttpClient httpClient, final URL serverUrl, final String apiKey) {
    this(httpClient, serverUrl);
    requiredHeaders.put("X-Octopus-ApiKey", singletonList(apiKey));
  }

  public URL getServerUrl() {
    return serverUrl;
  }

  public RootDocument getRootDocument() {
    try {
      return get(RequestEndpoint.fromPath(ROOT_PATH), RootDocument.class);
    } catch (final IOException e) {
      throw new UncheckedIOException(e.getMessage(), e);
    }
  }

  public <T> T get(final RequestEndpoint endpoint, final Class<T> responseType) throws IOException {
    final Call call = createCall(endpoint, "GET", null);
    return executeCall(call, responseType);
  }

  public <T, U> U post(
      final RequestEndpoint endpoint, final T bodyObject, final Class<U> responseType)
      throws IOException {
    final Call call = createCallWithJsonBody(endpoint, "POST", bodyObject);
    return executeCall(call, responseType);
  }

  public <U> U postStream(
      final RequestEndpoint endpoint, final File file, final Class<U> responseType)
      throws IOException {
    final RequestBody streamingBody =
        RequestBody.create(file, MediaType.parse("application/octet-stream"));
    final MultipartBody multipartBody =
        new MultipartBody.Builder()
            .setType(MultipartBody.FORM)
            .addFormDataPart("file", file.getName(), streamingBody)
            .build();

    final Call call = createCall(endpoint, "POST", multipartBody);
    return executeCall(call, responseType);
  }

  public <T, U> U put(
      final RequestEndpoint endpoint, final T bodyObject, final Class<U> responseType)
      throws IOException {
    final Call call = createCallWithJsonBody(endpoint, "PUT", bodyObject);
    return executeCall(call, responseType);
  }

  public void delete(final RequestEndpoint endpoint) throws IOException {
    final Call call = createCall(endpoint, "DELETE", null);
    executeCall(call, Void.class);
  }

  private String generateUrl(final RequestEndpoint endpoint) {
    final HttpUrl httpUrl = HttpUrl.parse(serverUrl.toString());
    if (httpUrl == null) {
      throw new IllegalArgumentException("Unable to generate a HttpUrl from " + endpoint);
    }
    final HttpUrl.Builder builder = httpUrl.newBuilder();
    builder.addPathSegments(endpoint.getPath());
    endpoint
        .getQueryParameters()
        .forEach((k, v) -> v.forEach(i -> builder.addQueryParameter(k, i)));

    // There MAY be a double "/" in the URL (which is legal, but may cause issues with some
    // frameworks)
    return builder.build().url().toString().replace("//", "/");
  }

  private <T> Call createCallWithJsonBody(
      final RequestEndpoint endpoint, final String method, final T bodyObject) {

    RequestBody body = null;
    if (bodyObject != null) {
      body = RequestBody.create(MediaType.parse("application/json"), gson.toJson(bodyObject));
    }
    return createCall(endpoint, method, body);
  }

  private Call createCall(
      final RequestEndpoint endpoint, final String method, final RequestBody body) {
    final String url = generateUrl(endpoint);
    final Request.Builder builder = new Request.Builder().method(method, body).url(url);
    requiredHeaders.forEach(
        (headerName, items) ->
            items.forEach(headerVal -> builder.addHeader(headerName, headerVal)));
    return httpClient.newCall(builder.build());
  }

  private <T> T executeCall(final Call call, final Class<T> responseType) throws IOException {
    try (final Response response = call.execute()) {
      final ResponseBody body = response.body();
      if (body == null) {
        throw new IllegalStateException(
            "Response from " + call.request().url() + " contained no body");
      }
      final String responseBody = response.body().string();
      if (response.isSuccessful()) {
        try {
          return gson.fromJson(responseBody, responseType);
        } catch (final JsonSyntaxException e) {
          LOG.error(
              "Failed to decode the response body '{}' as a {}",
              responseBody,
              responseType.getSimpleName());
          throw e;
        }
      } else {
        throw constructException(response.code(), responseBody);
      }
    } catch (final UnknownHostException e) {
      LOG.error("Failed to connect to Octopus Server at {}", call.request().url());
      throw e;
    }
  }

  public void login(final String username, final String password) throws IOException {
    Preconditions.checkArgument(
        httpClient.cookieJar() != CookieJar.NO_COOKIES,
        "Cannot login without a client side cookie jar");
    final LoginBody login = new LoginBody(username, password);
    final String loginPath = getRootDocument().getSignInLink();

    final Call loginCall =
        createCallWithJsonBody(RequestEndpoint.fromPath(loginPath), "POST", login);
    try (final Response response = loginCall.execute()) {
      if (response.isSuccessful()) {
        final String csrfCookieContent = response.headers("Set-Cookie").get(1);
        final String csrfToken = getCsrfTokenFromCookies(csrfCookieContent);
        requiredHeaders.put("X-Octopus-Csrf-Token", singletonList(csrfToken));
      } else {
        LOG.error("Failed to login to {}", serverUrl);
        final String responseBody = response.body().string();
        final ErrorResponse errorResponse = gson.fromJson(responseBody, ErrorResponse.class);
        throw new OctopusServerException(response.code(), errorResponse);
      }
    } catch (final UnknownHostException e) {
      LOG.error("Failed to connect to Octopus Server at {}", loginCall.request().url());
      throw e;
    }
  }

  public boolean supportsSpaces() {
    return getRootDocument().getSpacesLink() != null;
  }

  // The 'accounts' link is only valid within a space, and thus will only be non-null in the rootDoc
  // if a default
  // space is enabled (OR OctopusServer is a pre-space version).
  public boolean defaultSpaceAvailable() {
    return getRootDocument().getAccountsLink() != null;
  }

  public static String getCsrfTokenFromCookies(final String csrfCookieContent) {
    try {
      final Pattern splittingRegex = Pattern.compile("^.*?=([^;]*).*");
      final Matcher matcher = splittingRegex.matcher(csrfCookieContent);
      if (!matcher.matches()) {
        throw new IllegalArgumentException(
            "Response did not contain expected content for CSRF cookie - " + csrfCookieContent);
      }
      return matcher.group(1);
    } catch (final Exception e) {
      LOG.error("Failed to extract csrf token from '{}'", csrfCookieContent);
      throw e;
    }
  }

  private OctopusRequestException constructException(final int code, final String responseBody) {
    switch (code) {
      case HttpStatusCodes.STATUS_CODE_BAD_REQUEST:
      case HttpStatusCodes.STATUS_CODE_UNAUTHORIZED:
      case HttpStatusCodes.STATUS_CODE_CONFLICT:
        final ErrorResponse errorResponse = gson.fromJson(responseBody, ErrorResponse.class);
        return new OctopusServerException(code, errorResponse);
      default:
        return new OctopusRequestException(code, responseBody);
    }
  }
}
