package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class SellerReviewFormDto   {
  
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
  private Long sellerReviewId = null;
  private Long reviewId = null;
  private Integer rating = null;
  private String locale = null;
  private String content = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("sellerReviewId")
  @com.fasterxml.jackson.annotation.JsonProperty("sellerReviewId")
  public Long getSellerReviewId() {
    return sellerReviewId;
  }
  
  /**
   **/
  public void setSellerReviewId(Long sellerReviewId) {
    this.sellerReviewId = sellerReviewId;
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SellerReviewFormDto sellerReviewFormDto = (SellerReviewFormDto) o;
    return Objects.equals(this.vendorItemId, sellerReviewFormDto.vendorItemId) &&
        Objects.equals(this.userAgentType, sellerReviewFormDto.userAgentType) &&
        Objects.equals(this.sellerReviewId, sellerReviewFormDto.sellerReviewId) &&
        Objects.equals(this.reviewId, sellerReviewFormDto.reviewId) &&
        Objects.equals(this.rating, sellerReviewFormDto.rating) &&
        Objects.equals(this.locale, sellerReviewFormDto.locale) &&
        Objects.equals(this.content, sellerReviewFormDto.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorItemId, userAgentType, sellerReviewId, reviewId, rating, locale, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellerReviewFormDto {\n");
    
    sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
    sb.append("    userAgentType: ").append(toIndentedString(userAgentType)).append("\n");
    sb.append("    sellerReviewId: ").append(toIndentedString(sellerReviewId)).append("\n");
    sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

  public static SellerReviewFormDtoBuilder builder() {
    return new SellerReviewFormDtoBuilder();
  }

  public static class SellerReviewFormDtoBuilder {

    private Long vendorItemId = null;
    private UserAgentTypeEnum userAgentType = null;
    private Long sellerReviewId = null;
    private Long reviewId = null;
    private Integer rating = null;
    private String locale = null;
    private String content = null;
    

    SellerReviewFormDtoBuilder() {
    }

    /**
     **/
    public SellerReviewFormDtoBuilder vendorItemId(Long vendorItemId) {
      this.vendorItemId = vendorItemId;
      return this;
    }

    /**
     **/
    public SellerReviewFormDtoBuilder userAgentType(UserAgentTypeEnum userAgentType) {
      this.userAgentType = userAgentType;
      return this;
    }

    /**
     **/
    public SellerReviewFormDtoBuilder sellerReviewId(Long sellerReviewId) {
      this.sellerReviewId = sellerReviewId;
      return this;
    }

    /**
     **/
    public SellerReviewFormDtoBuilder reviewId(Long reviewId) {
      this.reviewId = reviewId;
      return this;
    }

    /**
     **/
    public SellerReviewFormDtoBuilder rating(Integer rating) {
      this.rating = rating;
      return this;
    }

    /**
     **/
    public SellerReviewFormDtoBuilder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     **/
    public SellerReviewFormDtoBuilder content(String content) {
      this.content = content;
      return this;
    }


    public SellerReviewFormDto build() {
      SellerReviewFormDto sellerReviewFormDto = new SellerReviewFormDto();
      sellerReviewFormDto.setVendorItemId(this.vendorItemId);
      sellerReviewFormDto.setUserAgentType(this.userAgentType);
      sellerReviewFormDto.setSellerReviewId(this.sellerReviewId);
      sellerReviewFormDto.setReviewId(this.reviewId);
      sellerReviewFormDto.setRating(this.rating);
      sellerReviewFormDto.setLocale(this.locale);
      sellerReviewFormDto.setContent(this.content);
      return sellerReviewFormDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SellerReviewFormDtoBuilder {\n");
      
      sb.append("    vendorItemId: ").append(toIndentedString(vendorItemId)).append("\n");
      sb.append("    userAgentType: ").append(toIndentedString(userAgentType)).append("\n");
      sb.append("    sellerReviewId: ").append(toIndentedString(sellerReviewId)).append("\n");
      sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
      sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
      sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
      sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

