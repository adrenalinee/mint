package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class SurveySummaryAnswerDto   {
  
  private Integer rating = null;
  private Long count = null;
  private Boolean best = null;
  private Long answerSetId = null;
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
  @org.codehaus.jackson.annotate.JsonProperty("best")
  @com.fasterxml.jackson.annotation.JsonProperty("best")
  public Boolean getBest() {
    return best;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isBest() {
    return best == null ? false : best;
  }
  
  /**
   **/
  public void setBest(Boolean best) {
    this.best = best;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("answerSetId")
  @com.fasterxml.jackson.annotation.JsonProperty("answerSetId")
  public Long getAnswerSetId() {
    return answerSetId;
  }
  
  /**
   **/
  public void setAnswerSetId(Long answerSetId) {
    this.answerSetId = answerSetId;
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
    SurveySummaryAnswerDto surveySummaryAnswerDto = (SurveySummaryAnswerDto) o;
    return Objects.equals(this.rating, surveySummaryAnswerDto.rating) &&
        Objects.equals(this.count, surveySummaryAnswerDto.count) &&
        Objects.equals(this.best, surveySummaryAnswerDto.best) &&
        Objects.equals(this.answerSetId, surveySummaryAnswerDto.answerSetId) &&
        Objects.equals(this.answer, surveySummaryAnswerDto.answer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rating, count, best, answerSetId, answer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveySummaryAnswerDto {\n");
    
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    best: ").append(toIndentedString(best)).append("\n");
    sb.append("    answerSetId: ").append(toIndentedString(answerSetId)).append("\n");
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

  public static SurveySummaryAnswerDtoBuilder builder() {
    return new SurveySummaryAnswerDtoBuilder();
  }

  public static class SurveySummaryAnswerDtoBuilder {

    private Integer rating = null;
    private Long count = null;
    private Boolean best = null;
    private Long answerSetId = null;
    private String answer = null;
    

    SurveySummaryAnswerDtoBuilder() {
    }

    /**
     **/
    public SurveySummaryAnswerDtoBuilder rating(Integer rating) {
      this.rating = rating;
      return this;
    }

    /**
     **/
    public SurveySummaryAnswerDtoBuilder count(Long count) {
      this.count = count;
      return this;
    }

    /**
     **/
    public SurveySummaryAnswerDtoBuilder best(Boolean best) {
      this.best = best;
      return this;
    }

    /**
     **/
    public SurveySummaryAnswerDtoBuilder answerSetId(Long answerSetId) {
      this.answerSetId = answerSetId;
      return this;
    }

    /**
     **/
    public SurveySummaryAnswerDtoBuilder answer(String answer) {
      this.answer = answer;
      return this;
    }


    public SurveySummaryAnswerDto build() {
      SurveySummaryAnswerDto surveySummaryAnswerDto = new SurveySummaryAnswerDto();
      surveySummaryAnswerDto.setRating(this.rating);
      surveySummaryAnswerDto.setCount(this.count);
      surveySummaryAnswerDto.setBest(this.best);
      surveySummaryAnswerDto.setAnswerSetId(this.answerSetId);
      surveySummaryAnswerDto.setAnswer(this.answer);
      return surveySummaryAnswerDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SurveySummaryAnswerDtoBuilder {\n");
      
      sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
      sb.append("    count: ").append(toIndentedString(count)).append("\n");
      sb.append("    best: ").append(toIndentedString(best)).append("\n");
      sb.append("    answerSetId: ").append(toIndentedString(answerSetId)).append("\n");
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

