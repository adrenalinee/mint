package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.ReviewHighlightingAttributeDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ReviewHighlightingDto   {
  
  private String bgColor = null;
  private List<ReviewHighlightingAttributeDto> attributes = new ArrayList<ReviewHighlightingAttributeDto>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("bgColor")
  @com.fasterxml.jackson.annotation.JsonProperty("bgColor")
  public String getBgColor() {
    return bgColor;
  }
  
  /**
   **/
  public void setBgColor(String bgColor) {
    this.bgColor = bgColor;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attributes")
  @com.fasterxml.jackson.annotation.JsonProperty("attributes")
  public List<ReviewHighlightingAttributeDto> getAttributes() {
    return attributes;
  }
  
  /**
   **/
  public void setAttributes(List<ReviewHighlightingAttributeDto> attributes) {
    this.attributes = attributes;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewHighlightingDto reviewHighlightingDto = (ReviewHighlightingDto) o;
    return Objects.equals(this.bgColor, reviewHighlightingDto.bgColor) &&
        Objects.equals(this.attributes, reviewHighlightingDto.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bgColor, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewHighlightingDto {\n");
    
    sb.append("    bgColor: ").append(toIndentedString(bgColor)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

  public static ReviewHighlightingDtoBuilder builder() {
    return new ReviewHighlightingDtoBuilder();
  }

  public static class ReviewHighlightingDtoBuilder {

    private String bgColor = null;
    private List<ReviewHighlightingAttributeDto> attributes = new ArrayList<ReviewHighlightingAttributeDto>();
    

    ReviewHighlightingDtoBuilder() {
    }

    /**
     **/
    public ReviewHighlightingDtoBuilder bgColor(String bgColor) {
      this.bgColor = bgColor;
      return this;
    }

    /**
     **/
    public ReviewHighlightingDtoBuilder attributes(List<ReviewHighlightingAttributeDto> attributes) {
      this.attributes = attributes;
      return this;
    }


    public ReviewHighlightingDto build() {
      ReviewHighlightingDto reviewHighlightingDto = new ReviewHighlightingDto();
      reviewHighlightingDto.setBgColor(this.bgColor);
      reviewHighlightingDto.setAttributes(this.attributes);
      return reviewHighlightingDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReviewHighlightingDtoBuilder {\n");
      
      sb.append("    bgColor: ").append(toIndentedString(bgColor)).append("\n");
      sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

