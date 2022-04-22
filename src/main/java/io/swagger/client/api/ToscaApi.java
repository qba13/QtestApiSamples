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


import io.swagger.client.model.QueueProcessingResponse;
import io.swagger.client.model.ToscaTestCycleResource;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToscaApi {
    private ApiClient apiClient;

    public ToscaApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ToscaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for notifyTestEventImport */
    private com.squareup.okhttp.Call notifyTestEventImportCall(Long projectId, List<ToscaTestCycleResource> body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/api/v3/projects/{projectId}/tosca/import/test-event".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "projectId" + "\\}", apiClient.escapeString(projectId.toString()));

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
    private com.squareup.okhttp.Call notifyTestEventImportValidateBeforeCall(Long projectId, List<ToscaTestCycleResource> body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling notifyTestEventImport(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling notifyTestEventImport(Async)");
        }
        
        
        com.squareup.okhttp.Call call = notifyTestEventImportCall(projectId, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Import Tosca TestEvent objects
     * To export TestEvent objects from Tosca to qTest
     * @param projectId ID of the project (required)
     * @param body An array of hierarchy Tosca objects  &lt;em&gt;toscaUniqueId (required):&lt;/em&gt; Unique ID of the Tosca object  &lt;em&gt;name (required):&lt;/em&gt; Name of the Tosca object  &lt;em&gt;description:&lt;/em&gt; Description of the Tosca object  &lt;em&gt;toscaObjectType (required):&lt;/em&gt; Type of the Tosca object: TestEvent, ExecutionList (contained inTestEvent), ExecutionEntry Folder(contained in Execution List). Object is TestEvent type is always on the root of body array and doesn&#39;t contain ExecutionEntry objects   &lt;em&gt;toscaNodePath (required):&lt;/em&gt; Node path of the Tosca object  &lt;em&gt;testCycles:&lt;/em&gt; The array of TestEvent or ExecutionList or ExecutionEntry Folder objects  &lt;em&gt;testRuns:&lt;/em&gt; The array of ExecutionEntry objects in testCycle property  &lt;em&gt;associatedToscaTestCase:&lt;/em&gt; Testcase object that associated with testRun object (required)
     * @return QueueProcessingResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public QueueProcessingResponse notifyTestEventImport(Long projectId, List<ToscaTestCycleResource> body) throws ApiException {
        ApiResponse<QueueProcessingResponse> resp = notifyTestEventImportWithHttpInfo(projectId, body);
        return resp.getData();
    }

    /**
     * Import Tosca TestEvent objects
     * To export TestEvent objects from Tosca to qTest
     * @param projectId ID of the project (required)
     * @param body An array of hierarchy Tosca objects  &lt;em&gt;toscaUniqueId (required):&lt;/em&gt; Unique ID of the Tosca object  &lt;em&gt;name (required):&lt;/em&gt; Name of the Tosca object  &lt;em&gt;description:&lt;/em&gt; Description of the Tosca object  &lt;em&gt;toscaObjectType (required):&lt;/em&gt; Type of the Tosca object: TestEvent, ExecutionList (contained inTestEvent), ExecutionEntry Folder(contained in Execution List). Object is TestEvent type is always on the root of body array and doesn&#39;t contain ExecutionEntry objects   &lt;em&gt;toscaNodePath (required):&lt;/em&gt; Node path of the Tosca object  &lt;em&gt;testCycles:&lt;/em&gt; The array of TestEvent or ExecutionList or ExecutionEntry Folder objects  &lt;em&gt;testRuns:&lt;/em&gt; The array of ExecutionEntry objects in testCycle property  &lt;em&gt;associatedToscaTestCase:&lt;/em&gt; Testcase object that associated with testRun object (required)
     * @return ApiResponse&lt;QueueProcessingResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<QueueProcessingResponse> notifyTestEventImportWithHttpInfo(Long projectId, List<ToscaTestCycleResource> body) throws ApiException {
        com.squareup.okhttp.Call call = notifyTestEventImportValidateBeforeCall(projectId, body, null, null);
        Type localVarReturnType = new TypeToken<QueueProcessingResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Import Tosca TestEvent objects (asynchronously)
     * To export TestEvent objects from Tosca to qTest
     * @param projectId ID of the project (required)
     * @param body An array of hierarchy Tosca objects  &lt;em&gt;toscaUniqueId (required):&lt;/em&gt; Unique ID of the Tosca object  &lt;em&gt;name (required):&lt;/em&gt; Name of the Tosca object  &lt;em&gt;description:&lt;/em&gt; Description of the Tosca object  &lt;em&gt;toscaObjectType (required):&lt;/em&gt; Type of the Tosca object: TestEvent, ExecutionList (contained inTestEvent), ExecutionEntry Folder(contained in Execution List). Object is TestEvent type is always on the root of body array and doesn&#39;t contain ExecutionEntry objects   &lt;em&gt;toscaNodePath (required):&lt;/em&gt; Node path of the Tosca object  &lt;em&gt;testCycles:&lt;/em&gt; The array of TestEvent or ExecutionList or ExecutionEntry Folder objects  &lt;em&gt;testRuns:&lt;/em&gt; The array of ExecutionEntry objects in testCycle property  &lt;em&gt;associatedToscaTestCase:&lt;/em&gt; Testcase object that associated with testRun object (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call notifyTestEventImportAsync(Long projectId, List<ToscaTestCycleResource> body, final ApiCallback<QueueProcessingResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = notifyTestEventImportValidateBeforeCall(projectId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<QueueProcessingResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
