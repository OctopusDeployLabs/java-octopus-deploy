// Octopus REST API v2021.2.4488

package com.octopus.sdk.model.packages;

import com.google.gson.annotations.SerializedName;
import com.octopus.openapi.model.OctopusPackageVersionBuildInformationMappedResource;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * PackageFromBuiltInFeedResource
 */
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
    PackageFromBuiltInFeedResource packageFromBuiltInFeedResource = (PackageFromBuiltInFeedResource) o;
    return Objects.equals(this.hash, packageFromBuiltInFeedResource.hash) &&
        Objects.equals(this.packageSizeBytes, packageFromBuiltInFeedResource.packageSizeBytes);
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

