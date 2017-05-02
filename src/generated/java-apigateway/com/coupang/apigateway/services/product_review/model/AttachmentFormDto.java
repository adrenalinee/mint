package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class AttachmentFormDto   {
  
  private String uploadedFilePath = null;
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
    AttachmentFormDto attachmentFormDto = (AttachmentFormDto) o;
    return Objects.equals(this.uploadedFilePath, attachmentFormDto.uploadedFilePath) &&
        Objects.equals(this.caption, attachmentFormDto.caption) &&
        Objects.equals(this.attachmentTemplateId, attachmentFormDto.attachmentTemplateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadedFilePath, caption, attachmentTemplateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentFormDto {\n");
    
    sb.append("    uploadedFilePath: ").append(toIndentedString(uploadedFilePath)).append("\n");
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

  public static AttachmentFormDtoBuilder builder() {
    return new AttachmentFormDtoBuilder();
  }

  public static class AttachmentFormDtoBuilder {

    private String uploadedFilePath = null;
    private String caption = null;
    private Long attachmentTemplateId = null;
    

    AttachmentFormDtoBuilder() {
    }

    /**
     **/
    public AttachmentFormDtoBuilder uploadedFilePath(String uploadedFilePath) {
      this.uploadedFilePath = uploadedFilePath;
      return this;
    }

    /**
     **/
    public AttachmentFormDtoBuilder caption(String caption) {
      this.caption = caption;
      return this;
    }

    /**
     **/
    public AttachmentFormDtoBuilder attachmentTemplateId(Long attachmentTemplateId) {
      this.attachmentTemplateId = attachmentTemplateId;
      return this;
    }


    public AttachmentFormDto build() {
      AttachmentFormDto attachmentFormDto = new AttachmentFormDto();
      attachmentFormDto.setUploadedFilePath(this.uploadedFilePath);
      attachmentFormDto.setCaption(this.caption);
      attachmentFormDto.setAttachmentTemplateId(this.attachmentTemplateId);
      return attachmentFormDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AttachmentFormDtoBuilder {\n");
      
      sb.append("    uploadedFilePath: ").append(toIndentedString(uploadedFilePath)).append("\n");
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

