package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.booking_api.model.Facility;
import com.coupang.apigateway.services.booking_api.model.HotelCancelPolicyDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class HotelRoomInfoDto   {
  
  private String vendorId = null;
  private String type = null;
  private String taxDescription = null;
  private Boolean soldOut = null;
  private Integer seq = null;
  private java.math.BigDecimal salesPrice = null;
  private String reservationKey = null;
  private Integer remainCount = null;
  private Long productId = null;
  private String name = null;
  private String image = null;
  private Long hotelId = null;
  private HotelCancelPolicyDto hotelCancelPolicyDto = null;
  private Boolean hasMeal = null;
  private List<Facility> facilities = new ArrayList<Facility>();
  private String extraNotice = null;
  private String extraInfo = null;
  private java.math.BigDecimal exchange = null;
  private String description = null;
  private String currency = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("type")
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  public String getType() {
    return type;
  }
  
  /**
   **/
  public void setType(String type) {
    this.type = type;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("taxDescription")
  @com.fasterxml.jackson.annotation.JsonProperty("taxDescription")
  public String getTaxDescription() {
    return taxDescription;
  }
  
  /**
   **/
  public void setTaxDescription(String taxDescription) {
    this.taxDescription = taxDescription;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("soldOut")
  @com.fasterxml.jackson.annotation.JsonProperty("soldOut")
  public Boolean getSoldOut() {
    return soldOut;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isSoldOut() {
    return soldOut == null ? false : soldOut;
  }
  
  /**
   **/
  public void setSoldOut(Boolean soldOut) {
    this.soldOut = soldOut;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("seq")
  @com.fasterxml.jackson.annotation.JsonProperty("seq")
  public Integer getSeq() {
    return seq;
  }
  
  /**
   **/
  public void setSeq(Integer seq) {
    this.seq = seq;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("salesPrice")
  @com.fasterxml.jackson.annotation.JsonProperty("salesPrice")
  public java.math.BigDecimal getSalesPrice() {
    return salesPrice;
  }
  
  /**
   **/
  public void setSalesPrice(java.math.BigDecimal salesPrice) {
    this.salesPrice = salesPrice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reservationKey")
  @com.fasterxml.jackson.annotation.JsonProperty("reservationKey")
  public String getReservationKey() {
    return reservationKey;
  }
  
  /**
   **/
  public void setReservationKey(String reservationKey) {
    this.reservationKey = reservationKey;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("remainCount")
  @com.fasterxml.jackson.annotation.JsonProperty("remainCount")
  public Integer getRemainCount() {
    return remainCount;
  }
  
  /**
   **/
  public void setRemainCount(Integer remainCount) {
    this.remainCount = remainCount;
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
  @org.codehaus.jackson.annotate.JsonProperty("image")
  @com.fasterxml.jackson.annotation.JsonProperty("image")
  public String getImage() {
    return image;
  }
  
  /**
   **/
  public void setImage(String image) {
    this.image = image;
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
  @org.codehaus.jackson.annotate.JsonProperty("hotelCancelPolicyDto")
  @com.fasterxml.jackson.annotation.JsonProperty("hotelCancelPolicyDto")
  public HotelCancelPolicyDto getHotelCancelPolicyDto() {
    return hotelCancelPolicyDto;
  }
  
  /**
   **/
  public void setHotelCancelPolicyDto(HotelCancelPolicyDto hotelCancelPolicyDto) {
    this.hotelCancelPolicyDto = hotelCancelPolicyDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("hasMeal")
  @com.fasterxml.jackson.annotation.JsonProperty("hasMeal")
  public Boolean getHasMeal() {
    return hasMeal;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isHasMeal() {
    return hasMeal == null ? false : hasMeal;
  }
  
  /**
   **/
  public void setHasMeal(Boolean hasMeal) {
    this.hasMeal = hasMeal;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("facilities")
  @com.fasterxml.jackson.annotation.JsonProperty("facilities")
  public List<Facility> getFacilities() {
    return facilities;
  }
  
  /**
   **/
  public void setFacilities(List<Facility> facilities) {
    this.facilities = facilities;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("extraNotice")
  @com.fasterxml.jackson.annotation.JsonProperty("extraNotice")
  public String getExtraNotice() {
    return extraNotice;
  }
  
  /**
   **/
  public void setExtraNotice(String extraNotice) {
    this.extraNotice = extraNotice;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("extraInfo")
  @com.fasterxml.jackson.annotation.JsonProperty("extraInfo")
  public String getExtraInfo() {
    return extraInfo;
  }
  
  /**
   **/
  public void setExtraInfo(String extraInfo) {
    this.extraInfo = extraInfo;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("exchange")
  @com.fasterxml.jackson.annotation.JsonProperty("exchange")
  public java.math.BigDecimal getExchange() {
    return exchange;
  }
  
  /**
   **/
  public void setExchange(java.math.BigDecimal exchange) {
    this.exchange = exchange;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("description")
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  public String getDescription() {
    return description;
  }
  
  /**
   **/
  public void setDescription(String description) {
    this.description = description;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("currency")
  @com.fasterxml.jackson.annotation.JsonProperty("currency")
  public String getCurrency() {
    return currency;
  }
  
  /**
   **/
  public void setCurrency(String currency) {
    this.currency = currency;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelRoomInfoDto hotelRoomInfoDto = (HotelRoomInfoDto) o;
    return Objects.equals(this.vendorId, hotelRoomInfoDto.vendorId) &&
        Objects.equals(this.type, hotelRoomInfoDto.type) &&
        Objects.equals(this.taxDescription, hotelRoomInfoDto.taxDescription) &&
        Objects.equals(this.soldOut, hotelRoomInfoDto.soldOut) &&
        Objects.equals(this.seq, hotelRoomInfoDto.seq) &&
        Objects.equals(this.salesPrice, hotelRoomInfoDto.salesPrice) &&
        Objects.equals(this.reservationKey, hotelRoomInfoDto.reservationKey) &&
        Objects.equals(this.remainCount, hotelRoomInfoDto.remainCount) &&
        Objects.equals(this.productId, hotelRoomInfoDto.productId) &&
        Objects.equals(this.name, hotelRoomInfoDto.name) &&
        Objects.equals(this.image, hotelRoomInfoDto.image) &&
        Objects.equals(this.hotelId, hotelRoomInfoDto.hotelId) &&
        Objects.equals(this.hotelCancelPolicyDto, hotelRoomInfoDto.hotelCancelPolicyDto) &&
        Objects.equals(this.hasMeal, hotelRoomInfoDto.hasMeal) &&
        Objects.equals(this.facilities, hotelRoomInfoDto.facilities) &&
        Objects.equals(this.extraNotice, hotelRoomInfoDto.extraNotice) &&
        Objects.equals(this.extraInfo, hotelRoomInfoDto.extraInfo) &&
        Objects.equals(this.exchange, hotelRoomInfoDto.exchange) &&
        Objects.equals(this.description, hotelRoomInfoDto.description) &&
        Objects.equals(this.currency, hotelRoomInfoDto.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorId, type, taxDescription, soldOut, seq, salesPrice, reservationKey, remainCount, productId, name, image, hotelId, hotelCancelPolicyDto, hasMeal, facilities, extraNotice, extraInfo, exchange, description, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelRoomInfoDto {\n");
    
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    taxDescription: ").append(toIndentedString(taxDescription)).append("\n");
    sb.append("    soldOut: ").append(toIndentedString(soldOut)).append("\n");
    sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
    sb.append("    salesPrice: ").append(toIndentedString(salesPrice)).append("\n");
    sb.append("    reservationKey: ").append(toIndentedString(reservationKey)).append("\n");
    sb.append("    remainCount: ").append(toIndentedString(remainCount)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    hotelCancelPolicyDto: ").append(toIndentedString(hotelCancelPolicyDto)).append("\n");
    sb.append("    hasMeal: ").append(toIndentedString(hasMeal)).append("\n");
    sb.append("    facilities: ").append(toIndentedString(facilities)).append("\n");
    sb.append("    extraNotice: ").append(toIndentedString(extraNotice)).append("\n");
    sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

  public static HotelRoomInfoDtoBuilder builder() {
    return new HotelRoomInfoDtoBuilder();
  }

  public static class HotelRoomInfoDtoBuilder {

    private String vendorId = null;
    private String type = null;
    private String taxDescription = null;
    private Boolean soldOut = null;
    private Integer seq = null;
    private java.math.BigDecimal salesPrice = null;
    private String reservationKey = null;
    private Integer remainCount = null;
    private Long productId = null;
    private String name = null;
    private String image = null;
    private Long hotelId = null;
    private HotelCancelPolicyDto hotelCancelPolicyDto = null;
    private Boolean hasMeal = null;
    private List<Facility> facilities = new ArrayList<Facility>();
    private String extraNotice = null;
    private String extraInfo = null;
    private java.math.BigDecimal exchange = null;
    private String description = null;
    private String currency = null;
    

    HotelRoomInfoDtoBuilder() {
    }

    /**
     **/
    public HotelRoomInfoDtoBuilder vendorId(String vendorId) {
      this.vendorId = vendorId;
      return this;
    }

    /**
     **/
    public HotelRoomInfoDtoBuilder type(String type) {
      this.type = type;
      return this;
    }

    /**
     **/
    public HotelRoomInfoDtoBuilder taxDescription(String taxDescription) {
      this.taxDescription = taxDescription;
      return this;
    }

    /**
     **/
    public HotelRoomInfoDtoBuilder soldOut(Boolean soldOut) {
      this.soldOut = soldOut;
      return this;
    }

    /**
     **/
    public HotelRoomInfoDtoBuilder seq(Integer seq) {
      this.seq = seq;
      return this;
    }

    /**
     **/
    public HotelRoomInfoDtoBuilder salesPrice(java.math.BigDecimal salesPrice) {
      this.salesPrice = salesPrice;
      return this;
    }

    /**
     **/
    public HotelRoomInfoDtoBuilder reservationKey(String reservationKey) {
      this.reservationKey = reservationKey;
      return this;
    }

    /**
     **/
    public HotelRoomInfoDtoBuilder remainCount(Integer remainCount) {
      this.remainCount = remainCount;
      return this;
    }

    /**
     **/
    public HotelRoomInfoDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public HotelRoomInfoDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public HotelRoomInfoDtoBuilder image(String image) {
      this.image = image;
      return this;
    }

    /**
     **/
    public HotelRoomInfoDtoBuilder hotelId(Long hotelId) {
      this.hotelId = hotelId;
      return this;
    }

    /**
     **/
    public HotelRoomInfoDtoBuilder hotelCancelPolicyDto(HotelCancelPolicyDto hotelCancelPolicyDto) {
      this.hotelCancelPolicyDto = hotelCancelPolicyDto;
      return this;
    }

    /**
     **/
    public HotelRoomInfoDtoBuilder hasMeal(Boolean hasMeal) {
      this.hasMeal = hasMeal;
      return this;
    }

    /**
     **/
    public HotelRoomInfoDtoBuilder facilities(List<Facility> facilities) {
      this.facilities = facilities;
      return this;
    }

    /**
     **/
    public HotelRoomInfoDtoBuilder extraNotice(String extraNotice) {
      this.extraNotice = extraNotice;
      return this;
    }

    /**
     **/
    public HotelRoomInfoDtoBuilder extraInfo(String extraInfo) {
      this.extraInfo = extraInfo;
      return this;
    }

    /**
     **/
    public HotelRoomInfoDtoBuilder exchange(java.math.BigDecimal exchange) {
      this.exchange = exchange;
      return this;
    }

    /**
     **/
    public HotelRoomInfoDtoBuilder description(String description) {
      this.description = description;
      return this;
    }

    /**
     **/
    public HotelRoomInfoDtoBuilder currency(String currency) {
      this.currency = currency;
      return this;
    }


    public HotelRoomInfoDto build() {
      HotelRoomInfoDto hotelRoomInfoDto = new HotelRoomInfoDto();
      hotelRoomInfoDto.setVendorId(this.vendorId);
      hotelRoomInfoDto.setType(this.type);
      hotelRoomInfoDto.setTaxDescription(this.taxDescription);
      hotelRoomInfoDto.setSoldOut(this.soldOut);
      hotelRoomInfoDto.setSeq(this.seq);
      hotelRoomInfoDto.setSalesPrice(this.salesPrice);
      hotelRoomInfoDto.setReservationKey(this.reservationKey);
      hotelRoomInfoDto.setRemainCount(this.remainCount);
      hotelRoomInfoDto.setProductId(this.productId);
      hotelRoomInfoDto.setName(this.name);
      hotelRoomInfoDto.setImage(this.image);
      hotelRoomInfoDto.setHotelId(this.hotelId);
      hotelRoomInfoDto.setHotelCancelPolicyDto(this.hotelCancelPolicyDto);
      hotelRoomInfoDto.setHasMeal(this.hasMeal);
      hotelRoomInfoDto.setFacilities(this.facilities);
      hotelRoomInfoDto.setExtraNotice(this.extraNotice);
      hotelRoomInfoDto.setExtraInfo(this.extraInfo);
      hotelRoomInfoDto.setExchange(this.exchange);
      hotelRoomInfoDto.setDescription(this.description);
      hotelRoomInfoDto.setCurrency(this.currency);
      return hotelRoomInfoDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HotelRoomInfoDtoBuilder {\n");
      
      sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
      sb.append("    taxDescription: ").append(toIndentedString(taxDescription)).append("\n");
      sb.append("    soldOut: ").append(toIndentedString(soldOut)).append("\n");
      sb.append("    seq: ").append(toIndentedString(seq)).append("\n");
      sb.append("    salesPrice: ").append(toIndentedString(salesPrice)).append("\n");
      sb.append("    reservationKey: ").append(toIndentedString(reservationKey)).append("\n");
      sb.append("    remainCount: ").append(toIndentedString(remainCount)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    image: ").append(toIndentedString(image)).append("\n");
      sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
      sb.append("    hotelCancelPolicyDto: ").append(toIndentedString(hotelCancelPolicyDto)).append("\n");
      sb.append("    hasMeal: ").append(toIndentedString(hasMeal)).append("\n");
      sb.append("    facilities: ").append(toIndentedString(facilities)).append("\n");
      sb.append("    extraNotice: ").append(toIndentedString(extraNotice)).append("\n");
      sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
      sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
      sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

