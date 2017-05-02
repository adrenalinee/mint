package com.coupang.apigateway.services.cart_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.904+09:00")
public class WishBrandResponseDTO   {
  


  public enum WishResponseCodeEnum {
    INVALID_PRODUCT_ID("INVALID_PRODUCT_ID"),
    INVALID_ITEM_ID("INVALID_ITEM_ID"),
    INVALID_PACKAGE_ID("INVALID_PACKAGE_ID"),
    INVALID_VENDORITEM_ID("INVALID_VENDORITEM_ID"),
    INVALID_MEMBER_ID("INVALID_MEMBER_ID"),
    WISH_SERVER_ERROR("WISH_SERVER_ERROR"),
    WISH_UNKNOWN_ERROR("WISH_UNKNOWN_ERROR"),
    ADAPTER_IS_NOT_AVAILABLE_MESSAGE("ADAPTER_IS_NOT_AVAILABLE_MESSAGE"),
    SUCCESS("SUCCESS"),
    ALREADY_REGISTERED("ALREADY_REGISTERED"),
    NOT_REGISTERED("NOT_REGISTERED"),
    UNKNOWN_ITEM_TYPE("UNKNOWN_ITEM_TYPE");

    private String value;

    WishResponseCodeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private WishResponseCodeEnum wishResponseCode = null;
  private String message = null;
  private Object contents = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("wishResponseCode")
  @com.fasterxml.jackson.annotation.JsonProperty("wishResponseCode")
  public WishResponseCodeEnum getWishResponseCode() {
    return wishResponseCode;
  }
  
  /**
   **/
  public void setWishResponseCode(WishResponseCodeEnum wishResponseCode) {
    this.wishResponseCode = wishResponseCode;
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
  @org.codehaus.jackson.annotate.JsonProperty("contents")
  @com.fasterxml.jackson.annotation.JsonProperty("contents")
  public Object getContents() {
    return contents;
  }
  
  /**
   **/
  public void setContents(Object contents) {
    this.contents = contents;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WishBrandResponseDTO wishBrandResponseDTO = (WishBrandResponseDTO) o;
    return Objects.equals(this.wishResponseCode, wishBrandResponseDTO.wishResponseCode) &&
        Objects.equals(this.message, wishBrandResponseDTO.message) &&
        Objects.equals(this.contents, wishBrandResponseDTO.contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wishResponseCode, message, contents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WishBrandResponseDTO {\n");
    
    sb.append("    wishResponseCode: ").append(toIndentedString(wishResponseCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
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

  public static WishBrandResponseDTOBuilder builder() {
    return new WishBrandResponseDTOBuilder();
  }

  public static class WishBrandResponseDTOBuilder {

    private WishResponseCodeEnum wishResponseCode = null;
    private String message = null;
    private Object contents = null;
    

    WishBrandResponseDTOBuilder() {
    }

    /**
     **/
    public WishBrandResponseDTOBuilder wishResponseCode(WishResponseCodeEnum wishResponseCode) {
      this.wishResponseCode = wishResponseCode;
      return this;
    }

    /**
     **/
    public WishBrandResponseDTOBuilder message(String message) {
      this.message = message;
      return this;
    }

    /**
     **/
    public WishBrandResponseDTOBuilder contents(Object contents) {
      this.contents = contents;
      return this;
    }


    public WishBrandResponseDTO build() {
      WishBrandResponseDTO wishBrandResponseDTO = new WishBrandResponseDTO();
      wishBrandResponseDTO.setWishResponseCode(this.wishResponseCode);
      wishBrandResponseDTO.setMessage(this.message);
      wishBrandResponseDTO.setContents(this.contents);
      return wishBrandResponseDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class WishBrandResponseDTOBuilder {\n");
      
      sb.append("    wishResponseCode: ").append(toIndentedString(wishResponseCode)).append("\n");
      sb.append("    message: ").append(toIndentedString(message)).append("\n");
      sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
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

