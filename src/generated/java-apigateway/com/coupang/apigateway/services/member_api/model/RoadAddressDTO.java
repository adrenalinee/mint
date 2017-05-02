package com.coupang.apigateway.services.member_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.419+09:00")
public class RoadAddressDTO   {
  
  private String addrRefer = null;
  private String addrDetail = null;
  private String addr = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("addrRefer")
  @com.fasterxml.jackson.annotation.JsonProperty("addrRefer")
  public String getAddrRefer() {
    return addrRefer;
  }
  
  /**
   **/
  public void setAddrRefer(String addrRefer) {
    this.addrRefer = addrRefer;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("addrDetail")
  @com.fasterxml.jackson.annotation.JsonProperty("addrDetail")
  public String getAddrDetail() {
    return addrDetail;
  }
  
  /**
   **/
  public void setAddrDetail(String addrDetail) {
    this.addrDetail = addrDetail;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("addr")
  @com.fasterxml.jackson.annotation.JsonProperty("addr")
  public String getAddr() {
    return addr;
  }
  
  /**
   **/
  public void setAddr(String addr) {
    this.addr = addr;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoadAddressDTO roadAddressDTO = (RoadAddressDTO) o;
    return Objects.equals(this.addrRefer, roadAddressDTO.addrRefer) &&
        Objects.equals(this.addrDetail, roadAddressDTO.addrDetail) &&
        Objects.equals(this.addr, roadAddressDTO.addr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addrRefer, addrDetail, addr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoadAddressDTO {\n");
    
    sb.append("    addrRefer: ").append(toIndentedString(addrRefer)).append("\n");
    sb.append("    addrDetail: ").append(toIndentedString(addrDetail)).append("\n");
    sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
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

  public static RoadAddressDTOBuilder builder() {
    return new RoadAddressDTOBuilder();
  }

  public static class RoadAddressDTOBuilder {

    private String addrRefer = null;
    private String addrDetail = null;
    private String addr = null;
    

    RoadAddressDTOBuilder() {
    }

    /**
     **/
    public RoadAddressDTOBuilder addrRefer(String addrRefer) {
      this.addrRefer = addrRefer;
      return this;
    }

    /**
     **/
    public RoadAddressDTOBuilder addrDetail(String addrDetail) {
      this.addrDetail = addrDetail;
      return this;
    }

    /**
     **/
    public RoadAddressDTOBuilder addr(String addr) {
      this.addr = addr;
      return this;
    }


    public RoadAddressDTO build() {
      RoadAddressDTO roadAddressDTO = new RoadAddressDTO();
      roadAddressDTO.setAddrRefer(this.addrRefer);
      roadAddressDTO.setAddrDetail(this.addrDetail);
      roadAddressDTO.setAddr(this.addr);
      return roadAddressDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RoadAddressDTOBuilder {\n");
      
      sb.append("    addrRefer: ").append(toIndentedString(addrRefer)).append("\n");
      sb.append("    addrDetail: ").append(toIndentedString(addrDetail)).append("\n");
      sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
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

