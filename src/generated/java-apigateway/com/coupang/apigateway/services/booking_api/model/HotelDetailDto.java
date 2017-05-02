package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class HotelDetailDto   {
  
  private Boolean valid = null;
  private String keyDescription = null;
  private Long hotelId = null;
  private Long hotelDetailId = null;
  private String detailValue = null;
  private String detailKey = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("valid")
  @com.fasterxml.jackson.annotation.JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isValid() {
    return valid == null ? false : valid;
  }
  
  /**
   **/
  public void setValid(Boolean valid) {
    this.valid = valid;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("keyDescription")
  @com.fasterxml.jackson.annotation.JsonProperty("keyDescription")
  public String getKeyDescription() {
    return keyDescription;
  }
  
  /**
   **/
  public void setKeyDescription(String keyDescription) {
    this.keyDescription = keyDescription;
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
  @org.codehaus.jackson.annotate.JsonProperty("hotelDetailId")
  @com.fasterxml.jackson.annotation.JsonProperty("hotelDetailId")
  public Long getHotelDetailId() {
    return hotelDetailId;
  }
  
  /**
   **/
  public void setHotelDetailId(Long hotelDetailId) {
    this.hotelDetailId = hotelDetailId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("detailValue")
  @com.fasterxml.jackson.annotation.JsonProperty("detailValue")
  public String getDetailValue() {
    return detailValue;
  }
  
  /**
   **/
  public void setDetailValue(String detailValue) {
    this.detailValue = detailValue;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("detailKey")
  @com.fasterxml.jackson.annotation.JsonProperty("detailKey")
  public String getDetailKey() {
    return detailKey;
  }
  
  /**
   **/
  public void setDetailKey(String detailKey) {
    this.detailKey = detailKey;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelDetailDto hotelDetailDto = (HotelDetailDto) o;
    return Objects.equals(this.valid, hotelDetailDto.valid) &&
        Objects.equals(this.keyDescription, hotelDetailDto.keyDescription) &&
        Objects.equals(this.hotelId, hotelDetailDto.hotelId) &&
        Objects.equals(this.hotelDetailId, hotelDetailDto.hotelDetailId) &&
        Objects.equals(this.detailValue, hotelDetailDto.detailValue) &&
        Objects.equals(this.detailKey, hotelDetailDto.detailKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, keyDescription, hotelId, hotelDetailId, detailValue, detailKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelDetailDto {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    keyDescription: ").append(toIndentedString(keyDescription)).append("\n");
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    hotelDetailId: ").append(toIndentedString(hotelDetailId)).append("\n");
    sb.append("    detailValue: ").append(toIndentedString(detailValue)).append("\n");
    sb.append("    detailKey: ").append(toIndentedString(detailKey)).append("\n");
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

  public static HotelDetailDtoBuilder builder() {
    return new HotelDetailDtoBuilder();
  }

  public static class HotelDetailDtoBuilder {

    private Boolean valid = null;
    private String keyDescription = null;
    private Long hotelId = null;
    private Long hotelDetailId = null;
    private String detailValue = null;
    private String detailKey = null;
    

    HotelDetailDtoBuilder() {
    }

    /**
     **/
    public HotelDetailDtoBuilder valid(Boolean valid) {
      this.valid = valid;
      return this;
    }

    /**
     **/
    public HotelDetailDtoBuilder keyDescription(String keyDescription) {
      this.keyDescription = keyDescription;
      return this;
    }

    /**
     **/
    public HotelDetailDtoBuilder hotelId(Long hotelId) {
      this.hotelId = hotelId;
      return this;
    }

    /**
     **/
    public HotelDetailDtoBuilder hotelDetailId(Long hotelDetailId) {
      this.hotelDetailId = hotelDetailId;
      return this;
    }

    /**
     **/
    public HotelDetailDtoBuilder detailValue(String detailValue) {
      this.detailValue = detailValue;
      return this;
    }

    /**
     **/
    public HotelDetailDtoBuilder detailKey(String detailKey) {
      this.detailKey = detailKey;
      return this;
    }


    public HotelDetailDto build() {
      HotelDetailDto hotelDetailDto = new HotelDetailDto();
      hotelDetailDto.setValid(this.valid);
      hotelDetailDto.setKeyDescription(this.keyDescription);
      hotelDetailDto.setHotelId(this.hotelId);
      hotelDetailDto.setHotelDetailId(this.hotelDetailId);
      hotelDetailDto.setDetailValue(this.detailValue);
      hotelDetailDto.setDetailKey(this.detailKey);
      return hotelDetailDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HotelDetailDtoBuilder {\n");
      
      sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
      sb.append("    keyDescription: ").append(toIndentedString(keyDescription)).append("\n");
      sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
      sb.append("    hotelDetailId: ").append(toIndentedString(hotelDetailId)).append("\n");
      sb.append("    detailValue: ").append(toIndentedString(detailValue)).append("\n");
      sb.append("    detailKey: ").append(toIndentedString(detailKey)).append("\n");
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

