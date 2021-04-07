// Octopus REST API v2021.2.1387

package com.octopus.client;

@javax.annotation.
Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen",
          date = "2021-04-07T18:54:22.093939+10:00[Australia/Brisbane]")
public class Configuration {
  private static ApiClient defaultApiClient = new ApiClient();

  /**
   * Get the default API client, which would be used when creating API
   * instances without providing an API client.
   *
   * @return Default API client
   */
  public static ApiClient getDefaultApiClient() { return defaultApiClient; }

  /**
   * Set the default API client, which would be used when creating API
   * instances without providing an API client.
   *
   * @param apiClient API client
   */
  public static void setDefaultApiClient(ApiClient apiClient) {
    defaultApiClient = apiClient;
  }
}
