package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.booking_api.model.CustomerReviewDto;
import com.coupang.apigateway.services.booking_api.model.PairOfstringAndstring;
import com.coupang.apigateway.services.booking_api.model.TotalGradeDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class HotelReviewDto   {
  
  private TotalGradeDto totalGradeDto = null;
  private List<PairOfstringAndstring> order = new ArrayList<PairOfstringAndstring>();
  private List<PairOfstringAndstring> filter = new ArrayList<PairOfstringAndstring>();
  private List<CustomerReviewDto> customerReviewDtos = new ArrayList<CustomerReviewDto>();
  private String currentOrderBy = null;
  private String currentFilter = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "리뷰 총점")
  @org.codehaus.jackson.annotate.JsonProperty("totalGradeDto")
  @com.fasterxml.jackson.annotation.JsonProperty("totalGradeDto")
  public TotalGradeDto getTotalGradeDto() {
    return totalGradeDto;
  }
  
  /**
   * 리뷰 총점
   **/
  public void setTotalGradeDto(TotalGradeDto totalGradeDto) {
    this.totalGradeDto = totalGradeDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "리뷰 정렬, key,value 또는 left, right 로 꺼내쓰면 됩니다.")
  @org.codehaus.jackson.annotate.JsonProperty("order")
  @com.fasterxml.jackson.annotation.JsonProperty("order")
  public List<PairOfstringAndstring> getOrder() {
    return order;
  }
  
  /**
   * 리뷰 정렬, key,value 또는 left, right 로 꺼내쓰면 됩니다.
   **/
  public void setOrder(List<PairOfstringAndstring> order) {
    this.order = order;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "리뷰 필터, key,value 또는 left, right 로 꺼내쓰면 됩니다.")
  @org.codehaus.jackson.annotate.JsonProperty("filter")
  @com.fasterxml.jackson.annotation.JsonProperty("filter")
  public List<PairOfstringAndstring> getFilter() {
    return filter;
  }
  
  /**
   * 리뷰 필터, key,value 또는 left, right 로 꺼내쓰면 됩니다.
   **/
  public void setFilter(List<PairOfstringAndstring> filter) {
    this.filter = filter;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "리뷰 목록")
  @org.codehaus.jackson.annotate.JsonProperty("customerReviewDtos")
  @com.fasterxml.jackson.annotation.JsonProperty("customerReviewDtos")
  public List<CustomerReviewDto> getCustomerReviewDtos() {
    return customerReviewDtos;
  }
  
  /**
   * 리뷰 목록
   **/
  public void setCustomerReviewDtos(List<CustomerReviewDto> customerReviewDtos) {
    this.customerReviewDtos = customerReviewDtos;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "현재 적용된 OrderBy")
  @org.codehaus.jackson.annotate.JsonProperty("currentOrderBy")
  @com.fasterxml.jackson.annotation.JsonProperty("currentOrderBy")
  public String getCurrentOrderBy() {
    return currentOrderBy;
  }
  
  /**
   * 현재 적용된 OrderBy
   **/
  public void setCurrentOrderBy(String currentOrderBy) {
    this.currentOrderBy = currentOrderBy;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "현재 적용된 Filter")
  @org.codehaus.jackson.annotate.JsonProperty("currentFilter")
  @com.fasterxml.jackson.annotation.JsonProperty("currentFilter")
  public String getCurrentFilter() {
    return currentFilter;
  }
  
  /**
   * 현재 적용된 Filter
   **/
  public void setCurrentFilter(String currentFilter) {
    this.currentFilter = currentFilter;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelReviewDto hotelReviewDto = (HotelReviewDto) o;
    return Objects.equals(this.totalGradeDto, hotelReviewDto.totalGradeDto) &&
        Objects.equals(this.order, hotelReviewDto.order) &&
        Objects.equals(this.filter, hotelReviewDto.filter) &&
        Objects.equals(this.customerReviewDtos, hotelReviewDto.customerReviewDtos) &&
        Objects.equals(this.currentOrderBy, hotelReviewDto.currentOrderBy) &&
        Objects.equals(this.currentFilter, hotelReviewDto.currentFilter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalGradeDto, order, filter, customerReviewDtos, currentOrderBy, currentFilter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelReviewDto {\n");
    
    sb.append("    totalGradeDto: ").append(toIndentedString(totalGradeDto)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    customerReviewDtos: ").append(toIndentedString(customerReviewDtos)).append("\n");
    sb.append("    currentOrderBy: ").append(toIndentedString(currentOrderBy)).append("\n");
    sb.append("    currentFilter: ").append(toIndentedString(currentFilter)).append("\n");
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

  public static HotelReviewDtoBuilder builder() {
    return new HotelReviewDtoBuilder();
  }

  public static class HotelReviewDtoBuilder {

    private TotalGradeDto totalGradeDto = null;
    private List<PairOfstringAndstring> order = new ArrayList<PairOfstringAndstring>();
    private List<PairOfstringAndstring> filter = new ArrayList<PairOfstringAndstring>();
    private List<CustomerReviewDto> customerReviewDtos = new ArrayList<CustomerReviewDto>();
    private String currentOrderBy = null;
    private String currentFilter = null;
    

    HotelReviewDtoBuilder() {
    }

    /**
     * 리뷰 총점
     **/
    public HotelReviewDtoBuilder totalGradeDto(TotalGradeDto totalGradeDto) {
      this.totalGradeDto = totalGradeDto;
      return this;
    }

    /**
     * 리뷰 정렬, key,value 또는 left, right 로 꺼내쓰면 됩니다.
     **/
    public HotelReviewDtoBuilder order(List<PairOfstringAndstring> order) {
      this.order = order;
      return this;
    }

    /**
     * 리뷰 필터, key,value 또는 left, right 로 꺼내쓰면 됩니다.
     **/
    public HotelReviewDtoBuilder filter(List<PairOfstringAndstring> filter) {
      this.filter = filter;
      return this;
    }

    /**
     * 리뷰 목록
     **/
    public HotelReviewDtoBuilder customerReviewDtos(List<CustomerReviewDto> customerReviewDtos) {
      this.customerReviewDtos = customerReviewDtos;
      return this;
    }

    /**
     * 현재 적용된 OrderBy
     **/
    public HotelReviewDtoBuilder currentOrderBy(String currentOrderBy) {
      this.currentOrderBy = currentOrderBy;
      return this;
    }

    /**
     * 현재 적용된 Filter
     **/
    public HotelReviewDtoBuilder currentFilter(String currentFilter) {
      this.currentFilter = currentFilter;
      return this;
    }


    public HotelReviewDto build() {
      HotelReviewDto hotelReviewDto = new HotelReviewDto();
      hotelReviewDto.setTotalGradeDto(this.totalGradeDto);
      hotelReviewDto.setOrder(this.order);
      hotelReviewDto.setFilter(this.filter);
      hotelReviewDto.setCustomerReviewDtos(this.customerReviewDtos);
      hotelReviewDto.setCurrentOrderBy(this.currentOrderBy);
      hotelReviewDto.setCurrentFilter(this.currentFilter);
      return hotelReviewDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HotelReviewDtoBuilder {\n");
      
      sb.append("    totalGradeDto: ").append(toIndentedString(totalGradeDto)).append("\n");
      sb.append("    order: ").append(toIndentedString(order)).append("\n");
      sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
      sb.append("    customerReviewDtos: ").append(toIndentedString(customerReviewDtos)).append("\n");
      sb.append("    currentOrderBy: ").append(toIndentedString(currentOrderBy)).append("\n");
      sb.append("    currentFilter: ").append(toIndentedString(currentFilter)).append("\n");
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

