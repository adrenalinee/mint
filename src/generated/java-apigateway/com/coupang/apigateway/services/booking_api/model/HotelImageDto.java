package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class HotelImageDto   {
  
  private Integer width = null;
  private String sourceImageUrl = null;
  private Boolean representative = null;
  private Integer orderSeq = null;
  private String imageContentType = null;
  private Long hotelImageId = null;
  private Long hotelId = null;
  private Integer height = null;
  private String description = null;
  private String cdnImagePath = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("sourceImageUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("sourceImageUrl")
  public String getSourceImageUrl() {
    return sourceImageUrl;
  }
  
  /**
   **/
  public void setSourceImageUrl(String sourceImageUrl) {
    this.sourceImageUrl = sourceImageUrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("representative")
  @com.fasterxml.jackson.annotation.JsonProperty("representative")
  public Boolean getRepresentative() {
    return representative;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isRepresentative() {
    return representative == null ? false : representative;
  }
  
  /**
   **/
  public void setRepresentative(Boolean representative) {
    this.representative = representative;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("orderSeq")
  @com.fasterxml.jackson.annotation.JsonProperty("orderSeq")
  public Integer getOrderSeq() {
    return orderSeq;
  }
  
  /**
   **/
  public void setOrderSeq(Integer orderSeq) {
    this.orderSeq = orderSeq;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("imageContentType")
  @com.fasterxml.jackson.annotation.JsonProperty("imageContentType")
  public String getImageContentType() {
    return imageContentType;
  }
  
  /**
   **/
  public void setImageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("hotelImageId")
  @com.fasterxml.jackson.annotation.JsonProperty("hotelImageId")
  public Long getHotelImageId() {
    return hotelImageId;
  }
  
  /**
   **/
  public void setHotelImageId(Long hotelImageId) {
    this.hotelImageId = hotelImageId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("hotelId")
  @com.fasterxml.jackson.annotation.JsonProperty("hotelId")
  public Long getHotelId() {
    return hotelId;
  }
  
  /**
   **/
  public void setHotelId(Long hotelId) {
    this.hotelId = hotelId;
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
  @org.codehaus.jackson.annotate.JsonProperty("description")
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  public String getDescription() {
    return description;
  }
  
  /**
   **/
  public void setDescription(String description) {
    this.description = description;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("cdnImagePath")
  @com.fasterxml.jackson.annotation.JsonProperty("cdnImagePath")
  public String getCdnImagePath() {
    return cdnImagePath;
  }
  
  /**
   **/
  public void setCdnImagePath(String cdnImagePath) {
    this.cdnImagePath = cdnImagePath;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelImageDto hotelImageDto = (HotelImageDto) o;
    return Objects.equals(this.width, hotelImageDto.width) &&
        Objects.equals(this.sourceImageUrl, hotelImageDto.sourceImageUrl) &&
        Objects.equals(this.representative, hotelImageDto.representative) &&
        Objects.equals(this.orderSeq, hotelImageDto.orderSeq) &&
        Objects.equals(this.imageContentType, hotelImageDto.imageContentType) &&
        Objects.equals(this.hotelImageId, hotelImageDto.hotelImageId) &&
        Objects.equals(this.hotelId, hotelImageDto.hotelId) &&
        Objects.equals(this.height, hotelImageDto.height) &&
        Objects.equals(this.description, hotelImageDto.description) &&
        Objects.equals(this.cdnImagePath, hotelImageDto.cdnImagePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, sourceImageUrl, representative, orderSeq, imageContentType, hotelImageId, hotelId, height, description, cdnImagePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelImageDto {\n");
    
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    sourceImageUrl: ").append(toIndentedString(sourceImageUrl)).append("\n");
    sb.append("    representative: ").append(toIndentedString(representative)).append("\n");
    sb.append("    orderSeq: ").append(toIndentedString(orderSeq)).append("\n");
    sb.append("    imageContentType: ").append(toIndentedString(imageContentType)).append("\n");
    sb.append("    hotelImageId: ").append(toIndentedString(hotelImageId)).append("\n");
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cdnImagePath: ").append(toIndentedString(cdnImagePath)).append("\n");
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

  public static HotelImageDtoBuilder builder() {
    return new HotelImageDtoBuilder();
  }

  public static class HotelImageDtoBuilder {

    private Integer width = null;
    private String sourceImageUrl = null;
    private Boolean representative = null;
    private Integer orderSeq = null;
    private String imageContentType = null;
    private Long hotelImageId = null;
    private Long hotelId = null;
    private Integer height = null;
    private String description = null;
    private String cdnImagePath = null;
    

    HotelImageDtoBuilder() {
    }

    /**
     **/
    public HotelImageDtoBuilder width(Integer width) {
      this.width = width;
      return this;
    }

    /**
     **/
    public HotelImageDtoBuilder sourceImageUrl(String sourceImageUrl) {
      this.sourceImageUrl = sourceImageUrl;
      return this;
    }

    /**
     **/
    public HotelImageDtoBuilder representative(Boolean representative) {
      this.representative = representative;
      return this;
    }

    /**
     **/
    public HotelImageDtoBuilder orderSeq(Integer orderSeq) {
      this.orderSeq = orderSeq;
      return this;
    }

    /**
     **/
    public HotelImageDtoBuilder imageContentType(String imageContentType) {
      this.imageContentType = imageContentType;
      return this;
    }

    /**
     **/
    public HotelImageDtoBuilder hotelImageId(Long hotelImageId) {
      this.hotelImageId = hotelImageId;
      return this;
    }

    /**
     **/
    public HotelImageDtoBuilder hotelId(Long hotelId) {
      this.hotelId = hotelId;
      return this;
    }

    /**
     **/
    public HotelImageDtoBuilder height(Integer height) {
      this.height = height;
      return this;
    }

    /**
     **/
    public HotelImageDtoBuilder description(String description) {
      this.description = description;
      return this;
    }

    /**
     **/
    public HotelImageDtoBuilder cdnImagePath(String cdnImagePath) {
      this.cdnImagePath = cdnImagePath;
      return this;
    }


    public HotelImageDto build() {
      HotelImageDto hotelImageDto = new HotelImageDto();
      hotelImageDto.setWidth(this.width);
      hotelImageDto.setSourceImageUrl(this.sourceImageUrl);
      hotelImageDto.setRepresentative(this.representative);
      hotelImageDto.setOrderSeq(this.orderSeq);
      hotelImageDto.setImageContentType(this.imageContentType);
      hotelImageDto.setHotelImageId(this.hotelImageId);
      hotelImageDto.setHotelId(this.hotelId);
      hotelImageDto.setHeight(this.height);
      hotelImageDto.setDescription(this.description);
      hotelImageDto.setCdnImagePath(this.cdnImagePath);
      return hotelImageDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HotelImageDtoBuilder {\n");
      
      sb.append("    width: ").append(toIndentedString(width)).append("\n");
      sb.append("    sourceImageUrl: ").append(toIndentedString(sourceImageUrl)).append("\n");
      sb.append("    representative: ").append(toIndentedString(representative)).append("\n");
      sb.append("    orderSeq: ").append(toIndentedString(orderSeq)).append("\n");
      sb.append("    imageContentType: ").append(toIndentedString(imageContentType)).append("\n");
      sb.append("    hotelImageId: ").append(toIndentedString(hotelImageId)).append("\n");
      sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
      sb.append("    height: ").append(toIndentedString(height)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
      sb.append("    cdnImagePath: ").append(toIndentedString(cdnImagePath)).append("\n");
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

