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
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URL;
import java.time.Duration;

import okhttp3.OkHttpClient;
import org.junit.jupiter.api.Test;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.model.Delay;

class OctopusClientFactoryTest {

  // NOTE: Octopus Server does not require an ApiKey for accessing root document, as such it has
  // been
  // left empty for these tests.

  @Test
  public void throwsIfCannotConnectToSuppliedUrl() {
    assertThatThrownBy(
            () ->
                OctopusClientFactory.fetchRootDocument(
                    new OkHttpClient(), createLocalhostOctopusServerUrl(9999)))
        .isInstanceOf(UncheckedIOException.class);
  }

  @Test
  public void aNonSuccessResponseForRootDocumentThrowsException() {
    final ClientAndServer mockOctopusServer = new ClientAndServer(0);
    mockOctopusServer.when(request().withPath("/api")).respond(response().withStatusCode(404));

    final URL serverUrl = createLocalhostOctopusServerUrl(mockOctopusServer.getPort());

    assertThatThrownBy(() -> OctopusClientFactory.createClient(new ConnectData(serverUrl, "")))
        .isInstanceOf(RuntimeException.class);
  }

  @Test
  public void timeoutWhenFetchingRootDocThrowsHttpException() {
    final ClientAndServer mockOctopusServer = new ClientAndServer(0);
    final URL serverUrl = createLocalhostOctopusServerUrl(mockOctopusServer.getPort());
    final OkHttpClient.Builder builder =
        new OkHttpClient.Builder().callTimeout(Duration.ofMillis(5));

    mockOctopusServer
        .when(request())
        .respond(response().withDelay(Delay.milliseconds(10)).withStatusCode(200));

    assertThatThrownBy(
            () -> OctopusClientFactory.createClient(builder, new ConnectData(serverUrl, "")))
        .isInstanceOf(UncheckedIOException.class)
        .hasRootCauseInstanceOf(IOException.class);
  }
}
