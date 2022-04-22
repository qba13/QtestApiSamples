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
import io.swagger.client.model.ExternalPropertyResource;
import io.swagger.client.model.Link;
import io.swagger.client.model.PropertyResource;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * RequirementResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class RequirementResource {
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

  @SerializedName("properties")
  private List<PropertyResource> properties = new ArrayList<PropertyResource>();

  @SerializedName("web_url")
  private String webUrl = null;

  @SerializedName("parent_id")
  private Long parentId = null;

  @SerializedName("external_properties")
  private ExternalPropertyResource externalProperties = null;

  public RequirementResource links(List<Link> links) {
    this.links = links;
    return this;
  }

  public RequirementResource addLinksItem(Link linksItem) {
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

  public RequirementResource id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "4171806", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RequirementResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Video sections", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RequirementResource order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public RequirementResource pid(String pid) {
    this.pid = pid;
    return this;
  }

   /**
   * Get pid
   * @return pid
  **/
  @ApiModelProperty(example = "RQ-5", value = "")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public RequirementResource createdDate(DateTime createdDate) {
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

  public RequirementResource lastModifiedDate(DateTime lastModifiedDate) {
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

  public RequirementResource properties(List<PropertyResource> properties) {
    this.properties = properties;
    return this;
  }

  public RequirementResource addPropertiesItem(PropertyResource propertiesItem) {
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<PropertyResource> getProperties() {
    return properties;
  }

  public void setProperties(List<PropertyResource> properties) {
    this.properties = properties;
  }

   /**
   * Get webUrl
   * @return webUrl
  **/
  @ApiModelProperty(example = "https://apitryout.qtestnet.com/p/39047/portal/project#tab&#x3D;requirements&amp;object&#x3D;5&amp;id&#x3D;4171806", value = "")
  public String getWebUrl() {
    return webUrl;
  }

  public RequirementResource parentId(Long parentId) {
    this.parentId = parentId;
    return this;
  }

   /**
   * Get parentId
   * @return parentId
  **/
  @ApiModelProperty(example = "2107628", value = "")
  public Long getParentId() {
    return parentId;
  }

  public void setParentId(Long parentId) {
    this.parentId = parentId;
  }

  public RequirementResource externalProperties(ExternalPropertyResource externalProperties) {
    this.externalProperties = externalProperties;
    return this;
  }

   /**
   * Get externalProperties
   * @return externalProperties
  **/
  @ApiModelProperty(example = "null", value = "")
  public ExternalPropertyResource getExternalProperties() {
    return externalProperties;
  }

  public void setExternalProperties(ExternalPropertyResource externalProperties) {
    this.externalProperties = externalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequirementResource requirementResource = (RequirementResource) o;
    return Objects.equals(this.links, requirementResource.links) &&
        Objects.equals(this.id, requirementResource.id) &&
        Objects.equals(this.name, requirementResource.name) &&
        Objects.equals(this.order, requirementResource.order) &&
        Objects.equals(this.pid, requirementResource.pid) &&
        Objects.equals(this.createdDate, requirementResource.createdDate) &&
        Objects.equals(this.lastModifiedDate, requirementResource.lastModifiedDate) &&
        Objects.equals(this.properties, requirementResource.properties) &&
        Objects.equals(this.webUrl, requirementResource.webUrl) &&
        Objects.equals(this.parentId, requirementResource.parentId) &&
        Objects.equals(this.externalProperties, requirementResource.externalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, name, order, pid, createdDate, lastModifiedDate, properties, webUrl, parentId, externalProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequirementResource {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    externalProperties: ").append(toIndentedString(externalProperties)).append("\n");
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
