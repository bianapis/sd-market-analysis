package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * MarketAnalysisBase
 */
public class MarketAnalysisBase   {
  private Object marketAnalysisRequest = null;

  private String employeeBusinessUnitReference = null;

  private Object marketAnalysisRequestPlan = null;

  private String marketAnalysisAlgorithmReference = null;

  private String marketAnalysisReportReference = null;

  private Object marketAnalysisReport = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'details the request in terms of subject area, type of analysis, period, time/budget etc.' 
   * @return marketAnalysisRequest
  **/

  public Object getMarketAnalysisRequest() {
    return marketAnalysisRequest;
  }

  public void setMarketAnalysisRequest(Object marketAnalysisRequest) {
    this.marketAnalysisRequest = marketAnalysisRequest;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'employee and/or business unit requesting the market analysis' 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'details work done in terms of planned/actual effort, research sources/costs, timing' 
   * @return marketAnalysisRequestPlan
  **/

  public Object getMarketAnalysisRequestPlan() {
    return marketAnalysisRequestPlan;
  }

  public void setMarketAnalysisRequestPlan(Object marketAnalysisRequestPlan) {
    this.marketAnalysisRequestPlan = marketAnalysisRequestPlan;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'refers to the market analysis algorithm used in the analysis' 
   * @return marketAnalysisAlgorithmReference
  **/

  public String getMarketAnalysisAlgorithmReference() {
    return marketAnalysisAlgorithmReference;
  }

  public void setMarketAnalysisAlgorithmReference(String marketAnalysisAlgorithmReference) {
    this.marketAnalysisAlgorithmReference = marketAnalysisAlgorithmReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'refers to the market analysis report' 
   * @return marketAnalysisReportReference
  **/

  public String getMarketAnalysisReportReference() {
    return marketAnalysisReportReference;
  }

  public void setMarketAnalysisReportReference(String marketAnalysisReportReference) {
    this.marketAnalysisReportReference = marketAnalysisReportReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'Market analysis report' 
   * @return marketAnalysisReport
  **/

  public Object getMarketAnalysisReport() {
    return marketAnalysisReport;
  }

  public void setMarketAnalysisReport(Object marketAnalysisReport) {
    this.marketAnalysisReport = marketAnalysisReport;
  }


}

