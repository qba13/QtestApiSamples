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
 * AllowedValueResource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class AllowedValueResource {
  @SerializedName("links")
  private List<Link> links = new ArrayList<Link>();

  @SerializedName("value")
  private Long value = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("order")
  private Integer order = null;

  @SerializedName("is_default")
  private Boolean isDefault = false;

  @SerializedName("is_active")
  private Boolean isActive = false;

  @SerializedName("color")
  private String color = null;

  public AllowedValueResource links(List<Link> links) {
    this.links = links;
    return this;
  }

  public AllowedValueResource addLinksItem(Link linksItem) {
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

  public AllowedValueResource value(Long value) {
    this.value = value;
    return this;
  }

   /**
   * Value of AllowedValue
   * @return value
  **/
  @ApiModelProperty(example = "601", value = "Value of AllowedValue")
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  public AllowedValueResource label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Label of AllowedValue
   * @return label
  **/
  @ApiModelProperty(example = "Passed", value = "Label of AllowedValue")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public AllowedValueResource order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * Display order of AllowedValue
   * @return order
  **/
  @ApiModelProperty(example = "1", value = "Display order of AllowedValue")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public AllowedValueResource isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Is default value or not
   * @return isDefault
  **/
  @ApiModelProperty(example = "true", value = "Is default value or not")
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public AllowedValueResource isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Is active or not
   * @return isActive
  **/
  @ApiModelProperty(example = "true", value = "Is active or not")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public AllowedValueResource color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Color of AllowedValue if Field is Test Run's Status 
   * @return color
  **/
  @ApiModelProperty(example = "#c0c0c0", value = "Color of AllowedValue if Field is Test Run's Status ")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllowedValueResource allowedValueResource = (AllowedValueResource) o;
    return Objects.equals(this.links, allowedValueResource.links) &&
        Objects.equals(this.value, allowedValueResource.value) &&
        Objects.equals(this.label, allowedValueResource.label) &&
        Objects.equals(this.order, allowedValueResource.order) &&
        Objects.equals(this.isDefault, allowedValueResource.isDefault) &&
        Objects.equals(this.isActive, allowedValueResource.isActive) &&
        Objects.equals(this.color, allowedValueResource.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, value, label, order, isDefault, isActive, color);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllowedValueResource {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

