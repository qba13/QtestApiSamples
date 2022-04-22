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

/**
 * Client
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class Client {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("siteName")
  private String siteName = null;

  @SerializedName("maxFailedLoginAttempt")
  private Integer maxFailedLoginAttempt = null;

  @SerializedName("passwordShelfLife")
  private Integer passwordShelfLife = null;

  @SerializedName("passwordHealthyPeriod")
  private Integer passwordHealthyPeriod = null;

  @SerializedName("minimumUniquePasswordsSequenceLength")
  private Integer minimumUniquePasswordsSequenceLength = null;

  @SerializedName("licenseBlobId")
  private Long licenseBlobId = null;

  @SerializedName("sessionTimeoutEnabled")
  private Boolean sessionTimeoutEnabled = false;

  @SerializedName("sessionTimeoutMinute")
  private Integer sessionTimeoutMinute = null;

  @SerializedName("terminateIdleEnabled")
  private Boolean terminateIdleEnabled = false;

  @SerializedName("terminateIdleMinute")
  private Integer terminateIdleMinute = null;

  @SerializedName("dateFormat")
  private String dateFormat = null;

  @SerializedName("rememberMeTimeoutEnabled")
  private Boolean rememberMeTimeoutEnabled = false;

  @SerializedName("rememberMeTimeoutDay")
  private Integer rememberMeTimeoutDay = null;

  @SerializedName("mailRecipients")
  private String mailRecipients = null;

  @SerializedName("useCustomPasswordPolicy")
  private Boolean useCustomPasswordPolicy = false;

  @SerializedName("minimumPasswordLength")
  private Integer minimumPasswordLength = null;

  @SerializedName("passwordContainsCapitalLetters")
  private Boolean passwordContainsCapitalLetters = false;

  @SerializedName("passwordContainsLowercaseLetters")
  private Boolean passwordContainsLowercaseLetters = false;

  @SerializedName("passwordContainsNumericChars")
  private Boolean passwordContainsNumericChars = false;

  @SerializedName("passwordContainsSpecialChars")
  private Boolean passwordContainsSpecialChars = false;

  /**
   * Gets or Sets searchStatus
   */
  public enum SearchStatusEnum {
    @SerializedName("ELASTICSEARCH")
    ELASTICSEARCH("ELASTICSEARCH"),
    
    @SerializedName("REINDEXING")
    REINDEXING("REINDEXING"),
    
    @SerializedName("ELASTICSEARCH_MIGRATED")
    ELASTICSEARCH_MIGRATED("ELASTICSEARCH_MIGRATED");

    private String value;

    SearchStatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("searchStatus")
  private SearchStatusEnum searchStatus = null;

  @SerializedName("searchMigrationDuration")
  private Long searchMigrationDuration = null;

  @SerializedName("trackingRequirementTestcaseVersionLink")
  private Boolean trackingRequirementTestcaseVersionLink = false;

  @SerializedName("inactive")
  private Boolean inactive = false;

  @SerializedName("forOnPremise")
  private Boolean forOnPremise = false;

  @SerializedName("forExplorer")
  private Boolean forExplorer = false;

  @SerializedName("tdstenantId")
  private String tdstenantId = null;

  public Client id(Long id) {
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

  public Client name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Client siteName(String siteName) {
    this.siteName = siteName;
    return this;
  }

   /**
   * Get siteName
   * @return siteName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSiteName() {
    return siteName;
  }

  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }

  public Client maxFailedLoginAttempt(Integer maxFailedLoginAttempt) {
    this.maxFailedLoginAttempt = maxFailedLoginAttempt;
    return this;
  }

   /**
   * Get maxFailedLoginAttempt
   * @return maxFailedLoginAttempt
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMaxFailedLoginAttempt() {
    return maxFailedLoginAttempt;
  }

  public void setMaxFailedLoginAttempt(Integer maxFailedLoginAttempt) {
    this.maxFailedLoginAttempt = maxFailedLoginAttempt;
  }

  public Client passwordShelfLife(Integer passwordShelfLife) {
    this.passwordShelfLife = passwordShelfLife;
    return this;
  }

   /**
   * Get passwordShelfLife
   * @return passwordShelfLife
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPasswordShelfLife() {
    return passwordShelfLife;
  }

  public void setPasswordShelfLife(Integer passwordShelfLife) {
    this.passwordShelfLife = passwordShelfLife;
  }

  public Client passwordHealthyPeriod(Integer passwordHealthyPeriod) {
    this.passwordHealthyPeriod = passwordHealthyPeriod;
    return this;
  }

   /**
   * Get passwordHealthyPeriod
   * @return passwordHealthyPeriod
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPasswordHealthyPeriod() {
    return passwordHealthyPeriod;
  }

  public void setPasswordHealthyPeriod(Integer passwordHealthyPeriod) {
    this.passwordHealthyPeriod = passwordHealthyPeriod;
  }

  public Client minimumUniquePasswordsSequenceLength(Integer minimumUniquePasswordsSequenceLength) {
    this.minimumUniquePasswordsSequenceLength = minimumUniquePasswordsSequenceLength;
    return this;
  }

   /**
   * Get minimumUniquePasswordsSequenceLength
   * @return minimumUniquePasswordsSequenceLength
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMinimumUniquePasswordsSequenceLength() {
    return minimumUniquePasswordsSequenceLength;
  }

  public void setMinimumUniquePasswordsSequenceLength(Integer minimumUniquePasswordsSequenceLength) {
    this.minimumUniquePasswordsSequenceLength = minimumUniquePasswordsSequenceLength;
  }

  public Client licenseBlobId(Long licenseBlobId) {
    this.licenseBlobId = licenseBlobId;
    return this;
  }

   /**
   * Get licenseBlobId
   * @return licenseBlobId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getLicenseBlobId() {
    return licenseBlobId;
  }

  public void setLicenseBlobId(Long licenseBlobId) {
    this.licenseBlobId = licenseBlobId;
  }

  public Client sessionTimeoutEnabled(Boolean sessionTimeoutEnabled) {
    this.sessionTimeoutEnabled = sessionTimeoutEnabled;
    return this;
  }

   /**
   * Get sessionTimeoutEnabled
   * @return sessionTimeoutEnabled
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSessionTimeoutEnabled() {
    return sessionTimeoutEnabled;
  }

  public void setSessionTimeoutEnabled(Boolean sessionTimeoutEnabled) {
    this.sessionTimeoutEnabled = sessionTimeoutEnabled;
  }

  public Client sessionTimeoutMinute(Integer sessionTimeoutMinute) {
    this.sessionTimeoutMinute = sessionTimeoutMinute;
    return this;
  }

   /**
   * Get sessionTimeoutMinute
   * @return sessionTimeoutMinute
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSessionTimeoutMinute() {
    return sessionTimeoutMinute;
  }

  public void setSessionTimeoutMinute(Integer sessionTimeoutMinute) {
    this.sessionTimeoutMinute = sessionTimeoutMinute;
  }

  public Client terminateIdleEnabled(Boolean terminateIdleEnabled) {
    this.terminateIdleEnabled = terminateIdleEnabled;
    return this;
  }

   /**
   * Get terminateIdleEnabled
   * @return terminateIdleEnabled
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getTerminateIdleEnabled() {
    return terminateIdleEnabled;
  }

  public void setTerminateIdleEnabled(Boolean terminateIdleEnabled) {
    this.terminateIdleEnabled = terminateIdleEnabled;
  }

  public Client terminateIdleMinute(Integer terminateIdleMinute) {
    this.terminateIdleMinute = terminateIdleMinute;
    return this;
  }

   /**
   * Get terminateIdleMinute
   * @return terminateIdleMinute
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTerminateIdleMinute() {
    return terminateIdleMinute;
  }

  public void setTerminateIdleMinute(Integer terminateIdleMinute) {
    this.terminateIdleMinute = terminateIdleMinute;
  }

  public Client dateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * Get dateFormat
   * @return dateFormat
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(String dateFormat) {
    this.dateFormat = dateFormat;
  }

  public Client rememberMeTimeoutEnabled(Boolean rememberMeTimeoutEnabled) {
    this.rememberMeTimeoutEnabled = rememberMeTimeoutEnabled;
    return this;
  }

   /**
   * Get rememberMeTimeoutEnabled
   * @return rememberMeTimeoutEnabled
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getRememberMeTimeoutEnabled() {
    return rememberMeTimeoutEnabled;
  }

  public void setRememberMeTimeoutEnabled(Boolean rememberMeTimeoutEnabled) {
    this.rememberMeTimeoutEnabled = rememberMeTimeoutEnabled;
  }

  public Client rememberMeTimeoutDay(Integer rememberMeTimeoutDay) {
    this.rememberMeTimeoutDay = rememberMeTimeoutDay;
    return this;
  }

   /**
   * Get rememberMeTimeoutDay
   * @return rememberMeTimeoutDay
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getRememberMeTimeoutDay() {
    return rememberMeTimeoutDay;
  }

  public void setRememberMeTimeoutDay(Integer rememberMeTimeoutDay) {
    this.rememberMeTimeoutDay = rememberMeTimeoutDay;
  }

  public Client mailRecipients(String mailRecipients) {
    this.mailRecipients = mailRecipients;
    return this;
  }

   /**
   * Get mailRecipients
   * @return mailRecipients
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMailRecipients() {
    return mailRecipients;
  }

  public void setMailRecipients(String mailRecipients) {
    this.mailRecipients = mailRecipients;
  }

  public Client useCustomPasswordPolicy(Boolean useCustomPasswordPolicy) {
    this.useCustomPasswordPolicy = useCustomPasswordPolicy;
    return this;
  }

   /**
   * Get useCustomPasswordPolicy
   * @return useCustomPasswordPolicy
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getUseCustomPasswordPolicy() {
    return useCustomPasswordPolicy;
  }

  public void setUseCustomPasswordPolicy(Boolean useCustomPasswordPolicy) {
    this.useCustomPasswordPolicy = useCustomPasswordPolicy;
  }

  public Client minimumPasswordLength(Integer minimumPasswordLength) {
    this.minimumPasswordLength = minimumPasswordLength;
    return this;
  }

   /**
   * Get minimumPasswordLength
   * @return minimumPasswordLength
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMinimumPasswordLength() {
    return minimumPasswordLength;
  }

  public void setMinimumPasswordLength(Integer minimumPasswordLength) {
    this.minimumPasswordLength = minimumPasswordLength;
  }

  public Client passwordContainsCapitalLetters(Boolean passwordContainsCapitalLetters) {
    this.passwordContainsCapitalLetters = passwordContainsCapitalLetters;
    return this;
  }

   /**
   * Get passwordContainsCapitalLetters
   * @return passwordContainsCapitalLetters
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPasswordContainsCapitalLetters() {
    return passwordContainsCapitalLetters;
  }

  public void setPasswordContainsCapitalLetters(Boolean passwordContainsCapitalLetters) {
    this.passwordContainsCapitalLetters = passwordContainsCapitalLetters;
  }

  public Client passwordContainsLowercaseLetters(Boolean passwordContainsLowercaseLetters) {
    this.passwordContainsLowercaseLetters = passwordContainsLowercaseLetters;
    return this;
  }

   /**
   * Get passwordContainsLowercaseLetters
   * @return passwordContainsLowercaseLetters
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPasswordContainsLowercaseLetters() {
    return passwordContainsLowercaseLetters;
  }

  public void setPasswordContainsLowercaseLetters(Boolean passwordContainsLowercaseLetters) {
    this.passwordContainsLowercaseLetters = passwordContainsLowercaseLetters;
  }

  public Client passwordContainsNumericChars(Boolean passwordContainsNumericChars) {
    this.passwordContainsNumericChars = passwordContainsNumericChars;
    return this;
  }

   /**
   * Get passwordContainsNumericChars
   * @return passwordContainsNumericChars
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPasswordContainsNumericChars() {
    return passwordContainsNumericChars;
  }

  public void setPasswordContainsNumericChars(Boolean passwordContainsNumericChars) {
    this.passwordContainsNumericChars = passwordContainsNumericChars;
  }

  public Client passwordContainsSpecialChars(Boolean passwordContainsSpecialChars) {
    this.passwordContainsSpecialChars = passwordContainsSpecialChars;
    return this;
  }

   /**
   * Get passwordContainsSpecialChars
   * @return passwordContainsSpecialChars
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPasswordContainsSpecialChars() {
    return passwordContainsSpecialChars;
  }

  public void setPasswordContainsSpecialChars(Boolean passwordContainsSpecialChars) {
    this.passwordContainsSpecialChars = passwordContainsSpecialChars;
  }

  public Client searchStatus(SearchStatusEnum searchStatus) {
    this.searchStatus = searchStatus;
    return this;
  }

   /**
   * Get searchStatus
   * @return searchStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public SearchStatusEnum getSearchStatus() {
    return searchStatus;
  }

  public void setSearchStatus(SearchStatusEnum searchStatus) {
    this.searchStatus = searchStatus;
  }

  public Client searchMigrationDuration(Long searchMigrationDuration) {
    this.searchMigrationDuration = searchMigrationDuration;
    return this;
  }

   /**
   * Get searchMigrationDuration
   * @return searchMigrationDuration
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getSearchMigrationDuration() {
    return searchMigrationDuration;
  }

  public void setSearchMigrationDuration(Long searchMigrationDuration) {
    this.searchMigrationDuration = searchMigrationDuration;
  }

  public Client trackingRequirementTestcaseVersionLink(Boolean trackingRequirementTestcaseVersionLink) {
    this.trackingRequirementTestcaseVersionLink = trackingRequirementTestcaseVersionLink;
    return this;
  }

   /**
   * Get trackingRequirementTestcaseVersionLink
   * @return trackingRequirementTestcaseVersionLink
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getTrackingRequirementTestcaseVersionLink() {
    return trackingRequirementTestcaseVersionLink;
  }

  public void setTrackingRequirementTestcaseVersionLink(Boolean trackingRequirementTestcaseVersionLink) {
    this.trackingRequirementTestcaseVersionLink = trackingRequirementTestcaseVersionLink;
  }

  public Client inactive(Boolean inactive) {
    this.inactive = inactive;
    return this;
  }

   /**
   * Get inactive
   * @return inactive
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getInactive() {
    return inactive;
  }

  public void setInactive(Boolean inactive) {
    this.inactive = inactive;
  }

  public Client forOnPremise(Boolean forOnPremise) {
    this.forOnPremise = forOnPremise;
    return this;
  }

   /**
   * Get forOnPremise
   * @return forOnPremise
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getForOnPremise() {
    return forOnPremise;
  }

  public void setForOnPremise(Boolean forOnPremise) {
    this.forOnPremise = forOnPremise;
  }

  public Client forExplorer(Boolean forExplorer) {
    this.forExplorer = forExplorer;
    return this;
  }

   /**
   * Get forExplorer
   * @return forExplorer
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getForExplorer() {
    return forExplorer;
  }

  public void setForExplorer(Boolean forExplorer) {
    this.forExplorer = forExplorer;
  }

  public Client tdstenantId(String tdstenantId) {
    this.tdstenantId = tdstenantId;
    return this;
  }

   /**
   * Get tdstenantId
   * @return tdstenantId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTdstenantId() {
    return tdstenantId;
  }

  public void setTdstenantId(String tdstenantId) {
    this.tdstenantId = tdstenantId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Client client = (Client) o;
    return Objects.equals(this.id, client.id) &&
        Objects.equals(this.name, client.name) &&
        Objects.equals(this.siteName, client.siteName) &&
        Objects.equals(this.maxFailedLoginAttempt, client.maxFailedLoginAttempt) &&
        Objects.equals(this.passwordShelfLife, client.passwordShelfLife) &&
        Objects.equals(this.passwordHealthyPeriod, client.passwordHealthyPeriod) &&
        Objects.equals(this.minimumUniquePasswordsSequenceLength, client.minimumUniquePasswordsSequenceLength) &&
        Objects.equals(this.licenseBlobId, client.licenseBlobId) &&
        Objects.equals(this.sessionTimeoutEnabled, client.sessionTimeoutEnabled) &&
        Objects.equals(this.sessionTimeoutMinute, client.sessionTimeoutMinute) &&
        Objects.equals(this.terminateIdleEnabled, client.terminateIdleEnabled) &&
        Objects.equals(this.terminateIdleMinute, client.terminateIdleMinute) &&
        Objects.equals(this.dateFormat, client.dateFormat) &&
        Objects.equals(this.rememberMeTimeoutEnabled, client.rememberMeTimeoutEnabled) &&
        Objects.equals(this.rememberMeTimeoutDay, client.rememberMeTimeoutDay) &&
        Objects.equals(this.mailRecipients, client.mailRecipients) &&
        Objects.equals(this.useCustomPasswordPolicy, client.useCustomPasswordPolicy) &&
        Objects.equals(this.minimumPasswordLength, client.minimumPasswordLength) &&
        Objects.equals(this.passwordContainsCapitalLetters, client.passwordContainsCapitalLetters) &&
        Objects.equals(this.passwordContainsLowercaseLetters, client.passwordContainsLowercaseLetters) &&
        Objects.equals(this.passwordContainsNumericChars, client.passwordContainsNumericChars) &&
        Objects.equals(this.passwordContainsSpecialChars, client.passwordContainsSpecialChars) &&
        Objects.equals(this.searchStatus, client.searchStatus) &&
        Objects.equals(this.searchMigrationDuration, client.searchMigrationDuration) &&
        Objects.equals(this.trackingRequirementTestcaseVersionLink, client.trackingRequirementTestcaseVersionLink) &&
        Objects.equals(this.inactive, client.inactive) &&
        Objects.equals(this.forOnPremise, client.forOnPremise) &&
        Objects.equals(this.forExplorer, client.forExplorer) &&
        Objects.equals(this.tdstenantId, client.tdstenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, siteName, maxFailedLoginAttempt, passwordShelfLife, passwordHealthyPeriod, minimumUniquePasswordsSequenceLength, licenseBlobId, sessionTimeoutEnabled, sessionTimeoutMinute, terminateIdleEnabled, terminateIdleMinute, dateFormat, rememberMeTimeoutEnabled, rememberMeTimeoutDay, mailRecipients, useCustomPasswordPolicy, minimumPasswordLength, passwordContainsCapitalLetters, passwordContainsLowercaseLetters, passwordContainsNumericChars, passwordContainsSpecialChars, searchStatus, searchMigrationDuration, trackingRequirementTestcaseVersionLink, inactive, forOnPremise, forExplorer, tdstenantId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Client {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
    sb.append("    maxFailedLoginAttempt: ").append(toIndentedString(maxFailedLoginAttempt)).append("\n");
    sb.append("    passwordShelfLife: ").append(toIndentedString(passwordShelfLife)).append("\n");
    sb.append("    passwordHealthyPeriod: ").append(toIndentedString(passwordHealthyPeriod)).append("\n");
    sb.append("    minimumUniquePasswordsSequenceLength: ").append(toIndentedString(minimumUniquePasswordsSequenceLength)).append("\n");
    sb.append("    licenseBlobId: ").append(toIndentedString(licenseBlobId)).append("\n");
    sb.append("    sessionTimeoutEnabled: ").append(toIndentedString(sessionTimeoutEnabled)).append("\n");
    sb.append("    sessionTimeoutMinute: ").append(toIndentedString(sessionTimeoutMinute)).append("\n");
    sb.append("    terminateIdleEnabled: ").append(toIndentedString(terminateIdleEnabled)).append("\n");
    sb.append("    terminateIdleMinute: ").append(toIndentedString(terminateIdleMinute)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("    rememberMeTimeoutEnabled: ").append(toIndentedString(rememberMeTimeoutEnabled)).append("\n");
    sb.append("    rememberMeTimeoutDay: ").append(toIndentedString(rememberMeTimeoutDay)).append("\n");
    sb.append("    mailRecipients: ").append(toIndentedString(mailRecipients)).append("\n");
    sb.append("    useCustomPasswordPolicy: ").append(toIndentedString(useCustomPasswordPolicy)).append("\n");
    sb.append("    minimumPasswordLength: ").append(toIndentedString(minimumPasswordLength)).append("\n");
    sb.append("    passwordContainsCapitalLetters: ").append(toIndentedString(passwordContainsCapitalLetters)).append("\n");
    sb.append("    passwordContainsLowercaseLetters: ").append(toIndentedString(passwordContainsLowercaseLetters)).append("\n");
    sb.append("    passwordContainsNumericChars: ").append(toIndentedString(passwordContainsNumericChars)).append("\n");
    sb.append("    passwordContainsSpecialChars: ").append(toIndentedString(passwordContainsSpecialChars)).append("\n");
    sb.append("    searchStatus: ").append(toIndentedString(searchStatus)).append("\n");
    sb.append("    searchMigrationDuration: ").append(toIndentedString(searchMigrationDuration)).append("\n");
    sb.append("    trackingRequirementTestcaseVersionLink: ").append(toIndentedString(trackingRequirementTestcaseVersionLink)).append("\n");
    sb.append("    inactive: ").append(toIndentedString(inactive)).append("\n");
    sb.append("    forOnPremise: ").append(toIndentedString(forOnPremise)).append("\n");
    sb.append("    forExplorer: ").append(toIndentedString(forExplorer)).append("\n");
    sb.append("    tdstenantId: ").append(toIndentedString(tdstenantId)).append("\n");
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

