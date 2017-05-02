package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.booking_api.model.HotelNewsDto;
import java.util.*;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class HotelNoticeDto   {
  
  private List<HotelNewsDto> hotelNewsDtoList = new ArrayList<HotelNewsDto>();
  private String hotelCode = null;
  private String cityNews = null;
  private String cityCode = null;
  private Date baseDate = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("hotelNewsDtoList")
  @com.fasterxml.jackson.annotation.JsonProperty("hotelNewsDtoList")
  public List<HotelNewsDto> getHotelNewsDtoList() {
    return hotelNewsDtoList;
  }
  
  /**
   **/
  public void setHotelNewsDtoList(List<HotelNewsDto> hotelNewsDtoList) {
    this.hotelNewsDtoList = hotelNewsDtoList;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("hotelCode")
  @com.fasterxml.jackson.annotation.JsonProperty("hotelCode")
  public String getHotelCode() {
    return hotelCode;
  }
  
  /**
   **/
  public void setHotelCode(String hotelCode) {
    this.hotelCode = hotelCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("cityNews")
  @com.fasterxml.jackson.annotation.JsonProperty("cityNews")
  public String getCityNews() {
    return cityNews;
  }
  
  /**
   **/
  public void setCityNews(String cityNews) {
    this.cityNews = cityNews;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("cityCode")
  @com.fasterxml.jackson.annotation.JsonProperty("cityCode")
  public String getCityCode() {
    return cityCode;
  }
  
  /**
   **/
  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("baseDate")
  @com.fasterxml.jackson.annotation.JsonProperty("baseDate")
  public Date getBaseDate() {
    return baseDate;
  }
  
  /**
   **/
  public void setBaseDate(Date baseDate) {
    this.baseDate = baseDate;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelNoticeDto hotelNoticeDto = (HotelNoticeDto) o;
    return Objects.equals(this.hotelNewsDtoList, hotelNoticeDto.hotelNewsDtoList) &&
        Objects.equals(this.hotelCode, hotelNoticeDto.hotelCode) &&
        Objects.equals(this.cityNews, hotelNoticeDto.cityNews) &&
        Objects.equals(this.cityCode, hotelNoticeDto.cityCode) &&
        Objects.equals(this.baseDate, hotelNoticeDto.baseDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hotelNewsDtoList, hotelCode, cityNews, cityCode, baseDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelNoticeDto {\n");
    
    sb.append("    hotelNewsDtoList: ").append(toIndentedString(hotelNewsDtoList)).append("\n");
    sb.append("    hotelCode: ").append(toIndentedString(hotelCode)).append("\n");
    sb.append("    cityNews: ").append(toIndentedString(cityNews)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    baseDate: ").append(toIndentedString(baseDate)).append("\n");
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

  public static HotelNoticeDtoBuilder builder() {
    return new HotelNoticeDtoBuilder();
  }

  public static class HotelNoticeDtoBuilder {

    private List<HotelNewsDto> hotelNewsDtoList = new ArrayList<HotelNewsDto>();
    private String hotelCode = null;
    private String cityNews = null;
    private String cityCode = null;
    private Date baseDate = null;
    

    HotelNoticeDtoBuilder() {
    }

    /**
     **/
    public HotelNoticeDtoBuilder hotelNewsDtoList(List<HotelNewsDto> hotelNewsDtoList) {
      this.hotelNewsDtoList = hotelNewsDtoList;
      return this;
    }

    /**
     **/
    public HotelNoticeDtoBuilder hotelCode(String hotelCode) {
      this.hotelCode = hotelCode;
      return this;
    }

    /**
     **/
    public HotelNoticeDtoBuilder cityNews(String cityNews) {
      this.cityNews = cityNews;
      return this;
    }

    /**
     **/
    public HotelNoticeDtoBuilder cityCode(String cityCode) {
      this.cityCode = cityCode;
      return this;
    }

    /**
     **/
    public HotelNoticeDtoBuilder baseDate(Date baseDate) {
      this.baseDate = baseDate;
      return this;
    }


    public HotelNoticeDto build() {
      HotelNoticeDto hotelNoticeDto = new HotelNoticeDto();
      hotelNoticeDto.setHotelNewsDtoList(this.hotelNewsDtoList);
      hotelNoticeDto.setHotelCode(this.hotelCode);
      hotelNoticeDto.setCityNews(this.cityNews);
      hotelNoticeDto.setCityCode(this.cityCode);
      hotelNoticeDto.setBaseDate(this.baseDate);
      return hotelNoticeDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HotelNoticeDtoBuilder {\n");
      
      sb.append("    hotelNewsDtoList: ").append(toIndentedString(hotelNewsDtoList)).append("\n");
      sb.append("    hotelCode: ").append(toIndentedString(hotelCode)).append("\n");
      sb.append("    cityNews: ").append(toIndentedString(cityNews)).append("\n");
      sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
      sb.append("    baseDate: ").append(toIndentedString(baseDate)).append("\n");
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

