package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class RoomInfo   {
  
  private String vendorId = null;
  private Integer seq = null;
  private String rateKey = null;
  private String extraInfo = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorId")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorId")
  public String getVendorId() {
    return vendorId;
  }
  
  /**
   **/
  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("seq")
  @com.fasterxml.jackson.annotation.JsonProperty("seq")
  public Integer getSeq() {
    return seq;
  }
  
  /**
   **/
  public void setSeq(Integer seq) {
    this.seq = seq;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("rateKey")
  @com.fasterxml.jackson.annotation.JsonProperty("rateKey")
  public String getRateKey() {
    return rateKey;
  }
  
  /**
   **/
  public void setRateKey(String rateKey) {
    this.rateKey = rateKey;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("extraInfo")
  @com.fasterxml.jackson.annotation.JsonProperty("extraInfo")
  public String getExtraInfo() {
    return extraInfo;
  }
  
  /**
   **/
  public void setExtraInfo(String extraInfo) {
    this.extraInfo = extraInfo;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomInfo roomInfo = (RoomInfo) o;
    return Objects.equals(this.vendorId, roomInfo.vendorId) &&
        Objects.equals(this.seq, roomInfo.seq) &&
        Objects.equals(this.rateKey, roomInfo.rateKey) &&
        Objects.equals(this.extraInfo, roomInfo.extraInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorId, seq, rateKey, extraInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomInfo {\n");
    
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
    sb.append("    rateKey: ").append(toIndentedString(rateKey)).append("\n");
    sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
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

  public static RoomInfoBuilder builder() {
    return new RoomInfoBuilder();
  }

  public static class RoomInfoBuilder {

    private String vendorId = null;
    private Integer seq = null;
    private String rateKey = null;
    private String extraInfo = null;
    

    RoomInfoBuilder() {
    }

    /**
     **/
    public RoomInfoBuilder vendorId(String vendorId) {
      this.vendorId = vendorId;
      return this;
    }

    /**
     **/
    public RoomInfoBuilder seq(Integer seq) {
      this.seq = seq;
      return this;
    }

    /**
     **/
    public RoomInfoBuilder rateKey(String rateKey) {
      this.rateKey = rateKey;
      return this;
    }

    /**
     **/
    public RoomInfoBuilder extraInfo(String extraInfo) {
      this.extraInfo = extraInfo;
      return this;
    }


    public RoomInfo build() {
      RoomInfo roomInfo = new RoomInfo();
      roomInfo.setVendorId(this.vendorId);
      roomInfo.setSeq(this.seq);
      roomInfo.setRateKey(this.rateKey);
      roomInfo.setExtraInfo(this.extraInfo);
      return roomInfo;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RoomInfoBuilder {\n");
      
      sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
      sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
      sb.append("    rateKey: ").append(toIndentedString(rateKey)).append("\n");
      sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
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

