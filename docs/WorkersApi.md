# WorkersApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorker**](WorkersApi.md#createWorker) | **POST** /workers | Create a WorkerResource
[**createWorkerSpaces**](WorkersApi.md#createWorkerSpaces) | **POST** /{baseSpaceId}/workers | Create a WorkerResource
[**deleteWorker**](WorkersApi.md#deleteWorker) | **DELETE** /workers/{id} | Delete a WorkerResource by ID
[**deleteWorkerSpaces**](WorkersApi.md#deleteWorkerSpaces) | **DELETE** /{baseSpaceId}/workers/{id} | Delete a WorkerResource by ID
[**getDiscoverWorker**](WorkersApi.md#getDiscoverWorker) | **GET** /workers/discover | 
[**getDiscoverWorkerSpaces**](WorkersApi.md#getDiscoverWorkerSpaces) | **GET** /{baseSpaceId}/workers/discover | 
[**getWorkerById**](WorkersApi.md#getWorkerById) | **GET** /workers/{id} | Get a Worker by ID
[**getWorkerByIdSpaces**](WorkersApi.md#getWorkerByIdSpaces) | **GET** /{baseSpaceId}/workers/{id} | Get a Worker by ID
[**getWorkerConnectionStatus**](WorkersApi.md#getWorkerConnectionStatus) | **GET** /workers/{id}/connection | 
[**getWorkerConnectionStatusSpaces**](WorkersApi.md#getWorkerConnectionStatusSpaces) | **GET** /{baseSpaceId}/workers/{id}/connection | 
[**getWorkerOperatingSystemNamesListAll**](WorkersApi.md#getWorkerOperatingSystemNamesListAll) | **GET** /workers/operatingsystem/names/all | 
[**getWorkerOperatingSystemNamesListAllSpaces**](WorkersApi.md#getWorkerOperatingSystemNamesListAllSpaces) | **GET** /{baseSpaceId}/workers/operatingsystem/names/all | 
[**getWorkerOperatingSystemShellNameListAll**](WorkersApi.md#getWorkerOperatingSystemShellNameListAll) | **GET** /workers/operatingsystem/shells/all | 
[**getWorkerOperatingSystemShellNameListAllSpaces**](WorkersApi.md#getWorkerOperatingSystemShellNameListAllSpaces) | **GET** /{baseSpaceId}/workers/operatingsystem/shells/all | 
[**indexWorkers**](WorkersApi.md#indexWorkers) | **GET** /workers | Get a list of WorkerResources
[**indexWorkersSpaces**](WorkersApi.md#indexWorkersSpaces) | **GET** /{baseSpaceId}/workers | Get a list of WorkerResources
[**listAllWorkers**](WorkersApi.md#listAllWorkers) | **GET** /workers/all | Get a list of WorkerResources
[**listAllWorkersSpaces**](WorkersApi.md#listAllWorkersSpaces) | **GET** /{baseSpaceId}/workers/all | Get a list of WorkerResources
[**updateWorker**](WorkersApi.md#updateWorker) | **PUT** /workers/{id} | Modify a WorkerResource by ID
[**updateWorkerSpaces**](WorkersApi.md#updateWorkerSpaces) | **PUT** /{baseSpaceId}/workers/{id} | Modify a WorkerResource by ID


<a name="createWorker"></a>
# **createWorker**
> WorkerResource createWorker(body)

Create a WorkerResource

Creates a new worker.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.WorkersApi;

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

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    WorkerResource body = new WorkerResource(); // WorkerResource | The WorkerResource resource to create
    try {
      WorkerResource result = apiInstance.createWorker(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#createWorker");
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
 **body** | [**WorkerResource**](WorkerResource.md)| The WorkerResource resource to create | [optional]

### Return type

[**WorkerResource**](WorkerResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | WorkerResource Created |  -  |
**400** | Model validation failed.  No request body was supplied. |  -  |

<a name="createWorkerSpaces"></a>
# **createWorkerSpaces**
> WorkerResource createWorkerSpaces(baseSpaceId, body)

Create a WorkerResource

Creates a new worker.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.WorkersApi;

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

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    WorkerResource body = new WorkerResource(); // WorkerResource | The WorkerResource resource to create
    try {
      WorkerResource result = apiInstance.createWorkerSpaces(baseSpaceId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#createWorkerSpaces");
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
 **body** | [**WorkerResource**](WorkerResource.md)| The WorkerResource resource to create | [optional]

### Return type

[**WorkerResource**](WorkerResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | WorkerResource Created |  -  |
**400** | Model validation failed.  No request body was supplied. |  -  |

<a name="deleteWorker"></a>
# **deleteWorker**
> deleteWorker(id)

Delete a WorkerResource by ID

Deletes an existing worker machine.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.WorkersApi;

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

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    String id = "id_example"; // String | ID of the WorkerResource to delete
    try {
      apiInstance.deleteWorker(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#deleteWorker");
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
 **id** | **String**| ID of the WorkerResource to delete |

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

<a name="deleteWorkerSpaces"></a>
# **deleteWorkerSpaces**
> deleteWorkerSpaces(baseSpaceId, id)

Delete a WorkerResource by ID

Deletes an existing worker machine.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.WorkersApi;

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

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the WorkerResource to delete
    try {
      apiInstance.deleteWorkerSpaces(baseSpaceId, id);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#deleteWorkerSpaces");
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
 **id** | **String**| ID of the WorkerResource to delete |

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

<a name="getDiscoverWorker"></a>
# **getDiscoverWorker**
> MachineResource getDiscoverWorker()



Interrogate a machine for communication details so that it may be added to the installation.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.WorkersApi;

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

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    try {
      MachineResource result = apiInstance.getDiscoverWorker();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getDiscoverWorker");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MachineResource**](MachineResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | MachineResource resource returned |  -  |
**400** | The hostname of the machine to discover must be supplied as URI parameter named &#39;host&#39;.  There was a controlled failure. |  -  |

<a name="getDiscoverWorkerSpaces"></a>
# **getDiscoverWorkerSpaces**
> MachineResource getDiscoverWorkerSpaces(baseSpaceId)



Interrogate a machine for communication details so that it may be added to the installation.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.WorkersApi;

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

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    try {
      MachineResource result = apiInstance.getDiscoverWorkerSpaces(baseSpaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getDiscoverWorkerSpaces");
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

### Return type

[**MachineResource**](MachineResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | MachineResource resource returned |  -  |
**400** | The hostname of the machine to discover must be supplied as URI parameter named &#39;host&#39;.  There was a controlled failure. |  -  |

<a name="getWorkerById"></a>
# **getWorkerById**
> WorkerResource getWorkerById(id)

Get a Worker by ID

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.WorkersApi;

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

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    String id = "id_example"; // String | ID of the Worker to load
    try {
      WorkerResource result = apiInstance.getWorkerById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getWorkerById");
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
 **id** | **String**| ID of the Worker to load |

### Return type

[**WorkerResource**](WorkerResource.md)

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

<a name="getWorkerByIdSpaces"></a>
# **getWorkerByIdSpaces**
> WorkerResource getWorkerByIdSpaces(id, baseSpaceId)

Get a Worker by ID

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.WorkersApi;

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

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    String id = "id_example"; // String | ID of the Worker to load
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    try {
      WorkerResource result = apiInstance.getWorkerByIdSpaces(id, baseSpaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getWorkerByIdSpaces");
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
 **id** | **String**| ID of the Worker to load |
 **baseSpaceId** | **String**| ID of the space |

### Return type

[**WorkerResource**](WorkerResource.md)

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

<a name="getWorkerConnectionStatus"></a>
# **getWorkerConnectionStatus**
> MachineConnectionStatus getWorkerConnectionStatus(id)



Get the status of the network connection between the Octopus server and a worker.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.WorkersApi;

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

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    String id = "id_example"; // String | ID of the resource
    try {
      MachineConnectionStatus result = apiInstance.getWorkerConnectionStatus(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getWorkerConnectionStatus");
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

[**MachineConnectionStatus**](MachineConnectionStatus.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | MachineConnectionStatus resource returned |  -  |
**400** | No id parameter was provided. |  -  |

<a name="getWorkerConnectionStatusSpaces"></a>
# **getWorkerConnectionStatusSpaces**
> MachineConnectionStatus getWorkerConnectionStatusSpaces(baseSpaceId, id)



Get the status of the network connection between the Octopus server and a worker.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.WorkersApi;

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

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the resource
    try {
      MachineConnectionStatus result = apiInstance.getWorkerConnectionStatusSpaces(baseSpaceId, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getWorkerConnectionStatusSpaces");
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

[**MachineConnectionStatus**](MachineConnectionStatus.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | MachineConnectionStatus resource returned |  -  |
**400** | No id parameter was provided. |  -  |

<a name="getWorkerOperatingSystemNamesListAll"></a>
# **getWorkerOperatingSystemNamesListAll**
> List&lt;String&gt; getWorkerOperatingSystemNamesListAll()



Gets all operating system names for workers. The result will be a string array.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.WorkersApi;

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

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    try {
      List<String> result = apiInstance.getWorkerOperatingSystemNamesListAll();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getWorkerOperatingSystemNamesListAll");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | IEnumerable_of_String resource returned |  -  |

<a name="getWorkerOperatingSystemNamesListAllSpaces"></a>
# **getWorkerOperatingSystemNamesListAllSpaces**
> List&lt;String&gt; getWorkerOperatingSystemNamesListAllSpaces(baseSpaceId)



Gets all operating system names for workers. The result will be a string array.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.WorkersApi;

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

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    try {
      List<String> result = apiInstance.getWorkerOperatingSystemNamesListAllSpaces(baseSpaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getWorkerOperatingSystemNamesListAllSpaces");
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

### Return type

**List&lt;String&gt;**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | IEnumerable_of_String resource returned |  -  |

<a name="getWorkerOperatingSystemShellNameListAll"></a>
# **getWorkerOperatingSystemShellNameListAll**
> List&lt;String&gt; getWorkerOperatingSystemShellNameListAll()



Gets all operating system shell names for workers. The result will be a string array.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.WorkersApi;

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

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    try {
      List<String> result = apiInstance.getWorkerOperatingSystemShellNameListAll();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getWorkerOperatingSystemShellNameListAll");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | IEnumerable_of_String resource returned |  -  |

<a name="getWorkerOperatingSystemShellNameListAllSpaces"></a>
# **getWorkerOperatingSystemShellNameListAllSpaces**
> List&lt;String&gt; getWorkerOperatingSystemShellNameListAllSpaces(baseSpaceId)



Gets all operating system shell names for workers. The result will be a string array.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.WorkersApi;

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

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    try {
      List<String> result = apiInstance.getWorkerOperatingSystemShellNameListAllSpaces(baseSpaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getWorkerOperatingSystemShellNameListAllSpaces");
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

### Return type

**List&lt;String&gt;**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | IEnumerable_of_String resource returned |  -  |

<a name="indexWorkers"></a>
# **indexWorkers**
> WorkerResourceCollection indexWorkers(skip, take)

Get a list of WorkerResources

Lists all of the registered worker machines in the supplied Octopus Deploy Space. The results will be sorted alphabetically by name.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.WorkersApi;

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

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    Integer skip = 56; // Integer | Number of items to skip
    Integer take = 56; // Integer | Number of items to take
    try {
      WorkerResourceCollection result = apiInstance.indexWorkers(skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#indexWorkers");
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
 **skip** | **Integer**| Number of items to skip | [optional]
 **take** | **Integer**| Number of items to take | [optional]

### Return type

[**WorkerResourceCollection**](WorkerResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ResourceCollection_of_WorkerResource resource returned |  -  |

<a name="indexWorkersSpaces"></a>
# **indexWorkersSpaces**
> WorkerResourceCollection indexWorkersSpaces(baseSpaceId, skip, take)

Get a list of WorkerResources

Lists all of the registered worker machines in the supplied Octopus Deploy Space. The results will be sorted alphabetically by name.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.WorkersApi;

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

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    Integer skip = 56; // Integer | Number of items to skip
    Integer take = 56; // Integer | Number of items to take
    try {
      WorkerResourceCollection result = apiInstance.indexWorkersSpaces(baseSpaceId, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#indexWorkersSpaces");
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
 **skip** | **Integer**| Number of items to skip | [optional]
 **take** | **Integer**| Number of items to take | [optional]

### Return type

[**WorkerResourceCollection**](WorkerResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | ResourceCollection_of_WorkerResource resource returned |  -  |

<a name="listAllWorkers"></a>
# **listAllWorkers**
> List&lt;WorkerResource&gt; listAllWorkers()

Get a list of WorkerResources

Lists all of the workers in the supplied Octopus Deploy Space. The results will be sorted alphabetically by name.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.WorkersApi;

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

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    try {
      List<WorkerResource> result = apiInstance.listAllWorkers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#listAllWorkers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;WorkerResource&gt;**](WorkerResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Load all WorkerResource |  -  |

<a name="listAllWorkersSpaces"></a>
# **listAllWorkersSpaces**
> List&lt;WorkerResource&gt; listAllWorkersSpaces(baseSpaceId)

Get a list of WorkerResources

Lists all of the workers in the supplied Octopus Deploy Space. The results will be sorted alphabetically by name.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.WorkersApi;

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

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    try {
      List<WorkerResource> result = apiInstance.listAllWorkersSpaces(baseSpaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#listAllWorkersSpaces");
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

### Return type

[**List&lt;WorkerResource&gt;**](WorkerResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Load all WorkerResource |  -  |

<a name="updateWorker"></a>
# **updateWorker**
> WorkerResource updateWorker(id, body)

Modify a WorkerResource by ID

Modifies an existing worker machine.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.WorkersApi;

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

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    String id = "id_example"; // String | ID of the WorkerResource to modify
    WorkerResource body = new WorkerResource(); // WorkerResource | The WorkerResource resource to create
    try {
      WorkerResource result = apiInstance.updateWorker(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#updateWorker");
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
 **id** | **String**| ID of the WorkerResource to modify |
 **body** | [**WorkerResource**](WorkerResource.md)| The WorkerResource resource to create | [optional]

### Return type

[**WorkerResource**](WorkerResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | WorkerResource Modified |  -  |
**400** | Model validation failed.  No id parameter was provided.  No request body was supplied.  This resource is read-only and cannot be modified. |  -  |

<a name="updateWorkerSpaces"></a>
# **updateWorkerSpaces**
> WorkerResource updateWorkerSpaces(baseSpaceId, id, body)

Modify a WorkerResource by ID

Modifies an existing worker machine.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.WorkersApi;

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

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String id = "id_example"; // String | ID of the WorkerResource to modify
    WorkerResource body = new WorkerResource(); // WorkerResource | The WorkerResource resource to create
    try {
      WorkerResource result = apiInstance.updateWorkerSpaces(baseSpaceId, id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#updateWorkerSpaces");
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
 **id** | **String**| ID of the WorkerResource to modify |
 **body** | [**WorkerResource**](WorkerResource.md)| The WorkerResource resource to create | [optional]

### Return type

[**WorkerResource**](WorkerResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | WorkerResource Modified |  -  |
**400** | Model validation failed.  No id parameter was provided.  No request body was supplied.  This resource is read-only and cannot be modified. |  -  |

