package com.octopus.testsupport;

import java.util.concurrent.atomic.AtomicBoolean;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

public class OctopusServerResourceExtension implements BeforeAllCallback, ParameterResolver {

  private static final AtomicBoolean SERVER_RESOURCE_CREATED = new AtomicBoolean(false);
  private static final String SERVER_RESOURCE_NAME = "octopus-server";

  @Override
  public synchronized void beforeAll(final ExtensionContext context) {
    if (SERVER_RESOURCE_CREATED.compareAndSet(false, true)) {
      ExtensionContext.Store rootStore =
          context.getRoot().getStore(ExtensionContext.Namespace.GLOBAL);
      final OctopusDeployServer server = OctopusDeployServerFactory.create();
      rootStore.put(SERVER_RESOURCE_NAME, new ServerResource(server));
    }
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
    return rootStore.get(SERVER_RESOURCE_NAME);
  }

  protected static class ServerResource implements ExtensionContext.Store.CloseableResource {
    private final OctopusDeployServer server;

    public ServerResource(OctopusDeployServer server) {
      this.server = server;
    }

    public OctopusDeployServer getServer() {
      return server;
    }

    @Override
    public void close() throws Exception {
      server.close();
    }
  }
}
