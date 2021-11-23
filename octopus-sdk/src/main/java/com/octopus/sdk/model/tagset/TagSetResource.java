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

package com.octopus.sdk.model.tagset;

import com.octopus.sdk.model.NamedResource;
import com.octopus.sdk.model.tag.TagResource;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("UnusedVariable")
public class TagSetResource extends NamedResource {
  @SerializedName("LastModifiedBy")
  private String lastModifiedBy;

  @SerializedName("LastModifiedOn")
  private OffsetDateTime lastModifiedOn;

  @SerializedName("SortOrder")
  private Integer sortOrder;

  @SerializedName("SpaceId")
  private String spaceId;

  @SerializedName("Tags")
  private List<TagResource> tags = null;

  public TagSetResource(final String name) {
    super(name);
  }

  public TagSetResource lastModifiedBy(String lastModifiedBy) {

    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public TagSetResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public TagSetResource sortOrder(Integer sortOrder) {

    this.sortOrder = sortOrder;
    return this;
  }

  public Integer getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  public TagSetResource spaceId(String spaceId) {

    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(String spaceId) {
    this.spaceId = spaceId;
  }

  public TagSetResource tags(List<TagResource> tags) {

    this.tags = tags;
    return this;
  }

  public TagSetResource addTagsItem(TagResource tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  public List<TagResource> getTags() {
    return tags;
  }

  public void setTags(List<TagResource> tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagSetResource tagSetResource = (TagSetResource) o;
    return Objects.equals(this.lastModifiedBy, tagSetResource.lastModifiedBy)
        && Objects.equals(this.lastModifiedOn, tagSetResource.lastModifiedOn)
        && Objects.equals(this.sortOrder, tagSetResource.sortOrder)
        && Objects.equals(this.spaceId, tagSetResource.spaceId)
        && Objects.equals(this.tags, tagSetResource.tags)
        && Objects.equals(this.getId(), tagSetResource.getId())
        && Objects.equals(this.getName(), tagSetResource.getName())
        && Objects.equals(this.getLinks(), tagSetResource.getLinks())
        && Objects.equals(this.getDescription(), tagSetResource.getDescription());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        lastModifiedBy,
        lastModifiedOn,
        sortOrder,
        spaceId,
        tags,
        getId(),
        getName(),
        getDescription(),
        getLinks());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagSetResource {\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedOn: ").append(toIndentedString(lastModifiedOn)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    id: ").append(toIndentedString(this.getId())).append("\n");
    sb.append("    name: ").append(toIndentedString(this.getName())).append("\n");
    sb.append("    description: ").append(toIndentedString(this.getDescription())).append("\n");
    sb.append("    links: ").append(toIndentedString(this.getLinks())).append("\n");
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
