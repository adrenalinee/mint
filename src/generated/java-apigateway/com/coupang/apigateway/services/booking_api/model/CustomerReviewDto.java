package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;
import java.util.Date;



/**
 * 고객의 리뷰
 **/

@io.swagger.annotations.ApiModel(description = "고객의 리뷰")
@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class CustomerReviewDto   {
  
  private String writer = null;
  private Date writeDate = null;
  private String traffic = null;
  private String title = null;
  private java.math.BigDecimal serviceGrade = null;
  private java.math.BigDecimal roomGrade = null;
  private String purpose = null;
  private java.math.BigDecimal priceGrade = null;
  private java.math.BigDecimal mealGrade = null;
  private java.math.BigDecimal locationGrade = null;
  private String hotelReview = null;
  private java.math.BigDecimal grade = null;
  private java.math.BigDecimal etcGrade = null;
  private Date checkOutDate = null;
  private Date checkInDate = null;
  private String aroundReview = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "작성자, 예전에는 호텔패스에서 작성자명 없이 리뷰입력이 가능했다고 함.")
  @org.codehaus.jackson.annotate.JsonProperty("writer")
  @com.fasterxml.jackson.annotation.JsonProperty("writer")
  public String getWriter() {
    return writer;
  }
  
  /**
   * 작성자, 예전에는 호텔패스에서 작성자명 없이 리뷰입력이 가능했다고 함.
   **/
  public void setWriter(String writer) {
    this.writer = writer;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "작성일자")
  @org.codehaus.jackson.annotate.JsonProperty("writeDate")
  @com.fasterxml.jackson.annotation.JsonProperty("writeDate")
  public Date getWriteDate() {
    return writeDate;
  }
  
  /**
   * 작성일자
   **/
  public void setWriteDate(Date writeDate) {
    this.writeDate = writeDate;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "위치/교통")
  @org.codehaus.jackson.annotate.JsonProperty("traffic")
  @com.fasterxml.jackson.annotation.JsonProperty("traffic")
  public String getTraffic() {
    return traffic;
  }
  
  /**
   * 위치/교통
   **/
  public void setTraffic(String traffic) {
    this.traffic = traffic;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "제목")
  @org.codehaus.jackson.annotate.JsonProperty("title")
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  public String getTitle() {
    return title;
  }
  
  /**
   * 제목
   **/
  public void setTitle(String title) {
    this.title = title;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "호텔 서비스 점수")
  @org.codehaus.jackson.annotate.JsonProperty("serviceGrade")
  @com.fasterxml.jackson.annotation.JsonProperty("serviceGrade")
  public java.math.BigDecimal getServiceGrade() {
    return serviceGrade;
  }
  
  /**
   * 호텔 서비스 점수
   **/
  public void setServiceGrade(java.math.BigDecimal serviceGrade) {
    this.serviceGrade = serviceGrade;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "객실시설 점수")
  @org.codehaus.jackson.annotate.JsonProperty("roomGrade")
  @com.fasterxml.jackson.annotation.JsonProperty("roomGrade")
  public java.math.BigDecimal getRoomGrade() {
    return roomGrade;
  }
  
  /**
   * 객실시설 점수
   **/
  public void setRoomGrade(java.math.BigDecimal roomGrade) {
    this.roomGrade = roomGrade;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "여행목적")
  @org.codehaus.jackson.annotate.JsonProperty("purpose")
  @com.fasterxml.jackson.annotation.JsonProperty("purpose")
  public String getPurpose() {
    return purpose;
  }
  
  /**
   * 여행목적
   **/
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "가격대비 만족도 점수")
  @org.codehaus.jackson.annotate.JsonProperty("priceGrade")
  @com.fasterxml.jackson.annotation.JsonProperty("priceGrade")
  public java.math.BigDecimal getPriceGrade() {
    return priceGrade;
  }
  
  /**
   * 가격대비 만족도 점수
   **/
  public void setPriceGrade(java.math.BigDecimal priceGrade) {
    this.priceGrade = priceGrade;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "식음료 점수")
  @org.codehaus.jackson.annotate.JsonProperty("mealGrade")
  @com.fasterxml.jackson.annotation.JsonProperty("mealGrade")
  public java.math.BigDecimal getMealGrade() {
    return mealGrade;
  }
  
  /**
   * 식음료 점수
   **/
  public void setMealGrade(java.math.BigDecimal mealGrade) {
    this.mealGrade = mealGrade;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "접근성(위치) 점수")
  @org.codehaus.jackson.annotate.JsonProperty("locationGrade")
  @com.fasterxml.jackson.annotation.JsonProperty("locationGrade")
  public java.math.BigDecimal getLocationGrade() {
    return locationGrade;
  }
  
  /**
   * 접근성(위치) 점수
   **/
  public void setLocationGrade(java.math.BigDecimal locationGrade) {
    this.locationGrade = locationGrade;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "상세정보")
  @org.codehaus.jackson.annotate.JsonProperty("hotelReview")
  @com.fasterxml.jackson.annotation.JsonProperty("hotelReview")
  public String getHotelReview() {
    return hotelReview;
  }
  
  /**
   * 상세정보
   **/
  public void setHotelReview(String hotelReview) {
    this.hotelReview = hotelReview;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "리뷰 총점")
  @org.codehaus.jackson.annotate.JsonProperty("grade")
  @com.fasterxml.jackson.annotation.JsonProperty("grade")
  public java.math.BigDecimal getGrade() {
    return grade;
  }
  
  /**
   * 리뷰 총점
   **/
  public void setGrade(java.math.BigDecimal grade) {
    this.grade = grade;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "부대시설 점수")
  @org.codehaus.jackson.annotate.JsonProperty("etcGrade")
  @com.fasterxml.jackson.annotation.JsonProperty("etcGrade")
  public java.math.BigDecimal getEtcGrade() {
    return etcGrade;
  }
  
  /**
   * 부대시설 점수
   **/
  public void setEtcGrade(java.math.BigDecimal etcGrade) {
    this.etcGrade = etcGrade;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "체크아웃일자")
  @org.codehaus.jackson.annotate.JsonProperty("checkOutDate")
  @com.fasterxml.jackson.annotation.JsonProperty("checkOutDate")
  public Date getCheckOutDate() {
    return checkOutDate;
  }
  
  /**
   * 체크아웃일자
   **/
  public void setCheckOutDate(Date checkOutDate) {
    this.checkOutDate = checkOutDate;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "체크인일자")
  @org.codehaus.jackson.annotate.JsonProperty("checkInDate")
  @com.fasterxml.jackson.annotation.JsonProperty("checkInDate")
  public Date getCheckInDate() {
    return checkInDate;
  }
  
  /**
   * 체크인일자
   **/
  public void setCheckInDate(Date checkInDate) {
    this.checkInDate = checkInDate;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "주변정보")
  @org.codehaus.jackson.annotate.JsonProperty("aroundReview")
  @com.fasterxml.jackson.annotation.JsonProperty("aroundReview")
  public String getAroundReview() {
    return aroundReview;
  }
  
  /**
   * 주변정보
   **/
  public void setAroundReview(String aroundReview) {
    this.aroundReview = aroundReview;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerReviewDto customerReviewDto = (CustomerReviewDto) o;
    return Objects.equals(this.writer, customerReviewDto.writer) &&
        Objects.equals(this.writeDate, customerReviewDto.writeDate) &&
        Objects.equals(this.traffic, customerReviewDto.traffic) &&
        Objects.equals(this.title, customerReviewDto.title) &&
        Objects.equals(this.serviceGrade, customerReviewDto.serviceGrade) &&
        Objects.equals(this.roomGrade, customerReviewDto.roomGrade) &&
        Objects.equals(this.purpose, customerReviewDto.purpose) &&
        Objects.equals(this.priceGrade, customerReviewDto.priceGrade) &&
        Objects.equals(this.mealGrade, customerReviewDto.mealGrade) &&
        Objects.equals(this.locationGrade, customerReviewDto.locationGrade) &&
        Objects.equals(this.hotelReview, customerReviewDto.hotelReview) &&
        Objects.equals(this.grade, customerReviewDto.grade) &&
        Objects.equals(this.etcGrade, customerReviewDto.etcGrade) &&
        Objects.equals(this.checkOutDate, customerReviewDto.checkOutDate) &&
        Objects.equals(this.checkInDate, customerReviewDto.checkInDate) &&
        Objects.equals(this.aroundReview, customerReviewDto.aroundReview);
  }

  @Override
  public int hashCode() {
    return Objects.hash(writer, writeDate, traffic, title, serviceGrade, roomGrade, purpose, priceGrade, mealGrade, locationGrade, hotelReview, grade, etcGrade, checkOutDate, checkInDate, aroundReview);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerReviewDto {\n");
    
    sb.append("    writer: ").append(toIndentedString(writer)).append("\n");
    sb.append("    writeDate: ").append(toIndentedString(writeDate)).append("\n");
    sb.append("    traffic: ").append(toIndentedString(traffic)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    serviceGrade: ").append(toIndentedString(serviceGrade)).append("\n");
    sb.append("    roomGrade: ").append(toIndentedString(roomGrade)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    priceGrade: ").append(toIndentedString(priceGrade)).append("\n");
    sb.append("    mealGrade: ").append(toIndentedString(mealGrade)).append("\n");
    sb.append("    locationGrade: ").append(toIndentedString(locationGrade)).append("\n");
    sb.append("    hotelReview: ").append(toIndentedString(hotelReview)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    etcGrade: ").append(toIndentedString(etcGrade)).append("\n");
    sb.append("    checkOutDate: ").append(toIndentedString(checkOutDate)).append("\n");
    sb.append("    checkInDate: ").append(toIndentedString(checkInDate)).append("\n");
    sb.append("    aroundReview: ").append(toIndentedString(aroundReview)).append("\n");
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

  public static CustomerReviewDtoBuilder builder() {
    return new CustomerReviewDtoBuilder();
  }

  public static class CustomerReviewDtoBuilder {

    private String writer = null;
    private Date writeDate = null;
    private String traffic = null;
    private String title = null;
    private java.math.BigDecimal serviceGrade = null;
    private java.math.BigDecimal roomGrade = null;
    private String purpose = null;
    private java.math.BigDecimal priceGrade = null;
    private java.math.BigDecimal mealGrade = null;
    private java.math.BigDecimal locationGrade = null;
    private String hotelReview = null;
    private java.math.BigDecimal grade = null;
    private java.math.BigDecimal etcGrade = null;
    private Date checkOutDate = null;
    private Date checkInDate = null;
    private String aroundReview = null;
    

    CustomerReviewDtoBuilder() {
    }

    /**
     * 작성자, 예전에는 호텔패스에서 작성자명 없이 리뷰입력이 가능했다고 함.
     **/
    public CustomerReviewDtoBuilder writer(String writer) {
      this.writer = writer;
      return this;
    }

    /**
     * 작성일자
     **/
    public CustomerReviewDtoBuilder writeDate(Date writeDate) {
      this.writeDate = writeDate;
      return this;
    }

    /**
     * 위치/교통
     **/
    public CustomerReviewDtoBuilder traffic(String traffic) {
      this.traffic = traffic;
      return this;
    }

    /**
     * 제목
     **/
    public CustomerReviewDtoBuilder title(String title) {
      this.title = title;
      return this;
    }

    /**
     * 호텔 서비스 점수
     **/
    public CustomerReviewDtoBuilder serviceGrade(java.math.BigDecimal serviceGrade) {
      this.serviceGrade = serviceGrade;
      return this;
    }

    /**
     * 객실시설 점수
     **/
    public CustomerReviewDtoBuilder roomGrade(java.math.BigDecimal roomGrade) {
      this.roomGrade = roomGrade;
      return this;
    }

    /**
     * 여행목적
     **/
    public CustomerReviewDtoBuilder purpose(String purpose) {
      this.purpose = purpose;
      return this;
    }

    /**
     * 가격대비 만족도 점수
     **/
    public CustomerReviewDtoBuilder priceGrade(java.math.BigDecimal priceGrade) {
      this.priceGrade = priceGrade;
      return this;
    }

    /**
     * 식음료 점수
     **/
    public CustomerReviewDtoBuilder mealGrade(java.math.BigDecimal mealGrade) {
      this.mealGrade = mealGrade;
      return this;
    }

    /**
     * 접근성(위치) 점수
     **/
    public CustomerReviewDtoBuilder locationGrade(java.math.BigDecimal locationGrade) {
      this.locationGrade = locationGrade;
      return this;
    }

    /**
     * 상세정보
     **/
    public CustomerReviewDtoBuilder hotelReview(String hotelReview) {
      this.hotelReview = hotelReview;
      return this;
    }

    /**
     * 리뷰 총점
     **/
    public CustomerReviewDtoBuilder grade(java.math.BigDecimal grade) {
      this.grade = grade;
      return this;
    }

    /**
     * 부대시설 점수
     **/
    public CustomerReviewDtoBuilder etcGrade(java.math.BigDecimal etcGrade) {
      this.etcGrade = etcGrade;
      return this;
    }

    /**
     * 체크아웃일자
     **/
    public CustomerReviewDtoBuilder checkOutDate(Date checkOutDate) {
      this.checkOutDate = checkOutDate;
      return this;
    }

    /**
     * 체크인일자
     **/
    public CustomerReviewDtoBuilder checkInDate(Date checkInDate) {
      this.checkInDate = checkInDate;
      return this;
    }

    /**
     * 주변정보
     **/
    public CustomerReviewDtoBuilder aroundReview(String aroundReview) {
      this.aroundReview = aroundReview;
      return this;
    }


    public CustomerReviewDto build() {
      CustomerReviewDto customerReviewDto = new CustomerReviewDto();
      customerReviewDto.setWriter(this.writer);
      customerReviewDto.setWriteDate(this.writeDate);
      customerReviewDto.setTraffic(this.traffic);
      customerReviewDto.setTitle(this.title);
      customerReviewDto.setServiceGrade(this.serviceGrade);
      customerReviewDto.setRoomGrade(this.roomGrade);
      customerReviewDto.setPurpose(this.purpose);
      customerReviewDto.setPriceGrade(this.priceGrade);
      customerReviewDto.setMealGrade(this.mealGrade);
      customerReviewDto.setLocationGrade(this.locationGrade);
      customerReviewDto.setHotelReview(this.hotelReview);
      customerReviewDto.setGrade(this.grade);
      customerReviewDto.setEtcGrade(this.etcGrade);
      customerReviewDto.setCheckOutDate(this.checkOutDate);
      customerReviewDto.setCheckInDate(this.checkInDate);
      customerReviewDto.setAroundReview(this.aroundReview);
      return customerReviewDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CustomerReviewDtoBuilder {\n");
      
      sb.append("    writer: ").append(toIndentedString(writer)).append("\n");
      sb.append("    writeDate: ").append(toIndentedString(writeDate)).append("\n");
      sb.append("    traffic: ").append(toIndentedString(traffic)).append("\n");
      sb.append("    title: ").append(toIndentedString(title)).append("\n");
      sb.append("    serviceGrade: ").append(toIndentedString(serviceGrade)).append("\n");
      sb.append("    roomGrade: ").append(toIndentedString(roomGrade)).append("\n");
      sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
      sb.append("    priceGrade: ").append(toIndentedString(priceGrade)).append("\n");
      sb.append("    mealGrade: ").append(toIndentedString(mealGrade)).append("\n");
      sb.append("    locationGrade: ").append(toIndentedString(locationGrade)).append("\n");
      sb.append("    hotelReview: ").append(toIndentedString(hotelReview)).append("\n");
      sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
      sb.append("    etcGrade: ").append(toIndentedString(etcGrade)).append("\n");
      sb.append("    checkOutDate: ").append(toIndentedString(checkOutDate)).append("\n");
      sb.append("    checkInDate: ").append(toIndentedString(checkInDate)).append("\n");
      sb.append("    aroundReview: ").append(toIndentedString(aroundReview)).append("\n");
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

