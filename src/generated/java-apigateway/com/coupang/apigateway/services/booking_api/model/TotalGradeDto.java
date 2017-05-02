package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;



/**
 * 호텔 총점
 **/

@io.swagger.annotations.ApiModel(description = "호텔 총점")
@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class TotalGradeDto   {
  
  private java.math.BigDecimal serviceGrade = null;
  private java.math.BigDecimal roomGrade = null;
  private Integer reviewCnt = null;
  private java.math.BigDecimal priceGrade = null;
  private java.math.BigDecimal mealGrade = null;
  private java.math.BigDecimal locationGrade = null;
  private String gradeDescription = null;
  private java.math.BigDecimal grade = null;
  private java.math.BigDecimal etcGrade = null;

  
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
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "총 리뷰 갯수")
  @org.codehaus.jackson.annotate.JsonProperty("reviewCnt")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewCnt")
  public Integer getReviewCnt() {
    return reviewCnt;
  }
  
  /**
   * 총 리뷰 갯수
   **/
  public void setReviewCnt(Integer reviewCnt) {
    this.reviewCnt = reviewCnt;
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
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "리뷰 설명")
  @org.codehaus.jackson.annotate.JsonProperty("gradeDescription")
  @com.fasterxml.jackson.annotation.JsonProperty("gradeDescription")
  public String getGradeDescription() {
    return gradeDescription;
  }
  
  /**
   * 리뷰 설명
   **/
  public void setGradeDescription(String gradeDescription) {
    this.gradeDescription = gradeDescription;
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TotalGradeDto totalGradeDto = (TotalGradeDto) o;
    return Objects.equals(this.serviceGrade, totalGradeDto.serviceGrade) &&
        Objects.equals(this.roomGrade, totalGradeDto.roomGrade) &&
        Objects.equals(this.reviewCnt, totalGradeDto.reviewCnt) &&
        Objects.equals(this.priceGrade, totalGradeDto.priceGrade) &&
        Objects.equals(this.mealGrade, totalGradeDto.mealGrade) &&
        Objects.equals(this.locationGrade, totalGradeDto.locationGrade) &&
        Objects.equals(this.gradeDescription, totalGradeDto.gradeDescription) &&
        Objects.equals(this.grade, totalGradeDto.grade) &&
        Objects.equals(this.etcGrade, totalGradeDto.etcGrade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceGrade, roomGrade, reviewCnt, priceGrade, mealGrade, locationGrade, gradeDescription, grade, etcGrade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TotalGradeDto {\n");
    
    sb.append("    serviceGrade: ").append(toIndentedString(serviceGrade)).append("\n");
    sb.append("    roomGrade: ").append(toIndentedString(roomGrade)).append("\n");
    sb.append("    reviewCnt: ").append(toIndentedString(reviewCnt)).append("\n");
    sb.append("    priceGrade: ").append(toIndentedString(priceGrade)).append("\n");
    sb.append("    mealGrade: ").append(toIndentedString(mealGrade)).append("\n");
    sb.append("    locationGrade: ").append(toIndentedString(locationGrade)).append("\n");
    sb.append("    gradeDescription: ").append(toIndentedString(gradeDescription)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    etcGrade: ").append(toIndentedString(etcGrade)).append("\n");
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

  public static TotalGradeDtoBuilder builder() {
    return new TotalGradeDtoBuilder();
  }

  public static class TotalGradeDtoBuilder {

    private java.math.BigDecimal serviceGrade = null;
    private java.math.BigDecimal roomGrade = null;
    private Integer reviewCnt = null;
    private java.math.BigDecimal priceGrade = null;
    private java.math.BigDecimal mealGrade = null;
    private java.math.BigDecimal locationGrade = null;
    private String gradeDescription = null;
    private java.math.BigDecimal grade = null;
    private java.math.BigDecimal etcGrade = null;
    

    TotalGradeDtoBuilder() {
    }

    /**
     * 호텔 서비스 점수
     **/
    public TotalGradeDtoBuilder serviceGrade(java.math.BigDecimal serviceGrade) {
      this.serviceGrade = serviceGrade;
      return this;
    }

    /**
     * 객실시설 점수
     **/
    public TotalGradeDtoBuilder roomGrade(java.math.BigDecimal roomGrade) {
      this.roomGrade = roomGrade;
      return this;
    }

    /**
     * 총 리뷰 갯수
     **/
    public TotalGradeDtoBuilder reviewCnt(Integer reviewCnt) {
      this.reviewCnt = reviewCnt;
      return this;
    }

    /**
     * 가격대비 만족도 점수
     **/
    public TotalGradeDtoBuilder priceGrade(java.math.BigDecimal priceGrade) {
      this.priceGrade = priceGrade;
      return this;
    }

    /**
     * 식음료 점수
     **/
    public TotalGradeDtoBuilder mealGrade(java.math.BigDecimal mealGrade) {
      this.mealGrade = mealGrade;
      return this;
    }

    /**
     * 접근성(위치) 점수
     **/
    public TotalGradeDtoBuilder locationGrade(java.math.BigDecimal locationGrade) {
      this.locationGrade = locationGrade;
      return this;
    }

    /**
     * 리뷰 설명
     **/
    public TotalGradeDtoBuilder gradeDescription(String gradeDescription) {
      this.gradeDescription = gradeDescription;
      return this;
    }

    /**
     * 리뷰 총점
     **/
    public TotalGradeDtoBuilder grade(java.math.BigDecimal grade) {
      this.grade = grade;
      return this;
    }

    /**
     * 부대시설 점수
     **/
    public TotalGradeDtoBuilder etcGrade(java.math.BigDecimal etcGrade) {
      this.etcGrade = etcGrade;
      return this;
    }


    public TotalGradeDto build() {
      TotalGradeDto totalGradeDto = new TotalGradeDto();
      totalGradeDto.setServiceGrade(this.serviceGrade);
      totalGradeDto.setRoomGrade(this.roomGrade);
      totalGradeDto.setReviewCnt(this.reviewCnt);
      totalGradeDto.setPriceGrade(this.priceGrade);
      totalGradeDto.setMealGrade(this.mealGrade);
      totalGradeDto.setLocationGrade(this.locationGrade);
      totalGradeDto.setGradeDescription(this.gradeDescription);
      totalGradeDto.setGrade(this.grade);
      totalGradeDto.setEtcGrade(this.etcGrade);
      return totalGradeDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class TotalGradeDtoBuilder {\n");
      
      sb.append("    serviceGrade: ").append(toIndentedString(serviceGrade)).append("\n");
      sb.append("    roomGrade: ").append(toIndentedString(roomGrade)).append("\n");
      sb.append("    reviewCnt: ").append(toIndentedString(reviewCnt)).append("\n");
      sb.append("    priceGrade: ").append(toIndentedString(priceGrade)).append("\n");
      sb.append("    mealGrade: ").append(toIndentedString(mealGrade)).append("\n");
      sb.append("    locationGrade: ").append(toIndentedString(locationGrade)).append("\n");
      sb.append("    gradeDescription: ").append(toIndentedString(gradeDescription)).append("\n");
      sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
      sb.append("    etcGrade: ").append(toIndentedString(etcGrade)).append("\n");
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

