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
 * LibraryVariableSetUsageEntry
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class LibraryVariableSetUsageEntry {
  public static final String SERIALIZED_NAME_LIBRARY_VARIABLE_SET_ID =
      "LibraryVariableSetId";
  @SerializedName(SERIALIZED_NAME_LIBRARY_VARIABLE_SET_ID)
  private String libraryVariableSetId;

  public static final String SERIALIZED_NAME_LIBRARY_VARIABLE_SET_NAME =
      "LibraryVariableSetName";
  @SerializedName(SERIALIZED_NAME_LIBRARY_VARIABLE_SET_NAME)
  private String libraryVariableSetName;

  public LibraryVariableSetUsageEntry
  libraryVariableSetId(String libraryVariableSetId) {

    this.libraryVariableSetId = libraryVariableSetId;
    return this;
  }

  /**
   * Get libraryVariableSetId
   * @return libraryVariableSetId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLibraryVariableSetId() {
    return libraryVariableSetId;
  }

  public void setLibraryVariableSetId(String libraryVariableSetId) {
    this.libraryVariableSetId = libraryVariableSetId;
  }

  public LibraryVariableSetUsageEntry
  libraryVariableSetName(String libraryVariableSetName) {

    this.libraryVariableSetName = libraryVariableSetName;
    return this;
  }

  /**
   * Get libraryVariableSetName
   * @return libraryVariableSetName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLibraryVariableSetName() {
    return libraryVariableSetName;
  }

  public void setLibraryVariableSetName(String libraryVariableSetName) {
    this.libraryVariableSetName = libraryVariableSetName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryVariableSetUsageEntry libraryVariableSetUsageEntry =
        (LibraryVariableSetUsageEntry)o;
    return Objects.equals(this.libraryVariableSetId,
                          libraryVariableSetUsageEntry.libraryVariableSetId) &&
        Objects.equals(this.libraryVariableSetName,
                       libraryVariableSetUsageEntry.libraryVariableSetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(libraryVariableSetId, libraryVariableSetName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryVariableSetUsageEntry {\n");
    sb.append("    libraryVariableSetId: ")
        .append(toIndentedString(libraryVariableSetId))
        .append("\n");
    sb.append("    libraryVariableSetName: ")
        .append(toIndentedString(libraryVariableSetName))
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
