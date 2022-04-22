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
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * ReleaseWithCustomFieldResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class ReleaseWithCustomFieldResource {
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

  @SerializedName("description")
  private String description = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("start_date")
  private DateTime startDate = null;

  @SerializedName("end_date")
  private DateTime endDate = null;

  public ReleaseWithCustomFieldResource links(List<Link> links) {
    this.links = links;
    return this;
  }

  public ReleaseWithCustomFieldResource addLinksItem(Link linksItem) {
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

  public ReleaseWithCustomFieldResource id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "149652", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ReleaseWithCustomFieldResource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Release 2", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ReleaseWithCustomFieldResource order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(example = "2", value = "")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public ReleaseWithCustomFieldResource pid(String pid) {
    this.pid = pid;
    return this;
  }

   /**
   * Get pid
   * @return pid
  **/
  @ApiModelProperty(example = "RL-2", value = "")
  public String getPid() {
    return pid;
  }

  public void setPid(String pid) {
    this.pid = pid;
  }

  public ReleaseWithCustomFieldResource createdDate(DateTime createdDate) {
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

  public ReleaseWithCustomFieldResource lastModifiedDate(DateTime lastModifiedDate) {
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

  public ReleaseWithCustomFieldResource properties(List<PropertyResource> properties) {
    this.properties = properties;
    return this;
  }

  public ReleaseWithCustomFieldResource addPropertiesItem(PropertyResource propertiesItem) {
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
  @ApiModelProperty(example = "https://apitryout.qtestnet.com/p/39047/portal/project#tab&#x3D;testplan&amp;object&#x3D;8&amp;id&#x3D;149652", value = "")
  public String getWebUrl() {
    return webUrl;
  }

  public ReleaseWithCustomFieldResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "This is the second release", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ReleaseWithCustomFieldResource note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(example = "Note of the Release", value = "")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public ReleaseWithCustomFieldResource startDate(DateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(DateTime startDate) {
    this.startDate = startDate;
  }

  public ReleaseWithCustomFieldResource endDate(DateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(DateTime endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReleaseWithCustomFieldResource releaseWithCustomFieldResource = (ReleaseWithCustomFieldResource) o;
    return Objects.equals(this.links, releaseWithCustomFieldResource.links) &&
        Objects.equals(this.id, releaseWithCustomFieldResource.id) &&
        Objects.equals(this.name, releaseWithCustomFieldResource.name) &&
        Objects.equals(this.order, releaseWithCustomFieldResource.order) &&
        Objects.equals(this.pid, releaseWithCustomFieldResource.pid) &&
        Objects.equals(this.createdDate, releaseWithCustomFieldResource.createdDate) &&
        Objects.equals(this.lastModifiedDate, releaseWithCustomFieldResource.lastModifiedDate) &&
        Objects.equals(this.properties, releaseWithCustomFieldResource.properties) &&
        Objects.equals(this.webUrl, releaseWithCustomFieldResource.webUrl) &&
        Objects.equals(this.description, releaseWithCustomFieldResource.description) &&
        Objects.equals(this.note, releaseWithCustomFieldResource.note) &&
        Objects.equals(this.startDate, releaseWithCustomFieldResource.startDate) &&
        Objects.equals(this.endDate, releaseWithCustomFieldResource.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, name, order, pid, createdDate, lastModifiedDate, properties, webUrl, description, note, startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseWithCustomFieldResource {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
