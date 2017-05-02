package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_api.model.CouponFilterTypeDto;
import java.util.*;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class CouponConditionDto   {
  
  private Integer rentalPeriod = null;
  private Date pickUpDate = null;
  private Integer pageSize = null;
  private Integer pageNumber = null;
  private Long itemId = null;
  private List<CouponFilterTypeDto> filterTypeDtos = new ArrayList<CouponFilterTypeDto>();
  private Date dropOffDate = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("rentalPeriod")
  @com.fasterxml.jackson.annotation.JsonProperty("rentalPeriod")
  public Integer getRentalPeriod() {
    return rentalPeriod;
  }
  
  /**
   **/
  public void setRentalPeriod(Integer rentalPeriod) {
    this.rentalPeriod = rentalPeriod;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("pickUpDate")
  @com.fasterxml.jackson.annotation.JsonProperty("pickUpDate")
  public Date getPickUpDate() {
    return pickUpDate;
  }
  
  /**
   **/
  public void setPickUpDate(Date pickUpDate) {
    this.pickUpDate = pickUpDate;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("pageSize")
  @com.fasterxml.jackson.annotation.JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  
  /**
   **/
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("pageNumber")
  @com.fasterxml.jackson.annotation.JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  
  /**
   **/
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemId")
  @com.fasterxml.jackson.annotation.JsonProperty("itemId")
  public Long getItemId() {
    return itemId;
  }
  
  /**
   **/
  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("filterTypeDtos")
  @com.fasterxml.jackson.annotation.JsonProperty("filterTypeDtos")
  public List<CouponFilterTypeDto> getFilterTypeDtos() {
    return filterTypeDtos;
  }
  
  /**
   **/
  public void setFilterTypeDtos(List<CouponFilterTypeDto> filterTypeDtos) {
    this.filterTypeDtos = filterTypeDtos;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("dropOffDate")
  @com.fasterxml.jackson.annotation.JsonProperty("dropOffDate")
  public Date getDropOffDate() {
    return dropOffDate;
  }
  
  /**
   **/
  public void setDropOffDate(Date dropOffDate) {
    this.dropOffDate = dropOffDate;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponConditionDto couponConditionDto = (CouponConditionDto) o;
    return Objects.equals(this.rentalPeriod, couponConditionDto.rentalPeriod) &&
        Objects.equals(this.pickUpDate, couponConditionDto.pickUpDate) &&
        Objects.equals(this.pageSize, couponConditionDto.pageSize) &&
        Objects.equals(this.pageNumber, couponConditionDto.pageNumber) &&
        Objects.equals(this.itemId, couponConditionDto.itemId) &&
        Objects.equals(this.filterTypeDtos, couponConditionDto.filterTypeDtos) &&
        Objects.equals(this.dropOffDate, couponConditionDto.dropOffDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rentalPeriod, pickUpDate, pageSize, pageNumber, itemId, filterTypeDtos, dropOffDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponConditionDto {\n");
    
    sb.append("    rentalPeriod: ").append(toIndentedString(rentalPeriod)).append("\n");
    sb.append("    pickUpDate: ").append(toIndentedString(pickUpDate)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    filterTypeDtos: ").append(toIndentedString(filterTypeDtos)).append("\n");
    sb.append("    dropOffDate: ").append(toIndentedString(dropOffDate)).append("\n");
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

  public static CouponConditionDtoBuilder builder() {
    return new CouponConditionDtoBuilder();
  }

  public static class CouponConditionDtoBuilder {

    private Integer rentalPeriod = null;
    private Date pickUpDate = null;
    private Integer pageSize = null;
    private Integer pageNumber = null;
    private Long itemId = null;
    private List<CouponFilterTypeDto> filterTypeDtos = new ArrayList<CouponFilterTypeDto>();
    private Date dropOffDate = null;
    

    CouponConditionDtoBuilder() {
    }

    /**
     **/
    public CouponConditionDtoBuilder rentalPeriod(Integer rentalPeriod) {
      this.rentalPeriod = rentalPeriod;
      return this;
    }

    /**
     **/
    public CouponConditionDtoBuilder pickUpDate(Date pickUpDate) {
      this.pickUpDate = pickUpDate;
      return this;
    }

    /**
     **/
    public CouponConditionDtoBuilder pageSize(Integer pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     **/
    public CouponConditionDtoBuilder pageNumber(Integer pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     **/
    public CouponConditionDtoBuilder itemId(Long itemId) {
      this.itemId = itemId;
      return this;
    }

    /**
     **/
    public CouponConditionDtoBuilder filterTypeDtos(List<CouponFilterTypeDto> filterTypeDtos) {
      this.filterTypeDtos = filterTypeDtos;
      return this;
    }

    /**
     **/
    public CouponConditionDtoBuilder dropOffDate(Date dropOffDate) {
      this.dropOffDate = dropOffDate;
      return this;
    }


    public CouponConditionDto build() {
      CouponConditionDto couponConditionDto = new CouponConditionDto();
      couponConditionDto.setRentalPeriod(this.rentalPeriod);
      couponConditionDto.setPickUpDate(this.pickUpDate);
      couponConditionDto.setPageSize(this.pageSize);
      couponConditionDto.setPageNumber(this.pageNumber);
      couponConditionDto.setItemId(this.itemId);
      couponConditionDto.setFilterTypeDtos(this.filterTypeDtos);
      couponConditionDto.setDropOffDate(this.dropOffDate);
      return couponConditionDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CouponConditionDtoBuilder {\n");
      
      sb.append("    rentalPeriod: ").append(toIndentedString(rentalPeriod)).append("\n");
      sb.append("    pickUpDate: ").append(toIndentedString(pickUpDate)).append("\n");
      sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
      sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
      sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
      sb.append("    filterTypeDtos: ").append(toIndentedString(filterTypeDtos)).append("\n");
      sb.append("    dropOffDate: ").append(toIndentedString(dropOffDate)).append("\n");
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

