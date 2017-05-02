package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class ProductDetailNoticeContentDto   {
  
  private Map<String, String> noticeContents = new HashMap<String, String>();
  private String categoryName = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("noticeContents")
  @com.fasterxml.jackson.annotation.JsonProperty("noticeContents")
  public Map<String, String> getNoticeContents() {
    return noticeContents;
  }
  
  /**
   **/
  public void setNoticeContents(Map<String, String> noticeContents) {
    this.noticeContents = noticeContents;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("categoryName")
  @com.fasterxml.jackson.annotation.JsonProperty("categoryName")
  public String getCategoryName() {
    return categoryName;
  }
  
  /**
   **/
  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDetailNoticeContentDto productDetailNoticeContentDto = (ProductDetailNoticeContentDto) o;
    return Objects.equals(this.noticeContents, productDetailNoticeContentDto.noticeContents) &&
        Objects.equals(this.categoryName, productDetailNoticeContentDto.categoryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(noticeContents, categoryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDetailNoticeContentDto {\n");
    
    sb.append("    noticeContents: ").append(toIndentedString(noticeContents)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
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

  public static ProductDetailNoticeContentDtoBuilder builder() {
    return new ProductDetailNoticeContentDtoBuilder();
  }

  public static class ProductDetailNoticeContentDtoBuilder {

    private Map<String, String> noticeContents = new HashMap<String, String>();
    private String categoryName = null;
    

    ProductDetailNoticeContentDtoBuilder() {
    }

    /**
     **/
    public ProductDetailNoticeContentDtoBuilder noticeContents(Map<String, String> noticeContents) {
      this.noticeContents = noticeContents;
      return this;
    }

    /**
     **/
    public ProductDetailNoticeContentDtoBuilder categoryName(String categoryName) {
      this.categoryName = categoryName;
      return this;
    }


    public ProductDetailNoticeContentDto build() {
      ProductDetailNoticeContentDto productDetailNoticeContentDto = new ProductDetailNoticeContentDto();
      productDetailNoticeContentDto.setNoticeContents(this.noticeContents);
      productDetailNoticeContentDto.setCategoryName(this.categoryName);
      return productDetailNoticeContentDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ProductDetailNoticeContentDtoBuilder {\n");
      
      sb.append("    noticeContents: ").append(toIndentedString(noticeContents)).append("\n");
      sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
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

