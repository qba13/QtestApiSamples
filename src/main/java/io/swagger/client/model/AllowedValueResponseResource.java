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
import io.swagger.client.model.AllowedValueResource;
import io.swagger.client.model.Link;
import java.util.ArrayList;
import java.util.List;

/**
 * AllowedValueResponseResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class AllowedValueResponseResource {
  @SerializedName("links")
  private List<Link> links = new ArrayList<Link>();

  @SerializedName("total")
  private Long total = null;

  @SerializedName("items")
  private List<AllowedValueResource> items = new ArrayList<AllowedValueResource>();

  public AllowedValueResponseResource links(List<Link> links) {
    this.links = links;
    return this;
  }

  public AllowedValueResponseResource addLinksItem(Link linksItem) {
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

  public AllowedValueResponseResource total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public AllowedValueResponseResource items(List<AllowedValueResource> items) {
    this.items = items;
    return this;
  }

  public AllowedValueResponseResource addItemsItem(AllowedValueResource itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<AllowedValueResource> getItems() {
    return items;
  }

  public void setItems(List<AllowedValueResource> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllowedValueResponseResource allowedValueResponseResource = (AllowedValueResponseResource) o;
    return Objects.equals(this.links, allowedValueResponseResource.links) &&
        Objects.equals(this.total, allowedValueResponseResource.total) &&
        Objects.equals(this.items, allowedValueResponseResource.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, total, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllowedValueResponseResource {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

