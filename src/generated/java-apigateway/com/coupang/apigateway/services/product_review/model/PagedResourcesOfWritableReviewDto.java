package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.PageMetadata;
import com.coupang.apigateway.services.product_review.model.WritableReviewDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class PagedResourcesOfWritableReviewDto   {
  
  private PageMetadata metadata = null;
  private List<WritableReviewDto> content = new ArrayList<WritableReviewDto>();

  
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
  public List<WritableReviewDto> getContent() {
    return content;
  }
  
  /**
   **/
  public void setContent(List<WritableReviewDto> content) {
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
    PagedResourcesOfWritableReviewDto pagedResourcesOfWritableReviewDto = (PagedResourcesOfWritableReviewDto) o;
    return Objects.equals(this.metadata, pagedResourcesOfWritableReviewDto.metadata) &&
        Objects.equals(this.content, pagedResourcesOfWritableReviewDto.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedResourcesOfWritableReviewDto {\n");
    
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

  public static PagedResourcesOfWritableReviewDtoBuilder builder() {
    return new PagedResourcesOfWritableReviewDtoBuilder();
  }

  public static class PagedResourcesOfWritableReviewDtoBuilder {

    private PageMetadata metadata = null;
    private List<WritableReviewDto> content = new ArrayList<WritableReviewDto>();
    

    PagedResourcesOfWritableReviewDtoBuilder() {
    }

    /**
     **/
    public PagedResourcesOfWritableReviewDtoBuilder metadata(PageMetadata metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     **/
    public PagedResourcesOfWritableReviewDtoBuilder content(List<WritableReviewDto> content) {
      this.content = content;
      return this;
    }


    public PagedResourcesOfWritableReviewDto build() {
      PagedResourcesOfWritableReviewDto pagedResourcesOfWritableReviewDto = new PagedResourcesOfWritableReviewDto();
      pagedResourcesOfWritableReviewDto.setMetadata(this.metadata);
      pagedResourcesOfWritableReviewDto.setContent(this.content);
      return pagedResourcesOfWritableReviewDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PagedResourcesOfWritableReviewDtoBuilder {\n");
      
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

