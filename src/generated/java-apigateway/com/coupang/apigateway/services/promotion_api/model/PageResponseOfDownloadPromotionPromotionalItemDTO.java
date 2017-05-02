package com.coupang.apigateway.services.promotion_api.model;

import java.util.Objects;
import com.coupang.apigateway.services.promotion_api.model.DownloadPromotionPromotionalItemDTO;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.975+09:00")
public class PageResponseOfDownloadPromotionPromotionalItemDTO   {
  
  private Integer totalPages = null;
  private Long total = null;
  private Long size = null;
  private Long page = null;
  private Boolean lastPage = null;
  private Boolean hasPrevious = null;
  private Boolean hasNext = null;
  private Boolean firstPage = null;
  private List<DownloadPromotionPromotionalItemDTO> content = new ArrayList<DownloadPromotionPromotionalItemDTO>();

  
  @io.swagger.annotations.ApiModelProperty(value = "The number of total pages.")
  @org.codehaus.jackson.annotate.JsonProperty("totalPages")
  @com.fasterxml.jackson.annotation.JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }
  
  /**
   * The number of total pages.
   **/
  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "The total amount of elements.")
  @org.codehaus.jackson.annotate.JsonProperty("total")
  @com.fasterxml.jackson.annotation.JsonProperty("total")
  public Long getTotal() {
    return total;
  }
  
  /**
   * The total amount of elements.
   **/
  public void setTotal(Long total) {
    this.total = total;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "The size of the page. (maximum number of elements in a page)")
  @org.codehaus.jackson.annotate.JsonProperty("size")
  @com.fasterxml.jackson.annotation.JsonProperty("size")
  public Long getSize() {
    return size;
  }
  
  /**
   * The size of the page. (maximum number of elements in a page)
   **/
  public void setSize(Long size) {
    this.size = size;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "The number of the current page index. It starts at ZERO.")
  @org.codehaus.jackson.annotate.JsonProperty("page")
  @com.fasterxml.jackson.annotation.JsonProperty("page")
  public Long getPage() {
    return page;
  }
  
  /**
   * The number of the current page index. It starts at ZERO.
   **/
  public void setPage(Long page) {
    this.page = page;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("lastPage")
  @com.fasterxml.jackson.annotation.JsonProperty("lastPage")
  public Boolean getLastPage() {
    return lastPage;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isLastPage() {
    return lastPage == null ? false : lastPage;
  }
  
  /**
   **/
  public void setLastPage(Boolean lastPage) {
    this.lastPage = lastPage;
  }
  
  @io.swagger.annotations.ApiModelProperty(example = "false", value = "If there is a previous page.")
  @org.codehaus.jackson.annotate.JsonProperty("hasPrevious")
  @com.fasterxml.jackson.annotation.JsonProperty("hasPrevious")
  public Boolean getHasPrevious() {
    return hasPrevious;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isHasPrevious() {
    return hasPrevious == null ? false : hasPrevious;
  }
  
  /**
   * If there is a previous page.
   **/
  public void setHasPrevious(Boolean hasPrevious) {
    this.hasPrevious = hasPrevious;
  }
  
  @io.swagger.annotations.ApiModelProperty(example = "false", value = "If there is a next page.")
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
   * If there is a next page.
   **/
  public void setHasNext(Boolean hasNext) {
    this.hasNext = hasNext;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("firstPage")
  @com.fasterxml.jackson.annotation.JsonProperty("firstPage")
  public Boolean getFirstPage() {
    return firstPage;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isFirstPage() {
    return firstPage == null ? false : firstPage;
  }
  
  /**
   **/
  public void setFirstPage(Boolean firstPage) {
    this.firstPage = firstPage;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "The page content.")
  @org.codehaus.jackson.annotate.JsonProperty("content")
  @com.fasterxml.jackson.annotation.JsonProperty("content")
  public List<DownloadPromotionPromotionalItemDTO> getContent() {
    return content;
  }
  
  /**
   * The page content.
   **/
  public void setContent(List<DownloadPromotionPromotionalItemDTO> content) {
    this.content = content;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageResponseOfDownloadPromotionPromotionalItemDTO pageResponseOfDownloadPromotionPromotionalItemDTO = (PageResponseOfDownloadPromotionPromotionalItemDTO) o;
    return Objects.equals(this.totalPages, pageResponseOfDownloadPromotionPromotionalItemDTO.totalPages) &&
        Objects.equals(this.total, pageResponseOfDownloadPromotionPromotionalItemDTO.total) &&
        Objects.equals(this.size, pageResponseOfDownloadPromotionPromotionalItemDTO.size) &&
        Objects.equals(this.page, pageResponseOfDownloadPromotionPromotionalItemDTO.page) &&
        Objects.equals(this.lastPage, pageResponseOfDownloadPromotionPromotionalItemDTO.lastPage) &&
        Objects.equals(this.hasPrevious, pageResponseOfDownloadPromotionPromotionalItemDTO.hasPrevious) &&
        Objects.equals(this.hasNext, pageResponseOfDownloadPromotionPromotionalItemDTO.hasNext) &&
        Objects.equals(this.firstPage, pageResponseOfDownloadPromotionPromotionalItemDTO.firstPage) &&
        Objects.equals(this.content, pageResponseOfDownloadPromotionPromotionalItemDTO.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalPages, total, size, page, lastPage, hasPrevious, hasNext, firstPage, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageResponseOfDownloadPromotionPromotionalItemDTO {\n");
    
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    lastPage: ").append(toIndentedString(lastPage)).append("\n");
    sb.append("    hasPrevious: ").append(toIndentedString(hasPrevious)).append("\n");
    sb.append("    hasNext: ").append(toIndentedString(hasNext)).append("\n");
    sb.append("    firstPage: ").append(toIndentedString(firstPage)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

  public static PageResponseOfDownloadPromotionPromotionalItemDTOBuilder builder() {
    return new PageResponseOfDownloadPromotionPromotionalItemDTOBuilder();
  }

  public static class PageResponseOfDownloadPromotionPromotionalItemDTOBuilder {

    private Integer totalPages = null;
    private Long total = null;
    private Long size = null;
    private Long page = null;
    private Boolean lastPage = null;
    private Boolean hasPrevious = null;
    private Boolean hasNext = null;
    private Boolean firstPage = null;
    private List<DownloadPromotionPromotionalItemDTO> content = new ArrayList<DownloadPromotionPromotionalItemDTO>();
    

    PageResponseOfDownloadPromotionPromotionalItemDTOBuilder() {
    }

    /**
     * The number of total pages.
     **/
    public PageResponseOfDownloadPromotionPromotionalItemDTOBuilder totalPages(Integer totalPages) {
      this.totalPages = totalPages;
      return this;
    }

    /**
     * The total amount of elements.
     **/
    public PageResponseOfDownloadPromotionPromotionalItemDTOBuilder total(Long total) {
      this.total = total;
      return this;
    }

    /**
     * The size of the page. (maximum number of elements in a page)
     **/
    public PageResponseOfDownloadPromotionPromotionalItemDTOBuilder size(Long size) {
      this.size = size;
      return this;
    }

    /**
     * The number of the current page index. It starts at ZERO.
     **/
    public PageResponseOfDownloadPromotionPromotionalItemDTOBuilder page(Long page) {
      this.page = page;
      return this;
    }

    /**
     **/
    public PageResponseOfDownloadPromotionPromotionalItemDTOBuilder lastPage(Boolean lastPage) {
      this.lastPage = lastPage;
      return this;
    }

    /**
     * If there is a previous page.
     **/
    public PageResponseOfDownloadPromotionPromotionalItemDTOBuilder hasPrevious(Boolean hasPrevious) {
      this.hasPrevious = hasPrevious;
      return this;
    }

    /**
     * If there is a next page.
     **/
    public PageResponseOfDownloadPromotionPromotionalItemDTOBuilder hasNext(Boolean hasNext) {
      this.hasNext = hasNext;
      return this;
    }

    /**
     **/
    public PageResponseOfDownloadPromotionPromotionalItemDTOBuilder firstPage(Boolean firstPage) {
      this.firstPage = firstPage;
      return this;
    }

    /**
     * The page content.
     **/
    public PageResponseOfDownloadPromotionPromotionalItemDTOBuilder content(List<DownloadPromotionPromotionalItemDTO> content) {
      this.content = content;
      return this;
    }


    public PageResponseOfDownloadPromotionPromotionalItemDTO build() {
      PageResponseOfDownloadPromotionPromotionalItemDTO pageResponseOfDownloadPromotionPromotionalItemDTO = new PageResponseOfDownloadPromotionPromotionalItemDTO();
      pageResponseOfDownloadPromotionPromotionalItemDTO.setTotalPages(this.totalPages);
      pageResponseOfDownloadPromotionPromotionalItemDTO.setTotal(this.total);
      pageResponseOfDownloadPromotionPromotionalItemDTO.setSize(this.size);
      pageResponseOfDownloadPromotionPromotionalItemDTO.setPage(this.page);
      pageResponseOfDownloadPromotionPromotionalItemDTO.setLastPage(this.lastPage);
      pageResponseOfDownloadPromotionPromotionalItemDTO.setHasPrevious(this.hasPrevious);
      pageResponseOfDownloadPromotionPromotionalItemDTO.setHasNext(this.hasNext);
      pageResponseOfDownloadPromotionPromotionalItemDTO.setFirstPage(this.firstPage);
      pageResponseOfDownloadPromotionPromotionalItemDTO.setContent(this.content);
      return pageResponseOfDownloadPromotionPromotionalItemDTO;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PageResponseOfDownloadPromotionPromotionalItemDTOBuilder {\n");
      
      sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
      sb.append("    total: ").append(toIndentedString(total)).append("\n");
      sb.append("    size: ").append(toIndentedString(size)).append("\n");
      sb.append("    page: ").append(toIndentedString(page)).append("\n");
      sb.append("    lastPage: ").append(toIndentedString(lastPage)).append("\n");
      sb.append("    hasPrevious: ").append(toIndentedString(hasPrevious)).append("\n");
      sb.append("    hasNext: ").append(toIndentedString(hasNext)).append("\n");
      sb.append("    firstPage: ").append(toIndentedString(firstPage)).append("\n");
      sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

