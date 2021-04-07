// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * ProjectSummary
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ProjectSummary {
  public static final String SERIALIZED_NAME_HAS_DEPLOYMENT_PROCESS =
      "HasDeploymentProcess";
  @SerializedName(SERIALIZED_NAME_HAS_DEPLOYMENT_PROCESS)
  private Boolean hasDeploymentProcess;

  public static final String SERIALIZED_NAME_HAS_RUNBOOKS = "HasRunbooks";
  @SerializedName(SERIALIZED_NAME_HAS_RUNBOOKS) private Boolean hasRunbooks;

  public ProjectSummary hasDeploymentProcess(Boolean hasDeploymentProcess) {

    this.hasDeploymentProcess = hasDeploymentProcess;
    return this;
  }

  /**
   * Get hasDeploymentProcess
   * @return hasDeploymentProcess
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasDeploymentProcess() {
    return hasDeploymentProcess;
  }

  public void setHasDeploymentProcess(Boolean hasDeploymentProcess) {
    this.hasDeploymentProcess = hasDeploymentProcess;
  }

  public ProjectSummary hasRunbooks(Boolean hasRunbooks) {

    this.hasRunbooks = hasRunbooks;
    return this;
  }

  /**
   * Get hasRunbooks
   * @return hasRunbooks
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasRunbooks() {
    return hasRunbooks;
  }

  public void setHasRunbooks(Boolean hasRunbooks) {
    this.hasRunbooks = hasRunbooks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectSummary projectSummary = (ProjectSummary)o;
    return Objects.equals(this.hasDeploymentProcess,
                          projectSummary.hasDeploymentProcess) &&
        Objects.equals(this.hasRunbooks, projectSummary.hasRunbooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasDeploymentProcess, hasRunbooks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectSummary {\n");
    sb.append("    hasDeploymentProcess: ")
        .append(toIndentedString(hasDeploymentProcess))
        .append("\n");
    sb.append("    hasRunbooks: ")
        .append(toIndentedString(hasRunbooks))
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
