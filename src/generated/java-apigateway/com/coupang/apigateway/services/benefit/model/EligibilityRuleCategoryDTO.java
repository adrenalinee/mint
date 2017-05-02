package com.coupang.apigateway.services.benefit.model;

import java.util.Objects;
import java.util.*;
import java.util.Map;



/**
 * Eligible / non-eligible category for benefit.
 **/

@io.swagger.annotations.ApiModel(description = "Eligible / non-eligible category for benefit.")
@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.660+09:00")
public class EligibilityRuleCategoryDTO   {
  
  private Map<String, String> include = new HashMap<String, String>();
  private Map<String, String> exclude = new HashMap<String, String>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("include")
  @com.fasterxml.jackson.annotation.JsonProperty("include")
  public Map<String, String> getInclude() {
    return include;
  }
  
  /**
   **/
  public void setInclude(Map<String, String> include) {
    this.include = include;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("exclude")
  @com.fasterxml.jackson.annotation.JsonProperty("exclude")
  public Map<String, String> getExclude() {
    return exclude;
  }
  
  /**
   **/
  public void setExclude(Map<String, String> exclude) {
    this.exclude = exclude;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EligibilityRuleCategoryDTO eligibilityRuleCategoryDTO = (EligibilityRuleCategoryDTO) o;
    return Objects.equals(this.include, eligibilityRuleCategoryDTO.include) &&
        Objects.equals(this.exclude, eligibilityRuleCategoryDTO.exclude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(include, exclude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EligibilityRuleCategoryDTO {\n");
    
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
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

  public static EligibilityRuleCategoryDTOBuilder builder() {
    return new EligibilityRuleCategoryDTOBuilder();
  }

  public static class EligibilityRuleCategoryDTOBuilder {

    private Map<String, String> include = new HashMap<String, String>();
    private Map<String, String> exclude = new HashMap<String, String>();
    

    EligibilityRuleCategoryDTOBuilder() {
    }

    /**
     **/
    public EligibilityRuleCategoryDTOBuilder include(Map<String, String> include) {
      this.include = include;
      return this;
    }

    /**
     **/
    public EligibilityRuleCategoryDTOBuilder exclude(Map<String, String> exclude) {
      this.exclude = exclude;
      return this;
    }


    public EligibilityRuleCategoryDTO build() {
      EligibilityRuleCategoryDTO eligibilityRuleCategoryDTO = new EligibilityRuleCategoryDTO();
      eligibilityRuleCategoryDTO.setInclude(this.include);
      eligibilityRuleCategoryDTO.setExclude(this.exclude);
      return eligibilityRuleCategoryDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class EligibilityRuleCategoryDTOBuilder {\n");
      
      sb.append("    include: ").append(toIndentedString(include)).append("\n");
      sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
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

