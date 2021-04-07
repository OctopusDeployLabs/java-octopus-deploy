// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * AzureWebSiteSlotResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class AzureWebSiteSlotResource {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_REGION = "Region";
  @SerializedName(SERIALIZED_NAME_REGION) private String region;

  public static final String SERIALIZED_NAME_RESOURCE_GROUP_NAME =
      "ResourceGroupName";
  @SerializedName(SERIALIZED_NAME_RESOURCE_GROUP_NAME)
  private String resourceGroupName;

  public static final String SERIALIZED_NAME_SITE = "Site";
  @SerializedName(SERIALIZED_NAME_SITE) private String site;

  public AzureWebSiteSlotResource name(String name) {

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

  public AzureWebSiteSlotResource region(String region) {

    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) { this.region = region; }

  public AzureWebSiteSlotResource resourceGroupName(String resourceGroupName) {

    this.resourceGroupName = resourceGroupName;
    return this;
  }

  /**
   * Get resourceGroupName
   * @return resourceGroupName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceGroupName() {
    return resourceGroupName;
  }

  public void setResourceGroupName(String resourceGroupName) {
    this.resourceGroupName = resourceGroupName;
  }

  public AzureWebSiteSlotResource site(String site) {

    this.site = site;
    return this;
  }

  /**
   * Get site
   * @return site
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSite() {
    return site;
  }

  public void setSite(String site) { this.site = site; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureWebSiteSlotResource azureWebSiteSlotResource =
        (AzureWebSiteSlotResource)o;
    return Objects.equals(this.name, azureWebSiteSlotResource.name) &&
        Objects.equals(this.region, azureWebSiteSlotResource.region) &&
        Objects.equals(this.resourceGroupName,
                       azureWebSiteSlotResource.resourceGroupName) &&
        Objects.equals(this.site, azureWebSiteSlotResource.site);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, region, resourceGroupName, site);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureWebSiteSlotResource {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    resourceGroupName: ")
        .append(toIndentedString(resourceGroupName))
        .append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
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
