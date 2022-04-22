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
 * ParameterVM
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class ParameterVM {
  @SerializedName("parameterId")
  private Long parameterId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("startIndex")
  private Integer startIndex = null;

  @SerializedName("endIndex")
  private Integer endIndex = null;

  @SerializedName("startWithoutPrefixIndex")
  private Integer startWithoutPrefixIndex = null;

  @SerializedName("endWithoutSuffixIndex")
  private Integer endWithoutSuffixIndex = null;

  @SerializedName("parameterName")
  private String parameterName = null;

  public ParameterVM parameterId(Long parameterId) {
    this.parameterId = parameterId;
    return this;
  }

   /**
   * Get parameterId
   * @return parameterId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getParameterId() {
    return parameterId;
  }

  public void setParameterId(Long parameterId) {
    this.parameterId = parameterId;
  }

  public ParameterVM id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ParameterVM startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

   /**
   * Get startIndex
   * @return startIndex
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public ParameterVM endIndex(Integer endIndex) {
    this.endIndex = endIndex;
    return this;
  }

   /**
   * Get endIndex
   * @return endIndex
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getEndIndex() {
    return endIndex;
  }

  public void setEndIndex(Integer endIndex) {
    this.endIndex = endIndex;
  }

  public ParameterVM startWithoutPrefixIndex(Integer startWithoutPrefixIndex) {
    this.startWithoutPrefixIndex = startWithoutPrefixIndex;
    return this;
  }

   /**
   * Get startWithoutPrefixIndex
   * @return startWithoutPrefixIndex
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getStartWithoutPrefixIndex() {
    return startWithoutPrefixIndex;
  }

  public void setStartWithoutPrefixIndex(Integer startWithoutPrefixIndex) {
    this.startWithoutPrefixIndex = startWithoutPrefixIndex;
  }

  public ParameterVM endWithoutSuffixIndex(Integer endWithoutSuffixIndex) {
    this.endWithoutSuffixIndex = endWithoutSuffixIndex;
    return this;
  }

   /**
   * Get endWithoutSuffixIndex
   * @return endWithoutSuffixIndex
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getEndWithoutSuffixIndex() {
    return endWithoutSuffixIndex;
  }

  public void setEndWithoutSuffixIndex(Integer endWithoutSuffixIndex) {
    this.endWithoutSuffixIndex = endWithoutSuffixIndex;
  }

  public ParameterVM parameterName(String parameterName) {
    this.parameterName = parameterName;
    return this;
  }

   /**
   * Get parameterName
   * @return parameterName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getParameterName() {
    return parameterName;
  }

  public void setParameterName(String parameterName) {
    this.parameterName = parameterName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParameterVM parameterVM = (ParameterVM) o;
    return Objects.equals(this.parameterId, parameterVM.parameterId) &&
        Objects.equals(this.id, parameterVM.id) &&
        Objects.equals(this.startIndex, parameterVM.startIndex) &&
        Objects.equals(this.endIndex, parameterVM.endIndex) &&
        Objects.equals(this.startWithoutPrefixIndex, parameterVM.startWithoutPrefixIndex) &&
        Objects.equals(this.endWithoutSuffixIndex, parameterVM.endWithoutSuffixIndex) &&
        Objects.equals(this.parameterName, parameterVM.parameterName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameterId, id, startIndex, endIndex, startWithoutPrefixIndex, endWithoutSuffixIndex, parameterName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParameterVM {\n");
    
    sb.append("    parameterId: ").append(toIndentedString(parameterId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
    sb.append("    startWithoutPrefixIndex: ").append(toIndentedString(startWithoutPrefixIndex)).append("\n");
    sb.append("    endWithoutSuffixIndex: ").append(toIndentedString(endWithoutSuffixIndex)).append("\n");
    sb.append("    parameterName: ").append(toIndentedString(parameterName)).append("\n");
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
