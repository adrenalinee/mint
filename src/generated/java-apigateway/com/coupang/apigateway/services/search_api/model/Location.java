package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class Location   {
  
  private String zipcode = null;
  private List<String> type = new ArrayList<String>();
  private String phoneNumber = null;
  private String name = null;
  private Long locationId = null;
  private String locale = null;
  private Double lng = null;
  private Double lat = null;
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
  @org.codehaus.jackson.annotate.JsonProperty("type")
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  public List<String> getType() {
    return type;
  }
  
  /**
   **/
  public void setType(List<String> type) {
    this.type = type;
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
  public Double getLng() {
    return lng;
  }
  
  /**
   **/
  public void setLng(Double lng) {
    this.lng = lng;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("lat")
  @com.fasterxml.jackson.annotation.JsonProperty("lat")
  public Double getLat() {
    return lat;
  }
  
  /**
   **/
  public void setLat(Double lat) {
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
    Location location = (Location) o;
    return Objects.equals(this.zipcode, location.zipcode) &&
        Objects.equals(this.type, location.type) &&
        Objects.equals(this.phoneNumber, location.phoneNumber) &&
        Objects.equals(this.name, location.name) &&
        Objects.equals(this.locationId, location.locationId) &&
        Objects.equals(this.locale, location.locale) &&
        Objects.equals(this.lng, location.lng) &&
        Objects.equals(this.lat, location.lat) &&
        Objects.equals(this.homepage, location.homepage) &&
        Objects.equals(this.extraInfo, location.extraInfo) &&
        Objects.equals(this.address, location.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zipcode, type, phoneNumber, name, locationId, locale, lng, lat, homepage, extraInfo, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

  public static LocationBuilder builder() {
    return new LocationBuilder();
  }

  public static class LocationBuilder {

    private String zipcode = null;
    private List<String> type = new ArrayList<String>();
    private String phoneNumber = null;
    private String name = null;
    private Long locationId = null;
    private String locale = null;
    private Double lng = null;
    private Double lat = null;
    private String homepage = null;
    private String extraInfo = null;
    private String address = null;
    

    LocationBuilder() {
    }

    /**
     **/
    public LocationBuilder zipcode(String zipcode) {
      this.zipcode = zipcode;
      return this;
    }

    /**
     **/
    public LocationBuilder type(List<String> type) {
      this.type = type;
      return this;
    }

    /**
     **/
    public LocationBuilder phoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    /**
     **/
    public LocationBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public LocationBuilder locationId(Long locationId) {
      this.locationId = locationId;
      return this;
    }

    /**
     **/
    public LocationBuilder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     **/
    public LocationBuilder lng(Double lng) {
      this.lng = lng;
      return this;
    }

    /**
     **/
    public LocationBuilder lat(Double lat) {
      this.lat = lat;
      return this;
    }

    /**
     **/
    public LocationBuilder homepage(String homepage) {
      this.homepage = homepage;
      return this;
    }

    /**
     **/
    public LocationBuilder extraInfo(String extraInfo) {
      this.extraInfo = extraInfo;
      return this;
    }

    /**
     **/
    public LocationBuilder address(String address) {
      this.address = address;
      return this;
    }


    public Location build() {
      Location location = new Location();
      location.setZipcode(this.zipcode);
      location.setType(this.type);
      location.setPhoneNumber(this.phoneNumber);
      location.setName(this.name);
      location.setLocationId(this.locationId);
      location.setLocale(this.locale);
      location.setLng(this.lng);
      location.setLat(this.lat);
      location.setHomepage(this.homepage);
      location.setExtraInfo(this.extraInfo);
      location.setAddress(this.address);
      return location;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class LocationBuilder {\n");
      
      sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
      sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

