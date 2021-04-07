// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.MissingVariableResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * TenantsMissingVariablesResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class TenantsMissingVariablesResource {
  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_MISSING_VARIABLES =
      "MissingVariables";
  @SerializedName(SERIALIZED_NAME_MISSING_VARIABLES)
  private List<MissingVariableResource> missingVariables = null;

  public static final String SERIALIZED_NAME_TENANT_ID = "TenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID) private String tenantId;

  /**
   * Get links
   * @return links
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getLinks() {
    return links;
  }

  public TenantsMissingVariablesResource
  missingVariables(List<MissingVariableResource> missingVariables) {

    this.missingVariables = missingVariables;
    return this;
  }

  public TenantsMissingVariablesResource
  addMissingVariablesItem(MissingVariableResource missingVariablesItem) {
    if (this.missingVariables == null) {
      this.missingVariables = new ArrayList<MissingVariableResource>();
    }
    this.missingVariables.add(missingVariablesItem);
    return this;
  }

  /**
   * Get missingVariables
   * @return missingVariables
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MissingVariableResource> getMissingVariables() {
    return missingVariables;
  }

  public void
  setMissingVariables(List<MissingVariableResource> missingVariables) {
    this.missingVariables = missingVariables;
  }

  public TenantsMissingVariablesResource tenantId(String tenantId) {

    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) { this.tenantId = tenantId; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantsMissingVariablesResource tenantsMissingVariablesResource =
        (TenantsMissingVariablesResource)o;
    return Objects.equals(this.links, tenantsMissingVariablesResource.links) &&
        Objects.equals(this.missingVariables,
                       tenantsMissingVariablesResource.missingVariables) &&
        Objects.equals(this.tenantId, tenantsMissingVariablesResource.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, missingVariables, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantsMissingVariablesResource {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    missingVariables: ")
        .append(toIndentedString(missingVariables))
        .append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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
