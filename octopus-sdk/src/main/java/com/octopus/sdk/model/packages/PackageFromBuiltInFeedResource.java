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

package com.octopus.sdk.model.packages;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/** PackageFromBuiltInFeedResource */
@SuppressWarnings("UnusedVariable")
public class PackageFromBuiltInFeedResource extends PackageResource {

  @SerializedName("Hash")
  private String hash;

  @SerializedName("PackageSizeBytes")
  private Long packageSizeBytes;

  public PackageFromBuiltInFeedResource hash(String hash) {

    this.hash = hash;
    return this;
  }

  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public PackageFromBuiltInFeedResource packageSizeBytes(Long packageSizeBytes) {

    this.packageSizeBytes = packageSizeBytes;
    return this;
  }

  public Long getPackageSizeBytes() {
    return packageSizeBytes;
  }

  public void setPackageSizeBytes(Long packageSizeBytes) {
    this.packageSizeBytes = packageSizeBytes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageFromBuiltInFeedResource packageFromBuiltInFeedResource =
        (PackageFromBuiltInFeedResource) o;
    return Objects.equals(this.hash, packageFromBuiltInFeedResource.hash)
        && Objects.equals(this.packageSizeBytes, packageFromBuiltInFeedResource.packageSizeBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hash, packageSizeBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageFromBuiltInFeedResource {\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    packageSizeBytes: ").append(toIndentedString(packageSizeBytes)).append("\n");
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
