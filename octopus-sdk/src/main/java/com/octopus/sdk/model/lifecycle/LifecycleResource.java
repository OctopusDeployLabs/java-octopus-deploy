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

package com.octopus.sdk.model.lifecycle;

import com.octopus.openapi.model.PhaseResource;
import com.octopus.openapi.model.RetentionPeriod;
import com.octopus.sdk.model.NamedResource;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("UnusedVariable")
public class LifecycleResource extends NamedResource {
  @SerializedName("LastModifiedBy")
  private String lastModifiedBy;

  @SerializedName("LastModifiedOn")
  private OffsetDateTime lastModifiedOn;

  @SerializedName("Phases")
  private List<PhaseResource> phases;

  @SerializedName("ReleaseRetentionPolicy")
  private RetentionPeriod releaseRetentionPolicy;

  @SerializedName("SpaceId")
  private String spaceId;

  @SerializedName("TentacleRetentionPolicy")
  private RetentionPeriod tentacleRetentionPolicy;

  public LifecycleResource(final String name) {
    super(name);
  }

  public LifecycleResource lastModifiedBy(String lastModifiedBy) {

    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public LifecycleResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public List<PhaseResource> getPhases() {
    return phases;
  }

  public LifecycleResource releaseRetentionPolicy(RetentionPeriod releaseRetentionPolicy) {

    this.releaseRetentionPolicy = releaseRetentionPolicy;
    return this;
  }

  public RetentionPeriod getReleaseRetentionPolicy() {
    return releaseRetentionPolicy;
  }

  public void setReleaseRetentionPolicy(RetentionPeriod releaseRetentionPolicy) {
    this.releaseRetentionPolicy = releaseRetentionPolicy;
  }

  public LifecycleResource spaceId(String spaceId) {

    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }

  public LifecycleResource tentacleRetentionPolicy(RetentionPeriod tentacleRetentionPolicy) {

    this.tentacleRetentionPolicy = tentacleRetentionPolicy;
    return this;
  }

  public RetentionPeriod getTentacleRetentionPolicy() {
    return tentacleRetentionPolicy;
  }

  public void setTentacleRetentionPolicy(RetentionPeriod tentacleRetentionPolicy) {
    this.tentacleRetentionPolicy = tentacleRetentionPolicy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LifecycleResource lifecycleResource = (LifecycleResource) o;
    return Objects.equals(this.lastModifiedBy, lifecycleResource.lastModifiedBy)
        && Objects.equals(this.lastModifiedOn, lifecycleResource.lastModifiedOn)
        && Objects.equals(this.phases, lifecycleResource.phases)
        && Objects.equals(this.releaseRetentionPolicy, lifecycleResource.releaseRetentionPolicy)
        && Objects.equals(this.spaceId, lifecycleResource.spaceId)
        && Objects.equals(this.tentacleRetentionPolicy, lifecycleResource.tentacleRetentionPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        lastModifiedBy,
        lastModifiedOn,
        phases,
        releaseRetentionPolicy,
        spaceId,
        tentacleRetentionPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LifecycleResource {\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    phases: ").append(toIndentedString(phases)).append("\n");
    sb.append("    releaseRetentionPolicy: ")
        .append(toIndentedString(releaseRetentionPolicy))
        .append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    tentacleRetentionPolicy: ")
        .append(toIndentedString(tentacleRetentionPolicy))
        .append("\n");
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
