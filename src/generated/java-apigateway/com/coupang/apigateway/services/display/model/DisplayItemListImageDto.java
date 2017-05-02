package com.coupang.apigateway.services.display.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayItemListImageDto   {
  
  private Integer imageWidth = null;
  private String imageUrl = null;
  private Integer imageHeight = null;
  private String imageCode = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("imageWidth")
  @com.fasterxml.jackson.annotation.JsonProperty("imageWidth")
  public Integer getImageWidth() {
    return imageWidth;
  }
  
  /**
   **/
  public void setImageWidth(Integer imageWidth) {
    this.imageWidth = imageWidth;
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
  @org.codehaus.jackson.annotate.JsonProperty("imageHeight")
  @com.fasterxml.jackson.annotation.JsonProperty("imageHeight")
  public Integer getImageHeight() {
    return imageHeight;
  }
  
  /**
   **/
  public void setImageHeight(Integer imageHeight) {
    this.imageHeight = imageHeight;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("imageCode")
  @com.fasterxml.jackson.annotation.JsonProperty("imageCode")
  public String getImageCode() {
    return imageCode;
  }
  
  /**
   **/
  public void setImageCode(String imageCode) {
    this.imageCode = imageCode;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayItemListImageDto displayItemListImageDto = (DisplayItemListImageDto) o;
    return Objects.equals(this.imageWidth, displayItemListImageDto.imageWidth) &&
        Objects.equals(this.imageUrl, displayItemListImageDto.imageUrl) &&
        Objects.equals(this.imageHeight, displayItemListImageDto.imageHeight) &&
        Objects.equals(this.imageCode, displayItemListImageDto.imageCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageWidth, imageUrl, imageHeight, imageCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayItemListImageDto {\n");
    
    sb.append("    imageWidth: ").append(toIndentedString(imageWidth)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    imageHeight: ").append(toIndentedString(imageHeight)).append("\n");
    sb.append("    imageCode: ").append(toIndentedString(imageCode)).append("\n");
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

  public static DisplayItemListImageDtoBuilder builder() {
    return new DisplayItemListImageDtoBuilder();
  }

  public static class DisplayItemListImageDtoBuilder {

    private Integer imageWidth = null;
    private String imageUrl = null;
    private Integer imageHeight = null;
    private String imageCode = null;
    

    DisplayItemListImageDtoBuilder() {
    }

    /**
     **/
    public DisplayItemListImageDtoBuilder imageWidth(Integer imageWidth) {
      this.imageWidth = imageWidth;
      return this;
    }

    /**
     **/
    public DisplayItemListImageDtoBuilder imageUrl(String imageUrl) {
      this.imageUrl = imageUrl;
      return this;
    }

    /**
     **/
    public DisplayItemListImageDtoBuilder imageHeight(Integer imageHeight) {
      this.imageHeight = imageHeight;
      return this;
    }

    /**
     **/
    public DisplayItemListImageDtoBuilder imageCode(String imageCode) {
      this.imageCode = imageCode;
      return this;
    }


    public DisplayItemListImageDto build() {
      DisplayItemListImageDto displayItemListImageDto = new DisplayItemListImageDto();
      displayItemListImageDto.setImageWidth(this.imageWidth);
      displayItemListImageDto.setImageUrl(this.imageUrl);
      displayItemListImageDto.setImageHeight(this.imageHeight);
      displayItemListImageDto.setImageCode(this.imageCode);
      return displayItemListImageDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayItemListImageDtoBuilder {\n");
      
      sb.append("    imageWidth: ").append(toIndentedString(imageWidth)).append("\n");
      sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
      sb.append("    imageHeight: ").append(toIndentedString(imageHeight)).append("\n");
      sb.append("    imageCode: ").append(toIndentedString(imageCode)).append("\n");
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

