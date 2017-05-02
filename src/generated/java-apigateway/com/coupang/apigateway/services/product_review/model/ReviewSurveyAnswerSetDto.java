package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ReviewSurveyAnswerSetDto   {
  
  private Long reviewSurveyAnswerSetId = null;
  private String answerSet = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewSurveyAnswerSetId")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewSurveyAnswerSetId")
  public Long getReviewSurveyAnswerSetId() {
    return reviewSurveyAnswerSetId;
  }
  
  /**
   **/
  public void setReviewSurveyAnswerSetId(Long reviewSurveyAnswerSetId) {
    this.reviewSurveyAnswerSetId = reviewSurveyAnswerSetId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("answerSet")
  @com.fasterxml.jackson.annotation.JsonProperty("answerSet")
  public String getAnswerSet() {
    return answerSet;
  }
  
  /**
   **/
  public void setAnswerSet(String answerSet) {
    this.answerSet = answerSet;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewSurveyAnswerSetDto reviewSurveyAnswerSetDto = (ReviewSurveyAnswerSetDto) o;
    return Objects.equals(this.reviewSurveyAnswerSetId, reviewSurveyAnswerSetDto.reviewSurveyAnswerSetId) &&
        Objects.equals(this.answerSet, reviewSurveyAnswerSetDto.answerSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewSurveyAnswerSetId, answerSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewSurveyAnswerSetDto {\n");
    
    sb.append("    reviewSurveyAnswerSetId: ").append(toIndentedString(reviewSurveyAnswerSetId)).append("\n");
    sb.append("    answerSet: ").append(toIndentedString(answerSet)).append("\n");
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

  public static ReviewSurveyAnswerSetDtoBuilder builder() {
    return new ReviewSurveyAnswerSetDtoBuilder();
  }

  public static class ReviewSurveyAnswerSetDtoBuilder {

    private Long reviewSurveyAnswerSetId = null;
    private String answerSet = null;
    

    ReviewSurveyAnswerSetDtoBuilder() {
    }

    /**
     **/
    public ReviewSurveyAnswerSetDtoBuilder reviewSurveyAnswerSetId(Long reviewSurveyAnswerSetId) {
      this.reviewSurveyAnswerSetId = reviewSurveyAnswerSetId;
      return this;
    }

    /**
     **/
    public ReviewSurveyAnswerSetDtoBuilder answerSet(String answerSet) {
      this.answerSet = answerSet;
      return this;
    }


    public ReviewSurveyAnswerSetDto build() {
      ReviewSurveyAnswerSetDto reviewSurveyAnswerSetDto = new ReviewSurveyAnswerSetDto();
      reviewSurveyAnswerSetDto.setReviewSurveyAnswerSetId(this.reviewSurveyAnswerSetId);
      reviewSurveyAnswerSetDto.setAnswerSet(this.answerSet);
      return reviewSurveyAnswerSetDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReviewSurveyAnswerSetDtoBuilder {\n");
      
      sb.append("    reviewSurveyAnswerSetId: ").append(toIndentedString(reviewSurveyAnswerSetId)).append("\n");
      sb.append("    answerSet: ").append(toIndentedString(answerSet)).append("\n");
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

