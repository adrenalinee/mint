package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayExhibitionCategoryDto   {
  
  private String categoryName = null;
  private String categoryCode = null;
  private Map<String, String> asset = new HashMap<String, String>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("categoryName")
  @com.fasterxml.jackson.annotation.JsonProperty("categoryName")
  public String getCategoryName() {
    return categoryName;
  }
  
  /**
   **/
  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("categoryCode")
  @com.fasterxml.jackson.annotation.JsonProperty("categoryCode")
  public String getCategoryCode() {
    return categoryCode;
  }
  
  /**
   **/
  public void setCategoryCode(String categoryCode) {
    this.categoryCode = categoryCode;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("asset")
  @com.fasterxml.jackson.annotation.JsonProperty("asset")
  public Map<String, String> getAsset() {
    return asset;
  }
  
  /**
   **/
  public void setAsset(Map<String, String> asset) {
    this.asset = asset;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayExhibitionCategoryDto displayExhibitionCategoryDto = (DisplayExhibitionCategoryDto) o;
    return Objects.equals(this.categoryName, displayExhibitionCategoryDto.categoryName) &&
        Objects.equals(this.categoryCode, displayExhibitionCategoryDto.categoryCode) &&
        Objects.equals(this.asset, displayExhibitionCategoryDto.asset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryName, categoryCode, asset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayExhibitionCategoryDto {\n");
    
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
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

  public static DisplayExhibitionCategoryDtoBuilder builder() {
    return new DisplayExhibitionCategoryDtoBuilder();
  }

  public static class DisplayExhibitionCategoryDtoBuilder {

    private String categoryName = null;
    private String categoryCode = null;
    private Map<String, String> asset = new HashMap<String, String>();
    

    DisplayExhibitionCategoryDtoBuilder() {
    }

    /**
     **/
    public DisplayExhibitionCategoryDtoBuilder categoryName(String categoryName) {
      this.categoryName = categoryName;
      return this;
    }

    /**
     **/
    public DisplayExhibitionCategoryDtoBuilder categoryCode(String categoryCode) {
      this.categoryCode = categoryCode;
      return this;
    }

    /**
     **/
    public DisplayExhibitionCategoryDtoBuilder asset(Map<String, String> asset) {
      this.asset = asset;
      return this;
    }


    public DisplayExhibitionCategoryDto build() {
      DisplayExhibitionCategoryDto displayExhibitionCategoryDto = new DisplayExhibitionCategoryDto();
      displayExhibitionCategoryDto.setCategoryName(this.categoryName);
      displayExhibitionCategoryDto.setCategoryCode(this.categoryCode);
      displayExhibitionCategoryDto.setAsset(this.asset);
      return displayExhibitionCategoryDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayExhibitionCategoryDtoBuilder {\n");
      
      sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
      sb.append("    categoryCode: ").append(toIndentedString(categoryCode)).append("\n");
      sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
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

