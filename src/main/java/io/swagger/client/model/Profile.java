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
 * Profile
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class Profile {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("is_readonly")
  private Boolean isReadonly = false;

  @SerializedName("is_admin")
  private Boolean isAdmin = false;

  public Profile id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of Profile
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "ID of Profile")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Profile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of Profile
   * @return name
  **/
  @ApiModelProperty(example = "Project Manager", value = "Name of Profile")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Profile isReadonly(Boolean isReadonly) {
    this.isReadonly = isReadonly;
    return this;
  }

   /**
   * Is readonly or not
   * @return isReadonly
  **/
  @ApiModelProperty(example = "true", value = "Is readonly or not")
  public Boolean getIsReadonly() {
    return isReadonly;
  }

  public void setIsReadonly(Boolean isReadonly) {
    this.isReadonly = isReadonly;
  }

  public Profile isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

   /**
   * Is admin profile or not
   * @return isAdmin
  **/
  @ApiModelProperty(example = "false", value = "Is admin profile or not")
  public Boolean getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Profile profile = (Profile) o;
    return Objects.equals(this.id, profile.id) &&
        Objects.equals(this.name, profile.name) &&
        Objects.equals(this.isReadonly, profile.isReadonly) &&
        Objects.equals(this.isAdmin, profile.isAdmin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isReadonly, isAdmin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profile {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isReadonly: ").append(toIndentedString(isReadonly)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
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

