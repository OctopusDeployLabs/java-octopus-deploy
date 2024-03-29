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

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

import com.octopus.sdk.model.RootDocument;
import com.octopus.sdk.support.TestHelpers;

import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.jupiter.api.Test;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.matchers.Times;
import org.mockserver.model.HttpRequest;
import org.mockserver.model.RequestDefinition;

class OctopusClientFactoryTest {

  @Test
  public void ensureProxyServerIsUsed() throws MalformedURLException {
    final ClientAndServer mockProxyServer = new ClientAndServer();
    final Gson gson = new GsonBuilder().create();

    final String proxyUrl = String.format("http://localhost:%d", mockProxyServer.getPort());

    final ProxyData proxyData = new ProxyData(new URL(proxyUrl), "username", "password");

    final ConnectData connectData =
        new ConnectDataBuilder()
            .withApiKey("API-KEY")
            .withOctopusServerUrl(new URL("http://localhost:8065"))
            .withProxy(proxyData)
            .build();

    final OctopusClient client = OctopusClientFactory.createClient(connectData);

    // Throw a 407 to require an authentication exchange
    mockProxyServer.when(request(), Times.once()).respond(response().withStatusCode(407));

    mockProxyServer
        .when(request(), Times.once())
        .respond(
            response().withStatusCode(200).withBody(gson.toJson(TestHelpers.defaultRootDoc())));

    final RootDocument result = client.getRootDocument();

    assertThat(result).usingRecursiveComparison().isEqualTo(TestHelpers.defaultRootDoc());

    final RequestDefinition[] requests = mockProxyServer.retrieveRecordedRequests(request());
    assertThat(requests.length)
        .isEqualTo(2); // the unauthorized, then the second one with auth-headers
    final RequestDefinition request = requests[1];
    assertThat(request).isInstanceOf(HttpRequest.class);
    final HttpRequest httpRequest = (HttpRequest) request;

    assertThat(httpRequest.getMethod().toString()).isEqualTo("GET");
    assertThat(httpRequest.getPath().toString()).isEqualTo("/api");
    assertThat(httpRequest.getHeader("Host"))
        .containsExactly(connectData.getOctopusServerUrl().getAuthority());
    assertThat(httpRequest.getHeader("Proxy-Authorization").get(0)).startsWith("Basic");
  }
}
