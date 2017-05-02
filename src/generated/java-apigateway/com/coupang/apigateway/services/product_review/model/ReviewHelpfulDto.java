package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.MemberInfoDto;
import java.util.Date;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ReviewHelpfulDto   {
  
  private Long reviewId = null;
  private Long reviewHelpfulId = null;
  private Date modifiedAt = null;
  private MemberInfoDto member = null;
  private Boolean helpful = null;
  private String gainedScoreText = null;
  private String createdBy = null;
  private Date createdAt = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("reviewHelpfulId")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewHelpfulId")
  public Long getReviewHelpfulId() {
    return reviewHelpfulId;
  }
  
  /**
   **/
  public void setReviewHelpfulId(Long reviewHelpfulId) {
    this.reviewHelpfulId = reviewHelpfulId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("modifiedAt")
  @com.fasterxml.jackson.annotation.JsonProperty("modifiedAt")
  public Date getModifiedAt() {
    return modifiedAt;
  }
  
  /**
   **/
  public void setModifiedAt(Date modifiedAt) {
    this.modifiedAt = modifiedAt;
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
  @org.codehaus.jackson.annotate.JsonProperty("helpful")
  @com.fasterxml.jackson.annotation.JsonProperty("helpful")
  public Boolean getHelpful() {
    return helpful;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isHelpful() {
    return helpful == null ? false : helpful;
  }
  
  /**
   **/
  public void setHelpful(Boolean helpful) {
    this.helpful = helpful;
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
  @org.codehaus.jackson.annotate.JsonProperty("createdBy")
  @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }
  
  /**
   **/
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewHelpfulDto reviewHelpfulDto = (ReviewHelpfulDto) o;
    return Objects.equals(this.reviewId, reviewHelpfulDto.reviewId) &&
        Objects.equals(this.reviewHelpfulId, reviewHelpfulDto.reviewHelpfulId) &&
        Objects.equals(this.modifiedAt, reviewHelpfulDto.modifiedAt) &&
        Objects.equals(this.member, reviewHelpfulDto.member) &&
        Objects.equals(this.helpful, reviewHelpfulDto.helpful) &&
        Objects.equals(this.gainedScoreText, reviewHelpfulDto.gainedScoreText) &&
        Objects.equals(this.createdBy, reviewHelpfulDto.createdBy) &&
        Objects.equals(this.createdAt, reviewHelpfulDto.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewId, reviewHelpfulId, modifiedAt, member, helpful, gainedScoreText, createdBy, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewHelpfulDto {\n");
    
    sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
    sb.append("    reviewHelpfulId: ").append(toIndentedString(reviewHelpfulId)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    helpful: ").append(toIndentedString(helpful)).append("\n");
    sb.append("    gainedScoreText: ").append(toIndentedString(gainedScoreText)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

  public static ReviewHelpfulDtoBuilder builder() {
    return new ReviewHelpfulDtoBuilder();
  }

  public static class ReviewHelpfulDtoBuilder {

    private Long reviewId = null;
    private Long reviewHelpfulId = null;
    private Date modifiedAt = null;
    private MemberInfoDto member = null;
    private Boolean helpful = null;
    private String gainedScoreText = null;
    private String createdBy = null;
    private Date createdAt = null;
    

    ReviewHelpfulDtoBuilder() {
    }

    /**
     **/
    public ReviewHelpfulDtoBuilder reviewId(Long reviewId) {
      this.reviewId = reviewId;
      return this;
    }

    /**
     **/
    public ReviewHelpfulDtoBuilder reviewHelpfulId(Long reviewHelpfulId) {
      this.reviewHelpfulId = reviewHelpfulId;
      return this;
    }

    /**
     **/
    public ReviewHelpfulDtoBuilder modifiedAt(Date modifiedAt) {
      this.modifiedAt = modifiedAt;
      return this;
    }

    /**
     **/
    public ReviewHelpfulDtoBuilder member(MemberInfoDto member) {
      this.member = member;
      return this;
    }

    /**
     **/
    public ReviewHelpfulDtoBuilder helpful(Boolean helpful) {
      this.helpful = helpful;
      return this;
    }

    /**
     **/
    public ReviewHelpfulDtoBuilder gainedScoreText(String gainedScoreText) {
      this.gainedScoreText = gainedScoreText;
      return this;
    }

    /**
     **/
    public ReviewHelpfulDtoBuilder createdBy(String createdBy) {
      this.createdBy = createdBy;
      return this;
    }

    /**
     **/
    public ReviewHelpfulDtoBuilder createdAt(Date createdAt) {
      this.createdAt = createdAt;
      return this;
    }


    public ReviewHelpfulDto build() {
      ReviewHelpfulDto reviewHelpfulDto = new ReviewHelpfulDto();
      reviewHelpfulDto.setReviewId(this.reviewId);
      reviewHelpfulDto.setReviewHelpfulId(this.reviewHelpfulId);
      reviewHelpfulDto.setModifiedAt(this.modifiedAt);
      reviewHelpfulDto.setMember(this.member);
      reviewHelpfulDto.setHelpful(this.helpful);
      reviewHelpfulDto.setGainedScoreText(this.gainedScoreText);
      reviewHelpfulDto.setCreatedBy(this.createdBy);
      reviewHelpfulDto.setCreatedAt(this.createdAt);
      return reviewHelpfulDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReviewHelpfulDtoBuilder {\n");
      
      sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
      sb.append("    reviewHelpfulId: ").append(toIndentedString(reviewHelpfulId)).append("\n");
      sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
      sb.append("    member: ").append(toIndentedString(member)).append("\n");
      sb.append("    helpful: ").append(toIndentedString(helpful)).append("\n");
      sb.append("    gainedScoreText: ").append(toIndentedString(gainedScoreText)).append("\n");
      sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
      sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

