package com.coupang.apigateway.services.identity_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:23.052+09:00")
public class LandAddressDTO   {
  
  private String addrDetail = null;
  private String addr = null;

  
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
    LandAddressDTO landAddressDTO = (LandAddressDTO) o;
    return Objects.equals(this.addrDetail, landAddressDTO.addrDetail) &&
        Objects.equals(this.addr, landAddressDTO.addr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addrDetail, addr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LandAddressDTO {\n");
    
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

  public static LandAddressDTOBuilder builder() {
    return new LandAddressDTOBuilder();
  }

  public static class LandAddressDTOBuilder {

    private String addrDetail = null;
    private String addr = null;
    

    LandAddressDTOBuilder() {
    }

    /**
     **/
    public LandAddressDTOBuilder addrDetail(String addrDetail) {
      this.addrDetail = addrDetail;
      return this;
    }

    /**
     **/
    public LandAddressDTOBuilder addr(String addr) {
      this.addr = addr;
      return this;
    }


    public LandAddressDTO build() {
      LandAddressDTO landAddressDTO = new LandAddressDTO();
      landAddressDTO.setAddrDetail(this.addrDetail);
      landAddressDTO.setAddr(this.addr);
      return landAddressDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class LandAddressDTOBuilder {\n");
      
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

