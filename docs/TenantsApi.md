# TenantsApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTenant**](TenantsApi.md#createTenant) | **POST** /tenants | Creates a new Tenant
[**createTenantLogo**](TenantsApi.md#createTenantLogo) | **POST** /tenants/{id}/logo | Sets the logo associated with the tenant.
[**createTenantLogoSpaces**](TenantsApi.md#createTenantLogoSpaces) | **POST** /{baseSpaceId}/tenants/{id}/logo | Sets the logo associated with the tenant.
[**createTenantSpaces**](TenantsApi.md#createTenantSpaces) | **POST** /{baseSpaceId}/tenants | Creates a new Tenant
[**createTenantVariables**](TenantsApi.md#createTenantVariables) | **POST** /tenants/{id}/variables | Creates the variables associated with the tenant.
[**createTenantVariablesSpaces**](TenantsApi.md#createTenantVariablesSpaces) | **POST** /{baseSpaceId}/tenants/{id}/variables | Creates the variables associated with the tenant.
[**deleteTenant**](TenantsApi.md#deleteTenant) | **DELETE** /tenants/{id} | Deletes an existing tenant.
[**deleteTenantSpaces**](TenantsApi.md#deleteTenantSpaces) | **DELETE** /{baseSpaceId}/tenants/{id} | Deletes an existing tenant.
[**getTenantById**](TenantsApi.md#getTenantById) | **GET** /tenants/{id} | Get a Tenant by ID
[**getTenantByIdSpaces**](TenantsApi.md#getTenantByIdSpaces) | **GET** /{baseSpaceId}/tenants/{id} | Get a Tenant by ID
[**getTenantLogo**](TenantsApi.md#getTenantLogo) | **GET** /tenants/{id}/logo | Gets the logo associated with the Tenant
[**getTenantLogoSpaces**](TenantsApi.md#getTenantLogoSpaces) | **GET** /{baseSpaceId}/tenants/{id}/logo | Gets the logo associated with the Tenant
[**getTenantVariablesMissing**](TenantsApi.md#getTenantVariablesMissing) | **GET** /tenants/variables-missing | Returns a list of tenants who are missing required variables
[**getTenantVariablesMissingSpaces**](TenantsApi.md#getTenantVariablesMissingSpaces) | **GET** /{baseSpaceId}/tenants/variables-missing | Returns a list of tenants who are missing required variables
[**getTenantsConfiguration**](TenantsApi.md#getTenantsConfiguration) | **GET** /tenants/status | Reports back the status of multi-tenancy
[**getTenantsConfigurationSpaces**](TenantsApi.md#getTenantsConfigurationSpaces) | **GET** /{baseSpaceId}/tenants/status | Reports back the status of multi-tenancy
[**getVariablesByTenantId**](TenantsApi.md#getVariablesByTenantId) | **GET** /tenants/{id}/variables | Gets variables associated with the provided tenant ID.
[**getVariablesByTenantIdSpaces**](TenantsApi.md#getVariablesByTenantIdSpaces) | **GET** /{baseSpaceId}/tenants/{id}/variables | Gets variables associated with the provided tenant ID.
[**listAllTenants**](TenantsApi.md#listAllTenants) | **GET** /tenants/all | Lists all tenants
[**listAllTenantsSpaces**](TenantsApi.md#listAllTenantsSpaces) | **GET** /{baseSpaceId}/tenants/all | Lists all tenants
[**listTenants**](TenantsApi.md#listTenants) | **GET** /tenants | Gets a list of tenants
[**listTenantsSpaces**](TenantsApi.md#listTenantsSpaces) | **GET** /{baseSpaceId}/tenants | Gets a list of tenants
[**testTenantTag**](TenantsApi.md#testTenantTag) | **GET** /tenants/tag-test | Checks tenants for matching tags
[**testTenantTagSpaces**](TenantsApi.md#testTenantTagSpaces) | **GET** /{baseSpaceId}/tenants/tag-test | Checks tenants for matching tags
[**updateTenant**](TenantsApi.md#updateTenant) | **PUT** /tenants/{id} | Modifies an existing Tenant
[**updateTenantLogo**](TenantsApi.md#updateTenantLogo) | **PUT** /tenants/{id}/logo | Updates the logo associated with the tenant.
[**updateTenantLogoSpaces**](TenantsApi.md#updateTenantLogoSpaces) | **PUT** /{baseSpaceId}/tenants/{id}/logo | Updates the logo associated with the tenant.
[**updateTenantSpaces**](TenantsApi.md#updateTenantSpaces) | **PUT** /{baseSpaceId}/tenants/{id} | Modifies an existing Tenant
[**updateTenantVariables**](TenantsApi.md#updateTenantVariables) | **PUT** /tenants/{id}/variables | Updates the variables associated with the tenant.
[**updateTenantVariablesSpaces**](TenantsApi.md#updateTenantVariablesSpaces) | **PUT** /{baseSpaceId}/tenants/{id}/variables | Updates the variables associated with the tenant.


<a name="createTenant"></a>
# **createTenant**
> TenantResource createTenant(clone, body)

Creates a new Tenant

Creates a new Tenant, optionally cloning an existing tenant if the clone query string parameter is provided.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String clone = "clone_example"; // String | The ID of the Tenant to clone. Example: Tenants-101
    TenantResource body = new TenantResource(); // TenantResource | 
    try {
      TenantResource result = apiInstance.createTenant(clone, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#createTenant");
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
 **clone** | **String**| The ID of the Tenant to clone. Example: Tenants-101 | [optional]
 **body** | [**TenantResource**](TenantResource.md)|  | [optional]

### Return type

[**TenantResource**](TenantResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Tenant Created |  -  |
**400** | Validation Failed |  -  |
**415** | No Tenant resource provided |  -  |

<a name="createTenantLogo"></a>
# **createTenantLogo**
> createTenantLogo(id)

Sets the logo associated with the tenant.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String id = "id_example"; // String | ID of the Tenant to set the logo for
    try {
      apiInstance.createTenantLogo(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#createTenantLogo");
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
 **id** | **String**| ID of the Tenant to set the logo for |

### Return type

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid or unsupported image provided. |  -  |
**404** | No ID parameter was provided. |  -  |

<a name="createTenantLogoSpaces"></a>
# **createTenantLogoSpaces**
> createTenantLogoSpaces(id, baseSpaceId)

Sets the logo associated with the tenant.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String id = "id_example"; // String | ID of the Tenant to set the logo for
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    try {
      apiInstance.createTenantLogoSpaces(id, baseSpaceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#createTenantLogoSpaces");
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
 **id** | **String**| ID of the Tenant to set the logo for |
 **baseSpaceId** | **String**| ID of the space |

### Return type

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid or unsupported image provided. |  -  |
**404** | No ID parameter was provided. |  -  |

<a name="createTenantSpaces"></a>
# **createTenantSpaces**
> TenantResource createTenantSpaces(baseSpaceId, clone, body)

Creates a new Tenant

Creates a new Tenant, optionally cloning an existing tenant if the clone query string parameter is provided.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String clone = "clone_example"; // String | The ID of the Tenant to clone. Example: Tenants-101
    TenantResource body = new TenantResource(); // TenantResource | 
    try {
      TenantResource result = apiInstance.createTenantSpaces(baseSpaceId, clone, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#createTenantSpaces");
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
 **clone** | **String**| The ID of the Tenant to clone. Example: Tenants-101 | [optional]
 **body** | [**TenantResource**](TenantResource.md)|  | [optional]

### Return type

[**TenantResource**](TenantResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Tenant Created |  -  |
**400** | Validation Failed |  -  |
**415** | No Tenant resource provided |  -  |

<a name="createTenantVariables"></a>
# **createTenantVariables**
> TenantVariableResource createTenantVariables(id, body)

Creates the variables associated with the tenant.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String id = "id_example"; // String | ID of the Tenant to modify
    TenantVariableResource body = new TenantVariableResource(); // TenantVariableResource | 
    try {
      TenantVariableResource result = apiInstance.createTenantVariables(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#createTenantVariables");
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
 **id** | **String**| ID of the Tenant to modify |
 **body** | [**TenantVariableResource**](TenantVariableResource.md)|  | [optional]

### Return type

[**TenantVariableResource**](TenantVariableResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="createTenantVariablesSpaces"></a>
# **createTenantVariablesSpaces**
> TenantVariableResource createTenantVariablesSpaces(id, baseSpaceId, body)

Creates the variables associated with the tenant.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String id = "id_example"; // String | ID of the Tenant to modify
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    TenantVariableResource body = new TenantVariableResource(); // TenantVariableResource | 
    try {
      TenantVariableResource result = apiInstance.createTenantVariablesSpaces(id, baseSpaceId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#createTenantVariablesSpaces");
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
 **id** | **String**| ID of the Tenant to modify |
 **baseSpaceId** | **String**| ID of the space |
 **body** | [**TenantVariableResource**](TenantVariableResource.md)|  | [optional]

### Return type

[**TenantVariableResource**](TenantVariableResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="deleteTenant"></a>
# **deleteTenant**
> deleteTenant(id)

Deletes an existing tenant.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String id = "id_example"; // String | ID of the Tenant to delete
    try {
      apiInstance.deleteTenant(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#deleteTenant");
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
 **id** | **String**| ID of the Tenant to delete |

### Return type

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | This tenant has dependent resources and cannot be deleted |  -  |
**404** | The tenant doesn&#39;t exist |  -  |

<a name="deleteTenantSpaces"></a>
# **deleteTenantSpaces**
> deleteTenantSpaces(id, baseSpaceId)

Deletes an existing tenant.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String id = "id_example"; // String | ID of the Tenant to delete
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    try {
      apiInstance.deleteTenantSpaces(id, baseSpaceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#deleteTenantSpaces");
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
 **id** | **String**| ID of the Tenant to delete |
 **baseSpaceId** | **String**| ID of the space |

### Return type

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | This tenant has dependent resources and cannot be deleted |  -  |
**404** | The tenant doesn&#39;t exist |  -  |

<a name="getTenantById"></a>
# **getTenantById**
> TenantResource getTenantById(id)

Get a Tenant by ID

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String id = "id_example"; // String | ID of the Tenant to load
    try {
      TenantResource result = apiInstance.getTenantById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#getTenantById");
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
 **id** | **String**| ID of the Tenant to load |

### Return type

[**TenantResource**](TenantResource.md)

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

<a name="getTenantByIdSpaces"></a>
# **getTenantByIdSpaces**
> TenantResource getTenantByIdSpaces(id, baseSpaceId)

Get a Tenant by ID

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String id = "id_example"; // String | ID of the Tenant to load
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    try {
      TenantResource result = apiInstance.getTenantByIdSpaces(id, baseSpaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#getTenantByIdSpaces");
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
 **id** | **String**| ID of the Tenant to load |
 **baseSpaceId** | **String**| ID of the space |

### Return type

[**TenantResource**](TenantResource.md)

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

<a name="getTenantLogo"></a>
# **getTenantLogo**
> getTenantLogo(id)

Gets the logo associated with the Tenant

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String id = "id_example"; // String | ID of the Tenant to retrieve the logo for
    try {
      apiInstance.getTenantLogo(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#getTenantLogo");
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
 **id** | **String**| ID of the Tenant to retrieve the logo for |

### Return type

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/png, image/jpeg, image/svg+xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**304** | Not Modified |  -  |
**404** | No ID parameter was provided. |  -  |

<a name="getTenantLogoSpaces"></a>
# **getTenantLogoSpaces**
> getTenantLogoSpaces(id, baseSpaceId)

Gets the logo associated with the Tenant

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String id = "id_example"; // String | ID of the Tenant to retrieve the logo for
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    try {
      apiInstance.getTenantLogoSpaces(id, baseSpaceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#getTenantLogoSpaces");
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
 **id** | **String**| ID of the Tenant to retrieve the logo for |
 **baseSpaceId** | **String**| ID of the space |

### Return type

null (empty response body)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/png, image/jpeg, image/svg+xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**304** | Not Modified |  -  |
**404** | No ID parameter was provided. |  -  |

<a name="getTenantVariablesMissing"></a>
# **getTenantVariablesMissing**
> List&lt;TenantsMissingVariablesResource&gt; getTenantVariablesMissing(tenantId, projectId, environmentId, includeDetails)

Returns a list of tenants who are missing required variables

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String tenantId = "tenantId_example"; // String | An ID for a Tenant. If supplied, will limit the result to variables missing for the Tenant identified by the ID. Example: Tenants-101
    String projectId = "projectId_example"; // String | A Project ID, to limit the set of inspected Tenants to those connected to a particular Project. Example: Projects-202
    String environmentId = "environmentId_example"; // String | An Environment ID, to limit the set of inspected Tenants to those connected to a particular Environment. Example: Environments-202
    Boolean includeDetails = true; // Boolean | A switch to indicate whether missing variable details should be returned along with names
    try {
      List<TenantsMissingVariablesResource> result = apiInstance.getTenantVariablesMissing(tenantId, projectId, environmentId, includeDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#getTenantVariablesMissing");
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
 **tenantId** | **String**| An ID for a Tenant. If supplied, will limit the result to variables missing for the Tenant identified by the ID. Example: Tenants-101 | [optional]
 **projectId** | **String**| A Project ID, to limit the set of inspected Tenants to those connected to a particular Project. Example: Projects-202 | [optional]
 **environmentId** | **String**| An Environment ID, to limit the set of inspected Tenants to those connected to a particular Environment. Example: Environments-202 | [optional]
 **includeDetails** | **Boolean**| A switch to indicate whether missing variable details should be returned along with names | [optional]

### Return type

[**List&lt;TenantsMissingVariablesResource&gt;**](TenantsMissingVariablesResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getTenantVariablesMissingSpaces"></a>
# **getTenantVariablesMissingSpaces**
> List&lt;TenantsMissingVariablesResource&gt; getTenantVariablesMissingSpaces(baseSpaceId, tenantId, projectId, environmentId, includeDetails)

Returns a list of tenants who are missing required variables

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String tenantId = "tenantId_example"; // String | An ID for a Tenant. If supplied, will limit the result to variables missing for the Tenant identified by the ID. Example: Tenants-101
    String projectId = "projectId_example"; // String | A Project ID, to limit the set of inspected Tenants to those connected to a particular Project. Example: Projects-202
    String environmentId = "environmentId_example"; // String | An Environment ID, to limit the set of inspected Tenants to those connected to a particular Environment. Example: Environments-202
    Boolean includeDetails = true; // Boolean | A switch to indicate whether missing variable details should be returned along with names
    try {
      List<TenantsMissingVariablesResource> result = apiInstance.getTenantVariablesMissingSpaces(baseSpaceId, tenantId, projectId, environmentId, includeDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#getTenantVariablesMissingSpaces");
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
 **tenantId** | **String**| An ID for a Tenant. If supplied, will limit the result to variables missing for the Tenant identified by the ID. Example: Tenants-101 | [optional]
 **projectId** | **String**| A Project ID, to limit the set of inspected Tenants to those connected to a particular Project. Example: Projects-202 | [optional]
 **environmentId** | **String**| An Environment ID, to limit the set of inspected Tenants to those connected to a particular Environment. Example: Environments-202 | [optional]
 **includeDetails** | **Boolean**| A switch to indicate whether missing variable details should be returned along with names | [optional]

### Return type

[**List&lt;TenantsMissingVariablesResource&gt;**](TenantsMissingVariablesResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getTenantsConfiguration"></a>
# **getTenantsConfiguration**
> MultiTenancyStatusResource getTenantsConfiguration()

Reports back the status of multi-tenancy

If multi-tenancy is enabled, \&quot;Enabled\&quot; will be true, otherwise it will be false.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    try {
      MultiTenancyStatusResource result = apiInstance.getTenantsConfiguration();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#getTenantsConfiguration");
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

[**MultiTenancyStatusResource**](MultiTenancyStatusResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getTenantsConfigurationSpaces"></a>
# **getTenantsConfigurationSpaces**
> MultiTenancyStatusResource getTenantsConfigurationSpaces(baseSpaceId)

Reports back the status of multi-tenancy

If multi-tenancy is enabled, \&quot;Enabled\&quot; will be true, otherwise it will be false.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    try {
      MultiTenancyStatusResource result = apiInstance.getTenantsConfigurationSpaces(baseSpaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#getTenantsConfigurationSpaces");
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

[**MultiTenancyStatusResource**](MultiTenancyStatusResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getVariablesByTenantId"></a>
# **getVariablesByTenantId**
> TenantVariableResource getVariablesByTenantId(id)

Gets variables associated with the provided tenant ID.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String id = "id_example"; // String | Id of the Tenant to retrieve variables for
    try {
      TenantVariableResource result = apiInstance.getVariablesByTenantId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#getVariablesByTenantId");
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
 **id** | **String**| Id of the Tenant to retrieve variables for |

### Return type

[**TenantVariableResource**](TenantVariableResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Tenant not found. |  -  |

<a name="getVariablesByTenantIdSpaces"></a>
# **getVariablesByTenantIdSpaces**
> TenantVariableResource getVariablesByTenantIdSpaces(id, baseSpaceId)

Gets variables associated with the provided tenant ID.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String id = "id_example"; // String | Id of the Tenant to retrieve variables for
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    try {
      TenantVariableResource result = apiInstance.getVariablesByTenantIdSpaces(id, baseSpaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#getVariablesByTenantIdSpaces");
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
 **id** | **String**| Id of the Tenant to retrieve variables for |
 **baseSpaceId** | **String**| ID of the space |

### Return type

[**TenantVariableResource**](TenantVariableResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Tenant not found. |  -  |

<a name="listAllTenants"></a>
# **listAllTenants**
> List&lt;TenantResource&gt; listAllTenants(ids, projectId, tags, name, partialName)

Lists all tenants

Lists all of the tenants in the supplied Octopus Deploy Space. The results will be sorted alphabetically by name.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    List<String> ids = Arrays.asList(); // List<String> | A set of Tenant IDs to retrieve Tenants for. Example: Tenants-101,Tenants-201,Tenants-301
    String projectId = "projectId_example"; // String | A Project ID, to limit the set of retrieved Tenants to those connected to a particular Project. Example: Projects-101
    List<String> tags = Arrays.asList(); // List<String> | A set of Tenant Tags, to limit the set of retrieved Tenants to those which are tagged with the specific tags. Example: Alpha,Beta,Stable
    String name = "name_example"; // String | (Obsolete) A partial or complete name to limit the set of retrieved Tenants to. This will perform a \"contains\" style match against the supplied name or name-fragment. Left for backwards compatibility.
    String partialName = "partialName_example"; // String | A partial or complete name to limit the set of retrieved Tenants to. This will perform a \"contains\" style match against the supplied name or name-fragment
    try {
      List<TenantResource> result = apiInstance.listAllTenants(ids, projectId, tags, name, partialName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#listAllTenants");
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
 **ids** | [**List&lt;String&gt;**](String.md)| A set of Tenant IDs to retrieve Tenants for. Example: Tenants-101,Tenants-201,Tenants-301 | [optional]
 **projectId** | **String**| A Project ID, to limit the set of retrieved Tenants to those connected to a particular Project. Example: Projects-101 | [optional]
 **tags** | [**List&lt;String&gt;**](String.md)| A set of Tenant Tags, to limit the set of retrieved Tenants to those which are tagged with the specific tags. Example: Alpha,Beta,Stable | [optional]
 **name** | **String**| (Obsolete) A partial or complete name to limit the set of retrieved Tenants to. This will perform a \&quot;contains\&quot; style match against the supplied name or name-fragment. Left for backwards compatibility. | [optional]
 **partialName** | **String**| A partial or complete name to limit the set of retrieved Tenants to. This will perform a \&quot;contains\&quot; style match against the supplied name or name-fragment | [optional]

### Return type

[**List&lt;TenantResource&gt;**](TenantResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**304** | Tenants Not Modified |  -  |

<a name="listAllTenantsSpaces"></a>
# **listAllTenantsSpaces**
> List&lt;TenantResource&gt; listAllTenantsSpaces(baseSpaceId, ids, projectId, tags, name, partialName)

Lists all tenants

Lists all of the tenants in the supplied Octopus Deploy Space. The results will be sorted alphabetically by name.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    List<String> ids = Arrays.asList(); // List<String> | A set of Tenant IDs to retrieve Tenants for. Example: Tenants-101,Tenants-201,Tenants-301
    String projectId = "projectId_example"; // String | A Project ID, to limit the set of retrieved Tenants to those connected to a particular Project. Example: Projects-101
    List<String> tags = Arrays.asList(); // List<String> | A set of Tenant Tags, to limit the set of retrieved Tenants to those which are tagged with the specific tags. Example: Alpha,Beta,Stable
    String name = "name_example"; // String | (Obsolete) A partial or complete name to limit the set of retrieved Tenants to. This will perform a \"contains\" style match against the supplied name or name-fragment. Left for backwards compatibility.
    String partialName = "partialName_example"; // String | A partial or complete name to limit the set of retrieved Tenants to. This will perform a \"contains\" style match against the supplied name or name-fragment
    try {
      List<TenantResource> result = apiInstance.listAllTenantsSpaces(baseSpaceId, ids, projectId, tags, name, partialName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#listAllTenantsSpaces");
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
 **ids** | [**List&lt;String&gt;**](String.md)| A set of Tenant IDs to retrieve Tenants for. Example: Tenants-101,Tenants-201,Tenants-301 | [optional]
 **projectId** | **String**| A Project ID, to limit the set of retrieved Tenants to those connected to a particular Project. Example: Projects-101 | [optional]
 **tags** | [**List&lt;String&gt;**](String.md)| A set of Tenant Tags, to limit the set of retrieved Tenants to those which are tagged with the specific tags. Example: Alpha,Beta,Stable | [optional]
 **name** | **String**| (Obsolete) A partial or complete name to limit the set of retrieved Tenants to. This will perform a \&quot;contains\&quot; style match against the supplied name or name-fragment. Left for backwards compatibility. | [optional]
 **partialName** | **String**| A partial or complete name to limit the set of retrieved Tenants to. This will perform a \&quot;contains\&quot; style match against the supplied name or name-fragment | [optional]

### Return type

[**List&lt;TenantResource&gt;**](TenantResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**304** | Tenants Not Modified |  -  |

<a name="listTenants"></a>
# **listTenants**
> TenantResourceCollection listTenants(projectId, ids, tags, name, partialName, clonedFromTenantId, skip, take)

Gets a list of tenants

Lists all of the tenants in the supplied Octopus Deploy Space. The results will be sorted alphabetically by name, and returned 30 at a time.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String projectId = "projectId_example"; // String | A Project ID, to limit the set of Tenants to those connected to a particular Project. Example: Projects-1
    List<String> ids = Arrays.asList(); // List<String> | A list of Tenant IDs, to limit the matching of Tenants to those with a particular ID. Example: [\"Tenants-1\", \"Tenants-2\"]
    List<String> tags = Arrays.asList(); // List<String> | A set of Tenant Tags, to limit the set of retrieved Tenants to those which are tagged with the specific tags. Example: Alpha,Beta,Stable
    String name = "name_example"; // String | (Obsolete) A partial or complete name to limit the set of retrieved Tenants to. This will perform a \"contains\" style match against the supplied name or name-fragment. Left for backwards compatibility.
    String partialName = "partialName_example"; // String | A partial name, to limit the set of Tenants to those with a name that includes the partial name
    String clonedFromTenantId = "clonedFromTenantId_example"; // String | A Tenant ID, to limit the included Tenants to those cloned from that Tenant. Example: Tenants-1
    Integer skip = 56; // Integer | Number of items to skip. Defaults to zero
    Integer take = 56; // Integer | Number of items to take. Defaults to 30
    try {
      TenantResourceCollection result = apiInstance.listTenants(projectId, ids, tags, name, partialName, clonedFromTenantId, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#listTenants");
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
 **projectId** | **String**| A Project ID, to limit the set of Tenants to those connected to a particular Project. Example: Projects-1 | [optional]
 **ids** | [**List&lt;String&gt;**](String.md)| A list of Tenant IDs, to limit the matching of Tenants to those with a particular ID. Example: [\&quot;Tenants-1\&quot;, \&quot;Tenants-2\&quot;] | [optional]
 **tags** | [**List&lt;String&gt;**](String.md)| A set of Tenant Tags, to limit the set of retrieved Tenants to those which are tagged with the specific tags. Example: Alpha,Beta,Stable | [optional]
 **name** | **String**| (Obsolete) A partial or complete name to limit the set of retrieved Tenants to. This will perform a \&quot;contains\&quot; style match against the supplied name or name-fragment. Left for backwards compatibility. | [optional]
 **partialName** | **String**| A partial name, to limit the set of Tenants to those with a name that includes the partial name | [optional]
 **clonedFromTenantId** | **String**| A Tenant ID, to limit the included Tenants to those cloned from that Tenant. Example: Tenants-1 | [optional]
 **skip** | **Integer**| Number of items to skip. Defaults to zero | [optional]
 **take** | **Integer**| Number of items to take. Defaults to 30 | [optional]

### Return type

[**TenantResourceCollection**](TenantResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="listTenantsSpaces"></a>
# **listTenantsSpaces**
> TenantResourceCollection listTenantsSpaces(baseSpaceId, projectId, ids, tags, name, partialName, clonedFromTenantId, skip, take)

Gets a list of tenants

Lists all of the tenants in the supplied Octopus Deploy Space. The results will be sorted alphabetically by name, and returned 30 at a time.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    String projectId = "projectId_example"; // String | A Project ID, to limit the set of Tenants to those connected to a particular Project. Example: Projects-1
    List<String> ids = Arrays.asList(); // List<String> | A list of Tenant IDs, to limit the matching of Tenants to those with a particular ID. Example: [\"Tenants-1\", \"Tenants-2\"]
    List<String> tags = Arrays.asList(); // List<String> | A set of Tenant Tags, to limit the set of retrieved Tenants to those which are tagged with the specific tags. Example: Alpha,Beta,Stable
    String name = "name_example"; // String | (Obsolete) A partial or complete name to limit the set of retrieved Tenants to. This will perform a \"contains\" style match against the supplied name or name-fragment. Left for backwards compatibility.
    String partialName = "partialName_example"; // String | A partial name, to limit the set of Tenants to those with a name that includes the partial name
    String clonedFromTenantId = "clonedFromTenantId_example"; // String | A Tenant ID, to limit the included Tenants to those cloned from that Tenant. Example: Tenants-1
    Integer skip = 56; // Integer | Number of items to skip. Defaults to zero
    Integer take = 56; // Integer | Number of items to take. Defaults to 30
    try {
      TenantResourceCollection result = apiInstance.listTenantsSpaces(baseSpaceId, projectId, ids, tags, name, partialName, clonedFromTenantId, skip, take);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#listTenantsSpaces");
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
 **projectId** | **String**| A Project ID, to limit the set of Tenants to those connected to a particular Project. Example: Projects-1 | [optional]
 **ids** | [**List&lt;String&gt;**](String.md)| A list of Tenant IDs, to limit the matching of Tenants to those with a particular ID. Example: [\&quot;Tenants-1\&quot;, \&quot;Tenants-2\&quot;] | [optional]
 **tags** | [**List&lt;String&gt;**](String.md)| A set of Tenant Tags, to limit the set of retrieved Tenants to those which are tagged with the specific tags. Example: Alpha,Beta,Stable | [optional]
 **name** | **String**| (Obsolete) A partial or complete name to limit the set of retrieved Tenants to. This will perform a \&quot;contains\&quot; style match against the supplied name or name-fragment. Left for backwards compatibility. | [optional]
 **partialName** | **String**| A partial name, to limit the set of Tenants to those with a name that includes the partial name | [optional]
 **clonedFromTenantId** | **String**| A Tenant ID, to limit the included Tenants to those cloned from that Tenant. Example: Tenants-1 | [optional]
 **skip** | **Integer**| Number of items to skip. Defaults to zero | [optional]
 **take** | **Integer**| Number of items to take. Defaults to 30 | [optional]

### Return type

[**TenantResourceCollection**](TenantResourceCollection.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="testTenantTag"></a>
# **testTenantTag**
> Map&lt;String, TagTestResult&gt; testTenantTag(tenantIds, tags)

Checks tenants for matching tags

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    List<String> tenantIds = Arrays.asList(); // List<String> | A list of Tenant IDs to limit the matching to, delimited by commas. Example: Tenants-1,Tenants-2,Tenants-3
    List<String> tags = Arrays.asList(); // List<String> | A list of Tenant Tags to limit the matching to, delimited by commas. Example: Alpha,Beta,Stable
    try {
      Map<String, TagTestResult> result = apiInstance.testTenantTag(tenantIds, tags);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#testTenantTag");
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
 **tenantIds** | [**List&lt;String&gt;**](String.md)| A list of Tenant IDs to limit the matching to, delimited by commas. Example: Tenants-1,Tenants-2,Tenants-3 | [optional]
 **tags** | [**List&lt;String&gt;**](String.md)| A list of Tenant Tags to limit the matching to, delimited by commas. Example: Alpha,Beta,Stable | [optional]

### Return type

[**Map&lt;String, TagTestResult&gt;**](TagTestResult.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="testTenantTagSpaces"></a>
# **testTenantTagSpaces**
> Map&lt;String, TagTestResult&gt; testTenantTagSpaces(baseSpaceId, tenantIds, tags)

Checks tenants for matching tags

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    List<String> tenantIds = Arrays.asList(); // List<String> | A list of Tenant IDs to limit the matching to, delimited by commas. Example: Tenants-1,Tenants-2,Tenants-3
    List<String> tags = Arrays.asList(); // List<String> | A list of Tenant Tags to limit the matching to, delimited by commas. Example: Alpha,Beta,Stable
    try {
      Map<String, TagTestResult> result = apiInstance.testTenantTagSpaces(baseSpaceId, tenantIds, tags);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#testTenantTagSpaces");
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
 **tenantIds** | [**List&lt;String&gt;**](String.md)| A list of Tenant IDs to limit the matching to, delimited by commas. Example: Tenants-1,Tenants-2,Tenants-3 | [optional]
 **tags** | [**List&lt;String&gt;**](String.md)| A list of Tenant Tags to limit the matching to, delimited by commas. Example: Alpha,Beta,Stable | [optional]

### Return type

[**Map&lt;String, TagTestResult&gt;**](TagTestResult.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="updateTenant"></a>
# **updateTenant**
> TenantResource updateTenant(id, body)

Modifies an existing Tenant

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String id = "id_example"; // String | 
    TenantResource body = new TenantResource(); // TenantResource | 
    try {
      TenantResource result = apiInstance.updateTenant(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#updateTenant");
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
 **id** | **String**|  |
 **body** | [**TenantResource**](TenantResource.md)|  | [optional]

### Return type

[**TenantResource**](TenantResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Tenant Modified |  -  |
**400** | Validation Failed |  -  |

<a name="updateTenantLogo"></a>
# **updateTenantLogo**
> updateTenantLogo(id)

Updates the logo associated with the tenant.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String id = "id_example"; // String | ID of the Tenant to update the logo for
    try {
      apiInstance.updateTenantLogo(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#updateTenantLogo");
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
 **id** | **String**| ID of the Tenant to update the logo for |

### Return type

null (empty response body)

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
**415** | Invalid or unsupported image provided. |  -  |

<a name="updateTenantLogoSpaces"></a>
# **updateTenantLogoSpaces**
> updateTenantLogoSpaces(id, baseSpaceId)

Updates the logo associated with the tenant.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String id = "id_example"; // String | ID of the Tenant to update the logo for
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    try {
      apiInstance.updateTenantLogoSpaces(id, baseSpaceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#updateTenantLogoSpaces");
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
 **id** | **String**| ID of the Tenant to update the logo for |
 **baseSpaceId** | **String**| ID of the space |

### Return type

null (empty response body)

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
**415** | Invalid or unsupported image provided. |  -  |

<a name="updateTenantSpaces"></a>
# **updateTenantSpaces**
> TenantResource updateTenantSpaces(id, baseSpaceId, body)

Modifies an existing Tenant

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String id = "id_example"; // String | 
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    TenantResource body = new TenantResource(); // TenantResource | 
    try {
      TenantResource result = apiInstance.updateTenantSpaces(id, baseSpaceId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#updateTenantSpaces");
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
 **id** | **String**|  |
 **baseSpaceId** | **String**| ID of the space |
 **body** | [**TenantResource**](TenantResource.md)|  | [optional]

### Return type

[**TenantResource**](TenantResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Tenant Modified |  -  |
**400** | Validation Failed |  -  |

<a name="updateTenantVariables"></a>
# **updateTenantVariables**
> TenantVariableResource updateTenantVariables(id, body)

Updates the variables associated with the tenant.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String id = "id_example"; // String | ID of the Tenant modify
    TenantVariableResource body = new TenantVariableResource(); // TenantVariableResource | 
    try {
      TenantVariableResource result = apiInstance.updateTenantVariables(id, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#updateTenantVariables");
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
 **id** | **String**| ID of the Tenant modify |
 **body** | [**TenantVariableResource**](TenantVariableResource.md)|  | [optional]

### Return type

[**TenantVariableResource**](TenantVariableResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="updateTenantVariablesSpaces"></a>
# **updateTenantVariablesSpaces**
> TenantVariableResource updateTenantVariablesSpaces(id, baseSpaceId, body)

Updates the variables associated with the tenant.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.TenantsApi;

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

    TenantsApi apiInstance = new TenantsApi(defaultClient);
    String id = "id_example"; // String | ID of the Tenant modify
    String baseSpaceId = "baseSpaceId_example"; // String | ID of the space
    TenantVariableResource body = new TenantVariableResource(); // TenantVariableResource | 
    try {
      TenantVariableResource result = apiInstance.updateTenantVariablesSpaces(id, baseSpaceId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TenantsApi#updateTenantVariablesSpaces");
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
 **id** | **String**| ID of the Tenant modify |
 **baseSpaceId** | **String**| ID of the space |
 **body** | [**TenantVariableResource**](TenantVariableResource.md)|  | [optional]

### Return type

[**TenantVariableResource**](TenantVariableResource.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

