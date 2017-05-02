package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class HotelListDto   {
  
  private Integer totalReviewCount = null;
  private String reviewScoreDescription = null;
  private java.math.BigDecimal reviewScore = null;
  private String promotion = null;
  private Long productId = null;
  private String locationText = null;
  private java.math.BigDecimal lng = null;
  private java.math.BigDecimal lat = null;
  private String lastBookingDescription = null;
  private String krName = null;
  private String imageUrl = null;
  private Integer imageOriginWidth = null;
  private Integer imageOriginHeight = null;
  private java.math.BigDecimal grade = null;
  private String engName = null;
  private String address = null;

  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "호텔리뷰개수")
  @org.codehaus.jackson.annotate.JsonProperty("totalReviewCount")
  @com.fasterxml.jackson.annotation.JsonProperty("totalReviewCount")
  public Integer getTotalReviewCount() {
    return totalReviewCount;
  }
  
  /**
   * 호텔리뷰개수
   **/
  public void setTotalReviewCount(Integer totalReviewCount) {
    this.totalReviewCount = totalReviewCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "호텔리뷰총점 텍스트. 예제 : 매우 좋음.")
  @org.codehaus.jackson.annotate.JsonProperty("reviewScoreDescription")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewScoreDescription")
  public String getReviewScoreDescription() {
    return reviewScoreDescription;
  }
  
  /**
   * 호텔리뷰총점 텍스트. 예제 : 매우 좋음.
   **/
  public void setReviewScoreDescription(String reviewScoreDescription) {
    this.reviewScoreDescription = reviewScoreDescription;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "호텔리뷰총점")
  @org.codehaus.jackson.annotate.JsonProperty("reviewScore")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewScore")
  public java.math.BigDecimal getReviewScore() {
    return reviewScore;
  }
  
  /**
   * 호텔리뷰총점
   **/
  public void setReviewScore(java.math.BigDecimal reviewScore) {
    this.reviewScore = reviewScore;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "프로모션.(미구현)")
  @org.codehaus.jackson.annotate.JsonProperty("promotion")
  @com.fasterxml.jackson.annotation.JsonProperty("promotion")
  public String getPromotion() {
    return promotion;
  }
  
  /**
   * 프로모션.(미구현)
   **/
  public void setPromotion(String promotion) {
    this.promotion = promotion;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "")
  @org.codehaus.jackson.annotate.JsonProperty("productId")
  @com.fasterxml.jackson.annotation.JsonProperty("productId")
  public Long getProductId() {
    return productId;
  }
  
  /**
   **/
  public void setProductId(Long productId) {
    this.productId = productId;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "호텔이 속한 지역명. 호텔패스로부터 데이터를 받지 못함.")
  @org.codehaus.jackson.annotate.JsonProperty("locationText")
  @com.fasterxml.jackson.annotation.JsonProperty("locationText")
  public String getLocationText() {
    return locationText;
  }
  
  /**
   * 호텔이 속한 지역명. 호텔패스로부터 데이터를 받지 못함.
   **/
  public void setLocationText(String locationText) {
    this.locationText = locationText;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "호텔좌표")
  @org.codehaus.jackson.annotate.JsonProperty("lng")
  @com.fasterxml.jackson.annotation.JsonProperty("lng")
  public java.math.BigDecimal getLng() {
    return lng;
  }
  
  /**
   * 호텔좌표
   **/
  public void setLng(java.math.BigDecimal lng) {
    this.lng = lng;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "호텔좌표")
  @org.codehaus.jackson.annotate.JsonProperty("lat")
  @com.fasterxml.jackson.annotation.JsonProperty("lat")
  public java.math.BigDecimal getLat() {
    return lat;
  }
  
  /**
   * 호텔좌표
   **/
  public void setLat(java.math.BigDecimal lat) {
    this.lat = lat;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "최근예약된 내역.(미구현)")
  @org.codehaus.jackson.annotate.JsonProperty("lastBookingDescription")
  @com.fasterxml.jackson.annotation.JsonProperty("lastBookingDescription")
  public String getLastBookingDescription() {
    return lastBookingDescription;
  }
  
  /**
   * 최근예약된 내역.(미구현)
   **/
  public void setLastBookingDescription(String lastBookingDescription) {
    this.lastBookingDescription = lastBookingDescription;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "호텔한글명")
  @org.codehaus.jackson.annotate.JsonProperty("krName")
  @com.fasterxml.jackson.annotation.JsonProperty("krName")
  public String getKrName() {
    return krName;
  }
  
  /**
   * 호텔한글명
   **/
  public void setKrName(String krName) {
    this.krName = krName;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "호텔 메인 이미지 경로")
  @org.codehaus.jackson.annotate.JsonProperty("imageUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("imageUrl")
  public String getImageUrl() {
    return imageUrl;
  }
  
  /**
   * 호텔 메인 이미지 경로
   **/
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "호텔 메인 이미지 원본 가로 픽셀")
  @org.codehaus.jackson.annotate.JsonProperty("imageOriginWidth")
  @com.fasterxml.jackson.annotation.JsonProperty("imageOriginWidth")
  public Integer getImageOriginWidth() {
    return imageOriginWidth;
  }
  
  /**
   * 호텔 메인 이미지 원본 가로 픽셀
   **/
  public void setImageOriginWidth(Integer imageOriginWidth) {
    this.imageOriginWidth = imageOriginWidth;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "호텔 메인 이미지 원본 세로 픽셀")
  @org.codehaus.jackson.annotate.JsonProperty("imageOriginHeight")
  @com.fasterxml.jackson.annotation.JsonProperty("imageOriginHeight")
  public Integer getImageOriginHeight() {
    return imageOriginHeight;
  }
  
  /**
   * 호텔 메인 이미지 원본 세로 픽셀
   **/
  public void setImageOriginHeight(Integer imageOriginHeight) {
    this.imageOriginHeight = imageOriginHeight;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "호텔등급")
  @org.codehaus.jackson.annotate.JsonProperty("grade")
  @com.fasterxml.jackson.annotation.JsonProperty("grade")
  public java.math.BigDecimal getGrade() {
    return grade;
  }
  
  /**
   * 호텔등급
   **/
  public void setGrade(java.math.BigDecimal grade) {
    this.grade = grade;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "호텔영문명")
  @org.codehaus.jackson.annotate.JsonProperty("engName")
  @com.fasterxml.jackson.annotation.JsonProperty("engName")
  public String getEngName() {
    return engName;
  }
  
  /**
   * 호텔영문명
   **/
  public void setEngName(String engName) {
    this.engName = engName;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "주소 한글.")
  @org.codehaus.jackson.annotate.JsonProperty("address")
  @com.fasterxml.jackson.annotation.JsonProperty("address")
  public String getAddress() {
    return address;
  }
  
  /**
   * 주소 한글.
   **/
  public void setAddress(String address) {
    this.address = address;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelListDto hotelListDto = (HotelListDto) o;
    return Objects.equals(this.totalReviewCount, hotelListDto.totalReviewCount) &&
        Objects.equals(this.reviewScoreDescription, hotelListDto.reviewScoreDescription) &&
        Objects.equals(this.reviewScore, hotelListDto.reviewScore) &&
        Objects.equals(this.promotion, hotelListDto.promotion) &&
        Objects.equals(this.productId, hotelListDto.productId) &&
        Objects.equals(this.locationText, hotelListDto.locationText) &&
        Objects.equals(this.lng, hotelListDto.lng) &&
        Objects.equals(this.lat, hotelListDto.lat) &&
        Objects.equals(this.lastBookingDescription, hotelListDto.lastBookingDescription) &&
        Objects.equals(this.krName, hotelListDto.krName) &&
        Objects.equals(this.imageUrl, hotelListDto.imageUrl) &&
        Objects.equals(this.imageOriginWidth, hotelListDto.imageOriginWidth) &&
        Objects.equals(this.imageOriginHeight, hotelListDto.imageOriginHeight) &&
        Objects.equals(this.grade, hotelListDto.grade) &&
        Objects.equals(this.engName, hotelListDto.engName) &&
        Objects.equals(this.address, hotelListDto.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalReviewCount, reviewScoreDescription, reviewScore, promotion, productId, locationText, lng, lat, lastBookingDescription, krName, imageUrl, imageOriginWidth, imageOriginHeight, grade, engName, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelListDto {\n");
    
    sb.append("    totalReviewCount: ").append(toIndentedString(totalReviewCount)).append("\n");
    sb.append("    reviewScoreDescription: ").append(toIndentedString(reviewScoreDescription)).append("\n");
    sb.append("    reviewScore: ").append(toIndentedString(reviewScore)).append("\n");
    sb.append("    promotion: ").append(toIndentedString(promotion)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    locationText: ").append(toIndentedString(locationText)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    lastBookingDescription: ").append(toIndentedString(lastBookingDescription)).append("\n");
    sb.append("    krName: ").append(toIndentedString(krName)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    imageOriginWidth: ").append(toIndentedString(imageOriginWidth)).append("\n");
    sb.append("    imageOriginHeight: ").append(toIndentedString(imageOriginHeight)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    engName: ").append(toIndentedString(engName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

  public static HotelListDtoBuilder builder() {
    return new HotelListDtoBuilder();
  }

  public static class HotelListDtoBuilder {

    private Integer totalReviewCount = null;
    private String reviewScoreDescription = null;
    private java.math.BigDecimal reviewScore = null;
    private String promotion = null;
    private Long productId = null;
    private String locationText = null;
    private java.math.BigDecimal lng = null;
    private java.math.BigDecimal lat = null;
    private String lastBookingDescription = null;
    private String krName = null;
    private String imageUrl = null;
    private Integer imageOriginWidth = null;
    private Integer imageOriginHeight = null;
    private java.math.BigDecimal grade = null;
    private String engName = null;
    private String address = null;
    

    HotelListDtoBuilder() {
    }

    /**
     * 호텔리뷰개수
     **/
    public HotelListDtoBuilder totalReviewCount(Integer totalReviewCount) {
      this.totalReviewCount = totalReviewCount;
      return this;
    }

    /**
     * 호텔리뷰총점 텍스트. 예제 : 매우 좋음.
     **/
    public HotelListDtoBuilder reviewScoreDescription(String reviewScoreDescription) {
      this.reviewScoreDescription = reviewScoreDescription;
      return this;
    }

    /**
     * 호텔리뷰총점
     **/
    public HotelListDtoBuilder reviewScore(java.math.BigDecimal reviewScore) {
      this.reviewScore = reviewScore;
      return this;
    }

    /**
     * 프로모션.(미구현)
     **/
    public HotelListDtoBuilder promotion(String promotion) {
      this.promotion = promotion;
      return this;
    }

    /**
     **/
    public HotelListDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     * 호텔이 속한 지역명. 호텔패스로부터 데이터를 받지 못함.
     **/
    public HotelListDtoBuilder locationText(String locationText) {
      this.locationText = locationText;
      return this;
    }

    /**
     * 호텔좌표
     **/
    public HotelListDtoBuilder lng(java.math.BigDecimal lng) {
      this.lng = lng;
      return this;
    }

    /**
     * 호텔좌표
     **/
    public HotelListDtoBuilder lat(java.math.BigDecimal lat) {
      this.lat = lat;
      return this;
    }

    /**
     * 최근예약된 내역.(미구현)
     **/
    public HotelListDtoBuilder lastBookingDescription(String lastBookingDescription) {
      this.lastBookingDescription = lastBookingDescription;
      return this;
    }

    /**
     * 호텔한글명
     **/
    public HotelListDtoBuilder krName(String krName) {
      this.krName = krName;
      return this;
    }

    /**
     * 호텔 메인 이미지 경로
     **/
    public HotelListDtoBuilder imageUrl(String imageUrl) {
      this.imageUrl = imageUrl;
      return this;
    }

    /**
     * 호텔 메인 이미지 원본 가로 픽셀
     **/
    public HotelListDtoBuilder imageOriginWidth(Integer imageOriginWidth) {
      this.imageOriginWidth = imageOriginWidth;
      return this;
    }

    /**
     * 호텔 메인 이미지 원본 세로 픽셀
     **/
    public HotelListDtoBuilder imageOriginHeight(Integer imageOriginHeight) {
      this.imageOriginHeight = imageOriginHeight;
      return this;
    }

    /**
     * 호텔등급
     **/
    public HotelListDtoBuilder grade(java.math.BigDecimal grade) {
      this.grade = grade;
      return this;
    }

    /**
     * 호텔영문명
     **/
    public HotelListDtoBuilder engName(String engName) {
      this.engName = engName;
      return this;
    }

    /**
     * 주소 한글.
     **/
    public HotelListDtoBuilder address(String address) {
      this.address = address;
      return this;
    }


    public HotelListDto build() {
      HotelListDto hotelListDto = new HotelListDto();
      hotelListDto.setTotalReviewCount(this.totalReviewCount);
      hotelListDto.setReviewScoreDescription(this.reviewScoreDescription);
      hotelListDto.setReviewScore(this.reviewScore);
      hotelListDto.setPromotion(this.promotion);
      hotelListDto.setProductId(this.productId);
      hotelListDto.setLocationText(this.locationText);
      hotelListDto.setLng(this.lng);
      hotelListDto.setLat(this.lat);
      hotelListDto.setLastBookingDescription(this.lastBookingDescription);
      hotelListDto.setKrName(this.krName);
      hotelListDto.setImageUrl(this.imageUrl);
      hotelListDto.setImageOriginWidth(this.imageOriginWidth);
      hotelListDto.setImageOriginHeight(this.imageOriginHeight);
      hotelListDto.setGrade(this.grade);
      hotelListDto.setEngName(this.engName);
      hotelListDto.setAddress(this.address);
      return hotelListDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HotelListDtoBuilder {\n");
      
      sb.append("    totalReviewCount: ").append(toIndentedString(totalReviewCount)).append("\n");
      sb.append("    reviewScoreDescription: ").append(toIndentedString(reviewScoreDescription)).append("\n");
      sb.append("    reviewScore: ").append(toIndentedString(reviewScore)).append("\n");
      sb.append("    promotion: ").append(toIndentedString(promotion)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    locationText: ").append(toIndentedString(locationText)).append("\n");
      sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
      sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
      sb.append("    lastBookingDescription: ").append(toIndentedString(lastBookingDescription)).append("\n");
      sb.append("    krName: ").append(toIndentedString(krName)).append("\n");
      sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
      sb.append("    imageOriginWidth: ").append(toIndentedString(imageOriginWidth)).append("\n");
      sb.append("    imageOriginHeight: ").append(toIndentedString(imageOriginHeight)).append("\n");
      sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
      sb.append("    engName: ").append(toIndentedString(engName)).append("\n");
      sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

