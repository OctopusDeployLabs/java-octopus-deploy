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
import java.util.Optional;

import com.google.common.base.Preconditions;

public class ConnectDataBuilder {
  private URL octopusServerUrl;
  private String apiKey;
  private Optional<ProxyData> proxy = Optional.empty();
  // TODO - really need to add timeouts and stuff to this :( [OR work out how to make a builder from
  // a HttpCLient :(

  public ConnectDataBuilder setOctopusServerUrl(final URL octopusServerUrl) {
    this.octopusServerUrl = octopusServerUrl;
    return this;
  }

  public ConnectDataBuilder setApiKey(final String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  public ConnectDataBuilder setProxy(final ProxyData proxy) {
    this.proxy = Optional.ofNullable(proxy);
    return this;
  }

  public ConnectData build() {
    Preconditions.checkNotNull(octopusServerUrl, "Server URL cannot be null");
    Preconditions.checkNotNull(apiKey, "Api Key cannot be null");

    return new ConnectData(octopusServerUrl, apiKey, proxy);
  }
}
