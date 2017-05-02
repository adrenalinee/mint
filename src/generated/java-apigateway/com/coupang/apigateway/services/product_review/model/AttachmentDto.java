package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.ProductReviewDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class AttachmentDto   {
  
  private String uploadedFilePath = null;
  private Long reviewId = null;
  private ProductReviewDto productReview = null;
  private Integer ordering = null;
  private String imgSrcThumbnail = null;
  private String imgSrcOrigin = null;
  private Long id = null;
  private String extendedAttachmentType = null;
  private String caption = null;
  private Boolean blinded = null;


  public enum AttachmentTypeEnum {
    IMAGE("IMAGE"),
    MOVIE("MOVIE");

    private String value;

    AttachmentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private AttachmentTypeEnum attachmentType = null;
  private String attachmentTemplateText = null;
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
  @org.codehaus.jackson.annotate.JsonProperty("reviewId")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewId")
  public Long getReviewId() {
    return reviewId;
  }
  
  /**
   **/
  public void setReviewId(Long reviewId) {
    this.reviewId = reviewId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("productReview")
  @com.fasterxml.jackson.annotation.JsonProperty("productReview")
  public ProductReviewDto getProductReview() {
    return productReview;
  }
  
  /**
   **/
  public void setProductReview(ProductReviewDto productReview) {
    this.productReview = productReview;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("ordering")
  @com.fasterxml.jackson.annotation.JsonProperty("ordering")
  public Integer getOrdering() {
    return ordering;
  }
  
  /**
   **/
  public void setOrdering(Integer ordering) {
    this.ordering = ordering;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("imgSrcThumbnail")
  @com.fasterxml.jackson.annotation.JsonProperty("imgSrcThumbnail")
  public String getImgSrcThumbnail() {
    return imgSrcThumbnail;
  }
  
  /**
   **/
  public void setImgSrcThumbnail(String imgSrcThumbnail) {
    this.imgSrcThumbnail = imgSrcThumbnail;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("imgSrcOrigin")
  @com.fasterxml.jackson.annotation.JsonProperty("imgSrcOrigin")
  public String getImgSrcOrigin() {
    return imgSrcOrigin;
  }
  
  /**
   **/
  public void setImgSrcOrigin(String imgSrcOrigin) {
    this.imgSrcOrigin = imgSrcOrigin;
  }
  
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
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("extendedAttachmentType")
  @com.fasterxml.jackson.annotation.JsonProperty("extendedAttachmentType")
  public String getExtendedAttachmentType() {
    return extendedAttachmentType;
  }
  
  /**
   **/
  public void setExtendedAttachmentType(String extendedAttachmentType) {
    this.extendedAttachmentType = extendedAttachmentType;
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
  @org.codehaus.jackson.annotate.JsonProperty("blinded")
  @com.fasterxml.jackson.annotation.JsonProperty("blinded")
  public Boolean getBlinded() {
    return blinded;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isBlinded() {
    return blinded == null ? false : blinded;
  }
  
  /**
   **/
  public void setBlinded(Boolean blinded) {
    this.blinded = blinded;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attachmentType")
  @com.fasterxml.jackson.annotation.JsonProperty("attachmentType")
  public AttachmentTypeEnum getAttachmentType() {
    return attachmentType;
  }
  
  /**
   **/
  public void setAttachmentType(AttachmentTypeEnum attachmentType) {
    this.attachmentType = attachmentType;
  }
  
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
    AttachmentDto attachmentDto = (AttachmentDto) o;
    return Objects.equals(this.uploadedFilePath, attachmentDto.uploadedFilePath) &&
        Objects.equals(this.reviewId, attachmentDto.reviewId) &&
        Objects.equals(this.productReview, attachmentDto.productReview) &&
        Objects.equals(this.ordering, attachmentDto.ordering) &&
        Objects.equals(this.imgSrcThumbnail, attachmentDto.imgSrcThumbnail) &&
        Objects.equals(this.imgSrcOrigin, attachmentDto.imgSrcOrigin) &&
        Objects.equals(this.id, attachmentDto.id) &&
        Objects.equals(this.extendedAttachmentType, attachmentDto.extendedAttachmentType) &&
        Objects.equals(this.caption, attachmentDto.caption) &&
        Objects.equals(this.blinded, attachmentDto.blinded) &&
        Objects.equals(this.attachmentType, attachmentDto.attachmentType) &&
        Objects.equals(this.attachmentTemplateText, attachmentDto.attachmentTemplateText) &&
        Objects.equals(this.attachmentTemplateId, attachmentDto.attachmentTemplateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uploadedFilePath, reviewId, productReview, ordering, imgSrcThumbnail, imgSrcOrigin, id, extendedAttachmentType, caption, blinded, attachmentType, attachmentTemplateText, attachmentTemplateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentDto {\n");
    
    sb.append("    uploadedFilePath: ").append(toIndentedString(uploadedFilePath)).append("\n");
    sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
    sb.append("    productReview: ").append(toIndentedString(productReview)).append("\n");
    sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
    sb.append("    imgSrcThumbnail: ").append(toIndentedString(imgSrcThumbnail)).append("\n");
    sb.append("    imgSrcOrigin: ").append(toIndentedString(imgSrcOrigin)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    extendedAttachmentType: ").append(toIndentedString(extendedAttachmentType)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    blinded: ").append(toIndentedString(blinded)).append("\n");
    sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
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

  public static AttachmentDtoBuilder builder() {
    return new AttachmentDtoBuilder();
  }

  public static class AttachmentDtoBuilder {

    private String uploadedFilePath = null;
    private Long reviewId = null;
    private ProductReviewDto productReview = null;
    private Integer ordering = null;
    private String imgSrcThumbnail = null;
    private String imgSrcOrigin = null;
    private Long id = null;
    private String extendedAttachmentType = null;
    private String caption = null;
    private Boolean blinded = null;
    private AttachmentTypeEnum attachmentType = null;
    private String attachmentTemplateText = null;
    private Long attachmentTemplateId = null;
    

    AttachmentDtoBuilder() {
    }

    /**
     **/
    public AttachmentDtoBuilder uploadedFilePath(String uploadedFilePath) {
      this.uploadedFilePath = uploadedFilePath;
      return this;
    }

    /**
     **/
    public AttachmentDtoBuilder reviewId(Long reviewId) {
      this.reviewId = reviewId;
      return this;
    }

    /**
     **/
    public AttachmentDtoBuilder productReview(ProductReviewDto productReview) {
      this.productReview = productReview;
      return this;
    }

    /**
     **/
    public AttachmentDtoBuilder ordering(Integer ordering) {
      this.ordering = ordering;
      return this;
    }

    /**
     **/
    public AttachmentDtoBuilder imgSrcThumbnail(String imgSrcThumbnail) {
      this.imgSrcThumbnail = imgSrcThumbnail;
      return this;
    }

    /**
     **/
    public AttachmentDtoBuilder imgSrcOrigin(String imgSrcOrigin) {
      this.imgSrcOrigin = imgSrcOrigin;
      return this;
    }

    /**
     **/
    public AttachmentDtoBuilder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public AttachmentDtoBuilder extendedAttachmentType(String extendedAttachmentType) {
      this.extendedAttachmentType = extendedAttachmentType;
      return this;
    }

    /**
     **/
    public AttachmentDtoBuilder caption(String caption) {
      this.caption = caption;
      return this;
    }

    /**
     **/
    public AttachmentDtoBuilder blinded(Boolean blinded) {
      this.blinded = blinded;
      return this;
    }

    /**
     **/
    public AttachmentDtoBuilder attachmentType(AttachmentTypeEnum attachmentType) {
      this.attachmentType = attachmentType;
      return this;
    }

    /**
     **/
    public AttachmentDtoBuilder attachmentTemplateText(String attachmentTemplateText) {
      this.attachmentTemplateText = attachmentTemplateText;
      return this;
    }

    /**
     **/
    public AttachmentDtoBuilder attachmentTemplateId(Long attachmentTemplateId) {
      this.attachmentTemplateId = attachmentTemplateId;
      return this;
    }


    public AttachmentDto build() {
      AttachmentDto attachmentDto = new AttachmentDto();
      attachmentDto.setUploadedFilePath(this.uploadedFilePath);
      attachmentDto.setReviewId(this.reviewId);
      attachmentDto.setProductReview(this.productReview);
      attachmentDto.setOrdering(this.ordering);
      attachmentDto.setImgSrcThumbnail(this.imgSrcThumbnail);
      attachmentDto.setImgSrcOrigin(this.imgSrcOrigin);
      attachmentDto.setId(this.id);
      attachmentDto.setExtendedAttachmentType(this.extendedAttachmentType);
      attachmentDto.setCaption(this.caption);
      attachmentDto.setBlinded(this.blinded);
      attachmentDto.setAttachmentType(this.attachmentType);
      attachmentDto.setAttachmentTemplateText(this.attachmentTemplateText);
      attachmentDto.setAttachmentTemplateId(this.attachmentTemplateId);
      return attachmentDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AttachmentDtoBuilder {\n");
      
      sb.append("    uploadedFilePath: ").append(toIndentedString(uploadedFilePath)).append("\n");
      sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
      sb.append("    productReview: ").append(toIndentedString(productReview)).append("\n");
      sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
      sb.append("    imgSrcThumbnail: ").append(toIndentedString(imgSrcThumbnail)).append("\n");
      sb.append("    imgSrcOrigin: ").append(toIndentedString(imgSrcOrigin)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    extendedAttachmentType: ").append(toIndentedString(extendedAttachmentType)).append("\n");
      sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
      sb.append("    blinded: ").append(toIndentedString(blinded)).append("\n");
      sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
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

