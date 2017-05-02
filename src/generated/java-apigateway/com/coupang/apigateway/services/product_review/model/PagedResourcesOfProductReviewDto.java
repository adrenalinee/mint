package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.PageMetadata;
import com.coupang.apigateway.services.product_review.model.ProductReviewDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class PagedResourcesOfProductReviewDto   {
  
  private PageMetadata metadata = null;
  private List<ProductReviewDto> content = new ArrayList<ProductReviewDto>();

  
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
  public List<ProductReviewDto> getContent() {
    return content;
  }
  
  /**
   **/
  public void setContent(List<ProductReviewDto> content) {
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
    PagedResourcesOfProductReviewDto pagedResourcesOfProductReviewDto = (PagedResourcesOfProductReviewDto) o;
    return Objects.equals(this.metadata, pagedResourcesOfProductReviewDto.metadata) &&
        Objects.equals(this.content, pagedResourcesOfProductReviewDto.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedResourcesOfProductReviewDto {\n");
    
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

  public static PagedResourcesOfProductReviewDtoBuilder builder() {
    return new PagedResourcesOfProductReviewDtoBuilder();
  }

  public static class PagedResourcesOfProductReviewDtoBuilder {

    private PageMetadata metadata = null;
    private List<ProductReviewDto> content = new ArrayList<ProductReviewDto>();
    

    PagedResourcesOfProductReviewDtoBuilder() {
    }

    /**
     **/
    public PagedResourcesOfProductReviewDtoBuilder metadata(PageMetadata metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     **/
    public PagedResourcesOfProductReviewDtoBuilder content(List<ProductReviewDto> content) {
      this.content = content;
      return this;
    }


    public PagedResourcesOfProductReviewDto build() {
      PagedResourcesOfProductReviewDto pagedResourcesOfProductReviewDto = new PagedResourcesOfProductReviewDto();
      pagedResourcesOfProductReviewDto.setMetadata(this.metadata);
      pagedResourcesOfProductReviewDto.setContent(this.content);
      return pagedResourcesOfProductReviewDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PagedResourcesOfProductReviewDtoBuilder {\n");
      
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

