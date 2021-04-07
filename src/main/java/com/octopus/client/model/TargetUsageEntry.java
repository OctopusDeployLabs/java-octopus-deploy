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
 * TargetUsageEntry
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class TargetUsageEntry {
  public static final String SERIALIZED_NAME_TARGET_ID = "TargetId";
  @SerializedName(SERIALIZED_NAME_TARGET_ID) private String targetId;

  public static final String SERIALIZED_NAME_TARGET_NAME = "TargetName";
  @SerializedName(SERIALIZED_NAME_TARGET_NAME) private String targetName;

  public TargetUsageEntry targetId(String targetId) {

    this.targetId = targetId;
    return this;
  }

  /**
   * Get targetId
   * @return targetId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTargetId() {
    return targetId;
  }

  public void setTargetId(String targetId) { this.targetId = targetId; }

  public TargetUsageEntry targetName(String targetName) {

    this.targetName = targetName;
    return this;
  }

  /**
   * Get targetName
   * @return targetName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTargetName() {
    return targetName;
  }

  public void setTargetName(String targetName) { this.targetName = targetName; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetUsageEntry targetUsageEntry = (TargetUsageEntry)o;
    return Objects.equals(this.targetId, targetUsageEntry.targetId) &&
        Objects.equals(this.targetName, targetUsageEntry.targetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetId, targetName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetUsageEntry {\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetName: ")
        .append(toIndentedString(targetName))
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
