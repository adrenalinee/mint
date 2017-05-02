package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.ReviewSurveyAnswerSetDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ReviewSurveyQuestionDto   {
  
  private Long reviewSurveyQuestionId = null;
  private List<ReviewSurveyAnswerSetDto> reviewSurveyAnswerSets = new ArrayList<ReviewSurveyAnswerSetDto>();
  private String questionTypeString = null;


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
  private String extendedQuestionType = null;
  private Boolean exposed = null;
  private String descriptionPc = null;
  private String descriptionMobile = null;
  private Boolean checked = null;


  public enum AnswerValidTypeEnum {
    NUMBER("NUMBER"),
    ALL("ALL");

    private String value;

    AnswerValidTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private AnswerValidTypeEnum answerValidType = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("reviewSurveyAnswerSets")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewSurveyAnswerSets")
  public List<ReviewSurveyAnswerSetDto> getReviewSurveyAnswerSets() {
    return reviewSurveyAnswerSets;
  }
  
  /**
   **/
  public void setReviewSurveyAnswerSets(List<ReviewSurveyAnswerSetDto> reviewSurveyAnswerSets) {
    this.reviewSurveyAnswerSets = reviewSurveyAnswerSets;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("questionTypeString")
  @com.fasterxml.jackson.annotation.JsonProperty("questionTypeString")
  public String getQuestionTypeString() {
    return questionTypeString;
  }
  
  /**
   **/
  public void setQuestionTypeString(String questionTypeString) {
    this.questionTypeString = questionTypeString;
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
  public String getExtendedQuestionType() {
    return extendedQuestionType;
  }
  
  /**
   **/
  public void setExtendedQuestionType(String extendedQuestionType) {
    this.extendedQuestionType = extendedQuestionType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("exposed")
  @com.fasterxml.jackson.annotation.JsonProperty("exposed")
  public Boolean getExposed() {
    return exposed;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isExposed() {
    return exposed == null ? false : exposed;
  }
  
  /**
   **/
  public void setExposed(Boolean exposed) {
    this.exposed = exposed;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("descriptionPc")
  @com.fasterxml.jackson.annotation.JsonProperty("descriptionPc")
  public String getDescriptionPc() {
    return descriptionPc;
  }
  
  /**
   **/
  public void setDescriptionPc(String descriptionPc) {
    this.descriptionPc = descriptionPc;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("descriptionMobile")
  @com.fasterxml.jackson.annotation.JsonProperty("descriptionMobile")
  public String getDescriptionMobile() {
    return descriptionMobile;
  }
  
  /**
   **/
  public void setDescriptionMobile(String descriptionMobile) {
    this.descriptionMobile = descriptionMobile;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("checked")
  @com.fasterxml.jackson.annotation.JsonProperty("checked")
  public Boolean getChecked() {
    return checked;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isChecked() {
    return checked == null ? false : checked;
  }
  
  /**
   **/
  public void setChecked(Boolean checked) {
    this.checked = checked;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("answerValidType")
  @com.fasterxml.jackson.annotation.JsonProperty("answerValidType")
  public AnswerValidTypeEnum getAnswerValidType() {
    return answerValidType;
  }
  
  /**
   **/
  public void setAnswerValidType(AnswerValidTypeEnum answerValidType) {
    this.answerValidType = answerValidType;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewSurveyQuestionDto reviewSurveyQuestionDto = (ReviewSurveyQuestionDto) o;
    return Objects.equals(this.reviewSurveyQuestionId, reviewSurveyQuestionDto.reviewSurveyQuestionId) &&
        Objects.equals(this.reviewSurveyAnswerSets, reviewSurveyQuestionDto.reviewSurveyAnswerSets) &&
        Objects.equals(this.questionTypeString, reviewSurveyQuestionDto.questionTypeString) &&
        Objects.equals(this.questionType, reviewSurveyQuestionDto.questionType) &&
        Objects.equals(this.question, reviewSurveyQuestionDto.question) &&
        Objects.equals(this.extendedQuestionType, reviewSurveyQuestionDto.extendedQuestionType) &&
        Objects.equals(this.exposed, reviewSurveyQuestionDto.exposed) &&
        Objects.equals(this.descriptionPc, reviewSurveyQuestionDto.descriptionPc) &&
        Objects.equals(this.descriptionMobile, reviewSurveyQuestionDto.descriptionMobile) &&
        Objects.equals(this.checked, reviewSurveyQuestionDto.checked) &&
        Objects.equals(this.answerValidType, reviewSurveyQuestionDto.answerValidType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewSurveyQuestionId, reviewSurveyAnswerSets, questionTypeString, questionType, question, extendedQuestionType, exposed, descriptionPc, descriptionMobile, checked, answerValidType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewSurveyQuestionDto {\n");
    
    sb.append("    reviewSurveyQuestionId: ").append(toIndentedString(reviewSurveyQuestionId)).append("\n");
    sb.append("    reviewSurveyAnswerSets: ").append(toIndentedString(reviewSurveyAnswerSets)).append("\n");
    sb.append("    questionTypeString: ").append(toIndentedString(questionTypeString)).append("\n");
    sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    extendedQuestionType: ").append(toIndentedString(extendedQuestionType)).append("\n");
    sb.append("    exposed: ").append(toIndentedString(exposed)).append("\n");
    sb.append("    descriptionPc: ").append(toIndentedString(descriptionPc)).append("\n");
    sb.append("    descriptionMobile: ").append(toIndentedString(descriptionMobile)).append("\n");
    sb.append("    checked: ").append(toIndentedString(checked)).append("\n");
    sb.append("    answerValidType: ").append(toIndentedString(answerValidType)).append("\n");
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

  public static ReviewSurveyQuestionDtoBuilder builder() {
    return new ReviewSurveyQuestionDtoBuilder();
  }

  public static class ReviewSurveyQuestionDtoBuilder {

    private Long reviewSurveyQuestionId = null;
    private List<ReviewSurveyAnswerSetDto> reviewSurveyAnswerSets = new ArrayList<ReviewSurveyAnswerSetDto>();
    private String questionTypeString = null;
    private QuestionTypeEnum questionType = null;
    private String question = null;
    private String extendedQuestionType = null;
    private Boolean exposed = null;
    private String descriptionPc = null;
    private String descriptionMobile = null;
    private Boolean checked = null;
    private AnswerValidTypeEnum answerValidType = null;
    

    ReviewSurveyQuestionDtoBuilder() {
    }

    /**
     **/
    public ReviewSurveyQuestionDtoBuilder reviewSurveyQuestionId(Long reviewSurveyQuestionId) {
      this.reviewSurveyQuestionId = reviewSurveyQuestionId;
      return this;
    }

    /**
     **/
    public ReviewSurveyQuestionDtoBuilder reviewSurveyAnswerSets(List<ReviewSurveyAnswerSetDto> reviewSurveyAnswerSets) {
      this.reviewSurveyAnswerSets = reviewSurveyAnswerSets;
      return this;
    }

    /**
     **/
    public ReviewSurveyQuestionDtoBuilder questionTypeString(String questionTypeString) {
      this.questionTypeString = questionTypeString;
      return this;
    }

    /**
     **/
    public ReviewSurveyQuestionDtoBuilder questionType(QuestionTypeEnum questionType) {
      this.questionType = questionType;
      return this;
    }

    /**
     **/
    public ReviewSurveyQuestionDtoBuilder question(String question) {
      this.question = question;
      return this;
    }

    /**
     **/
    public ReviewSurveyQuestionDtoBuilder extendedQuestionType(String extendedQuestionType) {
      this.extendedQuestionType = extendedQuestionType;
      return this;
    }

    /**
     **/
    public ReviewSurveyQuestionDtoBuilder exposed(Boolean exposed) {
      this.exposed = exposed;
      return this;
    }

    /**
     **/
    public ReviewSurveyQuestionDtoBuilder descriptionPc(String descriptionPc) {
      this.descriptionPc = descriptionPc;
      return this;
    }

    /**
     **/
    public ReviewSurveyQuestionDtoBuilder descriptionMobile(String descriptionMobile) {
      this.descriptionMobile = descriptionMobile;
      return this;
    }

    /**
     **/
    public ReviewSurveyQuestionDtoBuilder checked(Boolean checked) {
      this.checked = checked;
      return this;
    }

    /**
     **/
    public ReviewSurveyQuestionDtoBuilder answerValidType(AnswerValidTypeEnum answerValidType) {
      this.answerValidType = answerValidType;
      return this;
    }


    public ReviewSurveyQuestionDto build() {
      ReviewSurveyQuestionDto reviewSurveyQuestionDto = new ReviewSurveyQuestionDto();
      reviewSurveyQuestionDto.setReviewSurveyQuestionId(this.reviewSurveyQuestionId);
      reviewSurveyQuestionDto.setReviewSurveyAnswerSets(this.reviewSurveyAnswerSets);
      reviewSurveyQuestionDto.setQuestionTypeString(this.questionTypeString);
      reviewSurveyQuestionDto.setQuestionType(this.questionType);
      reviewSurveyQuestionDto.setQuestion(this.question);
      reviewSurveyQuestionDto.setExtendedQuestionType(this.extendedQuestionType);
      reviewSurveyQuestionDto.setExposed(this.exposed);
      reviewSurveyQuestionDto.setDescriptionPc(this.descriptionPc);
      reviewSurveyQuestionDto.setDescriptionMobile(this.descriptionMobile);
      reviewSurveyQuestionDto.setChecked(this.checked);
      reviewSurveyQuestionDto.setAnswerValidType(this.answerValidType);
      return reviewSurveyQuestionDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReviewSurveyQuestionDtoBuilder {\n");
      
      sb.append("    reviewSurveyQuestionId: ").append(toIndentedString(reviewSurveyQuestionId)).append("\n");
      sb.append("    reviewSurveyAnswerSets: ").append(toIndentedString(reviewSurveyAnswerSets)).append("\n");
      sb.append("    questionTypeString: ").append(toIndentedString(questionTypeString)).append("\n");
      sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
      sb.append("    question: ").append(toIndentedString(question)).append("\n");
      sb.append("    extendedQuestionType: ").append(toIndentedString(extendedQuestionType)).append("\n");
      sb.append("    exposed: ").append(toIndentedString(exposed)).append("\n");
      sb.append("    descriptionPc: ").append(toIndentedString(descriptionPc)).append("\n");
      sb.append("    descriptionMobile: ").append(toIndentedString(descriptionMobile)).append("\n");
      sb.append("    checked: ").append(toIndentedString(checked)).append("\n");
      sb.append("    answerValidType: ").append(toIndentedString(answerValidType)).append("\n");
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

