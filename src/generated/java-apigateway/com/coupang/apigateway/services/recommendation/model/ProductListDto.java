package com.coupang.apigateway.services.recommendation.model;

import java.util.Objects;
import com.coupang.apigateway.services.recommendation.model.ProductDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.742+09:00")
public class ProductListDto   {
  
  private String tracking = null;
  private List<ProductDto> productList = new ArrayList<ProductDto>();

  
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
  @org.codehaus.jackson.annotate.JsonProperty("productList")
  @com.fasterxml.jackson.annotation.JsonProperty("productList")
  public List<ProductDto> getProductList() {
    return productList;
  }
  
  /**
   **/
  public void setProductList(List<ProductDto> productList) {
    this.productList = productList;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductListDto productListDto = (ProductListDto) o;
    return Objects.equals(this.tracking, productListDto.tracking) &&
        Objects.equals(this.productList, productListDto.productList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tracking, productList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductListDto {\n");
    
    sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
    sb.append("    productList: ").append(toIndentedString(productList)).append("\n");
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

  public static ProductListDtoBuilder builder() {
    return new ProductListDtoBuilder();
  }

  public static class ProductListDtoBuilder {

    private String tracking = null;
    private List<ProductDto> productList = new ArrayList<ProductDto>();
    

    ProductListDtoBuilder() {
    }

    /**
     **/
    public ProductListDtoBuilder tracking(String tracking) {
      this.tracking = tracking;
      return this;
    }

    /**
     **/
    public ProductListDtoBuilder productList(List<ProductDto> productList) {
      this.productList = productList;
      return this;
    }


    public ProductListDto build() {
      ProductListDto productListDto = new ProductListDto();
      productListDto.setTracking(this.tracking);
      productListDto.setProductList(this.productList);
      return productListDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ProductListDtoBuilder {\n");
      
      sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
      sb.append("    productList: ").append(toIndentedString(productList)).append("\n");
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

