package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class HotelVendorMapperDto   {
  
  private String vendorName = null;
  private Long vendorItemPackageId = null;
  private Long vendorItemId = null;
  private String vendorId = null;
  private String vendorHotelCode = null;
  private String vendorDescription = null;
  private Long productId = null;
  private Long hotelId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorName")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
  public String getVendorName() {
    return vendorName;
  }
  
  /**
   **/
  public void setVendorName(String vendorName) {
    this.vendorName = vendorName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemPackageId")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemPackageId")
  public Long getVendorItemPackageId() {
    return vendorItemPackageId;
  }
  
  /**
   **/
  public void setVendorItemPackageId(Long vendorItemPackageId) {
    this.vendorItemPackageId = vendorItemPackageId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemId")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemId")
  public Long getVendorItemId() {
    return vendorItemId;
  }
  
  /**
   **/
  public void setVendorItemId(Long vendorItemId) {
    this.vendorItemId = vendorItemId;
  }
  
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
  @org.codehaus.jackson.annotate.JsonProperty("vendorHotelCode")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorHotelCode")
  public String getVendorHotelCode() {
    return vendorHotelCode;
  }
  
  /**
   **/
  public void setVendorHotelCode(String vendorHotelCode) {
    this.vendorHotelCode = vendorHotelCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorDescription")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorDescription")
  public String getVendorDescription() {
    return vendorDescription;
  }
  
  /**
   **/
  public void setVendorDescription(String vendorDescription) {
    this.vendorDescription = vendorDescription;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("productId")
  @com.fasterxml.jackson.annotation.JsonProperty("productId")
  public Long getProductId() {
    return productId;
  }
  
  /**
   **/
  public void setProductId(Long productId) {
    this.productId = productId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("hotelId")
  @com.fasterxml.jackson.annotation.JsonProperty("hotelId")
  public Long getHotelId() {
    return hotelId;
  }
  
  /**
   **/
  public void setHotelId(Long hotelId) {
    this.hotelId = hotelId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelVendorMapperDto hotelVendorMapperDto = (HotelVendorMapperDto) o;
    return Objects.equals(this.vendorName, hotelVendorMapperDto.vendorName) &&
        Objects.equals(this.vendorItemPackageId, hotelVendorMapperDto.vendorItemPackageId) &&
        Objects.equals(this.vendorItemId, hotelVendorMapperDto.vendorItemId) &&
        Objects.equals(this.vendorId, hotelVendorMapperDto.vendorId) &&
        Objects.equals(this.vendorHotelCode, hotelVendorMapperDto.vendorHotelCode) &&
        Objects.equals(this.vendorDescription, hotelVendorMapperDto.vendorDescription) &&
        Objects.equals(this.productId, hotelVendorMapperDto.productId) &&
        Objects.equals(this.hotelId, hotelVendorMapperDto.hotelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorName, vendorItemPackageId, vendorItemId, vendorId, vendorHotelCode, vendorDescription, productId, hotelId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelVendorMapperDto {\n");
    
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
    sb.append("    vendorItemPackageId: ").append(toIndentedString(vendorItemPackageId)).append("\n");
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    vendorHotelCode: ").append(toIndentedString(vendorHotelCode)).append("\n");
    sb.append("    vendorDescription: ").append(toIndentedString(vendorDescription)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
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

  public static HotelVendorMapperDtoBuilder builder() {
    return new HotelVendorMapperDtoBuilder();
  }

  public static class HotelVendorMapperDtoBuilder {

    private String vendorName = null;
    private Long vendorItemPackageId = null;
    private Long vendorItemId = null;
    private String vendorId = null;
    private String vendorHotelCode = null;
    private String vendorDescription = null;
    private Long productId = null;
    private Long hotelId = null;
    

    HotelVendorMapperDtoBuilder() {
    }

    /**
     **/
    public HotelVendorMapperDtoBuilder vendorName(String vendorName) {
      this.vendorName = vendorName;
      return this;
    }

    /**
     **/
    public HotelVendorMapperDtoBuilder vendorItemPackageId(Long vendorItemPackageId) {
      this.vendorItemPackageId = vendorItemPackageId;
      return this;
    }

    /**
     **/
    public HotelVendorMapperDtoBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public HotelVendorMapperDtoBuilder vendorId(String vendorId) {
      this.vendorId = vendorId;
      return this;
    }

    /**
     **/
    public HotelVendorMapperDtoBuilder vendorHotelCode(String vendorHotelCode) {
      this.vendorHotelCode = vendorHotelCode;
      return this;
    }

    /**
     **/
    public HotelVendorMapperDtoBuilder vendorDescription(String vendorDescription) {
      this.vendorDescription = vendorDescription;
      return this;
    }

    /**
     **/
    public HotelVendorMapperDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public HotelVendorMapperDtoBuilder hotelId(Long hotelId) {
      this.hotelId = hotelId;
      return this;
    }


    public HotelVendorMapperDto build() {
      HotelVendorMapperDto hotelVendorMapperDto = new HotelVendorMapperDto();
      hotelVendorMapperDto.setVendorName(this.vendorName);
      hotelVendorMapperDto.setVendorItemPackageId(this.vendorItemPackageId);
      hotelVendorMapperDto.setVendorItemId(this.vendorItemId);
      hotelVendorMapperDto.setVendorId(this.vendorId);
      hotelVendorMapperDto.setVendorHotelCode(this.vendorHotelCode);
      hotelVendorMapperDto.setVendorDescription(this.vendorDescription);
      hotelVendorMapperDto.setProductId(this.productId);
      hotelVendorMapperDto.setHotelId(this.hotelId);
      return hotelVendorMapperDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HotelVendorMapperDtoBuilder {\n");
      
      sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
      sb.append("    vendorItemPackageId: ").append(toIndentedString(vendorItemPackageId)).append("\n");
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
      sb.append("    vendorHotelCode: ").append(toIndentedString(vendorHotelCode)).append("\n");
      sb.append("    vendorDescription: ").append(toIndentedString(vendorDescription)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
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

