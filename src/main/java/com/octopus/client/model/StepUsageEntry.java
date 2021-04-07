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
 * StepUsageEntry
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class StepUsageEntry {
  public static final String SERIALIZED_NAME_STEP_ID = "StepId";
  @SerializedName(SERIALIZED_NAME_STEP_ID) private String stepId;

  public static final String SERIALIZED_NAME_STEP_NAME = "StepName";
  @SerializedName(SERIALIZED_NAME_STEP_NAME) private String stepName;

  public StepUsageEntry stepId(String stepId) {

    this.stepId = stepId;
    return this;
  }

  /**
   * Get stepId
   * @return stepId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStepId() {
    return stepId;
  }

  public void setStepId(String stepId) { this.stepId = stepId; }

  public StepUsageEntry stepName(String stepName) {

    this.stepName = stepName;
    return this;
  }

  /**
   * Get stepName
   * @return stepName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStepName() {
    return stepName;
  }

  public void setStepName(String stepName) { this.stepName = stepName; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StepUsageEntry stepUsageEntry = (StepUsageEntry)o;
    return Objects.equals(this.stepId, stepUsageEntry.stepId) &&
        Objects.equals(this.stepName, stepUsageEntry.stepName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stepId, stepName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StepUsageEntry {\n");
    sb.append("    stepId: ").append(toIndentedString(stepId)).append("\n");
    sb.append("    stepName: ").append(toIndentedString(stepName)).append("\n");
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
