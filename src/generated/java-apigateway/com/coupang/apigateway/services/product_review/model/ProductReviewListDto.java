package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.PagedResourcesOfProductReviewDto;
import com.coupang.apigateway.services.product_review.model.RatingSummaryTotalDto;
import com.coupang.apigateway.services.product_review.model.SurveySummaryDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ProductReviewListDto   {
  
  private SurveySummaryDto surveySummary = null;
  private PagedResourcesOfProductReviewDto reviews = null;
  private RatingSummaryTotalDto ratingSummaryTotal = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("surveySummary")
  @com.fasterxml.jackson.annotation.JsonProperty("surveySummary")
  public SurveySummaryDto getSurveySummary() {
    return surveySummary;
  }
  
  /**
   **/
  public void setSurveySummary(SurveySummaryDto surveySummary) {
    this.surveySummary = surveySummary;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviews")
  @com.fasterxml.jackson.annotation.JsonProperty("reviews")
  public PagedResourcesOfProductReviewDto getReviews() {
    return reviews;
  }
  
  /**
   **/
  public void setReviews(PagedResourcesOfProductReviewDto reviews) {
    this.reviews = reviews;
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductReviewListDto productReviewListDto = (ProductReviewListDto) o;
    return Objects.equals(this.surveySummary, productReviewListDto.surveySummary) &&
        Objects.equals(this.reviews, productReviewListDto.reviews) &&
        Objects.equals(this.ratingSummaryTotal, productReviewListDto.ratingSummaryTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(surveySummary, reviews, ratingSummaryTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductReviewListDto {\n");
    
    sb.append("    surveySummary: ").append(toIndentedString(surveySummary)).append("\n");
    sb.append("    reviews: ").append(toIndentedString(reviews)).append("\n");
    sb.append("    ratingSummaryTotal: ").append(toIndentedString(ratingSummaryTotal)).append("\n");
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

  public static ProductReviewListDtoBuilder builder() {
    return new ProductReviewListDtoBuilder();
  }

  public static class ProductReviewListDtoBuilder {

    private SurveySummaryDto surveySummary = null;
    private PagedResourcesOfProductReviewDto reviews = null;
    private RatingSummaryTotalDto ratingSummaryTotal = null;
    

    ProductReviewListDtoBuilder() {
    }

    /**
     **/
    public ProductReviewListDtoBuilder surveySummary(SurveySummaryDto surveySummary) {
      this.surveySummary = surveySummary;
      return this;
    }

    /**
     **/
    public ProductReviewListDtoBuilder reviews(PagedResourcesOfProductReviewDto reviews) {
      this.reviews = reviews;
      return this;
    }

    /**
     **/
    public ProductReviewListDtoBuilder ratingSummaryTotal(RatingSummaryTotalDto ratingSummaryTotal) {
      this.ratingSummaryTotal = ratingSummaryTotal;
      return this;
    }


    public ProductReviewListDto build() {
      ProductReviewListDto productReviewListDto = new ProductReviewListDto();
      productReviewListDto.setSurveySummary(this.surveySummary);
      productReviewListDto.setReviews(this.reviews);
      productReviewListDto.setRatingSummaryTotal(this.ratingSummaryTotal);
      return productReviewListDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ProductReviewListDtoBuilder {\n");
      
      sb.append("    surveySummary: ").append(toIndentedString(surveySummary)).append("\n");
      sb.append("    reviews: ").append(toIndentedString(reviews)).append("\n");
      sb.append("    ratingSummaryTotal: ").append(toIndentedString(ratingSummaryTotal)).append("\n");
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

