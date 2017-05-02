package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class RatingSummaryDto   {
  
  private Integer rating = null;
  private Long productId = null;
  private Integer percentage = null;
  private Long id = null;
  private Long count = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("rating")
  @com.fasterxml.jackson.annotation.JsonProperty("rating")
  public Integer getRating() {
    return rating;
  }
  
  /**
   **/
  public void setRating(Integer rating) {
    this.rating = rating;
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
  @org.codehaus.jackson.annotate.JsonProperty("percentage")
  @com.fasterxml.jackson.annotation.JsonProperty("percentage")
  public Integer getPercentage() {
    return percentage;
  }
  
  /**
   **/
  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("id")
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  public Long getId() {
    return id;
  }
  
  /**
   **/
  public void setId(Long id) {
    this.id = id;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("count")
  @com.fasterxml.jackson.annotation.JsonProperty("count")
  public Long getCount() {
    return count;
  }
  
  /**
   **/
  public void setCount(Long count) {
    this.count = count;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatingSummaryDto ratingSummaryDto = (RatingSummaryDto) o;
    return Objects.equals(this.rating, ratingSummaryDto.rating) &&
        Objects.equals(this.productId, ratingSummaryDto.productId) &&
        Objects.equals(this.percentage, ratingSummaryDto.percentage) &&
        Objects.equals(this.id, ratingSummaryDto.id) &&
        Objects.equals(this.count, ratingSummaryDto.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rating, productId, percentage, id, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingSummaryDto {\n");
    
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

  public static RatingSummaryDtoBuilder builder() {
    return new RatingSummaryDtoBuilder();
  }

  public static class RatingSummaryDtoBuilder {

    private Integer rating = null;
    private Long productId = null;
    private Integer percentage = null;
    private Long id = null;
    private Long count = null;
    

    RatingSummaryDtoBuilder() {
    }

    /**
     **/
    public RatingSummaryDtoBuilder rating(Integer rating) {
      this.rating = rating;
      return this;
    }

    /**
     **/
    public RatingSummaryDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public RatingSummaryDtoBuilder percentage(Integer percentage) {
      this.percentage = percentage;
      return this;
    }

    /**
     **/
    public RatingSummaryDtoBuilder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public RatingSummaryDtoBuilder count(Long count) {
      this.count = count;
      return this;
    }


    public RatingSummaryDto build() {
      RatingSummaryDto ratingSummaryDto = new RatingSummaryDto();
      ratingSummaryDto.setRating(this.rating);
      ratingSummaryDto.setProductId(this.productId);
      ratingSummaryDto.setPercentage(this.percentage);
      ratingSummaryDto.setId(this.id);
      ratingSummaryDto.setCount(this.count);
      return ratingSummaryDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RatingSummaryDtoBuilder {\n");
      
      sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

