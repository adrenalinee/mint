package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayBrandListRequest   {
  
  private List<String> type = new ArrayList<String>();
  private String rankScoreType = null;
  private Integer pageSize = null;
  private Integer pageIndex = null;
  private Long baseComponentId = null;
  private Map<String, List<Long>> attributes = new HashMap<String, List<Long>>();

  
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
  @org.codehaus.jackson.annotate.JsonProperty("rankScoreType")
  @com.fasterxml.jackson.annotation.JsonProperty("rankScoreType")
  public String getRankScoreType() {
    return rankScoreType;
  }
  
  /**
   **/
  public void setRankScoreType(String rankScoreType) {
    this.rankScoreType = rankScoreType;
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
  @org.codehaus.jackson.annotate.JsonProperty("baseComponentId")
  @com.fasterxml.jackson.annotation.JsonProperty("baseComponentId")
  public Long getBaseComponentId() {
    return baseComponentId;
  }
  
  /**
   **/
  public void setBaseComponentId(Long baseComponentId) {
    this.baseComponentId = baseComponentId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attributes")
  @com.fasterxml.jackson.annotation.JsonProperty("attributes")
  public Map<String, List<Long>> getAttributes() {
    return attributes;
  }
  
  /**
   **/
  public void setAttributes(Map<String, List<Long>> attributes) {
    this.attributes = attributes;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayBrandListRequest displayBrandListRequest = (DisplayBrandListRequest) o;
    return Objects.equals(this.type, displayBrandListRequest.type) &&
        Objects.equals(this.rankScoreType, displayBrandListRequest.rankScoreType) &&
        Objects.equals(this.pageSize, displayBrandListRequest.pageSize) &&
        Objects.equals(this.pageIndex, displayBrandListRequest.pageIndex) &&
        Objects.equals(this.baseComponentId, displayBrandListRequest.baseComponentId) &&
        Objects.equals(this.attributes, displayBrandListRequest.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, rankScoreType, pageSize, pageIndex, baseComponentId, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayBrandListRequest {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rankScoreType: ").append(toIndentedString(rankScoreType)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    baseComponentId: ").append(toIndentedString(baseComponentId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

  public static DisplayBrandListRequestBuilder builder() {
    return new DisplayBrandListRequestBuilder();
  }

  public static class DisplayBrandListRequestBuilder {

    private List<String> type = new ArrayList<String>();
    private String rankScoreType = null;
    private Integer pageSize = null;
    private Integer pageIndex = null;
    private Long baseComponentId = null;
    private Map<String, List<Long>> attributes = new HashMap<String, List<Long>>();
    

    DisplayBrandListRequestBuilder() {
    }

    /**
     **/
    public DisplayBrandListRequestBuilder type(List<String> type) {
      this.type = type;
      return this;
    }

    /**
     **/
    public DisplayBrandListRequestBuilder rankScoreType(String rankScoreType) {
      this.rankScoreType = rankScoreType;
      return this;
    }

    /**
     **/
    public DisplayBrandListRequestBuilder pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     **/
    public DisplayBrandListRequestBuilder pageIndex(Integer pageIndex) {
      this.pageIndex = pageIndex;
      return this;
    }

    /**
     **/
    public DisplayBrandListRequestBuilder baseComponentId(Long baseComponentId) {
      this.baseComponentId = baseComponentId;
      return this;
    }

    /**
     **/
    public DisplayBrandListRequestBuilder attributes(Map<String, List<Long>> attributes) {
      this.attributes = attributes;
      return this;
    }


    public DisplayBrandListRequest build() {
      DisplayBrandListRequest displayBrandListRequest = new DisplayBrandListRequest();
      displayBrandListRequest.setType(this.type);
      displayBrandListRequest.setRankScoreType(this.rankScoreType);
      displayBrandListRequest.setPageSize(this.pageSize);
      displayBrandListRequest.setPageIndex(this.pageIndex);
      displayBrandListRequest.setBaseComponentId(this.baseComponentId);
      displayBrandListRequest.setAttributes(this.attributes);
      return displayBrandListRequest;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayBrandListRequestBuilder {\n");
      
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
      sb.append("    rankScoreType: ").append(toIndentedString(rankScoreType)).append("\n");
      sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
      sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
      sb.append("    baseComponentId: ").append(toIndentedString(baseComponentId)).append("\n");
      sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

