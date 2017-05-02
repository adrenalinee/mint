package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.MemberInfoDto;
import com.coupang.apigateway.services.product_review.model.ReviewerBadgeDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ReviewerDto   {
  
  private Long writableReviewCount = null;
  private Long totalTrueHelpfulCount = null;
  private Long totalHelpfulCount = null;
  private Long totalFalseHelpfulCount = null;
  private String reviewerSettingWebUrl = null;
  private String reviewerRank = null;
  private List<ReviewerBadgeDto> reviewerBadges = new ArrayList<ReviewerBadgeDto>();
  private Long reviewCount = null;
  private Boolean realNameGranted = null;
  private Integer rankingScore = null;
  private Integer ranking = null;
  private String nickName = null;
  private MemberInfoDto member = null;
  private Boolean displayNickName = null;
  private String displayName = null;
  private String displayImageThumbnailPath = null;
  private String displayImageThumbnailHttpsPath = null;
  private Boolean displayImagePrivate = null;
  private String displayImageOriginalPath = null;
  private String displayImageOriginalHttpsPath = null;
  private Boolean displayImageBlinded = null;
  private Boolean adventurerTarget = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("writableReviewCount")
  @com.fasterxml.jackson.annotation.JsonProperty("writableReviewCount")
  public Long getWritableReviewCount() {
    return writableReviewCount;
  }
  
  /**
   **/
  public void setWritableReviewCount(Long writableReviewCount) {
    this.writableReviewCount = writableReviewCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("totalTrueHelpfulCount")
  @com.fasterxml.jackson.annotation.JsonProperty("totalTrueHelpfulCount")
  public Long getTotalTrueHelpfulCount() {
    return totalTrueHelpfulCount;
  }
  
  /**
   **/
  public void setTotalTrueHelpfulCount(Long totalTrueHelpfulCount) {
    this.totalTrueHelpfulCount = totalTrueHelpfulCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("totalHelpfulCount")
  @com.fasterxml.jackson.annotation.JsonProperty("totalHelpfulCount")
  public Long getTotalHelpfulCount() {
    return totalHelpfulCount;
  }
  
  /**
   **/
  public void setTotalHelpfulCount(Long totalHelpfulCount) {
    this.totalHelpfulCount = totalHelpfulCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("totalFalseHelpfulCount")
  @com.fasterxml.jackson.annotation.JsonProperty("totalFalseHelpfulCount")
  public Long getTotalFalseHelpfulCount() {
    return totalFalseHelpfulCount;
  }
  
  /**
   **/
  public void setTotalFalseHelpfulCount(Long totalFalseHelpfulCount) {
    this.totalFalseHelpfulCount = totalFalseHelpfulCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewerSettingWebUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewerSettingWebUrl")
  public String getReviewerSettingWebUrl() {
    return reviewerSettingWebUrl;
  }
  
  /**
   **/
  public void setReviewerSettingWebUrl(String reviewerSettingWebUrl) {
    this.reviewerSettingWebUrl = reviewerSettingWebUrl;
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
  @org.codehaus.jackson.annotate.JsonProperty("reviewCount")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewCount")
  public Long getReviewCount() {
    return reviewCount;
  }
  
  /**
   **/
  public void setReviewCount(Long reviewCount) {
    this.reviewCount = reviewCount;
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
  @org.codehaus.jackson.annotate.JsonProperty("rankingScore")
  @com.fasterxml.jackson.annotation.JsonProperty("rankingScore")
  public Integer getRankingScore() {
    return rankingScore;
  }
  
  /**
   **/
  public void setRankingScore(Integer rankingScore) {
    this.rankingScore = rankingScore;
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
  @org.codehaus.jackson.annotate.JsonProperty("nickName")
  @com.fasterxml.jackson.annotation.JsonProperty("nickName")
  public String getNickName() {
    return nickName;
  }
  
  /**
   **/
  public void setNickName(String nickName) {
    this.nickName = nickName;
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
  @org.codehaus.jackson.annotate.JsonProperty("displayNickName")
  @com.fasterxml.jackson.annotation.JsonProperty("displayNickName")
  public Boolean getDisplayNickName() {
    return displayNickName;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isDisplayNickName() {
    return displayNickName == null ? false : displayNickName;
  }
  
  /**
   **/
  public void setDisplayNickName(Boolean displayNickName) {
    this.displayNickName = displayNickName;
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
  @org.codehaus.jackson.annotate.JsonProperty("displayImageThumbnailPath")
  @com.fasterxml.jackson.annotation.JsonProperty("displayImageThumbnailPath")
  public String getDisplayImageThumbnailPath() {
    return displayImageThumbnailPath;
  }
  
  /**
   **/
  public void setDisplayImageThumbnailPath(String displayImageThumbnailPath) {
    this.displayImageThumbnailPath = displayImageThumbnailPath;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displayImageThumbnailHttpsPath")
  @com.fasterxml.jackson.annotation.JsonProperty("displayImageThumbnailHttpsPath")
  public String getDisplayImageThumbnailHttpsPath() {
    return displayImageThumbnailHttpsPath;
  }
  
  /**
   **/
  public void setDisplayImageThumbnailHttpsPath(String displayImageThumbnailHttpsPath) {
    this.displayImageThumbnailHttpsPath = displayImageThumbnailHttpsPath;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displayImagePrivate")
  @com.fasterxml.jackson.annotation.JsonProperty("displayImagePrivate")
  public Boolean getDisplayImagePrivate() {
    return displayImagePrivate;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isDisplayImagePrivate() {
    return displayImagePrivate == null ? false : displayImagePrivate;
  }
  
  /**
   **/
  public void setDisplayImagePrivate(Boolean displayImagePrivate) {
    this.displayImagePrivate = displayImagePrivate;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displayImageOriginalPath")
  @com.fasterxml.jackson.annotation.JsonProperty("displayImageOriginalPath")
  public String getDisplayImageOriginalPath() {
    return displayImageOriginalPath;
  }
  
  /**
   **/
  public void setDisplayImageOriginalPath(String displayImageOriginalPath) {
    this.displayImageOriginalPath = displayImageOriginalPath;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displayImageOriginalHttpsPath")
  @com.fasterxml.jackson.annotation.JsonProperty("displayImageOriginalHttpsPath")
  public String getDisplayImageOriginalHttpsPath() {
    return displayImageOriginalHttpsPath;
  }
  
  /**
   **/
  public void setDisplayImageOriginalHttpsPath(String displayImageOriginalHttpsPath) {
    this.displayImageOriginalHttpsPath = displayImageOriginalHttpsPath;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("displayImageBlinded")
  @com.fasterxml.jackson.annotation.JsonProperty("displayImageBlinded")
  public Boolean getDisplayImageBlinded() {
    return displayImageBlinded;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isDisplayImageBlinded() {
    return displayImageBlinded == null ? false : displayImageBlinded;
  }
  
  /**
   **/
  public void setDisplayImageBlinded(Boolean displayImageBlinded) {
    this.displayImageBlinded = displayImageBlinded;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("adventurerTarget")
  @com.fasterxml.jackson.annotation.JsonProperty("adventurerTarget")
  public Boolean getAdventurerTarget() {
    return adventurerTarget;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isAdventurerTarget() {
    return adventurerTarget == null ? false : adventurerTarget;
  }
  
  /**
   **/
  public void setAdventurerTarget(Boolean adventurerTarget) {
    this.adventurerTarget = adventurerTarget;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReviewerDto reviewerDto = (ReviewerDto) o;
    return Objects.equals(this.writableReviewCount, reviewerDto.writableReviewCount) &&
        Objects.equals(this.totalTrueHelpfulCount, reviewerDto.totalTrueHelpfulCount) &&
        Objects.equals(this.totalHelpfulCount, reviewerDto.totalHelpfulCount) &&
        Objects.equals(this.totalFalseHelpfulCount, reviewerDto.totalFalseHelpfulCount) &&
        Objects.equals(this.reviewerSettingWebUrl, reviewerDto.reviewerSettingWebUrl) &&
        Objects.equals(this.reviewerRank, reviewerDto.reviewerRank) &&
        Objects.equals(this.reviewerBadges, reviewerDto.reviewerBadges) &&
        Objects.equals(this.reviewCount, reviewerDto.reviewCount) &&
        Objects.equals(this.realNameGranted, reviewerDto.realNameGranted) &&
        Objects.equals(this.rankingScore, reviewerDto.rankingScore) &&
        Objects.equals(this.ranking, reviewerDto.ranking) &&
        Objects.equals(this.nickName, reviewerDto.nickName) &&
        Objects.equals(this.member, reviewerDto.member) &&
        Objects.equals(this.displayNickName, reviewerDto.displayNickName) &&
        Objects.equals(this.displayName, reviewerDto.displayName) &&
        Objects.equals(this.displayImageThumbnailPath, reviewerDto.displayImageThumbnailPath) &&
        Objects.equals(this.displayImageThumbnailHttpsPath, reviewerDto.displayImageThumbnailHttpsPath) &&
        Objects.equals(this.displayImagePrivate, reviewerDto.displayImagePrivate) &&
        Objects.equals(this.displayImageOriginalPath, reviewerDto.displayImageOriginalPath) &&
        Objects.equals(this.displayImageOriginalHttpsPath, reviewerDto.displayImageOriginalHttpsPath) &&
        Objects.equals(this.displayImageBlinded, reviewerDto.displayImageBlinded) &&
        Objects.equals(this.adventurerTarget, reviewerDto.adventurerTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(writableReviewCount, totalTrueHelpfulCount, totalHelpfulCount, totalFalseHelpfulCount, reviewerSettingWebUrl, reviewerRank, reviewerBadges, reviewCount, realNameGranted, rankingScore, ranking, nickName, member, displayNickName, displayName, displayImageThumbnailPath, displayImageThumbnailHttpsPath, displayImagePrivate, displayImageOriginalPath, displayImageOriginalHttpsPath, displayImageBlinded, adventurerTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewerDto {\n");
    
    sb.append("    writableReviewCount: ").append(toIndentedString(writableReviewCount)).append("\n");
    sb.append("    totalTrueHelpfulCount: ").append(toIndentedString(totalTrueHelpfulCount)).append("\n");
    sb.append("    totalHelpfulCount: ").append(toIndentedString(totalHelpfulCount)).append("\n");
    sb.append("    totalFalseHelpfulCount: ").append(toIndentedString(totalFalseHelpfulCount)).append("\n");
    sb.append("    reviewerSettingWebUrl: ").append(toIndentedString(reviewerSettingWebUrl)).append("\n");
    sb.append("    reviewerRank: ").append(toIndentedString(reviewerRank)).append("\n");
    sb.append("    reviewerBadges: ").append(toIndentedString(reviewerBadges)).append("\n");
    sb.append("    reviewCount: ").append(toIndentedString(reviewCount)).append("\n");
    sb.append("    realNameGranted: ").append(toIndentedString(realNameGranted)).append("\n");
    sb.append("    rankingScore: ").append(toIndentedString(rankingScore)).append("\n");
    sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    displayNickName: ").append(toIndentedString(displayNickName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    displayImageThumbnailPath: ").append(toIndentedString(displayImageThumbnailPath)).append("\n");
    sb.append("    displayImageThumbnailHttpsPath: ").append(toIndentedString(displayImageThumbnailHttpsPath)).append("\n");
    sb.append("    displayImagePrivate: ").append(toIndentedString(displayImagePrivate)).append("\n");
    sb.append("    displayImageOriginalPath: ").append(toIndentedString(displayImageOriginalPath)).append("\n");
    sb.append("    displayImageOriginalHttpsPath: ").append(toIndentedString(displayImageOriginalHttpsPath)).append("\n");
    sb.append("    displayImageBlinded: ").append(toIndentedString(displayImageBlinded)).append("\n");
    sb.append("    adventurerTarget: ").append(toIndentedString(adventurerTarget)).append("\n");
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

  public static ReviewerDtoBuilder builder() {
    return new ReviewerDtoBuilder();
  }

  public static class ReviewerDtoBuilder {

    private Long writableReviewCount = null;
    private Long totalTrueHelpfulCount = null;
    private Long totalHelpfulCount = null;
    private Long totalFalseHelpfulCount = null;
    private String reviewerSettingWebUrl = null;
    private String reviewerRank = null;
    private List<ReviewerBadgeDto> reviewerBadges = new ArrayList<ReviewerBadgeDto>();
    private Long reviewCount = null;
    private Boolean realNameGranted = null;
    private Integer rankingScore = null;
    private Integer ranking = null;
    private String nickName = null;
    private MemberInfoDto member = null;
    private Boolean displayNickName = null;
    private String displayName = null;
    private String displayImageThumbnailPath = null;
    private String displayImageThumbnailHttpsPath = null;
    private Boolean displayImagePrivate = null;
    private String displayImageOriginalPath = null;
    private String displayImageOriginalHttpsPath = null;
    private Boolean displayImageBlinded = null;
    private Boolean adventurerTarget = null;
    

    ReviewerDtoBuilder() {
    }

    /**
     **/
    public ReviewerDtoBuilder writableReviewCount(Long writableReviewCount) {
      this.writableReviewCount = writableReviewCount;
      return this;
    }

    /**
     **/
    public ReviewerDtoBuilder totalTrueHelpfulCount(Long totalTrueHelpfulCount) {
      this.totalTrueHelpfulCount = totalTrueHelpfulCount;
      return this;
    }

    /**
     **/
    public ReviewerDtoBuilder totalHelpfulCount(Long totalHelpfulCount) {
      this.totalHelpfulCount = totalHelpfulCount;
      return this;
    }

    /**
     **/
    public ReviewerDtoBuilder totalFalseHelpfulCount(Long totalFalseHelpfulCount) {
      this.totalFalseHelpfulCount = totalFalseHelpfulCount;
      return this;
    }

    /**
     **/
    public ReviewerDtoBuilder reviewerSettingWebUrl(String reviewerSettingWebUrl) {
      this.reviewerSettingWebUrl = reviewerSettingWebUrl;
      return this;
    }

    /**
     **/
    public ReviewerDtoBuilder reviewerRank(String reviewerRank) {
      this.reviewerRank = reviewerRank;
      return this;
    }

    /**
     **/
    public ReviewerDtoBuilder reviewerBadges(List<ReviewerBadgeDto> reviewerBadges) {
      this.reviewerBadges = reviewerBadges;
      return this;
    }

    /**
     **/
    public ReviewerDtoBuilder reviewCount(Long reviewCount) {
      this.reviewCount = reviewCount;
      return this;
    }

    /**
     **/
    public ReviewerDtoBuilder realNameGranted(Boolean realNameGranted) {
      this.realNameGranted = realNameGranted;
      return this;
    }

    /**
     **/
    public ReviewerDtoBuilder rankingScore(Integer rankingScore) {
      this.rankingScore = rankingScore;
      return this;
    }

    /**
     **/
    public ReviewerDtoBuilder ranking(Integer ranking) {
      this.ranking = ranking;
      return this;
    }

    /**
     **/
    public ReviewerDtoBuilder nickName(String nickName) {
      this.nickName = nickName;
      return this;
    }

    /**
     **/
    public ReviewerDtoBuilder member(MemberInfoDto member) {
      this.member = member;
      return this;
    }

    /**
     **/
    public ReviewerDtoBuilder displayNickName(Boolean displayNickName) {
      this.displayNickName = displayNickName;
      return this;
    }

    /**
     **/
    public ReviewerDtoBuilder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     **/
    public ReviewerDtoBuilder displayImageThumbnailPath(String displayImageThumbnailPath) {
      this.displayImageThumbnailPath = displayImageThumbnailPath;
      return this;
    }

    /**
     **/
    public ReviewerDtoBuilder displayImageThumbnailHttpsPath(String displayImageThumbnailHttpsPath) {
      this.displayImageThumbnailHttpsPath = displayImageThumbnailHttpsPath;
      return this;
    }

    /**
     **/
    public ReviewerDtoBuilder displayImagePrivate(Boolean displayImagePrivate) {
      this.displayImagePrivate = displayImagePrivate;
      return this;
    }

    /**
     **/
    public ReviewerDtoBuilder displayImageOriginalPath(String displayImageOriginalPath) {
      this.displayImageOriginalPath = displayImageOriginalPath;
      return this;
    }

    /**
     **/
    public ReviewerDtoBuilder displayImageOriginalHttpsPath(String displayImageOriginalHttpsPath) {
      this.displayImageOriginalHttpsPath = displayImageOriginalHttpsPath;
      return this;
    }

    /**
     **/
    public ReviewerDtoBuilder displayImageBlinded(Boolean displayImageBlinded) {
      this.displayImageBlinded = displayImageBlinded;
      return this;
    }

    /**
     **/
    public ReviewerDtoBuilder adventurerTarget(Boolean adventurerTarget) {
      this.adventurerTarget = adventurerTarget;
      return this;
    }


    public ReviewerDto build() {
      ReviewerDto reviewerDto = new ReviewerDto();
      reviewerDto.setWritableReviewCount(this.writableReviewCount);
      reviewerDto.setTotalTrueHelpfulCount(this.totalTrueHelpfulCount);
      reviewerDto.setTotalHelpfulCount(this.totalHelpfulCount);
      reviewerDto.setTotalFalseHelpfulCount(this.totalFalseHelpfulCount);
      reviewerDto.setReviewerSettingWebUrl(this.reviewerSettingWebUrl);
      reviewerDto.setReviewerRank(this.reviewerRank);
      reviewerDto.setReviewerBadges(this.reviewerBadges);
      reviewerDto.setReviewCount(this.reviewCount);
      reviewerDto.setRealNameGranted(this.realNameGranted);
      reviewerDto.setRankingScore(this.rankingScore);
      reviewerDto.setRanking(this.ranking);
      reviewerDto.setNickName(this.nickName);
      reviewerDto.setMember(this.member);
      reviewerDto.setDisplayNickName(this.displayNickName);
      reviewerDto.setDisplayName(this.displayName);
      reviewerDto.setDisplayImageThumbnailPath(this.displayImageThumbnailPath);
      reviewerDto.setDisplayImageThumbnailHttpsPath(this.displayImageThumbnailHttpsPath);
      reviewerDto.setDisplayImagePrivate(this.displayImagePrivate);
      reviewerDto.setDisplayImageOriginalPath(this.displayImageOriginalPath);
      reviewerDto.setDisplayImageOriginalHttpsPath(this.displayImageOriginalHttpsPath);
      reviewerDto.setDisplayImageBlinded(this.displayImageBlinded);
      reviewerDto.setAdventurerTarget(this.adventurerTarget);
      return reviewerDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReviewerDtoBuilder {\n");
      
      sb.append("    writableReviewCount: ").append(toIndentedString(writableReviewCount)).append("\n");
      sb.append("    totalTrueHelpfulCount: ").append(toIndentedString(totalTrueHelpfulCount)).append("\n");
      sb.append("    totalHelpfulCount: ").append(toIndentedString(totalHelpfulCount)).append("\n");
      sb.append("    totalFalseHelpfulCount: ").append(toIndentedString(totalFalseHelpfulCount)).append("\n");
      sb.append("    reviewerSettingWebUrl: ").append(toIndentedString(reviewerSettingWebUrl)).append("\n");
      sb.append("    reviewerRank: ").append(toIndentedString(reviewerRank)).append("\n");
      sb.append("    reviewerBadges: ").append(toIndentedString(reviewerBadges)).append("\n");
      sb.append("    reviewCount: ").append(toIndentedString(reviewCount)).append("\n");
      sb.append("    realNameGranted: ").append(toIndentedString(realNameGranted)).append("\n");
      sb.append("    rankingScore: ").append(toIndentedString(rankingScore)).append("\n");
      sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
      sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
      sb.append("    member: ").append(toIndentedString(member)).append("\n");
      sb.append("    displayNickName: ").append(toIndentedString(displayNickName)).append("\n");
      sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
      sb.append("    displayImageThumbnailPath: ").append(toIndentedString(displayImageThumbnailPath)).append("\n");
      sb.append("    displayImageThumbnailHttpsPath: ").append(toIndentedString(displayImageThumbnailHttpsPath)).append("\n");
      sb.append("    displayImagePrivate: ").append(toIndentedString(displayImagePrivate)).append("\n");
      sb.append("    displayImageOriginalPath: ").append(toIndentedString(displayImageOriginalPath)).append("\n");
      sb.append("    displayImageOriginalHttpsPath: ").append(toIndentedString(displayImageOriginalHttpsPath)).append("\n");
      sb.append("    displayImageBlinded: ").append(toIndentedString(displayImageBlinded)).append("\n");
      sb.append("    adventurerTarget: ").append(toIndentedString(adventurerTarget)).append("\n");
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

