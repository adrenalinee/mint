package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class VendorItemSkuDto   {
  
  private Long skuId = null;
  private Integer quantity = null;
  private String providerId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("skuId")
  @com.fasterxml.jackson.annotation.JsonProperty("skuId")
  public Long getSkuId() {
    return skuId;
  }
  
  /**
   **/
  public void setSkuId(Long skuId) {
    this.skuId = skuId;
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
  @org.codehaus.jackson.annotate.JsonProperty("providerId")
  @com.fasterxml.jackson.annotation.JsonProperty("providerId")
  public String getProviderId() {
    return providerId;
  }
  
  /**
   **/
  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorItemSkuDto vendorItemSkuDto = (VendorItemSkuDto) o;
    return Objects.equals(this.skuId, vendorItemSkuDto.skuId) &&
        Objects.equals(this.quantity, vendorItemSkuDto.quantity) &&
        Objects.equals(this.providerId, vendorItemSkuDto.providerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skuId, quantity, providerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorItemSkuDto {\n");
    
    sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
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

  public static VendorItemSkuDtoBuilder builder() {
    return new VendorItemSkuDtoBuilder();
  }

  public static class VendorItemSkuDtoBuilder {

    private Long skuId = null;
    private Integer quantity = null;
    private String providerId = null;
    

    VendorItemSkuDtoBuilder() {
    }

    /**
     **/
    public VendorItemSkuDtoBuilder skuId(Long skuId) {
      this.skuId = skuId;
      return this;
    }

    /**
     **/
    public VendorItemSkuDtoBuilder quantity(Integer quantity) {
      this.quantity = quantity;
      return this;
    }

    /**
     **/
    public VendorItemSkuDtoBuilder providerId(String providerId) {
      this.providerId = providerId;
      return this;
    }


    public VendorItemSkuDto build() {
      VendorItemSkuDto vendorItemSkuDto = new VendorItemSkuDto();
      vendorItemSkuDto.setSkuId(this.skuId);
      vendorItemSkuDto.setQuantity(this.quantity);
      vendorItemSkuDto.setProviderId(this.providerId);
      return vendorItemSkuDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VendorItemSkuDtoBuilder {\n");
      
      sb.append("    skuId: ").append(toIndentedString(skuId)).append("\n");
      sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
      sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
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

