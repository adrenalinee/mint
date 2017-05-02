package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class VideoAttachmentAddFormDto   {
  
  private String uploadedFilePath = null;
  private Long fileId = null;
  private String caption = null;
  private Long attachmentTemplateId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("uploadedFilePath")
  @com.fasterxml.jackson.annotation.JsonProperty("uploadedFilePath")
  public String getUploadedFilePath() {
    return uploadedFilePath;
  }
  
  /**
   **/
  public void setUploadedFilePath(String uploadedFilePath) {
    this.uploadedFilePath = uploadedFilePath;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("fileId")
  @com.fasterxml.jackson.annotation.JsonProperty("fileId")
  public Long getFileId() {
    return fileId;
  }
  
  /**
   **/
  public void setFileId(Long fileId) {
    this.fileId = fileId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("caption")
  @com.fasterxml.jackson.annotation.JsonProperty("caption")
  public String getCaption() {
    return caption;
  }
  
  /**
   **/
  public void setCaption(String caption) {
    this.caption = caption;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attachmentTemplateId")
  @com.fasterxml.jackson.annotation.JsonProperty("attachmentTemplateId")
  public Long getAttachmentTemplateId() {
    return attachmentTemplateId;
  }
  
  /**
   **/
  public void setAttachmentTemplateId(Long attachmentTemplateId) {
    this.attachmentTemplateId = attachmentTemplateId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoAttachmentAddFormDto videoAttachmentAddFormDto = (VideoAttachmentAddFormDto) o;
    return Objects.equals(this.uploadedFilePath, videoAttachmentAddFormDto.uploadedFilePath) &&
        Objects.equals(this.fileId, videoAttachmentAddFormDto.fileId) &&
        Objects.equals(this.caption, videoAttachmentAddFormDto.caption) &&
        Objects.equals(this.attachmentTemplateId, videoAttachmentAddFormDto.attachmentTemplateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadedFilePath, fileId, caption, attachmentTemplateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoAttachmentAddFormDto {\n");
    
    sb.append("    uploadedFilePath: ").append(toIndentedString(uploadedFilePath)).append("\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    attachmentTemplateId: ").append(toIndentedString(attachmentTemplateId)).append("\n");
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

  public static VideoAttachmentAddFormDtoBuilder builder() {
    return new VideoAttachmentAddFormDtoBuilder();
  }

  public static class VideoAttachmentAddFormDtoBuilder {

    private String uploadedFilePath = null;
    private Long fileId = null;
    private String caption = null;
    private Long attachmentTemplateId = null;
    

    VideoAttachmentAddFormDtoBuilder() {
    }

    /**
     **/
    public VideoAttachmentAddFormDtoBuilder uploadedFilePath(String uploadedFilePath) {
      this.uploadedFilePath = uploadedFilePath;
      return this;
    }

    /**
     **/
    public VideoAttachmentAddFormDtoBuilder fileId(Long fileId) {
      this.fileId = fileId;
      return this;
    }

    /**
     **/
    public VideoAttachmentAddFormDtoBuilder caption(String caption) {
      this.caption = caption;
      return this;
    }

    /**
     **/
    public VideoAttachmentAddFormDtoBuilder attachmentTemplateId(Long attachmentTemplateId) {
      this.attachmentTemplateId = attachmentTemplateId;
      return this;
    }


    public VideoAttachmentAddFormDto build() {
      VideoAttachmentAddFormDto videoAttachmentAddFormDto = new VideoAttachmentAddFormDto();
      videoAttachmentAddFormDto.setUploadedFilePath(this.uploadedFilePath);
      videoAttachmentAddFormDto.setFileId(this.fileId);
      videoAttachmentAddFormDto.setCaption(this.caption);
      videoAttachmentAddFormDto.setAttachmentTemplateId(this.attachmentTemplateId);
      return videoAttachmentAddFormDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VideoAttachmentAddFormDtoBuilder {\n");
      
      sb.append("    uploadedFilePath: ").append(toIndentedString(uploadedFilePath)).append("\n");
      sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
      sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
      sb.append("    attachmentTemplateId: ").append(toIndentedString(attachmentTemplateId)).append("\n");
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

