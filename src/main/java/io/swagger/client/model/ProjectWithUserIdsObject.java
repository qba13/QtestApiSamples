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

/**
 * ProjectWithUserIdsObject
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class ProjectWithUserIdsObject {
  @SerializedName("project_id")
  private Long projectId = null;

  @SerializedName("user_ids")
  private List<Long> userIds = new ArrayList<Long>();

  public ProjectWithUserIdsObject projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * ID of the Project
   * @return projectId
  **/
  @ApiModelProperty(example = "null", value = "ID of the Project")
  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public ProjectWithUserIdsObject userIds(List<Long> userIds) {
    this.userIds = userIds;
    return this;
  }

  public ProjectWithUserIdsObject addUserIdsItem(Long userIdsItem) {
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Array User ID
   * @return userIds
  **/
  @ApiModelProperty(example = "null", value = "Array User ID")
  public List<Long> getUserIds() {
    return userIds;
  }

  public void setUserIds(List<Long> userIds) {
    this.userIds = userIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectWithUserIdsObject projectWithUserIdsObject = (ProjectWithUserIdsObject) o;
    return Objects.equals(this.projectId, projectWithUserIdsObject.projectId) &&
        Objects.equals(this.userIds, projectWithUserIdsObject.userIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, userIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectWithUserIdsObject {\n");
    
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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

