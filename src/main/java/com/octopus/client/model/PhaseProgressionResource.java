// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.PhaseDeploymentResource;
import com.octopus.client.model.PhaseProgress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * PhaseProgressionResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class PhaseProgressionResource {
  public static final String SERIALIZED_NAME_AUTOMATIC_DEPLOYMENT_TARGETS =
      "AutomaticDeploymentTargets";
  @SerializedName(SERIALIZED_NAME_AUTOMATIC_DEPLOYMENT_TARGETS)
  private Set<String> automaticDeploymentTargets = null;

  public static final String SERIALIZED_NAME_BLOCKED = "Blocked";
  @SerializedName(SERIALIZED_NAME_BLOCKED) private Boolean blocked;

  public static final String SERIALIZED_NAME_DEPLOYMENTS = "Deployments";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENTS)
  private List<PhaseDeploymentResource> deployments = null;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IS_OPTIONAL_PHASE =
      "IsOptionalPhase";
  @SerializedName(SERIALIZED_NAME_IS_OPTIONAL_PHASE)
  private Boolean isOptionalPhase;

  public static final String
      SERIALIZED_NAME_MINIMUM_ENVIRONMENTS_BEFORE_PROMOTION =
          "MinimumEnvironmentsBeforePromotion";
  @SerializedName(SERIALIZED_NAME_MINIMUM_ENVIRONMENTS_BEFORE_PROMOTION)
  private Integer minimumEnvironmentsBeforePromotion;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_OPTIONAL_DEPLOYMENT_TARGETS =
      "OptionalDeploymentTargets";
  @SerializedName(SERIALIZED_NAME_OPTIONAL_DEPLOYMENT_TARGETS)
  private Set<String> optionalDeploymentTargets = null;

  public static final String SERIALIZED_NAME_PROGRESS = "Progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS) private PhaseProgress progress;

  public PhaseProgressionResource
  automaticDeploymentTargets(Set<String> automaticDeploymentTargets) {

    this.automaticDeploymentTargets = automaticDeploymentTargets;
    return this;
  }

  public PhaseProgressionResource
  addAutomaticDeploymentTargetsItem(String automaticDeploymentTargetsItem) {
    if (this.automaticDeploymentTargets == null) {
      this.automaticDeploymentTargets = new LinkedHashSet<String>();
    }
    this.automaticDeploymentTargets.add(automaticDeploymentTargetsItem);
    return this;
  }

  /**
   * Get automaticDeploymentTargets
   * @return automaticDeploymentTargets
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getAutomaticDeploymentTargets() {
    return automaticDeploymentTargets;
  }

  public void
  setAutomaticDeploymentTargets(Set<String> automaticDeploymentTargets) {
    this.automaticDeploymentTargets = automaticDeploymentTargets;
  }

  public PhaseProgressionResource blocked(Boolean blocked) {

    this.blocked = blocked;
    return this;
  }

  /**
   * Get blocked
   * @return blocked
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBlocked() {
    return blocked;
  }

  public void setBlocked(Boolean blocked) { this.blocked = blocked; }

  public PhaseProgressionResource
  deployments(List<PhaseDeploymentResource> deployments) {

    this.deployments = deployments;
    return this;
  }

  public PhaseProgressionResource
  addDeploymentsItem(PhaseDeploymentResource deploymentsItem) {
    if (this.deployments == null) {
      this.deployments = new ArrayList<PhaseDeploymentResource>();
    }
    this.deployments.add(deploymentsItem);
    return this;
  }

  /**
   * Get deployments
   * @return deployments
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PhaseDeploymentResource> getDeployments() {
    return deployments;
  }

  public void setDeployments(List<PhaseDeploymentResource> deployments) {
    this.deployments = deployments;
  }

  public PhaseProgressionResource id(String id) {

    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }

  public void setId(String id) { this.id = id; }

  public PhaseProgressionResource isOptionalPhase(Boolean isOptionalPhase) {

    this.isOptionalPhase = isOptionalPhase;
    return this;
  }

  /**
   * Get isOptionalPhase
   * @return isOptionalPhase
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsOptionalPhase() {
    return isOptionalPhase;
  }

  public void setIsOptionalPhase(Boolean isOptionalPhase) {
    this.isOptionalPhase = isOptionalPhase;
  }

  public PhaseProgressionResource minimumEnvironmentsBeforePromotion(
      Integer minimumEnvironmentsBeforePromotion) {

    this.minimumEnvironmentsBeforePromotion =
        minimumEnvironmentsBeforePromotion;
    return this;
  }

  /**
   * Get minimumEnvironmentsBeforePromotion
   * @return minimumEnvironmentsBeforePromotion
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMinimumEnvironmentsBeforePromotion() {
    return minimumEnvironmentsBeforePromotion;
  }

  public void setMinimumEnvironmentsBeforePromotion(
      Integer minimumEnvironmentsBeforePromotion) {
    this.minimumEnvironmentsBeforePromotion =
        minimumEnvironmentsBeforePromotion;
  }

  public PhaseProgressionResource name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }

  public void setName(String name) { this.name = name; }

  public PhaseProgressionResource
  optionalDeploymentTargets(Set<String> optionalDeploymentTargets) {

    this.optionalDeploymentTargets = optionalDeploymentTargets;
    return this;
  }

  public PhaseProgressionResource
  addOptionalDeploymentTargetsItem(String optionalDeploymentTargetsItem) {
    if (this.optionalDeploymentTargets == null) {
      this.optionalDeploymentTargets = new LinkedHashSet<String>();
    }
    this.optionalDeploymentTargets.add(optionalDeploymentTargetsItem);
    return this;
  }

  /**
   * Get optionalDeploymentTargets
   * @return optionalDeploymentTargets
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getOptionalDeploymentTargets() {
    return optionalDeploymentTargets;
  }

  public void
  setOptionalDeploymentTargets(Set<String> optionalDeploymentTargets) {
    this.optionalDeploymentTargets = optionalDeploymentTargets;
  }

  public PhaseProgressionResource progress(PhaseProgress progress) {

    this.progress = progress;
    return this;
  }

  /**
   * Get progress
   * @return progress
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PhaseProgress getProgress() {
    return progress;
  }

  public void setProgress(PhaseProgress progress) { this.progress = progress; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhaseProgressionResource phaseProgressionResource =
        (PhaseProgressionResource)o;
    return Objects.equals(
               this.automaticDeploymentTargets,
               phaseProgressionResource.automaticDeploymentTargets) &&
        Objects.equals(this.blocked, phaseProgressionResource.blocked) &&
        Objects.equals(this.deployments,
                       phaseProgressionResource.deployments) &&
        Objects.equals(this.id, phaseProgressionResource.id) &&
        Objects.equals(this.isOptionalPhase,
                       phaseProgressionResource.isOptionalPhase) &&
        Objects.equals(
            this.minimumEnvironmentsBeforePromotion,
            phaseProgressionResource.minimumEnvironmentsBeforePromotion) &&
        Objects.equals(this.name, phaseProgressionResource.name) &&
        Objects.equals(this.optionalDeploymentTargets,
                       phaseProgressionResource.optionalDeploymentTargets) &&
        Objects.equals(this.progress, phaseProgressionResource.progress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automaticDeploymentTargets, blocked, deployments, id,
                        isOptionalPhase, minimumEnvironmentsBeforePromotion,
                        name, optionalDeploymentTargets, progress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhaseProgressionResource {\n");
    sb.append("    automaticDeploymentTargets: ")
        .append(toIndentedString(automaticDeploymentTargets))
        .append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    deployments: ")
        .append(toIndentedString(deployments))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isOptionalPhase: ")
        .append(toIndentedString(isOptionalPhase))
        .append("\n");
    sb.append("    minimumEnvironmentsBeforePromotion: ")
        .append(toIndentedString(minimumEnvironmentsBeforePromotion))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optionalDeploymentTargets: ")
        .append(toIndentedString(optionalDeploymentTargets))
        .append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
