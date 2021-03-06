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
import io.swagger.client.model.LinkedDefect;
import java.util.ArrayList;
import java.util.List;

/**
 * LinkedDefectContainer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class LinkedDefectContainer {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("objects")
  private List<LinkedDefect> objects = new ArrayList<LinkedDefect>();

  public LinkedDefectContainer id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of source artifact
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "ID of source artifact")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LinkedDefectContainer objects(List<LinkedDefect> objects) {
    this.objects = objects;
    return this;
  }

  public LinkedDefectContainer addObjectsItem(LinkedDefect objectsItem) {
    this.objects.add(objectsItem);
    return this;
  }

   /**
   * Arrays of linked defect
   * @return objects
  **/
  @ApiModelProperty(example = "null", value = "Arrays of linked defect")
  public List<LinkedDefect> getObjects() {
    return objects;
  }

  public void setObjects(List<LinkedDefect> objects) {
    this.objects = objects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedDefectContainer linkedDefectContainer = (LinkedDefectContainer) o;
    return Objects.equals(this.id, linkedDefectContainer.id) &&
        Objects.equals(this.objects, linkedDefectContainer.objects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, objects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedDefectContainer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
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

