package com.coupang.apigateway.services.recommendation.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.742+09:00")
public class ProductDto   {
  
  private String tracking = null;
  private String productType = null;
  private Long productId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("tracking")
  @com.fasterxml.jackson.annotation.JsonProperty("tracking")
  public String getTracking() {
    return tracking;
  }
  
  /**
   **/
  public void setTracking(String tracking) {
    this.tracking = tracking;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("productType")
  @com.fasterxml.jackson.annotation.JsonProperty("productType")
  public String getProductType() {
    return productType;
  }
  
  /**
   **/
  public void setProductType(String productType) {
    this.productType = productType;
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDto productDto = (ProductDto) o;
    return Objects.equals(this.tracking, productDto.tracking) &&
        Objects.equals(this.productType, productDto.productType) &&
        Objects.equals(this.productId, productDto.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tracking, productType, productId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDto {\n");
    
    sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

  public static ProductDtoBuilder builder() {
    return new ProductDtoBuilder();
  }

  public static class ProductDtoBuilder {

    private String tracking = null;
    private String productType = null;
    private Long productId = null;
    

    ProductDtoBuilder() {
    }

    /**
     **/
    public ProductDtoBuilder tracking(String tracking) {
      this.tracking = tracking;
      return this;
    }

    /**
     **/
    public ProductDtoBuilder productType(String productType) {
      this.productType = productType;
      return this;
    }

    /**
     **/
    public ProductDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }


    public ProductDto build() {
      ProductDto productDto = new ProductDto();
      productDto.setTracking(this.tracking);
      productDto.setProductType(this.productType);
      productDto.setProductId(this.productId);
      return productDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ProductDtoBuilder {\n");
      
      sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
      sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

