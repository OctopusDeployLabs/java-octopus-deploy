// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.LibraryVariableSetProjectUsage;
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
 * LibraryVariableSetUsageResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class LibraryVariableSetUsageResource {
  public static final String SERIALIZED_NAME_COUNT_OF_PROJECTS_USER_CANNOT_SEE =
      "CountOfProjectsUserCannotSee";
  @SerializedName(SERIALIZED_NAME_COUNT_OF_PROJECTS_USER_CANNOT_SEE)
  private Integer countOfProjectsUserCannotSee;

  public static final String SERIALIZED_NAME_COUNT_OF_RELEASES_USER_CANNOT_SEE =
      "CountOfReleasesUserCannotSee";
  @SerializedName(SERIALIZED_NAME_COUNT_OF_RELEASES_USER_CANNOT_SEE)
  private Integer countOfReleasesUserCannotSee;

  public static final String
      SERIALIZED_NAME_COUNT_OF_RUNBOOK_SNAPSHOTS_USER_CANNOT_SEE =
          "CountOfRunbookSnapshotsUserCannotSee";
  @SerializedName(SERIALIZED_NAME_COUNT_OF_RUNBOOK_SNAPSHOTS_USER_CANNOT_SEE)
  private Integer countOfRunbookSnapshotsUserCannotSee;

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

  public static final String SERIALIZED_NAME_PROJECTS = "Projects";
  @SerializedName(SERIALIZED_NAME_PROJECTS)
  private List<LibraryVariableSetProjectUsage> projects = null;

  public LibraryVariableSetUsageResource
  countOfProjectsUserCannotSee(Integer countOfProjectsUserCannotSee) {

    this.countOfProjectsUserCannotSee = countOfProjectsUserCannotSee;
    return this;
  }

  /**
   * Get countOfProjectsUserCannotSee
   * @return countOfProjectsUserCannotSee
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCountOfProjectsUserCannotSee() {
    return countOfProjectsUserCannotSee;
  }

  public void
  setCountOfProjectsUserCannotSee(Integer countOfProjectsUserCannotSee) {
    this.countOfProjectsUserCannotSee = countOfProjectsUserCannotSee;
  }

  public LibraryVariableSetUsageResource
  countOfReleasesUserCannotSee(Integer countOfReleasesUserCannotSee) {

    this.countOfReleasesUserCannotSee = countOfReleasesUserCannotSee;
    return this;
  }

  /**
   * Get countOfReleasesUserCannotSee
   * @return countOfReleasesUserCannotSee
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCountOfReleasesUserCannotSee() {
    return countOfReleasesUserCannotSee;
  }

  public void
  setCountOfReleasesUserCannotSee(Integer countOfReleasesUserCannotSee) {
    this.countOfReleasesUserCannotSee = countOfReleasesUserCannotSee;
  }

  public LibraryVariableSetUsageResource countOfRunbookSnapshotsUserCannotSee(
      Integer countOfRunbookSnapshotsUserCannotSee) {

    this.countOfRunbookSnapshotsUserCannotSee =
        countOfRunbookSnapshotsUserCannotSee;
    return this;
  }

  /**
   * Get countOfRunbookSnapshotsUserCannotSee
   * @return countOfRunbookSnapshotsUserCannotSee
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCountOfRunbookSnapshotsUserCannotSee() {
    return countOfRunbookSnapshotsUserCannotSee;
  }

  public void setCountOfRunbookSnapshotsUserCannotSee(
      Integer countOfRunbookSnapshotsUserCannotSee) {
    this.countOfRunbookSnapshotsUserCannotSee =
        countOfRunbookSnapshotsUserCannotSee;
  }

  public LibraryVariableSetUsageResource id(String id) {

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

  public LibraryVariableSetUsageResource lastModifiedBy(String lastModifiedBy) {

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

  public LibraryVariableSetUsageResource
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

  public LibraryVariableSetUsageResource links(Map<String, String> links) {

    this.links = links;
    return this;
  }

  public LibraryVariableSetUsageResource putLinksItem(String key,
                                                      String linksItem) {
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

  public LibraryVariableSetUsageResource
  projects(List<LibraryVariableSetProjectUsage> projects) {

    this.projects = projects;
    return this;
  }

  public LibraryVariableSetUsageResource
  addProjectsItem(LibraryVariableSetProjectUsage projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<LibraryVariableSetProjectUsage>();
    }
    this.projects.add(projectsItem);
    return this;
  }

  /**
   * Get projects
   * @return projects
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<LibraryVariableSetProjectUsage> getProjects() {
    return projects;
  }

  public void setProjects(List<LibraryVariableSetProjectUsage> projects) {
    this.projects = projects;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryVariableSetUsageResource libraryVariableSetUsageResource =
        (LibraryVariableSetUsageResource)o;
    return Objects.equals(
               this.countOfProjectsUserCannotSee,
               libraryVariableSetUsageResource.countOfProjectsUserCannotSee) &&
        Objects.equals(
            this.countOfReleasesUserCannotSee,
            libraryVariableSetUsageResource.countOfReleasesUserCannotSee) &&
        Objects.equals(this.countOfRunbookSnapshotsUserCannotSee,
                       libraryVariableSetUsageResource
                           .countOfRunbookSnapshotsUserCannotSee) &&
        Objects.equals(this.id, libraryVariableSetUsageResource.id) &&
        Objects.equals(this.lastModifiedBy,
                       libraryVariableSetUsageResource.lastModifiedBy) &&
        Objects.equals(this.lastModifiedOn,
                       libraryVariableSetUsageResource.lastModifiedOn) &&
        Objects.equals(this.links, libraryVariableSetUsageResource.links) &&
        Objects.equals(this.projects, libraryVariableSetUsageResource.projects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countOfProjectsUserCannotSee,
                        countOfReleasesUserCannotSee,
                        countOfRunbookSnapshotsUserCannotSee, id,
                        lastModifiedBy, lastModifiedOn, links, projects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryVariableSetUsageResource {\n");
    sb.append("    countOfProjectsUserCannotSee: ")
        .append(toIndentedString(countOfProjectsUserCannotSee))
        .append("\n");
    sb.append("    countOfReleasesUserCannotSee: ")
        .append(toIndentedString(countOfReleasesUserCannotSee))
        .append("\n");
    sb.append("    countOfRunbookSnapshotsUserCannotSee: ")
        .append(toIndentedString(countOfRunbookSnapshotsUserCannotSee))
        .append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ")
        .append(toIndentedString(lastModifiedBy))
        .append("\n");
    sb.append("    lastModifiedOn: ")
        .append(toIndentedString(lastModifiedOn))
        .append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
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
