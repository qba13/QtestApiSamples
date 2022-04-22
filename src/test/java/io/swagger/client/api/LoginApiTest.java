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
import io.swagger.client.model.OAuthResponse;
import io.swagger.client.model.OAuthTokenStatusVM;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LoginApi
 */
@Ignore
public class LoginApiTest {

    private final LoginApi api = new LoginApi();

    
    /**
     * Log in
     *
     * To authenticate the API client against qTest Manager and acquire authorized access token.    Note: Please choose parameter &lt;em&gt;content-type&#x3D;application/x-www-form-urlencoded&lt;/em&gt;
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postAccessTokenTest() throws ApiException {
        String grantType = null;
        String username = null;
        String password = null;
        String refreshToken = null;
        String authorization = null;
        OAuthResponse response = api.postAccessToken(grantType, username, password, refreshToken, authorization);

        // TODO: test validations
    }
    
    /**
     * Gets status of access token
     *
     * Gets status of access token
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tokenStatusTest() throws ApiException {
        String authorization = null;
        OAuthTokenStatusVM response = api.tokenStatus(authorization);

        // TODO: test validations
    }
    
}
