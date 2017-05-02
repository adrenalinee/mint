package com.coupang.apigateway.services.recommendation.model;

import java.util.Objects;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:22.742+09:00")
public class CategoryDto   {
  
  private String tracking = null;
  private String categoryName = null;
  private Long categoryId = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("categoryId")
  @com.fasterxml.jackson.annotation.JsonProperty("categoryId")
  public Long getCategoryId() {
    return categoryId;
  }
  
  /**
   **/
  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryDto categoryDto = (CategoryDto) o;
    return Objects.equals(this.tracking, categoryDto.tracking) &&
        Objects.equals(this.categoryName, categoryDto.categoryName) &&
        Objects.equals(this.categoryId, categoryDto.categoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tracking, categoryName, categoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryDto {\n");
    
    sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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

  public static CategoryDtoBuilder builder() {
    return new CategoryDtoBuilder();
  }

  public static class CategoryDtoBuilder {

    private String tracking = null;
    private String categoryName = null;
    private Long categoryId = null;
    

    CategoryDtoBuilder() {
    }

    /**
     **/
    public CategoryDtoBuilder tracking(String tracking) {
      this.tracking = tracking;
      return this;
    }

    /**
     **/
    public CategoryDtoBuilder categoryName(String categoryName) {
      this.categoryName = categoryName;
      return this;
    }

    /**
     **/
    public CategoryDtoBuilder categoryId(Long categoryId) {
      this.categoryId = categoryId;
      return this;
    }


    public CategoryDto build() {
      CategoryDto categoryDto = new CategoryDto();
      categoryDto.setTracking(this.tracking);
      categoryDto.setCategoryName(this.categoryName);
      categoryDto.setCategoryId(this.categoryId);
      return categoryDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CategoryDtoBuilder {\n");
      
      sb.append("    tracking: ").append(toIndentedString(tracking)).append("\n");
      sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
      sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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

