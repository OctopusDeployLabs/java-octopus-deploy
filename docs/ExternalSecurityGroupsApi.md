# ExternalSecurityGroupsApi

All URIs are relative to *http://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getListProvidersThatSupportExternalSecurityGroups**](ExternalSecurityGroupsApi.md#getListProvidersThatSupportExternalSecurityGroups) | **GET** /externalsecuritygroupproviders | 


<a name="getListProvidersThatSupportExternalSecurityGroups"></a>
# **getListProvidersThatSupportExternalSecurityGroups**
> List&lt;AuthenticationProviderThatSupportsGroups&gt; getListProvidersThatSupportExternalSecurityGroups()



Lists the authentication providers that support external group lookups.

### Example
```java
// Import classes:
import com.octopus.client.ApiClient;
import com.octopus.client.ApiException;
import com.octopus.client.Configuration;
import com.octopus.client.auth.*;
import com.octopus.client.models.*;
import com.octopus.client.api.ExternalSecurityGroupsApi;

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

    ExternalSecurityGroupsApi apiInstance = new ExternalSecurityGroupsApi(defaultClient);
    try {
      List<AuthenticationProviderThatSupportsGroups> result = apiInstance.getListProvidersThatSupportExternalSecurityGroups();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalSecurityGroupsApi#getListProvidersThatSupportExternalSecurityGroups");
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

[**List&lt;AuthenticationProviderThatSupportsGroups&gt;**](AuthenticationProviderThatSupportsGroups.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery), [NugetApiKeyHeader](../README.md#NugetApiKeyHeader)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | IEnumerable_of_AuthenticationProviderThatSupportsGroups resource returned |  -  |

