package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.booking_api.model.RegionDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class HotelQuantityDto   {
  
  private RegionDto countryDto = null;
  private RegionDto cityDto = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("countryDto")
  @com.fasterxml.jackson.annotation.JsonProperty("countryDto")
  public RegionDto getCountryDto() {
    return countryDto;
  }
  
  /**
   **/
  public void setCountryDto(RegionDto countryDto) {
    this.countryDto = countryDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("cityDto")
  @com.fasterxml.jackson.annotation.JsonProperty("cityDto")
  public RegionDto getCityDto() {
    return cityDto;
  }
  
  /**
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
    HotelQuantityDto hotelQuantityDto = (HotelQuantityDto) o;
    return Objects.equals(this.countryDto, hotelQuantityDto.countryDto) &&
        Objects.equals(this.cityDto, hotelQuantityDto.cityDto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(countryDto, cityDto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelQuantityDto {\n");
    
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

  public static HotelQuantityDtoBuilder builder() {
    return new HotelQuantityDtoBuilder();
  }

  public static class HotelQuantityDtoBuilder {

    private RegionDto countryDto = null;
    private RegionDto cityDto = null;
    

    HotelQuantityDtoBuilder() {
    }

    /**
     **/
    public HotelQuantityDtoBuilder countryDto(RegionDto countryDto) {
      this.countryDto = countryDto;
      return this;
    }

    /**
     **/
    public HotelQuantityDtoBuilder cityDto(RegionDto cityDto) {
      this.cityDto = cityDto;
      return this;
    }


    public HotelQuantityDto build() {
      HotelQuantityDto hotelQuantityDto = new HotelQuantityDto();
      hotelQuantityDto.setCountryDto(this.countryDto);
      hotelQuantityDto.setCityDto(this.cityDto);
      return hotelQuantityDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HotelQuantityDtoBuilder {\n");
      
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

