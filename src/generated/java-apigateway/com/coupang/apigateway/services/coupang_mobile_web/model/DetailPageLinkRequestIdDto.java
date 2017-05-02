package com.coupang.apigateway.services.coupang_mobile_web.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.807+09:00")
public class DetailPageLinkRequestIdDto   {
  
  private Long vendorItemId = null;
  private Long productId = null;
  private Long dealId = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("dealId")
  @com.fasterxml.jackson.annotation.JsonProperty("dealId")
  public Long getDealId() {
    return dealId;
  }
  
  /**
   **/
  public void setDealId(Long dealId) {
    this.dealId = dealId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailPageLinkRequestIdDto detailPageLinkRequestIdDto = (DetailPageLinkRequestIdDto) o;
    return Objects.equals(this.vendorItemId, detailPageLinkRequestIdDto.vendorItemId) &&
        Objects.equals(this.productId, detailPageLinkRequestIdDto.productId) &&
        Objects.equals(this.dealId, detailPageLinkRequestIdDto.dealId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemId, productId, dealId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailPageLinkRequestIdDto {\n");
    
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
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

  public static DetailPageLinkRequestIdDtoBuilder builder() {
    return new DetailPageLinkRequestIdDtoBuilder();
  }

  public static class DetailPageLinkRequestIdDtoBuilder {

    private Long vendorItemId = null;
    private Long productId = null;
    private Long dealId = null;
    

    DetailPageLinkRequestIdDtoBuilder() {
    }

    /**
     **/
    public DetailPageLinkRequestIdDtoBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public DetailPageLinkRequestIdDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public DetailPageLinkRequestIdDtoBuilder dealId(Long dealId) {
      this.dealId = dealId;
      return this;
    }


    public DetailPageLinkRequestIdDto build() {
      DetailPageLinkRequestIdDto detailPageLinkRequestIdDto = new DetailPageLinkRequestIdDto();
      detailPageLinkRequestIdDto.setVendorItemId(this.vendorItemId);
      detailPageLinkRequestIdDto.setProductId(this.productId);
      detailPageLinkRequestIdDto.setDealId(this.dealId);
      return detailPageLinkRequestIdDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DetailPageLinkRequestIdDtoBuilder {\n");
      
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    dealId: ").append(toIndentedString(dealId)).append("\n");
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

