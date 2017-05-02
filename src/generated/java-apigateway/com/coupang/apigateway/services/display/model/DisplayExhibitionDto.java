package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import com.coupang.apigateway.services.display.model.DisplayItemImageDto;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayExhibitionDto   {
  
  private String title = null;
  private List<String> searchKeywords = new ArrayList<String>();
  private Integer ordering = null;
  private Long listId = null;
  private Boolean lightExhibition = null;
  private Map<String, DisplayItemImageDto> imageMap = new HashMap<String, DisplayItemImageDto>();
  private Map<String, String> extraDataMap = new HashMap<String, String>();
  private String description = null;

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("title")
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  public String getTitle() {
    return title;
  }
  
  /**
   **/
  public void setTitle(String title) {
    this.title = title;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("searchKeywords")
  @com.fasterxml.jackson.annotation.JsonProperty("searchKeywords")
  public List<String> getSearchKeywords() {
    return searchKeywords;
  }
  
  /**
   **/
  public void setSearchKeywords(List<String> searchKeywords) {
    this.searchKeywords = searchKeywords;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("ordering")
  @com.fasterxml.jackson.annotation.JsonProperty("ordering")
  public Integer getOrdering() {
    return ordering;
  }
  
  /**
   **/
  public void setOrdering(Integer ordering) {
    this.ordering = ordering;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("listId")
  @com.fasterxml.jackson.annotation.JsonProperty("listId")
  public Long getListId() {
    return listId;
  }
  
  /**
   **/
  public void setListId(Long listId) {
    this.listId = listId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("lightExhibition")
  @com.fasterxml.jackson.annotation.JsonProperty("lightExhibition")
  public Boolean getLightExhibition() {
    return lightExhibition;
  }
  
  @org.codehaus.jackson.annotate.JsonIgnore
  @com.fasterxml.jackson.annotation.JsonIgnore
  public boolean isLightExhibition() {
    return lightExhibition == null ? false : lightExhibition;
  }
  
  /**
   **/
  public void setLightExhibition(Boolean lightExhibition) {
    this.lightExhibition = lightExhibition;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("imageMap")
  @com.fasterxml.jackson.annotation.JsonProperty("imageMap")
  public Map<String, DisplayItemImageDto> getImageMap() {
    return imageMap;
  }
  
  /**
   **/
  public void setImageMap(Map<String, DisplayItemImageDto> imageMap) {
    this.imageMap = imageMap;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("extraDataMap")
  @com.fasterxml.jackson.annotation.JsonProperty("extraDataMap")
  public Map<String, String> getExtraDataMap() {
    return extraDataMap;
  }
  
  /**
   **/
  public void setExtraDataMap(Map<String, String> extraDataMap) {
    this.extraDataMap = extraDataMap;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("description")
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  public String getDescription() {
    return description;
  }
  
  /**
   **/
  public void setDescription(String description) {
    this.description = description;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayExhibitionDto displayExhibitionDto = (DisplayExhibitionDto) o;
    return Objects.equals(this.title, displayExhibitionDto.title) &&
        Objects.equals(this.searchKeywords, displayExhibitionDto.searchKeywords) &&
        Objects.equals(this.ordering, displayExhibitionDto.ordering) &&
        Objects.equals(this.listId, displayExhibitionDto.listId) &&
        Objects.equals(this.lightExhibition, displayExhibitionDto.lightExhibition) &&
        Objects.equals(this.imageMap, displayExhibitionDto.imageMap) &&
        Objects.equals(this.extraDataMap, displayExhibitionDto.extraDataMap) &&
        Objects.equals(this.description, displayExhibitionDto.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, searchKeywords, ordering, listId, lightExhibition, imageMap, extraDataMap, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayExhibitionDto {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    searchKeywords: ").append(toIndentedString(searchKeywords)).append("\n");
    sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    lightExhibition: ").append(toIndentedString(lightExhibition)).append("\n");
    sb.append("    imageMap: ").append(toIndentedString(imageMap)).append("\n");
    sb.append("    extraDataMap: ").append(toIndentedString(extraDataMap)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

  public static DisplayExhibitionDtoBuilder builder() {
    return new DisplayExhibitionDtoBuilder();
  }

  public static class DisplayExhibitionDtoBuilder {

    private String title = null;
    private List<String> searchKeywords = new ArrayList<String>();
    private Integer ordering = null;
    private Long listId = null;
    private Boolean lightExhibition = null;
    private Map<String, DisplayItemImageDto> imageMap = new HashMap<String, DisplayItemImageDto>();
    private Map<String, String> extraDataMap = new HashMap<String, String>();
    private String description = null;
    

    DisplayExhibitionDtoBuilder() {
    }

    /**
     **/
    public DisplayExhibitionDtoBuilder title(String title) {
      this.title = title;
      return this;
    }

    /**
     **/
    public DisplayExhibitionDtoBuilder searchKeywords(List<String> searchKeywords) {
      this.searchKeywords = searchKeywords;
      return this;
    }

    /**
     **/
    public DisplayExhibitionDtoBuilder ordering(Integer ordering) {
      this.ordering = ordering;
      return this;
    }

    /**
     **/
    public DisplayExhibitionDtoBuilder listId(Long listId) {
      this.listId = listId;
      return this;
    }

    /**
     **/
    public DisplayExhibitionDtoBuilder lightExhibition(Boolean lightExhibition) {
      this.lightExhibition = lightExhibition;
      return this;
    }

    /**
     **/
    public DisplayExhibitionDtoBuilder imageMap(Map<String, DisplayItemImageDto> imageMap) {
      this.imageMap = imageMap;
      return this;
    }

    /**
     **/
    public DisplayExhibitionDtoBuilder extraDataMap(Map<String, String> extraDataMap) {
      this.extraDataMap = extraDataMap;
      return this;
    }

    /**
     **/
    public DisplayExhibitionDtoBuilder description(String description) {
      this.description = description;
      return this;
    }


    public DisplayExhibitionDto build() {
      DisplayExhibitionDto displayExhibitionDto = new DisplayExhibitionDto();
      displayExhibitionDto.setTitle(this.title);
      displayExhibitionDto.setSearchKeywords(this.searchKeywords);
      displayExhibitionDto.setOrdering(this.ordering);
      displayExhibitionDto.setListId(this.listId);
      displayExhibitionDto.setLightExhibition(this.lightExhibition);
      displayExhibitionDto.setImageMap(this.imageMap);
      displayExhibitionDto.setExtraDataMap(this.extraDataMap);
      displayExhibitionDto.setDescription(this.description);
      return displayExhibitionDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayExhibitionDtoBuilder {\n");
      
      sb.append("    title: ").append(toIndentedString(title)).append("\n");
      sb.append("    searchKeywords: ").append(toIndentedString(searchKeywords)).append("\n");
      sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
      sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
      sb.append("    lightExhibition: ").append(toIndentedString(lightExhibition)).append("\n");
      sb.append("    imageMap: ").append(toIndentedString(imageMap)).append("\n");
      sb.append("    extraDataMap: ").append(toIndentedString(extraDataMap)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

