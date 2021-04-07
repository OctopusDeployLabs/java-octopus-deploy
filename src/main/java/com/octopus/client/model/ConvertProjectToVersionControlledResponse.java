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
 * ConvertProjectToVersionControlledResponse
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ConvertProjectToVersionControlledResponse {
  public static final String SERIALIZED_NAME_MESSAGES = "Messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<String> messages = new ArrayList<String>();

  public ConvertProjectToVersionControlledResponse
  messages(List<String> messages) {

    this.messages = messages;
    return this;
  }

  public ConvertProjectToVersionControlledResponse
  addMessagesItem(String messagesItem) {
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * Get messages
   * @return messages
   **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getMessages() {
    return messages;
  }

  public void setMessages(List<String> messages) { this.messages = messages; }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertProjectToVersionControlledResponse
        convertProjectToVersionControlledResponse =
            (ConvertProjectToVersionControlledResponse)o;
    return Objects.equals(this.messages,
                          convertProjectToVersionControlledResponse.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertProjectToVersionControlledResponse {\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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
