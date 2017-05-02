package com.coupang.apigateway.services.booking_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.booking_api.model.FilterDto;
import com.coupang.apigateway.services.booking_api.model.HotelDisplayItemUnitDto;
import com.coupang.apigateway.services.booking_api.model.RegionDto;
import com.coupang.apigateway.services.booking_api.model.SorterDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.642+09:00")
public class HotelListPageDto   {
  
  private Integer totalPages = null;
  private Long totalElements = null;
  private List<SorterDto> order = new ArrayList<SorterDto>();
  private List<FilterDto> filter = new ArrayList<FilterDto>();
  private RegionDto currentRegion = null;
  private Integer currentPage = null;
  private String currentOrderBy = null;
  private String currentFilter = null;
  private List<HotelDisplayItemUnitDto> contents = new ArrayList<HotelDisplayItemUnitDto>();

  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "총 페이지 개수")
  @org.codehaus.jackson.annotate.JsonProperty("totalPages")
  @com.fasterxml.jackson.annotation.JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }
  
  /**
   * 총 페이지 개수
   **/
  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "현재 페이지 개수")
  @org.codehaus.jackson.annotate.JsonProperty("totalElements")
  @com.fasterxml.jackson.annotation.JsonProperty("totalElements")
  public Long getTotalElements() {
    return totalElements;
  }
  
  /**
   * 현재 페이지 개수
   **/
  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "정렬 목록")
  @org.codehaus.jackson.annotate.JsonProperty("order")
  @com.fasterxml.jackson.annotation.JsonProperty("order")
  public List<SorterDto> getOrder() {
    return order;
  }
  
  /**
   * 정렬 목록
   **/
  public void setOrder(List<SorterDto> order) {
    this.order = order;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "필터 목록")
  @org.codehaus.jackson.annotate.JsonProperty("filter")
  @com.fasterxml.jackson.annotation.JsonProperty("filter")
  public List<FilterDto> getFilter() {
    return filter;
  }
  
  /**
   * 필터 목록
   **/
  public void setFilter(List<FilterDto> filter) {
    this.filter = filter;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "현재 지역")
  @org.codehaus.jackson.annotate.JsonProperty("currentRegion")
  @com.fasterxml.jackson.annotation.JsonProperty("currentRegion")
  public RegionDto getCurrentRegion() {
    return currentRegion;
  }
  
  /**
   * 현재 지역
   **/
  public void setCurrentRegion(RegionDto currentRegion) {
    this.currentRegion = currentRegion;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "현재 페이지")
  @org.codehaus.jackson.annotate.JsonProperty("currentPage")
  @com.fasterxml.jackson.annotation.JsonProperty("currentPage")
  public Integer getCurrentPage() {
    return currentPage;
  }
  
  /**
   * 현재 페이지
   **/
  public void setCurrentPage(Integer currentPage) {
    this.currentPage = currentPage;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "현재 정렬")
  @org.codehaus.jackson.annotate.JsonProperty("currentOrderBy")
  @com.fasterxml.jackson.annotation.JsonProperty("currentOrderBy")
  public String getCurrentOrderBy() {
    return currentOrderBy;
  }
  
  /**
   * 현재 정렬
   **/
  public void setCurrentOrderBy(String currentOrderBy) {
    this.currentOrderBy = currentOrderBy;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "현재 필터")
  @org.codehaus.jackson.annotate.JsonProperty("currentFilter")
  @com.fasterxml.jackson.annotation.JsonProperty("currentFilter")
  public String getCurrentFilter() {
    return currentFilter;
  }
  
  /**
   * 현재 필터
   **/
  public void setCurrentFilter(String currentFilter) {
    this.currentFilter = currentFilter;
  }
  
  @io.swagger.annotations.ApiModelProperty(required = true, value = "호탤 정보")
  @org.codehaus.jackson.annotate.JsonProperty("contents")
  @com.fasterxml.jackson.annotation.JsonProperty("contents")
  public List<HotelDisplayItemUnitDto> getContents() {
    return contents;
  }
  
  /**
   * 호탤 정보
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
    HotelListPageDto hotelListPageDto = (HotelListPageDto) o;
    return Objects.equals(this.totalPages, hotelListPageDto.totalPages) &&
        Objects.equals(this.totalElements, hotelListPageDto.totalElements) &&
        Objects.equals(this.order, hotelListPageDto.order) &&
        Objects.equals(this.filter, hotelListPageDto.filter) &&
        Objects.equals(this.currentRegion, hotelListPageDto.currentRegion) &&
        Objects.equals(this.currentPage, hotelListPageDto.currentPage) &&
        Objects.equals(this.currentOrderBy, hotelListPageDto.currentOrderBy) &&
        Objects.equals(this.currentFilter, hotelListPageDto.currentFilter) &&
        Objects.equals(this.contents, hotelListPageDto.contents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPages, totalElements, order, filter, currentRegion, currentPage, currentOrderBy, currentFilter, contents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotelListPageDto {\n");
    
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

  public static HotelListPageDtoBuilder builder() {
    return new HotelListPageDtoBuilder();
  }

  public static class HotelListPageDtoBuilder {

    private Integer totalPages = null;
    private Long totalElements = null;
    private List<SorterDto> order = new ArrayList<SorterDto>();
    private List<FilterDto> filter = new ArrayList<FilterDto>();
    private RegionDto currentRegion = null;
    private Integer currentPage = null;
    private String currentOrderBy = null;
    private String currentFilter = null;
    private List<HotelDisplayItemUnitDto> contents = new ArrayList<HotelDisplayItemUnitDto>();
    

    HotelListPageDtoBuilder() {
    }

    /**
     * 총 페이지 개수
     **/
    public HotelListPageDtoBuilder totalPages(Integer totalPages) {
      this.totalPages = totalPages;
      return this;
    }

    /**
     * 현재 페이지 개수
     **/
    public HotelListPageDtoBuilder totalElements(Long totalElements) {
      this.totalElements = totalElements;
      return this;
    }

    /**
     * 정렬 목록
     **/
    public HotelListPageDtoBuilder order(List<SorterDto> order) {
      this.order = order;
      return this;
    }

    /**
     * 필터 목록
     **/
    public HotelListPageDtoBuilder filter(List<FilterDto> filter) {
      this.filter = filter;
      return this;
    }

    /**
     * 현재 지역
     **/
    public HotelListPageDtoBuilder currentRegion(RegionDto currentRegion) {
      this.currentRegion = currentRegion;
      return this;
    }

    /**
     * 현재 페이지
     **/
    public HotelListPageDtoBuilder currentPage(Integer currentPage) {
      this.currentPage = currentPage;
      return this;
    }

    /**
     * 현재 정렬
     **/
    public HotelListPageDtoBuilder currentOrderBy(String currentOrderBy) {
      this.currentOrderBy = currentOrderBy;
      return this;
    }

    /**
     * 현재 필터
     **/
    public HotelListPageDtoBuilder currentFilter(String currentFilter) {
      this.currentFilter = currentFilter;
      return this;
    }

    /**
     * 호탤 정보
     **/
    public HotelListPageDtoBuilder contents(List<HotelDisplayItemUnitDto> contents) {
      this.contents = contents;
      return this;
    }


    public HotelListPageDto build() {
      HotelListPageDto hotelListPageDto = new HotelListPageDto();
      hotelListPageDto.setTotalPages(this.totalPages);
      hotelListPageDto.setTotalElements(this.totalElements);
      hotelListPageDto.setOrder(this.order);
      hotelListPageDto.setFilter(this.filter);
      hotelListPageDto.setCurrentRegion(this.currentRegion);
      hotelListPageDto.setCurrentPage(this.currentPage);
      hotelListPageDto.setCurrentOrderBy(this.currentOrderBy);
      hotelListPageDto.setCurrentFilter(this.currentFilter);
      hotelListPageDto.setContents(this.contents);
      return hotelListPageDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HotelListPageDtoBuilder {\n");
      
      sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
      sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
      sb.append("    order: ").append(toIndentedString(order)).append("\n");
      sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

