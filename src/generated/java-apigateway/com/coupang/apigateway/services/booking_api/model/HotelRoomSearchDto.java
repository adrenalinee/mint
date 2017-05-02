package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.booking_api.model.SearchCommonInfoDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class HotelRoomSearchDto   {
  
  private String vendorId = null;
  private SearchCommonInfoDto searchCommonInfoDto = null;
  private Long productId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorId")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorId")
  public String getVendorId() {
    return vendorId;
  }
  
  /**
   **/
  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("searchCommonInfoDto")
  @com.fasterxml.jackson.annotation.JsonProperty("searchCommonInfoDto")
  public SearchCommonInfoDto getSearchCommonInfoDto() {
    return searchCommonInfoDto;
  }
  
  /**
   **/
  public void setSearchCommonInfoDto(SearchCommonInfoDto searchCommonInfoDto) {
    this.searchCommonInfoDto = searchCommonInfoDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelRoomSearchDto hotelRoomSearchDto = (HotelRoomSearchDto) o;
    return Objects.equals(this.vendorId, hotelRoomSearchDto.vendorId) &&
        Objects.equals(this.searchCommonInfoDto, hotelRoomSearchDto.searchCommonInfoDto) &&
        Objects.equals(this.productId, hotelRoomSearchDto.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorId, searchCommonInfoDto, productId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelRoomSearchDto {\n");
    
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    searchCommonInfoDto: ").append(toIndentedString(searchCommonInfoDto)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

  public static HotelRoomSearchDtoBuilder builder() {
    return new HotelRoomSearchDtoBuilder();
  }

  public static class HotelRoomSearchDtoBuilder {

    private String vendorId = null;
    private SearchCommonInfoDto searchCommonInfoDto = null;
    private Long productId = null;
    

    HotelRoomSearchDtoBuilder() {
    }

    /**
     **/
    public HotelRoomSearchDtoBuilder vendorId(String vendorId) {
      this.vendorId = vendorId;
      return this;
    }

    /**
     **/
    public HotelRoomSearchDtoBuilder searchCommonInfoDto(SearchCommonInfoDto searchCommonInfoDto) {
      this.searchCommonInfoDto = searchCommonInfoDto;
      return this;
    }

    /**
     **/
    public HotelRoomSearchDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }


    public HotelRoomSearchDto build() {
      HotelRoomSearchDto hotelRoomSearchDto = new HotelRoomSearchDto();
      hotelRoomSearchDto.setVendorId(this.vendorId);
      hotelRoomSearchDto.setSearchCommonInfoDto(this.searchCommonInfoDto);
      hotelRoomSearchDto.setProductId(this.productId);
      return hotelRoomSearchDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HotelRoomSearchDtoBuilder {\n");
      
      sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
      sb.append("    searchCommonInfoDto: ").append(toIndentedString(searchCommonInfoDto)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

