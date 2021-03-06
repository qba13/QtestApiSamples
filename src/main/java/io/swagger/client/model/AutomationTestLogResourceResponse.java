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
import io.swagger.client.model.AttachmentResource;
import io.swagger.client.model.AutomationLinkedDefectResponse;
import io.swagger.client.model.AutomationTestStepLog;
import io.swagger.client.model.Link;
import io.swagger.client.model.PropertyResource;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * AutomationTestLogResourceResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class AutomationTestLogResourceResponse {
  @SerializedName("links")
  private List<Link> links = new ArrayList<Link>();

  @SerializedName("id")
  private Long id = null;

  @SerializedName("test_case_version_id")
  private Long testCaseVersionId = null;

  @SerializedName("exe_start_date")
  private DateTime exeStartDate = null;

  @SerializedName("exe_end_date")
  private DateTime exeEndDate = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("attachments")
  private List<AttachmentResource> attachments = new ArrayList<AttachmentResource>();

  @SerializedName("name")
  private String name = null;

  @SerializedName("planned_exe_time")
  private Long plannedExeTime = null;

  @SerializedName("actual_exe_time")
  private Long actualExeTime = null;

  @SerializedName("build_number")
  private String buildNumber = null;

  @SerializedName("build_url")
  private String buildUrl = null;

  @SerializedName("properties")
  private List<PropertyResource> properties = new ArrayList<PropertyResource>();

  @SerializedName("system_name")
  private String systemName = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("order")
  private Long order = null;

  @SerializedName("test_step_logs")
  private List<AutomationTestStepLog> testStepLogs = new ArrayList<AutomationTestStepLog>();

  @SerializedName("module_names")
  private List<String> moduleNames = new ArrayList<String>();

  @SerializedName("agent_ids")
  private List<Long> agentIds = new ArrayList<Long>();

  @SerializedName("automation_content")
  private String automationContent = null;

  @SerializedName("defect_pids")
  private List<String> defectPids = new ArrayList<String>();

  @SerializedName("tosca_guid")
  private String toscaGuid = null;

  @SerializedName("tosca_node_path")
  private String toscaNodePath = null;

  @SerializedName("linkedDefects")
  private AutomationLinkedDefectResponse linkedDefects = null;

  public AutomationTestLogResourceResponse links(List<Link> links) {
    this.links = links;
    return this;
  }

  public AutomationTestLogResourceResponse addLinksItem(Link linksItem) {
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

  public AutomationTestLogResourceResponse id(Long id) {
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

  public AutomationTestLogResourceResponse testCaseVersionId(Long testCaseVersionId) {
    this.testCaseVersionId = testCaseVersionId;
    return this;
  }

   /**
   * Get testCaseVersionId
   * @return testCaseVersionId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTestCaseVersionId() {
    return testCaseVersionId;
  }

  public void setTestCaseVersionId(Long testCaseVersionId) {
    this.testCaseVersionId = testCaseVersionId;
  }

  public AutomationTestLogResourceResponse exeStartDate(DateTime exeStartDate) {
    this.exeStartDate = exeStartDate;
    return this;
  }

   /**
   * Get exeStartDate
   * @return exeStartDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public DateTime getExeStartDate() {
    return exeStartDate;
  }

  public void setExeStartDate(DateTime exeStartDate) {
    this.exeStartDate = exeStartDate;
  }

  public AutomationTestLogResourceResponse exeEndDate(DateTime exeEndDate) {
    this.exeEndDate = exeEndDate;
    return this;
  }

   /**
   * Get exeEndDate
   * @return exeEndDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public DateTime getExeEndDate() {
    return exeEndDate;
  }

  public void setExeEndDate(DateTime exeEndDate) {
    this.exeEndDate = exeEndDate;
  }

  public AutomationTestLogResourceResponse note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public AutomationTestLogResourceResponse attachments(List<AttachmentResource> attachments) {
    this.attachments = attachments;
    return this;
  }

  public AutomationTestLogResourceResponse addAttachmentsItem(AttachmentResource attachmentsItem) {
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<AttachmentResource> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<AttachmentResource> attachments) {
    this.attachments = attachments;
  }

  public AutomationTestLogResourceResponse name(String name) {
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

  public AutomationTestLogResourceResponse plannedExeTime(Long plannedExeTime) {
    this.plannedExeTime = plannedExeTime;
    return this;
  }

   /**
   * Get plannedExeTime
   * minimum: 0
   * maximum: 9999999
   * @return plannedExeTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getPlannedExeTime() {
    return plannedExeTime;
  }

  public void setPlannedExeTime(Long plannedExeTime) {
    this.plannedExeTime = plannedExeTime;
  }

  public AutomationTestLogResourceResponse actualExeTime(Long actualExeTime) {
    this.actualExeTime = actualExeTime;
    return this;
  }

   /**
   * Get actualExeTime
   * @return actualExeTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getActualExeTime() {
    return actualExeTime;
  }

  public void setActualExeTime(Long actualExeTime) {
    this.actualExeTime = actualExeTime;
  }

  public AutomationTestLogResourceResponse buildNumber(String buildNumber) {
    this.buildNumber = buildNumber;
    return this;
  }

   /**
   * Get buildNumber
   * @return buildNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBuildNumber() {
    return buildNumber;
  }

  public void setBuildNumber(String buildNumber) {
    this.buildNumber = buildNumber;
  }

  public AutomationTestLogResourceResponse buildUrl(String buildUrl) {
    this.buildUrl = buildUrl;
    return this;
  }

   /**
   * Get buildUrl
   * @return buildUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBuildUrl() {
    return buildUrl;
  }

  public void setBuildUrl(String buildUrl) {
    this.buildUrl = buildUrl;
  }

  public AutomationTestLogResourceResponse properties(List<PropertyResource> properties) {
    this.properties = properties;
    return this;
  }

  public AutomationTestLogResourceResponse addPropertiesItem(PropertyResource propertiesItem) {
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<PropertyResource> getProperties() {
    return properties;
  }

  public void setProperties(List<PropertyResource> properties) {
    this.properties = properties;
  }

  public AutomationTestLogResourceResponse systemName(String systemName) {
    this.systemName = systemName;
    return this;
  }

   /**
   * Get systemName
   * @return systemName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSystemName() {
    return systemName;
  }

  public void setSystemName(String systemName) {
    this.systemName = systemName;
  }

  public AutomationTestLogResourceResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public AutomationTestLogResourceResponse order(Long order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getOrder() {
    return order;
  }

  public void setOrder(Long order) {
    this.order = order;
  }

  public AutomationTestLogResourceResponse testStepLogs(List<AutomationTestStepLog> testStepLogs) {
    this.testStepLogs = testStepLogs;
    return this;
  }

  public AutomationTestLogResourceResponse addTestStepLogsItem(AutomationTestStepLog testStepLogsItem) {
    this.testStepLogs.add(testStepLogsItem);
    return this;
  }

   /**
   * Get testStepLogs
   * @return testStepLogs
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<AutomationTestStepLog> getTestStepLogs() {
    return testStepLogs;
  }

  public void setTestStepLogs(List<AutomationTestStepLog> testStepLogs) {
    this.testStepLogs = testStepLogs;
  }

  public AutomationTestLogResourceResponse moduleNames(List<String> moduleNames) {
    this.moduleNames = moduleNames;
    return this;
  }

  public AutomationTestLogResourceResponse addModuleNamesItem(String moduleNamesItem) {
    this.moduleNames.add(moduleNamesItem);
    return this;
  }

   /**
   * Get moduleNames
   * @return moduleNames
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getModuleNames() {
    return moduleNames;
  }

  public void setModuleNames(List<String> moduleNames) {
    this.moduleNames = moduleNames;
  }

  public AutomationTestLogResourceResponse agentIds(List<Long> agentIds) {
    this.agentIds = agentIds;
    return this;
  }

  public AutomationTestLogResourceResponse addAgentIdsItem(Long agentIdsItem) {
    this.agentIds.add(agentIdsItem);
    return this;
  }

   /**
   * Get agentIds
   * @return agentIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Long> getAgentIds() {
    return agentIds;
  }

  public void setAgentIds(List<Long> agentIds) {
    this.agentIds = agentIds;
  }

  public AutomationTestLogResourceResponse automationContent(String automationContent) {
    this.automationContent = automationContent;
    return this;
  }

   /**
   * Get automationContent
   * @return automationContent
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAutomationContent() {
    return automationContent;
  }

  public void setAutomationContent(String automationContent) {
    this.automationContent = automationContent;
  }

  public AutomationTestLogResourceResponse defectPids(List<String> defectPids) {
    this.defectPids = defectPids;
    return this;
  }

  public AutomationTestLogResourceResponse addDefectPidsItem(String defectPidsItem) {
    this.defectPids.add(defectPidsItem);
    return this;
  }

   /**
   * Defect pids
   * @return defectPids
  **/
  @ApiModelProperty(example = "null", value = "Defect pids")
  public List<String> getDefectPids() {
    return defectPids;
  }

  public void setDefectPids(List<String> defectPids) {
    this.defectPids = defectPids;
  }

  public AutomationTestLogResourceResponse toscaGuid(String toscaGuid) {
    this.toscaGuid = toscaGuid;
    return this;
  }

   /**
   * Get toscaGuid
   * @return toscaGuid
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getToscaGuid() {
    return toscaGuid;
  }

  public void setToscaGuid(String toscaGuid) {
    this.toscaGuid = toscaGuid;
  }

  public AutomationTestLogResourceResponse toscaNodePath(String toscaNodePath) {
    this.toscaNodePath = toscaNodePath;
    return this;
  }

   /**
   * Get toscaNodePath
   * @return toscaNodePath
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getToscaNodePath() {
    return toscaNodePath;
  }

  public void setToscaNodePath(String toscaNodePath) {
    this.toscaNodePath = toscaNodePath;
  }

  public AutomationTestLogResourceResponse linkedDefects(AutomationLinkedDefectResponse linkedDefects) {
    this.linkedDefects = linkedDefects;
    return this;
  }

   /**
   * Get linkedDefects
   * @return linkedDefects
  **/
  @ApiModelProperty(example = "null", value = "")
  public AutomationLinkedDefectResponse getLinkedDefects() {
    return linkedDefects;
  }

  public void setLinkedDefects(AutomationLinkedDefectResponse linkedDefects) {
    this.linkedDefects = linkedDefects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomationTestLogResourceResponse automationTestLogResourceResponse = (AutomationTestLogResourceResponse) o;
    return Objects.equals(this.links, automationTestLogResourceResponse.links) &&
        Objects.equals(this.id, automationTestLogResourceResponse.id) &&
        Objects.equals(this.testCaseVersionId, automationTestLogResourceResponse.testCaseVersionId) &&
        Objects.equals(this.exeStartDate, automationTestLogResourceResponse.exeStartDate) &&
        Objects.equals(this.exeEndDate, automationTestLogResourceResponse.exeEndDate) &&
        Objects.equals(this.note, automationTestLogResourceResponse.note) &&
        Objects.equals(this.attachments, automationTestLogResourceResponse.attachments) &&
        Objects.equals(this.name, automationTestLogResourceResponse.name) &&
        Objects.equals(this.plannedExeTime, automationTestLogResourceResponse.plannedExeTime) &&
        Objects.equals(this.actualExeTime, automationTestLogResourceResponse.actualExeTime) &&
        Objects.equals(this.buildNumber, automationTestLogResourceResponse.buildNumber) &&
        Objects.equals(this.buildUrl, automationTestLogResourceResponse.buildUrl) &&
        Objects.equals(this.properties, automationTestLogResourceResponse.properties) &&
        Objects.equals(this.systemName, automationTestLogResourceResponse.systemName) &&
        Objects.equals(this.status, automationTestLogResourceResponse.status) &&
        Objects.equals(this.order, automationTestLogResourceResponse.order) &&
        Objects.equals(this.testStepLogs, automationTestLogResourceResponse.testStepLogs) &&
        Objects.equals(this.moduleNames, automationTestLogResourceResponse.moduleNames) &&
        Objects.equals(this.agentIds, automationTestLogResourceResponse.agentIds) &&
        Objects.equals(this.automationContent, automationTestLogResourceResponse.automationContent) &&
        Objects.equals(this.defectPids, automationTestLogResourceResponse.defectPids) &&
        Objects.equals(this.toscaGuid, automationTestLogResourceResponse.toscaGuid) &&
        Objects.equals(this.toscaNodePath, automationTestLogResourceResponse.toscaNodePath) &&
        Objects.equals(this.linkedDefects, automationTestLogResourceResponse.linkedDefects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, testCaseVersionId, exeStartDate, exeEndDate, note, attachments, name, plannedExeTime, actualExeTime, buildNumber, buildUrl, properties, systemName, status, order, testStepLogs, moduleNames, agentIds, automationContent, defectPids, toscaGuid, toscaNodePath, linkedDefects);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomationTestLogResourceResponse {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    testCaseVersionId: ").append(toIndentedString(testCaseVersionId)).append("\n");
    sb.append("    exeStartDate: ").append(toIndentedString(exeStartDate)).append("\n");
    sb.append("    exeEndDate: ").append(toIndentedString(exeEndDate)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plannedExeTime: ").append(toIndentedString(plannedExeTime)).append("\n");
    sb.append("    actualExeTime: ").append(toIndentedString(actualExeTime)).append("\n");
    sb.append("    buildNumber: ").append(toIndentedString(buildNumber)).append("\n");
    sb.append("    buildUrl: ").append(toIndentedString(buildUrl)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    systemName: ").append(toIndentedString(systemName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    testStepLogs: ").append(toIndentedString(testStepLogs)).append("\n");
    sb.append("    moduleNames: ").append(toIndentedString(moduleNames)).append("\n");
    sb.append("    agentIds: ").append(toIndentedString(agentIds)).append("\n");
    sb.append("    automationContent: ").append(toIndentedString(automationContent)).append("\n");
    sb.append("    defectPids: ").append(toIndentedString(defectPids)).append("\n");
    sb.append("    toscaGuid: ").append(toIndentedString(toscaGuid)).append("\n");
    sb.append("    toscaNodePath: ").append(toIndentedString(toscaNodePath)).append("\n");
    sb.append("    linkedDefects: ").append(toIndentedString(linkedDefects)).append("\n");
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

