// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * Gets or Sets CommunicationStyle
 */
@JsonAdapter(CommunicationStyle.Adapter.class)
public enum CommunicationStyle {

  NONE("None"),

  TENTACLEPASSIVE("TentaclePassive"),

  TENTACLEACTIVE("TentacleActive"),

  SSH("Ssh"),

  OFFLINEDROP("OfflineDrop"),

  AZUREWEBAPP("AzureWebApp"),

  FTP("Ftp"),

  AZURECLOUDSERVICE("AzureCloudService"),

  AZURESERVICEFABRICCLUSTER("AzureServiceFabricCluster"),

  KUBERNETES("Kubernetes");

  private String value;

  CommunicationStyle(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CommunicationStyle fromValue(String value) {
    for (CommunicationStyle b : CommunicationStyle.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CommunicationStyle> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final CommunicationStyle enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CommunicationStyle read(final JsonReader jsonReader)
        throws IOException {
      String value = jsonReader.nextString();
      return CommunicationStyle.fromValue(value);
    }
  }
}
