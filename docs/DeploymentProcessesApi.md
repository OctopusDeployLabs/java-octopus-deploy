# DeploymentProcessesApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDeploymentProcessById**](DeploymentProcessesApi.md#getDeploymentProcessById) | **GET** /deploymentprocesses/{id} | Get a Deployment Process by ID.
[**getDeploymentProcessByIdSpaces**](DeploymentProcessesApi.md#getDeploymentProcessByIdSpaces) | **GET** /{baseSpaceId}/deploymentprocesses/{id} | Get a Deployment Process by ID.
[**getReleaseTemplate**](DeploymentProcessesApi.md#getReleaseTemplate) | **GET** /deploymentprocesses/{deploymentProcessId}/template | Gets all of the information necessary for creating or editing a release using this deployment process.
[**getReleaseTemplateSpaces**](DeploymentProcessesApi.md#getReleaseTemplateSpaces) | **GET** /{baseSpaceId}/deploymentprocesses/{deploymentProcessId}/template | Gets all of the information necessary for creating or editing a release using this deployment process.
[**listDeploymentProcesses**](DeploymentProcessesApi.md#listDeploymentProcesses) | **GET** /deploymentprocesses | Lists all the deployment processes
[**listDeploymentProcessesSpaces**](DeploymentProcessesApi.md#listDeploymentProcessesSpaces) | **GET** /{baseSpaceId}/deploymentprocesses | Lists all the deployment processes
[**updateDeploymentProcessById**](DeploymentProcessesApi.md#updateDeploymentProcessById) | **PUT** /deploymentprocesses/{id} | Modifies a deployment process
[**updateDeploymentProcessByIdSpaces**](DeploymentProcessesApi.md#updateDeploymentProcessByIdSpaces) | **PUT** /{baseSpaceId}/deploymentprocesses/{id} | Modifies a deployment process


<a name="getDeploymentProcessById"></a>
# **getDeploymentProcessById**
> DeploymentProcessResource getDeploymentProcessById(id)

Get a Deployment Process by ID.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.DeploymentProcessesApi;

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

    DeploymentProcessesApi apiInstance = new DeploymentProcessesApi(defaultClient);
    String id = "id_example"; // String | ID of the DeploymentProcess to load
    try {
      DeploymentProcessResource result = apiInstance.getDeploymentProcessById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentProcessesApi#getDeploymentProcessById");
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
 **id** | **String**| ID of the DeploymentProcess to load |

### Return type

[**DeploymentProcessResource**](DeploymentProcessResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | The deployment process ID specified doesn&#39;t exist |  -  |

<a name="getDeploymentProcessByIdSpaces"></a>
# **getDeploymentProcessByIdSpaces**
> DeploymentProcessResource getDeploymentProcessByIdSpaces(id, baseSpaceId)

Get a Deployment Process by ID.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.DeploymentProcessesApi;

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

    DeploymentProcessesApi apiInstance = new DeploymentProcessesApi(defaultClient);
    String id = "id_example"; // String | ID of the DeploymentProcess to load
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    try {
      DeploymentProcessResource result = apiInstance.getDeploymentProcessByIdSpaces(id, baseSpaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentProcessesApi#getDeploymentProcessByIdSpaces");
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
 **id** | **String**| ID of the DeploymentProcess to load |
 **baseSpaceId** | **String**| ID of the space |

### Return type

[**DeploymentProcessResource**](DeploymentProcessResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | The deployment process ID specified doesn&#39;t exist |  -  |

<a name="getReleaseTemplate"></a>
# **getReleaseTemplate**
> ReleaseTemplateResource getReleaseTemplate(deploymentProcessId, channel, releaseId)

Gets all of the information necessary for creating or editing a release using this deployment process.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.DeploymentProcessesApi;

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

    DeploymentProcessesApi apiInstance = new DeploymentProcessesApi(defaultClient);
    String deploymentProcessId = "deploymentProcessId_example"; // String | The ID of the deployment process to use. Example `deploymentprocess-projects-1`
    String channel = "channel_example"; // String | The ID of the channel to use. Example `Channels-12`
    String releaseId = "releaseId_example"; // String | The ID of the release to get variables from. Example `Releases-12`
    try {
      ReleaseTemplateResource result = apiInstance.getReleaseTemplate(deploymentProcessId, channel, releaseId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentProcessesApi#getReleaseTemplate");
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
 **deploymentProcessId** | **String**| The ID of the deployment process to use. Example &#x60;deploymentprocess-projects-1&#x60; |
 **channel** | **String**| The ID of the channel to use. Example &#x60;Channels-12&#x60; | [optional]
 **releaseId** | **String**| The ID of the release to get variables from. Example &#x60;Releases-12&#x60; | [optional]

### Return type

[**ReleaseTemplateResource**](ReleaseTemplateResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getReleaseTemplateSpaces"></a>
# **getReleaseTemplateSpaces**
> ReleaseTemplateResource getReleaseTemplateSpaces(deploymentProcessId, baseSpaceId, channel, releaseId)

Gets all of the information necessary for creating or editing a release using this deployment process.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.DeploymentProcessesApi;

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

    DeploymentProcessesApi apiInstance = new DeploymentProcessesApi(defaultClient);
    String deploymentProcessId = "deploymentProcessId_example"; // String | The ID of the deployment process to use. Example `deploymentprocess-projects-1`
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String channel = "channel_example"; // String | The ID of the channel to use. Example `Channels-12`
    String releaseId = "releaseId_example"; // String | The ID of the release to get variables from. Example `Releases-12`
    try {
      ReleaseTemplateResource result = apiInstance.getReleaseTemplateSpaces(deploymentProcessId, baseSpaceId, channel, releaseId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentProcessesApi#getReleaseTemplateSpaces");
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
 **deploymentProcessId** | **String**| The ID of the deployment process to use. Example &#x60;deploymentprocess-projects-1&#x60; |
 **baseSpaceId** | **String**| ID of the space |
 **channel** | **String**| The ID of the channel to use. Example &#x60;Channels-12&#x60; | [optional]
 **releaseId** | **String**| The ID of the release to get variables from. Example &#x60;Releases-12&#x60; | [optional]

### Return type

[**ReleaseTemplateResource**](ReleaseTemplateResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="listDeploymentProcesses"></a>
# **listDeploymentProcesses**
> DeploymentProcessResourceCollection listDeploymentProcesses(ids, skip, take)

Lists all the deployment processes

Lists all the deployment processes in the supplied Octopus Deploy Space, sorted by Id.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.DeploymentProcessesApi;

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

    DeploymentProcessesApi apiInstance = new DeploymentProcessesApi(defaultClient);
    List<String> ids = Arrays.asList(); // List<String> | A list of DeploymentProcess IDs, to limit the matching of DeploymentProcesses to those with a particular ID. Example: [\"deploymentprocess-Projects-1\", \"deploymentprocess-Projects-2\"]
    Integer skip = 56; // Integer | Number of items to skip. Defaults to zero
    Integer take = 56; // Integer | Number of items to take. Defaults to 30
    try {
      DeploymentProcessResourceCollection result = apiInstance.listDeploymentProcesses(ids, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentProcessesApi#listDeploymentProcesses");
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
 **ids** | [**List&lt;String&gt;**](String.md)| A list of DeploymentProcess IDs, to limit the matching of DeploymentProcesses to those with a particular ID. Example: [\&quot;deploymentprocess-Projects-1\&quot;, \&quot;deploymentprocess-Projects-2\&quot;] | [optional]
 **skip** | **Integer**| Number of items to skip. Defaults to zero | [optional]
 **take** | **Integer**| Number of items to take. Defaults to 30 | [optional]

### Return type

[**DeploymentProcessResourceCollection**](DeploymentProcessResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="listDeploymentProcessesSpaces"></a>
# **listDeploymentProcessesSpaces**
> DeploymentProcessResourceCollection listDeploymentProcessesSpaces(baseSpaceId, ids, skip, take)

Lists all the deployment processes

Lists all the deployment processes in the supplied Octopus Deploy Space, sorted by Id.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.DeploymentProcessesApi;

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

    DeploymentProcessesApi apiInstance = new DeploymentProcessesApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    List<String> ids = Arrays.asList(); // List<String> | A list of DeploymentProcess IDs, to limit the matching of DeploymentProcesses to those with a particular ID. Example: [\"deploymentprocess-Projects-1\", \"deploymentprocess-Projects-2\"]
    Integer skip = 56; // Integer | Number of items to skip. Defaults to zero
    Integer take = 56; // Integer | Number of items to take. Defaults to 30
    try {
      DeploymentProcessResourceCollection result = apiInstance.listDeploymentProcessesSpaces(baseSpaceId, ids, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentProcessesApi#listDeploymentProcessesSpaces");
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
 **baseSpaceId** | **String**| ID of the space |
 **ids** | [**List&lt;String&gt;**](String.md)| A list of DeploymentProcess IDs, to limit the matching of DeploymentProcesses to those with a particular ID. Example: [\&quot;deploymentprocess-Projects-1\&quot;, \&quot;deploymentprocess-Projects-2\&quot;] | [optional]
 **skip** | **Integer**| Number of items to skip. Defaults to zero | [optional]
 **take** | **Integer**| Number of items to take. Defaults to 30 | [optional]

### Return type

[**DeploymentProcessResourceCollection**](DeploymentProcessResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="updateDeploymentProcessById"></a>
# **updateDeploymentProcessById**
> DeploymentProcessResource updateDeploymentProcessById(id, body)

Modifies a deployment process

Modifies a deployment process. Only allowed for deployment processes owned by a project (cannot be used to change the deployment process owned by a release).

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.DeploymentProcessesApi;

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

    DeploymentProcessesApi apiInstance = new DeploymentProcessesApi(defaultClient);
    String id = "id_example"; // String | The ID of the deployment process to update. Example `deploymentprocess-Projects-1`
    DeploymentProcessResource body = new DeploymentProcessResource(); // DeploymentProcessResource | 
    try {
      DeploymentProcessResource result = apiInstance.updateDeploymentProcessById(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentProcessesApi#updateDeploymentProcessById");
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
 **id** | **String**| The ID of the deployment process to update. Example &#x60;deploymentprocess-Projects-1&#x60; |
 **body** | [**DeploymentProcessResource**](DeploymentProcessResource.md)|  | [optional]

### Return type

[**DeploymentProcessResource**](DeploymentProcessResource.md)

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
**404** | The deployment process doesn&#39;t exist |  -  |

<a name="updateDeploymentProcessByIdSpaces"></a>
# **updateDeploymentProcessByIdSpaces**
> DeploymentProcessResource updateDeploymentProcessByIdSpaces(id, baseSpaceId, body)

Modifies a deployment process

Modifies a deployment process. Only allowed for deployment processes owned by a project (cannot be used to change the deployment process owned by a release).

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.DeploymentProcessesApi;

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

    DeploymentProcessesApi apiInstance = new DeploymentProcessesApi(defaultClient);
    String id = "id_example"; // String | The ID of the deployment process to update. Example `deploymentprocess-Projects-1`
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    DeploymentProcessResource body = new DeploymentProcessResource(); // DeploymentProcessResource | 
    try {
      DeploymentProcessResource result = apiInstance.updateDeploymentProcessByIdSpaces(id, baseSpaceId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeploymentProcessesApi#updateDeploymentProcessByIdSpaces");
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
 **id** | **String**| The ID of the deployment process to update. Example &#x60;deploymentprocess-Projects-1&#x60; |
 **baseSpaceId** | **String**| ID of the space |
 **body** | [**DeploymentProcessResource**](DeploymentProcessResource.md)|  | [optional]

### Return type

[**DeploymentProcessResource**](DeploymentProcessResource.md)

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
**404** | The deployment process doesn&#39;t exist |  -  |

