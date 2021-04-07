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
 * Gets or Sets TriggerFilterType
 */
@JsonAdapter(TriggerFilterType.Adapter.class)
public enum TriggerFilterType {

  MACHINEFILTER("MachineFilter"),

  DAILYSCHEDULE("DailySchedule"),

  DAYSPERWEEKSCHEDULE("DaysPerWeekSchedule"),

  DAYSPERMONTHSCHEDULE("DaysPerMonthSchedule"),

  CRONEXPRESSIONSCHEDULE("CronExpressionSchedule"),

  ONCEDAILYSCHEDULE("OnceDailySchedule"),

  CONTINUOUSDAILYSCHEDULE("ContinuousDailySchedule");

  private String value;

  TriggerFilterType(String value) { this.value = value; }

  public String getValue() { return value; }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TriggerFilterType fromValue(String value) {
    for (TriggerFilterType b : TriggerFilterType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TriggerFilterType> {
    @Override
    public void write(final JsonWriter jsonWriter,
                      final TriggerFilterType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TriggerFilterType read(final JsonReader jsonReader)
        throws IOException {
      String value = jsonReader.nextString();
      return TriggerFilterType.fromValue(value);
    }
  }
}
