package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.PageMetadata;
import com.coupang.apigateway.services.product_review.model.ProductReviewContentsDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class PagedResourcesOfProductReviewContentsDto   {
  
  private PageMetadata metadata = null;
  private List<ProductReviewContentsDto> content = new ArrayList<ProductReviewContentsDto>();

  
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
  public List<ProductReviewContentsDto> getContent() {
    return content;
  }
  
  /**
   **/
  public void setContent(List<ProductReviewContentsDto> content) {
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
    PagedResourcesOfProductReviewContentsDto pagedResourcesOfProductReviewContentsDto = (PagedResourcesOfProductReviewContentsDto) o;
    return Objects.equals(this.metadata, pagedResourcesOfProductReviewContentsDto.metadata) &&
        Objects.equals(this.content, pagedResourcesOfProductReviewContentsDto.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedResourcesOfProductReviewContentsDto {\n");
    
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

  public static PagedResourcesOfProductReviewContentsDtoBuilder builder() {
    return new PagedResourcesOfProductReviewContentsDtoBuilder();
  }

  public static class PagedResourcesOfProductReviewContentsDtoBuilder {

    private PageMetadata metadata = null;
    private List<ProductReviewContentsDto> content = new ArrayList<ProductReviewContentsDto>();
    

    PagedResourcesOfProductReviewContentsDtoBuilder() {
    }

    /**
     **/
    public PagedResourcesOfProductReviewContentsDtoBuilder metadata(PageMetadata metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     **/
    public PagedResourcesOfProductReviewContentsDtoBuilder content(List<ProductReviewContentsDto> content) {
      this.content = content;
      return this;
    }


    public PagedResourcesOfProductReviewContentsDto build() {
      PagedResourcesOfProductReviewContentsDto pagedResourcesOfProductReviewContentsDto = new PagedResourcesOfProductReviewContentsDto();
      pagedResourcesOfProductReviewContentsDto.setMetadata(this.metadata);
      pagedResourcesOfProductReviewContentsDto.setContent(this.content);
      return pagedResourcesOfProductReviewContentsDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PagedResourcesOfProductReviewContentsDtoBuilder {\n");
      
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

