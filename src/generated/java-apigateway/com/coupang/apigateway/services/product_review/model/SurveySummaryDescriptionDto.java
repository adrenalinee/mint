package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class SurveySummaryDescriptionDto   {
  
  private Integer rating = null;
  private String question = null;
  private String answer = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("rating")
  @com.fasterxml.jackson.annotation.JsonProperty("rating")
  public Integer getRating() {
    return rating;
  }
  
  /**
   **/
  public void setRating(Integer rating) {
    this.rating = rating;
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
    SurveySummaryDescriptionDto surveySummaryDescriptionDto = (SurveySummaryDescriptionDto) o;
    return Objects.equals(this.rating, surveySummaryDescriptionDto.rating) &&
        Objects.equals(this.question, surveySummaryDescriptionDto.question) &&
        Objects.equals(this.answer, surveySummaryDescriptionDto.answer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rating, question, answer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveySummaryDescriptionDto {\n");
    
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
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

  public static SurveySummaryDescriptionDtoBuilder builder() {
    return new SurveySummaryDescriptionDtoBuilder();
  }

  public static class SurveySummaryDescriptionDtoBuilder {

    private Integer rating = null;
    private String question = null;
    private String answer = null;
    

    SurveySummaryDescriptionDtoBuilder() {
    }

    /**
     **/
    public SurveySummaryDescriptionDtoBuilder rating(Integer rating) {
      this.rating = rating;
      return this;
    }

    /**
     **/
    public SurveySummaryDescriptionDtoBuilder question(String question) {
      this.question = question;
      return this;
    }

    /**
     **/
    public SurveySummaryDescriptionDtoBuilder answer(String answer) {
      this.answer = answer;
      return this;
    }


    public SurveySummaryDescriptionDto build() {
      SurveySummaryDescriptionDto surveySummaryDescriptionDto = new SurveySummaryDescriptionDto();
      surveySummaryDescriptionDto.setRating(this.rating);
      surveySummaryDescriptionDto.setQuestion(this.question);
      surveySummaryDescriptionDto.setAnswer(this.answer);
      return surveySummaryDescriptionDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SurveySummaryDescriptionDtoBuilder {\n");
      
      sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
      sb.append("    question: ").append(toIndentedString(question)).append("\n");
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

