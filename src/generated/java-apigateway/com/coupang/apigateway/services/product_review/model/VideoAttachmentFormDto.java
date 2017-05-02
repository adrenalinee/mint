package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class VideoAttachmentFormDto   {
  
  private Long id = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("id")
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  public Long getId() {
    return id;
  }
  
  /**
   **/
  public void setId(Long id) {
    this.id = id;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoAttachmentFormDto videoAttachmentFormDto = (VideoAttachmentFormDto) o;
    return Objects.equals(this.id, videoAttachmentFormDto.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoAttachmentFormDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

  public static VideoAttachmentFormDtoBuilder builder() {
    return new VideoAttachmentFormDtoBuilder();
  }

  public static class VideoAttachmentFormDtoBuilder {

    private Long id = null;
    

    VideoAttachmentFormDtoBuilder() {
    }

    /**
     **/
    public VideoAttachmentFormDtoBuilder id(Long id) {
      this.id = id;
      return this;
    }


    public VideoAttachmentFormDto build() {
      VideoAttachmentFormDto videoAttachmentFormDto = new VideoAttachmentFormDto();
      videoAttachmentFormDto.setId(this.id);
      return videoAttachmentFormDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VideoAttachmentFormDtoBuilder {\n");
      
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

