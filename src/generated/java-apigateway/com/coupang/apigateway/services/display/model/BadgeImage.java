package com.coupang.apigateway.services.display.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class BadgeImage   {
  
  private Integer width = null;
  private String url = null;
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
  @org.codehaus.jackson.annotate.JsonProperty("url")
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  public String getUrl() {
    return url;
  }
  
  /**
   **/
  public void setUrl(String url) {
    this.url = url;
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
    BadgeImage badgeImage = (BadgeImage) o;
    return Objects.equals(this.width, badgeImage.width) &&
        Objects.equals(this.url, badgeImage.url) &&
        Objects.equals(this.height, badgeImage.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, url, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadgeImage {\n");
    
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

  public static BadgeImageBuilder builder() {
    return new BadgeImageBuilder();
  }

  public static class BadgeImageBuilder {

    private Integer width = null;
    private String url = null;
    private Integer height = null;
    

    BadgeImageBuilder() {
    }

    /**
     **/
    public BadgeImageBuilder width(Integer width) {
      this.width = width;
      return this;
    }

    /**
     **/
    public BadgeImageBuilder url(String url) {
      this.url = url;
      return this;
    }

    /**
     **/
    public BadgeImageBuilder height(Integer height) {
      this.height = height;
      return this;
    }


    public BadgeImage build() {
      BadgeImage badgeImage = new BadgeImage();
      badgeImage.setWidth(this.width);
      badgeImage.setUrl(this.url);
      badgeImage.setHeight(this.height);
      return badgeImage;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BadgeImageBuilder {\n");
      
      sb.append("    width: ").append(toIndentedString(width)).append("\n");
      sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

