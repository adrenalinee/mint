package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.AttachmentDto;
import com.coupang.apigateway.services.product_review.model.PageMetadata;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class PagedResourcesOfAttachmentDto   {
  
  private PageMetadata metadata = null;
  private List<AttachmentDto> content = new ArrayList<AttachmentDto>();

  
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
  public List<AttachmentDto> getContent() {
    return content;
  }
  
  /**
   **/
  public void setContent(List<AttachmentDto> content) {
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
    PagedResourcesOfAttachmentDto pagedResourcesOfAttachmentDto = (PagedResourcesOfAttachmentDto) o;
    return Objects.equals(this.metadata, pagedResourcesOfAttachmentDto.metadata) &&
        Objects.equals(this.content, pagedResourcesOfAttachmentDto.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedResourcesOfAttachmentDto {\n");
    
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

  public static PagedResourcesOfAttachmentDtoBuilder builder() {
    return new PagedResourcesOfAttachmentDtoBuilder();
  }

  public static class PagedResourcesOfAttachmentDtoBuilder {

    private PageMetadata metadata = null;
    private List<AttachmentDto> content = new ArrayList<AttachmentDto>();
    

    PagedResourcesOfAttachmentDtoBuilder() {
    }

    /**
     **/
    public PagedResourcesOfAttachmentDtoBuilder metadata(PageMetadata metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     **/
    public PagedResourcesOfAttachmentDtoBuilder content(List<AttachmentDto> content) {
      this.content = content;
      return this;
    }


    public PagedResourcesOfAttachmentDto build() {
      PagedResourcesOfAttachmentDto pagedResourcesOfAttachmentDto = new PagedResourcesOfAttachmentDto();
      pagedResourcesOfAttachmentDto.setMetadata(this.metadata);
      pagedResourcesOfAttachmentDto.setContent(this.content);
      return pagedResourcesOfAttachmentDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PagedResourcesOfAttachmentDtoBuilder {\n");
      
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

