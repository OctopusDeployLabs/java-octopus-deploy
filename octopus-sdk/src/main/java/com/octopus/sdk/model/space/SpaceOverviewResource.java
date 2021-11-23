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

package com.octopus.sdk.model.space;

import com.octopus.sdk.model.NamedResource;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Set;

import com.google.gson.annotations.SerializedName;

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

  public SpaceOverviewResource(final String name, final Set<String> spaceManagersTeamMembers) {
    super(name);
    this.spaceManagersTeamMembers = spaceManagersTeamMembers;
  }

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpaceOverviewResource spaceOverviewResource = (SpaceOverviewResource) o;
    return Objects.equals(this.getDescription(), spaceOverviewResource.getDescription())
        && Objects.equals(this.getId(), spaceOverviewResource.getId())
        && Objects.equals(this.isDefault, spaceOverviewResource.isDefault)
        && Objects.equals(this.lastModifiedBy, spaceOverviewResource.lastModifiedBy)
        && Objects.equals(this.lastModifiedOn, spaceOverviewResource.lastModifiedOn)
        && Objects.equals(this.getLinks(), spaceOverviewResource.getLinks())
        && Objects.equals(this.getName(), spaceOverviewResource.getName())
        && Objects.equals(
            this.spaceManagersTeamMembers, spaceOverviewResource.spaceManagersTeamMembers)
        && Objects.equals(this.spaceManagersTeams, spaceOverviewResource.spaceManagersTeams)
        && Objects.equals(this.taskQueueStopped, spaceOverviewResource.taskQueueStopped);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        getDescription(),
        getId(),
        isDefault,
        lastModifiedBy,
        lastModifiedOn,
        getLinks(),
        getName(),
        spaceManagersTeamMembers,
        spaceManagersTeams,
        taskQueueStopped);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpaceResource {\n");
    sb.append("    description: ").append(toIndentedString(getDescription())).append("\n");
    sb.append("    id: ").append(toIndentedString(getId())).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    links: ").append(toIndentedString(getLinks())).append("\n");
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    spaceManagersTeamMembers: ")
        .append(toIndentedString(spaceManagersTeamMembers))
        .append("\n");
    sb.append("    spaceManagersTeams: ").append(toIndentedString(spaceManagersTeams)).append("\n");
    sb.append("    taskQueueStopped: ").append(toIndentedString(taskQueueStopped)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
