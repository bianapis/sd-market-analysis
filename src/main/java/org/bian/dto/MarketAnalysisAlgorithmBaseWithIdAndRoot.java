package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * MarketAnalysisAlgorithmBaseWithIdAndRoot
 */
public class MarketAnalysisAlgorithmBaseWithIdAndRoot   {
  private String marketAnalysisRequestReference = null;

  private String marketAnalysisAlgorithmReference = null;

  private String marketAnalysisAlgorithmType = null;

  private Object marketAnalysisAlgorithm = null;

  private String marketResearchSourceReference = null;

  private String productServiceActivityReportReference = null;

  private Object marketAnalysisAlgorithmUsage = null;

  private Object marketAnalysisAlgorithmImpact = null;

  private Object marketAnalysisAlgorithmFeedbackRecord = null;

  private Object marketAnalysisAlgorithmSpecification = null;

  private String marketAnalysisAlgorithmUsageGuidelines = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'refers to a market research request - master record' 
   * @return marketAnalysisRequestReference
  **/

  public String getMarketAnalysisRequestReference() {
    return marketAnalysisRequestReference;
  }

  public void setMarketAnalysisRequestReference(String marketAnalysisRequestReference) {
    this.marketAnalysisRequestReference = marketAnalysisRequestReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: 'refers to range of available types of market analysis - potentially a wide range of options' 
   * @return marketAnalysisAlgorithmType
  **/

  public String getMarketAnalysisAlgorithmType() {
    return marketAnalysisAlgorithmType;
  }

  public void setMarketAnalysisAlgorithmType(String marketAnalysisAlgorithmType) {
    this.marketAnalysisAlgorithmType = marketAnalysisAlgorithmType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'specification of the analysis algorithm' 
   * @return marketAnalysisAlgorithm
  **/

  public Object getMarketAnalysisAlgorithm() {
    return marketAnalysisAlgorithm;
  }

  public void setMarketAnalysisAlgorithm(Object marketAnalysisAlgorithm) {
    this.marketAnalysisAlgorithm = marketAnalysisAlgorithm;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'reference to different sources of market research reports and databases used by the algorithm' 
   * @return marketResearchSourceReference
  **/

  public String getMarketResearchSourceReference() {
    return marketResearchSourceReference;
  }

  public void setMarketResearchSourceReference(String marketResearchSourceReference) {
    this.marketResearchSourceReference = marketResearchSourceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: 'internal bank activity report - used by the algorithm' 
   * @return productServiceActivityReportReference
  **/

  public String getProductServiceActivityReportReference() {
    return productServiceActivityReportReference;
  }

  public void setProductServiceActivityReportReference(String productServiceActivityReportReference) {
    this.productServiceActivityReportReference = productServiceActivityReportReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'records number of production deployments and frequency of execution' 
   * @return marketAnalysisAlgorithmUsage
  **/

  public Object getMarketAnalysisAlgorithmUsage() {
    return marketAnalysisAlgorithmUsage;
  }

  public void setMarketAnalysisAlgorithmUsage(Object marketAnalysisAlgorithmUsage) {
    this.marketAnalysisAlgorithmUsage = marketAnalysisAlgorithmUsage;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'reported impact/accuracy of algorithm' 
   * @return marketAnalysisAlgorithmImpact
  **/

  public Object getMarketAnalysisAlgorithmImpact() {
    return marketAnalysisAlgorithmImpact;
  }

  public void setMarketAnalysisAlgorithmImpact(Object marketAnalysisAlgorithmImpact) {
    this.marketAnalysisAlgorithmImpact = marketAnalysisAlgorithmImpact;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'user provided feedback/suggestions' 
   * @return marketAnalysisAlgorithmFeedbackRecord
  **/

  public Object getMarketAnalysisAlgorithmFeedbackRecord() {
    return marketAnalysisAlgorithmFeedbackRecord;
  }

  public void setMarketAnalysisAlgorithmFeedbackRecord(Object marketAnalysisAlgorithmFeedbackRecord) {
    this.marketAnalysisAlgorithmFeedbackRecord = marketAnalysisAlgorithmFeedbackRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: 'design - inputs - external and internal data, calculations, outputs' 
   * @return marketAnalysisAlgorithmSpecification
  **/

  public Object getMarketAnalysisAlgorithmSpecification() {
    return marketAnalysisAlgorithmSpecification;
  }

  public void setMarketAnalysisAlgorithmSpecification(Object marketAnalysisAlgorithmSpecification) {
    this.marketAnalysisAlgorithmSpecification = marketAnalysisAlgorithmSpecification;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: 'guidance on usage and analysis interpretation' 
   * @return marketAnalysisAlgorithmUsageGuidelines
  **/

  public String getMarketAnalysisAlgorithmUsageGuidelines() {
    return marketAnalysisAlgorithmUsageGuidelines;
  }

  public void setMarketAnalysisAlgorithmUsageGuidelines(String marketAnalysisAlgorithmUsageGuidelines) {
    this.marketAnalysisAlgorithmUsageGuidelines = marketAnalysisAlgorithmUsageGuidelines;
  }


}

