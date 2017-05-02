package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.MemberInfoDto;
import com.coupang.apigateway.services.product_review.model.ReviewerDisplayImageDto;
import java.util.*;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ReviewCommentDto   {
  
  private ReviewerDisplayImageDto reviewerDisplayImage = null;
  private Long reviewId = null;
  private Long reviewCommentId = null;
  private MemberInfoDto member = null;
  private Boolean isMyComment = null;
  private String gainedScoreText = null;
  private List<String> displayWriterIcon = new ArrayList<String>();
  private String displayWriter = null;
  private String displayName = null;
  private Date createdAt = null;
  private String content = null;
  private Date commentAt = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("reviewCommentId")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewCommentId")
  public Long getReviewCommentId() {
    return reviewCommentId;
  }
  
  /**
   **/
  public void setReviewCommentId(Long reviewCommentId) {
    this.reviewCommentId = reviewCommentId;
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
  @org.codehaus.jackson.annotate.JsonProperty("isMyComment")
  @com.fasterxml.jackson.annotation.JsonProperty("isMyComment")
  public Boolean getIsMyComment() {
    return isMyComment;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isIsMyComment() {
    return isMyComment == null ? false : isMyComment;
  }
  
  /**
   **/
  public void setIsMyComment(Boolean isMyComment) {
    this.isMyComment = isMyComment;
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
  @org.codehaus.jackson.annotate.JsonProperty("displayWriterIcon")
  @com.fasterxml.jackson.annotation.JsonProperty("displayWriterIcon")
  public List<String> getDisplayWriterIcon() {
    return displayWriterIcon;
  }
  
  /**
   **/
  public void setDisplayWriterIcon(List<String> displayWriterIcon) {
    this.displayWriterIcon = displayWriterIcon;
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
  @org.codehaus.jackson.annotate.JsonProperty("commentAt")
  @com.fasterxml.jackson.annotation.JsonProperty("commentAt")
  public Date getCommentAt() {
    return commentAt;
  }
  
  /**
   **/
  public void setCommentAt(Date commentAt) {
    this.commentAt = commentAt;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewCommentDto reviewCommentDto = (ReviewCommentDto) o;
    return Objects.equals(this.reviewerDisplayImage, reviewCommentDto.reviewerDisplayImage) &&
        Objects.equals(this.reviewId, reviewCommentDto.reviewId) &&
        Objects.equals(this.reviewCommentId, reviewCommentDto.reviewCommentId) &&
        Objects.equals(this.member, reviewCommentDto.member) &&
        Objects.equals(this.isMyComment, reviewCommentDto.isMyComment) &&
        Objects.equals(this.gainedScoreText, reviewCommentDto.gainedScoreText) &&
        Objects.equals(this.displayWriterIcon, reviewCommentDto.displayWriterIcon) &&
        Objects.equals(this.displayWriter, reviewCommentDto.displayWriter) &&
        Objects.equals(this.displayName, reviewCommentDto.displayName) &&
        Objects.equals(this.createdAt, reviewCommentDto.createdAt) &&
        Objects.equals(this.content, reviewCommentDto.content) &&
        Objects.equals(this.commentAt, reviewCommentDto.commentAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewerDisplayImage, reviewId, reviewCommentId, member, isMyComment, gainedScoreText, displayWriterIcon, displayWriter, displayName, createdAt, content, commentAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewCommentDto {\n");
    
    sb.append("    reviewerDisplayImage: ").append(toIndentedString(reviewerDisplayImage)).append("\n");
    sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
    sb.append("    reviewCommentId: ").append(toIndentedString(reviewCommentId)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    isMyComment: ").append(toIndentedString(isMyComment)).append("\n");
    sb.append("    gainedScoreText: ").append(toIndentedString(gainedScoreText)).append("\n");
    sb.append("    displayWriterIcon: ").append(toIndentedString(displayWriterIcon)).append("\n");
    sb.append("    displayWriter: ").append(toIndentedString(displayWriter)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    commentAt: ").append(toIndentedString(commentAt)).append("\n");
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

  public static ReviewCommentDtoBuilder builder() {
    return new ReviewCommentDtoBuilder();
  }

  public static class ReviewCommentDtoBuilder {

    private ReviewerDisplayImageDto reviewerDisplayImage = null;
    private Long reviewId = null;
    private Long reviewCommentId = null;
    private MemberInfoDto member = null;
    private Boolean isMyComment = null;
    private String gainedScoreText = null;
    private List<String> displayWriterIcon = new ArrayList<String>();
    private String displayWriter = null;
    private String displayName = null;
    private Date createdAt = null;
    private String content = null;
    private Date commentAt = null;
    

    ReviewCommentDtoBuilder() {
    }

    /**
     **/
    public ReviewCommentDtoBuilder reviewerDisplayImage(ReviewerDisplayImageDto reviewerDisplayImage) {
      this.reviewerDisplayImage = reviewerDisplayImage;
      return this;
    }

    /**
     **/
    public ReviewCommentDtoBuilder reviewId(Long reviewId) {
      this.reviewId = reviewId;
      return this;
    }

    /**
     **/
    public ReviewCommentDtoBuilder reviewCommentId(Long reviewCommentId) {
      this.reviewCommentId = reviewCommentId;
      return this;
    }

    /**
     **/
    public ReviewCommentDtoBuilder member(MemberInfoDto member) {
      this.member = member;
      return this;
    }

    /**
     **/
    public ReviewCommentDtoBuilder isMyComment(Boolean isMyComment) {
      this.isMyComment = isMyComment;
      return this;
    }

    /**
     **/
    public ReviewCommentDtoBuilder gainedScoreText(String gainedScoreText) {
      this.gainedScoreText = gainedScoreText;
      return this;
    }

    /**
     **/
    public ReviewCommentDtoBuilder displayWriterIcon(List<String> displayWriterIcon) {
      this.displayWriterIcon = displayWriterIcon;
      return this;
    }

    /**
     **/
    public ReviewCommentDtoBuilder displayWriter(String displayWriter) {
      this.displayWriter = displayWriter;
      return this;
    }

    /**
     **/
    public ReviewCommentDtoBuilder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     **/
    public ReviewCommentDtoBuilder createdAt(Date createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     **/
    public ReviewCommentDtoBuilder content(String content) {
      this.content = content;
      return this;
    }

    /**
     **/
    public ReviewCommentDtoBuilder commentAt(Date commentAt) {
      this.commentAt = commentAt;
      return this;
    }


    public ReviewCommentDto build() {
      ReviewCommentDto reviewCommentDto = new ReviewCommentDto();
      reviewCommentDto.setReviewerDisplayImage(this.reviewerDisplayImage);
      reviewCommentDto.setReviewId(this.reviewId);
      reviewCommentDto.setReviewCommentId(this.reviewCommentId);
      reviewCommentDto.setMember(this.member);
      reviewCommentDto.setIsMyComment(this.isMyComment);
      reviewCommentDto.setGainedScoreText(this.gainedScoreText);
      reviewCommentDto.setDisplayWriterIcon(this.displayWriterIcon);
      reviewCommentDto.setDisplayWriter(this.displayWriter);
      reviewCommentDto.setDisplayName(this.displayName);
      reviewCommentDto.setCreatedAt(this.createdAt);
      reviewCommentDto.setContent(this.content);
      reviewCommentDto.setCommentAt(this.commentAt);
      return reviewCommentDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReviewCommentDtoBuilder {\n");
      
      sb.append("    reviewerDisplayImage: ").append(toIndentedString(reviewerDisplayImage)).append("\n");
      sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
      sb.append("    reviewCommentId: ").append(toIndentedString(reviewCommentId)).append("\n");
      sb.append("    member: ").append(toIndentedString(member)).append("\n");
      sb.append("    isMyComment: ").append(toIndentedString(isMyComment)).append("\n");
      sb.append("    gainedScoreText: ").append(toIndentedString(gainedScoreText)).append("\n");
      sb.append("    displayWriterIcon: ").append(toIndentedString(displayWriterIcon)).append("\n");
      sb.append("    displayWriter: ").append(toIndentedString(displayWriter)).append("\n");
      sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
      sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
      sb.append("    content: ").append(toIndentedString(content)).append("\n");
      sb.append("    commentAt: ").append(toIndentedString(commentAt)).append("\n");
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

