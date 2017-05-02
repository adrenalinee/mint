package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ReviewCategoryTooltipDto   {
  
  private String tooltip = null;
  private String landingUrl = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("tooltip")
  @com.fasterxml.jackson.annotation.JsonProperty("tooltip")
  public String getTooltip() {
    return tooltip;
  }
  
  /**
   **/
  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("landingUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("landingUrl")
  public String getLandingUrl() {
    return landingUrl;
  }
  
  /**
   **/
  public void setLandingUrl(String landingUrl) {
    this.landingUrl = landingUrl;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewCategoryTooltipDto reviewCategoryTooltipDto = (ReviewCategoryTooltipDto) o;
    return Objects.equals(this.tooltip, reviewCategoryTooltipDto.tooltip) &&
        Objects.equals(this.landingUrl, reviewCategoryTooltipDto.landingUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tooltip, landingUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewCategoryTooltipDto {\n");
    
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
    sb.append("    landingUrl: ").append(toIndentedString(landingUrl)).append("\n");
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

  public static ReviewCategoryTooltipDtoBuilder builder() {
    return new ReviewCategoryTooltipDtoBuilder();
  }

  public static class ReviewCategoryTooltipDtoBuilder {

    private String tooltip = null;
    private String landingUrl = null;
    

    ReviewCategoryTooltipDtoBuilder() {
    }

    /**
     **/
    public ReviewCategoryTooltipDtoBuilder tooltip(String tooltip) {
      this.tooltip = tooltip;
      return this;
    }

    /**
     **/
    public ReviewCategoryTooltipDtoBuilder landingUrl(String landingUrl) {
      this.landingUrl = landingUrl;
      return this;
    }


    public ReviewCategoryTooltipDto build() {
      ReviewCategoryTooltipDto reviewCategoryTooltipDto = new ReviewCategoryTooltipDto();
      reviewCategoryTooltipDto.setTooltip(this.tooltip);
      reviewCategoryTooltipDto.setLandingUrl(this.landingUrl);
      return reviewCategoryTooltipDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReviewCategoryTooltipDtoBuilder {\n");
      
      sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
      sb.append("    landingUrl: ").append(toIndentedString(landingUrl)).append("\n");
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

