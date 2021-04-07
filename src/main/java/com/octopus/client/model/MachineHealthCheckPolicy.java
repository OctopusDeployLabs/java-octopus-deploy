// Octopus REST API v2021.2.1387

package com.octopus.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.octopus.client.model.HealthCheckType;
import com.octopus.client.model.MachineScriptPolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/**
 * MachineHealthCheckPolicy
 */
@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class MachineHealthCheckPolicy {
  public static final String SERIALIZED_NAME_BASH_HEALTH_CHECK_POLICY =
      "BashHealthCheckPolicy";
  @SerializedName(SERIALIZED_NAME_BASH_HEALTH_CHECK_POLICY)
  private MachineScriptPolicy bashHealthCheckPolicy;

  public static final String SERIALIZED_NAME_HEALTH_CHECK_CRON =
      "HealthCheckCron";
  @SerializedName(SERIALIZED_NAME_HEALTH_CHECK_CRON)
  private String healthCheckCron;

  public static final String SERIALIZED_NAME_HEALTH_CHECK_CRON_TIMEZONE =
      "HealthCheckCronTimezone";
  @SerializedName(SERIALIZED_NAME_HEALTH_CHECK_CRON_TIMEZONE)
  private String healthCheckCronTimezone;

  public static final String SERIALIZED_NAME_HEALTH_CHECK_INTERVAL =
      "HealthCheckInterval";
  @SerializedName(SERIALIZED_NAME_HEALTH_CHECK_INTERVAL)
  private String healthCheckInterval;

  public static final String SERIALIZED_NAME_HEALTH_CHECK_TYPE =
      "HealthCheckType";
  @SerializedName(SERIALIZED_NAME_HEALTH_CHECK_TYPE)
  private HealthCheckType healthCheckType;

  public static final String SERIALIZED_NAME_POWER_SHELL_HEALTH_CHECK_POLICY =
      "PowerShellHealthCheckPolicy";
  @SerializedName(SERIALIZED_NAME_POWER_SHELL_HEALTH_CHECK_POLICY)
  private MachineScriptPolicy powerShellHealthCheckPolicy;

  public MachineHealthCheckPolicy
  bashHealthCheckPolicy(MachineScriptPolicy bashHealthCheckPolicy) {

    this.bashHealthCheckPolicy = bashHealthCheckPolicy;
    return this;
  }

  /**
   * Get bashHealthCheckPolicy
   * @return bashHealthCheckPolicy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MachineScriptPolicy getBashHealthCheckPolicy() {
    return bashHealthCheckPolicy;
  }

  public void
  setBashHealthCheckPolicy(MachineScriptPolicy bashHealthCheckPolicy) {
    this.bashHealthCheckPolicy = bashHealthCheckPolicy;
  }

  public MachineHealthCheckPolicy healthCheckCron(String healthCheckCron) {

    this.healthCheckCron = healthCheckCron;
    return this;
  }

  /**
   * Get healthCheckCron
   * @return healthCheckCron
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHealthCheckCron() {
    return healthCheckCron;
  }

  public void setHealthCheckCron(String healthCheckCron) {
    this.healthCheckCron = healthCheckCron;
  }

  public MachineHealthCheckPolicy
  healthCheckCronTimezone(String healthCheckCronTimezone) {

    this.healthCheckCronTimezone = healthCheckCronTimezone;
    return this;
  }

  /**
   * Get healthCheckCronTimezone
   * @return healthCheckCronTimezone
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHealthCheckCronTimezone() {
    return healthCheckCronTimezone;
  }

  public void setHealthCheckCronTimezone(String healthCheckCronTimezone) {
    this.healthCheckCronTimezone = healthCheckCronTimezone;
  }

  public MachineHealthCheckPolicy
  healthCheckInterval(String healthCheckInterval) {

    this.healthCheckInterval = healthCheckInterval;
    return this;
  }

  /**
   * Get healthCheckInterval
   * @return healthCheckInterval
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHealthCheckInterval() {
    return healthCheckInterval;
  }

  public void setHealthCheckInterval(String healthCheckInterval) {
    this.healthCheckInterval = healthCheckInterval;
  }

  public MachineHealthCheckPolicy
  healthCheckType(HealthCheckType healthCheckType) {

    this.healthCheckType = healthCheckType;
    return this;
  }

  /**
   * Get healthCheckType
   * @return healthCheckType
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HealthCheckType getHealthCheckType() {
    return healthCheckType;
  }

  public void setHealthCheckType(HealthCheckType healthCheckType) {
    this.healthCheckType = healthCheckType;
  }

  public MachineHealthCheckPolicy
  powerShellHealthCheckPolicy(MachineScriptPolicy powerShellHealthCheckPolicy) {

    this.powerShellHealthCheckPolicy = powerShellHealthCheckPolicy;
    return this;
  }

  /**
   * Get powerShellHealthCheckPolicy
   * @return powerShellHealthCheckPolicy
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MachineScriptPolicy getPowerShellHealthCheckPolicy() {
    return powerShellHealthCheckPolicy;
  }

  public void setPowerShellHealthCheckPolicy(
      MachineScriptPolicy powerShellHealthCheckPolicy) {
    this.powerShellHealthCheckPolicy = powerShellHealthCheckPolicy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MachineHealthCheckPolicy machineHealthCheckPolicy =
        (MachineHealthCheckPolicy)o;
    return Objects.equals(this.bashHealthCheckPolicy,
                          machineHealthCheckPolicy.bashHealthCheckPolicy) &&
        Objects.equals(this.healthCheckCron,
                       machineHealthCheckPolicy.healthCheckCron) &&
        Objects.equals(this.healthCheckCronTimezone,
                       machineHealthCheckPolicy.healthCheckCronTimezone) &&
        Objects.equals(this.healthCheckInterval,
                       machineHealthCheckPolicy.healthCheckInterval) &&
        Objects.equals(this.healthCheckType,
                       machineHealthCheckPolicy.healthCheckType) &&
        Objects.equals(this.powerShellHealthCheckPolicy,
                       machineHealthCheckPolicy.powerShellHealthCheckPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bashHealthCheckPolicy, healthCheckCron,
                        healthCheckCronTimezone, healthCheckInterval,
                        healthCheckType, powerShellHealthCheckPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MachineHealthCheckPolicy {\n");
    sb.append("    bashHealthCheckPolicy: ")
        .append(toIndentedString(bashHealthCheckPolicy))
        .append("\n");
    sb.append("    healthCheckCron: ")
        .append(toIndentedString(healthCheckCron))
        .append("\n");
    sb.append("    healthCheckCronTimezone: ")
        .append(toIndentedString(healthCheckCronTimezone))
        .append("\n");
    sb.append("    healthCheckInterval: ")
        .append(toIndentedString(healthCheckInterval))
        .append("\n");
    sb.append("    healthCheckType: ")
        .append(toIndentedString(healthCheckType))
        .append("\n");
    sb.append("    powerShellHealthCheckPolicy: ")
        .append(toIndentedString(powerShellHealthCheckPolicy))
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
