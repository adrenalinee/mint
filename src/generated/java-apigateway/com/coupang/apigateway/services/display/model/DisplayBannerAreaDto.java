package com.coupang.apigateway.services.display.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayBannerAreaDto   {
  
  private String linkUrl = null;
  private String coords = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("linkUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("linkUrl")
  public String getLinkUrl() {
    return linkUrl;
  }
  
  /**
   **/
  public void setLinkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("coords")
  @com.fasterxml.jackson.annotation.JsonProperty("coords")
  public String getCoords() {
    return coords;
  }
  
  /**
   **/
  public void setCoords(String coords) {
    this.coords = coords;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayBannerAreaDto displayBannerAreaDto = (DisplayBannerAreaDto) o;
    return Objects.equals(this.linkUrl, displayBannerAreaDto.linkUrl) &&
        Objects.equals(this.coords, displayBannerAreaDto.coords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkUrl, coords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayBannerAreaDto {\n");
    
    sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
    sb.append("    coords: ").append(toIndentedString(coords)).append("\n");
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

  public static DisplayBannerAreaDtoBuilder builder() {
    return new DisplayBannerAreaDtoBuilder();
  }

  public static class DisplayBannerAreaDtoBuilder {

    private String linkUrl = null;
    private String coords = null;
    

    DisplayBannerAreaDtoBuilder() {
    }

    /**
     **/
    public DisplayBannerAreaDtoBuilder linkUrl(String linkUrl) {
      this.linkUrl = linkUrl;
      return this;
    }

    /**
     **/
    public DisplayBannerAreaDtoBuilder coords(String coords) {
      this.coords = coords;
      return this;
    }


    public DisplayBannerAreaDto build() {
      DisplayBannerAreaDto displayBannerAreaDto = new DisplayBannerAreaDto();
      displayBannerAreaDto.setLinkUrl(this.linkUrl);
      displayBannerAreaDto.setCoords(this.coords);
      return displayBannerAreaDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayBannerAreaDtoBuilder {\n");
      
      sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
      sb.append("    coords: ").append(toIndentedString(coords)).append("\n");
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

