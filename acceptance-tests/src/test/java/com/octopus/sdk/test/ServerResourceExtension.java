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

package com.octopus.sdk.test;

import com.octopus.testsupport.OctopusDeployServer;
import com.octopus.testsupport.OctopusDeployServerFactory;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

public class ServerResourceExtension implements BeforeAllCallback, ParameterResolver {

  @Override
  public void beforeAll(final ExtensionContext context) throws Exception {
    ExtensionContext.Store rootStore =
        context.getRoot().getStore(ExtensionContext.Namespace.GLOBAL);
    rootStore.put("octopus-server", new ServerResource());
  }

  @Override
  public boolean supportsParameter(
      final ParameterContext parameterContext, final ExtensionContext extensionContext)
      throws ParameterResolutionException {
    return ServerResource.class.equals(parameterContext.getParameter().getType());
  }

  @Override
  public Object resolveParameter(
      final ParameterContext parameterContext, final ExtensionContext context)
      throws ParameterResolutionException {
    ExtensionContext.Store rootStore =
        context.getRoot().getStore(ExtensionContext.Namespace.GLOBAL);
    return rootStore.getOrComputeIfAbsent(ServerResource.class);
  }

  protected static class ServerResource implements ExtensionContext.Store.CloseableResource {
    private static final OctopusDeployServer server = OctopusDeployServerFactory.create();

    public OctopusDeployServer getServer() {
      return server;
    }

    @Override
    public void close() throws Exception {
      server.close();
    }
  }
}
