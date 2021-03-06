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
import io.swagger.client.model.ModuleResource;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * ModuleResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class ModuleResource {
  @SerializedName("links")
  private List<Link> links = new ArrayList<Link>();

  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("pid")
  private String pid = null;

  @SerializedName("created_date")
  private DateTime createdDate = null;

  @SerializedName("last_modified_date")
  private DateTime lastModifiedDate = null;

  @SerializedName("parent_id")
  private Long parentId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("shared")
  private Boolean shared = false;

  @SerializedName("children")
  private List<ModuleResource> children = new ArrayList<ModuleResource>();

  @SerializedName("recursive")
  private Boolean recursive = false;

  @SerializedName("tosca_guid")
  private String toscaGuid = null;

  @SerializedName("tosca_node_path")
  private String toscaNodePath = null;

  public ModuleResource links(List<Link> links) {
    this.links = links;
    return this;
  }

  public ModuleResource addLinksItem(Link linksItem) {
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

  public ModuleResource id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the Module
   * @return id
  **/
  @ApiModelProperty(example = "2107619", value = "ID of the Module")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ModuleResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the Module
   * @return name
  **/
  @ApiModelProperty(example = "MD-2 Homepage", value = "Name of the Module")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ModuleResource order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Display order of the Module
   * @return order
  **/
  @ApiModelProperty(example = "9", value = "Display order of the Module")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public ModuleResource pid(String pid) {
    this.pid = pid;
    return this;
  }

   /**
   * PID of the Module
   * @return pid
  **/
  @ApiModelProperty(example = "MD-8", value = "PID of the Module")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public ModuleResource createdDate(DateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(DateTime createdDate) {
    this.createdDate = createdDate;
  }

  public ModuleResource lastModifiedDate(DateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

   /**
   * Get lastModifiedDate
   * @return lastModifiedDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(DateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public ModuleResource parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Parent Module of the Module
   * @return parentId
  **/
  @ApiModelProperty(example = "2107628", value = "Parent Module of the Module")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public ModuleResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the Module
   * @return description
  **/
  @ApiModelProperty(example = "Description of Module 1", value = "Description of the Module")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ModuleResource shared(Boolean shared) {
    this.shared = shared;
    return this;
  }

   /**
   * Is shared or not
   * @return shared
  **/
  @ApiModelProperty(example = "false", value = "Is shared or not")
  public Boolean getShared() {
    return shared;
  }

  public void setShared(Boolean shared) {
    this.shared = shared;
  }

  public ModuleResource children(List<ModuleResource> children) {
    this.children = children;
    return this;
  }

  public ModuleResource addChildrenItem(ModuleResource childrenItem) {
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Arrays of child module
   * @return children
  **/
  @ApiModelProperty(example = "null", value = "Arrays of child module")
  public List<ModuleResource> getChildren() {
    return children;
  }

  public void setChildren(List<ModuleResource> children) {
    this.children = children;
  }

  public ModuleResource recursive(Boolean recursive) {
    this.recursive = recursive;
    return this;
  }

   /**
   * Get recursive
   * @return recursive
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getRecursive() {
    return recursive;
  }

  public void setRecursive(Boolean recursive) {
    this.recursive = recursive;
  }

  public ModuleResource toscaGuid(String toscaGuid) {
    this.toscaGuid = toscaGuid;
    return this;
  }

   /**
   * Tosca folder GUID. Use for creating Module and link with Tosca folder.
   * @return toscaGuid
  **/
  @ApiModelProperty(example = "null", value = "Tosca folder GUID. Use for creating Module and link with Tosca folder.")
  public String getToscaGuid() {
    return toscaGuid;
  }

  public void setToscaGuid(String toscaGuid) {
    this.toscaGuid = toscaGuid;
  }

  public ModuleResource toscaNodePath(String toscaNodePath) {
    this.toscaNodePath = toscaNodePath;
    return this;
  }

   /**
   * Tosca folder node path. Use for creating Module and link with Tosca folder.
   * @return toscaNodePath
  **/
  @ApiModelProperty(example = "null", value = "Tosca folder node path. Use for creating Module and link with Tosca folder.")
  public String getToscaNodePath() {
    return toscaNodePath;
  }

  public void setToscaNodePath(String toscaNodePath) {
    this.toscaNodePath = toscaNodePath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModuleResource moduleResource = (ModuleResource) o;
    return Objects.equals(this.links, moduleResource.links) &&
        Objects.equals(this.id, moduleResource.id) &&
        Objects.equals(this.name, moduleResource.name) &&
        Objects.equals(this.order, moduleResource.order) &&
        Objects.equals(this.pid, moduleResource.pid) &&
        Objects.equals(this.createdDate, moduleResource.createdDate) &&
        Objects.equals(this.lastModifiedDate, moduleResource.lastModifiedDate) &&
        Objects.equals(this.parentId, moduleResource.parentId) &&
        Objects.equals(this.description, moduleResource.description) &&
        Objects.equals(this.shared, moduleResource.shared) &&
        Objects.equals(this.children, moduleResource.children) &&
        Objects.equals(this.recursive, moduleResource.recursive) &&
        Objects.equals(this.toscaGuid, moduleResource.toscaGuid) &&
        Objects.equals(this.toscaNodePath, moduleResource.toscaNodePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, name, order, pid, createdDate, lastModifiedDate, parentId, description, shared, children, recursive, toscaGuid, toscaNodePath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModuleResource {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    recursive: ").append(toIndentedString(recursive)).append("\n");
    sb.append("    toscaGuid: ").append(toIndentedString(toscaGuid)).append("\n");
    sb.append("    toscaNodePath: ").append(toIndentedString(toscaNodePath)).append("\n");
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

