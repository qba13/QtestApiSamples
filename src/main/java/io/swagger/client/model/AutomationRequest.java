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
import io.swagger.client.model.AutomationTestLogResource;
import io.swagger.client.model.ProjectModule;
import io.swagger.client.model.TestCycle;
import io.swagger.client.model.TestSuite;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * AutomationRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-03-04T15:34:58.501Z")
public class AutomationRequest {
  @SerializedName("testSuiteModel")
  private TestSuite testSuiteModel = null;

  @SerializedName("parentModuleModel")
  private ProjectModule parentModuleModel = null;

  @SerializedName("parentTestCycleModel")
  private TestCycle parentTestCycleModel = null;

  @SerializedName("skipCreatingAutomationModule")
  private Boolean skipCreatingAutomationModule = false;

  @SerializedName("shouldCheckUnlinkRequirement")
  private Boolean shouldCheckUnlinkRequirement = false;

  @SerializedName("test_suite")
  private String testSuite = null;

  @SerializedName("parent_module")
  private String parentModule = null;

  @SerializedName("test_logs")
  private List<AutomationTestLogResource> testLogs = new ArrayList<AutomationTestLogResource>();

  @SerializedName("execution_date")
  private DateTime executionDate = null;

  @SerializedName("test_cycle")
  private String testCycle = null;

  public AutomationRequest testSuiteModel(TestSuite testSuiteModel) {
    this.testSuiteModel = testSuiteModel;
    return this;
  }

   /**
   * Get testSuiteModel
   * @return testSuiteModel
  **/
  @ApiModelProperty(example = "null", value = "")
  public TestSuite getTestSuiteModel() {
    return testSuiteModel;
  }

  public void setTestSuiteModel(TestSuite testSuiteModel) {
    this.testSuiteModel = testSuiteModel;
  }

  public AutomationRequest parentModuleModel(ProjectModule parentModuleModel) {
    this.parentModuleModel = parentModuleModel;
    return this;
  }

   /**
   * Get parentModuleModel
   * @return parentModuleModel
  **/
  @ApiModelProperty(example = "null", value = "")
  public ProjectModule getParentModuleModel() {
    return parentModuleModel;
  }

  public void setParentModuleModel(ProjectModule parentModuleModel) {
    this.parentModuleModel = parentModuleModel;
  }

  public AutomationRequest parentTestCycleModel(TestCycle parentTestCycleModel) {
    this.parentTestCycleModel = parentTestCycleModel;
    return this;
  }

   /**
   * Get parentTestCycleModel
   * @return parentTestCycleModel
  **/
  @ApiModelProperty(example = "null", value = "")
  public TestCycle getParentTestCycleModel() {
    return parentTestCycleModel;
  }

  public void setParentTestCycleModel(TestCycle parentTestCycleModel) {
    this.parentTestCycleModel = parentTestCycleModel;
  }

  public AutomationRequest skipCreatingAutomationModule(Boolean skipCreatingAutomationModule) {
    this.skipCreatingAutomationModule = skipCreatingAutomationModule;
    return this;
  }

   /**
   * Get skipCreatingAutomationModule
   * @return skipCreatingAutomationModule
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSkipCreatingAutomationModule() {
    return skipCreatingAutomationModule;
  }

  public void setSkipCreatingAutomationModule(Boolean skipCreatingAutomationModule) {
    this.skipCreatingAutomationModule = skipCreatingAutomationModule;
  }

  public AutomationRequest shouldCheckUnlinkRequirement(Boolean shouldCheckUnlinkRequirement) {
    this.shouldCheckUnlinkRequirement = shouldCheckUnlinkRequirement;
    return this;
  }

   /**
   * Get shouldCheckUnlinkRequirement
   * @return shouldCheckUnlinkRequirement
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getShouldCheckUnlinkRequirement() {
    return shouldCheckUnlinkRequirement;
  }

  public void setShouldCheckUnlinkRequirement(Boolean shouldCheckUnlinkRequirement) {
    this.shouldCheckUnlinkRequirement = shouldCheckUnlinkRequirement;
  }

  public AutomationRequest testSuite(String testSuite) {
    this.testSuite = testSuite;
    return this;
  }

   /**
   * ID or PID of Test Suite
   * @return testSuite
  **/
  @ApiModelProperty(example = "TS-1", value = "ID or PID of Test Suite")
  public String getTestSuite() {
    return testSuite;
  }

