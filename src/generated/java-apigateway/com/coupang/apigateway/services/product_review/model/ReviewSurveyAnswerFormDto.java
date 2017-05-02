package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ReviewSurveyAnswerFormDto   {
  
  private Long reviewSurveyQuestionId = null;
  private String answer = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewSurveyQuestionId")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewSurveyQuestionId")
  public Long getReviewSurveyQuestionId() {
    return reviewSurveyQuestionId;
  }
  
  /**
   **/
  public void setReviewSurveyQuestionId(Long reviewSurveyQuestionId) {
    this.reviewSurveyQuestionId = reviewSurveyQuestionId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("answer")
  @com.fasterxml.jackson.annotation.JsonProperty("answer")
  public String getAnswer() {
    return answer;
  }
  
  /**
   **/
  public void setAnswer(String answer) {
    this.answer = answer;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewSurveyAnswerFormDto reviewSurveyAnswerFormDto = (ReviewSurveyAnswerFormDto) o;
    return Objects.equals(this.reviewSurveyQuestionId, reviewSurveyAnswerFormDto.reviewSurveyQuestionId) &&
        Objects.equals(this.answer, reviewSurveyAnswerFormDto.answer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewSurveyQuestionId, answer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewSurveyAnswerFormDto {\n");
    
    sb.append("    reviewSurveyQuestionId: ").append(toIndentedString(reviewSurveyQuestionId)).append("\n");
    sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
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

  public static ReviewSurveyAnswerFormDtoBuilder builder() {
    return new ReviewSurveyAnswerFormDtoBuilder();
  }

  public static class ReviewSurveyAnswerFormDtoBuilder {

    private Long reviewSurveyQuestionId = null;
    private String answer = null;
    

    ReviewSurveyAnswerFormDtoBuilder() {
    }

    /**
     **/
    public ReviewSurveyAnswerFormDtoBuilder reviewSurveyQuestionId(Long reviewSurveyQuestionId) {
      this.reviewSurveyQuestionId = reviewSurveyQuestionId;
      return this;
    }

    /**
     **/
    public ReviewSurveyAnswerFormDtoBuilder answer(String answer) {
      this.answer = answer;
      return this;
    }


    public ReviewSurveyAnswerFormDto build() {
      ReviewSurveyAnswerFormDto reviewSurveyAnswerFormDto = new ReviewSurveyAnswerFormDto();
      reviewSurveyAnswerFormDto.setReviewSurveyQuestionId(this.reviewSurveyQuestionId);
      reviewSurveyAnswerFormDto.setAnswer(this.answer);
      return reviewSurveyAnswerFormDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReviewSurveyAnswerFormDtoBuilder {\n");
      
      sb.append("    reviewSurveyQuestionId: ").append(toIndentedString(reviewSurveyQuestionId)).append("\n");
      sb.append("    answer: ").append(toIndentedString(answer)).append("\n");
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

