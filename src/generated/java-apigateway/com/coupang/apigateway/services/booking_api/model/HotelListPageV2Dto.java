package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.booking_api.model.HotelDisplayItemUnitDto;
import com.coupang.apigateway.services.booking_api.model.RangeFilterDto;
import com.coupang.apigateway.services.booking_api.model.RegionDto;
import com.coupang.apigateway.services.booking_api.model.SelectFilterDto;
import com.coupang.apigateway.services.booking_api.model.SorterDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class HotelListPageV2Dto   {
  
  private Integer totalPages = null;
  private Long totalElements = null;
  private List<SelectFilterDto> selectFilterDtoList = new ArrayList<SelectFilterDto>();
  private List<RangeFilterDto> rangeFilterDtoList = new ArrayList<RangeFilterDto>();
  private List<SorterDto> orders = new ArrayList<SorterDto>();
  private RegionDto currentRegion = null;
  private Integer currentPage = null;
  private String currentOrderBy = null;
  private String currentFilter = null;
  private List<HotelDisplayItemUnitDto> contents = new ArrayList<HotelDisplayItemUnitDto>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("totalPages")
  @com.fasterxml.jackson.annotation.JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }
  
  /**
   **/
  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("totalElements")
  @com.fasterxml.jackson.annotation.JsonProperty("totalElements")
  public Long getTotalElements() {
    return totalElements;
  }
  
  /**
   **/
  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("selectFilterDtoList")
  @com.fasterxml.jackson.annotation.JsonProperty("selectFilterDtoList")
  public List<SelectFilterDto> getSelectFilterDtoList() {
    return selectFilterDtoList;
  }
  
  /**
   **/
  public void setSelectFilterDtoList(List<SelectFilterDto> selectFilterDtoList) {
    this.selectFilterDtoList = selectFilterDtoList;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("rangeFilterDtoList")
  @com.fasterxml.jackson.annotation.JsonProperty("rangeFilterDtoList")
  public List<RangeFilterDto> getRangeFilterDtoList() {
    return rangeFilterDtoList;
  }
  
  /**
   **/
  public void setRangeFilterDtoList(List<RangeFilterDto> rangeFilterDtoList) {
    this.rangeFilterDtoList = rangeFilterDtoList;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("orders")
  @com.fasterxml.jackson.annotation.JsonProperty("orders")
  public List<SorterDto> getOrders() {
    return orders;
  }
  
  /**
   **/
  public void setOrders(List<SorterDto> orders) {
    this.orders = orders;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("currentRegion")
  @com.fasterxml.jackson.annotation.JsonProperty("currentRegion")
  public RegionDto getCurrentRegion() {
    return currentRegion;
  }
  
  /**
   **/
  public void setCurrentRegion(RegionDto currentRegion) {
    this.currentRegion = currentRegion;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("currentPage")
  @com.fasterxml.jackson.annotation.JsonProperty("currentPage")
  public Integer getCurrentPage() {
    return currentPage;
  }
  
  /**
   **/
  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("currentOrderBy")
  @com.fasterxml.jackson.annotation.JsonProperty("currentOrderBy")
  public String getCurrentOrderBy() {
    return currentOrderBy;
  }
  
  /**
   **/
  public void setCurrentOrderBy(String currentOrderBy) {
    this.currentOrderBy = currentOrderBy;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("currentFilter")
  @com.fasterxml.jackson.annotation.JsonProperty("currentFilter")
  public String getCurrentFilter() {
    return currentFilter;
  }
  
  /**
   **/
  public void setCurrentFilter(String currentFilter) {
    this.currentFilter = currentFilter;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("contents")
  @com.fasterxml.jackson.annotation.JsonProperty("contents")
  public List<HotelDisplayItemUnitDto> getContents() {
    return contents;
  }
  
  /**
   **/
  public void setContents(List<HotelDisplayItemUnitDto> contents) {
    this.contents = contents;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotelListPageV2Dto hotelListPageV2Dto = (HotelListPageV2Dto) o;
    return Objects.equals(this.totalPages, hotelListPageV2Dto.totalPages) &&
        Objects.equals(this.totalElements, hotelListPageV2Dto.totalElements) &&
        Objects.equals(this.selectFilterDtoList, hotelListPageV2Dto.selectFilterDtoList) &&
        Objects.equals(this.rangeFilterDtoList, hotelListPageV2Dto.rangeFilterDtoList) &&
        Objects.equals(this.orders, hotelListPageV2Dto.orders) &&
        Objects.equals(this.currentRegion, hotelListPageV2Dto.currentRegion) &&
        Objects.equals(this.currentPage, hotelListPageV2Dto.currentPage) &&
        Objects.equals(this.currentOrderBy, hotelListPageV2Dto.currentOrderBy) &&
        Objects.equals(this.currentFilter, hotelListPageV2Dto.currentFilter) &&
        Objects.equals(this.contents, hotelListPageV2Dto.contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPages, totalElements, selectFilterDtoList, rangeFilterDtoList, orders, currentRegion, currentPage, currentOrderBy, currentFilter, contents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelListPageV2Dto {\n");
    
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    selectFilterDtoList: ").append(toIndentedString(selectFilterDtoList)).append("\n");
    sb.append("    rangeFilterDtoList: ").append(toIndentedString(rangeFilterDtoList)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
    sb.append("    currentRegion: ").append(toIndentedString(currentRegion)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    currentOrderBy: ").append(toIndentedString(currentOrderBy)).append("\n");
    sb.append("    currentFilter: ").append(toIndentedString(currentFilter)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
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

  public static HotelListPageV2DtoBuilder builder() {
    return new HotelListPageV2DtoBuilder();
  }

  public static class HotelListPageV2DtoBuilder {

    private Integer totalPages = null;
    private Long totalElements = null;
    private List<SelectFilterDto> selectFilterDtoList = new ArrayList<SelectFilterDto>();
    private List<RangeFilterDto> rangeFilterDtoList = new ArrayList<RangeFilterDto>();
    private List<SorterDto> orders = new ArrayList<SorterDto>();
    private RegionDto currentRegion = null;
    private Integer currentPage = null;
    private String currentOrderBy = null;
    private String currentFilter = null;
    private List<HotelDisplayItemUnitDto> contents = new ArrayList<HotelDisplayItemUnitDto>();
    

    HotelListPageV2DtoBuilder() {
    }

    /**
     **/
    public HotelListPageV2DtoBuilder totalPages(Integer totalPages) {
      this.totalPages = totalPages;
      return this;
    }

    /**
     **/
    public HotelListPageV2DtoBuilder totalElements(Long totalElements) {
      this.totalElements = totalElements;
      return this;
    }

    /**
     **/
    public HotelListPageV2DtoBuilder selectFilterDtoList(List<SelectFilterDto> selectFilterDtoList) {
      this.selectFilterDtoList = selectFilterDtoList;
      return this;
    }

    /**
     **/
    public HotelListPageV2DtoBuilder rangeFilterDtoList(List<RangeFilterDto> rangeFilterDtoList) {
      this.rangeFilterDtoList = rangeFilterDtoList;
      return this;
    }

    /**
     **/
    public HotelListPageV2DtoBuilder orders(List<SorterDto> orders) {
      this.orders = orders;
      return this;
    }

    /**
     **/
    public HotelListPageV2DtoBuilder currentRegion(RegionDto currentRegion) {
      this.currentRegion = currentRegion;
      return this;
    }

    /**
     **/
    public HotelListPageV2DtoBuilder currentPage(Integer currentPage) {
      this.currentPage = currentPage;
      return this;
    }

    /**
     **/
    public HotelListPageV2DtoBuilder currentOrderBy(String currentOrderBy) {
      this.currentOrderBy = currentOrderBy;
      return this;
    }

    /**
     **/
    public HotelListPageV2DtoBuilder currentFilter(String currentFilter) {
      this.currentFilter = currentFilter;
      return this;
    }

    /**
     **/
    public HotelListPageV2DtoBuilder contents(List<HotelDisplayItemUnitDto> contents) {
      this.contents = contents;
      return this;
    }


    public HotelListPageV2Dto build() {
      HotelListPageV2Dto hotelListPageV2Dto = new HotelListPageV2Dto();
      hotelListPageV2Dto.setTotalPages(this.totalPages);
      hotelListPageV2Dto.setTotalElements(this.totalElements);
      hotelListPageV2Dto.setSelectFilterDtoList(this.selectFilterDtoList);
      hotelListPageV2Dto.setRangeFilterDtoList(this.rangeFilterDtoList);
      hotelListPageV2Dto.setOrders(this.orders);
      hotelListPageV2Dto.setCurrentRegion(this.currentRegion);
      hotelListPageV2Dto.setCurrentPage(this.currentPage);
      hotelListPageV2Dto.setCurrentOrderBy(this.currentOrderBy);
      hotelListPageV2Dto.setCurrentFilter(this.currentFilter);
      hotelListPageV2Dto.setContents(this.contents);
      return hotelListPageV2Dto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HotelListPageV2DtoBuilder {\n");
      
      sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
      sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
      sb.append("    selectFilterDtoList: ").append(toIndentedString(selectFilterDtoList)).append("\n");
      sb.append("    rangeFilterDtoList: ").append(toIndentedString(rangeFilterDtoList)).append("\n");
      sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
      sb.append("    currentRegion: ").append(toIndentedString(currentRegion)).append("\n");
      sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
      sb.append("    currentOrderBy: ").append(toIndentedString(currentOrderBy)).append("\n");
      sb.append("    currentFilter: ").append(toIndentedString(currentFilter)).append("\n");
      sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
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

