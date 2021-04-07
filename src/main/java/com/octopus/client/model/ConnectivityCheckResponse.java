// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.ConnectivityCheckMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * ConnectivityCheckResponse
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class ConnectivityCheckResponse {
  public static final String SERIALIZED_NAME_MESSAGES = "Messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<ConnectivityCheckMessage> messages = null;

  /**
   * Get messages
   * @return messages
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ConnectivityCheckMessage> getMessages() {
    return messages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectivityCheckResponse connectivityCheckResponse =
        (ConnectivityCheckResponse)o;
    return Objects.equals(this.messages, connectivityCheckResponse.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectivityCheckResponse {\n");
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
