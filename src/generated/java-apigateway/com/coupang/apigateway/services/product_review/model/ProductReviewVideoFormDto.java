package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.VideoAttachmentAddFormDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class ProductReviewVideoFormDto   {
  
  private List<VideoAttachmentAddFormDto> videoAttachments = new ArrayList<VideoAttachmentAddFormDto>();
  private String token = null;
  private Long reviewId = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("videoAttachments")
  @com.fasterxml.jackson.annotation.JsonProperty("videoAttachments")
  public List<VideoAttachmentAddFormDto> getVideoAttachments() {
    return videoAttachments;
  }
  
  /**
   **/
  public void setVideoAttachments(List<VideoAttachmentAddFormDto> videoAttachments) {
    this.videoAttachments = videoAttachments;
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
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductReviewVideoFormDto productReviewVideoFormDto = (ProductReviewVideoFormDto) o;
    return Objects.equals(this.videoAttachments, productReviewVideoFormDto.videoAttachments) &&
        Objects.equals(this.token, productReviewVideoFormDto.token) &&
        Objects.equals(this.reviewId, productReviewVideoFormDto.reviewId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoAttachments, token, reviewId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductReviewVideoFormDto {\n");
    
    sb.append("    videoAttachments: ").append(toIndentedString(videoAttachments)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
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

  public static ProductReviewVideoFormDtoBuilder builder() {
    return new ProductReviewVideoFormDtoBuilder();
  }

  public static class ProductReviewVideoFormDtoBuilder {

    private List<VideoAttachmentAddFormDto> videoAttachments = new ArrayList<VideoAttachmentAddFormDto>();
    private String token = null;
    private Long reviewId = null;
    

    ProductReviewVideoFormDtoBuilder() {
    }

    /**
     **/
    public ProductReviewVideoFormDtoBuilder videoAttachments(List<VideoAttachmentAddFormDto> videoAttachments) {
      this.videoAttachments = videoAttachments;
      return this;
    }

    /**
     **/
    public ProductReviewVideoFormDtoBuilder token(String token) {
      this.token = token;
      return this;
    }

    /**
     **/
    public ProductReviewVideoFormDtoBuilder reviewId(Long reviewId) {
      this.reviewId = reviewId;
      return this;
    }


    public ProductReviewVideoFormDto build() {
      ProductReviewVideoFormDto productReviewVideoFormDto = new ProductReviewVideoFormDto();
      productReviewVideoFormDto.setVideoAttachments(this.videoAttachments);
      productReviewVideoFormDto.setToken(this.token);
      productReviewVideoFormDto.setReviewId(this.reviewId);
      return productReviewVideoFormDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ProductReviewVideoFormDtoBuilder {\n");
      
      sb.append("    videoAttachments: ").append(toIndentedString(videoAttachments)).append("\n");
      sb.append("    token: ").append(toIndentedString(token)).append("\n");
      sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
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

