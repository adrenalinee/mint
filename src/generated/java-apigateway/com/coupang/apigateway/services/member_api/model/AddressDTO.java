package com.coupang.apigateway.services.member_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.419+09:00")
public class AddressDTO   {
  
  private String zipcodeId = null;
  private String post2 = null;
  private String post1 = null;
  private String address2 = null;
  private String address1 = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("zipcodeId")
  @com.fasterxml.jackson.annotation.JsonProperty("zipcodeId")
  public String getZipcodeId() {
    return zipcodeId;
  }
  
  /**
   **/
  public void setZipcodeId(String zipcodeId) {
    this.zipcodeId = zipcodeId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("post2")
  @com.fasterxml.jackson.annotation.JsonProperty("post2")
  public String getPost2() {
    return post2;
  }
  
  /**
   **/
  public void setPost2(String post2) {
    this.post2 = post2;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("post1")
  @com.fasterxml.jackson.annotation.JsonProperty("post1")
  public String getPost1() {
    return post1;
  }
  
  /**
   **/
  public void setPost1(String post1) {
    this.post1 = post1;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("address2")
  @com.fasterxml.jackson.annotation.JsonProperty("address2")
  public String getAddress2() {
    return address2;
  }
  
  /**
   **/
  public void setAddress2(String address2) {
    this.address2 = address2;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("address1")
  @com.fasterxml.jackson.annotation.JsonProperty("address1")
  public String getAddress1() {
    return address1;
  }
  
  /**
   **/
  public void setAddress1(String address1) {
    this.address1 = address1;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressDTO addressDTO = (AddressDTO) o;
    return Objects.equals(this.zipcodeId, addressDTO.zipcodeId) &&
        Objects.equals(this.post2, addressDTO.post2) &&
        Objects.equals(this.post1, addressDTO.post1) &&
        Objects.equals(this.address2, addressDTO.address2) &&
        Objects.equals(this.address1, addressDTO.address1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zipcodeId, post2, post1, address2, address1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressDTO {\n");
    
    sb.append("    zipcodeId: ").append(toIndentedString(zipcodeId)).append("\n");
    sb.append("    post2: ").append(toIndentedString(post2)).append("\n");
    sb.append("    post1: ").append(toIndentedString(post1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
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

  public static AddressDTOBuilder builder() {
    return new AddressDTOBuilder();
  }

  public static class AddressDTOBuilder {

    private String zipcodeId = null;
    private String post2 = null;
    private String post1 = null;
    private String address2 = null;
    private String address1 = null;
    

    AddressDTOBuilder() {
    }

    /**
     **/
    public AddressDTOBuilder zipcodeId(String zipcodeId) {
      this.zipcodeId = zipcodeId;
      return this;
    }

    /**
     **/
    public AddressDTOBuilder post2(String post2) {
      this.post2 = post2;
      return this;
    }

    /**
     **/
    public AddressDTOBuilder post1(String post1) {
      this.post1 = post1;
      return this;
    }

    /**
     **/
    public AddressDTOBuilder address2(String address2) {
      this.address2 = address2;
      return this;
    }

    /**
     **/
    public AddressDTOBuilder address1(String address1) {
      this.address1 = address1;
      return this;
    }


    public AddressDTO build() {
      AddressDTO addressDTO = new AddressDTO();
      addressDTO.setZipcodeId(this.zipcodeId);
      addressDTO.setPost2(this.post2);
      addressDTO.setPost1(this.post1);
      addressDTO.setAddress2(this.address2);
      addressDTO.setAddress1(this.address1);
      return addressDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AddressDTOBuilder {\n");
      
      sb.append("    zipcodeId: ").append(toIndentedString(zipcodeId)).append("\n");
      sb.append("    post2: ").append(toIndentedString(post2)).append("\n");
      sb.append("    post1: ").append(toIndentedString(post1)).append("\n");
      sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
      sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
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

