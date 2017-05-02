package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.search_api.model.Location;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class Viewport   {
  
  private Location southwest = null;
  private Location northeast = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("southwest")
  @com.fasterxml.jackson.annotation.JsonProperty("southwest")
  public Location getSouthwest() {
    return southwest;
  }
  
  /**
   **/
  public void setSouthwest(Location southwest) {
    this.southwest = southwest;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("northeast")
  @com.fasterxml.jackson.annotation.JsonProperty("northeast")
  public Location getNortheast() {
    return northeast;
  }
  
  /**
   **/
  public void setNortheast(Location northeast) {
    this.northeast = northeast;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Viewport viewport = (Viewport) o;
    return Objects.equals(this.southwest, viewport.southwest) &&
        Objects.equals(this.northeast, viewport.northeast);
  }

  @Override
  public int hashCode() {
    return Objects.hash(southwest, northeast);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Viewport {\n");
    
    sb.append("    southwest: ").append(toIndentedString(southwest)).append("\n");
    sb.append("    northeast: ").append(toIndentedString(northeast)).append("\n");
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

  public static ViewportBuilder builder() {
    return new ViewportBuilder();
  }

  public static class ViewportBuilder {

    private Location southwest = null;
    private Location northeast = null;
    

    ViewportBuilder() {
    }

    /**
     **/
    public ViewportBuilder southwest(Location southwest) {
      this.southwest = southwest;
      return this;
    }

    /**
     **/
    public ViewportBuilder northeast(Location northeast) {
      this.northeast = northeast;
      return this;
    }


    public Viewport build() {
      Viewport viewport = new Viewport();
      viewport.setSouthwest(this.southwest);
      viewport.setNortheast(this.northeast);
      return viewport;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ViewportBuilder {\n");
      
      sb.append("    southwest: ").append(toIndentedString(southwest)).append("\n");
      sb.append("    northeast: ").append(toIndentedString(northeast)).append("\n");
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

