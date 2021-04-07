# RunbookSnapshotsApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRunbookSnapshot**](RunbookSnapshotsApi.md#createRunbookSnapshot) | **POST** /runbookSnapshots | Create a RunbookSnapshotResource
[**createRunbookSnapshotSnapshotVariables**](RunbookSnapshotsApi.md#createRunbookSnapshotSnapshotVariables) | **POST** /runbookSnapshots/{id}/snapshot-variables | 
[**createRunbookSnapshotSnapshotVariablesSpaces**](RunbookSnapshotsApi.md#createRunbookSnapshotSnapshotVariablesSpaces) | **POST** /{baseSpaceId}/runbookSnapshots/{id}/snapshot-variables | 
[**createRunbookSnapshotSpaces**](RunbookSnapshotsApi.md#createRunbookSnapshotSpaces) | **POST** /{baseSpaceId}/runbookSnapshots | Create a RunbookSnapshotResource
[**deleteRunbookSnapshot**](RunbookSnapshotsApi.md#deleteRunbookSnapshot) | **DELETE** /runbookSnapshots/{id} | Delete a RunbookSnapshotResource by ID
[**deleteRunbookSnapshotSpaces**](RunbookSnapshotsApi.md#deleteRunbookSnapshotSpaces) | **DELETE** /{baseSpaceId}/runbookSnapshots/{id} | Delete a RunbookSnapshotResource by ID
[**getRunbookRunPreviewForRunbookSnapshot**](RunbookSnapshotsApi.md#getRunbookRunPreviewForRunbookSnapshot) | **GET** /runbookSnapshots/{id}/runbookRuns/preview/{environment} | 
[**getRunbookRunPreviewForRunbookSnapshot1**](RunbookSnapshotsApi.md#getRunbookRunPreviewForRunbookSnapshot1) | **GET** /runbookSnapshots/{id}/runbookRuns/preview/{environment}/{tenant} | 
[**getRunbookRunPreviewForRunbookSnapshotSpaces**](RunbookSnapshotsApi.md#getRunbookRunPreviewForRunbookSnapshotSpaces) | **GET** /{baseSpaceId}/runbookSnapshots/{id}/runbookRuns/preview/{environment} | 
[**getRunbookRunPreviewForRunbookSnapshotSpaces1**](RunbookSnapshotsApi.md#getRunbookRunPreviewForRunbookSnapshotSpaces1) | **GET** /{baseSpaceId}/runbookSnapshots/{id}/runbookRuns/preview/{environment}/{tenant} | 
[**getRunbookRunTemplateForRunbookSnapshot**](RunbookSnapshotsApi.md#getRunbookRunTemplateForRunbookSnapshot) | **GET** /runbookSnapshots/{id}/runbookRuns/template | 
[**getRunbookRunTemplateForRunbookSnapshotSpaces**](RunbookSnapshotsApi.md#getRunbookRunTemplateForRunbookSnapshotSpaces) | **GET** /{baseSpaceId}/runbookSnapshots/{id}/runbookRuns/template | 
[**getRunbookSnapshotById**](RunbookSnapshotsApi.md#getRunbookSnapshotById) | **GET** /runbookSnapshots/{id} | Get a Runbook Snapshot by ID
[**getRunbookSnapshotByIdSpaces**](RunbookSnapshotsApi.md#getRunbookSnapshotByIdSpaces) | **GET** /{baseSpaceId}/runbookSnapshots/{id} | Get a Runbook Snapshot by ID
[**getRunbookSnapshotByProjectAndName**](RunbookSnapshotsApi.md#getRunbookSnapshotByProjectAndName) | **GET** /projects/{id}/runbookSnapshots/{name} | 
[**getRunbookSnapshotByProjectAndNameSpaces**](RunbookSnapshotsApi.md#getRunbookSnapshotByProjectAndNameSpaces) | **GET** /{baseSpaceId}/projects/{id}/runbookSnapshots/{name} | 
[**indexProjectRunbookSnapshots**](RunbookSnapshotsApi.md#indexProjectRunbookSnapshots) | **GET** /projects/{id}/runbookSnapshots | Get a list of RunbookSnapshotResources for the given ProjectResource
[**indexProjectRunbookSnapshotsSpaces**](RunbookSnapshotsApi.md#indexProjectRunbookSnapshotsSpaces) | **GET** /{baseSpaceId}/projects/{id}/runbookSnapshots | Get a list of RunbookSnapshotResources for the given ProjectResource
[**indexRunbookRunbookSnapshots**](RunbookSnapshotsApi.md#indexRunbookRunbookSnapshots) | **GET** /runbooks/{id}/runbookSnapshots | Get a list of RunbookSnapshotResources for the given RunbookResource
[**indexRunbookRunbookSnapshotsSpaces**](RunbookSnapshotsApi.md#indexRunbookRunbookSnapshotsSpaces) | **GET** /{baseSpaceId}/runbooks/{id}/runbookSnapshots | Get a list of RunbookSnapshotResources for the given RunbookResource
[**indexRunbookSnapshots**](RunbookSnapshotsApi.md#indexRunbookSnapshots) | **GET** /runbookSnapshots | Get a list of Runbook Snapshots
[**indexRunbookSnapshotsSpaces**](RunbookSnapshotsApi.md#indexRunbookSnapshotsSpaces) | **GET** /{baseSpaceId}/runbookSnapshots | Get a list of Runbook Snapshots
[**updateRunbookSnapshot**](RunbookSnapshotsApi.md#updateRunbookSnapshot) | **PUT** /runbookSnapshots/{id} | Modify a RunbookSnapshotResource by ID
[**updateRunbookSnapshotSpaces**](RunbookSnapshotsApi.md#updateRunbookSnapshotSpaces) | **PUT** /{baseSpaceId}/runbookSnapshots/{id} | Modify a RunbookSnapshotResource by ID


<a name="createRunbookSnapshot"></a>
# **createRunbookSnapshot**
> RunbookSnapshotResource createRunbookSnapshot(body)

Create a RunbookSnapshotResource

Creates a new snapshot.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookSnapshotsApi;

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

    RunbookSnapshotsApi apiInstance = new RunbookSnapshotsApi(defaultClient);
    RunbookSnapshotResource body = new RunbookSnapshotResource(); // RunbookSnapshotResource | The RunbookSnapshotResource resource to create
    try {
      RunbookSnapshotResource result = apiInstance.createRunbookSnapshot(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookSnapshotsApi#createRunbookSnapshot");
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
 **body** | [**RunbookSnapshotResource**](RunbookSnapshotResource.md)| The RunbookSnapshotResource resource to create | [optional]

### Return type

[**RunbookSnapshotResource**](RunbookSnapshotResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | RunbookSnapshotResource Created |  -  |
**400** | Model validation failed.  No request body was supplied. |  -  |

<a name="createRunbookSnapshotSnapshotVariables"></a>
# **createRunbookSnapshotSnapshotVariables**
> RunbookSnapshotResource createRunbookSnapshotSnapshotVariables(id)



Refresh the variable snapshots associated with the runbook snapshot. The runbook&#39;s process must not have changed since the snapshot was created.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookSnapshotsApi;

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

    RunbookSnapshotsApi apiInstance = new RunbookSnapshotsApi(defaultClient);
    String id = "id_example"; // String | ID of the resource
    try {
      RunbookSnapshotResource result = apiInstance.createRunbookSnapshotSnapshotVariables(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookSnapshotsApi#createRunbookSnapshotSnapshotVariables");
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

[**RunbookSnapshotResource**](RunbookSnapshotResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | RunbookSnapshotResource resource returned |  -  |
**400** | No id parameter was provided. |  -  |

<a name="createRunbookSnapshotSnapshotVariablesSpaces"></a>
# **createRunbookSnapshotSnapshotVariablesSpaces**
> RunbookSnapshotResource createRunbookSnapshotSnapshotVariablesSpaces(baseSpaceId, id)



Refresh the variable snapshots associated with the runbook snapshot. The runbook&#39;s process must not have changed since the snapshot was created.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookSnapshotsApi;

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

    RunbookSnapshotsApi apiInstance = new RunbookSnapshotsApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the resource
    try {
      RunbookSnapshotResource result = apiInstance.createRunbookSnapshotSnapshotVariablesSpaces(baseSpaceId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookSnapshotsApi#createRunbookSnapshotSnapshotVariablesSpaces");
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

[**RunbookSnapshotResource**](RunbookSnapshotResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | RunbookSnapshotResource resource returned |  -  |
**400** | No id parameter was provided. |  -  |

<a name="createRunbookSnapshotSpaces"></a>
# **createRunbookSnapshotSpaces**
> RunbookSnapshotResource createRunbookSnapshotSpaces(baseSpaceId, body)

Create a RunbookSnapshotResource

Creates a new snapshot.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookSnapshotsApi;

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

    RunbookSnapshotsApi apiInstance = new RunbookSnapshotsApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    RunbookSnapshotResource body = new RunbookSnapshotResource(); // RunbookSnapshotResource | The RunbookSnapshotResource resource to create
    try {
      RunbookSnapshotResource result = apiInstance.createRunbookSnapshotSpaces(baseSpaceId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookSnapshotsApi#createRunbookSnapshotSpaces");
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
 **body** | [**RunbookSnapshotResource**](RunbookSnapshotResource.md)| The RunbookSnapshotResource resource to create | [optional]

### Return type

[**RunbookSnapshotResource**](RunbookSnapshotResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | RunbookSnapshotResource Created |  -  |
**400** | Model validation failed.  No request body was supplied. |  -  |

<a name="deleteRunbookSnapshot"></a>
# **deleteRunbookSnapshot**
> deleteRunbookSnapshot(id)

Delete a RunbookSnapshotResource by ID

Deletes an existing snapshot, along with all of the runs, tasks and other associated resources belonging to the snapshot.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookSnapshotsApi;

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

    RunbookSnapshotsApi apiInstance = new RunbookSnapshotsApi(defaultClient);
    String id = "id_example"; // String | ID of the RunbookSnapshotResource to delete
    try {
      apiInstance.deleteRunbookSnapshot(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookSnapshotsApi#deleteRunbookSnapshot");
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
 **id** | **String**| ID of the RunbookSnapshotResource to delete |

### Return type

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | BadRequest  No id parameter was provided.  This resource is read-only and cannot be deleted. |  -  |

<a name="deleteRunbookSnapshotSpaces"></a>
# **deleteRunbookSnapshotSpaces**
> deleteRunbookSnapshotSpaces(baseSpaceId, id)

Delete a RunbookSnapshotResource by ID

Deletes an existing snapshot, along with all of the runs, tasks and other associated resources belonging to the snapshot.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookSnapshotsApi;

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

    RunbookSnapshotsApi apiInstance = new RunbookSnapshotsApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the RunbookSnapshotResource to delete
    try {
      apiInstance.deleteRunbookSnapshotSpaces(baseSpaceId, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookSnapshotsApi#deleteRunbookSnapshotSpaces");
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
 **id** | **String**| ID of the RunbookSnapshotResource to delete |

### Return type

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | BadRequest  No id parameter was provided.  This resource is read-only and cannot be deleted. |  -  |

<a name="getRunbookRunPreviewForRunbookSnapshot"></a>
# **getRunbookRunPreviewForRunbookSnapshot**
> RunbookRunPreviewResource getRunbookRunPreviewForRunbookSnapshot(environment, id)



Gets a document that describes what steps will/won&#39;t be run during a run to a given environment (and tenant if supplied).

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookSnapshotsApi;

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

    RunbookSnapshotsApi apiInstance = new RunbookSnapshotsApi(defaultClient);
    String environment = "environment_example"; // String | ID of the environment
    String id = "id_example"; // String | ID of the resource
    try {
      RunbookRunPreviewResource result = apiInstance.getRunbookRunPreviewForRunbookSnapshot(environment, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookSnapshotsApi#getRunbookRunPreviewForRunbookSnapshot");
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
 **environment** | **String**| ID of the environment |
 **id** | **String**| ID of the resource |

### Return type

[**RunbookRunPreviewResource**](RunbookRunPreviewResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | RunbookRunPreviewResource resource returned |  -  |
**400** | No environment parameter was provided.  No id parameter was provided. |  -  |

<a name="getRunbookRunPreviewForRunbookSnapshot1"></a>
# **getRunbookRunPreviewForRunbookSnapshot1**
> RunbookRunPreviewResource getRunbookRunPreviewForRunbookSnapshot1(environment, id, tenant)



Gets a document that describes what steps will/won&#39;t be run during a run to a given environment (and tenant if supplied).

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookSnapshotsApi;

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

    RunbookSnapshotsApi apiInstance = new RunbookSnapshotsApi(defaultClient);
    String environment = "environment_example"; // String | ID of the environment
    String id = "id_example"; // String | ID of the resource
    String tenant = "tenant_example"; // String | ID of the tenant
    try {
      RunbookRunPreviewResource result = apiInstance.getRunbookRunPreviewForRunbookSnapshot1(environment, id, tenant);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookSnapshotsApi#getRunbookRunPreviewForRunbookSnapshot1");
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
 **environment** | **String**| ID of the environment |
 **id** | **String**| ID of the resource |
 **tenant** | **String**| ID of the tenant |

### Return type

[**RunbookRunPreviewResource**](RunbookRunPreviewResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | RunbookRunPreviewResource resource returned |  -  |
**400** | No environment parameter was provided.  No id parameter was provided. |  -  |

<a name="getRunbookRunPreviewForRunbookSnapshotSpaces"></a>
# **getRunbookRunPreviewForRunbookSnapshotSpaces**
> RunbookRunPreviewResource getRunbookRunPreviewForRunbookSnapshotSpaces(baseSpaceId, environment, id)



Gets a document that describes what steps will/won&#39;t be run during a run to a given environment (and tenant if supplied).

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookSnapshotsApi;

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

    RunbookSnapshotsApi apiInstance = new RunbookSnapshotsApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String environment = "environment_example"; // String | ID of the environment
    String id = "id_example"; // String | ID of the resource
    try {
      RunbookRunPreviewResource result = apiInstance.getRunbookRunPreviewForRunbookSnapshotSpaces(baseSpaceId, environment, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookSnapshotsApi#getRunbookRunPreviewForRunbookSnapshotSpaces");
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
 **environment** | **String**| ID of the environment |
 **id** | **String**| ID of the resource |

### Return type

[**RunbookRunPreviewResource**](RunbookRunPreviewResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | RunbookRunPreviewResource resource returned |  -  |
**400** | No environment parameter was provided.  No id parameter was provided. |  -  |

<a name="getRunbookRunPreviewForRunbookSnapshotSpaces1"></a>
# **getRunbookRunPreviewForRunbookSnapshotSpaces1**
> RunbookRunPreviewResource getRunbookRunPreviewForRunbookSnapshotSpaces1(baseSpaceId, environment, id, tenant)



Gets a document that describes what steps will/won&#39;t be run during a run to a given environment (and tenant if supplied).

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookSnapshotsApi;

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

    RunbookSnapshotsApi apiInstance = new RunbookSnapshotsApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String environment = "environment_example"; // String | ID of the environment
    String id = "id_example"; // String | ID of the resource
    String tenant = "tenant_example"; // String | ID of the tenant
    try {
      RunbookRunPreviewResource result = apiInstance.getRunbookRunPreviewForRunbookSnapshotSpaces1(baseSpaceId, environment, id, tenant);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookSnapshotsApi#getRunbookRunPreviewForRunbookSnapshotSpaces1");
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
 **environment** | **String**| ID of the environment |
 **id** | **String**| ID of the resource |
 **tenant** | **String**| ID of the tenant |

### Return type

[**RunbookRunPreviewResource**](RunbookRunPreviewResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | RunbookRunPreviewResource resource returned |  -  |
**400** | No environment parameter was provided.  No id parameter was provided. |  -  |

<a name="getRunbookRunTemplateForRunbookSnapshot"></a>
# **getRunbookRunTemplateForRunbookSnapshot**
> RunbookRunTemplateResource getRunbookRunTemplateForRunbookSnapshot(id)



Gets all of the information necessary for creating or editing a run for this snapshot.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookSnapshotsApi;

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

    RunbookSnapshotsApi apiInstance = new RunbookSnapshotsApi(defaultClient);
    String id = "id_example"; // String | ID of the resource
    try {
      RunbookRunTemplateResource result = apiInstance.getRunbookRunTemplateForRunbookSnapshot(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookSnapshotsApi#getRunbookRunTemplateForRunbookSnapshot");
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

[**RunbookRunTemplateResource**](RunbookRunTemplateResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | RunbookRunTemplateResource resource returned |  -  |
**400** | No id parameter was provided. |  -  |

<a name="getRunbookRunTemplateForRunbookSnapshotSpaces"></a>
# **getRunbookRunTemplateForRunbookSnapshotSpaces**
> RunbookRunTemplateResource getRunbookRunTemplateForRunbookSnapshotSpaces(baseSpaceId, id)



Gets all of the information necessary for creating or editing a run for this snapshot.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookSnapshotsApi;

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

    RunbookSnapshotsApi apiInstance = new RunbookSnapshotsApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the resource
    try {
      RunbookRunTemplateResource result = apiInstance.getRunbookRunTemplateForRunbookSnapshotSpaces(baseSpaceId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookSnapshotsApi#getRunbookRunTemplateForRunbookSnapshotSpaces");
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

[**RunbookRunTemplateResource**](RunbookRunTemplateResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | RunbookRunTemplateResource resource returned |  -  |
**400** | No id parameter was provided. |  -  |

<a name="getRunbookSnapshotById"></a>
# **getRunbookSnapshotById**
> RunbookSnapshotResource getRunbookSnapshotById(id)

Get a Runbook Snapshot by ID

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookSnapshotsApi;

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

    RunbookSnapshotsApi apiInstance = new RunbookSnapshotsApi(defaultClient);
    String id = "id_example"; // String | ID of the RunbookSnapshot to load
    try {
      RunbookSnapshotResource result = apiInstance.getRunbookSnapshotById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookSnapshotsApi#getRunbookSnapshotById");
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
 **id** | **String**| ID of the RunbookSnapshot to load |

### Return type

[**RunbookSnapshotResource**](RunbookSnapshotResource.md)

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

<a name="getRunbookSnapshotByIdSpaces"></a>
# **getRunbookSnapshotByIdSpaces**
> RunbookSnapshotResource getRunbookSnapshotByIdSpaces(id, baseSpaceId)

Get a Runbook Snapshot by ID

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookSnapshotsApi;

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

    RunbookSnapshotsApi apiInstance = new RunbookSnapshotsApi(defaultClient);
    String id = "id_example"; // String | ID of the RunbookSnapshot to load
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    try {
      RunbookSnapshotResource result = apiInstance.getRunbookSnapshotByIdSpaces(id, baseSpaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookSnapshotsApi#getRunbookSnapshotByIdSpaces");
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
 **id** | **String**| ID of the RunbookSnapshot to load |
 **baseSpaceId** | **String**| ID of the space |

### Return type

[**RunbookSnapshotResource**](RunbookSnapshotResource.md)

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

<a name="getRunbookSnapshotByProjectAndName"></a>
# **getRunbookSnapshotByProjectAndName**
> RunbookSnapshotResource getRunbookSnapshotByProjectAndName(id, name)



Gets a single runbookSnapshot by project ID and name.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookSnapshotsApi;

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

    RunbookSnapshotsApi apiInstance = new RunbookSnapshotsApi(defaultClient);
    String id = "id_example"; // String | ID of the resource
    String name = "name_example"; // String | Name of the runbook
    try {
      RunbookSnapshotResource result = apiInstance.getRunbookSnapshotByProjectAndName(id, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookSnapshotsApi#getRunbookSnapshotByProjectAndName");
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
 **name** | **String**| Name of the runbook |

### Return type

[**RunbookSnapshotResource**](RunbookSnapshotResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | RunbookSnapshotResource resource returned |  -  |
**400** | No id parameter was provided.  No name parameter was provided. |  -  |

<a name="getRunbookSnapshotByProjectAndNameSpaces"></a>
# **getRunbookSnapshotByProjectAndNameSpaces**
> RunbookSnapshotResource getRunbookSnapshotByProjectAndNameSpaces(baseSpaceId, id, name)



Gets a single runbookSnapshot by project ID and name.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookSnapshotsApi;

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

    RunbookSnapshotsApi apiInstance = new RunbookSnapshotsApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the resource
    String name = "name_example"; // String | Name of the runbook
    try {
      RunbookSnapshotResource result = apiInstance.getRunbookSnapshotByProjectAndNameSpaces(baseSpaceId, id, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookSnapshotsApi#getRunbookSnapshotByProjectAndNameSpaces");
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
 **name** | **String**| Name of the runbook |

### Return type

[**RunbookSnapshotResource**](RunbookSnapshotResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | RunbookSnapshotResource resource returned |  -  |
**400** | No id parameter was provided.  No name parameter was provided. |  -  |

<a name="indexProjectRunbookSnapshots"></a>
# **indexProjectRunbookSnapshots**
> RunbookSnapshotResourceCollection indexProjectRunbookSnapshots(id, skip, take)

Get a list of RunbookSnapshotResources for the given ProjectResource

Lists all of the runbookSnapshots that belong to the given project. RunbookSnapshots will be ordered from most recent to least recent.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookSnapshotsApi;

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

    RunbookSnapshotsApi apiInstance = new RunbookSnapshotsApi(defaultClient);
    String id = "id_example"; // String | ID of the Project
    Integer skip = 56; // Integer | Number of items to skip
    Integer take = 56; // Integer | Number of items per page
    try {
      RunbookSnapshotResourceCollection result = apiInstance.indexProjectRunbookSnapshots(id, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookSnapshotsApi#indexProjectRunbookSnapshots");
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
 **id** | **String**| ID of the Project |
 **skip** | **Integer**| Number of items to skip | [optional]
 **take** | **Integer**| Number of items per page | [optional]

### Return type

[**RunbookSnapshotResourceCollection**](RunbookSnapshotResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ResourceCollection_of_RunbookSnapshotResource resource returned |  -  |
**400** | No id parameter was provided. |  -  |

<a name="indexProjectRunbookSnapshotsSpaces"></a>
# **indexProjectRunbookSnapshotsSpaces**
> RunbookSnapshotResourceCollection indexProjectRunbookSnapshotsSpaces(baseSpaceId, id, skip, take)

Get a list of RunbookSnapshotResources for the given ProjectResource

Lists all of the runbookSnapshots that belong to the given project. RunbookSnapshots will be ordered from most recent to least recent.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookSnapshotsApi;

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

    RunbookSnapshotsApi apiInstance = new RunbookSnapshotsApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the Project
    Integer skip = 56; // Integer | Number of items to skip
    Integer take = 56; // Integer | Number of items per page
    try {
      RunbookSnapshotResourceCollection result = apiInstance.indexProjectRunbookSnapshotsSpaces(baseSpaceId, id, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookSnapshotsApi#indexProjectRunbookSnapshotsSpaces");
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
 **id** | **String**| ID of the Project |
 **skip** | **Integer**| Number of items to skip | [optional]
 **take** | **Integer**| Number of items per page | [optional]

### Return type

[**RunbookSnapshotResourceCollection**](RunbookSnapshotResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ResourceCollection_of_RunbookSnapshotResource resource returned |  -  |
**400** | No id parameter was provided. |  -  |

<a name="indexRunbookRunbookSnapshots"></a>
# **indexRunbookRunbookSnapshots**
> RunbookSnapshotResourceCollection indexRunbookRunbookSnapshots(id, skip, take)

Get a list of RunbookSnapshotResources for the given RunbookResource

Lists all of the runbookSnapshots that belong to the given runbook. RunbookSnapshots will be ordered from most recent to least recent.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookSnapshotsApi;

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

    RunbookSnapshotsApi apiInstance = new RunbookSnapshotsApi(defaultClient);
    String id = "id_example"; // String | ID of the Runbook
    Integer skip = 56; // Integer | Number of items to skip
    Integer take = 56; // Integer | Number of items per page
    try {
      RunbookSnapshotResourceCollection result = apiInstance.indexRunbookRunbookSnapshots(id, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookSnapshotsApi#indexRunbookRunbookSnapshots");
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
 **id** | **String**| ID of the Runbook |
 **skip** | **Integer**| Number of items to skip | [optional]
 **take** | **Integer**| Number of items per page | [optional]

### Return type

[**RunbookSnapshotResourceCollection**](RunbookSnapshotResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ResourceCollection_of_RunbookSnapshotResource resource returned |  -  |
**400** | No id parameter was provided. |  -  |

<a name="indexRunbookRunbookSnapshotsSpaces"></a>
# **indexRunbookRunbookSnapshotsSpaces**
> RunbookSnapshotResourceCollection indexRunbookRunbookSnapshotsSpaces(baseSpaceId, id, skip, take)

Get a list of RunbookSnapshotResources for the given RunbookResource

Lists all of the runbookSnapshots that belong to the given runbook. RunbookSnapshots will be ordered from most recent to least recent.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookSnapshotsApi;

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

    RunbookSnapshotsApi apiInstance = new RunbookSnapshotsApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the Runbook
    Integer skip = 56; // Integer | Number of items to skip
    Integer take = 56; // Integer | Number of items per page
    try {
      RunbookSnapshotResourceCollection result = apiInstance.indexRunbookRunbookSnapshotsSpaces(baseSpaceId, id, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookSnapshotsApi#indexRunbookRunbookSnapshotsSpaces");
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
 **id** | **String**| ID of the Runbook |
 **skip** | **Integer**| Number of items to skip | [optional]
 **take** | **Integer**| Number of items per page | [optional]

### Return type

[**RunbookSnapshotResourceCollection**](RunbookSnapshotResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ResourceCollection_of_RunbookSnapshotResource resource returned |  -  |
**400** | No id parameter was provided. |  -  |

<a name="indexRunbookSnapshots"></a>
# **indexRunbookSnapshots**
> RunbookSnapshotResourceCollection indexRunbookSnapshots(skip, take)

Get a list of Runbook Snapshots

Lists all of the snapshots in the supplied Octopus Deploy Space, from all projects. The results will be sorted from most recent to least recent snapshot.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookSnapshotsApi;

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

    RunbookSnapshotsApi apiInstance = new RunbookSnapshotsApi(defaultClient);
    Integer skip = 56; // Integer | Number of items to skip. Defaults to zero
    Integer take = 56; // Integer | Number of items to take. Defaults to 30
    try {
      RunbookSnapshotResourceCollection result = apiInstance.indexRunbookSnapshots(skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookSnapshotsApi#indexRunbookSnapshots");
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

[**RunbookSnapshotResourceCollection**](RunbookSnapshotResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="indexRunbookSnapshotsSpaces"></a>
# **indexRunbookSnapshotsSpaces**
> RunbookSnapshotResourceCollection indexRunbookSnapshotsSpaces(baseSpaceId, skip, take)

Get a list of Runbook Snapshots

Lists all of the snapshots in the supplied Octopus Deploy Space, from all projects. The results will be sorted from most recent to least recent snapshot.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookSnapshotsApi;

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

    RunbookSnapshotsApi apiInstance = new RunbookSnapshotsApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    Integer skip = 56; // Integer | Number of items to skip. Defaults to zero
    Integer take = 56; // Integer | Number of items to take. Defaults to 30
    try {
      RunbookSnapshotResourceCollection result = apiInstance.indexRunbookSnapshotsSpaces(baseSpaceId, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookSnapshotsApi#indexRunbookSnapshotsSpaces");
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

[**RunbookSnapshotResourceCollection**](RunbookSnapshotResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="updateRunbookSnapshot"></a>
# **updateRunbookSnapshot**
> RunbookSnapshotResource updateRunbookSnapshot(id, body)

Modify a RunbookSnapshotResource by ID

Updates an existing snapshot.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookSnapshotsApi;

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

    RunbookSnapshotsApi apiInstance = new RunbookSnapshotsApi(defaultClient);
    String id = "id_example"; // String | ID of the RunbookSnapshotResource to modify
    RunbookSnapshotResource body = new RunbookSnapshotResource(); // RunbookSnapshotResource | The RunbookSnapshotResource resource to create
    try {
      RunbookSnapshotResource result = apiInstance.updateRunbookSnapshot(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookSnapshotsApi#updateRunbookSnapshot");
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
 **id** | **String**| ID of the RunbookSnapshotResource to modify |
 **body** | [**RunbookSnapshotResource**](RunbookSnapshotResource.md)| The RunbookSnapshotResource resource to create | [optional]

### Return type

[**RunbookSnapshotResource**](RunbookSnapshotResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | RunbookSnapshotResource Modified |  -  |
**400** | Model validation failed.  No id parameter was provided.  No request body was supplied.  This resource is read-only and cannot be modified. |  -  |

<a name="updateRunbookSnapshotSpaces"></a>
# **updateRunbookSnapshotSpaces**
> RunbookSnapshotResource updateRunbookSnapshotSpaces(baseSpaceId, id, body)

Modify a RunbookSnapshotResource by ID

Updates an existing snapshot.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.RunbookSnapshotsApi;

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

    RunbookSnapshotsApi apiInstance = new RunbookSnapshotsApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the RunbookSnapshotResource to modify
    RunbookSnapshotResource body = new RunbookSnapshotResource(); // RunbookSnapshotResource | The RunbookSnapshotResource resource to create
    try {
      RunbookSnapshotResource result = apiInstance.updateRunbookSnapshotSpaces(baseSpaceId, id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RunbookSnapshotsApi#updateRunbookSnapshotSpaces");
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
 **id** | **String**| ID of the RunbookSnapshotResource to modify |
 **body** | [**RunbookSnapshotResource**](RunbookSnapshotResource.md)| The RunbookSnapshotResource resource to create | [optional]

### Return type

[**RunbookSnapshotResource**](RunbookSnapshotResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | RunbookSnapshotResource Modified |  -  |
**400** | Model validation failed.  No id parameter was provided.  No request body was supplied.  This resource is read-only and cannot be modified. |  -  |

