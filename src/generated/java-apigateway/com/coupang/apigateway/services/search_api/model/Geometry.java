package com.coupang.apigateway.services.search_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.search_api.model.Location;
import com.coupang.apigateway.services.search_api.model.Viewport;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.828+09:00")
public class Geometry   {
  
  private Viewport viewport = null;
  private Location location = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("viewport")
  @com.fasterxml.jackson.annotation.JsonProperty("viewport")
  public Viewport getViewport() {
    return viewport;
  }
  
  /**
   **/
  public void setViewport(Viewport viewport) {
    this.viewport = viewport;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("location")
  @com.fasterxml.jackson.annotation.JsonProperty("location")
  public Location getLocation() {
    return location;
  }
  
  /**
   **/
  public void setLocation(Location location) {
    this.location = location;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Geometry geometry = (Geometry) o;
    return Objects.equals(this.viewport, geometry.viewport) &&
        Objects.equals(this.location, geometry.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(viewport, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Geometry {\n");
    
    sb.append("    viewport: ").append(toIndentedString(viewport)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

  public static GeometryBuilder builder() {
    return new GeometryBuilder();
  }

  public static class GeometryBuilder {

    private Viewport viewport = null;
    private Location location = null;
    

    GeometryBuilder() {
    }

    /**
     **/
    public GeometryBuilder viewport(Viewport viewport) {
      this.viewport = viewport;
      return this;
    }

    /**
     **/
    public GeometryBuilder location(Location location) {
      this.location = location;
      return this;
    }


    public Geometry build() {
      Geometry geometry = new Geometry();
      geometry.setViewport(this.viewport);
      geometry.setLocation(this.location);
      return geometry;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class GeometryBuilder {\n");
      
      sb.append("    viewport: ").append(toIndentedString(viewport)).append("\n");
      sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

