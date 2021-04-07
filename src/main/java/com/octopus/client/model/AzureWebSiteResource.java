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
 * AzureWebSiteResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class AzureWebSiteResource {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_REGION = "Region";
  @SerializedName(SERIALIZED_NAME_REGION) private String region;

  public static final String SERIALIZED_NAME_RESOURCE_GROUP = "ResourceGroup";
  @SerializedName(SERIALIZED_NAME_RESOURCE_GROUP) private String resourceGroup;

  /**
   * Get name
   * @return name
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
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

  /**
   * Get resourceGroup
   * @return resourceGroup
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceGroup() {
    return resourceGroup;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureWebSiteResource azureWebSiteResource = (AzureWebSiteResource)o;
    return Objects.equals(this.name, azureWebSiteResource.name) &&
        Objects.equals(this.region, azureWebSiteResource.region) &&
        Objects.equals(this.resourceGroup, azureWebSiteResource.resourceGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, region, resourceGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureWebSiteResource {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    resourceGroup: ")
        .append(toIndentedString(resourceGroup))
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
