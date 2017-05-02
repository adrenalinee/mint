package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import com.coupang.apigateway.services.display.model.DisplayBannerAreaDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayBannerImageDto   {
  
  private Integer ordering = null;
  private Integer imageWidth = null;
  private String imageUrl = null;
  private Long imageId = null;
  private Integer imageHeight = null;
  private List<DisplayBannerAreaDto> areaDtos = new ArrayList<DisplayBannerAreaDto>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("ordering")
  @com.fasterxml.jackson.annotation.JsonProperty("ordering")
  public Integer getOrdering() {
    return ordering;
  }
  
  /**
   **/
  public void setOrdering(Integer ordering) {
    this.ordering = ordering;
  }
  
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
  @org.codehaus.jackson.annotate.JsonProperty("imageId")
  @com.fasterxml.jackson.annotation.JsonProperty("imageId")
  public Long getImageId() {
    return imageId;
  }
  
  /**
   **/
  public void setImageId(Long imageId) {
    this.imageId = imageId;
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
  @org.codehaus.jackson.annotate.JsonProperty("areaDtos")
  @com.fasterxml.jackson.annotation.JsonProperty("areaDtos")
  public List<DisplayBannerAreaDto> getAreaDtos() {
    return areaDtos;
  }
  
  /**
   **/
  public void setAreaDtos(List<DisplayBannerAreaDto> areaDtos) {
    this.areaDtos = areaDtos;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayBannerImageDto displayBannerImageDto = (DisplayBannerImageDto) o;
    return Objects.equals(this.ordering, displayBannerImageDto.ordering) &&
        Objects.equals(this.imageWidth, displayBannerImageDto.imageWidth) &&
        Objects.equals(this.imageUrl, displayBannerImageDto.imageUrl) &&
        Objects.equals(this.imageId, displayBannerImageDto.imageId) &&
        Objects.equals(this.imageHeight, displayBannerImageDto.imageHeight) &&
        Objects.equals(this.areaDtos, displayBannerImageDto.areaDtos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ordering, imageWidth, imageUrl, imageId, imageHeight, areaDtos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayBannerImageDto {\n");
    
    sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
    sb.append("    imageWidth: ").append(toIndentedString(imageWidth)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageHeight: ").append(toIndentedString(imageHeight)).append("\n");
    sb.append("    areaDtos: ").append(toIndentedString(areaDtos)).append("\n");
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

  public static DisplayBannerImageDtoBuilder builder() {
    return new DisplayBannerImageDtoBuilder();
  }

  public static class DisplayBannerImageDtoBuilder {

    private Integer ordering = null;
    private Integer imageWidth = null;
    private String imageUrl = null;
    private Long imageId = null;
    private Integer imageHeight = null;
    private List<DisplayBannerAreaDto> areaDtos = new ArrayList<DisplayBannerAreaDto>();
    

    DisplayBannerImageDtoBuilder() {
    }

    /**
     **/
    public DisplayBannerImageDtoBuilder ordering(Integer ordering) {
      this.ordering = ordering;
      return this;
    }

    /**
     **/
    public DisplayBannerImageDtoBuilder imageWidth(Integer imageWidth) {
      this.imageWidth = imageWidth;
      return this;
    }

    /**
     **/
    public DisplayBannerImageDtoBuilder imageUrl(String imageUrl) {
      this.imageUrl = imageUrl;
      return this;
    }

    /**
     **/
    public DisplayBannerImageDtoBuilder imageId(Long imageId) {
      this.imageId = imageId;
      return this;
    }

    /**
     **/
    public DisplayBannerImageDtoBuilder imageHeight(Integer imageHeight) {
      this.imageHeight = imageHeight;
      return this;
    }

    /**
     **/
    public DisplayBannerImageDtoBuilder areaDtos(List<DisplayBannerAreaDto> areaDtos) {
      this.areaDtos = areaDtos;
      return this;
    }


    public DisplayBannerImageDto build() {
      DisplayBannerImageDto displayBannerImageDto = new DisplayBannerImageDto();
      displayBannerImageDto.setOrdering(this.ordering);
      displayBannerImageDto.setImageWidth(this.imageWidth);
      displayBannerImageDto.setImageUrl(this.imageUrl);
      displayBannerImageDto.setImageId(this.imageId);
      displayBannerImageDto.setImageHeight(this.imageHeight);
      displayBannerImageDto.setAreaDtos(this.areaDtos);
      return displayBannerImageDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayBannerImageDtoBuilder {\n");
      
      sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
      sb.append("    imageWidth: ").append(toIndentedString(imageWidth)).append("\n");
      sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
      sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
      sb.append("    imageHeight: ").append(toIndentedString(imageHeight)).append("\n");
      sb.append("    areaDtos: ").append(toIndentedString(areaDtos)).append("\n");
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

