package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class HotelKeywordSearchDto   {
  
  private List<String> traceNames = new ArrayList<String>();
  private Long productId = null;
  private String name = null;
  private Long hotelId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("traceNames")
  @com.fasterxml.jackson.annotation.JsonProperty("traceNames")
  public List<String> getTraceNames() {
    return traceNames;
  }
  
  /**
   **/
  public void setTraceNames(List<String> traceNames) {
    this.traceNames = traceNames;
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
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("name")
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  public String getName() {
    return name;
  }
  
  /**
   **/
  public void setName(String name) {
    this.name = name;
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelKeywordSearchDto hotelKeywordSearchDto = (HotelKeywordSearchDto) o;
    return Objects.equals(this.traceNames, hotelKeywordSearchDto.traceNames) &&
        Objects.equals(this.productId, hotelKeywordSearchDto.productId) &&
        Objects.equals(this.name, hotelKeywordSearchDto.name) &&
        Objects.equals(this.hotelId, hotelKeywordSearchDto.hotelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(traceNames, productId, name, hotelId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelKeywordSearchDto {\n");
    
    sb.append("    traceNames: ").append(toIndentedString(traceNames)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
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

  public static HotelKeywordSearchDtoBuilder builder() {
    return new HotelKeywordSearchDtoBuilder();
  }

  public static class HotelKeywordSearchDtoBuilder {

    private List<String> traceNames = new ArrayList<String>();
    private Long productId = null;
    private String name = null;
    private Long hotelId = null;
    

    HotelKeywordSearchDtoBuilder() {
    }

    /**
     **/
    public HotelKeywordSearchDtoBuilder traceNames(List<String> traceNames) {
      this.traceNames = traceNames;
      return this;
    }

    /**
     **/
    public HotelKeywordSearchDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public HotelKeywordSearchDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public HotelKeywordSearchDtoBuilder hotelId(Long hotelId) {
      this.hotelId = hotelId;
      return this;
    }


    public HotelKeywordSearchDto build() {
      HotelKeywordSearchDto hotelKeywordSearchDto = new HotelKeywordSearchDto();
      hotelKeywordSearchDto.setTraceNames(this.traceNames);
      hotelKeywordSearchDto.setProductId(this.productId);
      hotelKeywordSearchDto.setName(this.name);
      hotelKeywordSearchDto.setHotelId(this.hotelId);
      return hotelKeywordSearchDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HotelKeywordSearchDtoBuilder {\n");
      
      sb.append("    traceNames: ").append(toIndentedString(traceNames)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
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

