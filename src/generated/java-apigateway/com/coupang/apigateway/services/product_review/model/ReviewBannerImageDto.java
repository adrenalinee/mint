package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ReviewBannerImageDto   {
  
  private Integer width = null;
  private String imgUrl = null;
  private Integer height = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("width")
  @com.fasterxml.jackson.annotation.JsonProperty("width")
  public Integer getWidth() {
    return width;
  }
  
  /**
   **/
  public void setWidth(Integer width) {
    this.width = width;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("imgUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("imgUrl")
  public String getImgUrl() {
    return imgUrl;
  }
  
  /**
   **/
  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("height")
  @com.fasterxml.jackson.annotation.JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  
  /**
   **/
  public void setHeight(Integer height) {
    this.height = height;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewBannerImageDto reviewBannerImageDto = (ReviewBannerImageDto) o;
    return Objects.equals(this.width, reviewBannerImageDto.width) &&
        Objects.equals(this.imgUrl, reviewBannerImageDto.imgUrl) &&
        Objects.equals(this.height, reviewBannerImageDto.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, imgUrl, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewBannerImageDto {\n");
    
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    imgUrl: ").append(toIndentedString(imgUrl)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

  public static ReviewBannerImageDtoBuilder builder() {
    return new ReviewBannerImageDtoBuilder();
  }

  public static class ReviewBannerImageDtoBuilder {

    private Integer width = null;
    private String imgUrl = null;
    private Integer height = null;
    

    ReviewBannerImageDtoBuilder() {
    }

    /**
     **/
    public ReviewBannerImageDtoBuilder width(Integer width) {
      this.width = width;
      return this;
    }

    /**
     **/
    public ReviewBannerImageDtoBuilder imgUrl(String imgUrl) {
      this.imgUrl = imgUrl;
      return this;
    }

    /**
     **/
    public ReviewBannerImageDtoBuilder height(Integer height) {
      this.height = height;
      return this;
    }


    public ReviewBannerImageDto build() {
      ReviewBannerImageDto reviewBannerImageDto = new ReviewBannerImageDto();
      reviewBannerImageDto.setWidth(this.width);
      reviewBannerImageDto.setImgUrl(this.imgUrl);
      reviewBannerImageDto.setHeight(this.height);
      return reviewBannerImageDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReviewBannerImageDtoBuilder {\n");
      
      sb.append("    width: ").append(toIndentedString(width)).append("\n");
      sb.append("    imgUrl: ").append(toIndentedString(imgUrl)).append("\n");
      sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

