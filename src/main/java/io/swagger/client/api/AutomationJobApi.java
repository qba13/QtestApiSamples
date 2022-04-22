/*
 * qTest Manager API Version 8.6 - 10.5
 * qTest Manager API Version 8.6 - 10.5
 *
 * OpenAPI spec version: 8.6 - 10.5
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.AutomationArtifactSearchParams;
import io.swagger.client.model.AutomationScheduleCreationAPI;
import io.swagger.client.model.PagedResource;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutomationJobApi {
    private ApiClient apiClient;

    public AutomationJobApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AutomationJobApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createSchedule */
    private com.squareup.okhttp.Call createScheduleCall(AutomationScheduleCreationAPI body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/v3/automation/jobs/schedule/create".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };

        if (!localVarHeaderParams.containsKey("Content-Type")) {
            final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }
        
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createScheduleValidateBeforeCall(AutomationScheduleCreationAPI body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createSchedule(Async)");
        }
        
        
        com.squareup.okhttp.Call call = createScheduleCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a Schedule
     * To create a new Schedule which will be executed immediately  &lt;strong&gt;NOTE:&lt;/strong&gt; Try It Out function will not work for this API  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+\&quot;
     * @param body  (required)
     * @return Long
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Long createSchedule(AutomationScheduleCreationAPI body) throws ApiException {
        ApiResponse<Long> resp = createScheduleWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create a Schedule
     * To create a new Schedule which will be executed immediately  &lt;strong&gt;NOTE:&lt;/strong&gt; Try It Out function will not work for this API  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+\&quot;
     * @param body  (required)
     * @return ApiResponse&lt;Long&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Long> createScheduleWithHttpInfo(AutomationScheduleCreationAPI body) throws ApiException {
        com.squareup.okhttp.Call call = createScheduleValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a Schedule (asynchronously)
     * To create a new Schedule which will be executed immediately  &lt;strong&gt;NOTE:&lt;/strong&gt; Try It Out function will not work for this API  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+\&quot;
     * @param body  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createScheduleAsync(AutomationScheduleCreationAPI body, final ApiCallback<Long> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createScheduleValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Long>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for searchAutomationAgents */
    private com.squareup.okhttp.Call searchAutomationAgentsCall(AutomationArtifactSearchParams body, Long pageSize, Long page, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/v3/automation/automation-agents".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (pageSize != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
        if (page != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };

        if (!localVarHeaderParams.containsKey("Content-Type")) {
            final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }
        
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchAutomationAgentsValidateBeforeCall(AutomationArtifactSearchParams body, Long pageSize, Long page, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling searchAutomationAgents(Async)");
        }
        
        
        com.squareup.okhttp.Call call = searchAutomationAgentsCall(body, pageSize, page, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Search automation agents
     * To search automation agents in projects that user is assigned to   &lt;em&gt;fields:&lt;/em&gt; specify which property of Automation Agent you want to include in the response. If you omit it or specify an asterisk (*), all of following fields are included: id, name, project_id, host_id, framework, active, configuration   &lt;em&gt;query:&lt;/em&gt; specify a structured query (criteria, operator and value) with one or multiple clauses to search for Automation Agents. Following are supporting criteria  | Criteria | Operators | Value | |-----|-----|-------| | name, framework   |  &lt;&gt;, ~, is empty, &#x3D;, !~, is not empty   | string     |  |host_name | &lt;&gt;, ~, &#x3D;, !~ | string |  | id, project_id, host_id | &lt;&gt;, &gt;, &lt;, &lt;&#x3D;, &gt;&#x3D;, &#x3D;| id   | active | &#x3D; | active, inactive  
     * @param body  (required)
     * @param pageSize The result is paginated. By the default, the number of objects in each page is 100 if this is omitted. You can specify your custom number (up to 999) in this parameter (optional, default to 100)
     * @param page By default the first page is returned but you can specify any page number to retrieve objects (optional, default to 1)
     * @return PagedResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PagedResource searchAutomationAgents(AutomationArtifactSearchParams body, Long pageSize, Long page) throws ApiException {
        ApiResponse<PagedResource> resp = searchAutomationAgentsWithHttpInfo(body, pageSize, page);
        return resp.getData();
    }

    /**
     * Search automation agents
     * To search automation agents in projects that user is assigned to   &lt;em&gt;fields:&lt;/em&gt; specify which property of Automation Agent you want to include in the response. If you omit it or specify an asterisk (*), all of following fields are included: id, name, project_id, host_id, framework, active, configuration   &lt;em&gt;query:&lt;/em&gt; specify a structured query (criteria, operator and value) with one or multiple clauses to search for Automation Agents. Following are supporting criteria  | Criteria | Operators | Value | |-----|-----|-------| | name, framework   |  &lt;&gt;, ~, is empty, &#x3D;, !~, is not empty   | string     |  |host_name | &lt;&gt;, ~, &#x3D;, !~ | string |  | id, project_id, host_id | &lt;&gt;, &gt;, &lt;, &lt;&#x3D;, &gt;&#x3D;, &#x3D;| id   | active | &#x3D; | active, inactive  
     * @param body  (required)
     * @param pageSize The result is paginated. By the default, the number of objects in each page is 100 if this is omitted. You can specify your custom number (up to 999) in this parameter (optional, default to 100)
     * @param page By default the first page is returned but you can specify any page number to retrieve objects (optional, default to 1)
     * @return ApiResponse&lt;PagedResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PagedResource> searchAutomationAgentsWithHttpInfo(AutomationArtifactSearchParams body, Long pageSize, Long page) throws ApiException {
        com.squareup.okhttp.Call call = searchAutomationAgentsValidateBeforeCall(body, pageSize, page, null, null);
        Type localVarReturnType = new TypeToken<PagedResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search automation agents (asynchronously)
     * To search automation agents in projects that user is assigned to   &lt;em&gt;fields:&lt;/em&gt; specify which property of Automation Agent you want to include in the response. If you omit it or specify an asterisk (*), all of following fields are included: id, name, project_id, host_id, framework, active, configuration   &lt;em&gt;query:&lt;/em&gt; specify a structured query (criteria, operator and value) with one or multiple clauses to search for Automation Agents. Following are supporting criteria  | Criteria | Operators | Value | |-----|-----|-------| | name, framework   |  &lt;&gt;, ~, is empty, &#x3D;, !~, is not empty   | string     |  |host_name | &lt;&gt;, ~, &#x3D;, !~ | string |  | id, project_id, host_id | &lt;&gt;, &gt;, &lt;, &lt;&#x3D;, &gt;&#x3D;, &#x3D;| id   | active | &#x3D; | active, inactive  
     * @param body  (required)
     * @param pageSize The result is paginated. By the default, the number of objects in each page is 100 if this is omitted. You can specify your custom number (up to 999) in this parameter (optional, default to 100)
     * @param page By default the first page is returned but you can specify any page number to retrieve objects (optional, default to 1)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchAutomationAgentsAsync(AutomationArtifactSearchParams body, Long pageSize, Long page, final ApiCallback<PagedResource> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = searchAutomationAgentsValidateBeforeCall(body, pageSize, page, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PagedResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}