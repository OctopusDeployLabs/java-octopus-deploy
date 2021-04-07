// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ActionUpdatePackageUsedBy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * ActionUpdateRemovedPackageUsage
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ActionUpdateRemovedPackageUsage {
  public static final String SERIALIZED_NAME_PACKAGE_REFERENCE =
      "PackageReference";
  @SerializedName(SERIALIZED_NAME_PACKAGE_REFERENCE)
  private String packageReference;

  public static final String SERIALIZED_NAME_USED_BY = "UsedBy";
  @SerializedName(SERIALIZED_NAME_USED_BY)
  private ActionUpdatePackageUsedBy usedBy;

  public static final String SERIALIZED_NAME_USED_BY_ID = "UsedById";
  @SerializedName(SERIALIZED_NAME_USED_BY_ID) private String usedById;

  public static final String SERIALIZED_NAME_USED_BY_NAME = "UsedByName";
  @SerializedName(SERIALIZED_NAME_USED_BY_NAME) private String usedByName;

  public ActionUpdateRemovedPackageUsage
  packageReference(String packageReference) {

    this.packageReference = packageReference;
    return this;
  }

  /**
   * Get packageReference
   * @return packageReference
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPackageReference() {
    return packageReference;
  }

  public void setPackageReference(String packageReference) {
    this.packageReference = packageReference;
  }

  public ActionUpdateRemovedPackageUsage
  usedBy(ActionUpdatePackageUsedBy usedBy) {

    this.usedBy = usedBy;
    return this;
  }

  /**
   * Get usedBy
   * @return usedBy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ActionUpdatePackageUsedBy getUsedBy() {
    return usedBy;
  }

  public void setUsedBy(ActionUpdatePackageUsedBy usedBy) {
    this.usedBy = usedBy;
  }

  public ActionUpdateRemovedPackageUsage usedById(String usedById) {

    this.usedById = usedById;
    return this;
  }

  /**
   * Get usedById
   * @return usedById
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsedById() {
    return usedById;
  }

  public void setUsedById(String usedById) { this.usedById = usedById; }

  public ActionUpdateRemovedPackageUsage usedByName(String usedByName) {

    this.usedByName = usedByName;
    return this;
  }

  /**
   * Get usedByName
   * @return usedByName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsedByName() {
    return usedByName;
  }

  public void setUsedByName(String usedByName) { this.usedByName = usedByName; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionUpdateRemovedPackageUsage actionUpdateRemovedPackageUsage =
        (ActionUpdateRemovedPackageUsage)o;
    return Objects.equals(this.packageReference,
                          actionUpdateRemovedPackageUsage.packageReference) &&
        Objects.equals(this.usedBy, actionUpdateRemovedPackageUsage.usedBy) &&
        Objects.equals(this.usedById,
                       actionUpdateRemovedPackageUsage.usedById) &&
        Objects.equals(this.usedByName,
                       actionUpdateRemovedPackageUsage.usedByName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageReference, usedBy, usedById, usedByName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionUpdateRemovedPackageUsage {\n");
    sb.append("    packageReference: ")
        .append(toIndentedString(packageReference))
        .append("\n");
    sb.append("    usedBy: ").append(toIndentedString(usedBy)).append("\n");
    sb.append("    usedById: ").append(toIndentedString(usedById)).append("\n");
    sb.append("    usedByName: ")
        .append(toIndentedString(usedByName))
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
