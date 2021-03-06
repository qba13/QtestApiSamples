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
import io.swagger.client.model.Defect;
import org.joda.time.DateTime;

/**
 * DefectComment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class DefectComment {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("clientId")
  private Long clientId = null;

  @SerializedName("projectId")
  private Long projectId = null;

  @SerializedName("objectId")
  private Long objectId = null;

  @SerializedName("objectTypeId")
  private Long objectTypeId = null;

  @SerializedName("userId")
  private Long userId = null;

  @SerializedName("objectComment")
  private String objectComment = null;

  @SerializedName("commentDate")
  private DateTime commentDate = null;

  @SerializedName("editDate")
  private DateTime editDate = null;

  @SerializedName("defect")
  private Defect defect = null;

  @SerializedName("longId")
  private Long longId = null;

  public DefectComment id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DefectComment clientId(Long clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getClientId() {
    return clientId;
  }

  public void setClientId(Long clientId) {
    this.clientId = clientId;
  }

  public DefectComment projectId(Long projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public DefectComment objectId(Long objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getObjectId() {
    return objectId;
  }

  public void setObjectId(Long objectId) {
    this.objectId = objectId;
  }

  public DefectComment objectTypeId(Long objectTypeId) {
    this.objectTypeId = objectTypeId;
    return this;
  }

   /**
   * Get objectTypeId
   * @return objectTypeId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getObjectTypeId() {
    return objectTypeId;
  }

  public void setObjectTypeId(Long objectTypeId) {
    this.objectTypeId = objectTypeId;
  }

  public DefectComment userId(Long userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public DefectComment objectComment(String objectComment) {
    this.objectComment = objectComment;
    return this;
  }

   /**
   * Get objectComment
   * @return objectComment
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getObjectComment() {
    return objectComment;
  }

  public void setObjectComment(String objectComment) {
    this.objectComment = objectComment;
  }

  public DefectComment commentDate(DateTime commentDate) {
    this.commentDate = commentDate;
    return this;
  }

   /**
   * Get commentDate
   * @return commentDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCommentDate() {
    return commentDate;
  }

  public void setCommentDate(DateTime commentDate) {
    this.commentDate = commentDate;
  }

  public DefectComment editDate(DateTime editDate) {
    this.editDate = editDate;
    return this;
  }

   /**
   * Get editDate
   * @return editDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getEditDate() {
    return editDate;
  }

  public void setEditDate(DateTime editDate) {
    this.editDate = editDate;
  }

  public DefectComment defect(Defect defect) {
    this.defect = defect;
    return this;
  }

   /**
   * Get defect
   * @return defect
  **/
  @ApiModelProperty(example = "null", value = "")
  public Defect getDefect() {
    return defect;
  }

  public void setDefect(Defect defect) {
    this.defect = defect;
  }

  public DefectComment longId(Long longId) {
    this.longId = longId;
    return this;
  }

   /**
   * Get longId
   * @return longId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getLongId() {
    return longId;
  }

  public void setLongId(Long longId) {
    this.longId = longId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefectComment defectComment = (DefectComment) o;
    return Objects.equals(this.id, defectComment.id) &&
        Objects.equals(this.clientId, defectComment.clientId) &&
        Objects.equals(this.projectId, defectComment.projectId) &&
        Objects.equals(this.objectId, defectComment.objectId) &&
        Objects.equals(this.objectTypeId, defectComment.objectTypeId) &&
        Objects.equals(this.userId, defectComment.userId) &&
        Objects.equals(this.objectComment, defectComment.objectComment) &&
        Objects.equals(this.commentDate, defectComment.commentDate) &&
        Objects.equals(this.editDate, defectComment.editDate) &&
        Objects.equals(this.defect, defectComment.defect) &&
        Objects.equals(this.longId, defectComment.longId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientId, projectId, objectId, objectTypeId, userId, objectComment, commentDate, editDate, defect, longId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefectComment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    objectTypeId: ").append(toIndentedString(objectTypeId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    objectComment: ").append(toIndentedString(objectComment)).append("\n");
    sb.append("    commentDate: ").append(toIndentedString(commentDate)).append("\n");
    sb.append("    editDate: ").append(toIndentedString(editDate)).append("\n");
    sb.append("    defect: ").append(toIndentedString(defect)).append("\n");
    sb.append("    longId: ").append(toIndentedString(longId)).append("\n");
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

