package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class LatLng   {
  
  private String lng = null;
  private String lat = null;

  
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LatLng latLng = (LatLng) o;
    return Objects.equals(this.lng, latLng.lng) &&
        Objects.equals(this.lat, latLng.lat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lng, lat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LatLng {\n");
    
    sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
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

  public static LatLngBuilder builder() {
    return new LatLngBuilder();
  }

  public static class LatLngBuilder {

    private String lng = null;
    private String lat = null;
    

    LatLngBuilder() {
    }

    /**
     **/
    public LatLngBuilder lng(String lng) {
      this.lng = lng;
      return this;
    }

    /**
     **/
    public LatLngBuilder lat(String lat) {
      this.lat = lat;
      return this;
    }


    public LatLng build() {
      LatLng latLng = new LatLng();
      latLng.setLng(this.lng);
      latLng.setLat(this.lat);
      return latLng;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class LatLngBuilder {\n");
      
      sb.append("    lng: ").append(toIndentedString(lng)).append("\n");
      sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
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

