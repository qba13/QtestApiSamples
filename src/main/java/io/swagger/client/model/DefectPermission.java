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
 * DefectPermission
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class DefectPermission {
  @SerializedName("create")
  private Boolean create = false;

  @SerializedName("edit")
  private Boolean edit = false;

  @SerializedName("delete")
  private Boolean delete = false;

  @SerializedName("view")
  private Boolean view = false;

  @SerializedName("export")
  private Boolean export = false;

  public DefectPermission create(Boolean create) {
    this.create = create;
    return this;
  }

   /**
   * Can create Defect
   * @return create
  **/
  @ApiModelProperty(example = "true", value = "Can create Defect")
  public Boolean getCreate() {
    return create;
  }

  public void setCreate(Boolean create) {
    this.create = create;
  }

  public DefectPermission edit(Boolean edit) {
    this.edit = edit;
    return this;
  }

   /**
   * Can edit Defect
   * @return edit
  **/
  @ApiModelProperty(example = "true", value = "Can edit Defect")
  public Boolean getEdit() {
    return edit;
  }

  public void setEdit(Boolean edit) {
    this.edit = edit;
  }

  public DefectPermission delete(Boolean delete) {
    this.delete = delete;
    return this;
  }

   /**
   * Get delete
   * @return delete
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getDelete() {
    return delete;
  }

  public void setDelete(Boolean delete) {
    this.delete = delete;
  }

  public DefectPermission view(Boolean view) {
    this.view = view;
    return this;
  }

   /**
   * Can view Defect
   * @return view
  **/
  @ApiModelProperty(example = "true", value = "Can view Defect")
  public Boolean getView() {
    return view;
  }

  public void setView(Boolean view) {
    this.view = view;
  }

  public DefectPermission export(Boolean export) {
    this.export = export;
    return this;
  }

   /**
   * Can export Defect
   * @return export
  **/
  @ApiModelProperty(example = "true", value = "Can export Defect")
  public Boolean getExport() {
    return export;
  }

  public void setExport(Boolean export) {
    this.export = export;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefectPermission defectPermission = (DefectPermission) o;
    return Objects.equals(this.create, defectPermission.create) &&
        Objects.equals(this.edit, defectPermission.edit) &&
        Objects.equals(this.delete, defectPermission.delete) &&
        Objects.equals(this.view, defectPermission.view) &&
        Objects.equals(this.export, defectPermission.export);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, edit, delete, view, export);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefectPermission {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    edit: ").append(toIndentedString(edit)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
    sb.append("    export: ").append(toIndentedString(export)).append("\n");
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

