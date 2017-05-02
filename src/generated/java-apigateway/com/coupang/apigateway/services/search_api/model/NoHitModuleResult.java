package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.search_api.model.NoHitSuggestion;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class NoHitModuleResult   {
  
  private Integer revisedQueryNum = null;
  private List<NoHitSuggestion> revisedQuery = new ArrayList<NoHitSuggestion>();
  private String moduleName = null;
  private String analysisType = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("revisedQueryNum")
  @com.fasterxml.jackson.annotation.JsonProperty("revisedQueryNum")
  public Integer getRevisedQueryNum() {
    return revisedQueryNum;
  }
  
  /**
   **/
  public void setRevisedQueryNum(Integer revisedQueryNum) {
    this.revisedQueryNum = revisedQueryNum;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("revisedQuery")
  @com.fasterxml.jackson.annotation.JsonProperty("revisedQuery")
  public List<NoHitSuggestion> getRevisedQuery() {
    return revisedQuery;
  }
  
  /**
   **/
  public void setRevisedQuery(List<NoHitSuggestion> revisedQuery) {
    this.revisedQuery = revisedQuery;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("moduleName")
  @com.fasterxml.jackson.annotation.JsonProperty("moduleName")
  public String getModuleName() {
    return moduleName;
  }
  
  /**
   **/
  public void setModuleName(String moduleName) {
    this.moduleName = moduleName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("analysisType")
  @com.fasterxml.jackson.annotation.JsonProperty("analysisType")
  public String getAnalysisType() {
    return analysisType;
  }
  
  /**
   **/
  public void setAnalysisType(String analysisType) {
    this.analysisType = analysisType;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoHitModuleResult noHitModuleResult = (NoHitModuleResult) o;
    return Objects.equals(this.revisedQueryNum, noHitModuleResult.revisedQueryNum) &&
        Objects.equals(this.revisedQuery, noHitModuleResult.revisedQuery) &&
        Objects.equals(this.moduleName, noHitModuleResult.moduleName) &&
        Objects.equals(this.analysisType, noHitModuleResult.analysisType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revisedQueryNum, revisedQuery, moduleName, analysisType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoHitModuleResult {\n");
    
    sb.append("    revisedQueryNum: ").append(toIndentedString(revisedQueryNum)).append("\n");
    sb.append("    revisedQuery: ").append(toIndentedString(revisedQuery)).append("\n");
    sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
    sb.append("    analysisType: ").append(toIndentedString(analysisType)).append("\n");
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

  public static NoHitModuleResultBuilder builder() {
    return new NoHitModuleResultBuilder();
  }

  public static class NoHitModuleResultBuilder {

    private Integer revisedQueryNum = null;
    private List<NoHitSuggestion> revisedQuery = new ArrayList<NoHitSuggestion>();
    private String moduleName = null;
    private String analysisType = null;
    

    NoHitModuleResultBuilder() {
    }

    /**
     **/
    public NoHitModuleResultBuilder revisedQueryNum(Integer revisedQueryNum) {
      this.revisedQueryNum = revisedQueryNum;
      return this;
    }

    /**
     **/
    public NoHitModuleResultBuilder revisedQuery(List<NoHitSuggestion> revisedQuery) {
      this.revisedQuery = revisedQuery;
      return this;
    }

    /**
     **/
    public NoHitModuleResultBuilder moduleName(String moduleName) {
      this.moduleName = moduleName;
      return this;
    }

    /**
     **/
    public NoHitModuleResultBuilder analysisType(String analysisType) {
      this.analysisType = analysisType;
      return this;
    }


    public NoHitModuleResult build() {
      NoHitModuleResult noHitModuleResult = new NoHitModuleResult();
      noHitModuleResult.setRevisedQueryNum(this.revisedQueryNum);
      noHitModuleResult.setRevisedQuery(this.revisedQuery);
      noHitModuleResult.setModuleName(this.moduleName);
      noHitModuleResult.setAnalysisType(this.analysisType);
      return noHitModuleResult;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class NoHitModuleResultBuilder {\n");
      
      sb.append("    revisedQueryNum: ").append(toIndentedString(revisedQueryNum)).append("\n");
      sb.append("    revisedQuery: ").append(toIndentedString(revisedQuery)).append("\n");
      sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
      sb.append("    analysisType: ").append(toIndentedString(analysisType)).append("\n");
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
}

