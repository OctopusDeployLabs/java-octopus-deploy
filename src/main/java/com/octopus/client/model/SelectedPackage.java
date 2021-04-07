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
 * SelectedPackage
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class SelectedPackage {
  public static final String SERIALIZED_NAME_ACTION_NAME = "ActionName";
  @SerializedName(SERIALIZED_NAME_ACTION_NAME) private String actionName;

  public static final String SERIALIZED_NAME_PACKAGE_REFERENCE_NAME =
      "PackageReferenceName";
  @SerializedName(SERIALIZED_NAME_PACKAGE_REFERENCE_NAME)
  private String packageReferenceName;

  public static final String SERIALIZED_NAME_STEP_NAME = "StepName";
  @SerializedName(SERIALIZED_NAME_STEP_NAME) private String stepName;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION) private String version;

  public SelectedPackage actionName(String actionName) {

    this.actionName = actionName;
    return this;
  }

  /**
   * Get actionName
   * @return actionName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActionName() {
    return actionName;
  }

  public void setActionName(String actionName) { this.actionName = actionName; }

  public SelectedPackage packageReferenceName(String packageReferenceName) {

    this.packageReferenceName = packageReferenceName;
    return this;
  }

  /**
   * Get packageReferenceName
   * @return packageReferenceName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPackageReferenceName() {
    return packageReferenceName;
  }

  public void setPackageReferenceName(String packageReferenceName) {
    this.packageReferenceName = packageReferenceName;
  }

  public SelectedPackage stepName(String stepName) {

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

  public SelectedPackage version(String version) {

    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) { this.version = version; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectedPackage selectedPackage = (SelectedPackage)o;
    return Objects.equals(this.actionName, selectedPackage.actionName) &&
        Objects.equals(this.packageReferenceName,
                       selectedPackage.packageReferenceName) &&
        Objects.equals(this.stepName, selectedPackage.stepName) &&
        Objects.equals(this.version, selectedPackage.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionName, packageReferenceName, stepName, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectedPackage {\n");
    sb.append("    actionName: ")
        .append(toIndentedString(actionName))
        .append("\n");
    sb.append("    packageReferenceName: ")
        .append(toIndentedString(packageReferenceName))
        .append("\n");
    sb.append("    stepName: ").append(toIndentedString(stepName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
