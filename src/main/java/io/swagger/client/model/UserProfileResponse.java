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
import io.swagger.client.model.Profile;
import java.util.ArrayList;
import java.util.List;

/**
 * UserProfileResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class UserProfileResponse {
  @SerializedName("user_profiles")
  private List<Profile> userProfiles = new ArrayList<Profile>();

  @SerializedName("admin_profiles")
  private List<Profile> adminProfiles = new ArrayList<Profile>();

  @SerializedName("total_user_profiles")
  private Integer totalUserProfiles = null;

  @SerializedName("total_admin_profiles")
  private Integer totalAdminProfiles = null;

  public UserProfileResponse userProfiles(List<Profile> userProfiles) {
    this.userProfiles = userProfiles;
    return this;
  }

  public UserProfileResponse addUserProfilesItem(Profile userProfilesItem) {
    this.userProfiles.add(userProfilesItem);
    return this;
  }

   /**
   * Arrays of User Profile
   * @return userProfiles
  **/
  @ApiModelProperty(example = "null", value = "Arrays of User Profile")
  public List<Profile> getUserProfiles() {
    return userProfiles;
  }

  public void setUserProfiles(List<Profile> userProfiles) {
    this.userProfiles = userProfiles;
  }

  public UserProfileResponse adminProfiles(List<Profile> adminProfiles) {
    this.adminProfiles = adminProfiles;
    return this;
  }

  public UserProfileResponse addAdminProfilesItem(Profile adminProfilesItem) {
    this.adminProfiles.add(adminProfilesItem);
    return this;
  }

   /**
   * Arrays of Admin Profile
   * @return adminProfiles
  **/
  @ApiModelProperty(example = "null", value = "Arrays of Admin Profile")
  public List<Profile> getAdminProfiles() {
    return adminProfiles;
  }

  public void setAdminProfiles(List<Profile> adminProfiles) {
    this.adminProfiles = adminProfiles;
  }

   /**
   * Total User Profile
   * @return totalUserProfiles
  **/
  @ApiModelProperty(example = "null", value = "Total User Profile")
  public Integer getTotalUserProfiles() {
    return totalUserProfiles;
  }

   /**
   * Total Admin Profile
   * @return totalAdminProfiles
  **/
  @ApiModelProperty(example = "null", value = "Total Admin Profile")
  public Integer getTotalAdminProfiles() {
    return totalAdminProfiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfileResponse userProfileResponse = (UserProfileResponse) o;
    return Objects.equals(this.userProfiles, userProfileResponse.userProfiles) &&
        Objects.equals(this.adminProfiles, userProfileResponse.adminProfiles) &&
        Objects.equals(this.totalUserProfiles, userProfileResponse.totalUserProfiles) &&
        Objects.equals(this.totalAdminProfiles, userProfileResponse.totalAdminProfiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userProfiles, adminProfiles, totalUserProfiles, totalAdminProfiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfileResponse {\n");
    
    sb.append("    userProfiles: ").append(toIndentedString(userProfiles)).append("\n");
    sb.append("    adminProfiles: ").append(toIndentedString(adminProfiles)).append("\n");
    sb.append("    totalUserProfiles: ").append(toIndentedString(totalUserProfiles)).append("\n");
    sb.append("    totalAdminProfiles: ").append(toIndentedString(totalAdminProfiles)).append("\n");
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

