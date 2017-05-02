package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.PagedResourcesOfAttachmentDto;
import com.coupang.apigateway.services.product_review.model.VideoAttachmentDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class AttachmentGalleryDto   {
  
  private List<VideoAttachmentDto> videoAttachments = new ArrayList<VideoAttachmentDto>();
  private PagedResourcesOfAttachmentDto imageAttachments = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("videoAttachments")
  @com.fasterxml.jackson.annotation.JsonProperty("videoAttachments")
  public List<VideoAttachmentDto> getVideoAttachments() {
    return videoAttachments;
  }
  
  /**
   **/
  public void setVideoAttachments(List<VideoAttachmentDto> videoAttachments) {
    this.videoAttachments = videoAttachments;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("imageAttachments")
  @com.fasterxml.jackson.annotation.JsonProperty("imageAttachments")
  public PagedResourcesOfAttachmentDto getImageAttachments() {
    return imageAttachments;
  }
  
  /**
   **/
  public void setImageAttachments(PagedResourcesOfAttachmentDto imageAttachments) {
    this.imageAttachments = imageAttachments;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentGalleryDto attachmentGalleryDto = (AttachmentGalleryDto) o;
    return Objects.equals(this.videoAttachments, attachmentGalleryDto.videoAttachments) &&
        Objects.equals(this.imageAttachments, attachmentGalleryDto.imageAttachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoAttachments, imageAttachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentGalleryDto {\n");
    
    sb.append("    videoAttachments: ").append(toIndentedString(videoAttachments)).append("\n");
    sb.append("    imageAttachments: ").append(toIndentedString(imageAttachments)).append("\n");
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

  public static AttachmentGalleryDtoBuilder builder() {
    return new AttachmentGalleryDtoBuilder();
  }

  public static class AttachmentGalleryDtoBuilder {

    private List<VideoAttachmentDto> videoAttachments = new ArrayList<VideoAttachmentDto>();
    private PagedResourcesOfAttachmentDto imageAttachments = null;
    

    AttachmentGalleryDtoBuilder() {
    }

    /**
     **/
    public AttachmentGalleryDtoBuilder videoAttachments(List<VideoAttachmentDto> videoAttachments) {
      this.videoAttachments = videoAttachments;
      return this;
    }

    /**
     **/
    public AttachmentGalleryDtoBuilder imageAttachments(PagedResourcesOfAttachmentDto imageAttachments) {
      this.imageAttachments = imageAttachments;
      return this;
    }


    public AttachmentGalleryDto build() {
      AttachmentGalleryDto attachmentGalleryDto = new AttachmentGalleryDto();
      attachmentGalleryDto.setVideoAttachments(this.videoAttachments);
      attachmentGalleryDto.setImageAttachments(this.imageAttachments);
      return attachmentGalleryDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AttachmentGalleryDtoBuilder {\n");
      
      sb.append("    videoAttachments: ").append(toIndentedString(videoAttachments)).append("\n");
      sb.append("    imageAttachments: ").append(toIndentedString(imageAttachments)).append("\n");
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

