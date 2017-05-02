package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class SimpleRatingAverageDto   {
  
  private Long ratingCount = null;
  private Double ratingAverage = null;
  private Long productId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("ratingCount")
  @com.fasterxml.jackson.annotation.JsonProperty("ratingCount")
  public Long getRatingCount() {
    return ratingCount;
  }
  
  /**
   **/
  public void setRatingCount(Long ratingCount) {
    this.ratingCount = ratingCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("ratingAverage")
  @com.fasterxml.jackson.annotation.JsonProperty("ratingAverage")
  public Double getRatingAverage() {
    return ratingAverage;
  }
  
  /**
   **/
  public void setRatingAverage(Double ratingAverage) {
    this.ratingAverage = ratingAverage;
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
    SimpleRatingAverageDto simpleRatingAverageDto = (SimpleRatingAverageDto) o;
    return Objects.equals(this.ratingCount, simpleRatingAverageDto.ratingCount) &&
        Objects.equals(this.ratingAverage, simpleRatingAverageDto.ratingAverage) &&
        Objects.equals(this.productId, simpleRatingAverageDto.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratingCount, ratingAverage, productId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleRatingAverageDto {\n");
    
    sb.append("    ratingCount: ").append(toIndentedString(ratingCount)).append("\n");
    sb.append("    ratingAverage: ").append(toIndentedString(ratingAverage)).append("\n");
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

  public static SimpleRatingAverageDtoBuilder builder() {
    return new SimpleRatingAverageDtoBuilder();
  }

  public static class SimpleRatingAverageDtoBuilder {

    private Long ratingCount = null;
    private Double ratingAverage = null;
    private Long productId = null;
    

    SimpleRatingAverageDtoBuilder() {
    }

    /**
     **/
    public SimpleRatingAverageDtoBuilder ratingCount(Long ratingCount) {
      this.ratingCount = ratingCount;
      return this;
    }

    /**
     **/
    public SimpleRatingAverageDtoBuilder ratingAverage(Double ratingAverage) {
      this.ratingAverage = ratingAverage;
      return this;
    }

    /**
     **/
    public SimpleRatingAverageDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }


    public SimpleRatingAverageDto build() {
      SimpleRatingAverageDto simpleRatingAverageDto = new SimpleRatingAverageDto();
      simpleRatingAverageDto.setRatingCount(this.ratingCount);
      simpleRatingAverageDto.setRatingAverage(this.ratingAverage);
      simpleRatingAverageDto.setProductId(this.productId);
      return simpleRatingAverageDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SimpleRatingAverageDtoBuilder {\n");
      
      sb.append("    ratingCount: ").append(toIndentedString(ratingCount)).append("\n");
      sb.append("    ratingAverage: ").append(toIndentedString(ratingAverage)).append("\n");
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

