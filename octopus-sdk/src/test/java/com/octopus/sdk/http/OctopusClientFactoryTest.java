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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.octopus.sdk.model.RootDocument;
import com.octopus.sdk.support.TestHelpers;
import org.junit.jupiter.api.Test;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.model.HttpRequest;
import org.mockserver.model.RequestDefinition;

import java.net.MalformedURLException;
import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

class OctopusClientFactoryTest {

  private ClientAndServer mockProxyServer;
  private final Gson gson = new GsonBuilder().create();

  @Test
  public void ensureProxyServerIsUsed() throws MalformedURLException {
    mockProxyServer = new ClientAndServer();

    final String proxyUrl = String.format("http://localhost:%d", mockProxyServer.getPort());

    final ProxyData proxyData = new ProxyData(new URL(proxyUrl), "username", "password");


    final ConnectData connectData = new ConnectDataBuilder()
        .withApiKey("API-KEY")
        .withOctopusServerUrl(new URL("http://localhost:8065"))
        .withProxy(proxyData)
        .build();

    final OctopusClient client = OctopusClientFactory.createClient(connectData);

    mockProxyServer.when(request())
        .respond(response().withStatusCode(200).withBody(gson.toJson(TestHelpers.defaultRootDoc())));

    final RootDocument result = client.getRootDocument();

    assertThat(result).usingRecursiveComparison().isEqualTo(TestHelpers.defaultRootDoc());

    final RequestDefinition[] requests = mockProxyServer.retrieveRecordedRequests(request());
    assertThat(requests.length).isOne();
    final RequestDefinition request = requests[0];
    assertThat(request).isInstanceOf(HttpException.class);
    final HttpRequest httpRequest = (HttpRequest)request;

    assertThat(httpRequest.getMethod().toString()).isEqualTo("get");
    assertThat(httpRequest.getPath().toString()).isEqualTo("/api");
    assertThat(httpRequest.getHeader("Host").toString()).isEqualTo(connectData.getOctopusServerUrl().toString());
  }

}
