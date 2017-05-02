package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.PageMetadata;
import com.coupang.apigateway.services.product_review.model.TopReviewerDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class PagedResourcesOfTopReviewerDto   {
  
  private PageMetadata metadata = null;
  private List<TopReviewerDto> content = new ArrayList<TopReviewerDto>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("metadata")
  @com.fasterxml.jackson.annotation.JsonProperty("metadata")
  public PageMetadata getMetadata() {
    return metadata;
  }
  
  /**
   **/
  public void setMetadata(PageMetadata metadata) {
    this.metadata = metadata;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("content")
  @com.fasterxml.jackson.annotation.JsonProperty("content")
  public List<TopReviewerDto> getContent() {
    return content;
  }
  
  /**
   **/
  public void setContent(List<TopReviewerDto> content) {
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
    PagedResourcesOfTopReviewerDto pagedResourcesOfTopReviewerDto = (PagedResourcesOfTopReviewerDto) o;
    return Objects.equals(this.metadata, pagedResourcesOfTopReviewerDto.metadata) &&
        Objects.equals(this.content, pagedResourcesOfTopReviewerDto.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedResourcesOfTopReviewerDto {\n");
    
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

  public static PagedResourcesOfTopReviewerDtoBuilder builder() {
    return new PagedResourcesOfTopReviewerDtoBuilder();
  }

  public static class PagedResourcesOfTopReviewerDtoBuilder {

    private PageMetadata metadata = null;
    private List<TopReviewerDto> content = new ArrayList<TopReviewerDto>();
    

    PagedResourcesOfTopReviewerDtoBuilder() {
    }

    /**
     **/
    public PagedResourcesOfTopReviewerDtoBuilder metadata(PageMetadata metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     **/
    public PagedResourcesOfTopReviewerDtoBuilder content(List<TopReviewerDto> content) {
      this.content = content;
      return this;
    }


    public PagedResourcesOfTopReviewerDto build() {
      PagedResourcesOfTopReviewerDto pagedResourcesOfTopReviewerDto = new PagedResourcesOfTopReviewerDto();
      pagedResourcesOfTopReviewerDto.setMetadata(this.metadata);
      pagedResourcesOfTopReviewerDto.setContent(this.content);
      return pagedResourcesOfTopReviewerDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PagedResourcesOfTopReviewerDtoBuilder {\n");
      
      sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

