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
import io.swagger.client.model.AutoFillConfigurationVM;
import java.util.ArrayList;
import java.util.List;

/**
 * IntegrationAutoFillMappingVM
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class IntegrationAutoFillMappingVM {
  @SerializedName("externalProjectId")
  private String externalProjectId = null;

  @SerializedName("externalTypeId")
  private String externalTypeId = null;

  @SerializedName("sendAttachmentToJira")
  private String sendAttachmentToJira = null;

  @SerializedName("configures")
  private List<AutoFillConfigurationVM> configures = new ArrayList<AutoFillConfigurationVM>();

   /**
   * Get externalProjectId
   * @return externalProjectId
  **/
  @ApiModelProperty(example = "10031", value = "")
  public String getExternalProjectId() {
    return externalProjectId;
  }

   /**
   * Get externalTypeId
   * @return externalTypeId
  **/
  @ApiModelProperty(example = "10100", value = "")
  public String getExternalTypeId() {
    return externalTypeId;
  }

  public IntegrationAutoFillMappingVM sendAttachmentToJira(String sendAttachmentToJira) {
    this.sendAttachmentToJira = sendAttachmentToJira;
    return this;
  }

   /**
   * Get sendAttachmentToJira
   * @return sendAttachmentToJira
  **/
  @ApiModelProperty(example = "true", value = "")
  public String getSendAttachmentToJira() {
    return sendAttachmentToJira;
  }

  public void setSendAttachmentToJira(String sendAttachmentToJira) {
    this.sendAttachmentToJira = sendAttachmentToJira;
  }

  public IntegrationAutoFillMappingVM configures(List<AutoFillConfigurationVM> configures) {
    this.configures = configures;
    return this;
  }

  public IntegrationAutoFillMappingVM addConfiguresItem(AutoFillConfigurationVM configuresItem) {
    this.configures.add(configuresItem);
    return this;
  }

   /**
   * Get configures
   * @return configures
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<AutoFillConfigurationVM> getConfigures() {
    return configures;
  }

  public void setConfigures(List<AutoFillConfigurationVM> configures) {
    this.configures = configures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationAutoFillMappingVM integrationAutoFillMappingVM = (IntegrationAutoFillMappingVM) o;
    return Objects.equals(this.externalProjectId, integrationAutoFillMappingVM.externalProjectId) &&
        Objects.equals(this.externalTypeId, integrationAutoFillMappingVM.externalTypeId) &&
        Objects.equals(this.sendAttachmentToJira, integrationAutoFillMappingVM.sendAttachmentToJira) &&
        Objects.equals(this.configures, integrationAutoFillMappingVM.configures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalProjectId, externalTypeId, sendAttachmentToJira, configures);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationAutoFillMappingVM {\n");
    
    sb.append("    externalProjectId: ").append(toIndentedString(externalProjectId)).append("\n");
    sb.append("    externalTypeId: ").append(toIndentedString(externalTypeId)).append("\n");
    sb.append("    sendAttachmentToJira: ").append(toIndentedString(sendAttachmentToJira)).append("\n");
    sb.append("    configures: ").append(toIndentedString(configures)).append("\n");
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
