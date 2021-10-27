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

import static java.util.Collections.emptySet;

import com.octopus.openapi.model.RetentionPeriod;
import com.octopus.sdk.model.NamedResource;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

import com.google.gson.annotations.SerializedName;

/** PhaseResource */
@SuppressWarnings("UnusedVariable")
public class PhaseResource extends NamedResource {
  @SerializedName("AutomaticDeploymentTargets")
  private Set<String> automaticDeploymentTargets = emptySet();

  @SerializedName("IsOptionalPhase")
  private Boolean isOptionalPhase;

  @SerializedName("MinimumEnvironmentsBeforePromotion")
  private Integer minimumEnvironmentsBeforePromotion;

  @SerializedName("OptionalDeploymentTargets")
  private Set<String> optionalDeploymentTargets = emptySet();

  @SerializedName("ReleaseRetentionPolicy")
  private RetentionPeriod releaseRetentionPolicy;

  @SerializedName("TentacleRetentionPolicy")
  private RetentionPeriod tentacleRetentionPolicy;

  public PhaseResource(final String name) {
    super(name);
  }

  public PhaseResource automaticDeploymentTargets(Set<String> automaticDeploymentTargets) {

    this.automaticDeploymentTargets = automaticDeploymentTargets;
    return this;
  }

  public PhaseResource addAutomaticDeploymentTargetsItem(String automaticDeploymentTargetsItem) {
    if (this.automaticDeploymentTargets == null) {
      this.automaticDeploymentTargets = new LinkedHashSet<>();
    }
    this.automaticDeploymentTargets.add(automaticDeploymentTargetsItem);
    return this;
  }

  public Set<String> getAutomaticDeploymentTargets() {
    return automaticDeploymentTargets;
  }

  public void setAutomaticDeploymentTargets(Set<String> automaticDeploymentTargets) {
    this.automaticDeploymentTargets = automaticDeploymentTargets;
  }

  public PhaseResource isOptionalPhase(Boolean isOptionalPhase) {

    this.isOptionalPhase = isOptionalPhase;
    return this;
  }

  public Boolean getIsOptionalPhase() {
    return isOptionalPhase;
  }

  public void setIsOptionalPhase(Boolean isOptionalPhase) {
    this.isOptionalPhase = isOptionalPhase;
  }

  public PhaseResource minimumEnvironmentsBeforePromotion(
      Integer minimumEnvironmentsBeforePromotion) {

    this.minimumEnvironmentsBeforePromotion = minimumEnvironmentsBeforePromotion;
    return this;
  }

  public Integer getMinimumEnvironmentsBeforePromotion() {
    return minimumEnvironmentsBeforePromotion;
  }

  public void setMinimumEnvironmentsBeforePromotion(Integer minimumEnvironmentsBeforePromotion) {
    this.minimumEnvironmentsBeforePromotion = minimumEnvironmentsBeforePromotion;
  }

  public PhaseResource optionalDeploymentTargets(Set<String> optionalDeploymentTargets) {

    this.optionalDeploymentTargets = optionalDeploymentTargets;
    return this;
  }

  public PhaseResource addOptionalDeploymentTargetsItem(String optionalDeploymentTargetsItem) {
    if (this.optionalDeploymentTargets == null) {
      this.optionalDeploymentTargets = new LinkedHashSet<>();
    }
    this.optionalDeploymentTargets.add(optionalDeploymentTargetsItem);
    return this;
  }

  public Set<String> getOptionalDeploymentTargets() {
    return optionalDeploymentTargets;
  }

  public void setOptionalDeploymentTargets(Set<String> optionalDeploymentTargets) {
    this.optionalDeploymentTargets = optionalDeploymentTargets;
  }

  public PhaseResource releaseRetentionPolicy(RetentionPeriod releaseRetentionPolicy) {

    this.releaseRetentionPolicy = releaseRetentionPolicy;
    return this;
  }

  public RetentionPeriod getReleaseRetentionPolicy() {
    return releaseRetentionPolicy;
  }

  public void setReleaseRetentionPolicy(RetentionPeriod releaseRetentionPolicy) {
    this.releaseRetentionPolicy = releaseRetentionPolicy;
  }

  public PhaseResource tentacleRetentionPolicy(RetentionPeriod tentacleRetentionPolicy) {

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
    PhaseResource phaseResource = (PhaseResource) o;
    return Objects.equals(this.automaticDeploymentTargets, phaseResource.automaticDeploymentTargets)
        && Objects.equals(this.getId(), phaseResource.getId())
        && Objects.equals(this.isOptionalPhase, phaseResource.isOptionalPhase)
        && Objects.equals(
            this.minimumEnvironmentsBeforePromotion,
            phaseResource.minimumEnvironmentsBeforePromotion)
        && Objects.equals(this.getName(), phaseResource.getName())
        && Objects.equals(this.optionalDeploymentTargets, phaseResource.optionalDeploymentTargets)
        && Objects.equals(this.releaseRetentionPolicy, phaseResource.releaseRetentionPolicy)
        && Objects.equals(this.tentacleRetentionPolicy, phaseResource.tentacleRetentionPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        automaticDeploymentTargets,
        getId(),
        isOptionalPhase,
        minimumEnvironmentsBeforePromotion,
        getName(),
        optionalDeploymentTargets,
        releaseRetentionPolicy,
        tentacleRetentionPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhaseResource {\n");
    sb.append("    automaticDeploymentTargets: ")
        .append(toIndentedString(automaticDeploymentTargets))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(getId())).append("\n");
    sb.append("    isOptionalPhase: ").append(toIndentedString(isOptionalPhase)).append("\n");
    sb.append("    minimumEnvironmentsBeforePromotion: ")
        .append(toIndentedString(minimumEnvironmentsBeforePromotion))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    optionalDeploymentTargets: ")
        .append(toIndentedString(optionalDeploymentTargets))
        .append("\n");
    sb.append("    releaseRetentionPolicy: ")
        .append(toIndentedString(releaseRetentionPolicy))
        .append("\n");
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
