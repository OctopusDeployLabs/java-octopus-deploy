// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.SkipMachineBehavior;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * DeploymentConnectivityPolicy
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class DeploymentConnectivityPolicy {
  public static final String SERIALIZED_NAME_ALLOW_DEPLOYMENTS_TO_NO_TARGETS =
      "AllowDeploymentsToNoTargets";
  @SerializedName(SERIALIZED_NAME_ALLOW_DEPLOYMENTS_TO_NO_TARGETS)
  private Boolean allowDeploymentsToNoTargets;

  public static final String SERIALIZED_NAME_EXCLUDE_UNHEALTHY_TARGETS =
      "ExcludeUnhealthyTargets";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_UNHEALTHY_TARGETS)
  private Boolean excludeUnhealthyTargets;

  public static final String SERIALIZED_NAME_SKIP_MACHINE_BEHAVIOR =
      "SkipMachineBehavior";
  @SerializedName(SERIALIZED_NAME_SKIP_MACHINE_BEHAVIOR)
  private SkipMachineBehavior skipMachineBehavior;

  public static final String SERIALIZED_NAME_TARGET_ROLES = "TargetRoles";
  @SerializedName(SERIALIZED_NAME_TARGET_ROLES)
  private Set<String> targetRoles = null;

  public DeploymentConnectivityPolicy
  allowDeploymentsToNoTargets(Boolean allowDeploymentsToNoTargets) {

    this.allowDeploymentsToNoTargets = allowDeploymentsToNoTargets;
    return this;
  }

  /**
   * Get allowDeploymentsToNoTargets
   * @return allowDeploymentsToNoTargets
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowDeploymentsToNoTargets() {
    return allowDeploymentsToNoTargets;
  }

  public void
  setAllowDeploymentsToNoTargets(Boolean allowDeploymentsToNoTargets) {
    this.allowDeploymentsToNoTargets = allowDeploymentsToNoTargets;
  }

  public DeploymentConnectivityPolicy
  excludeUnhealthyTargets(Boolean excludeUnhealthyTargets) {

    this.excludeUnhealthyTargets = excludeUnhealthyTargets;
    return this;
  }

  /**
   * Get excludeUnhealthyTargets
   * @return excludeUnhealthyTargets
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getExcludeUnhealthyTargets() {
    return excludeUnhealthyTargets;
  }

  public void setExcludeUnhealthyTargets(Boolean excludeUnhealthyTargets) {
    this.excludeUnhealthyTargets = excludeUnhealthyTargets;
  }

  public DeploymentConnectivityPolicy
  skipMachineBehavior(SkipMachineBehavior skipMachineBehavior) {

    this.skipMachineBehavior = skipMachineBehavior;
    return this;
  }

  /**
   * Get skipMachineBehavior
   * @return skipMachineBehavior
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SkipMachineBehavior getSkipMachineBehavior() {
    return skipMachineBehavior;
  }

  public void setSkipMachineBehavior(SkipMachineBehavior skipMachineBehavior) {
    this.skipMachineBehavior = skipMachineBehavior;
  }

  public DeploymentConnectivityPolicy targetRoles(Set<String> targetRoles) {

    this.targetRoles = targetRoles;
    return this;
  }

  public DeploymentConnectivityPolicy
  addTargetRolesItem(String targetRolesItem) {
    if (this.targetRoles == null) {
      this.targetRoles = new LinkedHashSet<String>();
    }
    this.targetRoles.add(targetRolesItem);
    return this;
  }

  /**
   * Get targetRoles
   * @return targetRoles
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getTargetRoles() {
    return targetRoles;
  }

  public void setTargetRoles(Set<String> targetRoles) {
    this.targetRoles = targetRoles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentConnectivityPolicy deploymentConnectivityPolicy =
        (DeploymentConnectivityPolicy)o;
    return Objects.equals(
               this.allowDeploymentsToNoTargets,
               deploymentConnectivityPolicy.allowDeploymentsToNoTargets) &&
        Objects.equals(this.excludeUnhealthyTargets,
                       deploymentConnectivityPolicy.excludeUnhealthyTargets) &&
        Objects.equals(this.skipMachineBehavior,
                       deploymentConnectivityPolicy.skipMachineBehavior) &&
        Objects.equals(this.targetRoles,
                       deploymentConnectivityPolicy.targetRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowDeploymentsToNoTargets, excludeUnhealthyTargets,
                        skipMachineBehavior, targetRoles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentConnectivityPolicy {\n");
    sb.append("    allowDeploymentsToNoTargets: ")
        .append(toIndentedString(allowDeploymentsToNoTargets))
        .append("\n");
    sb.append("    excludeUnhealthyTargets: ")
        .append(toIndentedString(excludeUnhealthyTargets))
        .append("\n");
    sb.append("    skipMachineBehavior: ")
        .append(toIndentedString(skipMachineBehavior))
        .append("\n");
    sb.append("    targetRoles: ")
        .append(toIndentedString(targetRoles))
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
