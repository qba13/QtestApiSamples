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

import io.swagger.client.ApiException;
import io.swagger.client.model.FieldResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CommonApi
 */
@Ignore
public class CommonApiTest {

    private final CommonApi api = new CommonApi();

    
    /**
     * Edit System Field of an Object Type by the field
     *
     * To edit System Field of an Object Type by the field
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void editSystemFieldTest() throws ApiException {
        Long projectId = null;
        Long fieldId = null;
        FieldResource body = null;
        String objectType = null;
        FieldResource response = api.editSystemField(projectId, fieldId, body, objectType);

        // TODO: test validations
    }
    
    /**
     * Update active or inactive custom fields of an Object Type
     *
     * To update active or inactive custom fields of an Object Type
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCustomFieldStatusTest() throws ApiException {
        Long projectId = null;
        String objectType = null;
        List<FieldResource> body = null;
        List<FieldResource> response = api.updateCustomFieldStatus(projectId, objectType, body);

        // TODO: test validations
    }
    
}