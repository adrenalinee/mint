package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.PagedResourcesOfProductReviewContentsDto;
import com.coupang.apigateway.services.product_review.model.ReviewerDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ReviewerWithReviewsDto   {
  
  private PagedResourcesOfProductReviewContentsDto reviews = null;
  private ReviewerDto reviewer = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviews")
  @com.fasterxml.jackson.annotation.JsonProperty("reviews")
  public PagedResourcesOfProductReviewContentsDto getReviews() {
    return reviews;
  }
  
  /**
   **/
  public void setReviews(PagedResourcesOfProductReviewContentsDto reviews) {
    this.reviews = reviews;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewer")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewer")
  public ReviewerDto getReviewer() {
    return reviewer;
  }
  
  /**
   **/
  public void setReviewer(ReviewerDto reviewer) {
    this.reviewer = reviewer;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewerWithReviewsDto reviewerWithReviewsDto = (ReviewerWithReviewsDto) o;
    return Objects.equals(this.reviews, reviewerWithReviewsDto.reviews) &&
        Objects.equals(this.reviewer, reviewerWithReviewsDto.reviewer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviews, reviewer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewerWithReviewsDto {\n");
    
    sb.append("    reviews: ").append(toIndentedString(reviews)).append("\n");
    sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
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

  public static ReviewerWithReviewsDtoBuilder builder() {
    return new ReviewerWithReviewsDtoBuilder();
  }

  public static class ReviewerWithReviewsDtoBuilder {

    private PagedResourcesOfProductReviewContentsDto reviews = null;
    private ReviewerDto reviewer = null;
    

    ReviewerWithReviewsDtoBuilder() {
    }

    /**
     **/
    public ReviewerWithReviewsDtoBuilder reviews(PagedResourcesOfProductReviewContentsDto reviews) {
      this.reviews = reviews;
      return this;
    }

    /**
     **/
    public ReviewerWithReviewsDtoBuilder reviewer(ReviewerDto reviewer) {
      this.reviewer = reviewer;
      return this;
    }


    public ReviewerWithReviewsDto build() {
      ReviewerWithReviewsDto reviewerWithReviewsDto = new ReviewerWithReviewsDto();
      reviewerWithReviewsDto.setReviews(this.reviews);
      reviewerWithReviewsDto.setReviewer(this.reviewer);
      return reviewerWithReviewsDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReviewerWithReviewsDtoBuilder {\n");
      
      sb.append("    reviews: ").append(toIndentedString(reviews)).append("\n");
      sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
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

