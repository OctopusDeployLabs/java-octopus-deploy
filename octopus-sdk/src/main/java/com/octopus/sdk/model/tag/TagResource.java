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

package com.octopus.sdk.model.tag;

import com.octopus.sdk.model.NamedResource;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("UnusedVariable")
public class TagResource extends NamedResource {
  @SerializedName("CanonicalTagName")
  private String canonicalTagName;

  @SerializedName("Color")
  private String color;

  @SerializedName("SortOrder")
  private Integer sortOrder;

  public TagResource(final String name, final String color) {
    super(name);
    this.color = color;
  }

  public TagResource canonicalTagName(String canonicalTagName) {

    this.canonicalTagName = canonicalTagName;
    return this;
  }

  public String getCanonicalTagName() {
    return canonicalTagName;
  }

  public void setCanonicalTagName(String canonicalTagName) {
    this.canonicalTagName = canonicalTagName;
  }

  public TagResource color(String color) {

    this.color = color;
    return this;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public TagResource sortOrder(Integer sortOrder) {

    this.sortOrder = sortOrder;
    return this;
  }

  public Integer getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(Integer sortOrder) {
    this.sortOrder = sortOrder;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagResource tagResource = (TagResource) o;
    return Objects.equals(this.canonicalTagName, tagResource.canonicalTagName)
        && Objects.equals(this.color, tagResource.color)
        && Objects.equals(this.sortOrder, tagResource.sortOrder)
        && Objects.equals(this.getId(), tagResource.getId())
        && Objects.equals(this.getName(), tagResource.getName())
        && Objects.equals(this.getLinks(), tagResource.getLinks())
        && Objects.equals(this.getDescription(), tagResource.getDescription());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        canonicalTagName, color, sortOrder, getId(), getName(), getDescription(), getLinks());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagResource {\n");
    sb.append("    canonicalTagName: ").append(toIndentedString(canonicalTagName)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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
