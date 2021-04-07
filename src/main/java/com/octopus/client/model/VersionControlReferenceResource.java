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
 * VersionControlReferenceResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class VersionControlReferenceResource {
  public static final String SERIALIZED_NAME_GIT_COMMIT = "GitCommit";
  @SerializedName(SERIALIZED_NAME_GIT_COMMIT) private String gitCommit;

  public static final String SERIALIZED_NAME_GIT_REF = "GitRef";
  @SerializedName(SERIALIZED_NAME_GIT_REF) private String gitRef;

  public VersionControlReferenceResource gitCommit(String gitCommit) {

    this.gitCommit = gitCommit;
    return this;
  }

  /**
   * Get gitCommit
   * @return gitCommit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGitCommit() {
    return gitCommit;
  }

  public void setGitCommit(String gitCommit) { this.gitCommit = gitCommit; }

  public VersionControlReferenceResource gitRef(String gitRef) {

    this.gitRef = gitRef;
    return this;
  }

  /**
   * Get gitRef
   * @return gitRef
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGitRef() {
    return gitRef;
  }

  public void setGitRef(String gitRef) { this.gitRef = gitRef; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionControlReferenceResource versionControlReferenceResource =
        (VersionControlReferenceResource)o;
    return Objects.equals(this.gitCommit,
                          versionControlReferenceResource.gitCommit) &&
        Objects.equals(this.gitRef, versionControlReferenceResource.gitRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gitCommit, gitRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionControlReferenceResource {\n");
    sb.append("    gitCommit: ")
        .append(toIndentedString(gitCommit))
        .append("\n");
    sb.append("    gitRef: ").append(toIndentedString(gitRef)).append("\n");
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
