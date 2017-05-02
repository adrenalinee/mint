package com.coupang.apigateway.services.cart_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.904+09:00")
public class ShoppingCartItemDTO   {
  
  private Long vendorItemPackageId = null;
  private Long vendorItemId = null;
  private Integer quantity = null;
  private Long productId = null;
  private Long itemId = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("quantity")
  @com.fasterxml.jackson.annotation.JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  
  /**
   **/
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
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
  @org.codehaus.jackson.annotate.JsonProperty("itemId")
  @com.fasterxml.jackson.annotation.JsonProperty("itemId")
  public Long getItemId() {
    return itemId;
  }
  
  /**
   **/
  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShoppingCartItemDTO shoppingCartItemDTO = (ShoppingCartItemDTO) o;
    return Objects.equals(this.vendorItemPackageId, shoppingCartItemDTO.vendorItemPackageId) &&
        Objects.equals(this.vendorItemId, shoppingCartItemDTO.vendorItemId) &&
        Objects.equals(this.quantity, shoppingCartItemDTO.quantity) &&
        Objects.equals(this.productId, shoppingCartItemDTO.productId) &&
        Objects.equals(this.itemId, shoppingCartItemDTO.itemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemPackageId, vendorItemId, quantity, productId, itemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShoppingCartItemDTO {\n");
    
    sb.append("    vendorItemPackageId: ").append(toIndentedString(vendorItemPackageId)).append("\n");
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

  public static ShoppingCartItemDTOBuilder builder() {
    return new ShoppingCartItemDTOBuilder();
  }

  public static class ShoppingCartItemDTOBuilder {

    private Long vendorItemPackageId = null;
    private Long vendorItemId = null;
    private Integer quantity = null;
    private Long productId = null;
    private Long itemId = null;
    

    ShoppingCartItemDTOBuilder() {
    }

    /**
     **/
    public ShoppingCartItemDTOBuilder vendorItemPackageId(Long vendorItemPackageId) {
      this.vendorItemPackageId = vendorItemPackageId;
      return this;
    }

    /**
     **/
    public ShoppingCartItemDTOBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public ShoppingCartItemDTOBuilder quantity(Integer quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     **/
    public ShoppingCartItemDTOBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public ShoppingCartItemDTOBuilder itemId(Long itemId) {
      this.itemId = itemId;
      return this;
    }


    public ShoppingCartItemDTO build() {
      ShoppingCartItemDTO shoppingCartItemDTO = new ShoppingCartItemDTO();
      shoppingCartItemDTO.setVendorItemPackageId(this.vendorItemPackageId);
      shoppingCartItemDTO.setVendorItemId(this.vendorItemId);
      shoppingCartItemDTO.setQuantity(this.quantity);
      shoppingCartItemDTO.setProductId(this.productId);
      shoppingCartItemDTO.setItemId(this.itemId);
      return shoppingCartItemDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ShoppingCartItemDTOBuilder {\n");
      
      sb.append("    vendorItemPackageId: ").append(toIndentedString(vendorItemPackageId)).append("\n");
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

