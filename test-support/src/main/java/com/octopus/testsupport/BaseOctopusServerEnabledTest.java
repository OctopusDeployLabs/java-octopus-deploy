package com.octopus.testsupport;

import com.octopus.sdk.api.SpaceOverviewApi;
import com.octopus.sdk.model.space.SpaceOverviewWithLinks;

import java.io.IOException;

import okhttp3.OkHttpClient;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(OctopusServerResourceExtension.class)
public class BaseOctopusServerEnabledTest {

  protected static OctopusDeployServer server;
  protected final OkHttpClient httpClient = new OkHttpClient();

  @BeforeAll
  public static void setup(final OctopusServerResourceExtension.ServerResource serverResource) {
    server = serverResource.getServer();
  }

  protected void deleteSpaceValidly(
      final SpaceOverviewApi spaceOverviewApi, final SpaceOverviewWithLinks space)
      throws IOException {
    if ((spaceOverviewApi != null) && (space != null)) {
      space.setTaskQueueStopped(true);
      spaceOverviewApi.update(space);
      spaceOverviewApi.delete(space);
    }
  }
}
