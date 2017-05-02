package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.ProductReviewDto;
import com.coupang.apigateway.services.product_review.model.ReviewerDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class VideoAttachmentDto   {
  
  private Integer width = null;
  private String videoUrl = null;
  private String videoThumbnailUrl = null;
  private String videoSmallThumbnailUrl = null;
  private String uploadedFilePath = null;
  private String status = null;
  private ReviewerDto reviewer = null;
  private ProductReviewDto productReview = null;
  private Integer ordering = null;
  private Long id = null;
  private Integer height = null;
  private Long fileId = null;
  private Long duration = null;
  private String caption = null;
  private Boolean blinded = null;
  private String attachmentType = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("width")
  @com.fasterxml.jackson.annotation.JsonProperty("width")
  public Integer getWidth() {
    return width;
  }
  
  /**
   **/
  public void setWidth(Integer width) {
    this.width = width;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("videoUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("videoUrl")
  public String getVideoUrl() {
    return videoUrl;
  }
  
  /**
   **/
  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("videoThumbnailUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("videoThumbnailUrl")
  public String getVideoThumbnailUrl() {
    return videoThumbnailUrl;
  }
  
  /**
   **/
  public void setVideoThumbnailUrl(String videoThumbnailUrl) {
    this.videoThumbnailUrl = videoThumbnailUrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("videoSmallThumbnailUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("videoSmallThumbnailUrl")
  public String getVideoSmallThumbnailUrl() {
    return videoSmallThumbnailUrl;
  }
  
  /**
   **/
  public void setVideoSmallThumbnailUrl(String videoSmallThumbnailUrl) {
    this.videoSmallThumbnailUrl = videoSmallThumbnailUrl;
  }
  
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
  @org.codehaus.jackson.annotate.JsonProperty("status")
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  public String getStatus() {
    return status;
  }
  
  /**
   **/
  public void setStatus(String status) {
    this.status = status;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewer")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewer")
  public ReviewerDto getReviewer() {
    return reviewer;
  }
  
  /**
   **/
  public void setReviewer(ReviewerDto reviewer) {
    this.reviewer = reviewer;
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
  @org.codehaus.jackson.annotate.JsonProperty("height")
  @com.fasterxml.jackson.annotation.JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  
  /**
   **/
  public void setHeight(Integer height) {
    this.height = height;
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
  @org.codehaus.jackson.annotate.JsonProperty("duration")
  @com.fasterxml.jackson.annotation.JsonProperty("duration")
  public Long getDuration() {
    return duration;
  }
  
  /**
   **/
  public void setDuration(Long duration) {
    this.duration = duration;
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
  public String getAttachmentType() {
    return attachmentType;
  }
  
  /**
   **/
  public void setAttachmentType(String attachmentType) {
    this.attachmentType = attachmentType;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoAttachmentDto videoAttachmentDto = (VideoAttachmentDto) o;
    return Objects.equals(this.width, videoAttachmentDto.width) &&
        Objects.equals(this.videoUrl, videoAttachmentDto.videoUrl) &&
        Objects.equals(this.videoThumbnailUrl, videoAttachmentDto.videoThumbnailUrl) &&
        Objects.equals(this.videoSmallThumbnailUrl, videoAttachmentDto.videoSmallThumbnailUrl) &&
        Objects.equals(this.uploadedFilePath, videoAttachmentDto.uploadedFilePath) &&
        Objects.equals(this.status, videoAttachmentDto.status) &&
        Objects.equals(this.reviewer, videoAttachmentDto.reviewer) &&
        Objects.equals(this.productReview, videoAttachmentDto.productReview) &&
        Objects.equals(this.ordering, videoAttachmentDto.ordering) &&
        Objects.equals(this.id, videoAttachmentDto.id) &&
        Objects.equals(this.height, videoAttachmentDto.height) &&
        Objects.equals(this.fileId, videoAttachmentDto.fileId) &&
        Objects.equals(this.duration, videoAttachmentDto.duration) &&
        Objects.equals(this.caption, videoAttachmentDto.caption) &&
        Objects.equals(this.blinded, videoAttachmentDto.blinded) &&
        Objects.equals(this.attachmentType, videoAttachmentDto.attachmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, videoUrl, videoThumbnailUrl, videoSmallThumbnailUrl, uploadedFilePath, status, reviewer, productReview, ordering, id, height, fileId, duration, caption, blinded, attachmentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoAttachmentDto {\n");
    
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
    sb.append("    videoThumbnailUrl: ").append(toIndentedString(videoThumbnailUrl)).append("\n");
    sb.append("    videoSmallThumbnailUrl: ").append(toIndentedString(videoSmallThumbnailUrl)).append("\n");
    sb.append("    uploadedFilePath: ").append(toIndentedString(uploadedFilePath)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
    sb.append("    productReview: ").append(toIndentedString(productReview)).append("\n");
    sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    blinded: ").append(toIndentedString(blinded)).append("\n");
    sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
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

  public static VideoAttachmentDtoBuilder builder() {
    return new VideoAttachmentDtoBuilder();
  }

  public static class VideoAttachmentDtoBuilder {

    private Integer width = null;
    private String videoUrl = null;
    private String videoThumbnailUrl = null;
    private String videoSmallThumbnailUrl = null;
    private String uploadedFilePath = null;
    private String status = null;
    private ReviewerDto reviewer = null;
    private ProductReviewDto productReview = null;
    private Integer ordering = null;
    private Long id = null;
    private Integer height = null;
    private Long fileId = null;
    private Long duration = null;
    private String caption = null;
    private Boolean blinded = null;
    private String attachmentType = null;
    

    VideoAttachmentDtoBuilder() {
    }

    /**
     **/
    public VideoAttachmentDtoBuilder width(Integer width) {
      this.width = width;
      return this;
    }

    /**
     **/
    public VideoAttachmentDtoBuilder videoUrl(String videoUrl) {
      this.videoUrl = videoUrl;
      return this;
    }

    /**
     **/
    public VideoAttachmentDtoBuilder videoThumbnailUrl(String videoThumbnailUrl) {
      this.videoThumbnailUrl = videoThumbnailUrl;
      return this;
    }

    /**
     **/
    public VideoAttachmentDtoBuilder videoSmallThumbnailUrl(String videoSmallThumbnailUrl) {
      this.videoSmallThumbnailUrl = videoSmallThumbnailUrl;
      return this;
    }

    /**
     **/
    public VideoAttachmentDtoBuilder uploadedFilePath(String uploadedFilePath) {
      this.uploadedFilePath = uploadedFilePath;
      return this;
    }

    /**
     **/
    public VideoAttachmentDtoBuilder status(String status) {
      this.status = status;
      return this;
    }

    /**
     **/
    public VideoAttachmentDtoBuilder reviewer(ReviewerDto reviewer) {
      this.reviewer = reviewer;
      return this;
    }

    /**
     **/
    public VideoAttachmentDtoBuilder productReview(ProductReviewDto productReview) {
      this.productReview = productReview;
      return this;
    }

    /**
     **/
    public VideoAttachmentDtoBuilder ordering(Integer ordering) {
      this.ordering = ordering;
      return this;
    }

    /**
     **/
    public VideoAttachmentDtoBuilder id(Long id) {
      this.id = id;
      return this;
    }

    /**
     **/
    public VideoAttachmentDtoBuilder height(Integer height) {
      this.height = height;
      return this;
    }

    /**
     **/
    public VideoAttachmentDtoBuilder fileId(Long fileId) {
      this.fileId = fileId;
      return this;
    }

    /**
     **/
    public VideoAttachmentDtoBuilder duration(Long duration) {
      this.duration = duration;
      return this;
    }

    /**
     **/
    public VideoAttachmentDtoBuilder caption(String caption) {
      this.caption = caption;
      return this;
    }

    /**
     **/
    public VideoAttachmentDtoBuilder blinded(Boolean blinded) {
      this.blinded = blinded;
      return this;
    }

    /**
     **/
    public VideoAttachmentDtoBuilder attachmentType(String attachmentType) {
      this.attachmentType = attachmentType;
      return this;
    }


    public VideoAttachmentDto build() {
      VideoAttachmentDto videoAttachmentDto = new VideoAttachmentDto();
      videoAttachmentDto.setWidth(this.width);
      videoAttachmentDto.setVideoUrl(this.videoUrl);
      videoAttachmentDto.setVideoThumbnailUrl(this.videoThumbnailUrl);
      videoAttachmentDto.setVideoSmallThumbnailUrl(this.videoSmallThumbnailUrl);
      videoAttachmentDto.setUploadedFilePath(this.uploadedFilePath);
      videoAttachmentDto.setStatus(this.status);
      videoAttachmentDto.setReviewer(this.reviewer);
      videoAttachmentDto.setProductReview(this.productReview);
      videoAttachmentDto.setOrdering(this.ordering);
      videoAttachmentDto.setId(this.id);
      videoAttachmentDto.setHeight(this.height);
      videoAttachmentDto.setFileId(this.fileId);
      videoAttachmentDto.setDuration(this.duration);
      videoAttachmentDto.setCaption(this.caption);
      videoAttachmentDto.setBlinded(this.blinded);
      videoAttachmentDto.setAttachmentType(this.attachmentType);
      return videoAttachmentDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VideoAttachmentDtoBuilder {\n");
      
      sb.append("    width: ").append(toIndentedString(width)).append("\n");
      sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
      sb.append("    videoThumbnailUrl: ").append(toIndentedString(videoThumbnailUrl)).append("\n");
      sb.append("    videoSmallThumbnailUrl: ").append(toIndentedString(videoSmallThumbnailUrl)).append("\n");
      sb.append("    uploadedFilePath: ").append(toIndentedString(uploadedFilePath)).append("\n");
      sb.append("    status: ").append(toIndentedString(status)).append("\n");
      sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
      sb.append("    productReview: ").append(toIndentedString(productReview)).append("\n");
      sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    height: ").append(toIndentedString(height)).append("\n");
      sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
      sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
      sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
      sb.append("    blinded: ").append(toIndentedString(blinded)).append("\n");
      sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
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

