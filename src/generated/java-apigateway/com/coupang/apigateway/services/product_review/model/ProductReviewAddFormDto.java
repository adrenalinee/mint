package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.AttachmentFormDto;
import com.coupang.apigateway.services.product_review.model.ReviewSurveyAnswerFormDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ProductReviewAddFormDto   {
  
  private Long vendorItemId = null;


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
  private List<ReviewSurveyAnswerFormDto> reviewSurveyAnswers = new ArrayList<ReviewSurveyAnswerFormDto>();
  private Integer rating = null;
  private Long productId = null;
  private String locale = null;
  private String content = null;
  private Long completedOrderVendorItemId = null;
  private Long categoryId = null;
  private List<AttachmentFormDto> attachments = new ArrayList<AttachmentFormDto>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("vendorItemId")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorItemId")
  public Long getVendorItemId() {
    return vendorItemId;
  }
  
  /**
   **/
  public void setVendorItemId(Long vendorItemId) {
    this.vendorItemId = vendorItemId;
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
  @org.codehaus.jackson.annotate.JsonProperty("completedOrderVendorItemId")
  @com.fasterxml.jackson.annotation.JsonProperty("completedOrderVendorItemId")
  public Long getCompletedOrderVendorItemId() {
    return completedOrderVendorItemId;
  }
  
  /**
   **/
  public void setCompletedOrderVendorItemId(Long completedOrderVendorItemId) {
    this.completedOrderVendorItemId = completedOrderVendorItemId;
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
    ProductReviewAddFormDto productReviewAddFormDto = (ProductReviewAddFormDto) o;
    return Objects.equals(this.vendorItemId, productReviewAddFormDto.vendorItemId) &&
        Objects.equals(this.userAgentType, productReviewAddFormDto.userAgentType) &&
        Objects.equals(this.uploadedFilePath, productReviewAddFormDto.uploadedFilePath) &&
        Objects.equals(this.token, productReviewAddFormDto.token) &&
        Objects.equals(this.title, productReviewAddFormDto.title) &&
        Objects.equals(this.reviewSurveyAnswers, productReviewAddFormDto.reviewSurveyAnswers) &&
        Objects.equals(this.rating, productReviewAddFormDto.rating) &&
        Objects.equals(this.productId, productReviewAddFormDto.productId) &&
        Objects.equals(this.locale, productReviewAddFormDto.locale) &&
        Objects.equals(this.content, productReviewAddFormDto.content) &&
        Objects.equals(this.completedOrderVendorItemId, productReviewAddFormDto.completedOrderVendorItemId) &&
        Objects.equals(this.categoryId, productReviewAddFormDto.categoryId) &&
        Objects.equals(this.attachments, productReviewAddFormDto.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemId, userAgentType, uploadedFilePath, token, title, reviewSurveyAnswers, rating, productId, locale, content, completedOrderVendorItemId, categoryId, attachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductReviewAddFormDto {\n");
    
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    userAgentType: ").append(toIndentedString(userAgentType)).append("\n");
    sb.append("    uploadedFilePath: ").append(toIndentedString(uploadedFilePath)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    reviewSurveyAnswers: ").append(toIndentedString(reviewSurveyAnswers)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    completedOrderVendorItemId: ").append(toIndentedString(completedOrderVendorItemId)).append("\n");
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

  public static ProductReviewAddFormDtoBuilder builder() {
    return new ProductReviewAddFormDtoBuilder();
  }

  public static class ProductReviewAddFormDtoBuilder {

    private Long vendorItemId = null;
    private UserAgentTypeEnum userAgentType = null;
    private List<String> uploadedFilePath = new ArrayList<String>();
    private String token = null;
    private String title = null;
    private List<ReviewSurveyAnswerFormDto> reviewSurveyAnswers = new ArrayList<ReviewSurveyAnswerFormDto>();
    private Integer rating = null;
    private Long productId = null;
    private String locale = null;
    private String content = null;
    private Long completedOrderVendorItemId = null;
    private Long categoryId = null;
    private List<AttachmentFormDto> attachments = new ArrayList<AttachmentFormDto>();
    

    ProductReviewAddFormDtoBuilder() {
    }

    /**
     **/
    public ProductReviewAddFormDtoBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public ProductReviewAddFormDtoBuilder userAgentType(UserAgentTypeEnum userAgentType) {
      this.userAgentType = userAgentType;
      return this;
    }

    /**
     **/
    public ProductReviewAddFormDtoBuilder uploadedFilePath(List<String> uploadedFilePath) {
      this.uploadedFilePath = uploadedFilePath;
      return this;
    }

    /**
     **/
    public ProductReviewAddFormDtoBuilder token(String token) {
      this.token = token;
      return this;
    }

    /**
     **/
    public ProductReviewAddFormDtoBuilder title(String title) {
      this.title = title;
      return this;
    }

    /**
     **/
    public ProductReviewAddFormDtoBuilder reviewSurveyAnswers(List<ReviewSurveyAnswerFormDto> reviewSurveyAnswers) {
      this.reviewSurveyAnswers = reviewSurveyAnswers;
      return this;
    }

    /**
     **/
    public ProductReviewAddFormDtoBuilder rating(Integer rating) {
      this.rating = rating;
      return this;
    }

    /**
     **/
    public ProductReviewAddFormDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public ProductReviewAddFormDtoBuilder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     **/
    public ProductReviewAddFormDtoBuilder content(String content) {
      this.content = content;
      return this;
    }

    /**
     **/
    public ProductReviewAddFormDtoBuilder completedOrderVendorItemId(Long completedOrderVendorItemId) {
      this.completedOrderVendorItemId = completedOrderVendorItemId;
      return this;
    }

    /**
     **/
    public ProductReviewAddFormDtoBuilder categoryId(Long categoryId) {
      this.categoryId = categoryId;
      return this;
    }

    /**
     **/
    public ProductReviewAddFormDtoBuilder attachments(List<AttachmentFormDto> attachments) {
      this.attachments = attachments;
      return this;
    }


    public ProductReviewAddFormDto build() {
      ProductReviewAddFormDto productReviewAddFormDto = new ProductReviewAddFormDto();
      productReviewAddFormDto.setVendorItemId(this.vendorItemId);
      productReviewAddFormDto.setUserAgentType(this.userAgentType);
      productReviewAddFormDto.setUploadedFilePath(this.uploadedFilePath);
      productReviewAddFormDto.setToken(this.token);
      productReviewAddFormDto.setTitle(this.title);
      productReviewAddFormDto.setReviewSurveyAnswers(this.reviewSurveyAnswers);
      productReviewAddFormDto.setRating(this.rating);
      productReviewAddFormDto.setProductId(this.productId);
      productReviewAddFormDto.setLocale(this.locale);
      productReviewAddFormDto.setContent(this.content);
      productReviewAddFormDto.setCompletedOrderVendorItemId(this.completedOrderVendorItemId);
      productReviewAddFormDto.setCategoryId(this.categoryId);
      productReviewAddFormDto.setAttachments(this.attachments);
      return productReviewAddFormDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ProductReviewAddFormDtoBuilder {\n");
      
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    userAgentType: ").append(toIndentedString(userAgentType)).append("\n");
      sb.append("    uploadedFilePath: ").append(toIndentedString(uploadedFilePath)).append("\n");
      sb.append("    token: ").append(toIndentedString(token)).append("\n");
      sb.append("    title: ").append(toIndentedString(title)).append("\n");
      sb.append("    reviewSurveyAnswers: ").append(toIndentedString(reviewSurveyAnswers)).append("\n");
      sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
      sb.append("    content: ").append(toIndentedString(content)).append("\n");
      sb.append("    completedOrderVendorItemId: ").append(toIndentedString(completedOrderVendorItemId)).append("\n");
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

