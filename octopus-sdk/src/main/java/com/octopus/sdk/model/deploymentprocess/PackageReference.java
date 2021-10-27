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

package com.octopus.sdk.model.deploymentprocess;

import com.octopus.sdk.model.NamedResource;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/** PackageReference */
@SuppressWarnings("UnusedVariable")
public class PackageReference extends NamedResource {
  @SerializedName("AcquisitionLocation")
  private String acquisitionLocation;

  @SerializedName("FeedId")
  private String feedId;

  @SerializedName("PackageId")
  private String packageId;

  @SerializedName("Properties")
  private Map<String, String> properties = null;

  public PackageReference(final String name) {
    super(name);
  }

  public PackageReference acquisitionLocation(String acquisitionLocation) {

    this.acquisitionLocation = acquisitionLocation;
    return this;
  }

  public String getAcquisitionLocation() {
    return acquisitionLocation;
  }

  public void setAcquisitionLocation(String acquisitionLocation) {
    this.acquisitionLocation = acquisitionLocation;
  }

  public PackageReference feedId(String feedId) {

    this.feedId = feedId;
    return this;
  }

  public String getFeedId() {
    return feedId;
  }

  public void setFeedId(String feedId) {
    this.feedId = feedId;
  }

  public PackageReference packageId(String packageId) {

    this.packageId = packageId;
    return this;
  }

  public String getPackageId() {
    return packageId;
  }

  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }

  public PackageReference properties(Map<String, String> properties) {

    this.properties = properties;
    return this;
  }

  public PackageReference putPropertiesItem(final String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageReference packageReference = (PackageReference) o;
    return Objects.equals(this.acquisitionLocation, packageReference.acquisitionLocation)
        && Objects.equals(this.feedId, packageReference.feedId)
        && Objects.equals(this.getId(), packageReference.getId())
        && Objects.equals(this.getName(), packageReference.getName())
        && Objects.equals(this.packageId, packageReference.packageId)
        && Objects.equals(this.properties, packageReference.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquisitionLocation, feedId, getId(), getName(), packageId, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageReference {\n");
    sb.append("    acquisitionLocation: ")
        .append(toIndentedString(acquisitionLocation))
        .append("\n");
    sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
    sb.append("    id: ").append(toIndentedString(getId())).append("\n");
    sb.append("    name: ").append(toIndentedString(getName())).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
