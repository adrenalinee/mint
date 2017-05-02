package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.ReviewBannerImageDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class HomeReviewBannerDto   {
  
  private ReviewBannerImageDto reviewBannerImage = null;
  private ReviewBannerImageDto landingPcImage = null;
  private String landingPageWebUrl = null;
  private String landingPageMobileUrl = null;
  private ReviewBannerImageDto landingMobileImage = null;
  private Integer index = null;
  private String bannerImageUrl = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewBannerImage")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewBannerImage")
  public ReviewBannerImageDto getReviewBannerImage() {
    return reviewBannerImage;
  }
  
  /**
   **/
  public void setReviewBannerImage(ReviewBannerImageDto reviewBannerImage) {
    this.reviewBannerImage = reviewBannerImage;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("landingPcImage")
  @com.fasterxml.jackson.annotation.JsonProperty("landingPcImage")
  public ReviewBannerImageDto getLandingPcImage() {
    return landingPcImage;
  }
  
  /**
   **/
  public void setLandingPcImage(ReviewBannerImageDto landingPcImage) {
    this.landingPcImage = landingPcImage;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("landingPageWebUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("landingPageWebUrl")
  public String getLandingPageWebUrl() {
    return landingPageWebUrl;
  }
  
  /**
   **/
  public void setLandingPageWebUrl(String landingPageWebUrl) {
    this.landingPageWebUrl = landingPageWebUrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("landingPageMobileUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("landingPageMobileUrl")
  public String getLandingPageMobileUrl() {
    return landingPageMobileUrl;
  }
  
  /**
   **/
  public void setLandingPageMobileUrl(String landingPageMobileUrl) {
    this.landingPageMobileUrl = landingPageMobileUrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("landingMobileImage")
  @com.fasterxml.jackson.annotation.JsonProperty("landingMobileImage")
  public ReviewBannerImageDto getLandingMobileImage() {
    return landingMobileImage;
  }
  
  /**
   **/
  public void setLandingMobileImage(ReviewBannerImageDto landingMobileImage) {
    this.landingMobileImage = landingMobileImage;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("index")
  @com.fasterxml.jackson.annotation.JsonProperty("index")
  public Integer getIndex() {
    return index;
  }
  
  /**
   **/
  public void setIndex(Integer index) {
    this.index = index;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("bannerImageUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("bannerImageUrl")
  public String getBannerImageUrl() {
    return bannerImageUrl;
  }
  
  /**
   **/
  public void setBannerImageUrl(String bannerImageUrl) {
    this.bannerImageUrl = bannerImageUrl;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HomeReviewBannerDto homeReviewBannerDto = (HomeReviewBannerDto) o;
    return Objects.equals(this.reviewBannerImage, homeReviewBannerDto.reviewBannerImage) &&
        Objects.equals(this.landingPcImage, homeReviewBannerDto.landingPcImage) &&
        Objects.equals(this.landingPageWebUrl, homeReviewBannerDto.landingPageWebUrl) &&
        Objects.equals(this.landingPageMobileUrl, homeReviewBannerDto.landingPageMobileUrl) &&
        Objects.equals(this.landingMobileImage, homeReviewBannerDto.landingMobileImage) &&
        Objects.equals(this.index, homeReviewBannerDto.index) &&
        Objects.equals(this.bannerImageUrl, homeReviewBannerDto.bannerImageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewBannerImage, landingPcImage, landingPageWebUrl, landingPageMobileUrl, landingMobileImage, index, bannerImageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HomeReviewBannerDto {\n");
    
    sb.append("    reviewBannerImage: ").append(toIndentedString(reviewBannerImage)).append("\n");
    sb.append("    landingPcImage: ").append(toIndentedString(landingPcImage)).append("\n");
    sb.append("    landingPageWebUrl: ").append(toIndentedString(landingPageWebUrl)).append("\n");
    sb.append("    landingPageMobileUrl: ").append(toIndentedString(landingPageMobileUrl)).append("\n");
    sb.append("    landingMobileImage: ").append(toIndentedString(landingMobileImage)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    bannerImageUrl: ").append(toIndentedString(bannerImageUrl)).append("\n");
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

  public static HomeReviewBannerDtoBuilder builder() {
    return new HomeReviewBannerDtoBuilder();
  }

  public static class HomeReviewBannerDtoBuilder {

    private ReviewBannerImageDto reviewBannerImage = null;
    private ReviewBannerImageDto landingPcImage = null;
    private String landingPageWebUrl = null;
    private String landingPageMobileUrl = null;
    private ReviewBannerImageDto landingMobileImage = null;
    private Integer index = null;
    private String bannerImageUrl = null;
    

    HomeReviewBannerDtoBuilder() {
    }

    /**
     **/
    public HomeReviewBannerDtoBuilder reviewBannerImage(ReviewBannerImageDto reviewBannerImage) {
      this.reviewBannerImage = reviewBannerImage;
      return this;
    }

    /**
     **/
    public HomeReviewBannerDtoBuilder landingPcImage(ReviewBannerImageDto landingPcImage) {
      this.landingPcImage = landingPcImage;
      return this;
    }

    /**
     **/
    public HomeReviewBannerDtoBuilder landingPageWebUrl(String landingPageWebUrl) {
      this.landingPageWebUrl = landingPageWebUrl;
      return this;
    }

    /**
     **/
    public HomeReviewBannerDtoBuilder landingPageMobileUrl(String landingPageMobileUrl) {
      this.landingPageMobileUrl = landingPageMobileUrl;
      return this;
    }

    /**
     **/
    public HomeReviewBannerDtoBuilder landingMobileImage(ReviewBannerImageDto landingMobileImage) {
      this.landingMobileImage = landingMobileImage;
      return this;
    }

    /**
     **/
    public HomeReviewBannerDtoBuilder index(Integer index) {
      this.index = index;
      return this;
    }

    /**
     **/
    public HomeReviewBannerDtoBuilder bannerImageUrl(String bannerImageUrl) {
      this.bannerImageUrl = bannerImageUrl;
      return this;
    }


    public HomeReviewBannerDto build() {
      HomeReviewBannerDto homeReviewBannerDto = new HomeReviewBannerDto();
      homeReviewBannerDto.setReviewBannerImage(this.reviewBannerImage);
      homeReviewBannerDto.setLandingPcImage(this.landingPcImage);
      homeReviewBannerDto.setLandingPageWebUrl(this.landingPageWebUrl);
      homeReviewBannerDto.setLandingPageMobileUrl(this.landingPageMobileUrl);
      homeReviewBannerDto.setLandingMobileImage(this.landingMobileImage);
      homeReviewBannerDto.setIndex(this.index);
      homeReviewBannerDto.setBannerImageUrl(this.bannerImageUrl);
      return homeReviewBannerDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HomeReviewBannerDtoBuilder {\n");
      
      sb.append("    reviewBannerImage: ").append(toIndentedString(reviewBannerImage)).append("\n");
      sb.append("    landingPcImage: ").append(toIndentedString(landingPcImage)).append("\n");
      sb.append("    landingPageWebUrl: ").append(toIndentedString(landingPageWebUrl)).append("\n");
      sb.append("    landingPageMobileUrl: ").append(toIndentedString(landingPageMobileUrl)).append("\n");
      sb.append("    landingMobileImage: ").append(toIndentedString(landingMobileImage)).append("\n");
      sb.append("    index: ").append(toIndentedString(index)).append("\n");
      sb.append("    bannerImageUrl: ").append(toIndentedString(bannerImageUrl)).append("\n");
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

