package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class PlaceDto   {
  
  private String zipCode = null;
  private Boolean representative = null;
  private Long placeSrl = null;
  private String phoneNumber = null;
  private String partnerId = null;
  private String name = null;
  private String lng = null;
  private String lat = null;
  private String homepage = null;
  private String extraVars = null;
  private Long coupangSrl = null;
  private String address = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("zipCode")
  @com.fasterxml.jackson.annotation.JsonProperty("zipCode")
  public String getZipCode() {
    return zipCode;
  }
  
  /**
   **/
  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("representative")
  @com.fasterxml.jackson.annotation.JsonProperty("representative")
  public Boolean getRepresentative() {
    return representative;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isRepresentative() {
    return representative == null ? false : representative;
  }
  
  /**
   **/
  public void setRepresentative(Boolean representative) {
    this.representative = representative;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("placeSrl")
  @com.fasterxml.jackson.annotation.JsonProperty("placeSrl")
  public Long getPlaceSrl() {
    return placeSrl;
  }
  
  /**
   **/
  public void setPlaceSrl(Long placeSrl) {
    this.placeSrl = placeSrl;
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
  @org.codehaus.jackson.annotate.JsonProperty("partnerId")
  @com.fasterxml.jackson.annotation.JsonProperty("partnerId")
  public String getPartnerId() {
    return partnerId;
  }
  
  /**
   **/
  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
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
  @org.codehaus.jackson.annotate.JsonProperty("lng")
  @com.fasterxml.jackson.annotation.JsonProperty("lng")
  public String getLng() {
    return lng;
  }
  
  /**
   **/
  public void setLng(String lng) {
    this.lng = lng;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("lat")
  @com.fasterxml.jackson.annotation.JsonProperty("lat")
  public String getLat() {
    return lat;
  }
  
  /**
   **/
  public void setLat(String lat) {
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
  @org.codehaus.jackson.annotate.JsonProperty("extraVars")
  @com.fasterxml.jackson.annotation.JsonProperty("extraVars")
  public String getExtraVars() {
    return extraVars;
  }
  
  /**
   **/
  public void setExtraVars(String extraVars) {
    this.extraVars = extraVars;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("coupangSrl")
  @com.fasterxml.jackson.annotation.JsonProperty("coupangSrl")
  public Long getCoupangSrl() {
    return coupangSrl;
  }
  
  /**
   **/
  public void setCoupangSrl(Long coupangSrl) {
    this.coupangSrl = coupangSrl;
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
    PlaceDto placeDto = (PlaceDto) o;
    return Objects.equals(this.zipCode, placeDto.zipCode) &&
        Objects.equals(this.representative, placeDto.representative) &&
        Objects.equals(this.placeSrl, placeDto.placeSrl) &&
        Objects.equals(this.phoneNumber, placeDto.phoneNumber) &&
        Objects.equals(this.partnerId, placeDto.partnerId) &&
        Objects.equals(this.name, placeDto.name) &&
        Objects.equals(this.lng, placeDto.lng) &&
        Objects.equals(this.lat, placeDto.lat) &&
        Objects.equals(this.homepage, placeDto.homepage) &&
        Objects.equals(this.extraVars, placeDto.extraVars) &&
        Objects.equals(this.coupangSrl, placeDto.coupangSrl) &&
        Objects.equals(this.address, placeDto.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zipCode, representative, placeSrl, phoneNumber, partnerId, name, lng, lat, homepage, extraVars, coupangSrl, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaceDto {\n");
    
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    representative: ").append(toIndentedString(representative)).append("\n");
    sb.append("    placeSrl: ").append(toIndentedString(placeSrl)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
    sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
    sb.append("    extraVars: ").append(toIndentedString(extraVars)).append("\n");
    sb.append("    coupangSrl: ").append(toIndentedString(coupangSrl)).append("\n");
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

  public static PlaceDtoBuilder builder() {
    return new PlaceDtoBuilder();
  }

  public static class PlaceDtoBuilder {

    private String zipCode = null;
    private Boolean representative = null;
    private Long placeSrl = null;
    private String phoneNumber = null;
    private String partnerId = null;
    private String name = null;
    private String lng = null;
    private String lat = null;
    private String homepage = null;
    private String extraVars = null;
    private Long coupangSrl = null;
    private String address = null;
    

    PlaceDtoBuilder() {
    }

    /**
     **/
    public PlaceDtoBuilder zipCode(String zipCode) {
      this.zipCode = zipCode;
      return this;
    }

    /**
     **/
    public PlaceDtoBuilder representative(Boolean representative) {
      this.representative = representative;
      return this;
    }

    /**
     **/
    public PlaceDtoBuilder placeSrl(Long placeSrl) {
      this.placeSrl = placeSrl;
      return this;
    }

    /**
     **/
    public PlaceDtoBuilder phoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    /**
     **/
    public PlaceDtoBuilder partnerId(String partnerId) {
      this.partnerId = partnerId;
      return this;
    }

    /**
     **/
    public PlaceDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public PlaceDtoBuilder lng(String lng) {
      this.lng = lng;
      return this;
    }

    /**
     **/
    public PlaceDtoBuilder lat(String lat) {
      this.lat = lat;
      return this;
    }

    /**
     **/
    public PlaceDtoBuilder homepage(String homepage) {
      this.homepage = homepage;
      return this;
    }

    /**
     **/
    public PlaceDtoBuilder extraVars(String extraVars) {
      this.extraVars = extraVars;
      return this;
    }

    /**
     **/
    public PlaceDtoBuilder coupangSrl(Long coupangSrl) {
      this.coupangSrl = coupangSrl;
      return this;
    }

    /**
     **/
    public PlaceDtoBuilder address(String address) {
      this.address = address;
      return this;
    }


    public PlaceDto build() {
      PlaceDto placeDto = new PlaceDto();
      placeDto.setZipCode(this.zipCode);
      placeDto.setRepresentative(this.representative);
      placeDto.setPlaceSrl(this.placeSrl);
      placeDto.setPhoneNumber(this.phoneNumber);
      placeDto.setPartnerId(this.partnerId);
      placeDto.setName(this.name);
      placeDto.setLng(this.lng);
      placeDto.setLat(this.lat);
      placeDto.setHomepage(this.homepage);
      placeDto.setExtraVars(this.extraVars);
      placeDto.setCoupangSrl(this.coupangSrl);
      placeDto.setAddress(this.address);
      return placeDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PlaceDtoBuilder {\n");
      
      sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
      sb.append("    representative: ").append(toIndentedString(representative)).append("\n");
      sb.append("    placeSrl: ").append(toIndentedString(placeSrl)).append("\n");
      sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
      sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
      sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
      sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
      sb.append("    extraVars: ").append(toIndentedString(extraVars)).append("\n");
      sb.append("    coupangSrl: ").append(toIndentedString(coupangSrl)).append("\n");
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

