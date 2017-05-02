package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class SurveySummaryRatingQuestionDto   {
  


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
  private Long count = null;
  private Double average = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("count")
  @com.fasterxml.jackson.annotation.JsonProperty("count")
  public Long getCount() {
    return count;
  }
  
  /**
   **/
  public void setCount(Long count) {
    this.count = count;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("average")
  @com.fasterxml.jackson.annotation.JsonProperty("average")
  public Double getAverage() {
    return average;
  }
  
  /**
   **/
  public void setAverage(Double average) {
    this.average = average;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveySummaryRatingQuestionDto surveySummaryRatingQuestionDto = (SurveySummaryRatingQuestionDto) o;
    return Objects.equals(this.questionType, surveySummaryRatingQuestionDto.questionType) &&
        Objects.equals(this.productId, surveySummaryRatingQuestionDto.productId) &&
        Objects.equals(this.name, surveySummaryRatingQuestionDto.name) &&
        Objects.equals(this.id, surveySummaryRatingQuestionDto.id) &&
        Objects.equals(this.count, surveySummaryRatingQuestionDto.count) &&
        Objects.equals(this.average, surveySummaryRatingQuestionDto.average);
  }

  @Override
  public int hashCode() {
    return Objects.hash(questionType, productId, name, id, count, average);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveySummaryRatingQuestionDto {\n");
    
    sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
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

  public static SurveySummaryRatingQuestionDtoBuilder builder() {
    return new SurveySummaryRatingQuestionDtoBuilder();
  }

  public static class SurveySummaryRatingQuestionDtoBuilder {

    private QuestionTypeEnum questionType = null;
    private Long productId = null;
    private String name = null;
    private Long id = null;
    private Long count = null;
    private Double average = null;
    

    SurveySummaryRatingQuestionDtoBuilder() {
    }

    /**
     **/
    public SurveySummaryRatingQuestionDtoBuilder questionType(QuestionTypeEnum questionType) {
      this.questionType = questionType;
      return this;
    }

    /**
     **/
    public SurveySummaryRatingQuestionDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public SurveySummaryRatingQuestionDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public SurveySummaryRatingQuestionDtoBuilder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public SurveySummaryRatingQuestionDtoBuilder count(Long count) {
      this.count = count;
      return this;
    }

    /**
     **/
    public SurveySummaryRatingQuestionDtoBuilder average(Double average) {
      this.average = average;
      return this;
    }


    public SurveySummaryRatingQuestionDto build() {
      SurveySummaryRatingQuestionDto surveySummaryRatingQuestionDto = new SurveySummaryRatingQuestionDto();
      surveySummaryRatingQuestionDto.setQuestionType(this.questionType);
      surveySummaryRatingQuestionDto.setProductId(this.productId);
      surveySummaryRatingQuestionDto.setName(this.name);
      surveySummaryRatingQuestionDto.setId(this.id);
      surveySummaryRatingQuestionDto.setCount(this.count);
      surveySummaryRatingQuestionDto.setAverage(this.average);
      return surveySummaryRatingQuestionDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SurveySummaryRatingQuestionDtoBuilder {\n");
      
      sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    count: ").append(toIndentedString(count)).append("\n");
      sb.append("    average: ").append(toIndentedString(average)).append("\n");
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

