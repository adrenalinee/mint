package com.coupang.apigateway.services.product_review.model;

import java.util.Objects;
import com.coupang.apigateway.services.product_review.model.RatingAverageDto;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:20.997+09:00")
public class RatingAverageWithProductInfoDto   {
  
  private RatingAverageDto ratingAverageDto = null;
  private String itemImagePath = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("ratingAverageDto")
  @com.fasterxml.jackson.annotation.JsonProperty("ratingAverageDto")
  public RatingAverageDto getRatingAverageDto() {
    return ratingAverageDto;
  }
  
  /**
   **/
  public void setRatingAverageDto(RatingAverageDto ratingAverageDto) {
    this.ratingAverageDto = ratingAverageDto;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemImagePath")
  @com.fasterxml.jackson.annotation.JsonProperty("itemImagePath")
  public String getItemImagePath() {
    return itemImagePath;
  }
  
  /**
   **/
  public void setItemImagePath(String itemImagePath) {
    this.itemImagePath = itemImagePath;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatingAverageWithProductInfoDto ratingAverageWithProductInfoDto = (RatingAverageWithProductInfoDto) o;
    return Objects.equals(this.ratingAverageDto, ratingAverageWithProductInfoDto.ratingAverageDto) &&
        Objects.equals(this.itemImagePath, ratingAverageWithProductInfoDto.itemImagePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratingAverageDto, itemImagePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingAverageWithProductInfoDto {\n");
    
    sb.append("    ratingAverageDto: ").append(toIndentedString(ratingAverageDto)).append("\n");
    sb.append("    itemImagePath: ").append(toIndentedString(itemImagePath)).append("\n");
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

  public static RatingAverageWithProductInfoDtoBuilder builder() {
    return new RatingAverageWithProductInfoDtoBuilder();
  }

  public static class RatingAverageWithProductInfoDtoBuilder {

    private RatingAverageDto ratingAverageDto = null;
    private String itemImagePath = null;
    

    RatingAverageWithProductInfoDtoBuilder() {
    }

    /**
     **/
    public RatingAverageWithProductInfoDtoBuilder ratingAverageDto(RatingAverageDto ratingAverageDto) {
      this.ratingAverageDto = ratingAverageDto;
      return this;
    }

    /**
     **/
    public RatingAverageWithProductInfoDtoBuilder itemImagePath(String itemImagePath) {
      this.itemImagePath = itemImagePath;
      return this;
    }


    public RatingAverageWithProductInfoDto build() {
      RatingAverageWithProductInfoDto ratingAverageWithProductInfoDto = new RatingAverageWithProductInfoDto();
      ratingAverageWithProductInfoDto.setRatingAverageDto(this.ratingAverageDto);
      ratingAverageWithProductInfoDto.setItemImagePath(this.itemImagePath);
      return ratingAverageWithProductInfoDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RatingAverageWithProductInfoDtoBuilder {\n");
      
      sb.append("    ratingAverageDto: ").append(toIndentedString(ratingAverageDto)).append("\n");
      sb.append("    itemImagePath: ").append(toIndentedString(itemImagePath)).append("\n");
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

