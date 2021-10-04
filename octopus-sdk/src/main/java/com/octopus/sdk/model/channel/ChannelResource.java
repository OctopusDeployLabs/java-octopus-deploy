/*
 * Copyright (c) Octopus Deploy and contributors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * these files except in compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.octopus.sdk.model.channel;

import com.octopus.openapi.model.ChannelVersionRuleResource;
import com.octopus.sdk.model.NamedResource;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import com.google.gson.annotations.SerializedName;

/** ChannelResource */
@SuppressWarnings("UnusedVariable")
public class ChannelResource extends NamedResource {

  @SerializedName("IsDefault")
  private Boolean isDefault;

  @SerializedName("LastModifiedBy")
  private String lastModifiedBy;

  @SerializedName("LastModifiedOn")
  private OffsetDateTime lastModifiedOn;

  @SerializedName("LifecycleId")
  private String lifecycleId;

  @SerializedName("ProjectId")
  private String projectId;

  @SerializedName("Rules")
  private List<ChannelVersionRuleResource> rules = null;

  @SerializedName("SpaceId")
  private String spaceId;

  @SerializedName("TenantTags")
  private Set<String> tenantTags = null;

  public ChannelResource(final String name, final String projectId) {
    super(name);
    this.projectId = projectId;
  }

  public ChannelResource isDefault(Boolean isDefault) {

    this.isDefault = isDefault;
    return this;
  }

  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public ChannelResource lastModifiedBy(String lastModifiedBy) {

    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

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

  public String getLifecycleId() {
    return lifecycleId;
  }

  public void setLifecycleId(String lifecycleId) {
    this.lifecycleId = lifecycleId;
  }

  public ChannelResource projectId(String projectId) {

    this.projectId = projectId;
    return this;
  }

  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public ChannelResource rules(List<ChannelVersionRuleResource> rules) {

    this.rules = rules;
    return this;
  }

  public ChannelResource addRulesItem(ChannelVersionRuleResource rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

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

  public String getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }

  public ChannelResource tenantTags(Set<String> tenantTags) {

    this.tenantTags = tenantTags;
    return this;
  }

  public ChannelResource addTenantTagsItem(String tenantTagsItem) {
    if (this.tenantTags == null) {
      this.tenantTags = new LinkedHashSet<>();
    }
    this.tenantTags.add(tenantTagsItem);
    return this;
  }

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
    ChannelResource channelResource = (ChannelResource) o;
    return Objects.equals(this.isDefault, channelResource.isDefault)
        && Objects.equals(this.lastModifiedBy, channelResource.lastModifiedBy)
        && Objects.equals(this.lastModifiedOn, channelResource.lastModifiedOn)
        && Objects.equals(this.lifecycleId, channelResource.lifecycleId)
        && Objects.equals(this.projectId, channelResource.projectId)
        && Objects.equals(this.rules, channelResource.rules)
        && Objects.equals(this.spaceId, channelResource.spaceId)
        && Objects.equals(this.tenantTags, channelResource.tenantTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        isDefault,
        lastModifiedBy,
        lastModifiedOn,
        lifecycleId,
        projectId,
        rules,
        spaceId,
        tenantTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelResource {\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    lifecycleId: ").append(toIndentedString(lifecycleId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    tenantTags: ").append(toIndentedString(tenantTags)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
