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
 * AutoFillConfigurationVM
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class AutoFillConfigurationVM {
  @SerializedName("externalFieldId")
  private String externalFieldId = null;

  @SerializedName("qTestFieldIds")
  private String qTestFieldIds = null;

  public AutoFillConfigurationVM externalFieldId(String externalFieldId) {
    this.externalFieldId = externalFieldId;
    return this;
  }

   /**
   * Get externalFieldId
   * @return externalFieldId
  **/
  @ApiModelProperty(example = "summary", value = "")
  public String getExternalFieldId() {
    return externalFieldId;
  }

  public void setExternalFieldId(String externalFieldId) {
    this.externalFieldId = externalFieldId;
  }

  public AutoFillConfigurationVM qTestFieldIds(String qTestFieldIds) {
    this.qTestFieldIds = qTestFieldIds;
    return this;
  }

   /**
   * Get qTestFieldIds
   * @return qTestFieldIds
  **/
  @ApiModelProperty(example = "Assigned To", value = "")
  public String getQTestFieldIds() {
    return qTestFieldIds;
  }

  public void setQTestFieldIds(String qTestFieldIds) {
    this.qTestFieldIds = qTestFieldIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoFillConfigurationVM autoFillConfigurationVM = (AutoFillConfigurationVM) o;
    return Objects.equals(this.externalFieldId, autoFillConfigurationVM.externalFieldId) &&
        Objects.equals(this.qTestFieldIds, autoFillConfigurationVM.qTestFieldIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalFieldId, qTestFieldIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoFillConfigurationVM {\n");
    
    sb.append("    externalFieldId: ").append(toIndentedString(externalFieldId)).append("\n");
    sb.append("    qTestFieldIds: ").append(toIndentedString(qTestFieldIds)).append("\n");
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
