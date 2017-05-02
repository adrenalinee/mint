package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class LocationDto   {
  
  private String zipcode = null;
  private String phoneNumber = null;
  private String name = null;
  private Long locationId = null;
  private String locale = null;
  private java.math.BigDecimal lng = null;
  private java.math.BigDecimal lat = null;
  private String homepage = null;
  private String extraInfo = null;
  private String address = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("zipcode")
  @com.fasterxml.jackson.annotation.JsonProperty("zipcode")
  public String getZipcode() {
    return zipcode;
  }
  
  /**
   **/
  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("phoneNumber")
  @com.fasterxml.jackson.annotation.JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  
  /**
   **/
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
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
  @org.codehaus.jackson.annotate.JsonProperty("locationId")
  @com.fasterxml.jackson.annotation.JsonProperty("locationId")
  public Long getLocationId() {
    return locationId;
  }
  
  /**
   **/
  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("locale")
  @com.fasterxml.jackson.annotation.JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  
  /**
   **/
  public void setLocale(String locale) {
    this.locale = locale;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("lng")
  @com.fasterxml.jackson.annotation.JsonProperty("lng")
  public java.math.BigDecimal getLng() {
    return lng;
  }
  
  /**
   **/
  public void setLng(java.math.BigDecimal lng) {
    this.lng = lng;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("lat")
  @com.fasterxml.jackson.annotation.JsonProperty("lat")
  public java.math.BigDecimal getLat() {
    return lat;
  }
  
  /**
   **/
  public void setLat(java.math.BigDecimal lat) {
    this.lat = lat;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("homepage")
  @com.fasterxml.jackson.annotation.JsonProperty("homepage")
  public String getHomepage() {
    return homepage;
  }
  
  /**
   **/
  public void setHomepage(String homepage) {
    this.homepage = homepage;
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
  @org.codehaus.jackson.annotate.JsonProperty("address")
  @com.fasterxml.jackson.annotation.JsonProperty("address")
  public String getAddress() {
    return address;
  }
  
  /**
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
    LocationDto locationDto = (LocationDto) o;
    return Objects.equals(this.zipcode, locationDto.zipcode) &&
        Objects.equals(this.phoneNumber, locationDto.phoneNumber) &&
        Objects.equals(this.name, locationDto.name) &&
        Objects.equals(this.locationId, locationDto.locationId) &&
        Objects.equals(this.locale, locationDto.locale) &&
        Objects.equals(this.lng, locationDto.lng) &&
        Objects.equals(this.lat, locationDto.lat) &&
        Objects.equals(this.homepage, locationDto.homepage) &&
        Objects.equals(this.extraInfo, locationDto.extraInfo) &&
        Objects.equals(this.address, locationDto.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zipcode, phoneNumber, name, locationId, locale, lng, lat, homepage, extraInfo, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationDto {\n");
    
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
    sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
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

  public static LocationDtoBuilder builder() {
    return new LocationDtoBuilder();
  }

  public static class LocationDtoBuilder {

    private String zipcode = null;
    private String phoneNumber = null;
    private String name = null;
    private Long locationId = null;
    private String locale = null;
    private java.math.BigDecimal lng = null;
    private java.math.BigDecimal lat = null;
    private String homepage = null;
    private String extraInfo = null;
    private String address = null;
    

    LocationDtoBuilder() {
    }

    /**
     **/
    public LocationDtoBuilder zipcode(String zipcode) {
      this.zipcode = zipcode;
      return this;
    }

    /**
     **/
    public LocationDtoBuilder phoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    /**
     **/
    public LocationDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public LocationDtoBuilder locationId(Long locationId) {
      this.locationId = locationId;
      return this;
    }

    /**
     **/
    public LocationDtoBuilder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     **/
    public LocationDtoBuilder lng(java.math.BigDecimal lng) {
      this.lng = lng;
      return this;
    }

    /**
     **/
    public LocationDtoBuilder lat(java.math.BigDecimal lat) {
      this.lat = lat;
      return this;
    }

    /**
     **/
    public LocationDtoBuilder homepage(String homepage) {
      this.homepage = homepage;
      return this;
    }

    /**
     **/
    public LocationDtoBuilder extraInfo(String extraInfo) {
      this.extraInfo = extraInfo;
      return this;
    }

    /**
     **/
    public LocationDtoBuilder address(String address) {
      this.address = address;
      return this;
    }


    public LocationDto build() {
      LocationDto locationDto = new LocationDto();
      locationDto.setZipcode(this.zipcode);
      locationDto.setPhoneNumber(this.phoneNumber);
      locationDto.setName(this.name);
      locationDto.setLocationId(this.locationId);
      locationDto.setLocale(this.locale);
      locationDto.setLng(this.lng);
      locationDto.setLat(this.lat);
      locationDto.setHomepage(this.homepage);
      locationDto.setExtraInfo(this.extraInfo);
      locationDto.setAddress(this.address);
      return locationDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class LocationDtoBuilder {\n");
      
      sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
      sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
      sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
      sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
      sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
      sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
      sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
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

