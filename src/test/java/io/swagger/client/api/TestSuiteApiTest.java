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
import io.swagger.client.model.TestSuiteWithCustomFieldResource;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TestSuiteApi
 */
@Ignore
public class TestSuiteApiTest {

    private final TestSuiteApi api = new TestSuiteApi();

    
    /**
     * Creates a Test Suite
     *
     * To create a new Test Suite  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTestSuiteTest() throws ApiException {
        Long projectId = null;
        TestSuiteWithCustomFieldResource body = null;
        Long parentId = null;
        String parentType = null;
        TestSuiteWithCustomFieldResource response = api.createTestSuite(projectId, body, parentId, parentType);

        // TODO: test validations
    }
    
    /**
     * Deletes a Test Suite
     *
     * To delete a Test Suite  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTestSuiteByIdTest() throws ApiException {
        Long projectId = null;
        Long testSuiteId = null;
        Object response = api.deleteTestSuiteById(projectId, testSuiteId);

        // TODO: test validations
    }
    
    /**
     * Gets multiple Test Suite
     *
     * To retrieve Test Suites which located under a parent Release, Test Cycle or root  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getListTestSuiteTest() throws ApiException {
        Long projectId = null;
        Long parentId = null;
        String parentType = null;
        List<TestSuiteWithCustomFieldResource> response = api.getListTestSuite(projectId, parentId, parentType);

        // TODO: test validations
    }
    
    /**
     * Gets a Test Suite
     *
     * To retrieve a Test Suite  &lt;strong&gt;qTest Manager version:&lt;/strong&gt; 6+
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTestSuiteTest() throws ApiException {
        Long projectId = null;
        Long testSuiteId = null;
        TestSuiteWithCustomFieldResource response = api.getTestSuite(projectId, testSuiteId);

        // TODO: test validations
    }
    
    /**
     * Updates a Test Suite
     *
     * To update an existing Test Suite or to move it to other container  &lt;strong&gt;Important:&lt;/strong&gt; If you use the request parameters &lt;em&gt;parentId&lt;/em&gt; and &lt;em&gt;parentType&lt;/em&gt;, the request body will be ignore.   That means the Test Suite is being moved but it will not be updated with the properties specify in the request body
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTestSuiteTest() throws ApiException {
        Long projectId = null;
        Long testSuiteId = null;
        TestSuiteWithCustomFieldResource body = null;
        Long parentId = null;
        String parentType = null;
        Boolean noEmail = null;
        TestSuiteWithCustomFieldResource response = api.updateTestSuite(projectId, testSuiteId, body, parentId, parentType, noEmail);

        // TODO: test validations
    }
    
}
