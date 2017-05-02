package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class VendorItemQuantityDto   {
  
  private Long vendorItemId = null;
  private Integer stockQuantity = null;
  private Integer soldCount = null;
  private Integer maximumBuyCount = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("stockQuantity")
  @com.fasterxml.jackson.annotation.JsonProperty("stockQuantity")
  public Integer getStockQuantity() {
    return stockQuantity;
  }
  
  /**
   **/
  public void setStockQuantity(Integer stockQuantity) {
    this.stockQuantity = stockQuantity;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("soldCount")
  @com.fasterxml.jackson.annotation.JsonProperty("soldCount")
  public Integer getSoldCount() {
    return soldCount;
  }
  
  /**
   **/
  public void setSoldCount(Integer soldCount) {
    this.soldCount = soldCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("maximumBuyCount")
  @com.fasterxml.jackson.annotation.JsonProperty("maximumBuyCount")
  public Integer getMaximumBuyCount() {
    return maximumBuyCount;
  }
  
  /**
   **/
  public void setMaximumBuyCount(Integer maximumBuyCount) {
    this.maximumBuyCount = maximumBuyCount;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorItemQuantityDto vendorItemQuantityDto = (VendorItemQuantityDto) o;
    return Objects.equals(this.vendorItemId, vendorItemQuantityDto.vendorItemId) &&
        Objects.equals(this.stockQuantity, vendorItemQuantityDto.stockQuantity) &&
        Objects.equals(this.soldCount, vendorItemQuantityDto.soldCount) &&
        Objects.equals(this.maximumBuyCount, vendorItemQuantityDto.maximumBuyCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemId, stockQuantity, soldCount, maximumBuyCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorItemQuantityDto {\n");
    
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    stockQuantity: ").append(toIndentedString(stockQuantity)).append("\n");
    sb.append("    soldCount: ").append(toIndentedString(soldCount)).append("\n");
    sb.append("    maximumBuyCount: ").append(toIndentedString(maximumBuyCount)).append("\n");
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

  public static VendorItemQuantityDtoBuilder builder() {
    return new VendorItemQuantityDtoBuilder();
  }

  public static class VendorItemQuantityDtoBuilder {

    private Long vendorItemId = null;
    private Integer stockQuantity = null;
    private Integer soldCount = null;
    private Integer maximumBuyCount = null;
    

    VendorItemQuantityDtoBuilder() {
    }

    /**
     **/
    public VendorItemQuantityDtoBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public VendorItemQuantityDtoBuilder stockQuantity(Integer stockQuantity) {
      this.stockQuantity = stockQuantity;
      return this;
    }

    /**
     **/
    public VendorItemQuantityDtoBuilder soldCount(Integer soldCount) {
      this.soldCount = soldCount;
      return this;
    }

    /**
     **/
    public VendorItemQuantityDtoBuilder maximumBuyCount(Integer maximumBuyCount) {
      this.maximumBuyCount = maximumBuyCount;
      return this;
    }


    public VendorItemQuantityDto build() {
      VendorItemQuantityDto vendorItemQuantityDto = new VendorItemQuantityDto();
      vendorItemQuantityDto.setVendorItemId(this.vendorItemId);
      vendorItemQuantityDto.setStockQuantity(this.stockQuantity);
      vendorItemQuantityDto.setSoldCount(this.soldCount);
      vendorItemQuantityDto.setMaximumBuyCount(this.maximumBuyCount);
      return vendorItemQuantityDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorItemQuantityDtoBuilder {\n");
      
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    stockQuantity: ").append(toIndentedString(stockQuantity)).append("\n");
      sb.append("    soldCount: ").append(toIndentedString(soldCount)).append("\n");
      sb.append("    maximumBuyCount: ").append(toIndentedString(maximumBuyCount)).append("\n");
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

