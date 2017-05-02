package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.AttachmentDto;
import com.coupang.apigateway.services.product_review.model.MemberInfoDto;
import com.coupang.apigateway.services.product_review.model.ReviewHighlightingDto;
import com.coupang.apigateway.services.product_review.model.ReviewSurveyAnswerDto;
import com.coupang.apigateway.services.product_review.model.ReviewerBadgeDto;
import com.coupang.apigateway.services.product_review.model.ReviewerDisplayImageDto;
import com.coupang.apigateway.services.product_review.model.VideoAttachmentDto;
import java.util.*;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ProductReviewContentsDto   {
  
  private List<VideoAttachmentDto> videoAttachments = new ArrayList<VideoAttachmentDto>();
  private Long vendorItemId = null;
  private String vendorId = null;
  private Boolean userHelpfulValue = null;
  private Boolean userHelpfulExist = null;
  private ReviewHighlightingDto titleHighlightingDto = null;
  private String title = null;
  private String reviewerRank = null;
  private ReviewerDisplayImageDto reviewerDisplayImage = null;
  private List<ReviewerBadgeDto> reviewerBadges = new ArrayList<ReviewerBadgeDto>();
  private List<ReviewSurveyAnswerDto> reviewSurveyAnswers = new ArrayList<ReviewSurveyAnswerDto>();
  private Long reviewId = null;
  private Date reviewAt = null;
  private Boolean realNameGranted = null;
  private Integer rating = null;
  private Long productId = null;
  private Long orderId = null;
  private MemberInfoDto member = null;
  private String locale = null;
  private String itemName = null;
  private String itemImagePath = null;
  private Long itemId = null;
  private Boolean isMyReview = null;
  private Boolean isBlockMemberReview = null;
  private Boolean isAdventurerReview = null;
  private Integer helpfulTrueCount = null;
  private Integer helpfulFalseCount = null;
  private Integer helpfulCount = null;
  private String gainedScoreText = null;
  private List<String> displayWriterIconUrls = new ArrayList<String>();
  private String displayWriter = null;
  private String displayName = null;
  private Date createdAt = null;
  private ReviewHighlightingDto contentHighlightingDto = null;
  private String content = null;
  private Long completedOrderVendorItemId = null;
  private Integer commentCount = null;
  private Boolean blinded = null;
  private String blindContentName = null;
  private Long blindContentId = null;
  private Boolean attachmentsBlinded = null;
  private List<AttachmentDto> attachments = new ArrayList<AttachmentDto>();

  
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
  @org.codehaus.jackson.annotate.JsonProperty("vendorId")
  @com.fasterxml.jackson.annotation.JsonProperty("vendorId")
  public String getVendorId() {
    return vendorId;
  }
  
  /**
   **/
  public void setVendorId(String vendorId) {
    this.vendorId = vendorId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("userHelpfulValue")
  @com.fasterxml.jackson.annotation.JsonProperty("userHelpfulValue")
  public Boolean getUserHelpfulValue() {
    return userHelpfulValue;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isUserHelpfulValue() {
    return userHelpfulValue == null ? false : userHelpfulValue;
  }
  
  /**
   **/
  public void setUserHelpfulValue(Boolean userHelpfulValue) {
    this.userHelpfulValue = userHelpfulValue;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("userHelpfulExist")
  @com.fasterxml.jackson.annotation.JsonProperty("userHelpfulExist")
  public Boolean getUserHelpfulExist() {
    return userHelpfulExist;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isUserHelpfulExist() {
    return userHelpfulExist == null ? false : userHelpfulExist;
  }
  
  /**
   **/
  public void setUserHelpfulExist(Boolean userHelpfulExist) {
    this.userHelpfulExist = userHelpfulExist;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("titleHighlightingDto")
  @com.fasterxml.jackson.annotation.JsonProperty("titleHighlightingDto")
  public ReviewHighlightingDto getTitleHighlightingDto() {
    return titleHighlightingDto;
  }
  
  /**
   **/
  public void setTitleHighlightingDto(ReviewHighlightingDto titleHighlightingDto) {
    this.titleHighlightingDto = titleHighlightingDto;
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
  @org.codehaus.jackson.annotate.JsonProperty("reviewerRank")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewerRank")
  public String getReviewerRank() {
    return reviewerRank;
  }
  
  /**
   **/
  public void setReviewerRank(String reviewerRank) {
    this.reviewerRank = reviewerRank;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewerDisplayImage")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewerDisplayImage")
  public ReviewerDisplayImageDto getReviewerDisplayImage() {
    return reviewerDisplayImage;
  }
  
  /**
   **/
  public void setReviewerDisplayImage(ReviewerDisplayImageDto reviewerDisplayImage) {
    this.reviewerDisplayImage = reviewerDisplayImage;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewerBadges")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewerBadges")
  public List<ReviewerBadgeDto> getReviewerBadges() {
    return reviewerBadges;
  }
  
  /**
   **/
  public void setReviewerBadges(List<ReviewerBadgeDto> reviewerBadges) {
    this.reviewerBadges = reviewerBadges;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewSurveyAnswers")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewSurveyAnswers")
  public List<ReviewSurveyAnswerDto> getReviewSurveyAnswers() {
    return reviewSurveyAnswers;
  }
  
  /**
   **/
  public void setReviewSurveyAnswers(List<ReviewSurveyAnswerDto> reviewSurveyAnswers) {
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
  @org.codehaus.jackson.annotate.JsonProperty("reviewAt")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewAt")
  public Date getReviewAt() {
    return reviewAt;
  }
  
  /**
   **/
  public void setReviewAt(Date reviewAt) {
    this.reviewAt = reviewAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("realNameGranted")
  @com.fasterxml.jackson.annotation.JsonProperty("realNameGranted")
  public Boolean getRealNameGranted() {
    return realNameGranted;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isRealNameGranted() {
    return realNameGranted == null ? false : realNameGranted;
  }
  
  /**
   **/
  public void setRealNameGranted(Boolean realNameGranted) {
    this.realNameGranted = realNameGranted;
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
  @org.codehaus.jackson.annotate.JsonProperty("orderId")
  @com.fasterxml.jackson.annotation.JsonProperty("orderId")
  public Long getOrderId() {
    return orderId;
  }
  
  /**
   **/
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("member")
  @com.fasterxml.jackson.annotation.JsonProperty("member")
  public MemberInfoDto getMember() {
    return member;
  }
  
  /**
   **/
  public void setMember(MemberInfoDto member) {
    this.member = member;
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
  @org.codehaus.jackson.annotate.JsonProperty("itemName")
  @com.fasterxml.jackson.annotation.JsonProperty("itemName")
  public String getItemName() {
    return itemName;
  }
  
  /**
   **/
  public void setItemName(String itemName) {
    this.itemName = itemName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemImagePath")
  @com.fasterxml.jackson.annotation.JsonProperty("itemImagePath")
  public String getItemImagePath() {
    return itemImagePath;
  }
  
  /**
   **/
  public void setItemImagePath(String itemImagePath) {
    this.itemImagePath = itemImagePath;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemId")
  @com.fasterxml.jackson.annotation.JsonProperty("itemId")
  public Long getItemId() {
    return itemId;
  }
  
  /**
   **/
  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("isMyReview")
  @com.fasterxml.jackson.annotation.JsonProperty("isMyReview")
  public Boolean getIsMyReview() {
    return isMyReview;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isIsMyReview() {
    return isMyReview == null ? false : isMyReview;
  }
  
  /**
   **/
  public void setIsMyReview(Boolean isMyReview) {
    this.isMyReview = isMyReview;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("isBlockMemberReview")
  @com.fasterxml.jackson.annotation.JsonProperty("isBlockMemberReview")
  public Boolean getIsBlockMemberReview() {
    return isBlockMemberReview;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isIsBlockMemberReview() {
    return isBlockMemberReview == null ? false : isBlockMemberReview;
  }
  
  /**
   **/
  public void setIsBlockMemberReview(Boolean isBlockMemberReview) {
    this.isBlockMemberReview = isBlockMemberReview;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("isAdventurerReview")
  @com.fasterxml.jackson.annotation.JsonProperty("isAdventurerReview")
  public Boolean getIsAdventurerReview() {
    return isAdventurerReview;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isIsAdventurerReview() {
    return isAdventurerReview == null ? false : isAdventurerReview;
  }
  
  /**
   **/
  public void setIsAdventurerReview(Boolean isAdventurerReview) {
    this.isAdventurerReview = isAdventurerReview;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("helpfulTrueCount")
  @com.fasterxml.jackson.annotation.JsonProperty("helpfulTrueCount")
  public Integer getHelpfulTrueCount() {
    return helpfulTrueCount;
  }
  
  /**
   **/
  public void setHelpfulTrueCount(Integer helpfulTrueCount) {
    this.helpfulTrueCount = helpfulTrueCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("helpfulFalseCount")
  @com.fasterxml.jackson.annotation.JsonProperty("helpfulFalseCount")
  public Integer getHelpfulFalseCount() {
    return helpfulFalseCount;
  }
  
  /**
   **/
  public void setHelpfulFalseCount(Integer helpfulFalseCount) {
    this.helpfulFalseCount = helpfulFalseCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("helpfulCount")
  @com.fasterxml.jackson.annotation.JsonProperty("helpfulCount")
  public Integer getHelpfulCount() {
    return helpfulCount;
  }
  
  /**
   **/
  public void setHelpfulCount(Integer helpfulCount) {
    this.helpfulCount = helpfulCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("gainedScoreText")
  @com.fasterxml.jackson.annotation.JsonProperty("gainedScoreText")
  public String getGainedScoreText() {
    return gainedScoreText;
  }
  
  /**
   **/
  public void setGainedScoreText(String gainedScoreText) {
    this.gainedScoreText = gainedScoreText;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displayWriterIconUrls")
  @com.fasterxml.jackson.annotation.JsonProperty("displayWriterIconUrls")
  public List<String> getDisplayWriterIconUrls() {
    return displayWriterIconUrls;
  }
  
  /**
   **/
  public void setDisplayWriterIconUrls(List<String> displayWriterIconUrls) {
    this.displayWriterIconUrls = displayWriterIconUrls;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displayWriter")
  @com.fasterxml.jackson.annotation.JsonProperty("displayWriter")
  public String getDisplayWriter() {
    return displayWriter;
  }
  
  /**
   **/
  public void setDisplayWriter(String displayWriter) {
    this.displayWriter = displayWriter;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displayName")
  @com.fasterxml.jackson.annotation.JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  
  /**
   **/
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("createdAt")
  @com.fasterxml.jackson.annotation.JsonProperty("createdAt")
  public Date getCreatedAt() {
    return createdAt;
  }
  
  /**
   **/
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("contentHighlightingDto")
  @com.fasterxml.jackson.annotation.JsonProperty("contentHighlightingDto")
  public ReviewHighlightingDto getContentHighlightingDto() {
    return contentHighlightingDto;
  }
  
  /**
   **/
  public void setContentHighlightingDto(ReviewHighlightingDto contentHighlightingDto) {
    this.contentHighlightingDto = contentHighlightingDto;
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
  @org.codehaus.jackson.annotate.JsonProperty("commentCount")
  @com.fasterxml.jackson.annotation.JsonProperty("commentCount")
  public Integer getCommentCount() {
    return commentCount;
  }
  
  /**
   **/
  public void setCommentCount(Integer commentCount) {
    this.commentCount = commentCount;
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
  @org.codehaus.jackson.annotate.JsonProperty("blindContentName")
  @com.fasterxml.jackson.annotation.JsonProperty("blindContentName")
  public String getBlindContentName() {
    return blindContentName;
  }
  
  /**
   **/
  public void setBlindContentName(String blindContentName) {
    this.blindContentName = blindContentName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("blindContentId")
  @com.fasterxml.jackson.annotation.JsonProperty("blindContentId")
  public Long getBlindContentId() {
    return blindContentId;
  }
  
  /**
   **/
  public void setBlindContentId(Long blindContentId) {
    this.blindContentId = blindContentId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attachmentsBlinded")
  @com.fasterxml.jackson.annotation.JsonProperty("attachmentsBlinded")
  public Boolean getAttachmentsBlinded() {
    return attachmentsBlinded;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isAttachmentsBlinded() {
    return attachmentsBlinded == null ? false : attachmentsBlinded;
  }
  
  /**
   **/
  public void setAttachmentsBlinded(Boolean attachmentsBlinded) {
    this.attachmentsBlinded = attachmentsBlinded;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("attachments")
  @com.fasterxml.jackson.annotation.JsonProperty("attachments")
  public List<AttachmentDto> getAttachments() {
    return attachments;
  }
  
  /**
   **/
  public void setAttachments(List<AttachmentDto> attachments) {
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
    ProductReviewContentsDto productReviewContentsDto = (ProductReviewContentsDto) o;
    return Objects.equals(this.videoAttachments, productReviewContentsDto.videoAttachments) &&
        Objects.equals(this.vendorItemId, productReviewContentsDto.vendorItemId) &&
        Objects.equals(this.vendorId, productReviewContentsDto.vendorId) &&
        Objects.equals(this.userHelpfulValue, productReviewContentsDto.userHelpfulValue) &&
        Objects.equals(this.userHelpfulExist, productReviewContentsDto.userHelpfulExist) &&
        Objects.equals(this.titleHighlightingDto, productReviewContentsDto.titleHighlightingDto) &&
        Objects.equals(this.title, productReviewContentsDto.title) &&
        Objects.equals(this.reviewerRank, productReviewContentsDto.reviewerRank) &&
        Objects.equals(this.reviewerDisplayImage, productReviewContentsDto.reviewerDisplayImage) &&
        Objects.equals(this.reviewerBadges, productReviewContentsDto.reviewerBadges) &&
        Objects.equals(this.reviewSurveyAnswers, productReviewContentsDto.reviewSurveyAnswers) &&
        Objects.equals(this.reviewId, productReviewContentsDto.reviewId) &&
        Objects.equals(this.reviewAt, productReviewContentsDto.reviewAt) &&
        Objects.equals(this.realNameGranted, productReviewContentsDto.realNameGranted) &&
        Objects.equals(this.rating, productReviewContentsDto.rating) &&
        Objects.equals(this.productId, productReviewContentsDto.productId) &&
        Objects.equals(this.orderId, productReviewContentsDto.orderId) &&
        Objects.equals(this.member, productReviewContentsDto.member) &&
        Objects.equals(this.locale, productReviewContentsDto.locale) &&
        Objects.equals(this.itemName, productReviewContentsDto.itemName) &&
        Objects.equals(this.itemImagePath, productReviewContentsDto.itemImagePath) &&
        Objects.equals(this.itemId, productReviewContentsDto.itemId) &&
        Objects.equals(this.isMyReview, productReviewContentsDto.isMyReview) &&
        Objects.equals(this.isBlockMemberReview, productReviewContentsDto.isBlockMemberReview) &&
        Objects.equals(this.isAdventurerReview, productReviewContentsDto.isAdventurerReview) &&
        Objects.equals(this.helpfulTrueCount, productReviewContentsDto.helpfulTrueCount) &&
        Objects.equals(this.helpfulFalseCount, productReviewContentsDto.helpfulFalseCount) &&
        Objects.equals(this.helpfulCount, productReviewContentsDto.helpfulCount) &&
        Objects.equals(this.gainedScoreText, productReviewContentsDto.gainedScoreText) &&
        Objects.equals(this.displayWriterIconUrls, productReviewContentsDto.displayWriterIconUrls) &&
        Objects.equals(this.displayWriter, productReviewContentsDto.displayWriter) &&
        Objects.equals(this.displayName, productReviewContentsDto.displayName) &&
        Objects.equals(this.createdAt, productReviewContentsDto.createdAt) &&
        Objects.equals(this.contentHighlightingDto, productReviewContentsDto.contentHighlightingDto) &&
        Objects.equals(this.content, productReviewContentsDto.content) &&
        Objects.equals(this.completedOrderVendorItemId, productReviewContentsDto.completedOrderVendorItemId) &&
        Objects.equals(this.commentCount, productReviewContentsDto.commentCount) &&
        Objects.equals(this.blinded, productReviewContentsDto.blinded) &&
        Objects.equals(this.blindContentName, productReviewContentsDto.blindContentName) &&
        Objects.equals(this.blindContentId, productReviewContentsDto.blindContentId) &&
        Objects.equals(this.attachmentsBlinded, productReviewContentsDto.attachmentsBlinded) &&
        Objects.equals(this.attachments, productReviewContentsDto.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoAttachments, vendorItemId, vendorId, userHelpfulValue, userHelpfulExist, titleHighlightingDto, title, reviewerRank, reviewerDisplayImage, reviewerBadges, reviewSurveyAnswers, reviewId, reviewAt, realNameGranted, rating, productId, orderId, member, locale, itemName, itemImagePath, itemId, isMyReview, isBlockMemberReview, isAdventurerReview, helpfulTrueCount, helpfulFalseCount, helpfulCount, gainedScoreText, displayWriterIconUrls, displayWriter, displayName, createdAt, contentHighlightingDto, content, completedOrderVendorItemId, commentCount, blinded, blindContentName, blindContentId, attachmentsBlinded, attachments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductReviewContentsDto {\n");
    
    sb.append("    videoAttachments: ").append(toIndentedString(videoAttachments)).append("\n");
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
    sb.append("    userHelpfulValue: ").append(toIndentedString(userHelpfulValue)).append("\n");
    sb.append("    userHelpfulExist: ").append(toIndentedString(userHelpfulExist)).append("\n");
    sb.append("    titleHighlightingDto: ").append(toIndentedString(titleHighlightingDto)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    reviewerRank: ").append(toIndentedString(reviewerRank)).append("\n");
    sb.append("    reviewerDisplayImage: ").append(toIndentedString(reviewerDisplayImage)).append("\n");
    sb.append("    reviewerBadges: ").append(toIndentedString(reviewerBadges)).append("\n");
    sb.append("    reviewSurveyAnswers: ").append(toIndentedString(reviewSurveyAnswers)).append("\n");
    sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
    sb.append("    reviewAt: ").append(toIndentedString(reviewAt)).append("\n");
    sb.append("    realNameGranted: ").append(toIndentedString(realNameGranted)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemImagePath: ").append(toIndentedString(itemImagePath)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    isMyReview: ").append(toIndentedString(isMyReview)).append("\n");
    sb.append("    isBlockMemberReview: ").append(toIndentedString(isBlockMemberReview)).append("\n");
    sb.append("    isAdventurerReview: ").append(toIndentedString(isAdventurerReview)).append("\n");
    sb.append("    helpfulTrueCount: ").append(toIndentedString(helpfulTrueCount)).append("\n");
    sb.append("    helpfulFalseCount: ").append(toIndentedString(helpfulFalseCount)).append("\n");
    sb.append("    helpfulCount: ").append(toIndentedString(helpfulCount)).append("\n");
    sb.append("    gainedScoreText: ").append(toIndentedString(gainedScoreText)).append("\n");
    sb.append("    displayWriterIconUrls: ").append(toIndentedString(displayWriterIconUrls)).append("\n");
    sb.append("    displayWriter: ").append(toIndentedString(displayWriter)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    contentHighlightingDto: ").append(toIndentedString(contentHighlightingDto)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    completedOrderVendorItemId: ").append(toIndentedString(completedOrderVendorItemId)).append("\n");
    sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
    sb.append("    blinded: ").append(toIndentedString(blinded)).append("\n");
    sb.append("    blindContentName: ").append(toIndentedString(blindContentName)).append("\n");
    sb.append("    blindContentId: ").append(toIndentedString(blindContentId)).append("\n");
    sb.append("    attachmentsBlinded: ").append(toIndentedString(attachmentsBlinded)).append("\n");
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

  public static ProductReviewContentsDtoBuilder builder() {
    return new ProductReviewContentsDtoBuilder();
  }

  public static class ProductReviewContentsDtoBuilder {

    private List<VideoAttachmentDto> videoAttachments = new ArrayList<VideoAttachmentDto>();
    private Long vendorItemId = null;
    private String vendorId = null;
    private Boolean userHelpfulValue = null;
    private Boolean userHelpfulExist = null;
    private ReviewHighlightingDto titleHighlightingDto = null;
    private String title = null;
    private String reviewerRank = null;
    private ReviewerDisplayImageDto reviewerDisplayImage = null;
    private List<ReviewerBadgeDto> reviewerBadges = new ArrayList<ReviewerBadgeDto>();
    private List<ReviewSurveyAnswerDto> reviewSurveyAnswers = new ArrayList<ReviewSurveyAnswerDto>();
    private Long reviewId = null;
    private Date reviewAt = null;
    private Boolean realNameGranted = null;
    private Integer rating = null;
    private Long productId = null;
    private Long orderId = null;
    private MemberInfoDto member = null;
    private String locale = null;
    private String itemName = null;
    private String itemImagePath = null;
    private Long itemId = null;
    private Boolean isMyReview = null;
    private Boolean isBlockMemberReview = null;
    private Boolean isAdventurerReview = null;
    private Integer helpfulTrueCount = null;
    private Integer helpfulFalseCount = null;
    private Integer helpfulCount = null;
    private String gainedScoreText = null;
    private List<String> displayWriterIconUrls = new ArrayList<String>();
    private String displayWriter = null;
    private String displayName = null;
    private Date createdAt = null;
    private ReviewHighlightingDto contentHighlightingDto = null;
    private String content = null;
    private Long completedOrderVendorItemId = null;
    private Integer commentCount = null;
    private Boolean blinded = null;
    private String blindContentName = null;
    private Long blindContentId = null;
    private Boolean attachmentsBlinded = null;
    private List<AttachmentDto> attachments = new ArrayList<AttachmentDto>();
    

    ProductReviewContentsDtoBuilder() {
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder videoAttachments(List<VideoAttachmentDto> videoAttachments) {
      this.videoAttachments = videoAttachments;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder vendorId(String vendorId) {
      this.vendorId = vendorId;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder userHelpfulValue(Boolean userHelpfulValue) {
      this.userHelpfulValue = userHelpfulValue;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder userHelpfulExist(Boolean userHelpfulExist) {
      this.userHelpfulExist = userHelpfulExist;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder titleHighlightingDto(ReviewHighlightingDto titleHighlightingDto) {
      this.titleHighlightingDto = titleHighlightingDto;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder title(String title) {
      this.title = title;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder reviewerRank(String reviewerRank) {
      this.reviewerRank = reviewerRank;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder reviewerDisplayImage(ReviewerDisplayImageDto reviewerDisplayImage) {
      this.reviewerDisplayImage = reviewerDisplayImage;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder reviewerBadges(List<ReviewerBadgeDto> reviewerBadges) {
      this.reviewerBadges = reviewerBadges;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder reviewSurveyAnswers(List<ReviewSurveyAnswerDto> reviewSurveyAnswers) {
      this.reviewSurveyAnswers = reviewSurveyAnswers;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder reviewId(Long reviewId) {
      this.reviewId = reviewId;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder reviewAt(Date reviewAt) {
      this.reviewAt = reviewAt;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder realNameGranted(Boolean realNameGranted) {
      this.realNameGranted = realNameGranted;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder rating(Integer rating) {
      this.rating = rating;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder orderId(Long orderId) {
      this.orderId = orderId;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder member(MemberInfoDto member) {
      this.member = member;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder itemName(String itemName) {
      this.itemName = itemName;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder itemImagePath(String itemImagePath) {
      this.itemImagePath = itemImagePath;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder itemId(Long itemId) {
      this.itemId = itemId;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder isMyReview(Boolean isMyReview) {
      this.isMyReview = isMyReview;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder isBlockMemberReview(Boolean isBlockMemberReview) {
      this.isBlockMemberReview = isBlockMemberReview;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder isAdventurerReview(Boolean isAdventurerReview) {
      this.isAdventurerReview = isAdventurerReview;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder helpfulTrueCount(Integer helpfulTrueCount) {
      this.helpfulTrueCount = helpfulTrueCount;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder helpfulFalseCount(Integer helpfulFalseCount) {
      this.helpfulFalseCount = helpfulFalseCount;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder helpfulCount(Integer helpfulCount) {
      this.helpfulCount = helpfulCount;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder gainedScoreText(String gainedScoreText) {
      this.gainedScoreText = gainedScoreText;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder displayWriterIconUrls(List<String> displayWriterIconUrls) {
      this.displayWriterIconUrls = displayWriterIconUrls;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder displayWriter(String displayWriter) {
      this.displayWriter = displayWriter;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder createdAt(Date createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder contentHighlightingDto(ReviewHighlightingDto contentHighlightingDto) {
      this.contentHighlightingDto = contentHighlightingDto;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder content(String content) {
      this.content = content;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder completedOrderVendorItemId(Long completedOrderVendorItemId) {
      this.completedOrderVendorItemId = completedOrderVendorItemId;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder commentCount(Integer commentCount) {
      this.commentCount = commentCount;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder blinded(Boolean blinded) {
      this.blinded = blinded;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder blindContentName(String blindContentName) {
      this.blindContentName = blindContentName;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder blindContentId(Long blindContentId) {
      this.blindContentId = blindContentId;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder attachmentsBlinded(Boolean attachmentsBlinded) {
      this.attachmentsBlinded = attachmentsBlinded;
      return this;
    }

    /**
     **/
    public ProductReviewContentsDtoBuilder attachments(List<AttachmentDto> attachments) {
      this.attachments = attachments;
      return this;
    }


    public ProductReviewContentsDto build() {
      ProductReviewContentsDto productReviewContentsDto = new ProductReviewContentsDto();
      productReviewContentsDto.setVideoAttachments(this.videoAttachments);
      productReviewContentsDto.setVendorItemId(this.vendorItemId);
      productReviewContentsDto.setVendorId(this.vendorId);
      productReviewContentsDto.setUserHelpfulValue(this.userHelpfulValue);
      productReviewContentsDto.setUserHelpfulExist(this.userHelpfulExist);
      productReviewContentsDto.setTitleHighlightingDto(this.titleHighlightingDto);
      productReviewContentsDto.setTitle(this.title);
      productReviewContentsDto.setReviewerRank(this.reviewerRank);
      productReviewContentsDto.setReviewerDisplayImage(this.reviewerDisplayImage);
      productReviewContentsDto.setReviewerBadges(this.reviewerBadges);
      productReviewContentsDto.setReviewSurveyAnswers(this.reviewSurveyAnswers);
      productReviewContentsDto.setReviewId(this.reviewId);
      productReviewContentsDto.setReviewAt(this.reviewAt);
      productReviewContentsDto.setRealNameGranted(this.realNameGranted);
      productReviewContentsDto.setRating(this.rating);
      productReviewContentsDto.setProductId(this.productId);
      productReviewContentsDto.setOrderId(this.orderId);
      productReviewContentsDto.setMember(this.member);
      productReviewContentsDto.setLocale(this.locale);
      productReviewContentsDto.setItemName(this.itemName);
      productReviewContentsDto.setItemImagePath(this.itemImagePath);
      productReviewContentsDto.setItemId(this.itemId);
      productReviewContentsDto.setIsMyReview(this.isMyReview);
      productReviewContentsDto.setIsBlockMemberReview(this.isBlockMemberReview);
      productReviewContentsDto.setIsAdventurerReview(this.isAdventurerReview);
      productReviewContentsDto.setHelpfulTrueCount(this.helpfulTrueCount);
      productReviewContentsDto.setHelpfulFalseCount(this.helpfulFalseCount);
      productReviewContentsDto.setHelpfulCount(this.helpfulCount);
      productReviewContentsDto.setGainedScoreText(this.gainedScoreText);
      productReviewContentsDto.setDisplayWriterIconUrls(this.displayWriterIconUrls);
      productReviewContentsDto.setDisplayWriter(this.displayWriter);
      productReviewContentsDto.setDisplayName(this.displayName);
      productReviewContentsDto.setCreatedAt(this.createdAt);
      productReviewContentsDto.setContentHighlightingDto(this.contentHighlightingDto);
      productReviewContentsDto.setContent(this.content);
      productReviewContentsDto.setCompletedOrderVendorItemId(this.completedOrderVendorItemId);
      productReviewContentsDto.setCommentCount(this.commentCount);
      productReviewContentsDto.setBlinded(this.blinded);
      productReviewContentsDto.setBlindContentName(this.blindContentName);
      productReviewContentsDto.setBlindContentId(this.blindContentId);
      productReviewContentsDto.setAttachmentsBlinded(this.attachmentsBlinded);
      productReviewContentsDto.setAttachments(this.attachments);
      return productReviewContentsDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ProductReviewContentsDtoBuilder {\n");
      
      sb.append("    videoAttachments: ").append(toIndentedString(videoAttachments)).append("\n");
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    vendorId: ").append(toIndentedString(vendorId)).append("\n");
      sb.append("    userHelpfulValue: ").append(toIndentedString(userHelpfulValue)).append("\n");
      sb.append("    userHelpfulExist: ").append(toIndentedString(userHelpfulExist)).append("\n");
      sb.append("    titleHighlightingDto: ").append(toIndentedString(titleHighlightingDto)).append("\n");
      sb.append("    title: ").append(toIndentedString(title)).append("\n");
      sb.append("    reviewerRank: ").append(toIndentedString(reviewerRank)).append("\n");
      sb.append("    reviewerDisplayImage: ").append(toIndentedString(reviewerDisplayImage)).append("\n");
      sb.append("    reviewerBadges: ").append(toIndentedString(reviewerBadges)).append("\n");
      sb.append("    reviewSurveyAnswers: ").append(toIndentedString(reviewSurveyAnswers)).append("\n");
      sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
      sb.append("    reviewAt: ").append(toIndentedString(reviewAt)).append("\n");
      sb.append("    realNameGranted: ").append(toIndentedString(realNameGranted)).append("\n");
      sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
      sb.append("    member: ").append(toIndentedString(member)).append("\n");
      sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
      sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
      sb.append("    itemImagePath: ").append(toIndentedString(itemImagePath)).append("\n");
      sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
      sb.append("    isMyReview: ").append(toIndentedString(isMyReview)).append("\n");
      sb.append("    isBlockMemberReview: ").append(toIndentedString(isBlockMemberReview)).append("\n");
      sb.append("    isAdventurerReview: ").append(toIndentedString(isAdventurerReview)).append("\n");
      sb.append("    helpfulTrueCount: ").append(toIndentedString(helpfulTrueCount)).append("\n");
      sb.append("    helpfulFalseCount: ").append(toIndentedString(helpfulFalseCount)).append("\n");
      sb.append("    helpfulCount: ").append(toIndentedString(helpfulCount)).append("\n");
      sb.append("    gainedScoreText: ").append(toIndentedString(gainedScoreText)).append("\n");
      sb.append("    displayWriterIconUrls: ").append(toIndentedString(displayWriterIconUrls)).append("\n");
      sb.append("    displayWriter: ").append(toIndentedString(displayWriter)).append("\n");
      sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
      sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
      sb.append("    contentHighlightingDto: ").append(toIndentedString(contentHighlightingDto)).append("\n");
      sb.append("    content: ").append(toIndentedString(content)).append("\n");
      sb.append("    completedOrderVendorItemId: ").append(toIndentedString(completedOrderVendorItemId)).append("\n");
      sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
      sb.append("    blinded: ").append(toIndentedString(blinded)).append("\n");
      sb.append("    blindContentName: ").append(toIndentedString(blindContentName)).append("\n");
      sb.append("    blindContentId: ").append(toIndentedString(blindContentId)).append("\n");
      sb.append("    attachmentsBlinded: ").append(toIndentedString(attachmentsBlinded)).append("\n");
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

