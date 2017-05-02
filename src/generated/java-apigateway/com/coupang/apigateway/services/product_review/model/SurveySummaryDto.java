package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.SurveySummaryDescriptionDto;
import com.coupang.apigateway.services.product_review.model.SurveySummaryQuestionDto;
import com.coupang.apigateway.services.product_review.model.SurveySummaryRatingQuestionDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class SurveySummaryDto   {
  
  private List<SurveySummaryRatingQuestionDto> ratingQuestions = new ArrayList<SurveySummaryRatingQuestionDto>();
  private List<SurveySummaryQuestionDto> questions = new ArrayList<SurveySummaryQuestionDto>();
  private List<SurveySummaryDescriptionDto> descriptions = new ArrayList<SurveySummaryDescriptionDto>();
  private String description = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("ratingQuestions")
  @com.fasterxml.jackson.annotation.JsonProperty("ratingQuestions")
  public List<SurveySummaryRatingQuestionDto> getRatingQuestions() {
    return ratingQuestions;
  }
  
  /**
   **/
  public void setRatingQuestions(List<SurveySummaryRatingQuestionDto> ratingQuestions) {
    this.ratingQuestions = ratingQuestions;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("questions")
  @com.fasterxml.jackson.annotation.JsonProperty("questions")
  public List<SurveySummaryQuestionDto> getQuestions() {
    return questions;
  }
  
  /**
   **/
  public void setQuestions(List<SurveySummaryQuestionDto> questions) {
    this.questions = questions;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("descriptions")
  @com.fasterxml.jackson.annotation.JsonProperty("descriptions")
  public List<SurveySummaryDescriptionDto> getDescriptions() {
    return descriptions;
  }
  
  /**
   **/
  public void setDescriptions(List<SurveySummaryDescriptionDto> descriptions) {
    this.descriptions = descriptions;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("description")
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  public String getDescription() {
    return description;
  }
  
  /**
   **/
  public void setDescription(String description) {
    this.description = description;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveySummaryDto surveySummaryDto = (SurveySummaryDto) o;
    return Objects.equals(this.ratingQuestions, surveySummaryDto.ratingQuestions) &&
        Objects.equals(this.questions, surveySummaryDto.questions) &&
        Objects.equals(this.descriptions, surveySummaryDto.descriptions) &&
        Objects.equals(this.description, surveySummaryDto.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratingQuestions, questions, descriptions, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveySummaryDto {\n");
    
    sb.append("    ratingQuestions: ").append(toIndentedString(ratingQuestions)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

  public static SurveySummaryDtoBuilder builder() {
    return new SurveySummaryDtoBuilder();
  }

  public static class SurveySummaryDtoBuilder {

    private List<SurveySummaryRatingQuestionDto> ratingQuestions = new ArrayList<SurveySummaryRatingQuestionDto>();
    private List<SurveySummaryQuestionDto> questions = new ArrayList<SurveySummaryQuestionDto>();
    private List<SurveySummaryDescriptionDto> descriptions = new ArrayList<SurveySummaryDescriptionDto>();
    private String description = null;
    

    SurveySummaryDtoBuilder() {
    }

    /**
     **/
    public SurveySummaryDtoBuilder ratingQuestions(List<SurveySummaryRatingQuestionDto> ratingQuestions) {
      this.ratingQuestions = ratingQuestions;
      return this;
    }

    /**
     **/
    public SurveySummaryDtoBuilder questions(List<SurveySummaryQuestionDto> questions) {
      this.questions = questions;
      return this;
    }

    /**
     **/
    public SurveySummaryDtoBuilder descriptions(List<SurveySummaryDescriptionDto> descriptions) {
      this.descriptions = descriptions;
      return this;
    }

    /**
     **/
    public SurveySummaryDtoBuilder description(String description) {
      this.description = description;
      return this;
    }


    public SurveySummaryDto build() {
      SurveySummaryDto surveySummaryDto = new SurveySummaryDto();
      surveySummaryDto.setRatingQuestions(this.ratingQuestions);
      surveySummaryDto.setQuestions(this.questions);
      surveySummaryDto.setDescriptions(this.descriptions);
      surveySummaryDto.setDescription(this.description);
      return surveySummaryDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SurveySummaryDtoBuilder {\n");
      
      sb.append("    ratingQuestions: ").append(toIndentedString(ratingQuestions)).append("\n");
      sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
      sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

