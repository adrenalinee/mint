package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.InteractionHistoryDto;
import com.coupang.apigateway.services.product_review.model.PageMetadata;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class PagedResourcesOfInteractionHistoryDto   {
  
  private PageMetadata metadata = null;
  private List<InteractionHistoryDto> content = new ArrayList<InteractionHistoryDto>();

  
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
  public List<InteractionHistoryDto> getContent() {
    return content;
  }
  
  /**
   **/
  public void setContent(List<InteractionHistoryDto> content) {
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
    PagedResourcesOfInteractionHistoryDto pagedResourcesOfInteractionHistoryDto = (PagedResourcesOfInteractionHistoryDto) o;
    return Objects.equals(this.metadata, pagedResourcesOfInteractionHistoryDto.metadata) &&
        Objects.equals(this.content, pagedResourcesOfInteractionHistoryDto.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedResourcesOfInteractionHistoryDto {\n");
    
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

  public static PagedResourcesOfInteractionHistoryDtoBuilder builder() {
    return new PagedResourcesOfInteractionHistoryDtoBuilder();
  }

  public static class PagedResourcesOfInteractionHistoryDtoBuilder {

    private PageMetadata metadata = null;
    private List<InteractionHistoryDto> content = new ArrayList<InteractionHistoryDto>();
    

    PagedResourcesOfInteractionHistoryDtoBuilder() {
    }

    /**
     **/
    public PagedResourcesOfInteractionHistoryDtoBuilder metadata(PageMetadata metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     **/
    public PagedResourcesOfInteractionHistoryDtoBuilder content(List<InteractionHistoryDto> content) {
      this.content = content;
      return this;
    }


    public PagedResourcesOfInteractionHistoryDto build() {
      PagedResourcesOfInteractionHistoryDto pagedResourcesOfInteractionHistoryDto = new PagedResourcesOfInteractionHistoryDto();
      pagedResourcesOfInteractionHistoryDto.setMetadata(this.metadata);
      pagedResourcesOfInteractionHistoryDto.setContent(this.content);
      return pagedResourcesOfInteractionHistoryDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PagedResourcesOfInteractionHistoryDtoBuilder {\n");
      
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

