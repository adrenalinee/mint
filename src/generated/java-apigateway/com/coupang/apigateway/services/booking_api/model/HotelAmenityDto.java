package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class HotelAmenityDto   {
  
  private Integer orderSeq = null;
  private String krName = null;
  private Long hotelId = null;
  private Long hotelAmenityId = null;
  private String engName = null;
  private String amenityType = null;
  private Long amenityId = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("krName")
  @com.fasterxml.jackson.annotation.JsonProperty("krName")
  public String getKrName() {
    return krName;
  }
  
  /**
   **/
  public void setKrName(String krName) {
    this.krName = krName;
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
  @org.codehaus.jackson.annotate.JsonProperty("hotelAmenityId")
  @com.fasterxml.jackson.annotation.JsonProperty("hotelAmenityId")
  public Long getHotelAmenityId() {
    return hotelAmenityId;
  }
  
  /**
   **/
  public void setHotelAmenityId(Long hotelAmenityId) {
    this.hotelAmenityId = hotelAmenityId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("engName")
  @com.fasterxml.jackson.annotation.JsonProperty("engName")
  public String getEngName() {
    return engName;
  }
  
  /**
   **/
  public void setEngName(String engName) {
    this.engName = engName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("amenityType")
  @com.fasterxml.jackson.annotation.JsonProperty("amenityType")
  public String getAmenityType() {
    return amenityType;
  }
  
  /**
   **/
  public void setAmenityType(String amenityType) {
    this.amenityType = amenityType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("amenityId")
  @com.fasterxml.jackson.annotation.JsonProperty("amenityId")
  public Long getAmenityId() {
    return amenityId;
  }
  
  /**
   **/
  public void setAmenityId(Long amenityId) {
    this.amenityId = amenityId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelAmenityDto hotelAmenityDto = (HotelAmenityDto) o;
    return Objects.equals(this.orderSeq, hotelAmenityDto.orderSeq) &&
        Objects.equals(this.krName, hotelAmenityDto.krName) &&
        Objects.equals(this.hotelId, hotelAmenityDto.hotelId) &&
        Objects.equals(this.hotelAmenityId, hotelAmenityDto.hotelAmenityId) &&
        Objects.equals(this.engName, hotelAmenityDto.engName) &&
        Objects.equals(this.amenityType, hotelAmenityDto.amenityType) &&
        Objects.equals(this.amenityId, hotelAmenityDto.amenityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderSeq, krName, hotelId, hotelAmenityId, engName, amenityType, amenityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelAmenityDto {\n");
    
    sb.append("    orderSeq: ").append(toIndentedString(orderSeq)).append("\n");
    sb.append("    krName: ").append(toIndentedString(krName)).append("\n");
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    hotelAmenityId: ").append(toIndentedString(hotelAmenityId)).append("\n");
    sb.append("    engName: ").append(toIndentedString(engName)).append("\n");
    sb.append("    amenityType: ").append(toIndentedString(amenityType)).append("\n");
    sb.append("    amenityId: ").append(toIndentedString(amenityId)).append("\n");
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

  public static HotelAmenityDtoBuilder builder() {
    return new HotelAmenityDtoBuilder();
  }

  public static class HotelAmenityDtoBuilder {

    private Integer orderSeq = null;
    private String krName = null;
    private Long hotelId = null;
    private Long hotelAmenityId = null;
    private String engName = null;
    private String amenityType = null;
    private Long amenityId = null;
    

    HotelAmenityDtoBuilder() {
    }

    /**
     **/
    public HotelAmenityDtoBuilder orderSeq(Integer orderSeq) {
      this.orderSeq = orderSeq;
      return this;
    }

    /**
     **/
    public HotelAmenityDtoBuilder krName(String krName) {
      this.krName = krName;
      return this;
    }

    /**
     **/
    public HotelAmenityDtoBuilder hotelId(Long hotelId) {
      this.hotelId = hotelId;
      return this;
    }

    /**
     **/
    public HotelAmenityDtoBuilder hotelAmenityId(Long hotelAmenityId) {
      this.hotelAmenityId = hotelAmenityId;
      return this;
    }

    /**
     **/
    public HotelAmenityDtoBuilder engName(String engName) {
      this.engName = engName;
      return this;
    }

    /**
     **/
    public HotelAmenityDtoBuilder amenityType(String amenityType) {
      this.amenityType = amenityType;
      return this;
    }

    /**
     **/
    public HotelAmenityDtoBuilder amenityId(Long amenityId) {
      this.amenityId = amenityId;
      return this;
    }


    public HotelAmenityDto build() {
      HotelAmenityDto hotelAmenityDto = new HotelAmenityDto();
      hotelAmenityDto.setOrderSeq(this.orderSeq);
      hotelAmenityDto.setKrName(this.krName);
      hotelAmenityDto.setHotelId(this.hotelId);
      hotelAmenityDto.setHotelAmenityId(this.hotelAmenityId);
      hotelAmenityDto.setEngName(this.engName);
      hotelAmenityDto.setAmenityType(this.amenityType);
      hotelAmenityDto.setAmenityId(this.amenityId);
      return hotelAmenityDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HotelAmenityDtoBuilder {\n");
      
      sb.append("    orderSeq: ").append(toIndentedString(orderSeq)).append("\n");
      sb.append("    krName: ").append(toIndentedString(krName)).append("\n");
      sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
      sb.append("    hotelAmenityId: ").append(toIndentedString(hotelAmenityId)).append("\n");
      sb.append("    engName: ").append(toIndentedString(engName)).append("\n");
      sb.append("    amenityType: ").append(toIndentedString(amenityType)).append("\n");
      sb.append("    amenityId: ").append(toIndentedString(amenityId)).append("\n");
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

