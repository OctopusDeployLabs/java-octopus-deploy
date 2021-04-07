# DeploymentSettingsApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDeploymentSettingsById**](DeploymentSettingsApi.md#getDeploymentSettingsById) | **GET** /deploymentsettings/{id} | Gets deployment settings by ID.
[**getDeploymentSettingsByIdSpaces**](DeploymentSettingsApi.md#getDeploymentSettingsByIdSpaces) | **GET** /{baseSpaceId}/deploymentsettings/{id} | Gets deployment settings by ID.
[**updateDeploymentSettingsById**](DeploymentSettingsApi.md#updateDeploymentSettingsById) | **PUT** /deploymentsettings/{id} | Modifies deployment settings
[**updateDeploymentSettingsByIdSpaces**](DeploymentSettingsApi.md#updateDeploymentSettingsByIdSpaces) | **PUT** /{baseSpaceId}/deploymentsettings/{id} | Modifies deployment settings


<a name="getDeploymentSettingsById"></a>
# **getDeploymentSettingsById**
> DeploymentSettingsResource getDeploymentSettingsById(id)

Gets deployment settings by ID.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.DeploymentSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    DeploymentSettingsApi apiInstance = new DeploymentSettingsApi(defaultClient);
    String id = "id_example"; // String | ID of the DeploymentSettings to load
    try {
      DeploymentSettingsResource result = apiInstance.getDeploymentSettingsById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentSettingsApi#getDeploymentSettingsById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the DeploymentSettings to load |

### Return type

[**DeploymentSettingsResource**](DeploymentSettingsResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | The deployment settings ID specified doesn&#39;t exist |  -  |

<a name="getDeploymentSettingsByIdSpaces"></a>
# **getDeploymentSettingsByIdSpaces**
> DeploymentSettingsResource getDeploymentSettingsByIdSpaces(id, baseSpaceId)

Gets deployment settings by ID.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.DeploymentSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    DeploymentSettingsApi apiInstance = new DeploymentSettingsApi(defaultClient);
    String id = "id_example"; // String | ID of the DeploymentSettings to load
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    try {
      DeploymentSettingsResource result = apiInstance.getDeploymentSettingsByIdSpaces(id, baseSpaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentSettingsApi#getDeploymentSettingsByIdSpaces");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the DeploymentSettings to load |
 **baseSpaceId** | **String**| ID of the space |

### Return type

[**DeploymentSettingsResource**](DeploymentSettingsResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | The deployment settings ID specified doesn&#39;t exist |  -  |

<a name="updateDeploymentSettingsById"></a>
# **updateDeploymentSettingsById**
> DeploymentSettingsResource updateDeploymentSettingsById(id, body)

Modifies deployment settings

Modifies deployment settings for a project.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.DeploymentSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    DeploymentSettingsApi apiInstance = new DeploymentSettingsApi(defaultClient);
    String id = "id_example"; // String | The ID of the deployment settings to update. Example `deploymentsettings-Projects-1`
    DeploymentSettingsResource body = new DeploymentSettingsResource(); // DeploymentSettingsResource | 
    try {
      DeploymentSettingsResource result = apiInstance.updateDeploymentSettingsById(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentSettingsApi#updateDeploymentSettingsById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the deployment settings to update. Example &#x60;deploymentsettings-Projects-1&#x60; |
 **body** | [**DeploymentSettingsResource**](DeploymentSettingsResource.md)|  |

### Return type

[**DeploymentSettingsResource**](DeploymentSettingsResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Validation Failed |  -  |
**404** | The project ID or deployment settings don&#39;t exist |  -  |

<a name="updateDeploymentSettingsByIdSpaces"></a>
# **updateDeploymentSettingsByIdSpaces**
> DeploymentSettingsResource updateDeploymentSettingsByIdSpaces(id, baseSpaceId, body)

Modifies deployment settings

Modifies deployment settings for a project.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.DeploymentSettingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost/api");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    // Configure API key authorization: NugetApiKeyHeader
    ApiKeyAuth NugetApiKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("NugetApiKeyHeader");
    NugetApiKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //NugetApiKeyHeader.setApiKeyPrefix("Token");

    DeploymentSettingsApi apiInstance = new DeploymentSettingsApi(defaultClient);
    String id = "id_example"; // String | The ID of the deployment settings to update. Example `deploymentsettings-Projects-1`
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    DeploymentSettingsResource body = new DeploymentSettingsResource(); // DeploymentSettingsResource | 
    try {
      DeploymentSettingsResource result = apiInstance.updateDeploymentSettingsByIdSpaces(id, baseSpaceId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentSettingsApi#updateDeploymentSettingsByIdSpaces");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the deployment settings to update. Example &#x60;deploymentsettings-Projects-1&#x60; |
 **baseSpaceId** | **String**| ID of the space |
 **body** | [**DeploymentSettingsResource**](DeploymentSettingsResource.md)|  |

### Return type

[**DeploymentSettingsResource**](DeploymentSettingsResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Validation Failed |  -  |
**404** | The project ID or deployment settings don&#39;t exist |  -  |

