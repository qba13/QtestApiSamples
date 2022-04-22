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
 * SearchUserResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class SearchUserResource {
  @SerializedName("links")
  private List<Link> links = new ArrayList<Link>();

  @SerializedName("id")
  private Long id = null;

  @SerializedName("username")
  private String username = null;

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

  @SerializedName("avatar")
  private String avatar = null;

  @SerializedName("ldap_username")
  private String ldapUsername = null;

  @SerializedName("timezone_offset")
  private String timezoneOffset = null;

  @SerializedName("country_name")
  private String countryName = null;

  @SerializedName("user_group_ids")
  private List<Long> userGroupIds = new ArrayList<Long>();

  @SerializedName("send_activation_email")
  private Boolean sendActivationEmail = false;

  @SerializedName("external_auth_config_id")
  private Long externalAuthConfigId = null;

  @SerializedName("external_user_name")
  private String externalUserName = null;

  @SerializedName("include_default_groups")
  private Boolean includeDefaultGroups = false;

  @SerializedName("assigned_projects")
  private List<Long> assignedProjects = new ArrayList<Long>();

  public SearchUserResource links(List<Link> links) {
    this.links = links;
    return this;
  }

  public SearchUserResource addLinksItem(Link linksItem) {
    this.links.add(linksItem);
    return this;
  }

   /**
   * Link to resource
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "Link to resource")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  public SearchUserResource id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the User
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "ID of the User")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SearchUserResource username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Login username of the User
   * @return username
  **/
  @ApiModelProperty(example = "example.user@qtest.com", value = "Login username of the User")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public SearchUserResource email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Contact email of the User
   * @return email
  **/
  @ApiModelProperty(example = "example.user@qtest.com", value = "Contact email of the User")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public SearchUserResource password(String password) {
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

  public SearchUserResource firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the User
   * @return firstName
  **/
  @ApiModelProperty(example = "Example", value = "First name of the User")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public SearchUserResource lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the User
   * @return lastName
  **/
  @ApiModelProperty(example = "Example", value = "Last name of the User")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public SearchUserResource status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the User
   * @return status
  **/
  @ApiModelProperty(example = "0", value = "Status of the User")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public SearchUserResource avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * Avatar URL of the User
   * @return avatar
  **/
  @ApiModelProperty(example = "https://apitryout.qtestnet.com/api/v3/users/1/avatar", value = "Avatar URL of the User")
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public SearchUserResource ldapUsername(String ldapUsername) {
    this.ldapUsername = ldapUsername;
    return this;
  }

   /**
   * LDAP username
   * @return ldapUsername
  **/
  @ApiModelProperty(example = "null", value = "LDAP username")
  public String getLdapUsername() {
    return ldapUsername;
  }

  public void setLdapUsername(String ldapUsername) {
    this.ldapUsername = ldapUsername;
  }

  public SearchUserResource timezoneOffset(String timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
    return this;
  }

   /**
   * Timezone offset
   * @return timezoneOffset
  **/
  @ApiModelProperty(example = "+01:00", value = "Timezone offset")
  public String getTimezoneOffset() {
    return timezoneOffset;
  }

  public void setTimezoneOffset(String timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
  }

  public SearchUserResource countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

   /**
   * Country name of configured timezone
   * @return countryName
  **/
  @ApiModelProperty(example = "England", value = "Country name of configured timezone")
  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public SearchUserResource userGroupIds(List<Long> userGroupIds) {
    this.userGroupIds = userGroupIds;
    return this;
  }

  public SearchUserResource addUserGroupIdsItem(Long userGroupIdsItem) {
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

  public SearchUserResource sendActivationEmail(Boolean sendActivationEmail) {
    this.sendActivationEmail = sendActivationEmail;
    return this;
  }

   /**
   * Get sendActivationEmail
   * @return sendActivationEmail
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSendActivationEmail() {
    return sendActivationEmail;
  }

  public void setSendActivationEmail(Boolean sendActivationEmail) {
    this.sendActivationEmail = sendActivationEmail;
  }

  public SearchUserResource externalAuthConfigId(Long externalAuthConfigId) {
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

  public SearchUserResource externalUserName(String externalUserName) {
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

  public SearchUserResource includeDefaultGroups(Boolean includeDefaultGroups) {
    this.includeDefaultGroups = includeDefaultGroups;
    return this;
  }

   /**
   * Get includeDefaultGroups
   * @return includeDefaultGroups
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getIncludeDefaultGroups() {
    return includeDefaultGroups;
  }

  public void setIncludeDefaultGroups(Boolean includeDefaultGroups) {
    this.includeDefaultGroups = includeDefaultGroups;
  }

  public SearchUserResource assignedProjects(List<Long> assignedProjects) {
    this.assignedProjects = assignedProjects;
    return this;
  }

  public SearchUserResource addAssignedProjectsItem(Long assignedProjectsItem) {
    this.assignedProjects.add(assignedProjectsItem);
    return this;
  }

   /**
   * Arrays of Project that user assigned to
   * @return assignedProjects
  **/
  @ApiModelProperty(example = "null", value = "Arrays of Project that user assigned to")
  public List<Long> getAssignedProjects() {
    return assignedProjects;
  }

  public void setAssignedProjects(List<Long> assignedProjects) {
    this.assignedProjects = assignedProjects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchUserResource searchUserResource = (SearchUserResource) o;
    return Objects.equals(this.links, searchUserResource.links) &&
        Objects.equals(this.id, searchUserResource.id) &&
        Objects.equals(this.username, searchUserResource.username) &&
        Objects.equals(this.email, searchUserResource.email) &&
        Objects.equals(this.password, searchUserResource.password) &&
        Objects.equals(this.firstName, searchUserResource.firstName) &&
        Objects.equals(this.lastName, searchUserResource.lastName) &&
        Objects.equals(this.status, searchUserResource.status) &&
        Objects.equals(this.avatar, searchUserResource.avatar) &&
        Objects.equals(this.ldapUsername, searchUserResource.ldapUsername) &&
        Objects.equals(this.timezoneOffset, searchUserResource.timezoneOffset) &&
        Objects.equals(this.countryName, searchUserResource.countryName) &&
        Objects.equals(this.userGroupIds, searchUserResource.userGroupIds) &&
        Objects.equals(this.sendActivationEmail, searchUserResource.sendActivationEmail) &&
        Objects.equals(this.externalAuthConfigId, searchUserResource.externalAuthConfigId) &&
        Objects.equals(this.externalUserName, searchUserResource.externalUserName) &&
        Objects.equals(this.includeDefaultGroups, searchUserResource.includeDefaultGroups) &&
        Objects.equals(this.assignedProjects, searchUserResource.assignedProjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, username, email, password, firstName, lastName, status, avatar, ldapUsername, timezoneOffset, countryName, userGroupIds, sendActivationEmail, externalAuthConfigId, externalUserName, includeDefaultGroups, assignedProjects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchUserResource {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    ldapUsername: ").append(toIndentedString(ldapUsername)).append("\n");
    sb.append("    timezoneOffset: ").append(toIndentedString(timezoneOffset)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    userGroupIds: ").append(toIndentedString(userGroupIds)).append("\n");
    sb.append("    sendActivationEmail: ").append(toIndentedString(sendActivationEmail)).append("\n");
    sb.append("    externalAuthConfigId: ").append(toIndentedString(externalAuthConfigId)).append("\n");
    sb.append("    externalUserName: ").append(toIndentedString(externalUserName)).append("\n");
    sb.append("    includeDefaultGroups: ").append(toIndentedString(includeDefaultGroups)).append("\n");
    sb.append("    assignedProjects: ").append(toIndentedString(assignedProjects)).append("\n");
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

