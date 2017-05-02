package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ReviewerBadgeDto   {
  
  private String reviewerBadgeType = null;
  private Integer ranking = null;
  private String badgeTitle = null;
  private Integer badgeImageWidth = null;
  private String badgeImagePath = null;
  private Integer badgeImageHeight = null;
  private String badgeIconPath = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewerBadgeType")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewerBadgeType")
  public String getReviewerBadgeType() {
    return reviewerBadgeType;
  }
  
  /**
   **/
  public void setReviewerBadgeType(String reviewerBadgeType) {
    this.reviewerBadgeType = reviewerBadgeType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("ranking")
  @com.fasterxml.jackson.annotation.JsonProperty("ranking")
  public Integer getRanking() {
    return ranking;
  }
  
  /**
   **/
  public void setRanking(Integer ranking) {
    this.ranking = ranking;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("badgeTitle")
  @com.fasterxml.jackson.annotation.JsonProperty("badgeTitle")
  public String getBadgeTitle() {
    return badgeTitle;
  }
  
  /**
   **/
  public void setBadgeTitle(String badgeTitle) {
    this.badgeTitle = badgeTitle;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("badgeImageWidth")
  @com.fasterxml.jackson.annotation.JsonProperty("badgeImageWidth")
  public Integer getBadgeImageWidth() {
    return badgeImageWidth;
  }
  
  /**
   **/
  public void setBadgeImageWidth(Integer badgeImageWidth) {
    this.badgeImageWidth = badgeImageWidth;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("badgeImagePath")
  @com.fasterxml.jackson.annotation.JsonProperty("badgeImagePath")
  public String getBadgeImagePath() {
    return badgeImagePath;
  }
  
  /**
   **/
  public void setBadgeImagePath(String badgeImagePath) {
    this.badgeImagePath = badgeImagePath;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("badgeImageHeight")
  @com.fasterxml.jackson.annotation.JsonProperty("badgeImageHeight")
  public Integer getBadgeImageHeight() {
    return badgeImageHeight;
  }
  
  /**
   **/
  public void setBadgeImageHeight(Integer badgeImageHeight) {
    this.badgeImageHeight = badgeImageHeight;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("badgeIconPath")
  @com.fasterxml.jackson.annotation.JsonProperty("badgeIconPath")
  public String getBadgeIconPath() {
    return badgeIconPath;
  }
  
  /**
   **/
  public void setBadgeIconPath(String badgeIconPath) {
    this.badgeIconPath = badgeIconPath;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewerBadgeDto reviewerBadgeDto = (ReviewerBadgeDto) o;
    return Objects.equals(this.reviewerBadgeType, reviewerBadgeDto.reviewerBadgeType) &&
        Objects.equals(this.ranking, reviewerBadgeDto.ranking) &&
        Objects.equals(this.badgeTitle, reviewerBadgeDto.badgeTitle) &&
        Objects.equals(this.badgeImageWidth, reviewerBadgeDto.badgeImageWidth) &&
        Objects.equals(this.badgeImagePath, reviewerBadgeDto.badgeImagePath) &&
        Objects.equals(this.badgeImageHeight, reviewerBadgeDto.badgeImageHeight) &&
        Objects.equals(this.badgeIconPath, reviewerBadgeDto.badgeIconPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewerBadgeType, ranking, badgeTitle, badgeImageWidth, badgeImagePath, badgeImageHeight, badgeIconPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewerBadgeDto {\n");
    
    sb.append("    reviewerBadgeType: ").append(toIndentedString(reviewerBadgeType)).append("\n");
    sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
    sb.append("    badgeTitle: ").append(toIndentedString(badgeTitle)).append("\n");
    sb.append("    badgeImageWidth: ").append(toIndentedString(badgeImageWidth)).append("\n");
    sb.append("    badgeImagePath: ").append(toIndentedString(badgeImagePath)).append("\n");
    sb.append("    badgeImageHeight: ").append(toIndentedString(badgeImageHeight)).append("\n");
    sb.append("    badgeIconPath: ").append(toIndentedString(badgeIconPath)).append("\n");
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

  public static ReviewerBadgeDtoBuilder builder() {
    return new ReviewerBadgeDtoBuilder();
  }

  public static class ReviewerBadgeDtoBuilder {

    private String reviewerBadgeType = null;
    private Integer ranking = null;
    private String badgeTitle = null;
    private Integer badgeImageWidth = null;
    private String badgeImagePath = null;
    private Integer badgeImageHeight = null;
    private String badgeIconPath = null;
    

    ReviewerBadgeDtoBuilder() {
    }

    /**
     **/
    public ReviewerBadgeDtoBuilder reviewerBadgeType(String reviewerBadgeType) {
      this.reviewerBadgeType = reviewerBadgeType;
      return this;
    }

    /**
     **/
    public ReviewerBadgeDtoBuilder ranking(Integer ranking) {
      this.ranking = ranking;
      return this;
    }

    /**
     **/
    public ReviewerBadgeDtoBuilder badgeTitle(String badgeTitle) {
      this.badgeTitle = badgeTitle;
      return this;
    }

    /**
     **/
    public ReviewerBadgeDtoBuilder badgeImageWidth(Integer badgeImageWidth) {
      this.badgeImageWidth = badgeImageWidth;
      return this;
    }

    /**
     **/
    public ReviewerBadgeDtoBuilder badgeImagePath(String badgeImagePath) {
      this.badgeImagePath = badgeImagePath;
      return this;
    }

    /**
     **/
    public ReviewerBadgeDtoBuilder badgeImageHeight(Integer badgeImageHeight) {
      this.badgeImageHeight = badgeImageHeight;
      return this;
    }

    /**
     **/
    public ReviewerBadgeDtoBuilder badgeIconPath(String badgeIconPath) {
      this.badgeIconPath = badgeIconPath;
      return this;
    }


    public ReviewerBadgeDto build() {
      ReviewerBadgeDto reviewerBadgeDto = new ReviewerBadgeDto();
      reviewerBadgeDto.setReviewerBadgeType(this.reviewerBadgeType);
      reviewerBadgeDto.setRanking(this.ranking);
      reviewerBadgeDto.setBadgeTitle(this.badgeTitle);
      reviewerBadgeDto.setBadgeImageWidth(this.badgeImageWidth);
      reviewerBadgeDto.setBadgeImagePath(this.badgeImagePath);
      reviewerBadgeDto.setBadgeImageHeight(this.badgeImageHeight);
      reviewerBadgeDto.setBadgeIconPath(this.badgeIconPath);
      return reviewerBadgeDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReviewerBadgeDtoBuilder {\n");
      
      sb.append("    reviewerBadgeType: ").append(toIndentedString(reviewerBadgeType)).append("\n");
      sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
      sb.append("    badgeTitle: ").append(toIndentedString(badgeTitle)).append("\n");
      sb.append("    badgeImageWidth: ").append(toIndentedString(badgeImageWidth)).append("\n");
      sb.append("    badgeImagePath: ").append(toIndentedString(badgeImagePath)).append("\n");
      sb.append("    badgeImageHeight: ").append(toIndentedString(badgeImageHeight)).append("\n");
      sb.append("    badgeIconPath: ").append(toIndentedString(badgeIconPath)).append("\n");
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

