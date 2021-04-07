// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.DeploymentTargetResource;
import com.octopus.client.model.LibraryVariableSetResource;
import com.octopus.client.model.ProjectResource;
import com.octopus.client.model.TenantResource;
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
 * CertificateUsageResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class CertificateUsageResource {
  public static final String SERIALIZED_NAME_DEPLOYMENT_TARGET_USAGES =
      "DeploymentTargetUsages";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_TARGET_USAGES)
  private List<DeploymentTargetResource> deploymentTargetUsages = null;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_BY =
      "LastModifiedBy";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_BY)
  private String lastModifiedBy;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_ON =
      "LastModifiedOn";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_ON)
  private OffsetDateTime lastModifiedOn;

  public static final String SERIALIZED_NAME_LIBRARY_VARIABLE_SET_USAGES =
      "LibraryVariableSetUsages";
  @SerializedName(SERIALIZED_NAME_LIBRARY_VARIABLE_SET_USAGES)
  private List<LibraryVariableSetResource> libraryVariableSetUsages = null;

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_PROJECT_USAGES = "ProjectUsages";
  @SerializedName(SERIALIZED_NAME_PROJECT_USAGES)
  private List<ProjectResource> projectUsages = null;

  public static final String SERIALIZED_NAME_TENANT_USAGES = "TenantUsages";
  @SerializedName(SERIALIZED_NAME_TENANT_USAGES)
  private List<TenantResource> tenantUsages = null;

  public CertificateUsageResource deploymentTargetUsages(
      List<DeploymentTargetResource> deploymentTargetUsages) {

    this.deploymentTargetUsages = deploymentTargetUsages;
    return this;
  }

  public CertificateUsageResource addDeploymentTargetUsagesItem(
      DeploymentTargetResource deploymentTargetUsagesItem) {
    if (this.deploymentTargetUsages == null) {
      this.deploymentTargetUsages = new ArrayList<DeploymentTargetResource>();
    }
    this.deploymentTargetUsages.add(deploymentTargetUsagesItem);
    return this;
  }

  /**
   * Get deploymentTargetUsages
   * @return deploymentTargetUsages
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DeploymentTargetResource> getDeploymentTargetUsages() {
    return deploymentTargetUsages;
  }

  public void setDeploymentTargetUsages(
      List<DeploymentTargetResource> deploymentTargetUsages) {
    this.deploymentTargetUsages = deploymentTargetUsages;
  }

  public CertificateUsageResource id(String id) {

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

  public CertificateUsageResource lastModifiedBy(String lastModifiedBy) {

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

  public CertificateUsageResource
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

  public CertificateUsageResource libraryVariableSetUsages(
      List<LibraryVariableSetResource> libraryVariableSetUsages) {

    this.libraryVariableSetUsages = libraryVariableSetUsages;
    return this;
  }

  public CertificateUsageResource addLibraryVariableSetUsagesItem(
      LibraryVariableSetResource libraryVariableSetUsagesItem) {
    if (this.libraryVariableSetUsages == null) {
      this.libraryVariableSetUsages =
          new ArrayList<LibraryVariableSetResource>();
    }
    this.libraryVariableSetUsages.add(libraryVariableSetUsagesItem);
    return this;
  }

  /**
   * Get libraryVariableSetUsages
   * @return libraryVariableSetUsages
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<LibraryVariableSetResource> getLibraryVariableSetUsages() {
    return libraryVariableSetUsages;
  }

  public void setLibraryVariableSetUsages(
      List<LibraryVariableSetResource> libraryVariableSetUsages) {
    this.libraryVariableSetUsages = libraryVariableSetUsages;
  }

  public CertificateUsageResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public CertificateUsageResource putLinksItem(String key, String linksItem) {
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

  public CertificateUsageResource
  projectUsages(List<ProjectResource> projectUsages) {

    this.projectUsages = projectUsages;
    return this;
  }

  public CertificateUsageResource
  addProjectUsagesItem(ProjectResource projectUsagesItem) {
    if (this.projectUsages == null) {
      this.projectUsages = new ArrayList<ProjectResource>();
    }
    this.projectUsages.add(projectUsagesItem);
    return this;
  }

  /**
   * Get projectUsages
   * @return projectUsages
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ProjectResource> getProjectUsages() {
    return projectUsages;
  }

  public void setProjectUsages(List<ProjectResource> projectUsages) {
    this.projectUsages = projectUsages;
  }

  public CertificateUsageResource
  tenantUsages(List<TenantResource> tenantUsages) {

    this.tenantUsages = tenantUsages;
    return this;
  }

  public CertificateUsageResource
  addTenantUsagesItem(TenantResource tenantUsagesItem) {
    if (this.tenantUsages == null) {
      this.tenantUsages = new ArrayList<TenantResource>();
    }
    this.tenantUsages.add(tenantUsagesItem);
    return this;
  }

  /**
   * Get tenantUsages
   * @return tenantUsages
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TenantResource> getTenantUsages() {
    return tenantUsages;
  }

  public void setTenantUsages(List<TenantResource> tenantUsages) {
    this.tenantUsages = tenantUsages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateUsageResource certificateUsageResource =
        (CertificateUsageResource)o;
    return Objects.equals(this.deploymentTargetUsages,
                          certificateUsageResource.deploymentTargetUsages) &&
        Objects.equals(this.id, certificateUsageResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       certificateUsageResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       certificateUsageResource.lastModifiedOn) &&
        Objects.equals(this.libraryVariableSetUsages,
                       certificateUsageResource.libraryVariableSetUsages) &&
        Objects.equals(this.links, certificateUsageResource.links) &&
        Objects.equals(this.projectUsages,
                       certificateUsageResource.projectUsages) &&
        Objects.equals(this.tenantUsages,
                       certificateUsageResource.tenantUsages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentTargetUsages, id, lastModifiedBy,
                        lastModifiedOn, libraryVariableSetUsages, links,
                        projectUsages, tenantUsages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateUsageResource {\n");
    sb.append("    deploymentTargetUsages: ")
        .append(toIndentedString(deploymentTargetUsages))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    libraryVariableSetUsages: ")
        .append(toIndentedString(libraryVariableSetUsages))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    projectUsages: ")
        .append(toIndentedString(projectUsages))
        .append("\n");
    sb.append("    tenantUsages: ")
        .append(toIndentedString(tenantUsages))
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
