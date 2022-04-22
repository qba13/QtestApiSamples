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
import io.swagger.client.model.LdapConfigDetailResponse;
import io.swagger.client.model.SSOSamlConfigDetailResponse;
import io.swagger.client.model.TUAConfigDetailResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * AuthSystemResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class AuthSystemResponse {
  @SerializedName("ldaps")
  private List<LdapConfigDetailResponse> ldaps = new ArrayList<LdapConfigDetailResponse>();

  @SerializedName("sso")
  private SSOSamlConfigDetailResponse sso = null;

  @SerializedName("tua")
  private TUAConfigDetailResponse tua = null;

  public AuthSystemResponse ldaps(List<LdapConfigDetailResponse> ldaps) {
    this.ldaps = ldaps;
    return this;
  }

  public AuthSystemResponse addLdapsItem(LdapConfigDetailResponse ldapsItem) {
    this.ldaps.add(ldapsItem);
    return this;
  }

   /**
   * Get ldaps
   * @return ldaps
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LdapConfigDetailResponse> getLdaps() {
    return ldaps;
  }

  public void setLdaps(List<LdapConfigDetailResponse> ldaps) {
    this.ldaps = ldaps;
  }

  public AuthSystemResponse sso(SSOSamlConfigDetailResponse sso) {
    this.sso = sso;
    return this;
  }

   /**
   * Get sso
   * @return sso
  **/
  @ApiModelProperty(example = "null", value = "")
  public SSOSamlConfigDetailResponse getSso() {
    return sso;
  }

  public void setSso(SSOSamlConfigDetailResponse sso) {
    this.sso = sso;
  }

  public AuthSystemResponse tua(TUAConfigDetailResponse tua) {
    this.tua = tua;
    return this;
  }

   /**
   * Get tua
   * @return tua
  **/
  @ApiModelProperty(example = "null", value = "")
  public TUAConfigDetailResponse getTua() {
    return tua;
  }

  public void setTua(TUAConfigDetailResponse tua) {
    this.tua = tua;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthSystemResponse authSystemResponse = (AuthSystemResponse) o;
    return Objects.equals(this.ldaps, authSystemResponse.ldaps) &&
        Objects.equals(this.sso, authSystemResponse.sso) &&
        Objects.equals(this.tua, authSystemResponse.tua);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ldaps, sso, tua);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthSystemResponse {\n");
    
    sb.append("    ldaps: ").append(toIndentedString(ldaps)).append("\n");
    sb.append("    sso: ").append(toIndentedString(sso)).append("\n");
    sb.append("    tua: ").append(toIndentedString(tua)).append("\n");
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
