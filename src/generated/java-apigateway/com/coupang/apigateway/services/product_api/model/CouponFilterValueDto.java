package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class CouponFilterValueDto   {
  
  private String name = null;
  private String description = null;

  
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponFilterValueDto couponFilterValueDto = (CouponFilterValueDto) o;
    return Objects.equals(this.name, couponFilterValueDto.name) &&
        Objects.equals(this.description, couponFilterValueDto.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponFilterValueDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

  public static CouponFilterValueDtoBuilder builder() {
    return new CouponFilterValueDtoBuilder();
  }

  public static class CouponFilterValueDtoBuilder {

    private String name = null;
    private String description = null;
    

    CouponFilterValueDtoBuilder() {
    }

    /**
     **/
    public CouponFilterValueDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public CouponFilterValueDtoBuilder description(String description) {
      this.description = description;
      return this;
    }


    public CouponFilterValueDto build() {
      CouponFilterValueDto couponFilterValueDto = new CouponFilterValueDto();
      couponFilterValueDto.setName(this.name);
      couponFilterValueDto.setDescription(this.description);
      return couponFilterValueDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CouponFilterValueDtoBuilder {\n");
      
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

