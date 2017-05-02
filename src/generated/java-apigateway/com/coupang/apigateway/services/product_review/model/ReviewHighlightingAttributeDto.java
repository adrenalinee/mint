package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ReviewHighlightingAttributeDto   {
  
  private Integer startAt = null;
  private Integer length = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("startAt")
  @com.fasterxml.jackson.annotation.JsonProperty("startAt")
  public Integer getStartAt() {
    return startAt;
  }
  
  /**
   **/
  public void setStartAt(Integer startAt) {
    this.startAt = startAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("length")
  @com.fasterxml.jackson.annotation.JsonProperty("length")
  public Integer getLength() {
    return length;
  }
  
  /**
   **/
  public void setLength(Integer length) {
    this.length = length;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewHighlightingAttributeDto reviewHighlightingAttributeDto = (ReviewHighlightingAttributeDto) o;
    return Objects.equals(this.startAt, reviewHighlightingAttributeDto.startAt) &&
        Objects.equals(this.length, reviewHighlightingAttributeDto.length);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startAt, length);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewHighlightingAttributeDto {\n");
    
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
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

  public static ReviewHighlightingAttributeDtoBuilder builder() {
    return new ReviewHighlightingAttributeDtoBuilder();
  }

  public static class ReviewHighlightingAttributeDtoBuilder {

    private Integer startAt = null;
    private Integer length = null;
    

    ReviewHighlightingAttributeDtoBuilder() {
    }

    /**
     **/
    public ReviewHighlightingAttributeDtoBuilder startAt(Integer startAt) {
      this.startAt = startAt;
      return this;
    }

    /**
     **/
    public ReviewHighlightingAttributeDtoBuilder length(Integer length) {
      this.length = length;
      return this;
    }


    public ReviewHighlightingAttributeDto build() {
      ReviewHighlightingAttributeDto reviewHighlightingAttributeDto = new ReviewHighlightingAttributeDto();
      reviewHighlightingAttributeDto.setStartAt(this.startAt);
      reviewHighlightingAttributeDto.setLength(this.length);
      return reviewHighlightingAttributeDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReviewHighlightingAttributeDtoBuilder {\n");
      
      sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
      sb.append("    length: ").append(toIndentedString(length)).append("\n");
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

