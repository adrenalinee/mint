package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ReviewGuideDto   {
  
  private String message = null;
  private String field = null;
  private Integer contentScore = null;
  private Integer attachmentScore = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("message")
  @com.fasterxml.jackson.annotation.JsonProperty("message")
  public String getMessage() {
    return message;
  }
  
  /**
   **/
  public void setMessage(String message) {
    this.message = message;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("field")
  @com.fasterxml.jackson.annotation.JsonProperty("field")
  public String getField() {
    return field;
  }
  
  /**
   **/
  public void setField(String field) {
    this.field = field;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("contentScore")
  @com.fasterxml.jackson.annotation.JsonProperty("contentScore")
  public Integer getContentScore() {
    return contentScore;
  }
  
  /**
   **/
  public void setContentScore(Integer contentScore) {
    this.contentScore = contentScore;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attachmentScore")
  @com.fasterxml.jackson.annotation.JsonProperty("attachmentScore")
  public Integer getAttachmentScore() {
    return attachmentScore;
  }
  
  /**
   **/
  public void setAttachmentScore(Integer attachmentScore) {
    this.attachmentScore = attachmentScore;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewGuideDto reviewGuideDto = (ReviewGuideDto) o;
    return Objects.equals(this.message, reviewGuideDto.message) &&
        Objects.equals(this.field, reviewGuideDto.field) &&
        Objects.equals(this.contentScore, reviewGuideDto.contentScore) &&
        Objects.equals(this.attachmentScore, reviewGuideDto.attachmentScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, field, contentScore, attachmentScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewGuideDto {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    contentScore: ").append(toIndentedString(contentScore)).append("\n");
    sb.append("    attachmentScore: ").append(toIndentedString(attachmentScore)).append("\n");
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

  public static ReviewGuideDtoBuilder builder() {
    return new ReviewGuideDtoBuilder();
  }

  public static class ReviewGuideDtoBuilder {

    private String message = null;
    private String field = null;
    private Integer contentScore = null;
    private Integer attachmentScore = null;
    

    ReviewGuideDtoBuilder() {
    }

    /**
     **/
    public ReviewGuideDtoBuilder message(String message) {
      this.message = message;
      return this;
    }

    /**
     **/
    public ReviewGuideDtoBuilder field(String field) {
      this.field = field;
      return this;
    }

    /**
     **/
    public ReviewGuideDtoBuilder contentScore(Integer contentScore) {
      this.contentScore = contentScore;
      return this;
    }

    /**
     **/
    public ReviewGuideDtoBuilder attachmentScore(Integer attachmentScore) {
      this.attachmentScore = attachmentScore;
      return this;
    }


    public ReviewGuideDto build() {
      ReviewGuideDto reviewGuideDto = new ReviewGuideDto();
      reviewGuideDto.setMessage(this.message);
      reviewGuideDto.setField(this.field);
      reviewGuideDto.setContentScore(this.contentScore);
      reviewGuideDto.setAttachmentScore(this.attachmentScore);
      return reviewGuideDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReviewGuideDtoBuilder {\n");
      
      sb.append("    message: ").append(toIndentedString(message)).append("\n");
      sb.append("    field: ").append(toIndentedString(field)).append("\n");
      sb.append("    contentScore: ").append(toIndentedString(contentScore)).append("\n");
      sb.append("    attachmentScore: ").append(toIndentedString(attachmentScore)).append("\n");
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

