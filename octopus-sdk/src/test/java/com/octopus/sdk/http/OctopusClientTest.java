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

import static com.octopus.sdk.support.TestHelpers.createLocalhostOctopusServerUrl;
import static com.octopus.sdk.support.TestHelpers.defaultRootDoc;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

import com.octopus.sdk.support.HttpMessageBodyObject;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import okhttp3.OkHttpClient;
import org.junit.jupiter.api.Test;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.model.Header;
import org.mockserver.model.RequestDefinition;

class OctopusClientTest {

  private final String apiKey = "THE_API_KEY";
  private final String PATH = "/test";
  private static final Gson gson = new Gson();
  private final ClientAndServer mockOctopusServer = new ClientAndServer(0);

  private OctopusClient createClientSendingToMockServer() {
    final URL serverUrl = createLocalhostOctopusServerUrl(mockOctopusServer.getPort());
    return new OctopusClient(new OkHttpClient(), serverUrl, defaultRootDoc(), apiKey);
  }

  @Test
  public void serverReportsItsServerUrlCorrectly() throws MalformedURLException {
    final URL serverUrl = new URL("http://localhost:8066");
    final OctopusClient client = new OctopusClient(serverUrl, defaultRootDoc());
    assertThat(client.getServerUrl()).isEqualTo(serverUrl);
  }

  @Test
  public void ensureTokenIsExtractedFromResponse() {
    final String content =
        "Octopus-Csrf-Token_0c98f4bd-64bd-481d-8978-7a602232c95c"
            + "=dmsmghQrWEyo1IcydngErktJEzkdxYjP45GXeYTR%2fAbsz9y9Kb2zi9SMIoDu8vl4e8k7CEkbpUatbR7%2fCxPB8%2fFP0p"
            + "%2bj2YYQhzuveWoKuFBpPtqTwJ0%2fj6K74MPdFhs1TT4LFGrgy0jFHU3lx2"
            + "%2fbI6s2AKIcqHEDNX1M03hRyh7NIAVGV7YQZDHrvIbThPHWIExp0fMYp%2bPNFysUar5Syc9bFG2ZBaotEQ4wEuOq7jY%3d%7cL"
            + "%2bArIsc0HpyBPPPhioSrrg%3d%3d; path=/; expires=Tue, 13-Jul-2021 05:29:17 GMT";
    final String output = OctopusClient.getCsrfTokenFromCookies(content);

    assertThat(output)
        .isEqualTo(
            "dmsmghQrWEyo1IcydngErktJEzkdxYjP45GXeYTR%2fAbsz9y9Kb2zi9SMIoDu8vl4e8k7CEkbpUatbR7"
                + "%2fCxPB8%2fFP0p%2bj2YYQhzuveWoKuFBpPtqTwJ0%2fj6K74MPdFhs1TT4LFGrgy0jFHU3lx2"
                + "%2fbI6s2AKIcqHEDNX1M03hRyh7NIAVGV7YQZDHrvIbThPHWIExp0fMYp%2bPNFysUar5Syc9bFG2ZBaotEQ4wEuOq7jY%3d%7cL"
                + "%2bArIsc0HpyBPPPhioSrrg%3d%3d");
  }

  @Test
  public void getRequestThrowsHttpExceptionIfResponseIsNotSuccess() {
    mockOctopusServer
        .when(request().withPath(PATH).withMethod("GET"))
        .respond(response().withStatusCode(404).withBody("Resource not available"));

    final OctopusClient client = createClientSendingToMockServer();
    final Throwable thrown =
        catchThrowable(() -> client.get(RequestEndpoint.fromPath(PATH), Integer.class));
    assertThat(thrown).isInstanceOf(HttpException.class);

    final HttpException httpException = (HttpException) thrown;
    assertThat(httpException.getStatusCode()).isEqualTo(404);
  }

  @Test
  public void jsonExceptionThrownIfResponseBodyDoesNotMatchRequestedType() {
    mockOctopusServer
        .when(request().withPath(PATH).withMethod("GET"))
        .respond(
            response().withStatusCode(200).withBody(gson.toJson(new HttpMessageBodyObject(5))));

    final OctopusClient client = createClientSendingToMockServer();
    final Throwable thrown =
        catchThrowable(() -> client.get(RequestEndpoint.fromPath(PATH), Integer.class));
    assertThat(thrown).isInstanceOf(JsonSyntaxException.class);
  }

