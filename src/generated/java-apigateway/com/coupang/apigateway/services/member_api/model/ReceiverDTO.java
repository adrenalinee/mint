package com.coupang.apigateway.services.member_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.member_api.model.AddressDTO;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.419+09:00")
public class ReceiverDTO   {
  
  private String phoneNumber = null;
  private String name = null;
  private String mobile = null;
  private String countryCallingCode = null;
  private AddressDTO address = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("phoneNumber")
  @com.fasterxml.jackson.annotation.JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  
  /**
   **/
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
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
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("mobile")
  @com.fasterxml.jackson.annotation.JsonProperty("mobile")
  public String getMobile() {
    return mobile;
  }
  
  /**
   **/
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("countryCallingCode")
  @com.fasterxml.jackson.annotation.JsonProperty("countryCallingCode")
  public String getCountryCallingCode() {
    return countryCallingCode;
  }
  
  /**
   **/
  public void setCountryCallingCode(String countryCallingCode) {
    this.countryCallingCode = countryCallingCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("address")
  @com.fasterxml.jackson.annotation.JsonProperty("address")
  public AddressDTO getAddress() {
    return address;
  }
  
  /**
   **/
  public void setAddress(AddressDTO address) {
    this.address = address;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiverDTO receiverDTO = (ReceiverDTO) o;
    return Objects.equals(this.phoneNumber, receiverDTO.phoneNumber) &&
        Objects.equals(this.name, receiverDTO.name) &&
        Objects.equals(this.mobile, receiverDTO.mobile) &&
        Objects.equals(this.countryCallingCode, receiverDTO.countryCallingCode) &&
        Objects.equals(this.address, receiverDTO.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, name, mobile, countryCallingCode, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiverDTO {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    countryCallingCode: ").append(toIndentedString(countryCallingCode)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

  public static ReceiverDTOBuilder builder() {
    return new ReceiverDTOBuilder();
  }

  public static class ReceiverDTOBuilder {

    private String phoneNumber = null;
    private String name = null;
    private String mobile = null;
    private String countryCallingCode = null;
    private AddressDTO address = null;
    

    ReceiverDTOBuilder() {
    }

    /**
     **/
    public ReceiverDTOBuilder phoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    /**
     **/
    public ReceiverDTOBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public ReceiverDTOBuilder mobile(String mobile) {
      this.mobile = mobile;
      return this;
    }

    /**
     **/
    public ReceiverDTOBuilder countryCallingCode(String countryCallingCode) {
      this.countryCallingCode = countryCallingCode;
      return this;
    }

    /**
     **/
    public ReceiverDTOBuilder address(AddressDTO address) {
      this.address = address;
      return this;
    }


    public ReceiverDTO build() {
      ReceiverDTO receiverDTO = new ReceiverDTO();
      receiverDTO.setPhoneNumber(this.phoneNumber);
      receiverDTO.setName(this.name);
      receiverDTO.setMobile(this.mobile);
      receiverDTO.setCountryCallingCode(this.countryCallingCode);
      receiverDTO.setAddress(this.address);
      return receiverDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReceiverDTOBuilder {\n");
      
      sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
      sb.append("    countryCallingCode: ").append(toIndentedString(countryCallingCode)).append("\n");
      sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

