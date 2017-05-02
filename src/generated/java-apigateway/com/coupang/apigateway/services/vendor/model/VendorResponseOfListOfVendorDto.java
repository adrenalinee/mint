package com.coupang.apigateway.services.vendor.model;

import java.util.Objects;
import com.coupang.apigateway.services.vendor.model.VendorDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.860+09:00")
public class VendorResponseOfListOfVendorDto   {
  
  private Boolean successful = null;
  private String message = null;
  private Integer code = null;
  private List<VendorDto> body = new ArrayList<VendorDto>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("successful")
  @com.fasterxml.jackson.annotation.JsonProperty("successful")
  public Boolean getSuccessful() {
    return successful;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isSuccessful() {
    return successful == null ? false : successful;
  }
  
  /**
   **/
  public void setSuccessful(Boolean successful) {
    this.successful = successful;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("message")
  @com.fasterxml.jackson.annotation.JsonProperty("message")
  public String getMessage() {
    return message;
  }
  
  /**
   **/
  public void setMessage(String message) {
    this.message = message;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("code")
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  public Integer getCode() {
    return code;
  }
  
  /**
   **/
  public void setCode(Integer code) {
    this.code = code;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("body")
  @com.fasterxml.jackson.annotation.JsonProperty("body")
  public List<VendorDto> getBody() {
    return body;
  }
  
  /**
   **/
  public void setBody(List<VendorDto> body) {
    this.body = body;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorResponseOfListOfVendorDto vendorResponseOfListOfVendorDto = (VendorResponseOfListOfVendorDto) o;
    return Objects.equals(this.successful, vendorResponseOfListOfVendorDto.successful) &&
        Objects.equals(this.message, vendorResponseOfListOfVendorDto.message) &&
        Objects.equals(this.code, vendorResponseOfListOfVendorDto.code) &&
        Objects.equals(this.body, vendorResponseOfListOfVendorDto.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successful, message, code, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorResponseOfListOfVendorDto {\n");
    
    sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

  public static VendorResponseOfListOfVendorDtoBuilder builder() {
    return new VendorResponseOfListOfVendorDtoBuilder();
  }

  public static class VendorResponseOfListOfVendorDtoBuilder {

    private Boolean successful = null;
    private String message = null;
    private Integer code = null;
    private List<VendorDto> body = new ArrayList<VendorDto>();
    

    VendorResponseOfListOfVendorDtoBuilder() {
    }

    /**
     **/
    public VendorResponseOfListOfVendorDtoBuilder successful(Boolean successful) {
      this.successful = successful;
      return this;
    }

    /**
     **/
    public VendorResponseOfListOfVendorDtoBuilder message(String message) {
      this.message = message;
      return this;
    }

    /**
     **/
    public VendorResponseOfListOfVendorDtoBuilder code(Integer code) {
      this.code = code;
      return this;
    }

    /**
     **/
    public VendorResponseOfListOfVendorDtoBuilder body(List<VendorDto> body) {
      this.body = body;
      return this;
    }


    public VendorResponseOfListOfVendorDto build() {
      VendorResponseOfListOfVendorDto vendorResponseOfListOfVendorDto = new VendorResponseOfListOfVendorDto();
      vendorResponseOfListOfVendorDto.setSuccessful(this.successful);
      vendorResponseOfListOfVendorDto.setMessage(this.message);
      vendorResponseOfListOfVendorDto.setCode(this.code);
      vendorResponseOfListOfVendorDto.setBody(this.body);
      return vendorResponseOfListOfVendorDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorResponseOfListOfVendorDtoBuilder {\n");
      
      sb.append("    successful: ").append(toIndentedString(successful)).append("\n");
      sb.append("    message: ").append(toIndentedString(message)).append("\n");
      sb.append("    code: ").append(toIndentedString(code)).append("\n");
      sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

