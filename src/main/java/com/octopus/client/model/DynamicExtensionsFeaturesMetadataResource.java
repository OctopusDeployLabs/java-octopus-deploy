// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.DynamicExtensionsFeature;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * DynamicExtensionsFeaturesMetadataResource
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class DynamicExtensionsFeaturesMetadataResource {
  public static final String SERIALIZED_NAME_FEATURES = "Features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private List<DynamicExtensionsFeature> features = null;

  public DynamicExtensionsFeaturesMetadataResource
  features(List<DynamicExtensionsFeature> features) {

    this.features = features;
    return this;
  }

  public DynamicExtensionsFeaturesMetadataResource
  addFeaturesItem(DynamicExtensionsFeature featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<DynamicExtensionsFeature>();
    }
    this.features.add(featuresItem);
    return this;
  }

  /**
   * Get features
   * @return features
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DynamicExtensionsFeature> getFeatures() {
    return features;
  }

  public void setFeatures(List<DynamicExtensionsFeature> features) {
    this.features = features;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicExtensionsFeaturesMetadataResource
        dynamicExtensionsFeaturesMetadataResource =
            (DynamicExtensionsFeaturesMetadataResource)o;
    return Objects.equals(this.features,
                          dynamicExtensionsFeaturesMetadataResource.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(features);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicExtensionsFeaturesMetadataResource {\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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
