package com.octopus.testsupport;

import com.octopus.sdk.api.SpacesOverviewApi;
import com.octopus.sdk.model.spaces.SpaceOverviewResource;
import com.octopus.sdk.model.spaces.SpaceOverviewWithLinks;

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
      final SpacesOverviewApi spacesOverviewApi, final SpaceOverviewResource space)
      throws IOException {
    if ((spacesOverviewApi != null) && (space != null)) {
      space.setTaskQueueStopped(true);
      spacesOverviewApi.update(space);
      spacesOverviewApi.delete(space);
    }
  }
}
