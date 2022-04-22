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
import io.swagger.client.model.IntegrationReleaseConfigurationValues;
import java.util.ArrayList;
import java.util.List;

/**
 * IntegrationReleaseConfigurationVM
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class IntegrationReleaseConfigurationVM {
  @SerializedName("autoUpdate")
  private Boolean autoUpdate = false;

  @SerializedName("configurationValues")
  private IntegrationReleaseConfigurationValues configurationValues = null;

  @SerializedName("data_retrieval_options")
  private List<String> dataRetrievalOptions = new ArrayList<String>();

  @SerializedName("auto_update_release_scope")
  private String autoUpdateReleaseScope = null;

   /**
   * Get autoUpdate
   * @return autoUpdate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAutoUpdate() {
    return autoUpdate;
  }

  public IntegrationReleaseConfigurationVM configurationValues(IntegrationReleaseConfigurationValues configurationValues) {
    this.configurationValues = configurationValues;
    return this;
  }

   /**
   * Get configurationValues
   * @return configurationValues
  **/
  @ApiModelProperty(example = "null", value = "")
  public IntegrationReleaseConfigurationValues getConfigurationValues() {
    return configurationValues;
  }

  public void setConfigurationValues(IntegrationReleaseConfigurationValues configurationValues) {
    this.configurationValues = configurationValues;
  }

  public IntegrationReleaseConfigurationVM dataRetrievalOptions(List<String> dataRetrievalOptions) {
    this.dataRetrievalOptions = dataRetrievalOptions;
    return this;
  }

  public IntegrationReleaseConfigurationVM addDataRetrievalOptionsItem(String dataRetrievalOptionsItem) {
    this.dataRetrievalOptions.add(dataRetrievalOptionsItem);
    return this;
  }

   /**
   * Get dataRetrievalOptions
   * @return dataRetrievalOptions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getDataRetrievalOptions() {
    return dataRetrievalOptions;
  }

  public void setDataRetrievalOptions(List<String> dataRetrievalOptions) {
    this.dataRetrievalOptions = dataRetrievalOptions;
  }

  public IntegrationReleaseConfigurationVM autoUpdateReleaseScope(String autoUpdateReleaseScope) {
    this.autoUpdateReleaseScope = autoUpdateReleaseScope;
    return this;
  }

   /**
   * Get autoUpdateReleaseScope
   * @return autoUpdateReleaseScope
  **/
  @ApiModelProperty(example = "true", value = "")
  public String getAutoUpdateReleaseScope() {
    return autoUpdateReleaseScope;
  }

  public void setAutoUpdateReleaseScope(String autoUpdateReleaseScope) {
    this.autoUpdateReleaseScope = autoUpdateReleaseScope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationReleaseConfigurationVM integrationReleaseConfigurationVM = (IntegrationReleaseConfigurationVM) o;
    return Objects.equals(this.autoUpdate, integrationReleaseConfigurationVM.autoUpdate) &&
        Objects.equals(this.configurationValues, integrationReleaseConfigurationVM.configurationValues) &&
        Objects.equals(this.dataRetrievalOptions, integrationReleaseConfigurationVM.dataRetrievalOptions) &&
        Objects.equals(this.autoUpdateReleaseScope, integrationReleaseConfigurationVM.autoUpdateReleaseScope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoUpdate, configurationValues, dataRetrievalOptions, autoUpdateReleaseScope);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationReleaseConfigurationVM {\n");
    
    sb.append("    autoUpdate: ").append(toIndentedString(autoUpdate)).append("\n");
    sb.append("    configurationValues: ").append(toIndentedString(configurationValues)).append("\n");
    sb.append("    dataRetrievalOptions: ").append(toIndentedString(dataRetrievalOptions)).append("\n");
    sb.append("    autoUpdateReleaseScope: ").append(toIndentedString(autoUpdateReleaseScope)).append("\n");
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

