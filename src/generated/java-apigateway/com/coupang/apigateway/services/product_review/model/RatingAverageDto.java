package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class RatingAverageDto   {
  
  private Boolean surveyAvailable = null;
  private Boolean reviewAvailable = null;
  private Long ratingCount = null;
  private Double ratingAverage = null;
  private Boolean ratingAvailable = null;
  private String productName = null;
  private Long productId = null;
  private Boolean isReviewCategory = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("surveyAvailable")
  @com.fasterxml.jackson.annotation.JsonProperty("surveyAvailable")
  public Boolean getSurveyAvailable() {
    return surveyAvailable;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isSurveyAvailable() {
    return surveyAvailable == null ? false : surveyAvailable;
  }
  
  /**
   **/
  public void setSurveyAvailable(Boolean surveyAvailable) {
    this.surveyAvailable = surveyAvailable;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewAvailable")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewAvailable")
  public Boolean getReviewAvailable() {
    return reviewAvailable;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isReviewAvailable() {
    return reviewAvailable == null ? false : reviewAvailable;
  }
  
  /**
   **/
  public void setReviewAvailable(Boolean reviewAvailable) {
    this.reviewAvailable = reviewAvailable;
  }
  
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
  @org.codehaus.jackson.annotate.JsonProperty("ratingAvailable")
  @com.fasterxml.jackson.annotation.JsonProperty("ratingAvailable")
  public Boolean getRatingAvailable() {
    return ratingAvailable;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isRatingAvailable() {
    return ratingAvailable == null ? false : ratingAvailable;
  }
  
  /**
   **/
  public void setRatingAvailable(Boolean ratingAvailable) {
    this.ratingAvailable = ratingAvailable;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("productName")
  @com.fasterxml.jackson.annotation.JsonProperty("productName")
  public String getProductName() {
    return productName;
  }
  
  /**
   **/
  public void setProductName(String productName) {
    this.productName = productName;
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
  @org.codehaus.jackson.annotate.JsonProperty("isReviewCategory")
  @com.fasterxml.jackson.annotation.JsonProperty("isReviewCategory")
  public Boolean getIsReviewCategory() {
    return isReviewCategory;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isIsReviewCategory() {
    return isReviewCategory == null ? false : isReviewCategory;
  }
  
  /**
   **/
  public void setIsReviewCategory(Boolean isReviewCategory) {
    this.isReviewCategory = isReviewCategory;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatingAverageDto ratingAverageDto = (RatingAverageDto) o;
    return Objects.equals(this.surveyAvailable, ratingAverageDto.surveyAvailable) &&
        Objects.equals(this.reviewAvailable, ratingAverageDto.reviewAvailable) &&
        Objects.equals(this.ratingCount, ratingAverageDto.ratingCount) &&
        Objects.equals(this.ratingAverage, ratingAverageDto.ratingAverage) &&
        Objects.equals(this.ratingAvailable, ratingAverageDto.ratingAvailable) &&
        Objects.equals(this.productName, ratingAverageDto.productName) &&
        Objects.equals(this.productId, ratingAverageDto.productId) &&
        Objects.equals(this.isReviewCategory, ratingAverageDto.isReviewCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surveyAvailable, reviewAvailable, ratingCount, ratingAverage, ratingAvailable, productName, productId, isReviewCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingAverageDto {\n");
    
    sb.append("    surveyAvailable: ").append(toIndentedString(surveyAvailable)).append("\n");
    sb.append("    reviewAvailable: ").append(toIndentedString(reviewAvailable)).append("\n");
    sb.append("    ratingCount: ").append(toIndentedString(ratingCount)).append("\n");
    sb.append("    ratingAverage: ").append(toIndentedString(ratingAverage)).append("\n");
    sb.append("    ratingAvailable: ").append(toIndentedString(ratingAvailable)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    isReviewCategory: ").append(toIndentedString(isReviewCategory)).append("\n");
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

  public static RatingAverageDtoBuilder builder() {
    return new RatingAverageDtoBuilder();
  }

  public static class RatingAverageDtoBuilder {

    private Boolean surveyAvailable = null;
    private Boolean reviewAvailable = null;
    private Long ratingCount = null;
    private Double ratingAverage = null;
    private Boolean ratingAvailable = null;
    private String productName = null;
    private Long productId = null;
    private Boolean isReviewCategory = null;
    

    RatingAverageDtoBuilder() {
    }

    /**
     **/
    public RatingAverageDtoBuilder surveyAvailable(Boolean surveyAvailable) {
      this.surveyAvailable = surveyAvailable;
      return this;
    }

    /**
     **/
    public RatingAverageDtoBuilder reviewAvailable(Boolean reviewAvailable) {
      this.reviewAvailable = reviewAvailable;
      return this;
    }

    /**
     **/
    public RatingAverageDtoBuilder ratingCount(Long ratingCount) {
      this.ratingCount = ratingCount;
      return this;
    }

    /**
     **/
    public RatingAverageDtoBuilder ratingAverage(Double ratingAverage) {
      this.ratingAverage = ratingAverage;
      return this;
    }

    /**
     **/
    public RatingAverageDtoBuilder ratingAvailable(Boolean ratingAvailable) {
      this.ratingAvailable = ratingAvailable;
      return this;
    }

    /**
     **/
    public RatingAverageDtoBuilder productName(String productName) {
      this.productName = productName;
      return this;
    }

    /**
     **/
    public RatingAverageDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public RatingAverageDtoBuilder isReviewCategory(Boolean isReviewCategory) {
      this.isReviewCategory = isReviewCategory;
      return this;
    }


    public RatingAverageDto build() {
      RatingAverageDto ratingAverageDto = new RatingAverageDto();
      ratingAverageDto.setSurveyAvailable(this.surveyAvailable);
      ratingAverageDto.setReviewAvailable(this.reviewAvailable);
      ratingAverageDto.setRatingCount(this.ratingCount);
      ratingAverageDto.setRatingAverage(this.ratingAverage);
      ratingAverageDto.setRatingAvailable(this.ratingAvailable);
      ratingAverageDto.setProductName(this.productName);
      ratingAverageDto.setProductId(this.productId);
      ratingAverageDto.setIsReviewCategory(this.isReviewCategory);
      return ratingAverageDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RatingAverageDtoBuilder {\n");
      
      sb.append("    surveyAvailable: ").append(toIndentedString(surveyAvailable)).append("\n");
      sb.append("    reviewAvailable: ").append(toIndentedString(reviewAvailable)).append("\n");
      sb.append("    ratingCount: ").append(toIndentedString(ratingCount)).append("\n");
      sb.append("    ratingAverage: ").append(toIndentedString(ratingAverage)).append("\n");
      sb.append("    ratingAvailable: ").append(toIndentedString(ratingAvailable)).append("\n");
      sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    isReviewCategory: ").append(toIndentedString(isReviewCategory)).append("\n");
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

