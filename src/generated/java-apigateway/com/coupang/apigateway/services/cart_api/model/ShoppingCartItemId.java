package com.coupang.apigateway.services.cart_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.904+09:00")
public class ShoppingCartItemId   {
  
  private Long vendorPackageItemId = null;
  private Long vendorItemId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorPackageItemId")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorPackageItemId")
  public Long getVendorPackageItemId() {
    return vendorPackageItemId;
  }
  
  /**
   **/
  public void setVendorPackageItemId(Long vendorPackageItemId) {
    this.vendorPackageItemId = vendorPackageItemId;
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShoppingCartItemId shoppingCartItemId = (ShoppingCartItemId) o;
    return Objects.equals(this.vendorPackageItemId, shoppingCartItemId.vendorPackageItemId) &&
        Objects.equals(this.vendorItemId, shoppingCartItemId.vendorItemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorPackageItemId, vendorItemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShoppingCartItemId {\n");
    
    sb.append("    vendorPackageItemId: ").append(toIndentedString(vendorPackageItemId)).append("\n");
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
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

  public static ShoppingCartItemIdBuilder builder() {
    return new ShoppingCartItemIdBuilder();
  }

  public static class ShoppingCartItemIdBuilder {

    private Long vendorPackageItemId = null;
    private Long vendorItemId = null;
    

    ShoppingCartItemIdBuilder() {
    }

    /**
     **/
    public ShoppingCartItemIdBuilder vendorPackageItemId(Long vendorPackageItemId) {
      this.vendorPackageItemId = vendorPackageItemId;
      return this;
    }

    /**
     **/
    public ShoppingCartItemIdBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }


    public ShoppingCartItemId build() {
      ShoppingCartItemId shoppingCartItemId = new ShoppingCartItemId();
      shoppingCartItemId.setVendorPackageItemId(this.vendorPackageItemId);
      shoppingCartItemId.setVendorItemId(this.vendorItemId);
      return shoppingCartItemId;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ShoppingCartItemIdBuilder {\n");
      
      sb.append("    vendorPackageItemId: ").append(toIndentedString(vendorPackageItemId)).append("\n");
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
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

