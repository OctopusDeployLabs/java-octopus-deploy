// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ChannelVersionRuleResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.threeten.bp.OffsetDateTime;

/**
 * ChannelResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ChannelResource {
  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION) private String description;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "IsDefault";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT) private Boolean isDefault;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY =
      "LastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_ON =
      "LastModifiedOn";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_ON)
  private OffsetDateTime lastModifiedOn;

  public static final String SERIALIZED_NAME_LIFECYCLE_ID = "LifecycleId";
  @SerializedName(SERIALIZED_NAME_LIFECYCLE_ID) private String lifecycleId;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_PROJECT_ID = "ProjectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID) private String projectId;

  public static final String SERIALIZED_NAME_RULES = "Rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private List<ChannelVersionRuleResource> rules = null;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public static final String SERIALIZED_NAME_TENANT_TAGS = "TenantTags";
  @SerializedName(SERIALIZED_NAME_TENANT_TAGS)
  private Set<String> tenantTags = null;

  public ChannelResource description(String description) {

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

  public ChannelResource id(String id) {

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

  public ChannelResource isDefault(Boolean isDefault) {

    this.isDefault = isDefault;
    return this;
  }

  /**
   * Get isDefault
   * @return isDefault
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) { this.isDefault = isDefault; }

  public ChannelResource lastModifiedBy(String lastModifiedBy) {

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

  public ChannelResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public ChannelResource lifecycleId(String lifecycleId) {

    this.lifecycleId = lifecycleId;
    return this;
  }

  /**
   * Get lifecycleId
   * @return lifecycleId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLifecycleId() {
    return lifecycleId;
  }

  public void setLifecycleId(String lifecycleId) {
    this.lifecycleId = lifecycleId;
  }

  public ChannelResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public ChannelResource putLinksItem(String key, String linksItem) {
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

  public ChannelResource name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }

  public void setName(String name) { this.name = name; }

  public ChannelResource projectId(String projectId) {

    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) { this.projectId = projectId; }

  public ChannelResource rules(List<ChannelVersionRuleResource> rules) {

    this.rules = rules;
    return this;
  }

  public ChannelResource addRulesItem(ChannelVersionRuleResource rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<ChannelVersionRuleResource>();
    }
    this.rules.add(rulesItem);
    return this;
  }

  /**
   * Get rules
   * @return rules
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ChannelVersionRuleResource> getRules() {
    return rules;
  }

  public void setRules(List<ChannelVersionRuleResource> rules) {
    this.rules = rules;
  }

  public ChannelResource spaceId(String spaceId) {

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

  public ChannelResource tenantTags(Set<String> tenantTags) {

    this.tenantTags = tenantTags;
    return this;
  }

  public ChannelResource addTenantTagsItem(String tenantTagsItem) {
    if (this.tenantTags == null) {
      this.tenantTags = new LinkedHashSet<String>();
    }
    this.tenantTags.add(tenantTagsItem);
    return this;
  }

  /**
   * Get tenantTags
   * @return tenantTags
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getTenantTags() {
    return tenantTags;
  }

  public void setTenantTags(Set<String> tenantTags) {
    this.tenantTags = tenantTags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelResource channelResource = (ChannelResource)o;
    return Objects.equals(this.description, channelResource.description) &&
        Objects.equals(this.id, channelResource.id) &&
        Objects.equals(this.isDefault, channelResource.isDefault) &&
        Objects.equals(this.lastModifiedBy, channelResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn, channelResource.lastModifiedOn) &&
        Objects.equals(this.lifecycleId, channelResource.lifecycleId) &&
        Objects.equals(this.links, channelResource.links) &&
        Objects.equals(this.name, channelResource.name) &&
        Objects.equals(this.projectId, channelResource.projectId) &&
        Objects.equals(this.rules, channelResource.rules) &&
        Objects.equals(this.spaceId, channelResource.spaceId) &&
        Objects.equals(this.tenantTags, channelResource.tenantTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, isDefault, lastModifiedBy,
                        lastModifiedOn, lifecycleId, links, name, projectId,
                        rules, spaceId, tenantTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelResource {\n");
    sb.append("    description: ")
        .append(toIndentedString(description))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ")
        .append(toIndentedString(isDefault))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    lifecycleId: ")
        .append(toIndentedString(lifecycleId))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectId: ")
        .append(toIndentedString(projectId))
        .append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    tenantTags: ")
        .append(toIndentedString(tenantTags))
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
