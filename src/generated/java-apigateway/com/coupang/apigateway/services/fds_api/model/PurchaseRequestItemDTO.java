package com.coupang.apigateway.services.fds_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.579+09:00")
public class PurchaseRequestItemDTO   {
  
  private Long vendorItemId = null;
  private Integer quantity = null;

  
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PurchaseRequestItemDTO purchaseRequestItemDTO = (PurchaseRequestItemDTO) o;
    return Objects.equals(this.vendorItemId, purchaseRequestItemDTO.vendorItemId) &&
        Objects.equals(this.quantity, purchaseRequestItemDTO.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemId, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PurchaseRequestItemDTO {\n");
    
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

  public static PurchaseRequestItemDTOBuilder builder() {
    return new PurchaseRequestItemDTOBuilder();
  }

  public static class PurchaseRequestItemDTOBuilder {

    private Long vendorItemId = null;
    private Integer quantity = null;
    

    PurchaseRequestItemDTOBuilder() {
    }

    /**
     **/
    public PurchaseRequestItemDTOBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public PurchaseRequestItemDTOBuilder quantity(Integer quantity) {
      this.quantity = quantity;
      return this;
    }


    public PurchaseRequestItemDTO build() {
      PurchaseRequestItemDTO purchaseRequestItemDTO = new PurchaseRequestItemDTO();
      purchaseRequestItemDTO.setVendorItemId(this.vendorItemId);
      purchaseRequestItemDTO.setQuantity(this.quantity);
      return purchaseRequestItemDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PurchaseRequestItemDTOBuilder {\n");
      
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

