package com.octopus.testsupport;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

public class OctopusServerResourceExtension implements BeforeAllCallback, ParameterResolver {

  private static final Lock reentrantLock = new ReentrantLock();

  @Override
  public void beforeAll(final ExtensionContext context) {
    reentrantLock.lock();
    try {
      ExtensionContext.Store rootStore =
          context.getRoot().getStore(ExtensionContext.Namespace.GLOBAL);
      rootStore.put("octopus-server", new ServerResource());
    } finally {
      reentrantLock.unlock();
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
