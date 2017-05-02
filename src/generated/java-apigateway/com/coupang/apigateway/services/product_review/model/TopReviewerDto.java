package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.MemberInfoDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class TopReviewerDto   {
  
  private Long totalTrueHelpfulCount = null;
  private Long totalReviewCount = null;
  private Long totalHelpfulCount = null;
  private Long totalFalseHelpfulCount = null;
  private String reviewerRank = null;
  private Integer rankingScore = null;
  private Integer ranking = null;
  private MemberInfoDto member = null;
  private String displayName = null;
  private String displayImageThumbnailPath = null;
  private String displayImageThumbnailHttpsPath = null;
  private String displayImageOriginalPath = null;
  private String displayImageOriginalHttpsPath = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("totalReviewCount")
  @com.fasterxml.jackson.annotation.JsonProperty("totalReviewCount")
  public Long getTotalReviewCount() {
    return totalReviewCount;
  }
  
  /**
   **/
  public void setTotalReviewCount(Long totalReviewCount) {
    this.totalReviewCount = totalReviewCount;
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopReviewerDto topReviewerDto = (TopReviewerDto) o;
    return Objects.equals(this.totalTrueHelpfulCount, topReviewerDto.totalTrueHelpfulCount) &&
        Objects.equals(this.totalReviewCount, topReviewerDto.totalReviewCount) &&
        Objects.equals(this.totalHelpfulCount, topReviewerDto.totalHelpfulCount) &&
        Objects.equals(this.totalFalseHelpfulCount, topReviewerDto.totalFalseHelpfulCount) &&
        Objects.equals(this.reviewerRank, topReviewerDto.reviewerRank) &&
        Objects.equals(this.rankingScore, topReviewerDto.rankingScore) &&
        Objects.equals(this.ranking, topReviewerDto.ranking) &&
        Objects.equals(this.member, topReviewerDto.member) &&
        Objects.equals(this.displayName, topReviewerDto.displayName) &&
        Objects.equals(this.displayImageThumbnailPath, topReviewerDto.displayImageThumbnailPath) &&
        Objects.equals(this.displayImageThumbnailHttpsPath, topReviewerDto.displayImageThumbnailHttpsPath) &&
        Objects.equals(this.displayImageOriginalPath, topReviewerDto.displayImageOriginalPath) &&
        Objects.equals(this.displayImageOriginalHttpsPath, topReviewerDto.displayImageOriginalHttpsPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalTrueHelpfulCount, totalReviewCount, totalHelpfulCount, totalFalseHelpfulCount, reviewerRank, rankingScore, ranking, member, displayName, displayImageThumbnailPath, displayImageThumbnailHttpsPath, displayImageOriginalPath, displayImageOriginalHttpsPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopReviewerDto {\n");
    
    sb.append("    totalTrueHelpfulCount: ").append(toIndentedString(totalTrueHelpfulCount)).append("\n");
    sb.append("    totalReviewCount: ").append(toIndentedString(totalReviewCount)).append("\n");
    sb.append("    totalHelpfulCount: ").append(toIndentedString(totalHelpfulCount)).append("\n");
    sb.append("    totalFalseHelpfulCount: ").append(toIndentedString(totalFalseHelpfulCount)).append("\n");
    sb.append("    reviewerRank: ").append(toIndentedString(reviewerRank)).append("\n");
    sb.append("    rankingScore: ").append(toIndentedString(rankingScore)).append("\n");
    sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    displayImageThumbnailPath: ").append(toIndentedString(displayImageThumbnailPath)).append("\n");
    sb.append("    displayImageThumbnailHttpsPath: ").append(toIndentedString(displayImageThumbnailHttpsPath)).append("\n");
    sb.append("    displayImageOriginalPath: ").append(toIndentedString(displayImageOriginalPath)).append("\n");
    sb.append("    displayImageOriginalHttpsPath: ").append(toIndentedString(displayImageOriginalHttpsPath)).append("\n");
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

  public static TopReviewerDtoBuilder builder() {
    return new TopReviewerDtoBuilder();
  }

  public static class TopReviewerDtoBuilder {

    private Long totalTrueHelpfulCount = null;
    private Long totalReviewCount = null;
    private Long totalHelpfulCount = null;
    private Long totalFalseHelpfulCount = null;
    private String reviewerRank = null;
    private Integer rankingScore = null;
    private Integer ranking = null;
    private MemberInfoDto member = null;
    private String displayName = null;
    private String displayImageThumbnailPath = null;
    private String displayImageThumbnailHttpsPath = null;
    private String displayImageOriginalPath = null;
    private String displayImageOriginalHttpsPath = null;
    

    TopReviewerDtoBuilder() {
    }

    /**
     **/
    public TopReviewerDtoBuilder totalTrueHelpfulCount(Long totalTrueHelpfulCount) {
      this.totalTrueHelpfulCount = totalTrueHelpfulCount;
      return this;
    }

    /**
     **/
    public TopReviewerDtoBuilder totalReviewCount(Long totalReviewCount) {
      this.totalReviewCount = totalReviewCount;
      return this;
    }

    /**
     **/
    public TopReviewerDtoBuilder totalHelpfulCount(Long totalHelpfulCount) {
      this.totalHelpfulCount = totalHelpfulCount;
      return this;
    }

    /**
     **/
    public TopReviewerDtoBuilder totalFalseHelpfulCount(Long totalFalseHelpfulCount) {
      this.totalFalseHelpfulCount = totalFalseHelpfulCount;
      return this;
    }

    /**
     **/
    public TopReviewerDtoBuilder reviewerRank(String reviewerRank) {
      this.reviewerRank = reviewerRank;
      return this;
    }

    /**
     **/
    public TopReviewerDtoBuilder rankingScore(Integer rankingScore) {
      this.rankingScore = rankingScore;
      return this;
    }

    /**
     **/
    public TopReviewerDtoBuilder ranking(Integer ranking) {
      this.ranking = ranking;
      return this;
    }

    /**
     **/
    public TopReviewerDtoBuilder member(MemberInfoDto member) {
      this.member = member;
      return this;
    }

    /**
     **/
    public TopReviewerDtoBuilder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     **/
    public TopReviewerDtoBuilder displayImageThumbnailPath(String displayImageThumbnailPath) {
      this.displayImageThumbnailPath = displayImageThumbnailPath;
      return this;
    }

    /**
     **/
    public TopReviewerDtoBuilder displayImageThumbnailHttpsPath(String displayImageThumbnailHttpsPath) {
      this.displayImageThumbnailHttpsPath = displayImageThumbnailHttpsPath;
      return this;
    }

    /**
     **/
    public TopReviewerDtoBuilder displayImageOriginalPath(String displayImageOriginalPath) {
      this.displayImageOriginalPath = displayImageOriginalPath;
      return this;
    }

    /**
     **/
    public TopReviewerDtoBuilder displayImageOriginalHttpsPath(String displayImageOriginalHttpsPath) {
      this.displayImageOriginalHttpsPath = displayImageOriginalHttpsPath;
      return this;
    }


    public TopReviewerDto build() {
      TopReviewerDto topReviewerDto = new TopReviewerDto();
      topReviewerDto.setTotalTrueHelpfulCount(this.totalTrueHelpfulCount);
      topReviewerDto.setTotalReviewCount(this.totalReviewCount);
      topReviewerDto.setTotalHelpfulCount(this.totalHelpfulCount);
      topReviewerDto.setTotalFalseHelpfulCount(this.totalFalseHelpfulCount);
      topReviewerDto.setReviewerRank(this.reviewerRank);
      topReviewerDto.setRankingScore(this.rankingScore);
      topReviewerDto.setRanking(this.ranking);
      topReviewerDto.setMember(this.member);
      topReviewerDto.setDisplayName(this.displayName);
      topReviewerDto.setDisplayImageThumbnailPath(this.displayImageThumbnailPath);
      topReviewerDto.setDisplayImageThumbnailHttpsPath(this.displayImageThumbnailHttpsPath);
      topReviewerDto.setDisplayImageOriginalPath(this.displayImageOriginalPath);
      topReviewerDto.setDisplayImageOriginalHttpsPath(this.displayImageOriginalHttpsPath);
      return topReviewerDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class TopReviewerDtoBuilder {\n");
      
      sb.append("    totalTrueHelpfulCount: ").append(toIndentedString(totalTrueHelpfulCount)).append("\n");
      sb.append("    totalReviewCount: ").append(toIndentedString(totalReviewCount)).append("\n");
      sb.append("    totalHelpfulCount: ").append(toIndentedString(totalHelpfulCount)).append("\n");
      sb.append("    totalFalseHelpfulCount: ").append(toIndentedString(totalFalseHelpfulCount)).append("\n");
      sb.append("    reviewerRank: ").append(toIndentedString(reviewerRank)).append("\n");
      sb.append("    rankingScore: ").append(toIndentedString(rankingScore)).append("\n");
      sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
      sb.append("    member: ").append(toIndentedString(member)).append("\n");
      sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
      sb.append("    displayImageThumbnailPath: ").append(toIndentedString(displayImageThumbnailPath)).append("\n");
      sb.append("    displayImageThumbnailHttpsPath: ").append(toIndentedString(displayImageThumbnailHttpsPath)).append("\n");
      sb.append("    displayImageOriginalPath: ").append(toIndentedString(displayImageOriginalPath)).append("\n");
      sb.append("    displayImageOriginalHttpsPath: ").append(toIndentedString(displayImageOriginalHttpsPath)).append("\n");
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

