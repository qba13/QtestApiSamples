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


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * IntegrationConnection
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class IntegrationConnection {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("external_system")
  private String externalSystem = null;

  @SerializedName("connection_name")
  private String connectionName = null;

  @SerializedName("server_url")
  private String serverUrl = null;

  @SerializedName("web_url")
  private String webUrl = null;

  @SerializedName("authentication_type")
  private String authenticationType = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("token")
  private String token = null;

  public IntegrationConnection id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public IntegrationConnection externalSystem(String externalSystem) {
    this.externalSystem = externalSystem;
    return this;
  }

   /**
   * Get externalSystem
   * @return externalSystem
  **/
  @ApiModelProperty(example = "Jira", value = "")
  public String getExternalSystem() {
    return externalSystem;
  }

  public void setExternalSystem(String externalSystem) {
    this.externalSystem = externalSystem;
  }

  public IntegrationConnection connectionName(String connectionName) {
    this.connectionName = connectionName;
    return this;
  }

   /**
   * Get connectionName
   * @return connectionName
  **/
  @ApiModelProperty(example = "Jira Connection", value = "")
  public String getConnectionName() {
    return connectionName;
  }

  public void setConnectionName(String connectionName) {
    this.connectionName = connectionName;
  }

  public IntegrationConnection serverUrl(String serverUrl) {
    this.serverUrl = serverUrl;
    return this;
  }

   /**
   * Get serverUrl
   * @return serverUrl
  **/
  @ApiModelProperty(example = "https://example.atlassian.net", value = "")
  public String getServerUrl() {
    return serverUrl;
  }

  public void setServerUrl(String serverUrl) {
    this.serverUrl = serverUrl;
  }

  public IntegrationConnection webUrl(String webUrl) {
    this.webUrl = webUrl;
    return this;
  }

   /**
   * Get webUrl
   * @return webUrl
  **/
  @ApiModelProperty(example = "https://example.atlassian.net", value = "")
  public String getWebUrl() {
    return webUrl;
  }

  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
  }

  public IntegrationConnection authenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

   /**
   * Get authenticationType
   * @return authenticationType
  **/
  @ApiModelProperty(example = "Token", value = "")
  public String getAuthenticationType() {
    return authenticationType;
  }

  public void setAuthenticationType(String authenticationType) {
    this.authenticationType = authenticationType;
  }

  public IntegrationConnection username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(example = "username", value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public IntegrationConnection token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(example = "token", value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationConnection integrationConnection = (IntegrationConnection) o;
    return Objects.equals(this.id, integrationConnection.id) &&
        Objects.equals(this.externalSystem, integrationConnection.externalSystem) &&
        Objects.equals(this.connectionName, integrationConnection.connectionName) &&
        Objects.equals(this.serverUrl, integrationConnection.serverUrl) &&
        Objects.equals(this.webUrl, integrationConnection.webUrl) &&
        Objects.equals(this.authenticationType, integrationConnection.authenticationType) &&
        Objects.equals(this.username, integrationConnection.username) &&
        Objects.equals(this.token, integrationConnection.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, externalSystem, connectionName, serverUrl, webUrl, authenticationType, username, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationConnection {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalSystem: ").append(toIndentedString(externalSystem)).append("\n");
    sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
    sb.append("    serverUrl: ").append(toIndentedString(serverUrl)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

