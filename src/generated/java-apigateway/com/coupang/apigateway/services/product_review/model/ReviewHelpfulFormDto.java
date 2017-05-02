package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ReviewHelpfulFormDto   {
  
  private Boolean helpful = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("helpful")
  @com.fasterxml.jackson.annotation.JsonProperty("helpful")
  public Boolean getHelpful() {
    return helpful;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isHelpful() {
    return helpful == null ? false : helpful;
  }
  
  /**
   **/
  public void setHelpful(Boolean helpful) {
    this.helpful = helpful;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewHelpfulFormDto reviewHelpfulFormDto = (ReviewHelpfulFormDto) o;
    return Objects.equals(this.helpful, reviewHelpfulFormDto.helpful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(helpful);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewHelpfulFormDto {\n");
    
    sb.append("    helpful: ").append(toIndentedString(helpful)).append("\n");
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

  public static ReviewHelpfulFormDtoBuilder builder() {
    return new ReviewHelpfulFormDtoBuilder();
  }

  public static class ReviewHelpfulFormDtoBuilder {

    private Boolean helpful = null;
    

    ReviewHelpfulFormDtoBuilder() {
    }

    /**
     **/
    public ReviewHelpfulFormDtoBuilder helpful(Boolean helpful) {
      this.helpful = helpful;
      return this;
    }


    public ReviewHelpfulFormDto build() {
      ReviewHelpfulFormDto reviewHelpfulFormDto = new ReviewHelpfulFormDto();
      reviewHelpfulFormDto.setHelpful(this.helpful);
      return reviewHelpfulFormDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReviewHelpfulFormDtoBuilder {\n");
      
      sb.append("    helpful: ").append(toIndentedString(helpful)).append("\n");
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

