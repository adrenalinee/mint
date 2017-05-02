package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class TravelImageDto   {
  
  private Integer width = null;
  private String url = null;


  public enum TypeEnum {
    IMAGE("IMAGE"),
    TEXT("TEXT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type = null;
  private Integer position = null;
  private String linkUrl = null;


  public enum ImageTypeEnum {
    MAIN("MAIN"),
    BASIC("BASIC"),
    DETAIL("DETAIL"),
    ADDITIONAL("ADDITIONAL");

    private String value;

    ImageTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private ImageTypeEnum imageType = null;
  private Long imageSrl = null;
  private Integer height = null;
  private Long coupangSrl = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("type")
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  
  /**
   **/
  public void setType(TypeEnum type) {
    this.type = type;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("position")
  @com.fasterxml.jackson.annotation.JsonProperty("position")
  public Integer getPosition() {
    return position;
  }
  
  /**
   **/
  public void setPosition(Integer position) {
    this.position = position;
  }
  
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
  @org.codehaus.jackson.annotate.JsonProperty("imageType")
  @com.fasterxml.jackson.annotation.JsonProperty("imageType")
  public ImageTypeEnum getImageType() {
    return imageType;
  }
  
  /**
   **/
  public void setImageType(ImageTypeEnum imageType) {
    this.imageType = imageType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("imageSrl")
  @com.fasterxml.jackson.annotation.JsonProperty("imageSrl")
  public Long getImageSrl() {
    return imageSrl;
  }
  
  /**
   **/
  public void setImageSrl(Long imageSrl) {
    this.imageSrl = imageSrl;
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
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("coupangSrl")
  @com.fasterxml.jackson.annotation.JsonProperty("coupangSrl")
  public Long getCoupangSrl() {
    return coupangSrl;
  }
  
  /**
   **/
  public void setCoupangSrl(Long coupangSrl) {
    this.coupangSrl = coupangSrl;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelImageDto travelImageDto = (TravelImageDto) o;
    return Objects.equals(this.width, travelImageDto.width) &&
        Objects.equals(this.url, travelImageDto.url) &&
        Objects.equals(this.type, travelImageDto.type) &&
        Objects.equals(this.position, travelImageDto.position) &&
        Objects.equals(this.linkUrl, travelImageDto.linkUrl) &&
        Objects.equals(this.imageType, travelImageDto.imageType) &&
        Objects.equals(this.imageSrl, travelImageDto.imageSrl) &&
        Objects.equals(this.height, travelImageDto.height) &&
        Objects.equals(this.coupangSrl, travelImageDto.coupangSrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, url, type, position, linkUrl, imageType, imageSrl, height, coupangSrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelImageDto {\n");
    
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    imageSrl: ").append(toIndentedString(imageSrl)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    coupangSrl: ").append(toIndentedString(coupangSrl)).append("\n");
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

  public static TravelImageDtoBuilder builder() {
    return new TravelImageDtoBuilder();
  }

  public static class TravelImageDtoBuilder {

    private Integer width = null;
    private String url = null;
    private TypeEnum type = null;
    private Integer position = null;
    private String linkUrl = null;
    private ImageTypeEnum imageType = null;
    private Long imageSrl = null;
    private Integer height = null;
    private Long coupangSrl = null;
    

    TravelImageDtoBuilder() {
    }

    /**
     **/
    public TravelImageDtoBuilder width(Integer width) {
      this.width = width;
      return this;
    }

    /**
     **/
    public TravelImageDtoBuilder url(String url) {
      this.url = url;
      return this;
    }

    /**
     **/
    public TravelImageDtoBuilder type(TypeEnum type) {
      this.type = type;
      return this;
    }

    /**
     **/
    public TravelImageDtoBuilder position(Integer position) {
      this.position = position;
      return this;
    }

    /**
     **/
    public TravelImageDtoBuilder linkUrl(String linkUrl) {
      this.linkUrl = linkUrl;
      return this;
    }

    /**
     **/
    public TravelImageDtoBuilder imageType(ImageTypeEnum imageType) {
      this.imageType = imageType;
      return this;
    }

    /**
     **/
    public TravelImageDtoBuilder imageSrl(Long imageSrl) {
      this.imageSrl = imageSrl;
      return this;
    }

    /**
     **/
    public TravelImageDtoBuilder height(Integer height) {
      this.height = height;
      return this;
    }

    /**
     **/
    public TravelImageDtoBuilder coupangSrl(Long coupangSrl) {
      this.coupangSrl = coupangSrl;
      return this;
    }


    public TravelImageDto build() {
      TravelImageDto travelImageDto = new TravelImageDto();
      travelImageDto.setWidth(this.width);
      travelImageDto.setUrl(this.url);
      travelImageDto.setType(this.type);
      travelImageDto.setPosition(this.position);
      travelImageDto.setLinkUrl(this.linkUrl);
      travelImageDto.setImageType(this.imageType);
      travelImageDto.setImageSrl(this.imageSrl);
      travelImageDto.setHeight(this.height);
      travelImageDto.setCoupangSrl(this.coupangSrl);
      return travelImageDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class TravelImageDtoBuilder {\n");
      
      sb.append("    width: ").append(toIndentedString(width)).append("\n");
      sb.append("    url: ").append(toIndentedString(url)).append("\n");
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
      sb.append("    position: ").append(toIndentedString(position)).append("\n");
      sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
      sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
      sb.append("    imageSrl: ").append(toIndentedString(imageSrl)).append("\n");
      sb.append("    height: ").append(toIndentedString(height)).append("\n");
      sb.append("    coupangSrl: ").append(toIndentedString(coupangSrl)).append("\n");
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

