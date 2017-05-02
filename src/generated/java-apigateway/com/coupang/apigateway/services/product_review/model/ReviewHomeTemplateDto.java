package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.BestReviewHomeDto;
import com.coupang.apigateway.services.product_review.model.HomeReviewBannerDto;
import com.coupang.apigateway.services.product_review.model.TopReviewerHomeDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ReviewHomeTemplateDto   {
  
  private TopReviewerHomeDto reviewerRankDto = null;
  private HomeReviewBannerDto reviewBannerDto = null;
  private BestReviewHomeDto bestReviewDto = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewerRankDto")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewerRankDto")
  public TopReviewerHomeDto getReviewerRankDto() {
    return reviewerRankDto;
  }
  
  /**
   **/
  public void setReviewerRankDto(TopReviewerHomeDto reviewerRankDto) {
    this.reviewerRankDto = reviewerRankDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewBannerDto")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewBannerDto")
  public HomeReviewBannerDto getReviewBannerDto() {
    return reviewBannerDto;
  }
  
  /**
   **/
  public void setReviewBannerDto(HomeReviewBannerDto reviewBannerDto) {
    this.reviewBannerDto = reviewBannerDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("bestReviewDto")
  @com.fasterxml.jackson.annotation.JsonProperty("bestReviewDto")
  public BestReviewHomeDto getBestReviewDto() {
    return bestReviewDto;
  }
  
  /**
   **/
  public void setBestReviewDto(BestReviewHomeDto bestReviewDto) {
    this.bestReviewDto = bestReviewDto;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewHomeTemplateDto reviewHomeTemplateDto = (ReviewHomeTemplateDto) o;
    return Objects.equals(this.reviewerRankDto, reviewHomeTemplateDto.reviewerRankDto) &&
        Objects.equals(this.reviewBannerDto, reviewHomeTemplateDto.reviewBannerDto) &&
        Objects.equals(this.bestReviewDto, reviewHomeTemplateDto.bestReviewDto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewerRankDto, reviewBannerDto, bestReviewDto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewHomeTemplateDto {\n");
    
    sb.append("    reviewerRankDto: ").append(toIndentedString(reviewerRankDto)).append("\n");
    sb.append("    reviewBannerDto: ").append(toIndentedString(reviewBannerDto)).append("\n");
    sb.append("    bestReviewDto: ").append(toIndentedString(bestReviewDto)).append("\n");
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

  public static ReviewHomeTemplateDtoBuilder builder() {
    return new ReviewHomeTemplateDtoBuilder();
  }

  public static class ReviewHomeTemplateDtoBuilder {

    private TopReviewerHomeDto reviewerRankDto = null;
    private HomeReviewBannerDto reviewBannerDto = null;
    private BestReviewHomeDto bestReviewDto = null;
    

    ReviewHomeTemplateDtoBuilder() {
    }

    /**
     **/
    public ReviewHomeTemplateDtoBuilder reviewerRankDto(TopReviewerHomeDto reviewerRankDto) {
      this.reviewerRankDto = reviewerRankDto;
      return this;
    }

    /**
     **/
    public ReviewHomeTemplateDtoBuilder reviewBannerDto(HomeReviewBannerDto reviewBannerDto) {
      this.reviewBannerDto = reviewBannerDto;
      return this;
    }

    /**
     **/
    public ReviewHomeTemplateDtoBuilder bestReviewDto(BestReviewHomeDto bestReviewDto) {
      this.bestReviewDto = bestReviewDto;
      return this;
    }


    public ReviewHomeTemplateDto build() {
      ReviewHomeTemplateDto reviewHomeTemplateDto = new ReviewHomeTemplateDto();
      reviewHomeTemplateDto.setReviewerRankDto(this.reviewerRankDto);
      reviewHomeTemplateDto.setReviewBannerDto(this.reviewBannerDto);
      reviewHomeTemplateDto.setBestReviewDto(this.bestReviewDto);
      return reviewHomeTemplateDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReviewHomeTemplateDtoBuilder {\n");
      
      sb.append("    reviewerRankDto: ").append(toIndentedString(reviewerRankDto)).append("\n");
      sb.append("    reviewBannerDto: ").append(toIndentedString(reviewBannerDto)).append("\n");
      sb.append("    bestReviewDto: ").append(toIndentedString(bestReviewDto)).append("\n");
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

