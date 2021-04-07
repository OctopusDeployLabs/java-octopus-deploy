// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.DeploymentActionCondition;
import com.octopus.client.model.DeploymentActionContainerResource;
import com.octopus.client.model.PackageReference;
import com.octopus.client.model.PropertyValueResource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.threeten.bp.OffsetDateTime;

/**
 * DeploymentActionResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class DeploymentActionResource {
  public static final String SERIALIZED_NAME_ACTION_TYPE = "ActionType";
  @SerializedName(SERIALIZED_NAME_ACTION_TYPE) private String actionType;

  public static final String
      SERIALIZED_NAME_CAN_BE_USED_FOR_PROJECT_VERSIONING =
          "CanBeUsedForProjectVersioning";
  @SerializedName(SERIALIZED_NAME_CAN_BE_USED_FOR_PROJECT_VERSIONING)
  private Boolean canBeUsedForProjectVersioning;

  public static final String SERIALIZED_NAME_CHANNELS = "Channels";
  @SerializedName(SERIALIZED_NAME_CHANNELS) private Set<String> channels = null;

  public static final String SERIALIZED_NAME_CONDITION = "Condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  private DeploymentActionCondition condition;

  public static final String SERIALIZED_NAME_CONTAINER = "Container";
  @SerializedName(SERIALIZED_NAME_CONTAINER)
  private DeploymentActionContainerResource container;

  public static final String SERIALIZED_NAME_ENVIRONMENTS = "Environments";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENTS)
  private Set<String> environments = null;

  public static final String SERIALIZED_NAME_EXCLUDED_ENVIRONMENTS =
      "ExcludedEnvironments";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_ENVIRONMENTS)
  private Set<String> excludedEnvironments = null;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_IS_DISABLED = "IsDisabled";
  @SerializedName(SERIALIZED_NAME_IS_DISABLED) private Boolean isDisabled;

  public static final String SERIALIZED_NAME_IS_REQUIRED = "IsRequired";
  @SerializedName(SERIALIZED_NAME_IS_REQUIRED) private Boolean isRequired;

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

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_NOTES = "Notes";
  @SerializedName(SERIALIZED_NAME_NOTES) private String notes;

  public static final String SERIALIZED_NAME_PACKAGES = "Packages";
  @SerializedName(SERIALIZED_NAME_PACKAGES)
  private List<PackageReference> packages = null;

  public static final String SERIALIZED_NAME_PROPERTIES = "Properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, PropertyValueResource> properties = null;

  public static final String SERIALIZED_NAME_TENANT_TAGS = "TenantTags";
  @SerializedName(SERIALIZED_NAME_TENANT_TAGS)
  private Set<String> tenantTags = null;

  public static final String SERIALIZED_NAME_WORKER_POOL_ID = "WorkerPoolId";
  @SerializedName(SERIALIZED_NAME_WORKER_POOL_ID) private String workerPoolId;

  public static final String SERIALIZED_NAME_WORKER_POOL_VARIABLE =
      "WorkerPoolVariable";
  @SerializedName(SERIALIZED_NAME_WORKER_POOL_VARIABLE)
  private String workerPoolVariable;

  public DeploymentActionResource actionType(String actionType) {

    this.actionType = actionType;
    return this;
  }

  /**
   * Get actionType
   * @return actionType
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActionType() {
    return actionType;
  }

  public void setActionType(String actionType) { this.actionType = actionType; }

  public DeploymentActionResource
  canBeUsedForProjectVersioning(Boolean canBeUsedForProjectVersioning) {

    this.canBeUsedForProjectVersioning = canBeUsedForProjectVersioning;
    return this;
  }

  /**
   * Get canBeUsedForProjectVersioning
   * @return canBeUsedForProjectVersioning
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCanBeUsedForProjectVersioning() {
    return canBeUsedForProjectVersioning;
  }

  public void
  setCanBeUsedForProjectVersioning(Boolean canBeUsedForProjectVersioning) {
    this.canBeUsedForProjectVersioning = canBeUsedForProjectVersioning;
  }

  /**
   * Get channels
   * @return channels
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getChannels() {
    return channels;
  }

  public DeploymentActionResource
  condition(DeploymentActionCondition condition) {

    this.condition = condition;
    return this;
  }

  /**
   * Get condition
   * @return condition
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeploymentActionCondition getCondition() {
    return condition;
  }

  public void setCondition(DeploymentActionCondition condition) {
    this.condition = condition;
  }

  public DeploymentActionResource
  container(DeploymentActionContainerResource container) {

    this.container = container;
    return this;
  }

  /**
   * Get container
   * @return container
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeploymentActionContainerResource getContainer() {
    return container;
  }

  public void setContainer(DeploymentActionContainerResource container) {
    this.container = container;
  }

  /**
   * Get environments
   * @return environments
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getEnvironments() {
    return environments;
  }

  /**
   * Get excludedEnvironments
   * @return excludedEnvironments
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getExcludedEnvironments() {
    return excludedEnvironments;
  }

  public DeploymentActionResource id(String id) {

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

  public DeploymentActionResource isDisabled(Boolean isDisabled) {

    this.isDisabled = isDisabled;
    return this;
  }

  /**
   * Get isDisabled
   * @return isDisabled
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsDisabled() {
    return isDisabled;
  }

  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }

  public DeploymentActionResource isRequired(Boolean isRequired) {

    this.isRequired = isRequired;
    return this;
  }

  /**
   * Get isRequired
   * @return isRequired
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }

  public DeploymentActionResource lastModifiedBy(String lastModifiedBy) {

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

  public DeploymentActionResource
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

  public DeploymentActionResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public DeploymentActionResource putLinksItem(String key, String linksItem) {
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

  public DeploymentActionResource name(String name) {

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

  public DeploymentActionResource notes(String notes) {

    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) { this.notes = notes; }

  public DeploymentActionResource packages(List<PackageReference> packages) {

    this.packages = packages;
    return this;
  }

  public DeploymentActionResource
  addPackagesItem(PackageReference packagesItem) {
    if (this.packages == null) {
      this.packages = new ArrayList<PackageReference>();
    }
    this.packages.add(packagesItem);
    return this;
  }

  /**
   * Get packages
   * @return packages
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PackageReference> getPackages() {
    return packages;
  }

  public void setPackages(List<PackageReference> packages) {
    this.packages = packages;
  }

  /**
   * Get properties
   * @return properties
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, PropertyValueResource> getProperties() {
    return properties;
  }

  /**
   * Get tenantTags
   * @return tenantTags
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getTenantTags() {
    return tenantTags;
  }

  public DeploymentActionResource workerPoolId(String workerPoolId) {

    this.workerPoolId = workerPoolId;
    return this;
  }

  /**
   * Get workerPoolId
   * @return workerPoolId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWorkerPoolId() {
    return workerPoolId;
  }

  public void setWorkerPoolId(String workerPoolId) {
    this.workerPoolId = workerPoolId;
  }

  public DeploymentActionResource
  workerPoolVariable(String workerPoolVariable) {

    this.workerPoolVariable = workerPoolVariable;
    return this;
  }

  /**
   * Get workerPoolVariable
   * @return workerPoolVariable
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWorkerPoolVariable() {
    return workerPoolVariable;
  }

  public void setWorkerPoolVariable(String workerPoolVariable) {
    this.workerPoolVariable = workerPoolVariable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentActionResource deploymentActionResource =
        (DeploymentActionResource)o;
    return Objects.equals(this.actionType,
                          deploymentActionResource.actionType) &&
        Objects.equals(
            this.canBeUsedForProjectVersioning,
            deploymentActionResource.canBeUsedForProjectVersioning) &&
        Objects.equals(this.channels, deploymentActionResource.channels) &&
        Objects.equals(this.condition, deploymentActionResource.condition) &&
        Objects.equals(this.container, deploymentActionResource.container) &&
        Objects.equals(this.environments,
                       deploymentActionResource.environments) &&
        Objects.equals(this.excludedEnvironments,
                       deploymentActionResource.excludedEnvironments) &&
        Objects.equals(this.id, deploymentActionResource.id) &&
        Objects.equals(this.isDisabled, deploymentActionResource.isDisabled) &&
        Objects.equals(this.isRequired, deploymentActionResource.isRequired) &&
        Objects.equals(this.lastModifiedBy,
                       deploymentActionResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       deploymentActionResource.lastModifiedOn) &&
        Objects.equals(this.links, deploymentActionResource.links) &&
        Objects.equals(this.name, deploymentActionResource.name) &&
        Objects.equals(this.notes, deploymentActionResource.notes) &&
        Objects.equals(this.packages, deploymentActionResource.packages) &&
        Objects.equals(this.properties, deploymentActionResource.properties) &&
        Objects.equals(this.tenantTags, deploymentActionResource.tenantTags) &&
        Objects.equals(this.workerPoolId,
                       deploymentActionResource.workerPoolId) &&
        Objects.equals(this.workerPoolVariable,
                       deploymentActionResource.workerPoolVariable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actionType, canBeUsedForProjectVersioning, channels, condition,
        container, environments, excludedEnvironments, id, isDisabled,
        isRequired, lastModifiedBy, lastModifiedOn, links, name, notes,
        packages, properties, tenantTags, workerPoolId, workerPoolVariable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentActionResource {\n");
    sb.append("    actionType: ")
        .append(toIndentedString(actionType))
        .append("\n");
    sb.append("    canBeUsedForProjectVersioning: ")
        .append(toIndentedString(canBeUsedForProjectVersioning))
        .append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    condition: ")
        .append(toIndentedString(condition))
        .append("\n");
    sb.append("    container: ")
        .append(toIndentedString(container))
        .append("\n");
    sb.append("    environments: ")
        .append(toIndentedString(environments))
        .append("\n");
    sb.append("    excludedEnvironments: ")
        .append(toIndentedString(excludedEnvironments))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDisabled: ")
        .append(toIndentedString(isDisabled))
        .append("\n");
    sb.append("    isRequired: ")
        .append(toIndentedString(isRequired))
        .append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    properties: ")
        .append(toIndentedString(properties))
        .append("\n");
    sb.append("    tenantTags: ")
        .append(toIndentedString(tenantTags))
        .append("\n");
    sb.append("    workerPoolId: ")
        .append(toIndentedString(workerPoolId))
        .append("\n");
    sb.append("    workerPoolVariable: ")
        .append(toIndentedString(workerPoolVariable))
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
