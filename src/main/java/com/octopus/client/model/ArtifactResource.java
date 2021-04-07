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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.threeten.bp.OffsetDateTime;

/**
 * ArtifactResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ArtifactResource {
  public static final String SERIALIZED_NAME_CREATED = "Created";
  @SerializedName(SERIALIZED_NAME_CREATED) private OffsetDateTime created;

  public static final String SERIALIZED_NAME_FILENAME = "Filename";
  @SerializedName(SERIALIZED_NAME_FILENAME) private String filename;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY =
      "LastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_ON =
      "LastModifiedOn";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_ON)
  private OffsetDateTime lastModifiedOn;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_LOG_CORRELATION_ID =
      "LogCorrelationId";
  @SerializedName(SERIALIZED_NAME_LOG_CORRELATION_ID)
  private String logCorrelationId;

  public static final String SERIALIZED_NAME_SERVER_TASK_ID = "ServerTaskId";
  @SerializedName(SERIALIZED_NAME_SERVER_TASK_ID) private String serverTaskId;

  public static final String SERIALIZED_NAME_SOURCE = "Source";
  @SerializedName(SERIALIZED_NAME_SOURCE) private String source;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public ArtifactResource created(OffsetDateTime created) {

    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) { this.created = created; }

  public ArtifactResource filename(String filename) {

    this.filename = filename;
    return this;
  }

  /**
   * Get filename
   * @return filename
   **/
  @ApiModelProperty(required = true, value = "")

  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) { this.filename = filename; }

  public ArtifactResource id(String id) {

    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }

  public void setId(String id) { this.id = id; }

  public ArtifactResource lastModifiedBy(String lastModifiedBy) {

    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  /**
   * Get lastModifiedBy
   * @return lastModifiedBy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public ArtifactResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

  /**
   * Get lastModifiedOn
   * @return lastModifiedOn
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public ArtifactResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public ArtifactResource putLinksItem(String key, String linksItem) {
    if (this.links == null) {
      this.links = new HashMap<String, String>();
    }
    this.links.put(key, linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) { this.links = links; }

  public ArtifactResource logCorrelationId(String logCorrelationId) {

    this.logCorrelationId = logCorrelationId;
    return this;
  }

  /**
   * Get logCorrelationId
   * @return logCorrelationId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogCorrelationId() {
    return logCorrelationId;
  }

  public void setLogCorrelationId(String logCorrelationId) {
    this.logCorrelationId = logCorrelationId;
  }

  public ArtifactResource serverTaskId(String serverTaskId) {

    this.serverTaskId = serverTaskId;
    return this;
  }

  /**
   * Get serverTaskId
   * @return serverTaskId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServerTaskId() {
    return serverTaskId;
  }

  public void setServerTaskId(String serverTaskId) {
    this.serverTaskId = serverTaskId;
  }

  public ArtifactResource source(String source) {

    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSource() {
    return source;
  }

  public void setSource(String source) { this.source = source; }

  public ArtifactResource spaceId(String spaceId) {

    this.spaceId = spaceId;
    return this;
  }

  /**
   * Get spaceId
   * @return spaceId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(String spaceId) { this.spaceId = spaceId; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactResource artifactResource = (ArtifactResource)o;
    return Objects.equals(this.created, artifactResource.created) &&
        Objects.equals(this.filename, artifactResource.filename) &&
        Objects.equals(this.id, artifactResource.id) &&
        Objects.equals(this.lastModifiedBy, artifactResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn, artifactResource.lastModifiedOn) &&
        Objects.equals(this.links, artifactResource.links) &&
        Objects.equals(this.logCorrelationId,
                       artifactResource.logCorrelationId) &&
        Objects.equals(this.serverTaskId, artifactResource.serverTaskId) &&
        Objects.equals(this.source, artifactResource.source) &&
        Objects.equals(this.spaceId, artifactResource.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, filename, id, lastModifiedBy, lastModifiedOn,
                        links, logCorrelationId, serverTaskId, source, spaceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactResource {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    logCorrelationId: ")
        .append(toIndentedString(logCorrelationId))
        .append("\n");
    sb.append("    serverTaskId: ")
        .append(toIndentedString(serverTaskId))
        .append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
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
