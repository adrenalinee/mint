package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ReviewSurveyAnswerDto   {
  
  private Long reviewSurveyQuestionId = null;


  public enum QuestionTypeEnum {
    SHORT_ANSWER("SHORT_ANSWER"),
    MULTIPLE_CHOICE("MULTIPLE_CHOICE"),
    RATING("RATING");

    private String value;

    QuestionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private QuestionTypeEnum questionType = null;
  private String question = null;


  public enum ExtendedQuestionTypeEnum {
    SHORT_ANSWER("SHORT_ANSWER"),
    MULTIPLE_CHOICE("MULTIPLE_CHOICE"),
    RATING("RATING");

    private String value;

    ExtendedQuestionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private ExtendedQuestionTypeEnum extendedQuestionType = null;
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
  @org.codehaus.jackson.annotate.JsonProperty("questionType")
  @com.fasterxml.jackson.annotation.JsonProperty("questionType")
  public QuestionTypeEnum getQuestionType() {
    return questionType;
  }
  
  /**
   **/
  public void setQuestionType(QuestionTypeEnum questionType) {
    this.questionType = questionType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("question")
  @com.fasterxml.jackson.annotation.JsonProperty("question")
  public String getQuestion() {
    return question;
  }
  
  /**
   **/
  public void setQuestion(String question) {
    this.question = question;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("extendedQuestionType")
  @com.fasterxml.jackson.annotation.JsonProperty("extendedQuestionType")
  public ExtendedQuestionTypeEnum getExtendedQuestionType() {
    return extendedQuestionType;
  }
  
  /**
   **/
  public void setExtendedQuestionType(ExtendedQuestionTypeEnum extendedQuestionType) {
    this.extendedQuestionType = extendedQuestionType;
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
    ReviewSurveyAnswerDto reviewSurveyAnswerDto = (ReviewSurveyAnswerDto) o;
    return Objects.equals(this.reviewSurveyQuestionId, reviewSurveyAnswerDto.reviewSurveyQuestionId) &&
        Objects.equals(this.questionType, reviewSurveyAnswerDto.questionType) &&
        Objects.equals(this.question, reviewSurveyAnswerDto.question) &&
        Objects.equals(this.extendedQuestionType, reviewSurveyAnswerDto.extendedQuestionType) &&
        Objects.equals(this.answer, reviewSurveyAnswerDto.answer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewSurveyQuestionId, questionType, question, extendedQuestionType, answer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewSurveyAnswerDto {\n");
    
    sb.append("    reviewSurveyQuestionId: ").append(toIndentedString(reviewSurveyQuestionId)).append("\n");
    sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    extendedQuestionType: ").append(toIndentedString(extendedQuestionType)).append("\n");
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

  public static ReviewSurveyAnswerDtoBuilder builder() {
    return new ReviewSurveyAnswerDtoBuilder();
  }

  public static class ReviewSurveyAnswerDtoBuilder {

    private Long reviewSurveyQuestionId = null;
    private QuestionTypeEnum questionType = null;
    private String question = null;
    private ExtendedQuestionTypeEnum extendedQuestionType = null;
    private String answer = null;
    

    ReviewSurveyAnswerDtoBuilder() {
    }

    /**
     **/
    public ReviewSurveyAnswerDtoBuilder reviewSurveyQuestionId(Long reviewSurveyQuestionId) {
      this.reviewSurveyQuestionId = reviewSurveyQuestionId;
      return this;
    }

    /**
     **/
    public ReviewSurveyAnswerDtoBuilder questionType(QuestionTypeEnum questionType) {
      this.questionType = questionType;
      return this;
    }

    /**
     **/
    public ReviewSurveyAnswerDtoBuilder question(String question) {
      this.question = question;
      return this;
    }

    /**
     **/
    public ReviewSurveyAnswerDtoBuilder extendedQuestionType(ExtendedQuestionTypeEnum extendedQuestionType) {
      this.extendedQuestionType = extendedQuestionType;
      return this;
    }

    /**
     **/
    public ReviewSurveyAnswerDtoBuilder answer(String answer) {
      this.answer = answer;
      return this;
    }


    public ReviewSurveyAnswerDto build() {
      ReviewSurveyAnswerDto reviewSurveyAnswerDto = new ReviewSurveyAnswerDto();
      reviewSurveyAnswerDto.setReviewSurveyQuestionId(this.reviewSurveyQuestionId);
      reviewSurveyAnswerDto.setQuestionType(this.questionType);
      reviewSurveyAnswerDto.setQuestion(this.question);
      reviewSurveyAnswerDto.setExtendedQuestionType(this.extendedQuestionType);
      reviewSurveyAnswerDto.setAnswer(this.answer);
      return reviewSurveyAnswerDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReviewSurveyAnswerDtoBuilder {\n");
      
      sb.append("    reviewSurveyQuestionId: ").append(toIndentedString(reviewSurveyQuestionId)).append("\n");
      sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
      sb.append("    question: ").append(toIndentedString(question)).append("\n");
      sb.append("    extendedQuestionType: ").append(toIndentedString(extendedQuestionType)).append("\n");
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

