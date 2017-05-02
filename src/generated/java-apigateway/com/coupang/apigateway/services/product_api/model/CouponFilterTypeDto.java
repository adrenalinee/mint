package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_api.model.CouponFilterValueDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class CouponFilterTypeDto   {
  
  private String name = null;
  private List<CouponFilterValueDto> filterValueDtos = new ArrayList<CouponFilterValueDto>();
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
  @org.codehaus.jackson.annotate.JsonProperty("filterValueDtos")
  @com.fasterxml.jackson.annotation.JsonProperty("filterValueDtos")
  public List<CouponFilterValueDto> getFilterValueDtos() {
    return filterValueDtos;
  }
  
  /**
   **/
  public void setFilterValueDtos(List<CouponFilterValueDto> filterValueDtos) {
    this.filterValueDtos = filterValueDtos;
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
    CouponFilterTypeDto couponFilterTypeDto = (CouponFilterTypeDto) o;
    return Objects.equals(this.name, couponFilterTypeDto.name) &&
        Objects.equals(this.filterValueDtos, couponFilterTypeDto.filterValueDtos) &&
        Objects.equals(this.description, couponFilterTypeDto.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, filterValueDtos, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponFilterTypeDto {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    filterValueDtos: ").append(toIndentedString(filterValueDtos)).append("\n");
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

  public static CouponFilterTypeDtoBuilder builder() {
    return new CouponFilterTypeDtoBuilder();
  }

  public static class CouponFilterTypeDtoBuilder {

    private String name = null;
    private List<CouponFilterValueDto> filterValueDtos = new ArrayList<CouponFilterValueDto>();
    private String description = null;
    

    CouponFilterTypeDtoBuilder() {
    }

    /**
     **/
    public CouponFilterTypeDtoBuilder name(String name) {
      this.name = name;
      return this;
    }

    /**
     **/
    public CouponFilterTypeDtoBuilder filterValueDtos(List<CouponFilterValueDto> filterValueDtos) {
      this.filterValueDtos = filterValueDtos;
      return this;
    }

    /**
     **/
    public CouponFilterTypeDtoBuilder description(String description) {
      this.description = description;
      return this;
    }


    public CouponFilterTypeDto build() {
      CouponFilterTypeDto couponFilterTypeDto = new CouponFilterTypeDto();
      couponFilterTypeDto.setName(this.name);
      couponFilterTypeDto.setFilterValueDtos(this.filterValueDtos);
      couponFilterTypeDto.setDescription(this.description);
      return couponFilterTypeDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CouponFilterTypeDtoBuilder {\n");
      
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    filterValueDtos: ").append(toIndentedString(filterValueDtos)).append("\n");
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

