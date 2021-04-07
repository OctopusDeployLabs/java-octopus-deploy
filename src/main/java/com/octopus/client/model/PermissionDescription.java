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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * PermissionDescription
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class PermissionDescription {
  public static final String SERIALIZED_NAME_CAN_APPLY_AT_SPACE_LEVEL =
      "CanApplyAtSpaceLevel";
  @SerializedName(SERIALIZED_NAME_CAN_APPLY_AT_SPACE_LEVEL)
  private Boolean canApplyAtSpaceLevel;

  public static final String SERIALIZED_NAME_CAN_APPLY_AT_SYSTEM_LEVEL =
      "CanApplyAtSystemLevel";
  @SerializedName(SERIALIZED_NAME_CAN_APPLY_AT_SYSTEM_LEVEL)
  private Boolean canApplyAtSystemLevel;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_SUPPORTED_RESTRICTIONS =
      "SupportedRestrictions";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_RESTRICTIONS)
  private List<String> supportedRestrictions = null;

  /**
   * Get canApplyAtSpaceLevel
   * @return canApplyAtSpaceLevel
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanApplyAtSpaceLevel() {
    return canApplyAtSpaceLevel;
  }

  /**
   * Get canApplyAtSystemLevel
   * @return canApplyAtSystemLevel
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanApplyAtSystemLevel() {
    return canApplyAtSystemLevel;
  }

  public PermissionDescription description(String description) {

    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PermissionDescription
  supportedRestrictions(List<String> supportedRestrictions) {

    this.supportedRestrictions = supportedRestrictions;
    return this;
  }

  public PermissionDescription
  addSupportedRestrictionsItem(String supportedRestrictionsItem) {
    if (this.supportedRestrictions == null) {
      this.supportedRestrictions = new ArrayList<String>();
    }
    this.supportedRestrictions.add(supportedRestrictionsItem);
    return this;
  }

  /**
   * Get supportedRestrictions
   * @return supportedRestrictions
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSupportedRestrictions() {
    return supportedRestrictions;
  }

  public void setSupportedRestrictions(List<String> supportedRestrictions) {
    this.supportedRestrictions = supportedRestrictions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionDescription permissionDescription = (PermissionDescription)o;
    return Objects.equals(this.canApplyAtSpaceLevel,
                          permissionDescription.canApplyAtSpaceLevel) &&
        Objects.equals(this.canApplyAtSystemLevel,
                       permissionDescription.canApplyAtSystemLevel) &&
        Objects.equals(this.description, permissionDescription.description) &&
        Objects.equals(this.supportedRestrictions,
                       permissionDescription.supportedRestrictions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canApplyAtSpaceLevel, canApplyAtSystemLevel,
                        description, supportedRestrictions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionDescription {\n");
    sb.append("    canApplyAtSpaceLevel: ")
        .append(toIndentedString(canApplyAtSpaceLevel))
        .append("\n");
    sb.append("    canApplyAtSystemLevel: ")
        .append(toIndentedString(canApplyAtSystemLevel))
        .append("\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    supportedRestrictions: ")
        .append(toIndentedString(supportedRestrictions))
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
