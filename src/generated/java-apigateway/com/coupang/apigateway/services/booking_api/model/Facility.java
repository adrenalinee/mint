package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class Facility   {
  
  private String name = null;
  private String code = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("code")
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  public String getCode() {
    return code;
  }
  
  /**
   **/
  public void setCode(String code) {
    this.code = code;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Facility facility = (Facility) o;
    return Objects.equals(this.name, facility.name) &&
        Objects.equals(this.code, facility.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Facility {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

  public static FacilityBuilder builder() {
    return new FacilityBuilder();
  }

  public static class FacilityBuilder {

    private String name = null;
    private String code = null;
    

    FacilityBuilder() {
    }

    /**
     **/
    public FacilityBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public FacilityBuilder code(String code) {
      this.code = code;
      return this;
    }


    public Facility build() {
      Facility facility = new Facility();
      facility.setName(this.name);
      facility.setCode(this.code);
      return facility;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class FacilityBuilder {\n");
      
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

