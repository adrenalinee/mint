package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.RatingSummaryTotalDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ReviewCategoryDto   {
  
  private Boolean surveyAvailable = null;
  private Long reviewCategoryId = null;
  private Boolean reviewAvailable = null;
  private RatingSummaryTotalDto ratingSummaryTotal = null;
  private Boolean ratingAvailable = null;
  private Long productId = null;
  private Boolean isReviewCategory = null;
  private Boolean completedOrderOnly = null;
  private Long categoryId = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("reviewCategoryId")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewCategoryId")
  public Long getReviewCategoryId() {
    return reviewCategoryId;
  }
  
  /**
   **/
  public void setReviewCategoryId(Long reviewCategoryId) {
    this.reviewCategoryId = reviewCategoryId;
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
  @org.codehaus.jackson.annotate.JsonProperty("ratingSummaryTotal")
  @com.fasterxml.jackson.annotation.JsonProperty("ratingSummaryTotal")
  public RatingSummaryTotalDto getRatingSummaryTotal() {
    return ratingSummaryTotal;
  }
  
  /**
   **/
  public void setRatingSummaryTotal(RatingSummaryTotalDto ratingSummaryTotal) {
    this.ratingSummaryTotal = ratingSummaryTotal;
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
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("completedOrderOnly")
  @com.fasterxml.jackson.annotation.JsonProperty("completedOrderOnly")
  public Boolean getCompletedOrderOnly() {
    return completedOrderOnly;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isCompletedOrderOnly() {
    return completedOrderOnly == null ? false : completedOrderOnly;
  }
  
  /**
   **/
  public void setCompletedOrderOnly(Boolean completedOrderOnly) {
    this.completedOrderOnly = completedOrderOnly;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("categoryId")
  @com.fasterxml.jackson.annotation.JsonProperty("categoryId")
  public Long getCategoryId() {
    return categoryId;
  }
  
  /**
   **/
  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewCategoryDto reviewCategoryDto = (ReviewCategoryDto) o;
    return Objects.equals(this.surveyAvailable, reviewCategoryDto.surveyAvailable) &&
        Objects.equals(this.reviewCategoryId, reviewCategoryDto.reviewCategoryId) &&
        Objects.equals(this.reviewAvailable, reviewCategoryDto.reviewAvailable) &&
        Objects.equals(this.ratingSummaryTotal, reviewCategoryDto.ratingSummaryTotal) &&
        Objects.equals(this.ratingAvailable, reviewCategoryDto.ratingAvailable) &&
        Objects.equals(this.productId, reviewCategoryDto.productId) &&
        Objects.equals(this.isReviewCategory, reviewCategoryDto.isReviewCategory) &&
        Objects.equals(this.completedOrderOnly, reviewCategoryDto.completedOrderOnly) &&
        Objects.equals(this.categoryId, reviewCategoryDto.categoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surveyAvailable, reviewCategoryId, reviewAvailable, ratingSummaryTotal, ratingAvailable, productId, isReviewCategory, completedOrderOnly, categoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewCategoryDto {\n");
    
    sb.append("    surveyAvailable: ").append(toIndentedString(surveyAvailable)).append("\n");
    sb.append("    reviewCategoryId: ").append(toIndentedString(reviewCategoryId)).append("\n");
    sb.append("    reviewAvailable: ").append(toIndentedString(reviewAvailable)).append("\n");
    sb.append("    ratingSummaryTotal: ").append(toIndentedString(ratingSummaryTotal)).append("\n");
    sb.append("    ratingAvailable: ").append(toIndentedString(ratingAvailable)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    isReviewCategory: ").append(toIndentedString(isReviewCategory)).append("\n");
    sb.append("    completedOrderOnly: ").append(toIndentedString(completedOrderOnly)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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

  public static ReviewCategoryDtoBuilder builder() {
    return new ReviewCategoryDtoBuilder();
  }

  public static class ReviewCategoryDtoBuilder {

    private Boolean surveyAvailable = null;
    private Long reviewCategoryId = null;
    private Boolean reviewAvailable = null;
    private RatingSummaryTotalDto ratingSummaryTotal = null;
    private Boolean ratingAvailable = null;
    private Long productId = null;
    private Boolean isReviewCategory = null;
    private Boolean completedOrderOnly = null;
    private Long categoryId = null;
    

    ReviewCategoryDtoBuilder() {
    }

    /**
     **/
    public ReviewCategoryDtoBuilder surveyAvailable(Boolean surveyAvailable) {
      this.surveyAvailable = surveyAvailable;
      return this;
    }

    /**
     **/
    public ReviewCategoryDtoBuilder reviewCategoryId(Long reviewCategoryId) {
      this.reviewCategoryId = reviewCategoryId;
      return this;
    }

    /**
     **/
    public ReviewCategoryDtoBuilder reviewAvailable(Boolean reviewAvailable) {
      this.reviewAvailable = reviewAvailable;
      return this;
    }

    /**
     **/
    public ReviewCategoryDtoBuilder ratingSummaryTotal(RatingSummaryTotalDto ratingSummaryTotal) {
      this.ratingSummaryTotal = ratingSummaryTotal;
      return this;
    }

    /**
     **/
    public ReviewCategoryDtoBuilder ratingAvailable(Boolean ratingAvailable) {
      this.ratingAvailable = ratingAvailable;
      return this;
    }

    /**
     **/
    public ReviewCategoryDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public ReviewCategoryDtoBuilder isReviewCategory(Boolean isReviewCategory) {
      this.isReviewCategory = isReviewCategory;
      return this;
    }

    /**
     **/
    public ReviewCategoryDtoBuilder completedOrderOnly(Boolean completedOrderOnly) {
      this.completedOrderOnly = completedOrderOnly;
      return this;
    }

    /**
     **/
    public ReviewCategoryDtoBuilder categoryId(Long categoryId) {
      this.categoryId = categoryId;
      return this;
    }


    public ReviewCategoryDto build() {
      ReviewCategoryDto reviewCategoryDto = new ReviewCategoryDto();
      reviewCategoryDto.setSurveyAvailable(this.surveyAvailable);
      reviewCategoryDto.setReviewCategoryId(this.reviewCategoryId);
      reviewCategoryDto.setReviewAvailable(this.reviewAvailable);
      reviewCategoryDto.setRatingSummaryTotal(this.ratingSummaryTotal);
      reviewCategoryDto.setRatingAvailable(this.ratingAvailable);
      reviewCategoryDto.setProductId(this.productId);
      reviewCategoryDto.setIsReviewCategory(this.isReviewCategory);
      reviewCategoryDto.setCompletedOrderOnly(this.completedOrderOnly);
      reviewCategoryDto.setCategoryId(this.categoryId);
      return reviewCategoryDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReviewCategoryDtoBuilder {\n");
      
      sb.append("    surveyAvailable: ").append(toIndentedString(surveyAvailable)).append("\n");
      sb.append("    reviewCategoryId: ").append(toIndentedString(reviewCategoryId)).append("\n");
      sb.append("    reviewAvailable: ").append(toIndentedString(reviewAvailable)).append("\n");
      sb.append("    ratingSummaryTotal: ").append(toIndentedString(ratingSummaryTotal)).append("\n");
      sb.append("    ratingAvailable: ").append(toIndentedString(ratingAvailable)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    isReviewCategory: ").append(toIndentedString(isReviewCategory)).append("\n");
      sb.append("    completedOrderOnly: ").append(toIndentedString(completedOrderOnly)).append("\n");
      sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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

