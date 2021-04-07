// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.DeploymentActionPackageResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ReleaseCreationStrategyResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ReleaseCreationStrategyResource extends HashMap<String, Object> {
  public static final String SERIALIZED_NAME_CHANNEL_ID = "ChannelId";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID) private String channelId;

  public static final String SERIALIZED_NAME_RELEASE_CREATION_PACKAGE =
      "ReleaseCreationPackage";
  @SerializedName(SERIALIZED_NAME_RELEASE_CREATION_PACKAGE)
  private DeploymentActionPackageResource releaseCreationPackage;

  public ReleaseCreationStrategyResource channelId(String channelId) {

    this.channelId = channelId;
    return this;
  }

  /**
   * Get channelId
   * @return channelId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) { this.channelId = channelId; }

  public ReleaseCreationStrategyResource releaseCreationPackage(
      DeploymentActionPackageResource releaseCreationPackage) {

    this.releaseCreationPackage = releaseCreationPackage;
    return this;
  }

  /**
   * Get releaseCreationPackage
   * @return releaseCreationPackage
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeploymentActionPackageResource getReleaseCreationPackage() {
    return releaseCreationPackage;
  }

  public void setReleaseCreationPackage(
      DeploymentActionPackageResource releaseCreationPackage) {
    this.releaseCreationPackage = releaseCreationPackage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseCreationStrategyResource releaseCreationStrategyResource =
        (ReleaseCreationStrategyResource)o;
    return Objects.equals(this.channelId,
                          releaseCreationStrategyResource.channelId) &&
        Objects.equals(
            this.releaseCreationPackage,
            releaseCreationStrategyResource.releaseCreationPackage) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, releaseCreationPackage, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseCreationStrategyResource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    channelId: ")
        .append(toIndentedString(channelId))
        .append("\n");
    sb.append("    releaseCreationPackage: ")
        .append(toIndentedString(releaseCreationPackage))
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
