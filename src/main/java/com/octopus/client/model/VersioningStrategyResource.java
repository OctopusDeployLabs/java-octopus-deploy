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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * VersioningStrategyResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class VersioningStrategyResource extends HashMap<String, Object> {
  public static final String SERIALIZED_NAME_DONOR_PACKAGE = "DonorPackage";
  @SerializedName(SERIALIZED_NAME_DONOR_PACKAGE)
  private DeploymentActionPackageResource donorPackage;

  public static final String SERIALIZED_NAME_TEMPLATE = "Template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE) private String template;

  public VersioningStrategyResource
  donorPackage(DeploymentActionPackageResource donorPackage) {

    this.donorPackage = donorPackage;
    return this;
  }

  /**
   * Get donorPackage
   * @return donorPackage
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeploymentActionPackageResource getDonorPackage() {
    return donorPackage;
  }

  public void setDonorPackage(DeploymentActionPackageResource donorPackage) {
    this.donorPackage = donorPackage;
  }

  public VersioningStrategyResource template(String template) {

    this.template = template;
    return this;
  }

  /**
   * Get template
   * @return template
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) { this.template = template; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersioningStrategyResource versioningStrategyResource =
        (VersioningStrategyResource)o;
    return Objects.equals(this.donorPackage,
                          versioningStrategyResource.donorPackage) &&
        Objects.equals(this.template, versioningStrategyResource.template) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(donorPackage, template, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersioningStrategyResource {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    donorPackage: ")
        .append(toIndentedString(donorPackage))
        .append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
