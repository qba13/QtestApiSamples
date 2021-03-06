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
import io.swagger.client.model.DefectMapping;
import java.util.ArrayList;
import java.util.List;

/**
 * DefectTrackingSystem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class DefectTrackingSystem {
  @SerializedName("defect_mappings")
  private List<DefectMapping> defectMappings = new ArrayList<DefectMapping>();

  @SerializedName("connection_name")
  private String connectionName = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("system_name")
  private String systemName = null;

  @SerializedName("active")
  private Boolean active = false;

  @SerializedName("id")
  private Long id = null;

  public DefectTrackingSystem defectMappings(List<DefectMapping> defectMappings) {
    this.defectMappings = defectMappings;
    return this;
  }

  public DefectTrackingSystem addDefectMappingsItem(DefectMapping defectMappingsItem) {
    this.defectMappings.add(defectMappingsItem);
    return this;
  }

   /**
   * Get defectMappings
   * @return defectMappings
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<DefectMapping> getDefectMappings() {
    return defectMappings;
  }

  public void setDefectMappings(List<DefectMapping> defectMappings) {
    this.defectMappings = defectMappings;
  }

  public DefectTrackingSystem connectionName(String connectionName) {
    this.connectionName = connectionName;
    return this;
  }

   /**
   * Name of Integration Connection
   * @return connectionName
  **/
  @ApiModelProperty(example = "Jira Cloud", value = "Name of Integration Connection")
  public String getConnectionName() {
    return connectionName;
  }

  public void setConnectionName(String connectionName) {
    this.connectionName = connectionName;
  }

  public DefectTrackingSystem url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL to Integration Connection
   * @return url
  **/
  @ApiModelProperty(example = "https://example.jira.com", value = "URL to Integration Connection")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public DefectTrackingSystem systemName(String systemName) {
    this.systemName = systemName;
    return this;
  }

   /**
   * System name of Integration Connection
   * @return systemName
  **/
  @ApiModelProperty(example = "JIRA", value = "System name of Integration Connection")
  public String getSystemName() {
    return systemName;
  }

  public void setSystemName(String systemName) {
    this.systemName = systemName;
  }

  public DefectTrackingSystem active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Status of Integration Connection
   * @return active
  **/
  @ApiModelProperty(example = "true", value = "Status of Integration Connection")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public DefectTrackingSystem id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of Integration Connection
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "ID of Integration Connection")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefectTrackingSystem defectTrackingSystem = (DefectTrackingSystem) o;
    return Objects.equals(this.defectMappings, defectTrackingSystem.defectMappings) &&
        Objects.equals(this.connectionName, defectTrackingSystem.connectionName) &&
        Objects.equals(this.url, defectTrackingSystem.url) &&
        Objects.equals(this.systemName, defectTrackingSystem.systemName) &&
        Objects.equals(this.active, defectTrackingSystem.active) &&
        Objects.equals(this.id, defectTrackingSystem.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defectMappings, connectionName, url, systemName, active, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefectTrackingSystem {\n");
    
    sb.append("    defectMappings: ").append(toIndentedString(defectMappings)).append("\n");
    sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    systemName: ").append(toIndentedString(systemName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

