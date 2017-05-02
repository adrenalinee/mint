package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import com.coupang.apigateway.services.display.model.DisplayExhibitionCategoryDto;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayExhibitionPageDto   {
  
  private Map<String, List<DisplayExhibitionDto>> exhibitionDtosMap = new HashMap<String, List<DisplayExhibitionDto>>();
  private List<DisplayExhibitionCategoryDto> categoryDtos = new ArrayList<DisplayExhibitionCategoryDto>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("exhibitionDtosMap")
  @com.fasterxml.jackson.annotation.JsonProperty("exhibitionDtosMap")
  public Map<String, List<DisplayExhibitionDto>> getExhibitionDtosMap() {
    return exhibitionDtosMap;
  }
  
  /**
   **/
  public void setExhibitionDtosMap(Map<String, List<DisplayExhibitionDto>> exhibitionDtosMap) {
    this.exhibitionDtosMap = exhibitionDtosMap;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("categoryDtos")
  @com.fasterxml.jackson.annotation.JsonProperty("categoryDtos")
  public List<DisplayExhibitionCategoryDto> getCategoryDtos() {
    return categoryDtos;
  }
  
  /**
   **/
  public void setCategoryDtos(List<DisplayExhibitionCategoryDto> categoryDtos) {
    this.categoryDtos = categoryDtos;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayExhibitionPageDto displayExhibitionPageDto = (DisplayExhibitionPageDto) o;
    return Objects.equals(this.exhibitionDtosMap, displayExhibitionPageDto.exhibitionDtosMap) &&
        Objects.equals(this.categoryDtos, displayExhibitionPageDto.categoryDtos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exhibitionDtosMap, categoryDtos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayExhibitionPageDto {\n");
    
    sb.append("    exhibitionDtosMap: ").append(toIndentedString(exhibitionDtosMap)).append("\n");
    sb.append("    categoryDtos: ").append(toIndentedString(categoryDtos)).append("\n");
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

  public static DisplayExhibitionPageDtoBuilder builder() {
    return new DisplayExhibitionPageDtoBuilder();
  }

  public static class DisplayExhibitionPageDtoBuilder {

    private Map<String, List<DisplayExhibitionDto>> exhibitionDtosMap = new HashMap<String, List<DisplayExhibitionDto>>();
    private List<DisplayExhibitionCategoryDto> categoryDtos = new ArrayList<DisplayExhibitionCategoryDto>();
    

    DisplayExhibitionPageDtoBuilder() {
    }

    /**
     **/
    public DisplayExhibitionPageDtoBuilder exhibitionDtosMap(Map<String, List<DisplayExhibitionDto>> exhibitionDtosMap) {
      this.exhibitionDtosMap = exhibitionDtosMap;
      return this;
    }

    /**
     **/
    public DisplayExhibitionPageDtoBuilder categoryDtos(List<DisplayExhibitionCategoryDto> categoryDtos) {
      this.categoryDtos = categoryDtos;
      return this;
    }


    public DisplayExhibitionPageDto build() {
      DisplayExhibitionPageDto displayExhibitionPageDto = new DisplayExhibitionPageDto();
      displayExhibitionPageDto.setExhibitionDtosMap(this.exhibitionDtosMap);
      displayExhibitionPageDto.setCategoryDtos(this.categoryDtos);
      return displayExhibitionPageDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayExhibitionPageDtoBuilder {\n");
      
      sb.append("    exhibitionDtosMap: ").append(toIndentedString(exhibitionDtosMap)).append("\n");
      sb.append("    categoryDtos: ").append(toIndentedString(categoryDtos)).append("\n");
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

