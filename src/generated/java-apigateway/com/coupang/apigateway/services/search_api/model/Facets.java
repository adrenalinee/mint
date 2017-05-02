package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.search_api.model.FacetResult;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class Facets   {
  
  private Long sampleSize = null;
  private Long resultSize = null;
  private Map<String, FacetResult> facets = new HashMap<String, FacetResult>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("sampleSize")
  @com.fasterxml.jackson.annotation.JsonProperty("sampleSize")
  public Long getSampleSize() {
    return sampleSize;
  }
  
  /**
   **/
  public void setSampleSize(Long sampleSize) {
    this.sampleSize = sampleSize;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("resultSize")
  @com.fasterxml.jackson.annotation.JsonProperty("resultSize")
  public Long getResultSize() {
    return resultSize;
  }
  
  /**
   **/
  public void setResultSize(Long resultSize) {
    this.resultSize = resultSize;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("facets")
  @com.fasterxml.jackson.annotation.JsonProperty("facets")
  public Map<String, FacetResult> getFacets() {
    return facets;
  }
  
  /**
   **/
  public void setFacets(Map<String, FacetResult> facets) {
    this.facets = facets;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Facets facets = (Facets) o;
    return Objects.equals(this.sampleSize, facets.sampleSize) &&
        Objects.equals(this.resultSize, facets.resultSize) &&
        Objects.equals(this.facets, facets.facets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sampleSize, resultSize, facets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Facets {\n");
    
    sb.append("    sampleSize: ").append(toIndentedString(sampleSize)).append("\n");
    sb.append("    resultSize: ").append(toIndentedString(resultSize)).append("\n");
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
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

  public static FacetsBuilder builder() {
    return new FacetsBuilder();
  }

  public static class FacetsBuilder {

    private Long sampleSize = null;
    private Long resultSize = null;
    private Map<String, FacetResult> facets = new HashMap<String, FacetResult>();
    

    FacetsBuilder() {
    }

    /**
     **/
    public FacetsBuilder sampleSize(Long sampleSize) {
      this.sampleSize = sampleSize;
      return this;
    }

    /**
     **/
    public FacetsBuilder resultSize(Long resultSize) {
      this.resultSize = resultSize;
      return this;
    }

    /**
     **/
    public FacetsBuilder facets(Map<String, FacetResult> facets) {
      this.facets = facets;
      return this;
    }


    public Facets build() {
      Facets facets = new Facets();
      facets.setSampleSize(this.sampleSize);
      facets.setResultSize(this.resultSize);
      facets.setFacets(this.facets);
      return facets;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class FacetsBuilder {\n");
      
      sb.append("    sampleSize: ").append(toIndentedString(sampleSize)).append("\n");
      sb.append("    resultSize: ").append(toIndentedString(resultSize)).append("\n");
      sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
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

