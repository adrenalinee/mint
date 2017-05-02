package com.coupang.apigateway.services.dealrank.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.606+09:00")
public class InlineResponse2001   {
  
  private String deviceType = null;
  private String segmentId = null;
  private String segRank = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deviceType")
  @com.fasterxml.jackson.annotation.JsonProperty("deviceType")
  public String getDeviceType() {
    return deviceType;
  }
  
  /**
   **/
  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("segmentId")
  @com.fasterxml.jackson.annotation.JsonProperty("segmentId")
  public String getSegmentId() {
    return segmentId;
  }
  
  /**
   **/
  public void setSegmentId(String segmentId) {
    this.segmentId = segmentId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("segRank")
  @com.fasterxml.jackson.annotation.JsonProperty("segRank")
  public String getSegRank() {
    return segRank;
  }
  
  /**
   **/
  public void setSegRank(String segRank) {
    this.segRank = segRank;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.deviceType, inlineResponse2001.deviceType) &&
        Objects.equals(this.segmentId, inlineResponse2001.segmentId) &&
        Objects.equals(this.segRank, inlineResponse2001.segRank);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceType, segmentId, segRank);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    segmentId: ").append(toIndentedString(segmentId)).append("\n");
    sb.append("    segRank: ").append(toIndentedString(segRank)).append("\n");
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

  public static InlineResponse2001Builder builder() {
    return new InlineResponse2001Builder();
  }

  public static class InlineResponse2001Builder {

    private String deviceType = null;
    private String segmentId = null;
    private String segRank = null;
    

    InlineResponse2001Builder() {
    }

    /**
     **/
    public InlineResponse2001Builder deviceType(String deviceType) {
      this.deviceType = deviceType;
      return this;
    }

    /**
     **/
    public InlineResponse2001Builder segmentId(String segmentId) {
      this.segmentId = segmentId;
      return this;
    }

    /**
     **/
    public InlineResponse2001Builder segRank(String segRank) {
      this.segRank = segRank;
      return this;
    }


    public InlineResponse2001 build() {
      InlineResponse2001 inlineResponse2001 = new InlineResponse2001();
      inlineResponse2001.setDeviceType(this.deviceType);
      inlineResponse2001.setSegmentId(this.segmentId);
      inlineResponse2001.setSegRank(this.segRank);
      return inlineResponse2001;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class InlineResponse2001Builder {\n");
      
      sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
      sb.append("    segmentId: ").append(toIndentedString(segmentId)).append("\n");
      sb.append("    segRank: ").append(toIndentedString(segRank)).append("\n");
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

