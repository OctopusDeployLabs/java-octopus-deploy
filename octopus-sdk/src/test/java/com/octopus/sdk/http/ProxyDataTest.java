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

import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ProxyDataTest {

  @Test
  public void creatingProxyDataWithNullUsernameThrows() {
    assertThatThrownBy(() -> new ProxyData(new URL("http://localhost"), null, "password")).isInstanceOf(
        NullPointerException.class);
  }

  @Test
  public void creatingProxyDataWithNullPasswordThrows() {
    assertThatThrownBy(() -> new ProxyData(new URL("http://localhost"), "username", null)).isInstanceOf(
        NullPointerException.class);
  }

  @Test
  public void creatingNonAuthenticatingProxyDataReturnsOptionalEmptyForUsernameAndPassword()
      throws MalformedURLException {

    final URL proxyURL = new URL("http://localhost");

    final ProxyData proxyData = new ProxyData(proxyURL);

    assertThat(proxyData.getPassword()).isEmpty();
    assertThat(proxyData.getUsername()).isEmpty();
    assertThat(proxyData.getProxyUrl()).isEqualTo(proxyURL);
  }

  @Test
  public void creatingAnAuthenticatedProxyDataReturnsAllParams() throws MalformedURLException {
    final URL proxyURL = new URL("http://localhost");
    final String username = "username";
    final String password = "password";

    final ProxyData proxyData = new ProxyData(proxyURL, username, password);

    assertThat(proxyData.getPassword().get()).isEqualTo(password);
    assertThat(proxyData.getUsername().get()).isEqualTo(username);
    assertThat(proxyData.getProxyUrl()).isEqualTo(proxyURL);
  }

}