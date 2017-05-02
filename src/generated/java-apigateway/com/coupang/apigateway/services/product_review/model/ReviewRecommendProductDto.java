package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ReviewRecommendProductDto   {
  
  private String reviewerImageUrl = null;
  private Long reviewId = null;
  private Integer rating = null;
  private String productName = null;
  private Long productId = null;
  private Long price = null;
  private String displayName = null;
  private String contentSummary = null;
  private String content = null;
  private String categoryDisplayImageUrl = null;


  public enum CategoryDisplayImageTypeEnum {
    PRODUCT("PRODUCT"),
    UPLOAD("UPLOAD");

    private String value;

    CategoryDisplayImageTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private CategoryDisplayImageTypeEnum categoryDisplayImageType = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewerImageUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewerImageUrl")
  public String getReviewerImageUrl() {
    return reviewerImageUrl;
  }
  
  /**
   **/
  public void setReviewerImageUrl(String reviewerImageUrl) {
    this.reviewerImageUrl = reviewerImageUrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewId")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewId")
  public Long getReviewId() {
    return reviewId;
  }
  
  /**
   **/
  public void setReviewId(Long reviewId) {
    this.reviewId = reviewId;
  }
  
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
  @org.codehaus.jackson.annotate.JsonProperty("price")
  @com.fasterxml.jackson.annotation.JsonProperty("price")
  public Long getPrice() {
    return price;
  }
  
  /**
   **/
  public void setPrice(Long price) {
    this.price = price;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displayName")
  @com.fasterxml.jackson.annotation.JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  
  /**
   **/
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("contentSummary")
  @com.fasterxml.jackson.annotation.JsonProperty("contentSummary")
  public String getContentSummary() {
    return contentSummary;
  }
  
  /**
   **/
  public void setContentSummary(String contentSummary) {
    this.contentSummary = contentSummary;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("content")
  @com.fasterxml.jackson.annotation.JsonProperty("content")
  public String getContent() {
    return content;
  }
  
  /**
   **/
  public void setContent(String content) {
    this.content = content;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("categoryDisplayImageUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("categoryDisplayImageUrl")
  public String getCategoryDisplayImageUrl() {
    return categoryDisplayImageUrl;
  }
  
  /**
   **/
  public void setCategoryDisplayImageUrl(String categoryDisplayImageUrl) {
    this.categoryDisplayImageUrl = categoryDisplayImageUrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("categoryDisplayImageType")
  @com.fasterxml.jackson.annotation.JsonProperty("categoryDisplayImageType")
  public CategoryDisplayImageTypeEnum getCategoryDisplayImageType() {
    return categoryDisplayImageType;
  }
  
  /**
   **/
  public void setCategoryDisplayImageType(CategoryDisplayImageTypeEnum categoryDisplayImageType) {
    this.categoryDisplayImageType = categoryDisplayImageType;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewRecommendProductDto reviewRecommendProductDto = (ReviewRecommendProductDto) o;
    return Objects.equals(this.reviewerImageUrl, reviewRecommendProductDto.reviewerImageUrl) &&
        Objects.equals(this.reviewId, reviewRecommendProductDto.reviewId) &&
        Objects.equals(this.rating, reviewRecommendProductDto.rating) &&
        Objects.equals(this.productName, reviewRecommendProductDto.productName) &&
        Objects.equals(this.productId, reviewRecommendProductDto.productId) &&
        Objects.equals(this.price, reviewRecommendProductDto.price) &&
        Objects.equals(this.displayName, reviewRecommendProductDto.displayName) &&
        Objects.equals(this.contentSummary, reviewRecommendProductDto.contentSummary) &&
        Objects.equals(this.content, reviewRecommendProductDto.content) &&
        Objects.equals(this.categoryDisplayImageUrl, reviewRecommendProductDto.categoryDisplayImageUrl) &&
        Objects.equals(this.categoryDisplayImageType, reviewRecommendProductDto.categoryDisplayImageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewerImageUrl, reviewId, rating, productName, productId, price, displayName, contentSummary, content, categoryDisplayImageUrl, categoryDisplayImageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewRecommendProductDto {\n");
    
    sb.append("    reviewerImageUrl: ").append(toIndentedString(reviewerImageUrl)).append("\n");
    sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    contentSummary: ").append(toIndentedString(contentSummary)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    categoryDisplayImageUrl: ").append(toIndentedString(categoryDisplayImageUrl)).append("\n");
    sb.append("    categoryDisplayImageType: ").append(toIndentedString(categoryDisplayImageType)).append("\n");
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

  public static ReviewRecommendProductDtoBuilder builder() {
    return new ReviewRecommendProductDtoBuilder();
  }

  public static class ReviewRecommendProductDtoBuilder {

    private String reviewerImageUrl = null;
    private Long reviewId = null;
    private Integer rating = null;
    private String productName = null;
    private Long productId = null;
    private Long price = null;
    private String displayName = null;
    private String contentSummary = null;
    private String content = null;
    private String categoryDisplayImageUrl = null;
    private CategoryDisplayImageTypeEnum categoryDisplayImageType = null;
    

    ReviewRecommendProductDtoBuilder() {
    }

    /**
     **/
    public ReviewRecommendProductDtoBuilder reviewerImageUrl(String reviewerImageUrl) {
      this.reviewerImageUrl = reviewerImageUrl;
      return this;
    }

    /**
     **/
    public ReviewRecommendProductDtoBuilder reviewId(Long reviewId) {
      this.reviewId = reviewId;
      return this;
    }

    /**
     **/
    public ReviewRecommendProductDtoBuilder rating(Integer rating) {
      this.rating = rating;
      return this;
    }

    /**
     **/
    public ReviewRecommendProductDtoBuilder productName(String productName) {
      this.productName = productName;
      return this;
    }

    /**
     **/
    public ReviewRecommendProductDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public ReviewRecommendProductDtoBuilder price(Long price) {
      this.price = price;
      return this;
    }

    /**
     **/
    public ReviewRecommendProductDtoBuilder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     **/
    public ReviewRecommendProductDtoBuilder contentSummary(String contentSummary) {
      this.contentSummary = contentSummary;
      return this;
    }

    /**
     **/
    public ReviewRecommendProductDtoBuilder content(String content) {
      this.content = content;
      return this;
    }

    /**
     **/
    public ReviewRecommendProductDtoBuilder categoryDisplayImageUrl(String categoryDisplayImageUrl) {
      this.categoryDisplayImageUrl = categoryDisplayImageUrl;
      return this;
    }

    /**
     **/
    public ReviewRecommendProductDtoBuilder categoryDisplayImageType(CategoryDisplayImageTypeEnum categoryDisplayImageType) {
      this.categoryDisplayImageType = categoryDisplayImageType;
      return this;
    }


    public ReviewRecommendProductDto build() {
      ReviewRecommendProductDto reviewRecommendProductDto = new ReviewRecommendProductDto();
      reviewRecommendProductDto.setReviewerImageUrl(this.reviewerImageUrl);
      reviewRecommendProductDto.setReviewId(this.reviewId);
      reviewRecommendProductDto.setRating(this.rating);
      reviewRecommendProductDto.setProductName(this.productName);
      reviewRecommendProductDto.setProductId(this.productId);
      reviewRecommendProductDto.setPrice(this.price);
      reviewRecommendProductDto.setDisplayName(this.displayName);
      reviewRecommendProductDto.setContentSummary(this.contentSummary);
      reviewRecommendProductDto.setContent(this.content);
      reviewRecommendProductDto.setCategoryDisplayImageUrl(this.categoryDisplayImageUrl);
      reviewRecommendProductDto.setCategoryDisplayImageType(this.categoryDisplayImageType);
      return reviewRecommendProductDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReviewRecommendProductDtoBuilder {\n");
      
      sb.append("    reviewerImageUrl: ").append(toIndentedString(reviewerImageUrl)).append("\n");
      sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
      sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
      sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    price: ").append(toIndentedString(price)).append("\n");
      sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
      sb.append("    contentSummary: ").append(toIndentedString(contentSummary)).append("\n");
      sb.append("    content: ").append(toIndentedString(content)).append("\n");
      sb.append("    categoryDisplayImageUrl: ").append(toIndentedString(categoryDisplayImageUrl)).append("\n");
      sb.append("    categoryDisplayImageType: ").append(toIndentedString(categoryDisplayImageType)).append("\n");
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

