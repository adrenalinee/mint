package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.AdventurerProductDto;
import com.coupang.apigateway.services.product_review.model.PageMetadata;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class PagedResourcesOfAdventurerProductDto   {
  
  private PageMetadata metadata = null;
  private List<AdventurerProductDto> content = new ArrayList<AdventurerProductDto>();

  
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
  public List<AdventurerProductDto> getContent() {
    return content;
  }
  
  /**
   **/
  public void setContent(List<AdventurerProductDto> content) {
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
    PagedResourcesOfAdventurerProductDto pagedResourcesOfAdventurerProductDto = (PagedResourcesOfAdventurerProductDto) o;
    return Objects.equals(this.metadata, pagedResourcesOfAdventurerProductDto.metadata) &&
        Objects.equals(this.content, pagedResourcesOfAdventurerProductDto.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedResourcesOfAdventurerProductDto {\n");
    
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

  public static PagedResourcesOfAdventurerProductDtoBuilder builder() {
    return new PagedResourcesOfAdventurerProductDtoBuilder();
  }

  public static class PagedResourcesOfAdventurerProductDtoBuilder {

    private PageMetadata metadata = null;
    private List<AdventurerProductDto> content = new ArrayList<AdventurerProductDto>();
    

    PagedResourcesOfAdventurerProductDtoBuilder() {
    }

    /**
     **/
    public PagedResourcesOfAdventurerProductDtoBuilder metadata(PageMetadata metadata) {
      this.metadata = metadata;
      return this;
    }

    /**
     **/
    public PagedResourcesOfAdventurerProductDtoBuilder content(List<AdventurerProductDto> content) {
      this.content = content;
      return this;
    }


    public PagedResourcesOfAdventurerProductDto build() {
      PagedResourcesOfAdventurerProductDto pagedResourcesOfAdventurerProductDto = new PagedResourcesOfAdventurerProductDto();
      pagedResourcesOfAdventurerProductDto.setMetadata(this.metadata);
      pagedResourcesOfAdventurerProductDto.setContent(this.content);
      return pagedResourcesOfAdventurerProductDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PagedResourcesOfAdventurerProductDtoBuilder {\n");
      
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

