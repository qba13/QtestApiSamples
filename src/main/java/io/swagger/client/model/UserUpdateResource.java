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
import io.swagger.client.model.Link;
import java.util.ArrayList;
import java.util.List;

/**
 * UserUpdateResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class UserUpdateResource {
  @SerializedName("links")
  private List<Link> links = new ArrayList<Link>();

  @SerializedName("id")
  private Long id = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("first_name")
  private String firstName = null;

  @SerializedName("last_name")
  private String lastName = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("user_group_ids")
  private List<Long> userGroupIds = new ArrayList<Long>();

  @SerializedName("external_auth_config_id")
  private Long externalAuthConfigId = null;

  @SerializedName("external_user_name")
  private String externalUserName = null;

  public UserUpdateResource links(List<Link> links) {
    this.links = links;
    return this;
  }

  public UserUpdateResource addLinksItem(Link linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  public UserUpdateResource id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserUpdateResource email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "example.user@qtest.com", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserUpdateResource password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserUpdateResource firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(example = "Example", value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserUpdateResource lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(example = "User", value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserUpdateResource status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public UserUpdateResource userGroupIds(List<Long> userGroupIds) {
    this.userGroupIds = userGroupIds;
    return this;
  }

  public UserUpdateResource addUserGroupIdsItem(Long userGroupIdsItem) {
    this.userGroupIds.add(userGroupIdsItem);
    return this;
  }

   /**
   * Get userGroupIds
   * @return userGroupIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Long> getUserGroupIds() {
    return userGroupIds;
  }

  public void setUserGroupIds(List<Long> userGroupIds) {
    this.userGroupIds = userGroupIds;
  }

  public UserUpdateResource externalAuthConfigId(Long externalAuthConfigId) {
    this.externalAuthConfigId = externalAuthConfigId;
    return this;
  }

   /**
   * Get externalAuthConfigId
   * @return externalAuthConfigId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getExternalAuthConfigId() {
    return externalAuthConfigId;
  }

  public void setExternalAuthConfigId(Long externalAuthConfigId) {
    this.externalAuthConfigId = externalAuthConfigId;
  }

  public UserUpdateResource externalUserName(String externalUserName) {
    this.externalUserName = externalUserName;
    return this;
  }

   /**
   * Get externalUserName
   * @return externalUserName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExternalUserName() {
    return externalUserName;
  }

  public void setExternalUserName(String externalUserName) {
    this.externalUserName = externalUserName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserUpdateResource userUpdateResource = (UserUpdateResource) o;
    return Objects.equals(this.links, userUpdateResource.links) &&
        Objects.equals(this.id, userUpdateResource.id) &&
        Objects.equals(this.email, userUpdateResource.email) &&
        Objects.equals(this.password, userUpdateResource.password) &&
        Objects.equals(this.firstName, userUpdateResource.firstName) &&
        Objects.equals(this.lastName, userUpdateResource.lastName) &&
        Objects.equals(this.status, userUpdateResource.status) &&
        Objects.equals(this.userGroupIds, userUpdateResource.userGroupIds) &&
        Objects.equals(this.externalAuthConfigId, userUpdateResource.externalAuthConfigId) &&
        Objects.equals(this.externalUserName, userUpdateResource.externalUserName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, email, password, firstName, lastName, status, userGroupIds, externalAuthConfigId, externalUserName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpdateResource {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userGroupIds: ").append(toIndentedString(userGroupIds)).append("\n");
    sb.append("    externalAuthConfigId: ").append(toIndentedString(externalAuthConfigId)).append("\n");
    sb.append("    externalUserName: ").append(toIndentedString(externalUserName)).append("\n");
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

