package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.search_api.model.NoHitModuleResult;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class NoHitResult   {
  
  private String originalQuery = null;
  private List<NoHitModuleResult> modules = new ArrayList<NoHitModuleResult>();
  private Integer appliedModuleNum = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("originalQuery")
  @com.fasterxml.jackson.annotation.JsonProperty("originalQuery")
  public String getOriginalQuery() {
    return originalQuery;
  }
  
  /**
   **/
  public void setOriginalQuery(String originalQuery) {
    this.originalQuery = originalQuery;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("modules")
  @com.fasterxml.jackson.annotation.JsonProperty("modules")
  public List<NoHitModuleResult> getModules() {
    return modules;
  }
  
  /**
   **/
  public void setModules(List<NoHitModuleResult> modules) {
    this.modules = modules;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("appliedModuleNum")
  @com.fasterxml.jackson.annotation.JsonProperty("appliedModuleNum")
  public Integer getAppliedModuleNum() {
    return appliedModuleNum;
  }
  
  /**
   **/
  public void setAppliedModuleNum(Integer appliedModuleNum) {
    this.appliedModuleNum = appliedModuleNum;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoHitResult noHitResult = (NoHitResult) o;
    return Objects.equals(this.originalQuery, noHitResult.originalQuery) &&
        Objects.equals(this.modules, noHitResult.modules) &&
        Objects.equals(this.appliedModuleNum, noHitResult.appliedModuleNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalQuery, modules, appliedModuleNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoHitResult {\n");
    
    sb.append("    originalQuery: ").append(toIndentedString(originalQuery)).append("\n");
    sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
    sb.append("    appliedModuleNum: ").append(toIndentedString(appliedModuleNum)).append("\n");
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

  public static NoHitResultBuilder builder() {
    return new NoHitResultBuilder();
  }

  public static class NoHitResultBuilder {

    private String originalQuery = null;
    private List<NoHitModuleResult> modules = new ArrayList<NoHitModuleResult>();
    private Integer appliedModuleNum = null;
    

    NoHitResultBuilder() {
    }

    /**
     **/
    public NoHitResultBuilder originalQuery(String originalQuery) {
      this.originalQuery = originalQuery;
      return this;
    }

    /**
     **/
    public NoHitResultBuilder modules(List<NoHitModuleResult> modules) {
      this.modules = modules;
      return this;
    }

    /**
     **/
    public NoHitResultBuilder appliedModuleNum(Integer appliedModuleNum) {
      this.appliedModuleNum = appliedModuleNum;
      return this;
    }


    public NoHitResult build() {
      NoHitResult noHitResult = new NoHitResult();
      noHitResult.setOriginalQuery(this.originalQuery);
      noHitResult.setModules(this.modules);
      noHitResult.setAppliedModuleNum(this.appliedModuleNum);
      return noHitResult;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class NoHitResultBuilder {\n");
      
      sb.append("    originalQuery: ").append(toIndentedString(originalQuery)).append("\n");
      sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
      sb.append("    appliedModuleNum: ").append(toIndentedString(appliedModuleNum)).append("\n");
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

