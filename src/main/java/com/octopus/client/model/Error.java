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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * Error
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class Error {
  public static final String SERIALIZED_NAME_DETAILS = "Details";
  @SerializedName(SERIALIZED_NAME_DETAILS) private Object details;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "ErrorMessage";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE) private String errorMessage;

  public static final String SERIALIZED_NAME_ERRORS = "Errors";
  @SerializedName(SERIALIZED_NAME_ERRORS) private List<String> errors = null;

  public static final String SERIALIZED_NAME_FULL_EXCEPTION = "FullException";
  @SerializedName(SERIALIZED_NAME_FULL_EXCEPTION) private String fullException;

  public static final String SERIALIZED_NAME_HELP_LINK = "HelpLink";
  @SerializedName(SERIALIZED_NAME_HELP_LINK) private String helpLink;

  public static final String SERIALIZED_NAME_HELP_TEXT = "HelpText";
  @SerializedName(SERIALIZED_NAME_HELP_TEXT) private String helpText;

  public static final String SERIALIZED_NAME_PARSED_HELP_LINKS =
      "ParsedHelpLinks";
  @SerializedName(SERIALIZED_NAME_PARSED_HELP_LINKS)
  private List<String> parsedHelpLinks = null;

  public Error details(Object details) {

    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDetails() {
    return details;
  }

  public void setDetails(Object details) { this.details = details; }

  public Error errorMessage(String errorMessage) {

    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public Error errors(List<String> errors) {

    this.errors = errors;
    return this;
  }

  public Error addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<String>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) { this.errors = errors; }

  public Error fullException(String fullException) {

    this.fullException = fullException;
    return this;
  }

  /**
   * Get fullException
   * @return fullException
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFullException() {
    return fullException;
  }

  public void setFullException(String fullException) {
    this.fullException = fullException;
  }

  public Error helpLink(String helpLink) {

    this.helpLink = helpLink;
    return this;
  }

  /**
   * Get helpLink
   * @return helpLink
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHelpLink() {
    return helpLink;
  }

  public void setHelpLink(String helpLink) { this.helpLink = helpLink; }

  public Error helpText(String helpText) {

    this.helpText = helpText;
    return this;
  }

  /**
   * Get helpText
   * @return helpText
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHelpText() {
    return helpText;
  }

  public void setHelpText(String helpText) { this.helpText = helpText; }

  public Error parsedHelpLinks(List<String> parsedHelpLinks) {

    this.parsedHelpLinks = parsedHelpLinks;
    return this;
  }

  public Error addParsedHelpLinksItem(String parsedHelpLinksItem) {
    if (this.parsedHelpLinks == null) {
      this.parsedHelpLinks = new ArrayList<String>();
    }
    this.parsedHelpLinks.add(parsedHelpLinksItem);
    return this;
  }

  /**
   * Get parsedHelpLinks
   * @return parsedHelpLinks
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getParsedHelpLinks() {
    return parsedHelpLinks;
  }

  public void setParsedHelpLinks(List<String> parsedHelpLinks) {
    this.parsedHelpLinks = parsedHelpLinks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error)o;
    return Objects.equals(this.details, error.details) &&
        Objects.equals(this.errorMessage, error.errorMessage) &&
        Objects.equals(this.errors, error.errors) &&
        Objects.equals(this.fullException, error.fullException) &&
        Objects.equals(this.helpLink, error.helpLink) &&
        Objects.equals(this.helpText, error.helpText) &&
        Objects.equals(this.parsedHelpLinks, error.parsedHelpLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, errorMessage, errors, fullException, helpLink,
                        helpText, parsedHelpLinks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    errorMessage: ")
        .append(toIndentedString(errorMessage))
        .append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    fullException: ")
        .append(toIndentedString(fullException))
        .append("\n");
    sb.append("    helpLink: ").append(toIndentedString(helpLink)).append("\n");
    sb.append("    helpText: ").append(toIndentedString(helpText)).append("\n");
    sb.append("    parsedHelpLinks: ")
        .append(toIndentedString(parsedHelpLinks))
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
