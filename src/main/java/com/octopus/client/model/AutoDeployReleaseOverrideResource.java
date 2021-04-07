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
 * AutoDeployReleaseOverrideResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class AutoDeployReleaseOverrideResource {
  public static final String SERIALIZED_NAME_ENVIRONMENT_ID = "EnvironmentId";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_ID) private String environmentId;

  public static final String SERIALIZED_NAME_RELEASE_ID = "ReleaseId";
  @SerializedName(SERIALIZED_NAME_RELEASE_ID) private String releaseId;

  public static final String SERIALIZED_NAME_TENANT_ID = "TenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID) private String tenantId;

  public AutoDeployReleaseOverrideResource environmentId(String environmentId) {

    this.environmentId = environmentId;
    return this;
  }

  /**
   * Get environmentId
   * @return environmentId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }

  public AutoDeployReleaseOverrideResource releaseId(String releaseId) {

    this.releaseId = releaseId;
    return this;
  }

  /**
   * Get releaseId
   * @return releaseId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReleaseId() {
    return releaseId;
  }

  public void setReleaseId(String releaseId) { this.releaseId = releaseId; }

  public AutoDeployReleaseOverrideResource tenantId(String tenantId) {

    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) { this.tenantId = tenantId; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoDeployReleaseOverrideResource autoDeployReleaseOverrideResource =
        (AutoDeployReleaseOverrideResource)o;
    return Objects.equals(this.environmentId,
                          autoDeployReleaseOverrideResource.environmentId) &&
        Objects.equals(this.releaseId,
                       autoDeployReleaseOverrideResource.releaseId) &&
        Objects.equals(this.tenantId,
                       autoDeployReleaseOverrideResource.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentId, releaseId, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoDeployReleaseOverrideResource {\n");
    sb.append("    environmentId: ")
        .append(toIndentedString(environmentId))
        .append("\n");
    sb.append("    releaseId: ")
        .append(toIndentedString(releaseId))
        .append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
