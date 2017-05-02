package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import com.coupang.apigateway.services.display.model.DisplayBrandDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class PageContainerOfDisplayBrandDto   {
  
  private Long total = null;
  private Long pageSize = null;
  private List<DisplayBrandDto> content = new ArrayList<DisplayBrandDto>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("total")
  @com.fasterxml.jackson.annotation.JsonProperty("total")
  public Long getTotal() {
    return total;
  }
  
  /**
   **/
  public void setTotal(Long total) {
    this.total = total;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("pageSize")
  @com.fasterxml.jackson.annotation.JsonProperty("pageSize")
  public Long getPageSize() {
    return pageSize;
  }
  
  /**
   **/
  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("content")
  @com.fasterxml.jackson.annotation.JsonProperty("content")
  public List<DisplayBrandDto> getContent() {
    return content;
  }
  
  /**
   **/
  public void setContent(List<DisplayBrandDto> content) {
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
    PageContainerOfDisplayBrandDto pageContainerOfDisplayBrandDto = (PageContainerOfDisplayBrandDto) o;
    return Objects.equals(this.total, pageContainerOfDisplayBrandDto.total) &&
        Objects.equals(this.pageSize, pageContainerOfDisplayBrandDto.pageSize) &&
        Objects.equals(this.content, pageContainerOfDisplayBrandDto.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, pageSize, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageContainerOfDisplayBrandDto {\n");
    
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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

  public static PageContainerOfDisplayBrandDtoBuilder builder() {
    return new PageContainerOfDisplayBrandDtoBuilder();
  }

  public static class PageContainerOfDisplayBrandDtoBuilder {

    private Long total = null;
    private Long pageSize = null;
    private List<DisplayBrandDto> content = new ArrayList<DisplayBrandDto>();
    

    PageContainerOfDisplayBrandDtoBuilder() {
    }

    /**
     **/
    public PageContainerOfDisplayBrandDtoBuilder total(Long total) {
      this.total = total;
      return this;
    }

    /**
     **/
    public PageContainerOfDisplayBrandDtoBuilder pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     **/
    public PageContainerOfDisplayBrandDtoBuilder content(List<DisplayBrandDto> content) {
      this.content = content;
      return this;
    }


    public PageContainerOfDisplayBrandDto build() {
      PageContainerOfDisplayBrandDto pageContainerOfDisplayBrandDto = new PageContainerOfDisplayBrandDto();
      pageContainerOfDisplayBrandDto.setTotal(this.total);
      pageContainerOfDisplayBrandDto.setPageSize(this.pageSize);
      pageContainerOfDisplayBrandDto.setContent(this.content);
      return pageContainerOfDisplayBrandDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PageContainerOfDisplayBrandDtoBuilder {\n");
      
      sb.append("    total: ").append(toIndentedString(total)).append("\n");
      sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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

