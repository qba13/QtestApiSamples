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
 * SessionManagerPermission
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class SessionManagerPermission {
  @SerializedName("create")
  private Boolean create = false;

  @SerializedName("edit")
  private Boolean edit = false;

  @SerializedName("delete")
  private Boolean delete = false;

  @SerializedName("view")
  private Boolean view = false;

  public SessionManagerPermission create(Boolean create) {
    this.create = create;
    return this;
  }

   /**
   * Can create Session
   * @return create
  **/
  @ApiModelProperty(example = "true", value = "Can create Session")
  public Boolean getCreate() {
    return create;
  }

  public void setCreate(Boolean create) {
    this.create = create;
  }

  public SessionManagerPermission edit(Boolean edit) {
    this.edit = edit;
    return this;
  }

   /**
   * Can edit Session
   * @return edit
  **/
  @ApiModelProperty(example = "true", value = "Can edit Session")
  public Boolean getEdit() {
    return edit;
  }

  public void setEdit(Boolean edit) {
    this.edit = edit;
  }

  public SessionManagerPermission delete(Boolean delete) {
    this.delete = delete;
    return this;
  }

   /**
   * Can delete Session
   * @return delete
  **/
  @ApiModelProperty(example = "true", value = "Can delete Session")
  public Boolean getDelete() {
    return delete;
  }

  public void setDelete(Boolean delete) {
    this.delete = delete;
  }

  public SessionManagerPermission view(Boolean view) {
    this.view = view;
    return this;
  }

   /**
   * Can view Session
   * @return view
  **/
  @ApiModelProperty(example = "true", value = "Can view Session")
  public Boolean getView() {
    return view;
  }

  public void setView(Boolean view) {
    this.view = view;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionManagerPermission sessionManagerPermission = (SessionManagerPermission) o;
    return Objects.equals(this.create, sessionManagerPermission.create) &&
        Objects.equals(this.edit, sessionManagerPermission.edit) &&
        Objects.equals(this.delete, sessionManagerPermission.delete) &&
        Objects.equals(this.view, sessionManagerPermission.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(create, edit, delete, view);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SessionManagerPermission {\n");
    
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    edit: ").append(toIndentedString(edit)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
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

