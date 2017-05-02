package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.RatingSummaryDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class RatingSummaryTotalDto   {
  
  private List<RatingSummaryDto> ratingSummaries = new ArrayList<RatingSummaryDto>();
  private Long ratingCount = null;
  private Double ratingAverage = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("ratingSummaries")
  @com.fasterxml.jackson.annotation.JsonProperty("ratingSummaries")
  public List<RatingSummaryDto> getRatingSummaries() {
    return ratingSummaries;
  }
  
  /**
   **/
  public void setRatingSummaries(List<RatingSummaryDto> ratingSummaries) {
    this.ratingSummaries = ratingSummaries;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("ratingCount")
  @com.fasterxml.jackson.annotation.JsonProperty("ratingCount")
  public Long getRatingCount() {
    return ratingCount;
  }
  
  /**
   **/
  public void setRatingCount(Long ratingCount) {
    this.ratingCount = ratingCount;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("ratingAverage")
  @com.fasterxml.jackson.annotation.JsonProperty("ratingAverage")
  public Double getRatingAverage() {
    return ratingAverage;
  }
  
  /**
   **/
  public void setRatingAverage(Double ratingAverage) {
    this.ratingAverage = ratingAverage;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatingSummaryTotalDto ratingSummaryTotalDto = (RatingSummaryTotalDto) o;
    return Objects.equals(this.ratingSummaries, ratingSummaryTotalDto.ratingSummaries) &&
        Objects.equals(this.ratingCount, ratingSummaryTotalDto.ratingCount) &&
        Objects.equals(this.ratingAverage, ratingSummaryTotalDto.ratingAverage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratingSummaries, ratingCount, ratingAverage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingSummaryTotalDto {\n");
    
    sb.append("    ratingSummaries: ").append(toIndentedString(ratingSummaries)).append("\n");
    sb.append("    ratingCount: ").append(toIndentedString(ratingCount)).append("\n");
    sb.append("    ratingAverage: ").append(toIndentedString(ratingAverage)).append("\n");
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

  public static RatingSummaryTotalDtoBuilder builder() {
    return new RatingSummaryTotalDtoBuilder();
  }

  public static class RatingSummaryTotalDtoBuilder {

    private List<RatingSummaryDto> ratingSummaries = new ArrayList<RatingSummaryDto>();
    private Long ratingCount = null;
    private Double ratingAverage = null;
    

    RatingSummaryTotalDtoBuilder() {
    }

    /**
     **/
    public RatingSummaryTotalDtoBuilder ratingSummaries(List<RatingSummaryDto> ratingSummaries) {
      this.ratingSummaries = ratingSummaries;
      return this;
    }

    /**
     **/
    public RatingSummaryTotalDtoBuilder ratingCount(Long ratingCount) {
      this.ratingCount = ratingCount;
      return this;
    }

    /**
     **/
    public RatingSummaryTotalDtoBuilder ratingAverage(Double ratingAverage) {
      this.ratingAverage = ratingAverage;
      return this;
    }


    public RatingSummaryTotalDto build() {
      RatingSummaryTotalDto ratingSummaryTotalDto = new RatingSummaryTotalDto();
      ratingSummaryTotalDto.setRatingSummaries(this.ratingSummaries);
      ratingSummaryTotalDto.setRatingCount(this.ratingCount);
      ratingSummaryTotalDto.setRatingAverage(this.ratingAverage);
      return ratingSummaryTotalDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RatingSummaryTotalDtoBuilder {\n");
      
      sb.append("    ratingSummaries: ").append(toIndentedString(ratingSummaries)).append("\n");
      sb.append("    ratingCount: ").append(toIndentedString(ratingCount)).append("\n");
      sb.append("    ratingAverage: ").append(toIndentedString(ratingAverage)).append("\n");
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

