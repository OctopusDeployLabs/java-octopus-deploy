// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.Metadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * ProjectSettingsMetadata
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ProjectSettingsMetadata {
  public static final String SERIALIZED_NAME_EXTENSION_ID = "ExtensionId";
  @SerializedName(SERIALIZED_NAME_EXTENSION_ID) private String extensionId;

  public static final String SERIALIZED_NAME_METADATA = "Metadata";
  @SerializedName(SERIALIZED_NAME_METADATA) private Metadata metadata;

  public ProjectSettingsMetadata extensionId(String extensionId) {

    this.extensionId = extensionId;
    return this;
  }

  /**
   * Get extensionId
   * @return extensionId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExtensionId() {
    return extensionId;
  }

  public void setExtensionId(String extensionId) {
    this.extensionId = extensionId;
  }

  public ProjectSettingsMetadata metadata(Metadata metadata) {

    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Metadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Metadata metadata) { this.metadata = metadata; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectSettingsMetadata projectSettingsMetadata =
        (ProjectSettingsMetadata)o;
    return Objects.equals(this.extensionId,
                          projectSettingsMetadata.extensionId) &&
        Objects.equals(this.metadata, projectSettingsMetadata.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extensionId, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectSettingsMetadata {\n");
    sb.append("    extensionId: ")
        .append(toIndentedString(extensionId))
        .append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