  public void setTestSuite(String testSuite) {
    this.testSuite = testSuite;
  }

  public AutomationRequest parentModule(String parentModule) {
    this.parentModule = parentModule;
    return this;
  }

   /**
   * ID or PID of Module
   * @return parentModule
  **/
  @ApiModelProperty(example = "MD-1", value = "ID or PID of Module")
  public String getParentModule() {
    return parentModule;
  }

  public void setParentModule(String parentModule) {
    this.parentModule = parentModule;
  }

  public AutomationRequest testLogs(List<AutomationTestLogResource> testLogs) {
    this.testLogs = testLogs;
    return this;
  }

  public AutomationRequest addTestLogsItem(AutomationTestLogResource testLogsItem) {
    this.testLogs.add(testLogsItem);
    return this;
  }

   /**
   * Array of Test Log
   * @return testLogs
  **/
  @ApiModelProperty(example = "null", required = true, value = "Array of Test Log")
  public List<AutomationTestLogResource> getTestLogs() {
    return testLogs;
  }

  public void setTestLogs(List<AutomationTestLogResource> testLogs) {
    this.testLogs = testLogs;
  }

  public AutomationRequest executionDate(DateTime executionDate) {
    this.executionDate = executionDate;
    return this;
  }

   /**
   * Execution Date
   * @return executionDate
  **/
  @ApiModelProperty(example = "null", value = "Execution Date")
  public DateTime getExecutionDate() {
    return executionDate;
  }

  public void setExecutionDate(DateTime executionDate) {
    this.executionDate = executionDate;
  }

  public AutomationRequest testCycle(String testCycle) {
    this.testCycle = testCycle;
    return this;
  }

   /**
   * ID or PID of Test Cycle
   * @return testCycle
  **/
  @ApiModelProperty(example = "TC-1", value = "ID or PID of Test Cycle")
  public String getTestCycle() {
    return testCycle;
  }

  public void setTestCycle(String testCycle) {
    this.testCycle = testCycle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutomationRequest automationRequest = (AutomationRequest) o;
    return Objects.equals(this.testSuiteModel, automationRequest.testSuiteModel) &&
        Objects.equals(this.parentModuleModel, automationRequest.parentModuleModel) &&
        Objects.equals(this.parentTestCycleModel, automationRequest.parentTestCycleModel) &&
        Objects.equals(this.skipCreatingAutomationModule, automationRequest.skipCreatingAutomationModule) &&
        Objects.equals(this.shouldCheckUnlinkRequirement, automationRequest.shouldCheckUnlinkRequirement) &&
        Objects.equals(this.testSuite, automationRequest.testSuite) &&
        Objects.equals(this.parentModule, automationRequest.parentModule) &&
        Objects.equals(this.testLogs, automationRequest.testLogs) &&
        Objects.equals(this.executionDate, automationRequest.executionDate) &&
        Objects.equals(this.testCycle, automationRequest.testCycle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testSuiteModel, parentModuleModel, parentTestCycleModel, skipCreatingAutomationModule, shouldCheckUnlinkRequirement, testSuite, parentModule, testLogs, executionDate, testCycle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutomationRequest {\n");
    
    sb.append("    testSuiteModel: ").append(toIndentedString(testSuiteModel)).append("\n");
    sb.append("    parentModuleModel: ").append(toIndentedString(parentModuleModel)).append("\n");
    sb.append("    parentTestCycleModel: ").append(toIndentedString(parentTestCycleModel)).append("\n");
    sb.append("    skipCreatingAutomationModule: ").append(toIndentedString(skipCreatingAutomationModule)).append("\n");
    sb.append("    shouldCheckUnlinkRequirement: ").append(toIndentedString(shouldCheckUnlinkRequirement)).append("\n");
    sb.append("    testSuite: ").append(toIndentedString(testSuite)).append("\n");
    sb.append("    parentModule: ").append(toIndentedString(parentModule)).append("\n");
    sb.append("    testLogs: ").append(toIndentedString(testLogs)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    testCycle: ").append(toIndentedString(testCycle)).append("\n");
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

