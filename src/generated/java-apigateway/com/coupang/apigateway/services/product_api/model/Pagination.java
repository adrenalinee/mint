package com.coupang.apigateway.services.product_api.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.274+09:00")
public class Pagination   {
  
  private Integer totalPages = null;
  private Long totalCount = null;
  private Integer page = null;
  private Boolean hasNext = null;
  private Integer countPerPage = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("totalCount")
  @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
  public Long getTotalCount() {
    return totalCount;
  }
  
  /**
   **/
  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("page")
  @com.fasterxml.jackson.annotation.JsonProperty("page")
  public Integer getPage() {
    return page;
  }
  
  /**
   **/
  public void setPage(Integer page) {
    this.page = page;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("hasNext")
  @com.fasterxml.jackson.annotation.JsonProperty("hasNext")
  public Boolean getHasNext() {
    return hasNext;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isHasNext() {
    return hasNext == null ? false : hasNext;
  }
  
  /**
   **/
  public void setHasNext(Boolean hasNext) {
    this.hasNext = hasNext;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("countPerPage")
  @com.fasterxml.jackson.annotation.JsonProperty("countPerPage")
  public Integer getCountPerPage() {
    return countPerPage;
  }
  
  /**
   **/
  public void setCountPerPage(Integer countPerPage) {
    this.countPerPage = countPerPage;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(this.totalPages, pagination.totalPages) &&
        Objects.equals(this.totalCount, pagination.totalCount) &&
        Objects.equals(this.page, pagination.page) &&
        Objects.equals(this.hasNext, pagination.hasNext) &&
        Objects.equals(this.countPerPage, pagination.countPerPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPages, totalCount, page, hasNext, countPerPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    hasNext: ").append(toIndentedString(hasNext)).append("\n");
    sb.append("    countPerPage: ").append(toIndentedString(countPerPage)).append("\n");
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

  public static PaginationBuilder builder() {
    return new PaginationBuilder();
  }

  public static class PaginationBuilder {

    private Integer totalPages = null;
    private Long totalCount = null;
    private Integer page = null;
    private Boolean hasNext = null;
    private Integer countPerPage = null;
    

    PaginationBuilder() {
    }

    /**
     **/
    public PaginationBuilder totalPages(Integer totalPages) {
      this.totalPages = totalPages;
      return this;
    }

    /**
     **/
    public PaginationBuilder totalCount(Long totalCount) {
      this.totalCount = totalCount;
      return this;
    }

    /**
     **/
    public PaginationBuilder page(Integer page) {
      this.page = page;
      return this;
    }

    /**
     **/
    public PaginationBuilder hasNext(Boolean hasNext) {
      this.hasNext = hasNext;
      return this;
    }

    /**
     **/
    public PaginationBuilder countPerPage(Integer countPerPage) {
      this.countPerPage = countPerPage;
      return this;
    }


    public Pagination build() {
      Pagination pagination = new Pagination();
      pagination.setTotalPages(this.totalPages);
      pagination.setTotalCount(this.totalCount);
      pagination.setPage(this.page);
      pagination.setHasNext(this.hasNext);
      pagination.setCountPerPage(this.countPerPage);
      return pagination;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PaginationBuilder {\n");
      
      sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
      sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
      sb.append("    page: ").append(toIndentedString(page)).append("\n");
      sb.append("    hasNext: ").append(toIndentedString(hasNext)).append("\n");
      sb.append("    countPerPage: ").append(toIndentedString(countPerPage)).append("\n");
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

