// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.StepUsageEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * RunbookStepUsage
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class RunbookStepUsage {
  public static final String SERIALIZED_NAME_PROCESS_ID = "ProcessId";
  @SerializedName(SERIALIZED_NAME_PROCESS_ID) private String processId;

  public static final String SERIALIZED_NAME_PROJECT_ID = "ProjectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID) private String projectId;

  public static final String SERIALIZED_NAME_PROJECT_NAME = "ProjectName";
  @SerializedName(SERIALIZED_NAME_PROJECT_NAME) private String projectName;

  public static final String SERIALIZED_NAME_PROJECT_SLUG = "ProjectSlug";
  @SerializedName(SERIALIZED_NAME_PROJECT_SLUG) private String projectSlug;

  public static final String SERIALIZED_NAME_RUNBOOK_ID = "RunbookId";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_ID) private String runbookId;

  public static final String SERIALIZED_NAME_RUNBOOK_NAME = "RunbookName";
  @SerializedName(SERIALIZED_NAME_RUNBOOK_NAME) private String runbookName;

  public static final String SERIALIZED_NAME_STEPS = "Steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<StepUsageEntry> steps = null;

  public RunbookStepUsage processId(String processId) {

    this.processId = processId;
    return this;
  }

  /**
   * Get processId
   * @return processId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProcessId() {
    return processId;
  }

  public void setProcessId(String processId) { this.processId = processId; }

  public RunbookStepUsage projectId(String projectId) {

    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) { this.projectId = projectId; }

  public RunbookStepUsage projectName(String projectName) {

    this.projectName = projectName;
    return this;
  }

  /**
   * Get projectName
   * @return projectName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public RunbookStepUsage projectSlug(String projectSlug) {

    this.projectSlug = projectSlug;
    return this;
  }

  /**
   * Get projectSlug
   * @return projectSlug
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectSlug() {
    return projectSlug;
  }

  public void setProjectSlug(String projectSlug) {
    this.projectSlug = projectSlug;
  }

  public RunbookStepUsage runbookId(String runbookId) {

    this.runbookId = runbookId;
    return this;
  }

  /**
   * Get runbookId
   * @return runbookId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRunbookId() {
    return runbookId;
  }

  public void setRunbookId(String runbookId) { this.runbookId = runbookId; }

  public RunbookStepUsage runbookName(String runbookName) {

    this.runbookName = runbookName;
    return this;
  }

  /**
   * Get runbookName
   * @return runbookName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRunbookName() {
    return runbookName;
  }

  public void setRunbookName(String runbookName) {
    this.runbookName = runbookName;
  }

  public RunbookStepUsage steps(List<StepUsageEntry> steps) {

    this.steps = steps;
    return this;
  }

  public RunbookStepUsage addStepsItem(StepUsageEntry stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<StepUsageEntry>();
    }
    this.steps.add(stepsItem);
    return this;
  }

  /**
   * Get steps
   * @return steps
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<StepUsageEntry> getSteps() {
    return steps;
  }

  public void setSteps(List<StepUsageEntry> steps) { this.steps = steps; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunbookStepUsage runbookStepUsage = (RunbookStepUsage)o;
    return Objects.equals(this.processId, runbookStepUsage.processId) &&
        Objects.equals(this.projectId, runbookStepUsage.projectId) &&
        Objects.equals(this.projectName, runbookStepUsage.projectName) &&
        Objects.equals(this.projectSlug, runbookStepUsage.projectSlug) &&
        Objects.equals(this.runbookId, runbookStepUsage.runbookId) &&
        Objects.equals(this.runbookName, runbookStepUsage.runbookName) &&
        Objects.equals(this.steps, runbookStepUsage.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processId, projectId, projectName, projectSlug,
                        runbookId, runbookName, steps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunbookStepUsage {\n");
    sb.append("    processId: ")
        .append(toIndentedString(processId))
        .append("\n");
    sb.append("    projectId: ")
        .append(toIndentedString(projectId))
        .append("\n");
    sb.append("    projectName: ")
        .append(toIndentedString(projectName))
        .append("\n");
    sb.append("    projectSlug: ")
        .append(toIndentedString(projectSlug))
        .append("\n");
    sb.append("    runbookId: ")
        .append(toIndentedString(runbookId))
        .append("\n");
    sb.append("    runbookName: ")
        .append(toIndentedString(runbookName))
        .append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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
