package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class RegionKeywordSearchDto   {
  
  private List<String> traceNames = new ArrayList<String>();
  private String regionType = null;
  private Long regionId = null;
  private String name = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("traceNames")
  @com.fasterxml.jackson.annotation.JsonProperty("traceNames")
  public List<String> getTraceNames() {
    return traceNames;
  }
  
  /**
   **/
  public void setTraceNames(List<String> traceNames) {
    this.traceNames = traceNames;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("regionType")
  @com.fasterxml.jackson.annotation.JsonProperty("regionType")
  public String getRegionType() {
    return regionType;
  }
  
  /**
   **/
  public void setRegionType(String regionType) {
    this.regionType = regionType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("regionId")
  @com.fasterxml.jackson.annotation.JsonProperty("regionId")
  public Long getRegionId() {
    return regionId;
  }
  
  /**
   **/
  public void setRegionId(Long regionId) {
    this.regionId = regionId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("name")
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  public String getName() {
    return name;
  }
  
  /**
   **/
  public void setName(String name) {
    this.name = name;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegionKeywordSearchDto regionKeywordSearchDto = (RegionKeywordSearchDto) o;
    return Objects.equals(this.traceNames, regionKeywordSearchDto.traceNames) &&
        Objects.equals(this.regionType, regionKeywordSearchDto.regionType) &&
        Objects.equals(this.regionId, regionKeywordSearchDto.regionId) &&
        Objects.equals(this.name, regionKeywordSearchDto.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(traceNames, regionType, regionId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegionKeywordSearchDto {\n");
    
    sb.append("    traceNames: ").append(toIndentedString(traceNames)).append("\n");
    sb.append("    regionType: ").append(toIndentedString(regionType)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

  public static RegionKeywordSearchDtoBuilder builder() {
    return new RegionKeywordSearchDtoBuilder();
  }

  public static class RegionKeywordSearchDtoBuilder {

    private List<String> traceNames = new ArrayList<String>();
    private String regionType = null;
    private Long regionId = null;
    private String name = null;
    

    RegionKeywordSearchDtoBuilder() {
    }

    /**
     **/
    public RegionKeywordSearchDtoBuilder traceNames(List<String> traceNames) {
      this.traceNames = traceNames;
      return this;
    }

    /**
     **/
    public RegionKeywordSearchDtoBuilder regionType(String regionType) {
      this.regionType = regionType;
      return this;
    }

    /**
     **/
    public RegionKeywordSearchDtoBuilder regionId(Long regionId) {
      this.regionId = regionId;
      return this;
    }

    /**
     **/
    public RegionKeywordSearchDtoBuilder name(String name) {
      this.name = name;
      return this;
    }


    public RegionKeywordSearchDto build() {
      RegionKeywordSearchDto regionKeywordSearchDto = new RegionKeywordSearchDto();
      regionKeywordSearchDto.setTraceNames(this.traceNames);
      regionKeywordSearchDto.setRegionType(this.regionType);
      regionKeywordSearchDto.setRegionId(this.regionId);
      regionKeywordSearchDto.setName(this.name);
      return regionKeywordSearchDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RegionKeywordSearchDtoBuilder {\n");
      
      sb.append("    traceNames: ").append(toIndentedString(traceNames)).append("\n");
      sb.append("    regionType: ").append(toIndentedString(regionType)).append("\n");
      sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

