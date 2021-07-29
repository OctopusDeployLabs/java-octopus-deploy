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

package com.octopus.sdk.model.spaces;

import com.google.gson.annotations.SerializedName;
import com.octopus.sdk.model.NamedResource;

import java.time.OffsetDateTime;
import java.util.Set;

public class SpaceOverviewResource extends NamedResource {

  @SerializedName("IsDefault")
  private Boolean isDefault;

  @SerializedName("LastModifiedBy")
  private String lastModifiedBy;

  @SerializedName("LastModifiedOn")
  private OffsetDateTime lastModifiedOn;

  @SerializedName("SpaceManagersTeamMembers")
  private Set<String> spaceManagersTeamMembers = null;

  @SerializedName("SpaceManagersTeams")
  private Set<String> spaceManagersTeams = null;

  @SerializedName("TaskQueueStopped")
  private Boolean taskQueueStopped;

  public Boolean getDefault() {
    return isDefault;
  }

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public Set<String> getSpaceManagersTeamMembers() {
    return spaceManagersTeamMembers;
  }

  public Set<String> getSpaceManagersTeams() {
    return spaceManagersTeams;
  }

  public Boolean getTaskQueueStopped() {
    return taskQueueStopped;
  }

  public void setDefault(final Boolean aDefault) {
    isDefault = aDefault;
  }

  public void setLastModifiedBy(final String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public void setLastModifiedOn(final OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public void setSpaceManagersTeamMembers(final Set<String> spaceManagersTeamMembers) {
    this.spaceManagersTeamMembers = spaceManagersTeamMembers;
  }

  public void setSpaceManagersTeams(final Set<String> spaceManagersTeams) {
    this.spaceManagersTeams = spaceManagersTeams;
  }

  public void setTaskQueueStopped(final Boolean taskQueueStopped) {
    this.taskQueueStopped = taskQueueStopped;
  }
}
