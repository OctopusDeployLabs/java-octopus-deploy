// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ChannelResource;
import com.octopus.client.model.DashboardItemResource;
import com.octopus.client.model.ReleaseResource;
import com.octopus.client.model.RetentionPeriod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * ReleaseProgressionResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ReleaseProgressionResource {
  public static final String SERIALIZED_NAME_CHANNEL = "Channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL) private ChannelResource channel;

  public static final String SERIALIZED_NAME_DEPLOYMENTS = "Deployments";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENTS)
  private Map<String, List<DashboardItemResource>> deployments = null;

  public static final String SERIALIZED_NAME_HAS_UNRESOLVED_DEFECT =
      "HasUnresolvedDefect";
  @SerializedName(SERIALIZED_NAME_HAS_UNRESOLVED_DEFECT)
  private Boolean hasUnresolvedDefect;

  public static final String SERIALIZED_NAME_NEXT_DEPLOYMENTS =
      "NextDeployments";
  @SerializedName(SERIALIZED_NAME_NEXT_DEPLOYMENTS)
  private Set<String> nextDeployments = null;

  public static final String SERIALIZED_NAME_RELEASE = "Release";
  @SerializedName(SERIALIZED_NAME_RELEASE) private ReleaseResource release;

  public static final String SERIALIZED_NAME_RELEASE_RETENTION_PERIOD =
      "ReleaseRetentionPeriod";
  @SerializedName(SERIALIZED_NAME_RELEASE_RETENTION_PERIOD)
  private RetentionPeriod releaseRetentionPeriod;

  public static final String SERIALIZED_NAME_TENTACLE_RETENTION_PERIOD =
      "TentacleRetentionPeriod";
  @SerializedName(SERIALIZED_NAME_TENTACLE_RETENTION_PERIOD)
  private RetentionPeriod tentacleRetentionPeriod;

  public ReleaseProgressionResource channel(ChannelResource channel) {

    this.channel = channel;
    return this;
  }

  /**
   * Get channel
   * @return channel
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ChannelResource getChannel() {
    return channel;
  }

  public void setChannel(ChannelResource channel) { this.channel = channel; }

  public ReleaseProgressionResource
  deployments(Map<String, List<DashboardItemResource>> deployments) {

    this.deployments = deployments;
    return this;
  }

  public ReleaseProgressionResource
  putDeploymentsItem(String key, List<DashboardItemResource> deploymentsItem) {
    if (this.deployments == null) {
      this.deployments = new HashMap<String, List<DashboardItemResource>>();
    }
    this.deployments.put(key, deploymentsItem);
    return this;
  }

  /**
   * Get deployments
   * @return deployments
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<DashboardItemResource>> getDeployments() {
    return deployments;
  }

  public void
  setDeployments(Map<String, List<DashboardItemResource>> deployments) {
    this.deployments = deployments;
  }

  public ReleaseProgressionResource
  hasUnresolvedDefect(Boolean hasUnresolvedDefect) {

    this.hasUnresolvedDefect = hasUnresolvedDefect;
    return this;
  }

  /**
   * Get hasUnresolvedDefect
   * @return hasUnresolvedDefect
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasUnresolvedDefect() {
    return hasUnresolvedDefect;
  }

  public void setHasUnresolvedDefect(Boolean hasUnresolvedDefect) {
    this.hasUnresolvedDefect = hasUnresolvedDefect;
  }

  public ReleaseProgressionResource
  nextDeployments(Set<String> nextDeployments) {

    this.nextDeployments = nextDeployments;
    return this;
  }

  public ReleaseProgressionResource
  addNextDeploymentsItem(String nextDeploymentsItem) {
    if (this.nextDeployments == null) {
      this.nextDeployments = new LinkedHashSet<String>();
    }
    this.nextDeployments.add(nextDeploymentsItem);
    return this;
  }

  /**
   * Get nextDeployments
   * @return nextDeployments
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getNextDeployments() {
    return nextDeployments;
  }

  public void setNextDeployments(Set<String> nextDeployments) {
    this.nextDeployments = nextDeployments;
  }

  public ReleaseProgressionResource release(ReleaseResource release) {

    this.release = release;
    return this;
  }

  /**
   * Get release
   * @return release
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReleaseResource getRelease() {
    return release;
  }

  public void setRelease(ReleaseResource release) { this.release = release; }

  public ReleaseProgressionResource
  releaseRetentionPeriod(RetentionPeriod releaseRetentionPeriod) {

    this.releaseRetentionPeriod = releaseRetentionPeriod;
    return this;
  }

  /**
   * Get releaseRetentionPeriod
   * @return releaseRetentionPeriod
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RetentionPeriod getReleaseRetentionPeriod() {
    return releaseRetentionPeriod;
  }

  public void
  setReleaseRetentionPeriod(RetentionPeriod releaseRetentionPeriod) {
    this.releaseRetentionPeriod = releaseRetentionPeriod;
  }

  public ReleaseProgressionResource
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseProgressionResource releaseProgressionResource =
        (ReleaseProgressionResource)o;
    return Objects.equals(this.channel, releaseProgressionResource.channel) &&
        Objects.equals(this.deployments,
                       releaseProgressionResource.deployments) &&
        Objects.equals(this.hasUnresolvedDefect,
                       releaseProgressionResource.hasUnresolvedDefect) &&
        Objects.equals(this.nextDeployments,
                       releaseProgressionResource.nextDeployments) &&
        Objects.equals(this.release, releaseProgressionResource.release) &&
        Objects.equals(this.releaseRetentionPeriod,
                       releaseProgressionResource.releaseRetentionPeriod) &&
        Objects.equals(this.tentacleRetentionPeriod,
                       releaseProgressionResource.tentacleRetentionPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel, deployments, hasUnresolvedDefect,
                        nextDeployments, release, releaseRetentionPeriod,
                        tentacleRetentionPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseProgressionResource {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    deployments: ")
        .append(toIndentedString(deployments))
        .append("\n");
    sb.append("    hasUnresolvedDefect: ")
        .append(toIndentedString(hasUnresolvedDefect))
        .append("\n");
    sb.append("    nextDeployments: ")
        .append(toIndentedString(nextDeployments))
        .append("\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
    sb.append("    releaseRetentionPeriod: ")
        .append(toIndentedString(releaseRetentionPeriod))
        .append("\n");
    sb.append("    tentacleRetentionPeriod: ")
        .append(toIndentedString(tentacleRetentionPeriod))
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