  @Test
  public void canDecodeResponseBodyIntoExpectedType() throws IOException {
    final HttpMessageBodyObject expectationBody = new HttpMessageBodyObject(5);
    mockOctopusServer
        .when(request().withPath(PATH).withMethod("GET"))
        .respond(response().withStatusCode(200).withBody(gson.toJson(expectationBody)));

    final OctopusClient client = createClientSendingToMockServer();
    final HttpMessageBodyObject responseBodyObject =
        client.get(RequestEndpoint.fromPath(PATH), HttpMessageBodyObject.class);
    assertThat(responseBodyObject.theValue).isEqualTo(expectationBody.theValue);
  }

  @Test
  public void requestHeadersIncludeApiKeyAndContentTypeAndAcceptedType() throws IOException {
    final HttpMessageBodyObject expectationBody = new HttpMessageBodyObject(5);
    mockOctopusServer
        .when(request().withPath(PATH).withMethod("GET"))
        .respond(response().withStatusCode(200).withBody(gson.toJson(expectationBody)));

    final OctopusClient client = createClientSendingToMockServer();
    final HttpMessageBodyObject responseBodyObject =
        client.get(RequestEndpoint.fromPath(PATH), HttpMessageBodyObject.class);
    assertThat(responseBodyObject.theValue).isEqualTo(expectationBody.theValue);

    final RequestDefinition[] requestsWithMatchingHeaders =
        mockOctopusServer.retrieveRecordedRequests(
            request()
                .withHeader(new Header("X-Octopus-ApiKey", apiKey))
                .withHeader(new Header("Content-Type", "application/json"))
                .withHeader(new Header("Accept-encoding", "application/json")));
    assertThat(requestsWithMatchingHeaders).hasSize(1);
  }

  @Test
  public void canSendPostRequestToServer() throws IOException {
    final HttpMessageBodyObject sentBody = new HttpMessageBodyObject(5);
    final HttpMessageBodyObject response = new HttpMessageBodyObject(10);
    mockOctopusServer
        .when(request().withPath(PATH).withMethod("POST"))
        .respond(response().withStatusCode(200).withBody(gson.toJson(response)));

    final OctopusClient client = createClientSendingToMockServer();
    final HttpMessageBodyObject receivedResponse =
        client.post(RequestEndpoint.fromPath(PATH), sentBody, HttpMessageBodyObject.class);

    assertThat(receivedResponse.theValue).isEqualTo(response.theValue);
  }

  @Test
  public void canSendPutRequestToServer() throws IOException {
    final HttpMessageBodyObject sentBody = new HttpMessageBodyObject(3);
    final HttpMessageBodyObject response = new HttpMessageBodyObject(9);
    mockOctopusServer
        .when(request().withPath(PATH).withMethod("PUT"))
        .respond(response().withStatusCode(200).withBody(gson.toJson(response)));

    final OctopusClient client = createClientSendingToMockServer();
    final HttpMessageBodyObject receivedResponse =
        client.put(RequestEndpoint.fromPath(PATH), sentBody, HttpMessageBodyObject.class);

    assertThat(receivedResponse.theValue).isEqualTo(response.theValue);
  }

  @Test
  public void canSendDeleteRequestToServer() throws IOException {
    mockOctopusServer
        .when(request().withPath(PATH).withMethod("DELETE"))
        .respond(response().withStatusCode(200));

    final OctopusClient client = createClientSendingToMockServer();
    client.delete(RequestEndpoint.fromPath(PATH));

    assertThat(mockOctopusServer.retrieveRecordedRequests(request())).hasSize(1);
  }

  @Test
  public void ensureQueryParametersAreAppendedToPath() throws IOException {
    mockOctopusServer.when(request()).respond(response().withStatusCode(200));
    final Map<String, List<String>> queryParams = new HashMap<>();
    queryParams.put("Param1", Collections.singletonList("firstValue"));
    queryParams.put("Param2", Collections.singletonList("secondValue"));
    queryParams.put("Param3", Collections.singletonList("thirdValue"));

    final RequestEndpoint requestEndpoint = new RequestEndpoint(PATH, queryParams);

    final OctopusClient client = createClientSendingToMockServer();

    client.delete(requestEndpoint);

    final RequestDefinition[] requests =
        mockOctopusServer.retrieveRecordedRequests(
            request().withQueryStringParameters(queryParams));
    assertThat(requests).hasSize(1);
  }
}
