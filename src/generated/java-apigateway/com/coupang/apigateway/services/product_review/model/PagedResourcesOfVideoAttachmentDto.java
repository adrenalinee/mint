package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.PageMetadata;
import com.coupang.apigateway.services.product_review.model.VideoAttachmentDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class PagedResourcesOfVideoAttachmentDto   {
  
  private PageMetadata metadata = null;
  private List<VideoAttachmentDto> content = new ArrayList<VideoAttachmentDto>();

  
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
  public List<VideoAttachmentDto> getContent() {
    return content;
  }
  
  /**
   **/
  public void setContent(List<VideoAttachmentDto> content) {
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
    PagedResourcesOfVideoAttachmentDto pagedResourcesOfVideoAttachmentDto = (PagedResourcesOfVideoAttachmentDto) o;
    return Objects.equals(this.metadata, pagedResourcesOfVideoAttachmentDto.metadata) &&
        Objects.equals(this.content, pagedResourcesOfVideoAttachmentDto.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedResourcesOfVideoAttachmentDto {\n");
    
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

  public static PagedResourcesOfVideoAttachmentDtoBuilder builder() {
    return new PagedResourcesOfVideoAttachmentDtoBuilder();
  }

  public static class PagedResourcesOfVideoAttachmentDtoBuilder {

    private PageMetadata metadata = null;
    private List<VideoAttachmentDto> content = new ArrayList<VideoAttachmentDto>();
    

    PagedResourcesOfVideoAttachmentDtoBuilder() {
    }

    /**
     **/
    public PagedResourcesOfVideoAttachmentDtoBuilder metadata(PageMetadata metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     **/
    public PagedResourcesOfVideoAttachmentDtoBuilder content(List<VideoAttachmentDto> content) {
      this.content = content;
      return this;
    }


    public PagedResourcesOfVideoAttachmentDto build() {
      PagedResourcesOfVideoAttachmentDto pagedResourcesOfVideoAttachmentDto = new PagedResourcesOfVideoAttachmentDto();
      pagedResourcesOfVideoAttachmentDto.setMetadata(this.metadata);
      pagedResourcesOfVideoAttachmentDto.setContent(this.content);
      return pagedResourcesOfVideoAttachmentDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PagedResourcesOfVideoAttachmentDtoBuilder {\n");
      
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

