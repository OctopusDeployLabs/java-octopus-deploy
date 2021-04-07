// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ReleaseChanges;
import com.octopus.client.model.RetentionPeriod;
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
 * DeploymentResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class DeploymentResource {
  public static final String SERIALIZED_NAME_CHANGES = "Changes";
  @SerializedName(SERIALIZED_NAME_CHANGES)
  private List<ReleaseChanges> changes = null;

  public static final String SERIALIZED_NAME_CHANGES_MARKDOWN =
      "ChangesMarkdown";
  @SerializedName(SERIALIZED_NAME_CHANGES_MARKDOWN)
  private String changesMarkdown;

  public static final String SERIALIZED_NAME_CHANNEL_ID = "ChannelId";
  @SerializedName(SERIALIZED_NAME_CHANNEL_ID) private String channelId;

  public static final String SERIALIZED_NAME_COMMENTS = "Comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS) private String comments;

  public static final String SERIALIZED_NAME_CREATED = "Created";
  @SerializedName(SERIALIZED_NAME_CREATED) private OffsetDateTime created;

  public static final String SERIALIZED_NAME_DEPLOYED_BY = "DeployedBy";
  @SerializedName(SERIALIZED_NAME_DEPLOYED_BY) private String deployedBy;

  public static final String SERIALIZED_NAME_DEPLOYED_BY_ID = "DeployedById";
  @SerializedName(SERIALIZED_NAME_DEPLOYED_BY_ID) private String deployedById;

  public static final String SERIALIZED_NAME_DEPLOYED_TO_MACHINE_IDS =
      "DeployedToMachineIds";
  @SerializedName(SERIALIZED_NAME_DEPLOYED_TO_MACHINE_IDS)
  private Set<String> deployedToMachineIds = null;

  public static final String SERIALIZED_NAME_DEPLOYMENT_PROCESS_ID =
      "DeploymentProcessId";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_PROCESS_ID)
  private String deploymentProcessId;

  public static final String SERIALIZED_NAME_ENVIRONMENT_ID = "EnvironmentId";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT_ID) private String environmentId;

  public static final String SERIALIZED_NAME_EXCLUDED_MACHINE_IDS =
      "ExcludedMachineIds";
  @SerializedName(SERIALIZED_NAME_EXCLUDED_MACHINE_IDS)
  private Set<String> excludedMachineIds = null;

  public static final String SERIALIZED_NAME_FAILURE_ENCOUNTERED =
      "FailureEncountered";
  @SerializedName(SERIALIZED_NAME_FAILURE_ENCOUNTERED)
  private Boolean failureEncountered;

  public static final String SERIALIZED_NAME_FORCE_PACKAGE_DOWNLOAD =
      "ForcePackageDownload";
  @SerializedName(SERIALIZED_NAME_FORCE_PACKAGE_DOWNLOAD)
  private Boolean forcePackageDownload;

  public static final String SERIALIZED_NAME_FORCE_PACKAGE_REDEPLOYMENT =
      "ForcePackageRedeployment";
  @SerializedName(SERIALIZED_NAME_FORCE_PACKAGE_REDEPLOYMENT)
  private Boolean forcePackageRedeployment;

  public static final String SERIALIZED_NAME_FORM_VALUES = "FormValues";
  @SerializedName(SERIALIZED_NAME_FORM_VALUES)
  private Map<String, String> formValues = null;

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

  public static final String SERIALIZED_NAME_LINKS = "Links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Map<String, String> links = null;

  public static final String SERIALIZED_NAME_MANIFEST_VARIABLE_SET_ID =
      "ManifestVariableSetId";
  @SerializedName(SERIALIZED_NAME_MANIFEST_VARIABLE_SET_ID)
  private String manifestVariableSetId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public static final String SERIALIZED_NAME_PROJECT_ID = "ProjectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID) private String projectId;

  public static final String SERIALIZED_NAME_QUEUE_TIME = "QueueTime";
  @SerializedName(SERIALIZED_NAME_QUEUE_TIME) private OffsetDateTime queueTime;

  public static final String SERIALIZED_NAME_QUEUE_TIME_EXPIRY =
      "QueueTimeExpiry";
  @SerializedName(SERIALIZED_NAME_QUEUE_TIME_EXPIRY)
  private OffsetDateTime queueTimeExpiry;

  public static final String SERIALIZED_NAME_RELEASE_ID = "ReleaseId";
  @SerializedName(SERIALIZED_NAME_RELEASE_ID) private String releaseId;

  public static final String SERIALIZED_NAME_SKIP_ACTIONS = "SkipActions";
  @SerializedName(SERIALIZED_NAME_SKIP_ACTIONS)
  private Set<String> skipActions = null;

  public static final String SERIALIZED_NAME_SPACE_ID = "SpaceId";
  @SerializedName(SERIALIZED_NAME_SPACE_ID) private String spaceId;

  public static final String SERIALIZED_NAME_SPECIFIC_MACHINE_IDS =
      "SpecificMachineIds";
  @SerializedName(SERIALIZED_NAME_SPECIFIC_MACHINE_IDS)
  private Set<String> specificMachineIds = null;

  public static final String SERIALIZED_NAME_TASK_ID = "TaskId";
  @SerializedName(SERIALIZED_NAME_TASK_ID) private String taskId;

  public static final String SERIALIZED_NAME_TENANT_ID = "TenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID) private String tenantId;

  public static final String SERIALIZED_NAME_TENTACLE_RETENTION_PERIOD =
      "TentacleRetentionPeriod";
  @SerializedName(SERIALIZED_NAME_TENTACLE_RETENTION_PERIOD)
  private RetentionPeriod tentacleRetentionPeriod;

  public static final String SERIALIZED_NAME_USE_GUIDED_FAILURE =
      "UseGuidedFailure";
  @SerializedName(SERIALIZED_NAME_USE_GUIDED_FAILURE)
  private Boolean useGuidedFailure;

  public DeploymentResource changes(List<ReleaseChanges> changes) {

    this.changes = changes;
    return this;
  }

  public DeploymentResource addChangesItem(ReleaseChanges changesItem) {
    if (this.changes == null) {
      this.changes = new ArrayList<ReleaseChanges>();
    }
    this.changes.add(changesItem);
    return this;
  }

  /**
   * Get changes
   * @return changes
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ReleaseChanges> getChanges() {
    return changes;
  }

  public void setChanges(List<ReleaseChanges> changes) {
    this.changes = changes;
  }

  public DeploymentResource changesMarkdown(String changesMarkdown) {

    this.changesMarkdown = changesMarkdown;
    return this;
  }

  /**
   * Get changesMarkdown
   * @return changesMarkdown
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChangesMarkdown() {
    return changesMarkdown;
  }

  public void setChangesMarkdown(String changesMarkdown) {
    this.changesMarkdown = changesMarkdown;
  }

  public DeploymentResource channelId(String channelId) {

    this.channelId = channelId;
    return this;
  }

  /**
   * Get channelId
   * @return channelId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) { this.channelId = channelId; }

  public DeploymentResource comments(String comments) {

    this.comments = comments;
    return this;
  }

  /**
   * Get comments
   * @return comments
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComments() {
    return comments;
  }

  public void setComments(String comments) { this.comments = comments; }

  public DeploymentResource created(OffsetDateTime created) {

    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) { this.created = created; }

  public DeploymentResource deployedBy(String deployedBy) {

    this.deployedBy = deployedBy;
    return this;
  }

  /**
   * Get deployedBy
   * @return deployedBy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeployedBy() {
    return deployedBy;
  }

  public void setDeployedBy(String deployedBy) { this.deployedBy = deployedBy; }

  public DeploymentResource deployedById(String deployedById) {

    this.deployedById = deployedById;
    return this;
  }

  /**
   * Get deployedById
   * @return deployedById
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeployedById() {
    return deployedById;
  }

  public void setDeployedById(String deployedById) {
    this.deployedById = deployedById;
  }

  public DeploymentResource
  deployedToMachineIds(Set<String> deployedToMachineIds) {

    this.deployedToMachineIds = deployedToMachineIds;
    return this;
  }

  public DeploymentResource
  addDeployedToMachineIdsItem(String deployedToMachineIdsItem) {
    if (this.deployedToMachineIds == null) {
      this.deployedToMachineIds = new LinkedHashSet<String>();
    }
    this.deployedToMachineIds.add(deployedToMachineIdsItem);
    return this;
  }

  /**
   * Get deployedToMachineIds
   * @return deployedToMachineIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getDeployedToMachineIds() {
    return deployedToMachineIds;
  }

  public void setDeployedToMachineIds(Set<String> deployedToMachineIds) {
    this.deployedToMachineIds = deployedToMachineIds;
  }

  public DeploymentResource deploymentProcessId(String deploymentProcessId) {

    this.deploymentProcessId = deploymentProcessId;
    return this;
  }

  /**
   * Get deploymentProcessId
   * @return deploymentProcessId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeploymentProcessId() {
    return deploymentProcessId;
  }

  public void setDeploymentProcessId(String deploymentProcessId) {
    this.deploymentProcessId = deploymentProcessId;
  }

  public DeploymentResource environmentId(String environmentId) {

    this.environmentId = environmentId;
    return this;
  }

  /**
   * Get environmentId
   * @return environmentId
   **/
  @ApiModelProperty(required = true, value = "")

  public String getEnvironmentId() {
    return environmentId;
  }

  public void setEnvironmentId(String environmentId) {
    this.environmentId = environmentId;
  }

  public DeploymentResource excludedMachineIds(Set<String> excludedMachineIds) {

    this.excludedMachineIds = excludedMachineIds;
    return this;
  }

  public DeploymentResource
  addExcludedMachineIdsItem(String excludedMachineIdsItem) {
    if (this.excludedMachineIds == null) {
      this.excludedMachineIds = new LinkedHashSet<String>();
    }
    this.excludedMachineIds.add(excludedMachineIdsItem);
    return this;
  }

  /**
   * Get excludedMachineIds
   * @return excludedMachineIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getExcludedMachineIds() {
    return excludedMachineIds;
  }

  public void setExcludedMachineIds(Set<String> excludedMachineIds) {
    this.excludedMachineIds = excludedMachineIds;
  }

  public DeploymentResource failureEncountered(Boolean failureEncountered) {

    this.failureEncountered = failureEncountered;
    return this;
  }

  /**
   * Get failureEncountered
   * @return failureEncountered
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getFailureEncountered() {
    return failureEncountered;
  }

  public void setFailureEncountered(Boolean failureEncountered) {
    this.failureEncountered = failureEncountered;
  }

  public DeploymentResource forcePackageDownload(Boolean forcePackageDownload) {

    this.forcePackageDownload = forcePackageDownload;
    return this;
  }

  /**
   * Get forcePackageDownload
   * @return forcePackageDownload
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getForcePackageDownload() {
    return forcePackageDownload;
  }

  public void setForcePackageDownload(Boolean forcePackageDownload) {
    this.forcePackageDownload = forcePackageDownload;
  }

  public DeploymentResource
  forcePackageRedeployment(Boolean forcePackageRedeployment) {

    this.forcePackageRedeployment = forcePackageRedeployment;
    return this;
  }

  /**
   * Get forcePackageRedeployment
   * @return forcePackageRedeployment
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getForcePackageRedeployment() {
    return forcePackageRedeployment;
  }

  public void setForcePackageRedeployment(Boolean forcePackageRedeployment) {
    this.forcePackageRedeployment = forcePackageRedeployment;
  }

  public DeploymentResource formValues(Map<String, String> formValues) {

    this.formValues = formValues;
    return this;
  }

  public DeploymentResource putFormValuesItem(String key,
                                              String formValuesItem) {
    if (this.formValues == null) {
      this.formValues = new HashMap<String, String>();
    }
    this.formValues.put(key, formValuesItem);
    return this;
  }

  /**
   * Get formValues
   * @return formValues
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getFormValues() {
    return formValues;
  }

  public void setFormValues(Map<String, String> formValues) {
    this.formValues = formValues;
  }

  public DeploymentResource id(String id) {

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

  public DeploymentResource lastModifiedBy(String lastModifiedBy) {

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

  public DeploymentResource lastModifiedOn(OffsetDateTime lastModifiedOn) {

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

  public DeploymentResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public DeploymentResource putLinksItem(String key, String linksItem) {
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

  public DeploymentResource
  manifestVariableSetId(String manifestVariableSetId) {

    this.manifestVariableSetId = manifestVariableSetId;
    return this;
  }

  /**
   * Get manifestVariableSetId
   * @return manifestVariableSetId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManifestVariableSetId() {
    return manifestVariableSetId;
  }

  public void setManifestVariableSetId(String manifestVariableSetId) {
    this.manifestVariableSetId = manifestVariableSetId;
  }

  public DeploymentResource name(String name) {

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

  public DeploymentResource projectId(String projectId) {

    this.projectId = projectId;
    return this;
  }

  /**
   * Get projectId
   * @return projectId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) { this.projectId = projectId; }

  public DeploymentResource queueTime(OffsetDateTime queueTime) {

    this.queueTime = queueTime;
    return this;
  }

  /**
   * Get queueTime
   * @return queueTime
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getQueueTime() {
    return queueTime;
  }

  public void setQueueTime(OffsetDateTime queueTime) {
    this.queueTime = queueTime;
  }

  public DeploymentResource queueTimeExpiry(OffsetDateTime queueTimeExpiry) {

    this.queueTimeExpiry = queueTimeExpiry;
    return this;
  }

  /**
   * Get queueTimeExpiry
   * @return queueTimeExpiry
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getQueueTimeExpiry() {
    return queueTimeExpiry;
  }

  public void setQueueTimeExpiry(OffsetDateTime queueTimeExpiry) {
    this.queueTimeExpiry = queueTimeExpiry;
  }

  public DeploymentResource releaseId(String releaseId) {

    this.releaseId = releaseId;
    return this;
  }

  /**
   * Get releaseId
   * @return releaseId
   **/
  @ApiModelProperty(required = true, value = "")

  public String getReleaseId() {
    return releaseId;
  }

  public void setReleaseId(String releaseId) { this.releaseId = releaseId; }

  public DeploymentResource skipActions(Set<String> skipActions) {

    this.skipActions = skipActions;
    return this;
  }

  public DeploymentResource addSkipActionsItem(String skipActionsItem) {
    if (this.skipActions == null) {
      this.skipActions = new LinkedHashSet<String>();
    }
    this.skipActions.add(skipActionsItem);
    return this;
  }

  /**
   * Get skipActions
   * @return skipActions
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getSkipActions() {
    return skipActions;
  }

  public void setSkipActions(Set<String> skipActions) {
    this.skipActions = skipActions;
  }

  public DeploymentResource spaceId(String spaceId) {

    this.spaceId = spaceId;
    return this;
  }

  /**
   * Get spaceId
   * @return spaceId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSpaceId() {
    return spaceId;
  }

  public void setSpaceId(String spaceId) { this.spaceId = spaceId; }

  public DeploymentResource specificMachineIds(Set<String> specificMachineIds) {

    this.specificMachineIds = specificMachineIds;
    return this;
  }

  public DeploymentResource
  addSpecificMachineIdsItem(String specificMachineIdsItem) {
    if (this.specificMachineIds == null) {
      this.specificMachineIds = new LinkedHashSet<String>();
    }
    this.specificMachineIds.add(specificMachineIdsItem);
    return this;
  }

  /**
   * Get specificMachineIds
   * @return specificMachineIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getSpecificMachineIds() {
    return specificMachineIds;
  }

  public void setSpecificMachineIds(Set<String> specificMachineIds) {
    this.specificMachineIds = specificMachineIds;
  }

  public DeploymentResource taskId(String taskId) {

    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId
   * @return taskId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) { this.taskId = taskId; }

  public DeploymentResource tenantId(String tenantId) {

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

  public DeploymentResource
  tentacleRetentionPeriod(RetentionPeriod tentacleRetentionPeriod) {

    this.tentacleRetentionPeriod = tentacleRetentionPeriod;
    return this;
  }

  /**
   * Get tentacleRetentionPeriod
   * @return tentacleRetentionPeriod
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RetentionPeriod getTentacleRetentionPeriod() {
    return tentacleRetentionPeriod;
  }

  public void
  setTentacleRetentionPeriod(RetentionPeriod tentacleRetentionPeriod) {
    this.tentacleRetentionPeriod = tentacleRetentionPeriod;
  }

  public DeploymentResource useGuidedFailure(Boolean useGuidedFailure) {

    this.useGuidedFailure = useGuidedFailure;
    return this;
  }

  /**
   * Get useGuidedFailure
   * @return useGuidedFailure
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUseGuidedFailure() {
    return useGuidedFailure;
  }

  public void setUseGuidedFailure(Boolean useGuidedFailure) {
    this.useGuidedFailure = useGuidedFailure;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentResource deploymentResource = (DeploymentResource)o;
    return Objects.equals(this.changes, deploymentResource.changes) &&
        Objects.equals(this.changesMarkdown,
                       deploymentResource.changesMarkdown) &&
        Objects.equals(this.channelId, deploymentResource.channelId) &&
        Objects.equals(this.comments, deploymentResource.comments) &&
        Objects.equals(this.created, deploymentResource.created) &&
        Objects.equals(this.deployedBy, deploymentResource.deployedBy) &&
        Objects.equals(this.deployedById, deploymentResource.deployedById) &&
        Objects.equals(this.deployedToMachineIds,
                       deploymentResource.deployedToMachineIds) &&
        Objects.equals(this.deploymentProcessId,
                       deploymentResource.deploymentProcessId) &&
        Objects.equals(this.environmentId, deploymentResource.environmentId) &&
        Objects.equals(this.excludedMachineIds,
                       deploymentResource.excludedMachineIds) &&
        Objects.equals(this.failureEncountered,
                       deploymentResource.failureEncountered) &&
        Objects.equals(this.forcePackageDownload,
                       deploymentResource.forcePackageDownload) &&
        Objects.equals(this.forcePackageRedeployment,
                       deploymentResource.forcePackageRedeployment) &&
        Objects.equals(this.formValues, deploymentResource.formValues) &&
        Objects.equals(this.id, deploymentResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       deploymentResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       deploymentResource.lastModifiedOn) &&
        Objects.equals(this.links, deploymentResource.links) &&
        Objects.equals(this.manifestVariableSetId,
                       deploymentResource.manifestVariableSetId) &&
        Objects.equals(this.name, deploymentResource.name) &&
        Objects.equals(this.projectId, deploymentResource.projectId) &&
        Objects.equals(this.queueTime, deploymentResource.queueTime) &&
        Objects.equals(this.queueTimeExpiry,
                       deploymentResource.queueTimeExpiry) &&
        Objects.equals(this.releaseId, deploymentResource.releaseId) &&
        Objects.equals(this.skipActions, deploymentResource.skipActions) &&
        Objects.equals(this.spaceId, deploymentResource.spaceId) &&
        Objects.equals(this.specificMachineIds,
                       deploymentResource.specificMachineIds) &&
        Objects.equals(this.taskId, deploymentResource.taskId) &&
        Objects.equals(this.tenantId, deploymentResource.tenantId) &&
        Objects.equals(this.tentacleRetentionPeriod,
                       deploymentResource.tentacleRetentionPeriod) &&
        Objects.equals(this.useGuidedFailure,
                       deploymentResource.useGuidedFailure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        changes, changesMarkdown, channelId, comments, created, deployedBy,
        deployedById, deployedToMachineIds, deploymentProcessId, environmentId,
        excludedMachineIds, failureEncountered, forcePackageDownload,
        forcePackageRedeployment, formValues, id, lastModifiedBy,
        lastModifiedOn, links, manifestVariableSetId, name, projectId,
        queueTime, queueTimeExpiry, releaseId, skipActions, spaceId,
        specificMachineIds, taskId, tenantId, tentacleRetentionPeriod,
        useGuidedFailure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentResource {\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    changesMarkdown: ")
        .append(toIndentedString(changesMarkdown))
        .append("\n");
    sb.append("    channelId: ")
        .append(toIndentedString(channelId))
        .append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    deployedBy: ")
        .append(toIndentedString(deployedBy))
        .append("\n");
    sb.append("    deployedById: ")
        .append(toIndentedString(deployedById))
        .append("\n");
    sb.append("    deployedToMachineIds: ")
        .append(toIndentedString(deployedToMachineIds))
        .append("\n");
    sb.append("    deploymentProcessId: ")
        .append(toIndentedString(deploymentProcessId))
        .append("\n");
    sb.append("    environmentId: ")
        .append(toIndentedString(environmentId))
        .append("\n");
    sb.append("    excludedMachineIds: ")
        .append(toIndentedString(excludedMachineIds))
        .append("\n");
    sb.append("    failureEncountered: ")
        .append(toIndentedString(failureEncountered))
        .append("\n");
    sb.append("    forcePackageDownload: ")
        .append(toIndentedString(forcePackageDownload))
        .append("\n");
    sb.append("    forcePackageRedeployment: ")
        .append(toIndentedString(forcePackageRedeployment))
        .append("\n");
    sb.append("    formValues: ")
        .append(toIndentedString(formValues))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    manifestVariableSetId: ")
        .append(toIndentedString(manifestVariableSetId))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectId: ")
        .append(toIndentedString(projectId))
        .append("\n");
    sb.append("    queueTime: ")
        .append(toIndentedString(queueTime))
        .append("\n");
    sb.append("    queueTimeExpiry: ")
        .append(toIndentedString(queueTimeExpiry))
        .append("\n");
    sb.append("    releaseId: ")
        .append(toIndentedString(releaseId))
        .append("\n");
    sb.append("    skipActions: ")
        .append(toIndentedString(skipActions))
        .append("\n");
    sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
    sb.append("    specificMachineIds: ")
        .append(toIndentedString(specificMachineIds))
        .append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tentacleRetentionPeriod: ")
        .append(toIndentedString(tentacleRetentionPeriod))
        .append("\n");
    sb.append("    useGuidedFailure: ")
        .append(toIndentedString(useGuidedFailure))
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
