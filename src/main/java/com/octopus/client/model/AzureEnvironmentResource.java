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
 * AzureEnvironmentResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class AzureEnvironmentResource {
  public static final String SERIALIZED_NAME_AUTHENTICATION_ENDPOINT =
      "AuthenticationEndpoint";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_ENDPOINT)
  private String authenticationEndpoint;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "DisplayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME) private String displayName;

  public static final String SERIALIZED_NAME_GRAPH_ENDPOINT = "GraphEndpoint";
  @SerializedName(SERIALIZED_NAME_GRAPH_ENDPOINT) private String graphEndpoint;

  public static final String SERIALIZED_NAME_MANAGEMENT_ENDPOINT =
      "ManagementEndpoint";
  @SerializedName(SERIALIZED_NAME_MANAGEMENT_ENDPOINT)
  private String managementEndpoint;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_RESOURCE_MANAGER_ENDPOINT =
      "ResourceManagerEndpoint";
  @SerializedName(SERIALIZED_NAME_RESOURCE_MANAGER_ENDPOINT)
  private String resourceManagerEndpoint;

  public static final String SERIALIZED_NAME_STORAGE_ENDPOINT_SUFFIX =
      "StorageEndpointSuffix";
  @SerializedName(SERIALIZED_NAME_STORAGE_ENDPOINT_SUFFIX)
  private String storageEndpointSuffix;

  public AzureEnvironmentResource
  authenticationEndpoint(String authenticationEndpoint) {

    this.authenticationEndpoint = authenticationEndpoint;
    return this;
  }

  /**
   * Get authenticationEndpoint
   * @return authenticationEndpoint
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthenticationEndpoint() {
    return authenticationEndpoint;
  }

  public void setAuthenticationEndpoint(String authenticationEndpoint) {
    this.authenticationEndpoint = authenticationEndpoint;
  }

  public AzureEnvironmentResource displayName(String displayName) {

    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public AzureEnvironmentResource graphEndpoint(String graphEndpoint) {

    this.graphEndpoint = graphEndpoint;
    return this;
  }

  /**
   * Get graphEndpoint
   * @return graphEndpoint
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGraphEndpoint() {
    return graphEndpoint;
  }

  public void setGraphEndpoint(String graphEndpoint) {
    this.graphEndpoint = graphEndpoint;
  }

  public AzureEnvironmentResource
  managementEndpoint(String managementEndpoint) {

    this.managementEndpoint = managementEndpoint;
    return this;
  }

  /**
   * Get managementEndpoint
   * @return managementEndpoint
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagementEndpoint() {
    return managementEndpoint;
  }

  public void setManagementEndpoint(String managementEndpoint) {
    this.managementEndpoint = managementEndpoint;
  }

  public AzureEnvironmentResource name(String name) {

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

  public AzureEnvironmentResource
  resourceManagerEndpoint(String resourceManagerEndpoint) {

    this.resourceManagerEndpoint = resourceManagerEndpoint;
    return this;
  }

  /**
   * Get resourceManagerEndpoint
   * @return resourceManagerEndpoint
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResourceManagerEndpoint() {
    return resourceManagerEndpoint;
  }

  public void setResourceManagerEndpoint(String resourceManagerEndpoint) {
    this.resourceManagerEndpoint = resourceManagerEndpoint;
  }

  public AzureEnvironmentResource
  storageEndpointSuffix(String storageEndpointSuffix) {

    this.storageEndpointSuffix = storageEndpointSuffix;
    return this;
  }

  /**
   * Get storageEndpointSuffix
   * @return storageEndpointSuffix
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStorageEndpointSuffix() {
    return storageEndpointSuffix;
  }

  public void setStorageEndpointSuffix(String storageEndpointSuffix) {
    this.storageEndpointSuffix = storageEndpointSuffix;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AzureEnvironmentResource azureEnvironmentResource =
        (AzureEnvironmentResource)o;
    return Objects.equals(this.authenticationEndpoint,
                          azureEnvironmentResource.authenticationEndpoint) &&
        Objects.equals(this.displayName,
                       azureEnvironmentResource.displayName) &&
        Objects.equals(this.graphEndpoint,
                       azureEnvironmentResource.graphEndpoint) &&
        Objects.equals(this.managementEndpoint,
                       azureEnvironmentResource.managementEndpoint) &&
        Objects.equals(this.name, azureEnvironmentResource.name) &&
        Objects.equals(this.resourceManagerEndpoint,
                       azureEnvironmentResource.resourceManagerEndpoint) &&
        Objects.equals(this.storageEndpointSuffix,
                       azureEnvironmentResource.storageEndpointSuffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationEndpoint, displayName, graphEndpoint,
                        managementEndpoint, name, resourceManagerEndpoint,
                        storageEndpointSuffix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AzureEnvironmentResource {\n");
    sb.append("    authenticationEndpoint: ")
        .append(toIndentedString(authenticationEndpoint))
        .append("\n");
    sb.append("    displayName: ")
        .append(toIndentedString(displayName))
        .append("\n");
    sb.append("    graphEndpoint: ")
        .append(toIndentedString(graphEndpoint))
        .append("\n");
    sb.append("    managementEndpoint: ")
        .append(toIndentedString(managementEndpoint))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceManagerEndpoint: ")
        .append(toIndentedString(resourceManagerEndpoint))
        .append("\n");
    sb.append("    storageEndpointSuffix: ")
        .append(toIndentedString(storageEndpointSuffix))
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
