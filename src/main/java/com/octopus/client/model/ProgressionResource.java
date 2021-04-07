// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ReferenceDataItem;
import com.octopus.client.model.ReleaseProgressionResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.threeten.bp.OffsetDateTime;

/**
 * ProgressionResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ProgressionResource {
  public static final String SERIALIZED_NAME_CHANNEL_ENVIRONMENTS =
      "ChannelEnvironments";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ENVIRONMENTS)
  private Map<String, List<ReferenceDataItem>> channelEnvironments = null;

  public static final String SERIALIZED_NAME_ENVIRONMENTS = "Environments";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENTS)
  private List<ReferenceDataItem> environments = null;

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

  public static final String SERIALIZED_NAME_RELEASES = "Releases";
  @SerializedName(SERIALIZED_NAME_RELEASES)
  private List<ReleaseProgressionResource> releases = null;

  public ProgressionResource channelEnvironments(
      Map<String, List<ReferenceDataItem>> channelEnvironments) {

    this.channelEnvironments = channelEnvironments;
    return this;
  }

  public ProgressionResource
  putChannelEnvironmentsItem(String key,
                             List<ReferenceDataItem> channelEnvironmentsItem) {
    if (this.channelEnvironments == null) {
      this.channelEnvironments = new HashMap<String, List<ReferenceDataItem>>();
    }
    this.channelEnvironments.put(key, channelEnvironmentsItem);
    return this;
  }

  /**
   * Get channelEnvironments
   * @return channelEnvironments
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<ReferenceDataItem>> getChannelEnvironments() {
    return channelEnvironments;
  }

  public void setChannelEnvironments(
      Map<String, List<ReferenceDataItem>> channelEnvironments) {
    this.channelEnvironments = channelEnvironments;
  }

  public ProgressionResource
  environments(List<ReferenceDataItem> environments) {

    this.environments = environments;
    return this;
  }

  public ProgressionResource
  addEnvironmentsItem(ReferenceDataItem environmentsItem) {
    if (this.environments == null) {
      this.environments = new ArrayList<ReferenceDataItem>();
    }
    this.environments.add(environmentsItem);
    return this;
  }

  /**
   * Get environments
   * @return environments
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReferenceDataItem> getEnvironments() {
    return environments;
  }

  public void setEnvironments(List<ReferenceDataItem> environments) {
    this.environments = environments;
  }

  public ProgressionResource id(String id) {

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

  public ProgressionResource lastModifiedBy(String lastModifiedBy) {

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

  public ProgressionResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public ProgressionResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public ProgressionResource putLinksItem(String key, String linksItem) {
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

  public ProgressionResource
  releases(List<ReleaseProgressionResource> releases) {

    this.releases = releases;
    return this;
  }

  public ProgressionResource
  addReleasesItem(ReleaseProgressionResource releasesItem) {
    if (this.releases == null) {
      this.releases = new ArrayList<ReleaseProgressionResource>();
    }
    this.releases.add(releasesItem);
    return this;
  }

  /**
   * Get releases
   * @return releases
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReleaseProgressionResource> getReleases() {
    return releases;
  }

  public void setReleases(List<ReleaseProgressionResource> releases) {
    this.releases = releases;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgressionResource progressionResource = (ProgressionResource)o;
    return Objects.equals(this.channelEnvironments,
                          progressionResource.channelEnvironments) &&
        Objects.equals(this.environments, progressionResource.environments) &&
        Objects.equals(this.id, progressionResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       progressionResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       progressionResource.lastModifiedOn) &&
        Objects.equals(this.links, progressionResource.links) &&
        Objects.equals(this.releases, progressionResource.releases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelEnvironments, environments, id, lastModifiedBy,
                        lastModifiedOn, links, releases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgressionResource {\n");
    sb.append("    channelEnvironments: ")
        .append(toIndentedString(channelEnvironments))
        .append("\n");
    sb.append("    environments: ")
        .append(toIndentedString(environments))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    releases: ").append(toIndentedString(releases)).append("\n");
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
