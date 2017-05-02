package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.search_api.model.Metric;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class FacetResult   {
  
  private String fieldName = null;
  private Map<String, Metric> facets = new HashMap<String, Metric>();
  private Float coverage = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("fieldName")
  @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
  public String getFieldName() {
    return fieldName;
  }
  
  /**
   **/
  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("facets")
  @com.fasterxml.jackson.annotation.JsonProperty("facets")
  public Map<String, Metric> getFacets() {
    return facets;
  }
  
  /**
   **/
  public void setFacets(Map<String, Metric> facets) {
    this.facets = facets;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("coverage")
  @com.fasterxml.jackson.annotation.JsonProperty("coverage")
  public Float getCoverage() {
    return coverage;
  }
  
  /**
   **/
  public void setCoverage(Float coverage) {
    this.coverage = coverage;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacetResult facetResult = (FacetResult) o;
    return Objects.equals(this.fieldName, facetResult.fieldName) &&
        Objects.equals(this.facets, facetResult.facets) &&
        Objects.equals(this.coverage, facetResult.coverage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, facets, coverage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacetResult {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
    sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
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

  public static FacetResultBuilder builder() {
    return new FacetResultBuilder();
  }

  public static class FacetResultBuilder {

    private String fieldName = null;
    private Map<String, Metric> facets = new HashMap<String, Metric>();
    private Float coverage = null;
    

    FacetResultBuilder() {
    }

    /**
     **/
    public FacetResultBuilder fieldName(String fieldName) {
      this.fieldName = fieldName;
      return this;
    }

    /**
     **/
    public FacetResultBuilder facets(Map<String, Metric> facets) {
      this.facets = facets;
      return this;
    }

    /**
     **/
    public FacetResultBuilder coverage(Float coverage) {
      this.coverage = coverage;
      return this;
    }


    public FacetResult build() {
      FacetResult facetResult = new FacetResult();
      facetResult.setFieldName(this.fieldName);
      facetResult.setFacets(this.facets);
      facetResult.setCoverage(this.coverage);
      return facetResult;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class FacetResultBuilder {\n");
      
      sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
      sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
      sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
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

