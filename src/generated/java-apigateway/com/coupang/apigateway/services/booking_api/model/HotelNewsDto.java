package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class HotelNewsDto   {
  
  private Date toDate = null;
  private Date fromDate = null;
  private String content = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("toDate")
  @com.fasterxml.jackson.annotation.JsonProperty("toDate")
  public Date getToDate() {
    return toDate;
  }
  
  /**
   **/
  public void setToDate(Date toDate) {
    this.toDate = toDate;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("fromDate")
  @com.fasterxml.jackson.annotation.JsonProperty("fromDate")
  public Date getFromDate() {
    return fromDate;
  }
  
  /**
   **/
  public void setFromDate(Date fromDate) {
    this.fromDate = fromDate;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("content")
  @com.fasterxml.jackson.annotation.JsonProperty("content")
  public String getContent() {
    return content;
  }
  
  /**
   **/
  public void setContent(String content) {
    this.content = content;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelNewsDto hotelNewsDto = (HotelNewsDto) o;
    return Objects.equals(this.toDate, hotelNewsDto.toDate) &&
        Objects.equals(this.fromDate, hotelNewsDto.fromDate) &&
        Objects.equals(this.content, hotelNewsDto.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toDate, fromDate, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelNewsDto {\n");
    
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

  public static HotelNewsDtoBuilder builder() {
    return new HotelNewsDtoBuilder();
  }

  public static class HotelNewsDtoBuilder {

    private Date toDate = null;
    private Date fromDate = null;
    private String content = null;
    

    HotelNewsDtoBuilder() {
    }

    /**
     **/
    public HotelNewsDtoBuilder toDate(Date toDate) {
      this.toDate = toDate;
      return this;
    }

    /**
     **/
    public HotelNewsDtoBuilder fromDate(Date fromDate) {
      this.fromDate = fromDate;
      return this;
    }

    /**
     **/
    public HotelNewsDtoBuilder content(String content) {
      this.content = content;
      return this;
    }


    public HotelNewsDto build() {
      HotelNewsDto hotelNewsDto = new HotelNewsDto();
      hotelNewsDto.setToDate(this.toDate);
      hotelNewsDto.setFromDate(this.fromDate);
      hotelNewsDto.setContent(this.content);
      return hotelNewsDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HotelNewsDtoBuilder {\n");
      
      sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
      sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
      sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

