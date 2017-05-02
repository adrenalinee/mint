package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.SurveySummaryAnswerDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class SurveySummaryQuestionDto   {
  


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
  private Long productId = null;
  private String name = null;
  private Long id = null;
  private SurveySummaryAnswerDto bestAnswer = null;
  private List<SurveySummaryAnswerDto> answers = new ArrayList<SurveySummaryAnswerDto>();

  
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
  @org.codehaus.jackson.annotate.JsonProperty("name")
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  public String getName() {
    return name;
  }
  
  /**
   **/
  public void setName(String name) {
    this.name = name;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("id")
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  public Long getId() {
    return id;
  }
  
  /**
   **/
  public void setId(Long id) {
    this.id = id;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("bestAnswer")
  @com.fasterxml.jackson.annotation.JsonProperty("bestAnswer")
  public SurveySummaryAnswerDto getBestAnswer() {
    return bestAnswer;
  }
  
  /**
   **/
  public void setBestAnswer(SurveySummaryAnswerDto bestAnswer) {
    this.bestAnswer = bestAnswer;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("answers")
  @com.fasterxml.jackson.annotation.JsonProperty("answers")
  public List<SurveySummaryAnswerDto> getAnswers() {
    return answers;
  }
  
  /**
   **/
  public void setAnswers(List<SurveySummaryAnswerDto> answers) {
    this.answers = answers;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveySummaryQuestionDto surveySummaryQuestionDto = (SurveySummaryQuestionDto) o;
    return Objects.equals(this.questionType, surveySummaryQuestionDto.questionType) &&
        Objects.equals(this.productId, surveySummaryQuestionDto.productId) &&
        Objects.equals(this.name, surveySummaryQuestionDto.name) &&
        Objects.equals(this.id, surveySummaryQuestionDto.id) &&
        Objects.equals(this.bestAnswer, surveySummaryQuestionDto.bestAnswer) &&
        Objects.equals(this.answers, surveySummaryQuestionDto.answers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionType, productId, name, id, bestAnswer, answers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveySummaryQuestionDto {\n");
    
    sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bestAnswer: ").append(toIndentedString(bestAnswer)).append("\n");
    sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
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

  public static SurveySummaryQuestionDtoBuilder builder() {
    return new SurveySummaryQuestionDtoBuilder();
  }

  public static class SurveySummaryQuestionDtoBuilder {

    private QuestionTypeEnum questionType = null;
    private Long productId = null;
    private String name = null;
    private Long id = null;
    private SurveySummaryAnswerDto bestAnswer = null;
    private List<SurveySummaryAnswerDto> answers = new ArrayList<SurveySummaryAnswerDto>();
    

    SurveySummaryQuestionDtoBuilder() {
    }

    /**
     **/
    public SurveySummaryQuestionDtoBuilder questionType(QuestionTypeEnum questionType) {
      this.questionType = questionType;
      return this;
    }

    /**
     **/
    public SurveySummaryQuestionDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public SurveySummaryQuestionDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public SurveySummaryQuestionDtoBuilder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public SurveySummaryQuestionDtoBuilder bestAnswer(SurveySummaryAnswerDto bestAnswer) {
      this.bestAnswer = bestAnswer;
      return this;
    }

    /**
     **/
    public SurveySummaryQuestionDtoBuilder answers(List<SurveySummaryAnswerDto> answers) {
      this.answers = answers;
      return this;
    }


    public SurveySummaryQuestionDto build() {
      SurveySummaryQuestionDto surveySummaryQuestionDto = new SurveySummaryQuestionDto();
      surveySummaryQuestionDto.setQuestionType(this.questionType);
      surveySummaryQuestionDto.setProductId(this.productId);
      surveySummaryQuestionDto.setName(this.name);
      surveySummaryQuestionDto.setId(this.id);
      surveySummaryQuestionDto.setBestAnswer(this.bestAnswer);
      surveySummaryQuestionDto.setAnswers(this.answers);
      return surveySummaryQuestionDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SurveySummaryQuestionDtoBuilder {\n");
      
      sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    bestAnswer: ").append(toIndentedString(bestAnswer)).append("\n");
      sb.append("    answers: ").append(toIndentedString(answers)).append("\n");
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

