package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class HotelSaleDto   {
  
  private List<String> shortSalesMessage = new ArrayList<String>();
  private List<String> salesMessage = new ArrayList<String>();
  private Long productId = null;
  private String priceQuote = null;
  private java.math.BigDecimal price = null;
  private String nights = null;
  private Boolean error = null;
  private Boolean available = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "모바일용 짧은 가격 설명 목록")
  @org.codehaus.jackson.annotate.JsonProperty("shortSalesMessage")
  @com.fasterxml.jackson.annotation.JsonProperty("shortSalesMessage")
  public List<String> getShortSalesMessage() {
    return shortSalesMessage;
  }
  
  /**
   * 모바일용 짧은 가격 설명 목록
   **/
  public void setShortSalesMessage(List<String> shortSalesMessage) {
    this.shortSalesMessage = shortSalesMessage;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "가격 설명 목록")
  @org.codehaus.jackson.annotate.JsonProperty("salesMessage")
  @com.fasterxml.jackson.annotation.JsonProperty("salesMessage")
  public List<String> getSalesMessage() {
    return salesMessage;
  }
  
  /**
   * 가격 설명 목록
   **/
  public void setSalesMessage(List<String> salesMessage) {
    this.salesMessage = salesMessage;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "ProductId")
  @org.codehaus.jackson.annotate.JsonProperty("productId")
  @com.fasterxml.jackson.annotation.JsonProperty("productId")
  public Long getProductId() {
    return productId;
  }
  
  /**
   * ProductId
   **/
  public void setProductId(Long productId) {
    this.productId = productId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "가격 설명")
  @org.codehaus.jackson.annotate.JsonProperty("priceQuote")
  @com.fasterxml.jackson.annotation.JsonProperty("priceQuote")
  public String getPriceQuote() {
    return priceQuote;
  }
  
  /**
   * 가격 설명
   **/
  public void setPriceQuote(String priceQuote) {
    this.priceQuote = priceQuote;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "호텔의 방 가격. 최저가")
  @org.codehaus.jackson.annotate.JsonProperty("price")
  @com.fasterxml.jackson.annotation.JsonProperty("price")
  public java.math.BigDecimal getPrice() {
    return price;
  }
  
  /**
   * 호텔의 방 가격. 최저가
   **/
  public void setPrice(java.math.BigDecimal price) {
    this.price = price;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "N박")
  @org.codehaus.jackson.annotate.JsonProperty("nights")
  @com.fasterxml.jackson.annotation.JsonProperty("nights")
  public String getNights() {
    return nights;
  }
  
  /**
   * N박
   **/
  public void setNights(String nights) {
    this.nights = nights;
  }
  
  @io.swagger.annotations.ApiModelProperty(example = "false", required = true, value = "오류여부. 외부에서 가격을 가져오지 못한 경우.")
  @org.codehaus.jackson.annotate.JsonProperty("error")
  @com.fasterxml.jackson.annotation.JsonProperty("error")
  public Boolean getError() {
    return error;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isError() {
    return error == null ? false : error;
  }
  
  /**
   * 오류여부. 외부에서 가격을 가져오지 못한 경우.
   **/
  public void setError(Boolean error) {
    this.error = error;
  }
  
  @io.swagger.annotations.ApiModelProperty(example = "false", required = true, value = "예약가능여부")
  @org.codehaus.jackson.annotate.JsonProperty("available")
  @com.fasterxml.jackson.annotation.JsonProperty("available")
  public Boolean getAvailable() {
    return available;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isAvailable() {
    return available == null ? false : available;
  }
  
  /**
   * 예약가능여부
   **/
  public void setAvailable(Boolean available) {
    this.available = available;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelSaleDto hotelSaleDto = (HotelSaleDto) o;
    return Objects.equals(this.shortSalesMessage, hotelSaleDto.shortSalesMessage) &&
        Objects.equals(this.salesMessage, hotelSaleDto.salesMessage) &&
        Objects.equals(this.productId, hotelSaleDto.productId) &&
        Objects.equals(this.priceQuote, hotelSaleDto.priceQuote) &&
        Objects.equals(this.price, hotelSaleDto.price) &&
        Objects.equals(this.nights, hotelSaleDto.nights) &&
        Objects.equals(this.error, hotelSaleDto.error) &&
        Objects.equals(this.available, hotelSaleDto.available);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shortSalesMessage, salesMessage, productId, priceQuote, price, nights, error, available);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelSaleDto {\n");
    
    sb.append("    shortSalesMessage: ").append(toIndentedString(shortSalesMessage)).append("\n");
    sb.append("    salesMessage: ").append(toIndentedString(salesMessage)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    priceQuote: ").append(toIndentedString(priceQuote)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    nights: ").append(toIndentedString(nights)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
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

  public static HotelSaleDtoBuilder builder() {
    return new HotelSaleDtoBuilder();
  }

  public static class HotelSaleDtoBuilder {

    private List<String> shortSalesMessage = new ArrayList<String>();
    private List<String> salesMessage = new ArrayList<String>();
    private Long productId = null;
    private String priceQuote = null;
    private java.math.BigDecimal price = null;
    private String nights = null;
    private Boolean error = null;
    private Boolean available = null;
    

    HotelSaleDtoBuilder() {
    }

    /**
     * 모바일용 짧은 가격 설명 목록
     **/
    public HotelSaleDtoBuilder shortSalesMessage(List<String> shortSalesMessage) {
      this.shortSalesMessage = shortSalesMessage;
      return this;
    }

    /**
     * 가격 설명 목록
     **/
    public HotelSaleDtoBuilder salesMessage(List<String> salesMessage) {
      this.salesMessage = salesMessage;
      return this;
    }

    /**
     * ProductId
     **/
    public HotelSaleDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     * 가격 설명
     **/
    public HotelSaleDtoBuilder priceQuote(String priceQuote) {
      this.priceQuote = priceQuote;
      return this;
    }

    /**
     * 호텔의 방 가격. 최저가
     **/
    public HotelSaleDtoBuilder price(java.math.BigDecimal price) {
      this.price = price;
      return this;
    }

    /**
     * N박
     **/
    public HotelSaleDtoBuilder nights(String nights) {
      this.nights = nights;
      return this;
    }

    /**
     * 오류여부. 외부에서 가격을 가져오지 못한 경우.
     **/
    public HotelSaleDtoBuilder error(Boolean error) {
      this.error = error;
      return this;
    }

    /**
     * 예약가능여부
     **/
    public HotelSaleDtoBuilder available(Boolean available) {
      this.available = available;
      return this;
    }


    public HotelSaleDto build() {
      HotelSaleDto hotelSaleDto = new HotelSaleDto();
      hotelSaleDto.setShortSalesMessage(this.shortSalesMessage);
      hotelSaleDto.setSalesMessage(this.salesMessage);
      hotelSaleDto.setProductId(this.productId);
      hotelSaleDto.setPriceQuote(this.priceQuote);
      hotelSaleDto.setPrice(this.price);
      hotelSaleDto.setNights(this.nights);
      hotelSaleDto.setError(this.error);
      hotelSaleDto.setAvailable(this.available);
      return hotelSaleDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HotelSaleDtoBuilder {\n");
      
      sb.append("    shortSalesMessage: ").append(toIndentedString(shortSalesMessage)).append("\n");
      sb.append("    salesMessage: ").append(toIndentedString(salesMessage)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    priceQuote: ").append(toIndentedString(priceQuote)).append("\n");
      sb.append("    price: ").append(toIndentedString(price)).append("\n");
      sb.append("    nights: ").append(toIndentedString(nights)).append("\n");
      sb.append("    error: ").append(toIndentedString(error)).append("\n");
      sb.append("    available: ").append(toIndentedString(available)).append("\n");
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

