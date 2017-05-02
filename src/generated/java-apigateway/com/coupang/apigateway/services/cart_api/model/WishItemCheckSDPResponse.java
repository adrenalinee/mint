package com.coupang.apigateway.services.cart_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.904+09:00")
public class WishItemCheckSDPResponse   {
  


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
    UNKNOWN_ITEM_TYPE("UNKNOWN_ITEM_TYPE"),
    INVALID_ARGUMENT("INVALID_ARGUMENT"),
    NO_WISH_ITEM("NO_WISH_ITEM");

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
  private Boolean contents = null;

  
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
  public Boolean getContents() {
    return contents;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isContents() {
    return contents == null ? false : contents;
  }
  
  /**
   **/
  public void setContents(Boolean contents) {
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
    WishItemCheckSDPResponse wishItemCheckSDPResponse = (WishItemCheckSDPResponse) o;
    return Objects.equals(this.wishResponseCode, wishItemCheckSDPResponse.wishResponseCode) &&
        Objects.equals(this.message, wishItemCheckSDPResponse.message) &&
        Objects.equals(this.contents, wishItemCheckSDPResponse.contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wishResponseCode, message, contents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WishItemCheckSDPResponse {\n");
    
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

  public static WishItemCheckSDPResponseBuilder builder() {
    return new WishItemCheckSDPResponseBuilder();
  }

  public static class WishItemCheckSDPResponseBuilder {

    private WishResponseCodeEnum wishResponseCode = null;
    private String message = null;
    private Boolean contents = null;
    

    WishItemCheckSDPResponseBuilder() {
    }

    /**
     **/
    public WishItemCheckSDPResponseBuilder wishResponseCode(WishResponseCodeEnum wishResponseCode) {
      this.wishResponseCode = wishResponseCode;
      return this;
    }

    /**
     **/
    public WishItemCheckSDPResponseBuilder message(String message) {
      this.message = message;
      return this;
    }

    /**
     **/
    public WishItemCheckSDPResponseBuilder contents(Boolean contents) {
      this.contents = contents;
      return this;
    }


    public WishItemCheckSDPResponse build() {
      WishItemCheckSDPResponse wishItemCheckSDPResponse = new WishItemCheckSDPResponse();
      wishItemCheckSDPResponse.setWishResponseCode(this.wishResponseCode);
      wishItemCheckSDPResponse.setMessage(this.message);
      wishItemCheckSDPResponse.setContents(this.contents);
      return wishItemCheckSDPResponse;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class WishItemCheckSDPResponseBuilder {\n");
      
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

