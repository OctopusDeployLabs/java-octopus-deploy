// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.Era;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * CalendarSystem
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class CalendarSystem {
  public static final String SERIALIZED_NAME_ERAS = "Eras";
  @SerializedName(SERIALIZED_NAME_ERAS) private List<Era> eras = null;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID) private String id;

  public static final String SERIALIZED_NAME_MAX_YEAR = "MaxYear";
  @SerializedName(SERIALIZED_NAME_MAX_YEAR) private Integer maxYear;

  public static final String SERIALIZED_NAME_MIN_YEAR = "MinYear";
  @SerializedName(SERIALIZED_NAME_MIN_YEAR) private Integer minYear;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  /**
   * Get eras
   * @return eras
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Era> getEras() {
    return eras;
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

  /**
   * Get maxYear
   * @return maxYear
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxYear() {
    return maxYear;
  }

  /**
   * Get minYear
   * @return minYear
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMinYear() {
    return minYear;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarSystem calendarSystem = (CalendarSystem)o;
    return Objects.equals(this.eras, calendarSystem.eras) &&
        Objects.equals(this.id, calendarSystem.id) &&
        Objects.equals(this.maxYear, calendarSystem.maxYear) &&
        Objects.equals(this.minYear, calendarSystem.minYear) &&
        Objects.equals(this.name, calendarSystem.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eras, id, maxYear, minYear, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarSystem {\n");
    sb.append("    eras: ").append(toIndentedString(eras)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxYear: ").append(toIndentedString(maxYear)).append("\n");
    sb.append("    minYear: ").append(toIndentedString(minYear)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
