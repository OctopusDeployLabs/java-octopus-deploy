// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.LicenseMessageDisposition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * LicenseLimitStatusResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class LicenseLimitStatusResource {
  public static final String SERIALIZED_NAME_CURRENT_USAGE = "CurrentUsage";
  @SerializedName(SERIALIZED_NAME_CURRENT_USAGE) private Integer currentUsage;

  public static final String SERIALIZED_NAME_DISPOSITION = "Disposition";
  @SerializedName(SERIALIZED_NAME_DISPOSITION)
  private LicenseMessageDisposition disposition;

  public static final String SERIALIZED_NAME_EFFECTIVE_LIMIT = "EffectiveLimit";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_LIMIT)
  private Integer effectiveLimit;

  public static final String SERIALIZED_NAME_EFFECTIVE_LIMIT_DESCRIPTION =
      "EffectiveLimitDescription";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_LIMIT_DESCRIPTION)
  private String effectiveLimitDescription;

  public static final String SERIALIZED_NAME_IS_UNLIMITED = "IsUnlimited";
  @SerializedName(SERIALIZED_NAME_IS_UNLIMITED) private Boolean isUnlimited;

  public static final String SERIALIZED_NAME_MESSAGE = "Message";
  @SerializedName(SERIALIZED_NAME_MESSAGE) private String message;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME) private String name;

  public LicenseLimitStatusResource currentUsage(Integer currentUsage) {

    this.currentUsage = currentUsage;
    return this;
  }

  /**
   * Get currentUsage
   * @return currentUsage
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCurrentUsage() {
    return currentUsage;
  }

  public void setCurrentUsage(Integer currentUsage) {
    this.currentUsage = currentUsage;
  }

  public LicenseLimitStatusResource
  disposition(LicenseMessageDisposition disposition) {

    this.disposition = disposition;
    return this;
  }

  /**
   * Get disposition
   * @return disposition
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LicenseMessageDisposition getDisposition() {
    return disposition;
  }

  public void setDisposition(LicenseMessageDisposition disposition) {
    this.disposition = disposition;
  }

  public LicenseLimitStatusResource effectiveLimit(Integer effectiveLimit) {

    this.effectiveLimit = effectiveLimit;
    return this;
  }

  /**
   * Get effectiveLimit
   * @return effectiveLimit
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEffectiveLimit() {
    return effectiveLimit;
  }

  public void setEffectiveLimit(Integer effectiveLimit) {
    this.effectiveLimit = effectiveLimit;
  }

  public LicenseLimitStatusResource
  effectiveLimitDescription(String effectiveLimitDescription) {

    this.effectiveLimitDescription = effectiveLimitDescription;
    return this;
  }

  /**
   * Get effectiveLimitDescription
   * @return effectiveLimitDescription
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEffectiveLimitDescription() {
    return effectiveLimitDescription;
  }

  public void setEffectiveLimitDescription(String effectiveLimitDescription) {
    this.effectiveLimitDescription = effectiveLimitDescription;
  }

  public LicenseLimitStatusResource isUnlimited(Boolean isUnlimited) {

    this.isUnlimited = isUnlimited;
    return this;
  }

  /**
   * Get isUnlimited
   * @return isUnlimited
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsUnlimited() {
    return isUnlimited;
  }

  public void setIsUnlimited(Boolean isUnlimited) {
    this.isUnlimited = isUnlimited;
  }

  public LicenseLimitStatusResource message(String message) {

    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) { this.message = message; }

  public LicenseLimitStatusResource name(String name) {

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseLimitStatusResource licenseLimitStatusResource =
        (LicenseLimitStatusResource)o;
    return Objects.equals(this.currentUsage,
                          licenseLimitStatusResource.currentUsage) &&
        Objects.equals(this.disposition,
                       licenseLimitStatusResource.disposition) &&
        Objects.equals(this.effectiveLimit,
                       licenseLimitStatusResource.effectiveLimit) &&
        Objects.equals(this.effectiveLimitDescription,
                       licenseLimitStatusResource.effectiveLimitDescription) &&
        Objects.equals(this.isUnlimited,
                       licenseLimitStatusResource.isUnlimited) &&
        Objects.equals(this.message, licenseLimitStatusResource.message) &&
        Objects.equals(this.name, licenseLimitStatusResource.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentUsage, disposition, effectiveLimit,
                        effectiveLimitDescription, isUnlimited, message, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseLimitStatusResource {\n");
    sb.append("    currentUsage: ")
        .append(toIndentedString(currentUsage))
        .append("\n");
    sb.append("    disposition: ")
        .append(toIndentedString(disposition))
        .append("\n");
    sb.append("    effectiveLimit: ")
        .append(toIndentedString(effectiveLimit))
        .append("\n");
    sb.append("    effectiveLimitDescription: ")
        .append(toIndentedString(effectiveLimitDescription))
        .append("\n");
    sb.append("    isUnlimited: ")
        .append(toIndentedString(isUnlimited))
        .append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
