package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ReviewHelpfulCountDto   {
  
  private Long reviewId = null;
  private Integer helpfulTrueCount = null;
  private Integer helpfulFalseCount = null;
  private Integer helpfulCount = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("helpfulTrueCount")
  @com.fasterxml.jackson.annotation.JsonProperty("helpfulTrueCount")
  public Integer getHelpfulTrueCount() {
    return helpfulTrueCount;
  }
  
  /**
   **/
  public void setHelpfulTrueCount(Integer helpfulTrueCount) {
    this.helpfulTrueCount = helpfulTrueCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("helpfulFalseCount")
  @com.fasterxml.jackson.annotation.JsonProperty("helpfulFalseCount")
  public Integer getHelpfulFalseCount() {
    return helpfulFalseCount;
  }
  
  /**
   **/
  public void setHelpfulFalseCount(Integer helpfulFalseCount) {
    this.helpfulFalseCount = helpfulFalseCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("helpfulCount")
  @com.fasterxml.jackson.annotation.JsonProperty("helpfulCount")
  public Integer getHelpfulCount() {
    return helpfulCount;
  }
  
  /**
   **/
  public void setHelpfulCount(Integer helpfulCount) {
    this.helpfulCount = helpfulCount;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewHelpfulCountDto reviewHelpfulCountDto = (ReviewHelpfulCountDto) o;
    return Objects.equals(this.reviewId, reviewHelpfulCountDto.reviewId) &&
        Objects.equals(this.helpfulTrueCount, reviewHelpfulCountDto.helpfulTrueCount) &&
        Objects.equals(this.helpfulFalseCount, reviewHelpfulCountDto.helpfulFalseCount) &&
        Objects.equals(this.helpfulCount, reviewHelpfulCountDto.helpfulCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewId, helpfulTrueCount, helpfulFalseCount, helpfulCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewHelpfulCountDto {\n");
    
    sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
    sb.append("    helpfulTrueCount: ").append(toIndentedString(helpfulTrueCount)).append("\n");
    sb.append("    helpfulFalseCount: ").append(toIndentedString(helpfulFalseCount)).append("\n");
    sb.append("    helpfulCount: ").append(toIndentedString(helpfulCount)).append("\n");
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

  public static ReviewHelpfulCountDtoBuilder builder() {
    return new ReviewHelpfulCountDtoBuilder();
  }

  public static class ReviewHelpfulCountDtoBuilder {

    private Long reviewId = null;
    private Integer helpfulTrueCount = null;
    private Integer helpfulFalseCount = null;
    private Integer helpfulCount = null;
    

    ReviewHelpfulCountDtoBuilder() {
    }

    /**
     **/
    public ReviewHelpfulCountDtoBuilder reviewId(Long reviewId) {
      this.reviewId = reviewId;
      return this;
    }

    /**
     **/
    public ReviewHelpfulCountDtoBuilder helpfulTrueCount(Integer helpfulTrueCount) {
      this.helpfulTrueCount = helpfulTrueCount;
      return this;
    }

    /**
     **/
    public ReviewHelpfulCountDtoBuilder helpfulFalseCount(Integer helpfulFalseCount) {
      this.helpfulFalseCount = helpfulFalseCount;
      return this;
    }

    /**
     **/
    public ReviewHelpfulCountDtoBuilder helpfulCount(Integer helpfulCount) {
      this.helpfulCount = helpfulCount;
      return this;
    }


    public ReviewHelpfulCountDto build() {
      ReviewHelpfulCountDto reviewHelpfulCountDto = new ReviewHelpfulCountDto();
      reviewHelpfulCountDto.setReviewId(this.reviewId);
      reviewHelpfulCountDto.setHelpfulTrueCount(this.helpfulTrueCount);
      reviewHelpfulCountDto.setHelpfulFalseCount(this.helpfulFalseCount);
      reviewHelpfulCountDto.setHelpfulCount(this.helpfulCount);
      return reviewHelpfulCountDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReviewHelpfulCountDtoBuilder {\n");
      
      sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
      sb.append("    helpfulTrueCount: ").append(toIndentedString(helpfulTrueCount)).append("\n");
      sb.append("    helpfulFalseCount: ").append(toIndentedString(helpfulFalseCount)).append("\n");
      sb.append("    helpfulCount: ").append(toIndentedString(helpfulCount)).append("\n");
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

