// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.RetentionPeriod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * PhaseResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class PhaseResource {
  public static final String SERIALIZED_NAME_AUTOMATIC_DEPLOYMENT_TARGETS =
      "AutomaticDeploymentTargets";
  @SerializedName(SERIALIZED_NAME_AUTOMATIC_DEPLOYMENT_TARGETS)
  private Set<String> automaticDeploymentTargets = null;

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

  public static final String SERIALIZED_NAME_RELEASE_RETENTION_POLICY =
      "ReleaseRetentionPolicy";
  @SerializedName(SERIALIZED_NAME_RELEASE_RETENTION_POLICY)
  private RetentionPeriod releaseRetentionPolicy;

  public static final String SERIALIZED_NAME_TENTACLE_RETENTION_POLICY =
      "TentacleRetentionPolicy";
  @SerializedName(SERIALIZED_NAME_TENTACLE_RETENTION_POLICY)
  private RetentionPeriod tentacleRetentionPolicy;

  public PhaseResource
  automaticDeploymentTargets(Set<String> automaticDeploymentTargets) {

    this.automaticDeploymentTargets = automaticDeploymentTargets;
    return this;
  }

  public PhaseResource
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

  public PhaseResource id(String id) {

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

  public PhaseResource isOptionalPhase(Boolean isOptionalPhase) {

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

  public PhaseResource minimumEnvironmentsBeforePromotion(
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

  public PhaseResource name(String name) {

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

  public PhaseResource
  optionalDeploymentTargets(Set<String> optionalDeploymentTargets) {

    this.optionalDeploymentTargets = optionalDeploymentTargets;
    return this;
  }

  public PhaseResource
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

  public PhaseResource
  releaseRetentionPolicy(RetentionPeriod releaseRetentionPolicy) {

    this.releaseRetentionPolicy = releaseRetentionPolicy;
    return this;
  }

  /**
   * Get releaseRetentionPolicy
   * @return releaseRetentionPolicy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RetentionPeriod getReleaseRetentionPolicy() {
    return releaseRetentionPolicy;
  }

  public void
  setReleaseRetentionPolicy(RetentionPeriod releaseRetentionPolicy) {
    this.releaseRetentionPolicy = releaseRetentionPolicy;
  }

  public PhaseResource
  tentacleRetentionPolicy(RetentionPeriod tentacleRetentionPolicy) {

    this.tentacleRetentionPolicy = tentacleRetentionPolicy;
    return this;
  }

  /**
   * Get tentacleRetentionPolicy
   * @return tentacleRetentionPolicy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RetentionPeriod getTentacleRetentionPolicy() {
    return tentacleRetentionPolicy;
  }

  public void
  setTentacleRetentionPolicy(RetentionPeriod tentacleRetentionPolicy) {
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
    PhaseResource phaseResource = (PhaseResource)o;
    return Objects.equals(this.automaticDeploymentTargets,
                          phaseResource.automaticDeploymentTargets) &&
        Objects.equals(this.id, phaseResource.id) &&
        Objects.equals(this.isOptionalPhase, phaseResource.isOptionalPhase) &&
        Objects.equals(this.minimumEnvironmentsBeforePromotion,
                       phaseResource.minimumEnvironmentsBeforePromotion) &&
        Objects.equals(this.name, phaseResource.name) &&
        Objects.equals(this.optionalDeploymentTargets,
                       phaseResource.optionalDeploymentTargets) &&
        Objects.equals(this.releaseRetentionPolicy,
                       phaseResource.releaseRetentionPolicy) &&
        Objects.equals(this.tentacleRetentionPolicy,
                       phaseResource.tentacleRetentionPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automaticDeploymentTargets, id, isOptionalPhase,
                        minimumEnvironmentsBeforePromotion, name,
                        optionalDeploymentTargets, releaseRetentionPolicy,
                        tentacleRetentionPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhaseResource {\n");
    sb.append("    automaticDeploymentTargets: ")
        .append(toIndentedString(automaticDeploymentTargets))
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
