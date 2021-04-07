// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.DeploymentResource;
import com.octopus.client.model.TaskResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * PhaseDeploymentResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class PhaseDeploymentResource {
  public static final String SERIALIZED_NAME_DEPLOYMENT = "Deployment";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT)
  private DeploymentResource deployment;

  public static final String SERIALIZED_NAME_TASK = "Task";
  @SerializedName(SERIALIZED_NAME_TASK) private TaskResource task;

  public PhaseDeploymentResource deployment(DeploymentResource deployment) {

    this.deployment = deployment;
    return this;
  }

  /**
   * Get deployment
   * @return deployment
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeploymentResource getDeployment() {
    return deployment;
  }

  public void setDeployment(DeploymentResource deployment) {
    this.deployment = deployment;
  }

  public PhaseDeploymentResource task(TaskResource task) {

    this.task = task;
    return this;
  }

  /**
   * Get task
   * @return task
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TaskResource getTask() {
    return task;
  }

  public void setTask(TaskResource task) { this.task = task; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhaseDeploymentResource phaseDeploymentResource =
        (PhaseDeploymentResource)o;
    return Objects.equals(this.deployment,
                          phaseDeploymentResource.deployment) &&
        Objects.equals(this.task, phaseDeploymentResource.task);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deployment, task);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhaseDeploymentResource {\n");
    sb.append("    deployment: ")
        .append(toIndentedString(deployment))
        .append("\n");
    sb.append("    task: ").append(toIndentedString(task)).append("\n");
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
