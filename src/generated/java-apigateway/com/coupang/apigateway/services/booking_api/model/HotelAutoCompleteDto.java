package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.booking_api.model.HotelKeywordSearchDto;
import com.coupang.apigateway.services.booking_api.model.RegionKeywordSearchDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class HotelAutoCompleteDto   {
  
  private List<RegionKeywordSearchDto> regionSearchDtos = new ArrayList<RegionKeywordSearchDto>();
  private List<HotelKeywordSearchDto> hotelSearchDtos = new ArrayList<HotelKeywordSearchDto>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("regionSearchDtos")
  @com.fasterxml.jackson.annotation.JsonProperty("regionSearchDtos")
  public List<RegionKeywordSearchDto> getRegionSearchDtos() {
    return regionSearchDtos;
  }
  
  /**
   **/
  public void setRegionSearchDtos(List<RegionKeywordSearchDto> regionSearchDtos) {
    this.regionSearchDtos = regionSearchDtos;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("hotelSearchDtos")
  @com.fasterxml.jackson.annotation.JsonProperty("hotelSearchDtos")
  public List<HotelKeywordSearchDto> getHotelSearchDtos() {
    return hotelSearchDtos;
  }
  
  /**
   **/
  public void setHotelSearchDtos(List<HotelKeywordSearchDto> hotelSearchDtos) {
    this.hotelSearchDtos = hotelSearchDtos;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelAutoCompleteDto hotelAutoCompleteDto = (HotelAutoCompleteDto) o;
    return Objects.equals(this.regionSearchDtos, hotelAutoCompleteDto.regionSearchDtos) &&
        Objects.equals(this.hotelSearchDtos, hotelAutoCompleteDto.hotelSearchDtos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regionSearchDtos, hotelSearchDtos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelAutoCompleteDto {\n");
    
    sb.append("    regionSearchDtos: ").append(toIndentedString(regionSearchDtos)).append("\n");
    sb.append("    hotelSearchDtos: ").append(toIndentedString(hotelSearchDtos)).append("\n");
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

  public static HotelAutoCompleteDtoBuilder builder() {
    return new HotelAutoCompleteDtoBuilder();
  }

  public static class HotelAutoCompleteDtoBuilder {

    private List<RegionKeywordSearchDto> regionSearchDtos = new ArrayList<RegionKeywordSearchDto>();
    private List<HotelKeywordSearchDto> hotelSearchDtos = new ArrayList<HotelKeywordSearchDto>();
    

    HotelAutoCompleteDtoBuilder() {
    }

    /**
     **/
    public HotelAutoCompleteDtoBuilder regionSearchDtos(List<RegionKeywordSearchDto> regionSearchDtos) {
      this.regionSearchDtos = regionSearchDtos;
      return this;
    }

    /**
     **/
    public HotelAutoCompleteDtoBuilder hotelSearchDtos(List<HotelKeywordSearchDto> hotelSearchDtos) {
      this.hotelSearchDtos = hotelSearchDtos;
      return this;
    }


    public HotelAutoCompleteDto build() {
      HotelAutoCompleteDto hotelAutoCompleteDto = new HotelAutoCompleteDto();
      hotelAutoCompleteDto.setRegionSearchDtos(this.regionSearchDtos);
      hotelAutoCompleteDto.setHotelSearchDtos(this.hotelSearchDtos);
      return hotelAutoCompleteDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HotelAutoCompleteDtoBuilder {\n");
      
      sb.append("    regionSearchDtos: ").append(toIndentedString(regionSearchDtos)).append("\n");
      sb.append("    hotelSearchDtos: ").append(toIndentedString(hotelSearchDtos)).append("\n");
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

