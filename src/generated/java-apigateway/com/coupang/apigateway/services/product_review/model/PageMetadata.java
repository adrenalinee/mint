package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class PageMetadata   {
  
  private Integer totalPages = null;
  private Long totalElements = null;
  private Integer size = null;
  private Integer currentPage = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("size")
  @com.fasterxml.jackson.annotation.JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  
  /**
   **/
  public void setSize(Integer size) {
    this.size = size;
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageMetadata pageMetadata = (PageMetadata) o;
    return Objects.equals(this.totalPages, pageMetadata.totalPages) &&
        Objects.equals(this.totalElements, pageMetadata.totalElements) &&
        Objects.equals(this.size, pageMetadata.size) &&
        Objects.equals(this.currentPage, pageMetadata.currentPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPages, totalElements, size, currentPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageMetadata {\n");
    
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
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

  public static PageMetadataBuilder builder() {
    return new PageMetadataBuilder();
  }

  public static class PageMetadataBuilder {

    private Integer totalPages = null;
    private Long totalElements = null;
    private Integer size = null;
    private Integer currentPage = null;
    

    PageMetadataBuilder() {
    }

    /**
     **/
    public PageMetadataBuilder totalPages(Integer totalPages) {
      this.totalPages = totalPages;
      return this;
    }

    /**
     **/
    public PageMetadataBuilder totalElements(Long totalElements) {
      this.totalElements = totalElements;
      return this;
    }

    /**
     **/
    public PageMetadataBuilder size(Integer size) {
      this.size = size;
      return this;
    }

    /**
     **/
    public PageMetadataBuilder currentPage(Integer currentPage) {
      this.currentPage = currentPage;
      return this;
    }


    public PageMetadata build() {
      PageMetadata pageMetadata = new PageMetadata();
      pageMetadata.setTotalPages(this.totalPages);
      pageMetadata.setTotalElements(this.totalElements);
      pageMetadata.setSize(this.size);
      pageMetadata.setCurrentPage(this.currentPage);
      return pageMetadata;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PageMetadataBuilder {\n");
      
      sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
      sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
      sb.append("    size: ").append(toIndentedString(size)).append("\n");
      sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
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

