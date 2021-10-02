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

package com.octopus.sdk.repository.experimental;

import com.octopus.sdk.api.SpaceHomeApi;
import com.octopus.sdk.api.SpacesOverviewApi;
import com.octopus.sdk.http.OctopusClient;
import com.octopus.sdk.model.spaces.SpaceHome;
import com.octopus.sdk.model.spaces.SpaceOverviewWithLinks;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Set;

public class Space {

  private SpaceOverviewWithLinks spaceOverviewWithLinks;
  private SpaceHome spaceHome;

  public Space(final SpaceOverviewWithLinks spaceOverviewWithLinks, final SpaceHome spaceHome) {
    this.spaceOverviewWithLinks = spaceOverviewWithLinks;
    this.spaceHome = spaceHome;
  }

  public static Space create(final OctopusClient client, final String spaceName) throws IOException {
    final SpacesOverviewApi spaceOverviewApi = SpacesOverviewApi.create(client);

    final SpaceOverviewWithLinks spaceOverviewWithLinks = spaceOverviewApi.getByName(spaceName);

    final SpaceHomeApi homeApi = new SpaceHomeApi(client);
    final SpaceHome spaceHome = homeApi.getByName(spaceName);

    return new Space(spaceOverviewWithLinks, spaceHome);
  }

  public Boolean getDefault() {
    return spaceOverviewWithLinks.getDefault();
  }

  public String getLastModifiedBy() {
    return spaceOverviewWithLinks.getLastModifiedBy();
  }

  public OffsetDateTime getLastModifiedOn() {
    return spaceOverviewWithLinks.getLastModifiedOn();
  }

  public Set<String> getSpaceManagersTeamMembers() {
    return spaceOverviewWithLinks.getSpaceManagersTeamMembers();
  }

  public Set<String> getSpaceManagersTeams() {
    return spaceOverviewWithLinks.getSpaceManagersTeams();
  }

  public Boolean getTaskQueueStopped() {
    return spaceOverviewWithLinks.getTaskQueueStopped();
  }

  public void setDefault(final Boolean aDefault) {
    spaceOverviewWithLinks.setDefault(aDefault);;
  }

  public void setLastModifiedBy(final String lastModifiedBy) {
    spaceOverviewWithLinks.setLastModifiedBy(lastModifiedBy);
  }

  public void setLastModifiedOn(final OffsetDateTime lastModifiedOn) {
    spaceOverviewWithLinks.setLastModifiedOn(lastModifiedOn);
  }

  public void setSpaceManagersTeamMembers(final Set<String> spaceManagersTeamMembers) {
    spaceOverviewWithLinks.setSpaceManagersTeamMembers(spaceManagersTeamMembers);
  }

  public void setSpaceManagersTeams(final Set<String> spaceManagersTeams) {
    spaceOverviewWithLinks.setSpaceManagersTeams(spaceManagersTeams);
  }

  public void setTaskQueueStopped(final Boolean taskQueueStopped) {
    spaceOverviewWithLinks.setTaskQueueStopped(taskQueueStopped);
  }
}
