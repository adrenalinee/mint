package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.ReviewBannerImageDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class AdventurerViewBannerDto   {
  
  private ReviewBannerImageDto reviewBannerImageDto = null;
  private String landingPcPageUrl = null;
  private ReviewBannerImageDto landingPcImageDto = null;
  private String landingMobilePageUrl = null;
  private ReviewBannerImageDto landingMobileImageDto = null;
  private String bannerImageUrl = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("reviewBannerImageDto")
  @com.fasterxml.jackson.annotation.JsonProperty("reviewBannerImageDto")
  public ReviewBannerImageDto getReviewBannerImageDto() {
    return reviewBannerImageDto;
  }
  
  /**
   **/
  public void setReviewBannerImageDto(ReviewBannerImageDto reviewBannerImageDto) {
    this.reviewBannerImageDto = reviewBannerImageDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("landingPcPageUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("landingPcPageUrl")
  public String getLandingPcPageUrl() {
    return landingPcPageUrl;
  }
  
  /**
   **/
  public void setLandingPcPageUrl(String landingPcPageUrl) {
    this.landingPcPageUrl = landingPcPageUrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("landingPcImageDto")
  @com.fasterxml.jackson.annotation.JsonProperty("landingPcImageDto")
  public ReviewBannerImageDto getLandingPcImageDto() {
    return landingPcImageDto;
  }
  
  /**
   **/
  public void setLandingPcImageDto(ReviewBannerImageDto landingPcImageDto) {
    this.landingPcImageDto = landingPcImageDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("landingMobilePageUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("landingMobilePageUrl")
  public String getLandingMobilePageUrl() {
    return landingMobilePageUrl;
  }
  
  /**
   **/
  public void setLandingMobilePageUrl(String landingMobilePageUrl) {
    this.landingMobilePageUrl = landingMobilePageUrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("landingMobileImageDto")
  @com.fasterxml.jackson.annotation.JsonProperty("landingMobileImageDto")
  public ReviewBannerImageDto getLandingMobileImageDto() {
    return landingMobileImageDto;
  }
  
  /**
   **/
  public void setLandingMobileImageDto(ReviewBannerImageDto landingMobileImageDto) {
    this.landingMobileImageDto = landingMobileImageDto;
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
    AdventurerViewBannerDto adventurerViewBannerDto = (AdventurerViewBannerDto) o;
    return Objects.equals(this.reviewBannerImageDto, adventurerViewBannerDto.reviewBannerImageDto) &&
        Objects.equals(this.landingPcPageUrl, adventurerViewBannerDto.landingPcPageUrl) &&
        Objects.equals(this.landingPcImageDto, adventurerViewBannerDto.landingPcImageDto) &&
        Objects.equals(this.landingMobilePageUrl, adventurerViewBannerDto.landingMobilePageUrl) &&
        Objects.equals(this.landingMobileImageDto, adventurerViewBannerDto.landingMobileImageDto) &&
        Objects.equals(this.bannerImageUrl, adventurerViewBannerDto.bannerImageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviewBannerImageDto, landingPcPageUrl, landingPcImageDto, landingMobilePageUrl, landingMobileImageDto, bannerImageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdventurerViewBannerDto {\n");
    
    sb.append("    reviewBannerImageDto: ").append(toIndentedString(reviewBannerImageDto)).append("\n");
    sb.append("    landingPcPageUrl: ").append(toIndentedString(landingPcPageUrl)).append("\n");
    sb.append("    landingPcImageDto: ").append(toIndentedString(landingPcImageDto)).append("\n");
    sb.append("    landingMobilePageUrl: ").append(toIndentedString(landingMobilePageUrl)).append("\n");
    sb.append("    landingMobileImageDto: ").append(toIndentedString(landingMobileImageDto)).append("\n");
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

  public static AdventurerViewBannerDtoBuilder builder() {
    return new AdventurerViewBannerDtoBuilder();
  }

  public static class AdventurerViewBannerDtoBuilder {

    private ReviewBannerImageDto reviewBannerImageDto = null;
    private String landingPcPageUrl = null;
    private ReviewBannerImageDto landingPcImageDto = null;
    private String landingMobilePageUrl = null;
    private ReviewBannerImageDto landingMobileImageDto = null;
    private String bannerImageUrl = null;
    

    AdventurerViewBannerDtoBuilder() {
    }

    /**
     **/
    public AdventurerViewBannerDtoBuilder reviewBannerImageDto(ReviewBannerImageDto reviewBannerImageDto) {
      this.reviewBannerImageDto = reviewBannerImageDto;
      return this;
    }

    /**
     **/
    public AdventurerViewBannerDtoBuilder landingPcPageUrl(String landingPcPageUrl) {
      this.landingPcPageUrl = landingPcPageUrl;
      return this;
    }

    /**
     **/
    public AdventurerViewBannerDtoBuilder landingPcImageDto(ReviewBannerImageDto landingPcImageDto) {
      this.landingPcImageDto = landingPcImageDto;
      return this;
    }

    /**
     **/
    public AdventurerViewBannerDtoBuilder landingMobilePageUrl(String landingMobilePageUrl) {
      this.landingMobilePageUrl = landingMobilePageUrl;
      return this;
    }

    /**
     **/
    public AdventurerViewBannerDtoBuilder landingMobileImageDto(ReviewBannerImageDto landingMobileImageDto) {
      this.landingMobileImageDto = landingMobileImageDto;
      return this;
    }

    /**
     **/
    public AdventurerViewBannerDtoBuilder bannerImageUrl(String bannerImageUrl) {
      this.bannerImageUrl = bannerImageUrl;
      return this;
    }


    public AdventurerViewBannerDto build() {
      AdventurerViewBannerDto adventurerViewBannerDto = new AdventurerViewBannerDto();
      adventurerViewBannerDto.setReviewBannerImageDto(this.reviewBannerImageDto);
      adventurerViewBannerDto.setLandingPcPageUrl(this.landingPcPageUrl);
      adventurerViewBannerDto.setLandingPcImageDto(this.landingPcImageDto);
      adventurerViewBannerDto.setLandingMobilePageUrl(this.landingMobilePageUrl);
      adventurerViewBannerDto.setLandingMobileImageDto(this.landingMobileImageDto);
      adventurerViewBannerDto.setBannerImageUrl(this.bannerImageUrl);
      return adventurerViewBannerDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AdventurerViewBannerDtoBuilder {\n");
      
      sb.append("    reviewBannerImageDto: ").append(toIndentedString(reviewBannerImageDto)).append("\n");
      sb.append("    landingPcPageUrl: ").append(toIndentedString(landingPcPageUrl)).append("\n");
      sb.append("    landingPcImageDto: ").append(toIndentedString(landingPcImageDto)).append("\n");
      sb.append("    landingMobilePageUrl: ").append(toIndentedString(landingMobilePageUrl)).append("\n");
      sb.append("    landingMobileImageDto: ").append(toIndentedString(landingMobileImageDto)).append("\n");
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

