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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.threeten.bp.OffsetDateTime;

/**
 * ChannelVersionRuleResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ChannelVersionRuleResource extends HashMap<String, Object> {
  public static final String SERIALIZED_NAME_ACTION_PACKAGES = "ActionPackages";
  @SerializedName(SERIALIZED_NAME_ACTION_PACKAGES)
  private List<DeploymentActionPackageResource> actionPackages = null;

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

  public static final String SERIALIZED_NAME_TAG = "Tag";
  @SerializedName(SERIALIZED_NAME_TAG) private String tag;

  public static final String SERIALIZED_NAME_VERSION_RANGE = "VersionRange";
  @SerializedName(SERIALIZED_NAME_VERSION_RANGE) private String versionRange;

  public ChannelVersionRuleResource
  actionPackages(List<DeploymentActionPackageResource> actionPackages) {

    this.actionPackages = actionPackages;
    return this;
  }

  public ChannelVersionRuleResource
  addActionPackagesItem(DeploymentActionPackageResource actionPackagesItem) {
    if (this.actionPackages == null) {
      this.actionPackages = new ArrayList<DeploymentActionPackageResource>();
    }
    this.actionPackages.add(actionPackagesItem);
    return this;
  }

  /**
   * Get actionPackages
   * @return actionPackages
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DeploymentActionPackageResource> getActionPackages() {
    return actionPackages;
  }

  public void
  setActionPackages(List<DeploymentActionPackageResource> actionPackages) {
    this.actionPackages = actionPackages;
  }

  public ChannelVersionRuleResource id(String id) {

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

  public ChannelVersionRuleResource lastModifiedBy(String lastModifiedBy) {

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

  public ChannelVersionRuleResource
  lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public ChannelVersionRuleResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public ChannelVersionRuleResource putLinksItem(String key, String linksItem) {
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

  public ChannelVersionRuleResource tag(String tag) {

    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * @return tag
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTag() {
    return tag;
  }

  public void setTag(String tag) { this.tag = tag; }

  public ChannelVersionRuleResource versionRange(String versionRange) {

    this.versionRange = versionRange;
    return this;
  }

  /**
   * Get versionRange
   * @return versionRange
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersionRange() {
    return versionRange;
  }

  public void setVersionRange(String versionRange) {
    this.versionRange = versionRange;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelVersionRuleResource channelVersionRuleResource =
        (ChannelVersionRuleResource)o;
    return Objects.equals(this.actionPackages,
                          channelVersionRuleResource.actionPackages) &&
        Objects.equals(this.id, channelVersionRuleResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       channelVersionRuleResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       channelVersionRuleResource.lastModifiedOn) &&
        Objects.equals(this.links, channelVersionRuleResource.links) &&
        Objects.equals(this.tag, channelVersionRuleResource.tag) &&
        Objects.equals(this.versionRange,
                       channelVersionRuleResource.versionRange) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionPackages, id, lastModifiedBy, lastModifiedOn,
                        links, tag, versionRange, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelVersionRuleResource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    actionPackages: ")
        .append(toIndentedString(actionPackages))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    versionRange: ")
        .append(toIndentedString(versionRange))
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
