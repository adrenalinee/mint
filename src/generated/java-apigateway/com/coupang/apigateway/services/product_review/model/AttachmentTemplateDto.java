package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class AttachmentTemplateDto   {
  
  private String attachmentTemplateText = null;
  private Long attachmentTemplateId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attachmentTemplateText")
  @com.fasterxml.jackson.annotation.JsonProperty("attachmentTemplateText")
  public String getAttachmentTemplateText() {
    return attachmentTemplateText;
  }
  
  /**
   **/
  public void setAttachmentTemplateText(String attachmentTemplateText) {
    this.attachmentTemplateText = attachmentTemplateText;
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
    AttachmentTemplateDto attachmentTemplateDto = (AttachmentTemplateDto) o;
    return Objects.equals(this.attachmentTemplateText, attachmentTemplateDto.attachmentTemplateText) &&
        Objects.equals(this.attachmentTemplateId, attachmentTemplateDto.attachmentTemplateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentTemplateText, attachmentTemplateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentTemplateDto {\n");
    
    sb.append("    attachmentTemplateText: ").append(toIndentedString(attachmentTemplateText)).append("\n");
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

  public static AttachmentTemplateDtoBuilder builder() {
    return new AttachmentTemplateDtoBuilder();
  }

  public static class AttachmentTemplateDtoBuilder {

    private String attachmentTemplateText = null;
    private Long attachmentTemplateId = null;
    

    AttachmentTemplateDtoBuilder() {
    }

    /**
     **/
    public AttachmentTemplateDtoBuilder attachmentTemplateText(String attachmentTemplateText) {
      this.attachmentTemplateText = attachmentTemplateText;
      return this;
    }

    /**
     **/
    public AttachmentTemplateDtoBuilder attachmentTemplateId(Long attachmentTemplateId) {
      this.attachmentTemplateId = attachmentTemplateId;
      return this;
    }


    public AttachmentTemplateDto build() {
      AttachmentTemplateDto attachmentTemplateDto = new AttachmentTemplateDto();
      attachmentTemplateDto.setAttachmentTemplateText(this.attachmentTemplateText);
      attachmentTemplateDto.setAttachmentTemplateId(this.attachmentTemplateId);
      return attachmentTemplateDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AttachmentTemplateDtoBuilder {\n");
      
      sb.append("    attachmentTemplateText: ").append(toIndentedString(attachmentTemplateText)).append("\n");
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

