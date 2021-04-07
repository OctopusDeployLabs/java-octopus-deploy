// Octopus REST API v2021.2.1387

package com.octopus.client;

@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class Pair {
  private String name = "";
  private String value = "";

  public Pair(String name, String value) {
    setName(name);
    setValue(value);
  }

  private void setName(String name) {
    if (!isValidString(name)) {
      return;
    }

    this.name = name;
  }

  private void setValue(String value) {
    if (!isValidString(value)) {
      return;
    }

    this.value = value;
  }

  public String getName() { return this.name; }

  public String getValue() { return this.value; }

  private boolean isValidString(String arg) {
    if (arg == null) {
      return false;
    }

    if (arg.trim().isEmpty()) {
      return false;
    }

    return true;
  }
}
