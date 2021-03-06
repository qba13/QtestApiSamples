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
import io.swagger.client.model.ApplyTemplateQueryObject;
import io.swagger.client.model.ProjectResource;
import io.swagger.client.model.SiteTemplateResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SiteTemplatesApi
 */
@Ignore
public class SiteTemplatesApiTest {

    private final SiteTemplatesApi api = new SiteTemplatesApi();

    
    /**
     * Apply template to existing projects.
     *
     * To apply template to existing projects.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addProjectsTest() throws ApiException {
        Long templateId = null;
        ApplyTemplateQueryObject body = null;
        List<ProjectResource> response = api.addProjects(templateId, body);

        // TODO: test validations
    }
    
    /**
     * Get all site-templates
     *
     * To retrieve all site-templates
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllSiteTemplatesTest() throws ApiException {
        List<SiteTemplateResponse> response = api.getAllSiteTemplates();

        // TODO: test validations
    }
    
    /**
     * Remove projects from a site template.
     *
     * To remove projects from a site template.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeProjectTemplatesTest() throws ApiException {
        Long templateId = null;
        List<Long> body = null;
        List<ProjectResource> response = api.removeProjectTemplates(templateId, body);

        // TODO: test validations
    }
    
}
