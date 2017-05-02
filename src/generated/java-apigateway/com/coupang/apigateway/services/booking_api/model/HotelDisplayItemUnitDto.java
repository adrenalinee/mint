package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.booking_api.model.BenefitDto;
import com.coupang.apigateway.services.booking_api.model.HotelListDto;
import com.coupang.apigateway.services.booking_api.model.RegionDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class HotelDisplayItemUnitDto   {
  
  private HotelListDto hotelListDto = null;
  private BenefitDto deliveryBenefit = null;
  private BenefitDto couponBenefit = null;
  private RegionDto countryDto = null;
  private RegionDto cityDto = null;

  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "호텔정보")
  @org.codehaus.jackson.annotate.JsonProperty("hotelListDto")
  @com.fasterxml.jackson.annotation.JsonProperty("hotelListDto")
  public HotelListDto getHotelListDto() {
    return hotelListDto;
  }
  
  /**
   * 호텔정보
   **/
  public void setHotelListDto(HotelListDto hotelListDto) {
    this.hotelListDto = hotelListDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("deliveryBenefit")
  @com.fasterxml.jackson.annotation.JsonProperty("deliveryBenefit")
  public BenefitDto getDeliveryBenefit() {
    return deliveryBenefit;
  }
  
  /**
   **/
  public void setDeliveryBenefit(BenefitDto deliveryBenefit) {
    this.deliveryBenefit = deliveryBenefit;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("couponBenefit")
  @com.fasterxml.jackson.annotation.JsonProperty("couponBenefit")
  public BenefitDto getCouponBenefit() {
    return couponBenefit;
  }
  
  /**
   **/
  public void setCouponBenefit(BenefitDto couponBenefit) {
    this.couponBenefit = couponBenefit;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "나라정보")
  @org.codehaus.jackson.annotate.JsonProperty("countryDto")
  @com.fasterxml.jackson.annotation.JsonProperty("countryDto")
  public RegionDto getCountryDto() {
    return countryDto;
  }
  
  /**
   * 나라정보
   **/
  public void setCountryDto(RegionDto countryDto) {
    this.countryDto = countryDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "지역정보")
  @org.codehaus.jackson.annotate.JsonProperty("cityDto")
  @com.fasterxml.jackson.annotation.JsonProperty("cityDto")
  public RegionDto getCityDto() {
    return cityDto;
  }
  
  /**
   * 지역정보
   **/
  public void setCityDto(RegionDto cityDto) {
    this.cityDto = cityDto;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelDisplayItemUnitDto hotelDisplayItemUnitDto = (HotelDisplayItemUnitDto) o;
    return Objects.equals(this.hotelListDto, hotelDisplayItemUnitDto.hotelListDto) &&
        Objects.equals(this.deliveryBenefit, hotelDisplayItemUnitDto.deliveryBenefit) &&
        Objects.equals(this.couponBenefit, hotelDisplayItemUnitDto.couponBenefit) &&
        Objects.equals(this.countryDto, hotelDisplayItemUnitDto.countryDto) &&
        Objects.equals(this.cityDto, hotelDisplayItemUnitDto.cityDto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hotelListDto, deliveryBenefit, couponBenefit, countryDto, cityDto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelDisplayItemUnitDto {\n");
    
    sb.append("    hotelListDto: ").append(toIndentedString(hotelListDto)).append("\n");
    sb.append("    deliveryBenefit: ").append(toIndentedString(deliveryBenefit)).append("\n");
    sb.append("    couponBenefit: ").append(toIndentedString(couponBenefit)).append("\n");
    sb.append("    countryDto: ").append(toIndentedString(countryDto)).append("\n");
    sb.append("    cityDto: ").append(toIndentedString(cityDto)).append("\n");
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

  public static HotelDisplayItemUnitDtoBuilder builder() {
    return new HotelDisplayItemUnitDtoBuilder();
  }

  public static class HotelDisplayItemUnitDtoBuilder {

    private HotelListDto hotelListDto = null;
    private BenefitDto deliveryBenefit = null;
    private BenefitDto couponBenefit = null;
    private RegionDto countryDto = null;
    private RegionDto cityDto = null;
    

    HotelDisplayItemUnitDtoBuilder() {
    }

    /**
     * 호텔정보
     **/
    public HotelDisplayItemUnitDtoBuilder hotelListDto(HotelListDto hotelListDto) {
      this.hotelListDto = hotelListDto;
      return this;
    }

    /**
     **/
    public HotelDisplayItemUnitDtoBuilder deliveryBenefit(BenefitDto deliveryBenefit) {
      this.deliveryBenefit = deliveryBenefit;
      return this;
    }

    /**
     **/
    public HotelDisplayItemUnitDtoBuilder couponBenefit(BenefitDto couponBenefit) {
      this.couponBenefit = couponBenefit;
      return this;
    }

    /**
     * 나라정보
     **/
    public HotelDisplayItemUnitDtoBuilder countryDto(RegionDto countryDto) {
      this.countryDto = countryDto;
      return this;
    }

    /**
     * 지역정보
     **/
    public HotelDisplayItemUnitDtoBuilder cityDto(RegionDto cityDto) {
      this.cityDto = cityDto;
      return this;
    }


    public HotelDisplayItemUnitDto build() {
      HotelDisplayItemUnitDto hotelDisplayItemUnitDto = new HotelDisplayItemUnitDto();
      hotelDisplayItemUnitDto.setHotelListDto(this.hotelListDto);
      hotelDisplayItemUnitDto.setDeliveryBenefit(this.deliveryBenefit);
      hotelDisplayItemUnitDto.setCouponBenefit(this.couponBenefit);
      hotelDisplayItemUnitDto.setCountryDto(this.countryDto);
      hotelDisplayItemUnitDto.setCityDto(this.cityDto);
      return hotelDisplayItemUnitDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HotelDisplayItemUnitDtoBuilder {\n");
      
      sb.append("    hotelListDto: ").append(toIndentedString(hotelListDto)).append("\n");
      sb.append("    deliveryBenefit: ").append(toIndentedString(deliveryBenefit)).append("\n");
      sb.append("    couponBenefit: ").append(toIndentedString(couponBenefit)).append("\n");
      sb.append("    countryDto: ").append(toIndentedString(countryDto)).append("\n");
      sb.append("    cityDto: ").append(toIndentedString(cityDto)).append("\n");
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

