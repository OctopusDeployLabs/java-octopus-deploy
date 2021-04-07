# RunbookProcessesApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRunbookProcessById**](RunbookProcessesApi.md#getRunbookProcessById) | **GET** /runbookProcesses/{id} | Get a Runbook Process by ID
[**getRunbookProcessByIdSpaces**](RunbookProcessesApi.md#getRunbookProcessByIdSpaces) | **GET** /{baseSpaceId}/runbookProcesses/{id} | Get a Runbook Process by ID
[**getRunbookSnapshotTemplateForRunbookStep**](RunbookProcessesApi.md#getRunbookSnapshotTemplateForRunbookStep) | **GET** /runbookProcesses/{id}/runbookSnapshotTemplate | 
[**getRunbookSnapshotTemplateForRunbookStepSpaces**](RunbookProcessesApi.md#getRunbookSnapshotTemplateForRunbookStepSpaces) | **GET** /{baseSpaceId}/runbookProcesses/{id}/runbookSnapshotTemplate | 
[**indexRunbookProcesses**](RunbookProcessesApi.md#indexRunbookProcesses) | **GET** /runbookProcesses | Get a list of Runbook Processes
[**indexRunbookProcessesSpaces**](RunbookProcessesApi.md#indexRunbookProcessesSpaces) | **GET** /{baseSpaceId}/runbookProcesses | Get a list of Runbook Processes
[**indexRunbookSnapshotRunbookRuns**](RunbookProcessesApi.md#indexRunbookSnapshotRunbookRuns) | **GET** /runbookSnapshots/{id}/runbookRuns | Lists all of the Runbook Runs that belong to the given Runbook Snapshot
[**indexRunbookSnapshotRunbookRunsSpaces**](RunbookProcessesApi.md#indexRunbookSnapshotRunbookRunsSpaces) | **GET** /{baseSpaceId}/runbookSnapshots/{id}/runbookRuns | Lists all of the Runbook Runs that belong to the given Runbook Snapshot
[**updateRunbookProcess**](RunbookProcessesApi.md#updateRunbookProcess) | **PUT** /runbookProcesses/{id} | 
[**updateRunbookProcessSpaces**](RunbookProcessesApi.md#updateRunbookProcessSpaces) | **PUT** /{baseSpaceId}/runbookProcesses/{id} | 


<a name="getRunbookProcessById"></a>
# **getRunbookProcessById**
> RunbookProcessResource getRunbookProcessById(id)

Get a Runbook Process by ID

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookProcessesApi;

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

    RunbookProcessesApi apiInstance = new RunbookProcessesApi(defaultClient);
    String id = "id_example"; // String | ID of the RunbookProcess to load
    try {
      RunbookProcessResource result = apiInstance.getRunbookProcessById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookProcessesApi#getRunbookProcessById");
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
 **id** | **String**| ID of the RunbookProcess to load |

### Return type

[**RunbookProcessResource**](RunbookProcessResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | No ID parameter was provided. |  -  |

<a name="getRunbookProcessByIdSpaces"></a>
# **getRunbookProcessByIdSpaces**
> RunbookProcessResource getRunbookProcessByIdSpaces(id, baseSpaceId)

Get a Runbook Process by ID

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookProcessesApi;

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

    RunbookProcessesApi apiInstance = new RunbookProcessesApi(defaultClient);
    String id = "id_example"; // String | ID of the RunbookProcess to load
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    try {
      RunbookProcessResource result = apiInstance.getRunbookProcessByIdSpaces(id, baseSpaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookProcessesApi#getRunbookProcessByIdSpaces");
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
 **id** | **String**| ID of the RunbookProcess to load |
 **baseSpaceId** | **String**| ID of the space |

### Return type

[**RunbookProcessResource**](RunbookProcessResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | No ID parameter was provided. |  -  |

<a name="getRunbookSnapshotTemplateForRunbookStep"></a>
# **getRunbookSnapshotTemplateForRunbookStep**
> RunbookSnapshotTemplateResource getRunbookSnapshotTemplateForRunbookStep(id)



Gets all of the information necessary for creating or editing a Runbook Snapshot using this Runbook Process.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookProcessesApi;

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

    RunbookProcessesApi apiInstance = new RunbookProcessesApi(defaultClient);
    String id = "id_example"; // String | ID of the resource
    try {
      RunbookSnapshotTemplateResource result = apiInstance.getRunbookSnapshotTemplateForRunbookStep(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookProcessesApi#getRunbookSnapshotTemplateForRunbookStep");
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
 **id** | **String**| ID of the resource |

### Return type

[**RunbookSnapshotTemplateResource**](RunbookSnapshotTemplateResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | RunbookSnapshotTemplateResource resource returned |  -  |
**400** | No id parameter was provided. |  -  |

<a name="getRunbookSnapshotTemplateForRunbookStepSpaces"></a>
# **getRunbookSnapshotTemplateForRunbookStepSpaces**
> RunbookSnapshotTemplateResource getRunbookSnapshotTemplateForRunbookStepSpaces(baseSpaceId, id)



Gets all of the information necessary for creating or editing a Runbook Snapshot using this Runbook Process.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookProcessesApi;

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

    RunbookProcessesApi apiInstance = new RunbookProcessesApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the resource
    try {
      RunbookSnapshotTemplateResource result = apiInstance.getRunbookSnapshotTemplateForRunbookStepSpaces(baseSpaceId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookProcessesApi#getRunbookSnapshotTemplateForRunbookStepSpaces");
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
 **id** | **String**| ID of the resource |

### Return type

[**RunbookSnapshotTemplateResource**](RunbookSnapshotTemplateResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | RunbookSnapshotTemplateResource resource returned |  -  |
**400** | No id parameter was provided. |  -  |

<a name="indexRunbookProcesses"></a>
# **indexRunbookProcesses**
> RunbookProcessResourceCollection indexRunbookProcesses(skip, take)

Get a list of Runbook Processes

Lists all the Runbook Processes in the supplied Octopus Deploy Space, sorted by Id

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookProcessesApi;

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

    RunbookProcessesApi apiInstance = new RunbookProcessesApi(defaultClient);
    Integer skip = 56; // Integer | Number of items to skip. Defaults to zero
    Integer take = 56; // Integer | Number of items to take. Defaults to 30
    try {
      RunbookProcessResourceCollection result = apiInstance.indexRunbookProcesses(skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookProcessesApi#indexRunbookProcesses");
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
 **skip** | **Integer**| Number of items to skip. Defaults to zero | [optional]
 **take** | **Integer**| Number of items to take. Defaults to 30 | [optional]

### Return type

[**RunbookProcessResourceCollection**](RunbookProcessResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="indexRunbookProcessesSpaces"></a>
# **indexRunbookProcessesSpaces**
> RunbookProcessResourceCollection indexRunbookProcessesSpaces(baseSpaceId, skip, take)

Get a list of Runbook Processes

Lists all the Runbook Processes in the supplied Octopus Deploy Space, sorted by Id

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookProcessesApi;

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

    RunbookProcessesApi apiInstance = new RunbookProcessesApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    Integer skip = 56; // Integer | Number of items to skip. Defaults to zero
    Integer take = 56; // Integer | Number of items to take. Defaults to 30
    try {
      RunbookProcessResourceCollection result = apiInstance.indexRunbookProcessesSpaces(baseSpaceId, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookProcessesApi#indexRunbookProcessesSpaces");
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
 **skip** | **Integer**| Number of items to skip. Defaults to zero | [optional]
 **take** | **Integer**| Number of items to take. Defaults to 30 | [optional]

### Return type

[**RunbookProcessResourceCollection**](RunbookProcessResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="indexRunbookSnapshotRunbookRuns"></a>
# **indexRunbookSnapshotRunbookRuns**
> RunbookRunResourceCollection indexRunbookSnapshotRunbookRuns(id, skip, take)

Lists all of the Runbook Runs that belong to the given Runbook Snapshot

Runs will be ordered from most recent to least recent

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookProcessesApi;

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

    RunbookProcessesApi apiInstance = new RunbookProcessesApi(defaultClient);
    String id = "id_example"; // String | ID of the Runbook Snapshot to load
    Integer skip = 56; // Integer | Number of items to skip. Defaults to zero
    Integer take = 56; // Integer | Number of items to take. Defaults to 30
    try {
      RunbookRunResourceCollection result = apiInstance.indexRunbookSnapshotRunbookRuns(id, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookProcessesApi#indexRunbookSnapshotRunbookRuns");
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
 **id** | **String**| ID of the Runbook Snapshot to load |
 **skip** | **Integer**| Number of items to skip. Defaults to zero | [optional]
 **take** | **Integer**| Number of items to take. Defaults to 30 | [optional]

### Return type

[**RunbookRunResourceCollection**](RunbookRunResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | No ID parameter was provided. |  -  |

<a name="indexRunbookSnapshotRunbookRunsSpaces"></a>
# **indexRunbookSnapshotRunbookRunsSpaces**
> RunbookRunResourceCollection indexRunbookSnapshotRunbookRunsSpaces(id, baseSpaceId, skip, take)

Lists all of the Runbook Runs that belong to the given Runbook Snapshot

Runs will be ordered from most recent to least recent

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookProcessesApi;

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

    RunbookProcessesApi apiInstance = new RunbookProcessesApi(defaultClient);
    String id = "id_example"; // String | ID of the Runbook Snapshot to load
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    Integer skip = 56; // Integer | Number of items to skip. Defaults to zero
    Integer take = 56; // Integer | Number of items to take. Defaults to 30
    try {
      RunbookRunResourceCollection result = apiInstance.indexRunbookSnapshotRunbookRunsSpaces(id, baseSpaceId, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookProcessesApi#indexRunbookSnapshotRunbookRunsSpaces");
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
 **id** | **String**| ID of the Runbook Snapshot to load |
 **baseSpaceId** | **String**| ID of the space |
 **skip** | **Integer**| Number of items to skip. Defaults to zero | [optional]
 **take** | **Integer**| Number of items to take. Defaults to 30 | [optional]

### Return type

[**RunbookRunResourceCollection**](RunbookRunResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | No ID parameter was provided. |  -  |

<a name="updateRunbookProcess"></a>
# **updateRunbookProcess**
> RunbookProcessResource updateRunbookProcess(id)



Modifies a Runbook Process. Only allowed for Runbook Processes owned by a project.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookProcessesApi;

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

    RunbookProcessesApi apiInstance = new RunbookProcessesApi(defaultClient);
    String id = "id_example"; // String | ID of the resource
    try {
      RunbookProcessResource result = apiInstance.updateRunbookProcess(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookProcessesApi#updateRunbookProcess");
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
 **id** | **String**| ID of the resource |

### Return type

[**RunbookProcessResource**](RunbookProcessResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | RunbookProcessResource resource returned |  -  |
**400** | Changes to this process could not be saved, because another user has made changes to the process between when you started editing and when you saved your changes. Please reload or open a new tab to make your changes.  No id parameter was provided.  No request body was supplied.  Validation failed.  You cannot modify this process because it is frozen. You&#39;ll need to create a new process instead. |  -  |

<a name="updateRunbookProcessSpaces"></a>
# **updateRunbookProcessSpaces**
> RunbookProcessResource updateRunbookProcessSpaces(baseSpaceId, id)



Modifies a Runbook Process. Only allowed for Runbook Processes owned by a project.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookProcessesApi;

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

    RunbookProcessesApi apiInstance = new RunbookProcessesApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the resource
    try {
      RunbookProcessResource result = apiInstance.updateRunbookProcessSpaces(baseSpaceId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookProcessesApi#updateRunbookProcessSpaces");
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
 **id** | **String**| ID of the resource |

### Return type

[**RunbookProcessResource**](RunbookProcessResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | RunbookProcessResource resource returned |  -  |
**400** | Changes to this process could not be saved, because another user has made changes to the process between when you started editing and when you saved your changes. Please reload or open a new tab to make your changes.  No id parameter was provided.  No request body was supplied.  Validation failed.  You cannot modify this process because it is frozen. You&#39;ll need to create a new process instead. |  -  |

