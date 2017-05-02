package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class HotelAttributeDto   {
  
  private String reviewGradeDescription = null;
  private java.math.BigDecimal reviewGrade = null;
  private Integer reviewCount = null;
  private Integer recommendationIndex = null;
  private Integer popularityIndex = null;
  private java.math.BigDecimal lowestPrice = null;
  private Long hotelId = null;
  private Long hotelAttributeId = null;
  private java.math.BigDecimal highestPrice = null;
  private java.math.BigDecimal averagePrice = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewGradeDescription")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewGradeDescription")
  public String getReviewGradeDescription() {
    return reviewGradeDescription;
  }
  
  /**
   **/
  public void setReviewGradeDescription(String reviewGradeDescription) {
    this.reviewGradeDescription = reviewGradeDescription;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewGrade")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewGrade")
  public java.math.BigDecimal getReviewGrade() {
    return reviewGrade;
  }
  
  /**
   **/
  public void setReviewGrade(java.math.BigDecimal reviewGrade) {
    this.reviewGrade = reviewGrade;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewCount")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewCount")
  public Integer getReviewCount() {
    return reviewCount;
  }
  
  /**
   **/
  public void setReviewCount(Integer reviewCount) {
    this.reviewCount = reviewCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("recommendationIndex")
  @com.fasterxml.jackson.annotation.JsonProperty("recommendationIndex")
  public Integer getRecommendationIndex() {
    return recommendationIndex;
  }
  
  /**
   **/
  public void setRecommendationIndex(Integer recommendationIndex) {
    this.recommendationIndex = recommendationIndex;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("popularityIndex")
  @com.fasterxml.jackson.annotation.JsonProperty("popularityIndex")
  public Integer getPopularityIndex() {
    return popularityIndex;
  }
  
  /**
   **/
  public void setPopularityIndex(Integer popularityIndex) {
    this.popularityIndex = popularityIndex;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("lowestPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("lowestPrice")
  public java.math.BigDecimal getLowestPrice() {
    return lowestPrice;
  }
  
  /**
   **/
  public void setLowestPrice(java.math.BigDecimal lowestPrice) {
    this.lowestPrice = lowestPrice;
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
  @org.codehaus.jackson.annotate.JsonProperty("hotelAttributeId")
  @com.fasterxml.jackson.annotation.JsonProperty("hotelAttributeId")
  public Long getHotelAttributeId() {
    return hotelAttributeId;
  }
  
  /**
   **/
  public void setHotelAttributeId(Long hotelAttributeId) {
    this.hotelAttributeId = hotelAttributeId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("highestPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("highestPrice")
  public java.math.BigDecimal getHighestPrice() {
    return highestPrice;
  }
  
  /**
   **/
  public void setHighestPrice(java.math.BigDecimal highestPrice) {
    this.highestPrice = highestPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("averagePrice")
  @com.fasterxml.jackson.annotation.JsonProperty("averagePrice")
  public java.math.BigDecimal getAveragePrice() {
    return averagePrice;
  }
  
  /**
   **/
  public void setAveragePrice(java.math.BigDecimal averagePrice) {
    this.averagePrice = averagePrice;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelAttributeDto hotelAttributeDto = (HotelAttributeDto) o;
    return Objects.equals(this.reviewGradeDescription, hotelAttributeDto.reviewGradeDescription) &&
        Objects.equals(this.reviewGrade, hotelAttributeDto.reviewGrade) &&
        Objects.equals(this.reviewCount, hotelAttributeDto.reviewCount) &&
        Objects.equals(this.recommendationIndex, hotelAttributeDto.recommendationIndex) &&
        Objects.equals(this.popularityIndex, hotelAttributeDto.popularityIndex) &&
        Objects.equals(this.lowestPrice, hotelAttributeDto.lowestPrice) &&
        Objects.equals(this.hotelId, hotelAttributeDto.hotelId) &&
        Objects.equals(this.hotelAttributeId, hotelAttributeDto.hotelAttributeId) &&
        Objects.equals(this.highestPrice, hotelAttributeDto.highestPrice) &&
        Objects.equals(this.averagePrice, hotelAttributeDto.averagePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewGradeDescription, reviewGrade, reviewCount, recommendationIndex, popularityIndex, lowestPrice, hotelId, hotelAttributeId, highestPrice, averagePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelAttributeDto {\n");
    
    sb.append("    reviewGradeDescription: ").append(toIndentedString(reviewGradeDescription)).append("\n");
    sb.append("    reviewGrade: ").append(toIndentedString(reviewGrade)).append("\n");
    sb.append("    reviewCount: ").append(toIndentedString(reviewCount)).append("\n");
    sb.append("    recommendationIndex: ").append(toIndentedString(recommendationIndex)).append("\n");
    sb.append("    popularityIndex: ").append(toIndentedString(popularityIndex)).append("\n");
    sb.append("    lowestPrice: ").append(toIndentedString(lowestPrice)).append("\n");
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    hotelAttributeId: ").append(toIndentedString(hotelAttributeId)).append("\n");
    sb.append("    highestPrice: ").append(toIndentedString(highestPrice)).append("\n");
    sb.append("    averagePrice: ").append(toIndentedString(averagePrice)).append("\n");
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

  public static HotelAttributeDtoBuilder builder() {
    return new HotelAttributeDtoBuilder();
  }

  public static class HotelAttributeDtoBuilder {

    private String reviewGradeDescription = null;
    private java.math.BigDecimal reviewGrade = null;
    private Integer reviewCount = null;
    private Integer recommendationIndex = null;
    private Integer popularityIndex = null;
    private java.math.BigDecimal lowestPrice = null;
    private Long hotelId = null;
    private Long hotelAttributeId = null;
    private java.math.BigDecimal highestPrice = null;
    private java.math.BigDecimal averagePrice = null;
    

    HotelAttributeDtoBuilder() {
    }

    /**
     **/
    public HotelAttributeDtoBuilder reviewGradeDescription(String reviewGradeDescription) {
      this.reviewGradeDescription = reviewGradeDescription;
      return this;
    }

    /**
     **/
    public HotelAttributeDtoBuilder reviewGrade(java.math.BigDecimal reviewGrade) {
      this.reviewGrade = reviewGrade;
      return this;
    }

    /**
     **/
    public HotelAttributeDtoBuilder reviewCount(Integer reviewCount) {
      this.reviewCount = reviewCount;
      return this;
    }

    /**
     **/
    public HotelAttributeDtoBuilder recommendationIndex(Integer recommendationIndex) {
      this.recommendationIndex = recommendationIndex;
      return this;
    }

    /**
     **/
    public HotelAttributeDtoBuilder popularityIndex(Integer popularityIndex) {
      this.popularityIndex = popularityIndex;
      return this;
    }

    /**
     **/
    public HotelAttributeDtoBuilder lowestPrice(java.math.BigDecimal lowestPrice) {
      this.lowestPrice = lowestPrice;
      return this;
    }

    /**
     **/
    public HotelAttributeDtoBuilder hotelId(Long hotelId) {
      this.hotelId = hotelId;
      return this;
    }

    /**
     **/
    public HotelAttributeDtoBuilder hotelAttributeId(Long hotelAttributeId) {
      this.hotelAttributeId = hotelAttributeId;
      return this;
    }

    /**
     **/
    public HotelAttributeDtoBuilder highestPrice(java.math.BigDecimal highestPrice) {
      this.highestPrice = highestPrice;
      return this;
    }

    /**
     **/
    public HotelAttributeDtoBuilder averagePrice(java.math.BigDecimal averagePrice) {
      this.averagePrice = averagePrice;
      return this;
    }


    public HotelAttributeDto build() {
      HotelAttributeDto hotelAttributeDto = new HotelAttributeDto();
      hotelAttributeDto.setReviewGradeDescription(this.reviewGradeDescription);
      hotelAttributeDto.setReviewGrade(this.reviewGrade);
      hotelAttributeDto.setReviewCount(this.reviewCount);
      hotelAttributeDto.setRecommendationIndex(this.recommendationIndex);
      hotelAttributeDto.setPopularityIndex(this.popularityIndex);
      hotelAttributeDto.setLowestPrice(this.lowestPrice);
      hotelAttributeDto.setHotelId(this.hotelId);
      hotelAttributeDto.setHotelAttributeId(this.hotelAttributeId);
      hotelAttributeDto.setHighestPrice(this.highestPrice);
      hotelAttributeDto.setAveragePrice(this.averagePrice);
      return hotelAttributeDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HotelAttributeDtoBuilder {\n");
      
      sb.append("    reviewGradeDescription: ").append(toIndentedString(reviewGradeDescription)).append("\n");
      sb.append("    reviewGrade: ").append(toIndentedString(reviewGrade)).append("\n");
      sb.append("    reviewCount: ").append(toIndentedString(reviewCount)).append("\n");
      sb.append("    recommendationIndex: ").append(toIndentedString(recommendationIndex)).append("\n");
      sb.append("    popularityIndex: ").append(toIndentedString(popularityIndex)).append("\n");
      sb.append("    lowestPrice: ").append(toIndentedString(lowestPrice)).append("\n");
      sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
      sb.append("    hotelAttributeId: ").append(toIndentedString(hotelAttributeId)).append("\n");
      sb.append("    highestPrice: ").append(toIndentedString(highestPrice)).append("\n");
      sb.append("    averagePrice: ").append(toIndentedString(averagePrice)).append("\n");
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

