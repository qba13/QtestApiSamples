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
import io.swagger.client.model.PropertyResource;
import io.swagger.client.model.ReleaseWithCustomFieldResource;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * BuildResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class BuildResource {
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

  @SerializedName("release")
  private ReleaseWithCustomFieldResource release = null;

  public BuildResource links(List<Link> links) {
    this.links = links;
    return this;
  }

  public BuildResource addLinksItem(Link linksItem) {
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

  public BuildResource id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * ID of the Build
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "ID of the Build")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BuildResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the Build
   * @return name
  **/
  @ApiModelProperty(example = "Build 1", value = "Name of the Build")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BuildResource order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Order in left tree of the Build
   * @return order
  **/
  @ApiModelProperty(example = "1", value = "Order in left tree of the Build")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public BuildResource pid(String pid) {
    this.pid = pid;
    return this;
  }

   /**
   * PID of the Build
   * @return pid
  **/
  @ApiModelProperty(example = "BL-1", value = "PID of the Build")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public BuildResource createdDate(DateTime createdDate) {
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

  public BuildResource lastModifiedDate(DateTime lastModifiedDate) {
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

  public BuildResource properties(List<PropertyResource> properties) {
    this.properties = properties;
    return this;
  }

  public BuildResource addPropertiesItem(PropertyResource propertiesItem) {
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Arrays property of the Build
   * @return properties
  **/
  @ApiModelProperty(example = "null", required = true, value = "Arrays property of the Build")
  public List<PropertyResource> getProperties() {
    return properties;
  }

  public void setProperties(List<PropertyResource> properties) {
    this.properties = properties;
  }

  public BuildResource release(ReleaseWithCustomFieldResource release) {
    this.release = release;
    return this;
  }

   /**
   * Get release
   * @return release
  **/
  @ApiModelProperty(example = "null", value = "")
  public ReleaseWithCustomFieldResource getRelease() {
    return release;
  }

  public void setRelease(ReleaseWithCustomFieldResource release) {
    this.release = release;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildResource buildResource = (BuildResource) o;
    return Objects.equals(this.links, buildResource.links) &&
        Objects.equals(this.id, buildResource.id) &&
        Objects.equals(this.name, buildResource.name) &&
        Objects.equals(this.order, buildResource.order) &&
        Objects.equals(this.pid, buildResource.pid) &&
        Objects.equals(this.createdDate, buildResource.createdDate) &&
        Objects.equals(this.lastModifiedDate, buildResource.lastModifiedDate) &&
        Objects.equals(this.properties, buildResource.properties) &&
        Objects.equals(this.release, buildResource.release);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, name, order, pid, createdDate, lastModifiedDate, properties, release);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildResource {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
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

