/*
 * Copyright (c) Octopus Deploy and contributors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 *  these files except in compliance with the License. You may obtain a copy of the
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

import java.net.URL;
import java.time.Duration;
import java.util.Optional;

public class ConnectData {

  private final URL octopusServerUrl;
  private final String apiKey;
  private final Optional<ProxyData> proxy;
  private final Duration timeout;

  public ConnectData(final URL octopusServerUrl, final String apiKey, final Duration timeout) {
    this(octopusServerUrl, apiKey, timeout, Optional.empty());
  }

  public ConnectData(
      final URL octopusServerUrl,
      final String apiKey,
      final Duration timeout,
      final Optional<ProxyData> proxy) {
    this.octopusServerUrl = octopusServerUrl;
    this.apiKey = apiKey;
    this.timeout = timeout;
    this.proxy = proxy;
  }

  public URL getOctopusServerUrl() {
    return octopusServerUrl;
  }

  public String getApiKey() {
    return apiKey;
  }

  public Optional<ProxyData> getProxyData() {
    return proxy;
  }

  public Duration getTimeout() {
    return timeout;
  }
}
