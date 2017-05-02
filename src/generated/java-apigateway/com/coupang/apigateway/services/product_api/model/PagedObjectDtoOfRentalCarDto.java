package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_api.model.Pagination;
import com.coupang.apigateway.services.product_api.model.RentalCarDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class PagedObjectDtoOfRentalCarDto   {
  
  private List<RentalCarDto> result = new ArrayList<RentalCarDto>();
  private Pagination pagination = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("result")
  @com.fasterxml.jackson.annotation.JsonProperty("result")
  public List<RentalCarDto> getResult() {
    return result;
  }
  
  /**
   **/
  public void setResult(List<RentalCarDto> result) {
    this.result = result;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("pagination")
  @com.fasterxml.jackson.annotation.JsonProperty("pagination")
  public Pagination getPagination() {
    return pagination;
  }
  
  /**
   **/
  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedObjectDtoOfRentalCarDto pagedObjectDtoOfRentalCarDto = (PagedObjectDtoOfRentalCarDto) o;
    return Objects.equals(this.result, pagedObjectDtoOfRentalCarDto.result) &&
        Objects.equals(this.pagination, pagedObjectDtoOfRentalCarDto.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedObjectDtoOfRentalCarDto {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

  public static PagedObjectDtoOfRentalCarDtoBuilder builder() {
    return new PagedObjectDtoOfRentalCarDtoBuilder();
  }

  public static class PagedObjectDtoOfRentalCarDtoBuilder {

    private List<RentalCarDto> result = new ArrayList<RentalCarDto>();
    private Pagination pagination = null;
    

    PagedObjectDtoOfRentalCarDtoBuilder() {
    }

    /**
     **/
    public PagedObjectDtoOfRentalCarDtoBuilder result(List<RentalCarDto> result) {
      this.result = result;
      return this;
    }

    /**
     **/
    public PagedObjectDtoOfRentalCarDtoBuilder pagination(Pagination pagination) {
      this.pagination = pagination;
      return this;
    }


    public PagedObjectDtoOfRentalCarDto build() {
      PagedObjectDtoOfRentalCarDto pagedObjectDtoOfRentalCarDto = new PagedObjectDtoOfRentalCarDto();
      pagedObjectDtoOfRentalCarDto.setResult(this.result);
      pagedObjectDtoOfRentalCarDto.setPagination(this.pagination);
      return pagedObjectDtoOfRentalCarDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PagedObjectDtoOfRentalCarDtoBuilder {\n");
      
      sb.append("    result: ").append(toIndentedString(result)).append("\n");
      sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

