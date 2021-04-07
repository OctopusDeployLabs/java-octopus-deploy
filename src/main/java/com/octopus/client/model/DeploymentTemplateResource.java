// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.DeploymentPromomotionTenant;
import com.octopus.client.model.DeploymentPromotionTarget;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.threeten.bp.OffsetDateTime;

/**
 * DeploymentTemplateResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class DeploymentTemplateResource {
  public static final String SERIALIZED_NAME_DEPLOYMENT_NOTES =
      "DeploymentNotes";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_NOTES)
  private String deploymentNotes;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IS_DEPLOYMENT_PROCESS_MODIFIED =
      "IsDeploymentProcessModified";
  @SerializedName(SERIALIZED_NAME_IS_DEPLOYMENT_PROCESS_MODIFIED)
  private Boolean isDeploymentProcessModified;

  public static final String SERIALIZED_NAME_IS_LIBRARY_VARIABLE_SET_MODIFIED =
      "IsLibraryVariableSetModified";
  @SerializedName(SERIALIZED_NAME_IS_LIBRARY_VARIABLE_SET_MODIFIED)
  private Boolean isLibraryVariableSetModified;

  public static final String SERIALIZED_NAME_IS_VARIABLE_SET_MODIFIED =
      "IsVariableSetModified";
  @SerializedName(SERIALIZED_NAME_IS_VARIABLE_SET_MODIFIED)
  private Boolean isVariableSetModified;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY =
      "LastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_ON =
      "LastModifiedOn";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_ON)
  private OffsetDateTime lastModifiedOn;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_PROMOTE_TO = "PromoteTo";
  @SerializedName(SERIALIZED_NAME_PROMOTE_TO)
  private List<DeploymentPromotionTarget> promoteTo = null;

  public static final String SERIALIZED_NAME_TENANT_PROMOTIONS =
      "TenantPromotions";
  @SerializedName(SERIALIZED_NAME_TENANT_PROMOTIONS)
  private List<DeploymentPromomotionTenant> tenantPromotions = null;

  public DeploymentTemplateResource deploymentNotes(String deploymentNotes) {

    this.deploymentNotes = deploymentNotes;
    return this;
  }

  /**
   * Get deploymentNotes
   * @return deploymentNotes
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeploymentNotes() {
    return deploymentNotes;
  }

  public void setDeploymentNotes(String deploymentNotes) {
    this.deploymentNotes = deploymentNotes;
  }

  public DeploymentTemplateResource id(String id) {

    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId() {
    return id;
  }

  public void setId(String id) { this.id = id; }

  public DeploymentTemplateResource
  isDeploymentProcessModified(Boolean isDeploymentProcessModified) {

    this.isDeploymentProcessModified = isDeploymentProcessModified;
    return this;
  }

  /**
   * Get isDeploymentProcessModified
   * @return isDeploymentProcessModified
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsDeploymentProcessModified() {
    return isDeploymentProcessModified;
  }

  public void
  setIsDeploymentProcessModified(Boolean isDeploymentProcessModified) {
    this.isDeploymentProcessModified = isDeploymentProcessModified;
  }

  public DeploymentTemplateResource
  isLibraryVariableSetModified(Boolean isLibraryVariableSetModified) {

    this.isLibraryVariableSetModified = isLibraryVariableSetModified;
    return this;
  }

  /**
   * Get isLibraryVariableSetModified
   * @return isLibraryVariableSetModified
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsLibraryVariableSetModified() {
    return isLibraryVariableSetModified;
  }

  public void
  setIsLibraryVariableSetModified(Boolean isLibraryVariableSetModified) {
    this.isLibraryVariableSetModified = isLibraryVariableSetModified;
  }

  public DeploymentTemplateResource
  isVariableSetModified(Boolean isVariableSetModified) {

    this.isVariableSetModified = isVariableSetModified;
    return this;
  }

  /**
   * Get isVariableSetModified
   * @return isVariableSetModified
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsVariableSetModified() {
    return isVariableSetModified;
  }

  public void setIsVariableSetModified(Boolean isVariableSetModified) {
    this.isVariableSetModified = isVariableSetModified;
  }

  public DeploymentTemplateResource lastModifiedBy(String lastModifiedBy) {

    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  /**
   * Get lastModifiedBy
   * @return lastModifiedBy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public DeploymentTemplateResource
  lastModifiedOn(OffsetDateTime lastModifiedOn) {

    this.lastModifiedOn = lastModifiedOn;
    return this;
  }

  /**
   * Get lastModifiedOn
   * @return lastModifiedOn
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastModifiedOn() {
    return lastModifiedOn;
  }

  public void setLastModifiedOn(OffsetDateTime lastModifiedOn) {
    this.lastModifiedOn = lastModifiedOn;
  }

  public DeploymentTemplateResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public DeploymentTemplateResource putLinksItem(String key, String linksItem) {
    if (this.links == null) {
      this.links = new HashMap<String, String>();
    }
    this.links.put(key, linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getLinks() {
    return links;
  }

  public void setLinks(Map<String, String> links) { this.links = links; }

  public DeploymentTemplateResource
  promoteTo(List<DeploymentPromotionTarget> promoteTo) {

    this.promoteTo = promoteTo;
    return this;
  }

  public DeploymentTemplateResource
  addPromoteToItem(DeploymentPromotionTarget promoteToItem) {
    if (this.promoteTo == null) {
      this.promoteTo = new ArrayList<DeploymentPromotionTarget>();
    }
    this.promoteTo.add(promoteToItem);
    return this;
  }

  /**
   * Get promoteTo
   * @return promoteTo
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DeploymentPromotionTarget> getPromoteTo() {
    return promoteTo;
  }

  public void setPromoteTo(List<DeploymentPromotionTarget> promoteTo) {
    this.promoteTo = promoteTo;
  }

  public DeploymentTemplateResource
  tenantPromotions(List<DeploymentPromomotionTenant> tenantPromotions) {

    this.tenantPromotions = tenantPromotions;
    return this;
  }

  public DeploymentTemplateResource
  addTenantPromotionsItem(DeploymentPromomotionTenant tenantPromotionsItem) {
    if (this.tenantPromotions == null) {
      this.tenantPromotions = new ArrayList<DeploymentPromomotionTenant>();
    }
    this.tenantPromotions.add(tenantPromotionsItem);
    return this;
  }

  /**
   * Get tenantPromotions
   * @return tenantPromotions
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DeploymentPromomotionTenant> getTenantPromotions() {
    return tenantPromotions;
  }

  public void
  setTenantPromotions(List<DeploymentPromomotionTenant> tenantPromotions) {
    this.tenantPromotions = tenantPromotions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentTemplateResource deploymentTemplateResource =
        (DeploymentTemplateResource)o;
    return Objects.equals(this.deploymentNotes,
                          deploymentTemplateResource.deploymentNotes) &&
        Objects.equals(this.id, deploymentTemplateResource.id) &&
        Objects.equals(
            this.isDeploymentProcessModified,
            deploymentTemplateResource.isDeploymentProcessModified) &&
        Objects.equals(
            this.isLibraryVariableSetModified,
            deploymentTemplateResource.isLibraryVariableSetModified) &&
        Objects.equals(this.isVariableSetModified,
                       deploymentTemplateResource.isVariableSetModified) &&
        Objects.equals(this.lastModifiedBy,
                       deploymentTemplateResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       deploymentTemplateResource.lastModifiedOn) &&
        Objects.equals(this.links, deploymentTemplateResource.links) &&
        Objects.equals(this.promoteTo, deploymentTemplateResource.promoteTo) &&
        Objects.equals(this.tenantPromotions,
                       deploymentTemplateResource.tenantPromotions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentNotes, id, isDeploymentProcessModified,
                        isLibraryVariableSetModified, isVariableSetModified,
                        lastModifiedBy, lastModifiedOn, links, promoteTo,
                        tenantPromotions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentTemplateResource {\n");
    sb.append("    deploymentNotes: ")
        .append(toIndentedString(deploymentNotes))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDeploymentProcessModified: ")
        .append(toIndentedString(isDeploymentProcessModified))
        .append("\n");
    sb.append("    isLibraryVariableSetModified: ")
        .append(toIndentedString(isLibraryVariableSetModified))
        .append("\n");
    sb.append("    isVariableSetModified: ")
        .append(toIndentedString(isVariableSetModified))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    promoteTo: ")
        .append(toIndentedString(promoteTo))
        .append("\n");
    sb.append("    tenantPromotions: ")
        .append(toIndentedString(tenantPromotions))
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
