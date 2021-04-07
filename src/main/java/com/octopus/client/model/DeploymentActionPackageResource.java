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
 * DeploymentActionPackageResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class DeploymentActionPackageResource {
  public static final String SERIALIZED_NAME_DEPLOYMENT_ACTION =
      "DeploymentAction";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_ACTION)
  private String deploymentAction;

  public static final String SERIALIZED_NAME_PACKAGE_REFERENCE =
      "PackageReference";
  @SerializedName(SERIALIZED_NAME_PACKAGE_REFERENCE)
  private String packageReference;

  public DeploymentActionPackageResource
  deploymentAction(String deploymentAction) {

    this.deploymentAction = deploymentAction;
    return this;
  }

  /**
   * Get deploymentAction
   * @return deploymentAction
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeploymentAction() {
    return deploymentAction;
  }

  public void setDeploymentAction(String deploymentAction) {
    this.deploymentAction = deploymentAction;
  }

  public DeploymentActionPackageResource
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentActionPackageResource deploymentActionPackageResource =
        (DeploymentActionPackageResource)o;
    return Objects.equals(this.deploymentAction,
                          deploymentActionPackageResource.deploymentAction) &&
        Objects.equals(this.packageReference,
                       deploymentActionPackageResource.packageReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentAction, packageReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentActionPackageResource {\n");
    sb.append("    deploymentAction: ")
        .append(toIndentedString(deploymentAction))
        .append("\n");
    sb.append("    packageReference: ")
        .append(toIndentedString(packageReference))
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
