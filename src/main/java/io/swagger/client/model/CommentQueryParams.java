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
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * CommentQueryParams
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class CommentQueryParams {
  @SerializedName("start")
  private DateTime start = null;

  @SerializedName("end")
  private DateTime end = null;

  @SerializedName("object_type")
  private String objectType = null;

  @SerializedName("fields")
  private List<String> fields = new ArrayList<String>();

  @SerializedName("object")
  private Long object = null;

  @SerializedName("author")
  private Long author = null;

  public CommentQueryParams start(DateTime start) {
    this.start = start;
    return this;
  }

   /**
   * StartDate with format: yyyy-MM-dd'T'HH:mm:ss.SSSZ or yyyy-MM-dd'T'HH:mm:ssZZ\"
   * @return start
  **/
  @ApiModelProperty(example = "null", value = "StartDate with format: yyyy-MM-dd'T'HH:mm:ss.SSSZ or yyyy-MM-dd'T'HH:mm:ssZZ\"")
  public DateTime getStart() {
    return start;
  }

  public void setStart(DateTime start) {
    this.start = start;
  }

  public CommentQueryParams end(DateTime end) {
    this.end = end;
    return this;
  }

   /**
   * EndDate with format: yyyy-MM-dd'T'HH:mm:ss.SSSZ or yyyy-MM-dd'T'HH:mm:ssZZ\"
   * @return end
  **/
  @ApiModelProperty(example = "null", value = "EndDate with format: yyyy-MM-dd'T'HH:mm:ss.SSSZ or yyyy-MM-dd'T'HH:mm:ssZZ\"")
  public DateTime getEnd() {
    return end;
  }

  public void setEnd(DateTime end) {
    this.end = end;
  }

  public CommentQueryParams objectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

   /**
   * Only support comments for object types: [requirements, defects, test-cases, test-runs]
   * @return objectType
  **/
  @ApiModelProperty(example = "requirements", required = true, value = "Only support comments for object types: [requirements, defects, test-cases, test-runs]")
  public String getObjectType() {
    return objectType;
  }

  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }

  public CommentQueryParams fields(List<String> fields) {
    this.fields = fields;
    return this;
  }

  public CommentQueryParams addFieldsItem(String fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Specify which object fields you want to include in the response. If you omit it or specify an asterisk (*), all fields are included
   * @return fields
  **/
  @ApiModelProperty(example = "null", value = "Specify which object fields you want to include in the response. If you omit it or specify an asterisk (*), all fields are included")
  public List<String> getFields() {
    return fields;
  }

  public void setFields(List<String> fields) {
    this.fields = fields;
  }

  public CommentQueryParams object(Long object) {
    this.object = object;
    return this;
  }

   /**
   * Id of the object from which you want to retrieve comments
   * @return object
  **/
  @ApiModelProperty(example = "null", value = "Id of the object from which you want to retrieve comments")
  public Long getObject() {
    return object;
  }

  public void setObject(Long object) {
    this.object = object;
  }

  public CommentQueryParams author(Long author) {
    this.author = author;
    return this;
  }

   /**
   * Id of the user who made the comments
   * @return author
  **/
  @ApiModelProperty(example = "1", value = "Id of the user who made the comments")
  public Long getAuthor() {
    return author;
  }

  public void setAuthor(Long author) {
    this.author = author;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentQueryParams commentQueryParams = (CommentQueryParams) o;
    return Objects.equals(this.start, commentQueryParams.start) &&
        Objects.equals(this.end, commentQueryParams.end) &&
        Objects.equals(this.objectType, commentQueryParams.objectType) &&
        Objects.equals(this.fields, commentQueryParams.fields) &&
        Objects.equals(this.object, commentQueryParams.object) &&
        Objects.equals(this.author, commentQueryParams.author);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, objectType, fields, object, author);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentQueryParams {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
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

