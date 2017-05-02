package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.AttachmentFormDto;
import com.coupang.apigateway.services.product_review.model.ReviewSurveyAnswerFormDto;
import com.coupang.apigateway.services.product_review.model.VideoAttachmentFormDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ProductReviewModifyFormDto   {
  
  private List<VideoAttachmentFormDto> videoAttachments = new ArrayList<VideoAttachmentFormDto>();


  public enum UserAgentTypeEnum {
    ANDROID("ANDROID"),
    IOS("IOS"),
    W_ANDROID("W_ANDROID"),
    W_IOS("W_IOS"),
    W_ETC("W_ETC"),
    WEB("WEB");

    private String value;

    UserAgentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private UserAgentTypeEnum userAgentType = null;
  private List<String> uploadedFilePath = new ArrayList<String>();
  private String token = null;
  private String title = null;
  private Boolean supportVideo = null;
  private List<ReviewSurveyAnswerFormDto> reviewSurveyAnswers = new ArrayList<ReviewSurveyAnswerFormDto>();
  private Long reviewId = null;
  private Integer rating = null;
  private Long productId = null;
  private String locale = null;
  private String content = null;
  private Long categoryId = null;
  private List<AttachmentFormDto> attachments = new ArrayList<AttachmentFormDto>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("videoAttachments")
  @com.fasterxml.jackson.annotation.JsonProperty("videoAttachments")
  public List<VideoAttachmentFormDto> getVideoAttachments() {
    return videoAttachments;
  }
  
  /**
   **/
  public void setVideoAttachments(List<VideoAttachmentFormDto> videoAttachments) {
    this.videoAttachments = videoAttachments;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("userAgentType")
  @com.fasterxml.jackson.annotation.JsonProperty("userAgentType")
  public UserAgentTypeEnum getUserAgentType() {
    return userAgentType;
  }
  
  /**
   **/
  public void setUserAgentType(UserAgentTypeEnum userAgentType) {
    this.userAgentType = userAgentType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("uploadedFilePath")
  @com.fasterxml.jackson.annotation.JsonProperty("uploadedFilePath")
  public List<String> getUploadedFilePath() {
    return uploadedFilePath;
  }
  
  /**
   **/
  public void setUploadedFilePath(List<String> uploadedFilePath) {
    this.uploadedFilePath = uploadedFilePath;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("token")
  @com.fasterxml.jackson.annotation.JsonProperty("token")
  public String getToken() {
    return token;
  }
  
  /**
   **/
  public void setToken(String token) {
    this.token = token;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("title")
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  public String getTitle() {
    return title;
  }
  
  /**
   **/
  public void setTitle(String title) {
    this.title = title;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("supportVideo")
  @com.fasterxml.jackson.annotation.JsonProperty("supportVideo")
  public Boolean getSupportVideo() {
    return supportVideo;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isSupportVideo() {
    return supportVideo == null ? false : supportVideo;
  }
  
  /**
   **/
  public void setSupportVideo(Boolean supportVideo) {
    this.supportVideo = supportVideo;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewSurveyAnswers")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewSurveyAnswers")
  public List<ReviewSurveyAnswerFormDto> getReviewSurveyAnswers() {
    return reviewSurveyAnswers;
  }
  
  /**
   **/
  public void setReviewSurveyAnswers(List<ReviewSurveyAnswerFormDto> reviewSurveyAnswers) {
    this.reviewSurveyAnswers = reviewSurveyAnswers;
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
  @org.codehaus.jackson.annotate.JsonProperty("rating")
  @com.fasterxml.jackson.annotation.JsonProperty("rating")
  public Integer getRating() {
    return rating;
  }
  
  /**
   **/
  public void setRating(Integer rating) {
    this.rating = rating;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("productId")
  @com.fasterxml.jackson.annotation.JsonProperty("productId")
  public Long getProductId() {
    return productId;
  }
  
  /**
   **/
  public void setProductId(Long productId) {
    this.productId = productId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("locale")
  @com.fasterxml.jackson.annotation.JsonProperty("locale")
  public String getLocale() {
    return locale;
  }
  
  /**
   **/
  public void setLocale(String locale) {
    this.locale = locale;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("content")
  @com.fasterxml.jackson.annotation.JsonProperty("content")
  public String getContent() {
    return content;
  }
  
  /**
   **/
  public void setContent(String content) {
    this.content = content;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("categoryId")
  @com.fasterxml.jackson.annotation.JsonProperty("categoryId")
  public Long getCategoryId() {
    return categoryId;
  }
  
  /**
   **/
  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attachments")
  @com.fasterxml.jackson.annotation.JsonProperty("attachments")
  public List<AttachmentFormDto> getAttachments() {
    return attachments;
  }
  
  /**
   **/
  public void setAttachments(List<AttachmentFormDto> attachments) {
    this.attachments = attachments;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductReviewModifyFormDto productReviewModifyFormDto = (ProductReviewModifyFormDto) o;
    return Objects.equals(this.videoAttachments, productReviewModifyFormDto.videoAttachments) &&
        Objects.equals(this.userAgentType, productReviewModifyFormDto.userAgentType) &&
        Objects.equals(this.uploadedFilePath, productReviewModifyFormDto.uploadedFilePath) &&
        Objects.equals(this.token, productReviewModifyFormDto.token) &&
        Objects.equals(this.title, productReviewModifyFormDto.title) &&
        Objects.equals(this.supportVideo, productReviewModifyFormDto.supportVideo) &&
        Objects.equals(this.reviewSurveyAnswers, productReviewModifyFormDto.reviewSurveyAnswers) &&
        Objects.equals(this.reviewId, productReviewModifyFormDto.reviewId) &&
        Objects.equals(this.rating, productReviewModifyFormDto.rating) &&
        Objects.equals(this.productId, productReviewModifyFormDto.productId) &&
        Objects.equals(this.locale, productReviewModifyFormDto.locale) &&
        Objects.equals(this.content, productReviewModifyFormDto.content) &&
        Objects.equals(this.categoryId, productReviewModifyFormDto.categoryId) &&
        Objects.equals(this.attachments, productReviewModifyFormDto.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoAttachments, userAgentType, uploadedFilePath, token, title, supportVideo, reviewSurveyAnswers, reviewId, rating, productId, locale, content, categoryId, attachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductReviewModifyFormDto {\n");
    
    sb.append("    videoAttachments: ").append(toIndentedString(videoAttachments)).append("\n");
    sb.append("    userAgentType: ").append(toIndentedString(userAgentType)).append("\n");
    sb.append("    uploadedFilePath: ").append(toIndentedString(uploadedFilePath)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    supportVideo: ").append(toIndentedString(supportVideo)).append("\n");
    sb.append("    reviewSurveyAnswers: ").append(toIndentedString(reviewSurveyAnswers)).append("\n");
    sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

  public static ProductReviewModifyFormDtoBuilder builder() {
    return new ProductReviewModifyFormDtoBuilder();
  }

  public static class ProductReviewModifyFormDtoBuilder {

    private List<VideoAttachmentFormDto> videoAttachments = new ArrayList<VideoAttachmentFormDto>();
    private UserAgentTypeEnum userAgentType = null;
    private List<String> uploadedFilePath = new ArrayList<String>();
    private String token = null;
    private String title = null;
    private Boolean supportVideo = null;
    private List<ReviewSurveyAnswerFormDto> reviewSurveyAnswers = new ArrayList<ReviewSurveyAnswerFormDto>();
    private Long reviewId = null;
    private Integer rating = null;
    private Long productId = null;
    private String locale = null;
    private String content = null;
    private Long categoryId = null;
    private List<AttachmentFormDto> attachments = new ArrayList<AttachmentFormDto>();
    

    ProductReviewModifyFormDtoBuilder() {
    }

    /**
     **/
    public ProductReviewModifyFormDtoBuilder videoAttachments(List<VideoAttachmentFormDto> videoAttachments) {
      this.videoAttachments = videoAttachments;
      return this;
    }

    /**
     **/
    public ProductReviewModifyFormDtoBuilder userAgentType(UserAgentTypeEnum userAgentType) {
      this.userAgentType = userAgentType;
      return this;
    }

    /**
     **/
    public ProductReviewModifyFormDtoBuilder uploadedFilePath(List<String> uploadedFilePath) {
      this.uploadedFilePath = uploadedFilePath;
      return this;
    }

    /**
     **/
    public ProductReviewModifyFormDtoBuilder token(String token) {
      this.token = token;
      return this;
    }

    /**
     **/
    public ProductReviewModifyFormDtoBuilder title(String title) {
      this.title = title;
      return this;
    }

    /**
     **/
    public ProductReviewModifyFormDtoBuilder supportVideo(Boolean supportVideo) {
      this.supportVideo = supportVideo;
      return this;
    }

    /**
     **/
    public ProductReviewModifyFormDtoBuilder reviewSurveyAnswers(List<ReviewSurveyAnswerFormDto> reviewSurveyAnswers) {
      this.reviewSurveyAnswers = reviewSurveyAnswers;
      return this;
    }

    /**
     **/
    public ProductReviewModifyFormDtoBuilder reviewId(Long reviewId) {
      this.reviewId = reviewId;
      return this;
    }

    /**
     **/
    public ProductReviewModifyFormDtoBuilder rating(Integer rating) {
      this.rating = rating;
      return this;
    }

    /**
     **/
    public ProductReviewModifyFormDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public ProductReviewModifyFormDtoBuilder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     **/
    public ProductReviewModifyFormDtoBuilder content(String content) {
      this.content = content;
      return this;
    }

    /**
     **/
    public ProductReviewModifyFormDtoBuilder categoryId(Long categoryId) {
      this.categoryId = categoryId;
      return this;
    }

    /**
     **/
    public ProductReviewModifyFormDtoBuilder attachments(List<AttachmentFormDto> attachments) {
      this.attachments = attachments;
      return this;
    }


    public ProductReviewModifyFormDto build() {
      ProductReviewModifyFormDto productReviewModifyFormDto = new ProductReviewModifyFormDto();
      productReviewModifyFormDto.setVideoAttachments(this.videoAttachments);
      productReviewModifyFormDto.setUserAgentType(this.userAgentType);
      productReviewModifyFormDto.setUploadedFilePath(this.uploadedFilePath);
      productReviewModifyFormDto.setToken(this.token);
      productReviewModifyFormDto.setTitle(this.title);
      productReviewModifyFormDto.setSupportVideo(this.supportVideo);
      productReviewModifyFormDto.setReviewSurveyAnswers(this.reviewSurveyAnswers);
      productReviewModifyFormDto.setReviewId(this.reviewId);
      productReviewModifyFormDto.setRating(this.rating);
      productReviewModifyFormDto.setProductId(this.productId);
      productReviewModifyFormDto.setLocale(this.locale);
      productReviewModifyFormDto.setContent(this.content);
      productReviewModifyFormDto.setCategoryId(this.categoryId);
      productReviewModifyFormDto.setAttachments(this.attachments);
      return productReviewModifyFormDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ProductReviewModifyFormDtoBuilder {\n");
      
      sb.append("    videoAttachments: ").append(toIndentedString(videoAttachments)).append("\n");
      sb.append("    userAgentType: ").append(toIndentedString(userAgentType)).append("\n");
      sb.append("    uploadedFilePath: ").append(toIndentedString(uploadedFilePath)).append("\n");
      sb.append("    token: ").append(toIndentedString(token)).append("\n");
      sb.append("    title: ").append(toIndentedString(title)).append("\n");
      sb.append("    supportVideo: ").append(toIndentedString(supportVideo)).append("\n");
      sb.append("    reviewSurveyAnswers: ").append(toIndentedString(reviewSurveyAnswers)).append("\n");
      sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
      sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
      sb.append("    content: ").append(toIndentedString(content)).append("\n");
      sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
      sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

