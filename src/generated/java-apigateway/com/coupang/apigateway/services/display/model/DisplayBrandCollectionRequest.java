package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayBrandCollectionRequest   {
  
  private List<String> type = new ArrayList<String>();
  private Integer pageSize = null;
  private Integer pageIndex = null;
  private String initialConsonant = null;
  private List<String> attributeId = new ArrayList<String>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("type")
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  public List<String> getType() {
    return type;
  }
  
  /**
   **/
  public void setType(List<String> type) {
    this.type = type;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("pageSize")
  @com.fasterxml.jackson.annotation.JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  
  /**
   **/
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("pageIndex")
  @com.fasterxml.jackson.annotation.JsonProperty("pageIndex")
  public Integer getPageIndex() {
    return pageIndex;
  }
  
  /**
   **/
  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("initialConsonant")
  @com.fasterxml.jackson.annotation.JsonProperty("initialConsonant")
  public String getInitialConsonant() {
    return initialConsonant;
  }
  
  /**
   **/
  public void setInitialConsonant(String initialConsonant) {
    this.initialConsonant = initialConsonant;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attributeId")
  @com.fasterxml.jackson.annotation.JsonProperty("attributeId")
  public List<String> getAttributeId() {
    return attributeId;
  }
  
  /**
   **/
  public void setAttributeId(List<String> attributeId) {
    this.attributeId = attributeId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayBrandCollectionRequest displayBrandCollectionRequest = (DisplayBrandCollectionRequest) o;
    return Objects.equals(this.type, displayBrandCollectionRequest.type) &&
        Objects.equals(this.pageSize, displayBrandCollectionRequest.pageSize) &&
        Objects.equals(this.pageIndex, displayBrandCollectionRequest.pageIndex) &&
        Objects.equals(this.initialConsonant, displayBrandCollectionRequest.initialConsonant) &&
        Objects.equals(this.attributeId, displayBrandCollectionRequest.attributeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, pageSize, pageIndex, initialConsonant, attributeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayBrandCollectionRequest {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    initialConsonant: ").append(toIndentedString(initialConsonant)).append("\n");
    sb.append("    attributeId: ").append(toIndentedString(attributeId)).append("\n");
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

  public static DisplayBrandCollectionRequestBuilder builder() {
    return new DisplayBrandCollectionRequestBuilder();
  }

  public static class DisplayBrandCollectionRequestBuilder {

    private List<String> type = new ArrayList<String>();
    private Integer pageSize = null;
    private Integer pageIndex = null;
    private String initialConsonant = null;
    private List<String> attributeId = new ArrayList<String>();
    

    DisplayBrandCollectionRequestBuilder() {
    }

    /**
     **/
    public DisplayBrandCollectionRequestBuilder type(List<String> type) {
      this.type = type;
      return this;
    }

    /**
     **/
    public DisplayBrandCollectionRequestBuilder pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     **/
    public DisplayBrandCollectionRequestBuilder pageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
      return this;
    }

    /**
     **/
    public DisplayBrandCollectionRequestBuilder initialConsonant(String initialConsonant) {
      this.initialConsonant = initialConsonant;
      return this;
    }

    /**
     **/
    public DisplayBrandCollectionRequestBuilder attributeId(List<String> attributeId) {
      this.attributeId = attributeId;
      return this;
    }


    public DisplayBrandCollectionRequest build() {
      DisplayBrandCollectionRequest displayBrandCollectionRequest = new DisplayBrandCollectionRequest();
      displayBrandCollectionRequest.setType(this.type);
      displayBrandCollectionRequest.setPageSize(this.pageSize);
      displayBrandCollectionRequest.setPageIndex(this.pageIndex);
      displayBrandCollectionRequest.setInitialConsonant(this.initialConsonant);
      displayBrandCollectionRequest.setAttributeId(this.attributeId);
      return displayBrandCollectionRequest;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayBrandCollectionRequestBuilder {\n");
      
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
      sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
      sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
      sb.append("    initialConsonant: ").append(toIndentedString(initialConsonant)).append("\n");
      sb.append("    attributeId: ").append(toIndentedString(attributeId)).append("\n");
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

