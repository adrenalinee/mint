package com.coupang.apigateway.services.display.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayBannerExtraImageDto   {
  
  private Integer width = null;
  private String imageUrl = null;
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
  @org.codehaus.jackson.annotate.JsonProperty("imageUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("imageUrl")
  public String getImageUrl() {
    return imageUrl;
  }
  
  /**
   **/
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
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
    DisplayBannerExtraImageDto displayBannerExtraImageDto = (DisplayBannerExtraImageDto) o;
    return Objects.equals(this.width, displayBannerExtraImageDto.width) &&
        Objects.equals(this.imageUrl, displayBannerExtraImageDto.imageUrl) &&
        Objects.equals(this.height, displayBannerExtraImageDto.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, imageUrl, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayBannerExtraImageDto {\n");
    
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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

  public static DisplayBannerExtraImageDtoBuilder builder() {
    return new DisplayBannerExtraImageDtoBuilder();
  }

  public static class DisplayBannerExtraImageDtoBuilder {

    private Integer width = null;
    private String imageUrl = null;
    private Integer height = null;
    

    DisplayBannerExtraImageDtoBuilder() {
    }

    /**
     **/
    public DisplayBannerExtraImageDtoBuilder width(Integer width) {
      this.width = width;
      return this;
    }

    /**
     **/
    public DisplayBannerExtraImageDtoBuilder imageUrl(String imageUrl) {
      this.imageUrl = imageUrl;
      return this;
    }

    /**
     **/
    public DisplayBannerExtraImageDtoBuilder height(Integer height) {
      this.height = height;
      return this;
    }


    public DisplayBannerExtraImageDto build() {
      DisplayBannerExtraImageDto displayBannerExtraImageDto = new DisplayBannerExtraImageDto();
      displayBannerExtraImageDto.setWidth(this.width);
      displayBannerExtraImageDto.setImageUrl(this.imageUrl);
      displayBannerExtraImageDto.setHeight(this.height);
      return displayBannerExtraImageDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayBannerExtraImageDtoBuilder {\n");
      
      sb.append("    width: ").append(toIndentedString(width)).append("\n");
      sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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

