package com.coupang.apigateway.services.recommendation.model;

import java.util.Objects;
import com.coupang.apigateway.services.recommendation.model.CategoryDto;
import java.util.*;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.742+09:00")
public class CategoryListDto   {
  
  private String tracking = null;
  private List<CategoryDto> categoryList = new ArrayList<CategoryDto>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("tracking")
  @com.fasterxml.jackson.annotation.JsonProperty("tracking")
  public String getTracking() {
    return tracking;
  }
  
  /**
   **/
  public void setTracking(String tracking) {
    this.tracking = tracking;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("categoryList")
  @com.fasterxml.jackson.annotation.JsonProperty("categoryList")
  public List<CategoryDto> getCategoryList() {
    return categoryList;
  }
  
  /**
   **/
  public void setCategoryList(List<CategoryDto> categoryList) {
    this.categoryList = categoryList;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryListDto categoryListDto = (CategoryListDto) o;
    return Objects.equals(this.tracking, categoryListDto.tracking) &&
        Objects.equals(this.categoryList, categoryListDto.categoryList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tracking, categoryList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryListDto {\n");
    
    sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
    sb.append("    categoryList: ").append(toIndentedString(categoryList)).append("\n");
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

  public static CategoryListDtoBuilder builder() {
    return new CategoryListDtoBuilder();
  }

  public static class CategoryListDtoBuilder {

    private String tracking = null;
    private List<CategoryDto> categoryList = new ArrayList<CategoryDto>();
    

    CategoryListDtoBuilder() {
    }

    /**
     **/
    public CategoryListDtoBuilder tracking(String tracking) {
      this.tracking = tracking;
      return this;
    }

    /**
     **/
    public CategoryListDtoBuilder categoryList(List<CategoryDto> categoryList) {
      this.categoryList = categoryList;
      return this;
    }


    public CategoryListDto build() {
      CategoryListDto categoryListDto = new CategoryListDto();
      categoryListDto.setTracking(this.tracking);
      categoryListDto.setCategoryList(this.categoryList);
      return categoryListDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CategoryListDtoBuilder {\n");
      
      sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
      sb.append("    categoryList: ").append(toIndentedString(categoryList)).append("\n");
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

