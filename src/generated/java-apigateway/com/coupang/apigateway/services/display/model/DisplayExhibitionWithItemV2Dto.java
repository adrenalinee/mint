package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import com.coupang.apigateway.services.display.model.BenefitType;
import com.coupang.apigateway.services.display.model.DisplayItemDto;
import com.coupang.apigateway.services.display.model.DisplayItemImageDto;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayExhibitionWithItemV2Dto   {
  
  private String title = null;
  private List<String> searchKeywords = new ArrayList<String>();
  private Integer ordering = null;
  private Long listId = null;
  private Boolean lightExhibition = null;
  private List<DisplayItemDto> items = new ArrayList<DisplayItemDto>();
  private Map<String, DisplayItemImageDto> imageMap = new HashMap<String, DisplayItemImageDto>();
  private Map<String, String> extraDataMap = new HashMap<String, String>();
  private String description = null;
  private List<BenefitType> benefitTypes = new ArrayList<BenefitType>();
  private Map<String, List<DisplayBannerV2Dto>> bannersMap = new HashMap<String, List<DisplayBannerV2Dto>>();

  
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
  @org.codehaus.jackson.annotate.JsonProperty("items")
  @com.fasterxml.jackson.annotation.JsonProperty("items")
  public List<DisplayItemDto> getItems() {
    return items;
  }
  
  /**
   **/
  public void setItems(List<DisplayItemDto> items) {
    this.items = items;
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
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("benefitTypes")
  @com.fasterxml.jackson.annotation.JsonProperty("benefitTypes")
  public List<BenefitType> getBenefitTypes() {
    return benefitTypes;
  }
  
  /**
   **/
  public void setBenefitTypes(List<BenefitType> benefitTypes) {
    this.benefitTypes = benefitTypes;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("bannersMap")
  @com.fasterxml.jackson.annotation.JsonProperty("bannersMap")
  public Map<String, List<DisplayBannerV2Dto>> getBannersMap() {
    return bannersMap;
  }
  
  /**
   **/
  public void setBannersMap(Map<String, List<DisplayBannerV2Dto>> bannersMap) {
    this.bannersMap = bannersMap;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayExhibitionWithItemV2Dto displayExhibitionWithItemV2Dto = (DisplayExhibitionWithItemV2Dto) o;
    return Objects.equals(this.title, displayExhibitionWithItemV2Dto.title) &&
        Objects.equals(this.searchKeywords, displayExhibitionWithItemV2Dto.searchKeywords) &&
        Objects.equals(this.ordering, displayExhibitionWithItemV2Dto.ordering) &&
        Objects.equals(this.listId, displayExhibitionWithItemV2Dto.listId) &&
        Objects.equals(this.lightExhibition, displayExhibitionWithItemV2Dto.lightExhibition) &&
        Objects.equals(this.items, displayExhibitionWithItemV2Dto.items) &&
        Objects.equals(this.imageMap, displayExhibitionWithItemV2Dto.imageMap) &&
        Objects.equals(this.extraDataMap, displayExhibitionWithItemV2Dto.extraDataMap) &&
        Objects.equals(this.description, displayExhibitionWithItemV2Dto.description) &&
        Objects.equals(this.benefitTypes, displayExhibitionWithItemV2Dto.benefitTypes) &&
        Objects.equals(this.bannersMap, displayExhibitionWithItemV2Dto.bannersMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, searchKeywords, ordering, listId, lightExhibition, items, imageMap, extraDataMap, description, benefitTypes, bannersMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayExhibitionWithItemV2Dto {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    searchKeywords: ").append(toIndentedString(searchKeywords)).append("\n");
    sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    lightExhibition: ").append(toIndentedString(lightExhibition)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    imageMap: ").append(toIndentedString(imageMap)).append("\n");
    sb.append("    extraDataMap: ").append(toIndentedString(extraDataMap)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    benefitTypes: ").append(toIndentedString(benefitTypes)).append("\n");
    sb.append("    bannersMap: ").append(toIndentedString(bannersMap)).append("\n");
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

  public static DisplayExhibitionWithItemV2DtoBuilder builder() {
    return new DisplayExhibitionWithItemV2DtoBuilder();
  }

  public static class DisplayExhibitionWithItemV2DtoBuilder {

    private String title = null;
    private List<String> searchKeywords = new ArrayList<String>();
    private Integer ordering = null;
    private Long listId = null;
    private Boolean lightExhibition = null;
    private List<DisplayItemDto> items = new ArrayList<DisplayItemDto>();
    private Map<String, DisplayItemImageDto> imageMap = new HashMap<String, DisplayItemImageDto>();
    private Map<String, String> extraDataMap = new HashMap<String, String>();
    private String description = null;
    private List<BenefitType> benefitTypes = new ArrayList<BenefitType>();
    private Map<String, List<DisplayBannerV2Dto>> bannersMap = new HashMap<String, List<DisplayBannerV2Dto>>();
    

    DisplayExhibitionWithItemV2DtoBuilder() {
    }

    /**
     **/
    public DisplayExhibitionWithItemV2DtoBuilder title(String title) {
      this.title = title;
      return this;
    }

    /**
     **/
    public DisplayExhibitionWithItemV2DtoBuilder searchKeywords(List<String> searchKeywords) {
      this.searchKeywords = searchKeywords;
      return this;
    }

    /**
     **/
    public DisplayExhibitionWithItemV2DtoBuilder ordering(Integer ordering) {
      this.ordering = ordering;
      return this;
    }

    /**
     **/
    public DisplayExhibitionWithItemV2DtoBuilder listId(Long listId) {
      this.listId = listId;
      return this;
    }

    /**
     **/
    public DisplayExhibitionWithItemV2DtoBuilder lightExhibition(Boolean lightExhibition) {
      this.lightExhibition = lightExhibition;
      return this;
    }

    /**
     **/
    public DisplayExhibitionWithItemV2DtoBuilder items(List<DisplayItemDto> items) {
      this.items = items;
      return this;
    }

    /**
     **/
    public DisplayExhibitionWithItemV2DtoBuilder imageMap(Map<String, DisplayItemImageDto> imageMap) {
      this.imageMap = imageMap;
      return this;
    }

    /**
     **/
    public DisplayExhibitionWithItemV2DtoBuilder extraDataMap(Map<String, String> extraDataMap) {
      this.extraDataMap = extraDataMap;
      return this;
    }

    /**
     **/
    public DisplayExhibitionWithItemV2DtoBuilder description(String description) {
      this.description = description;
      return this;
    }

    /**
     **/
    public DisplayExhibitionWithItemV2DtoBuilder benefitTypes(List<BenefitType> benefitTypes) {
      this.benefitTypes = benefitTypes;
      return this;
    }

    /**
     **/
    public DisplayExhibitionWithItemV2DtoBuilder bannersMap(Map<String, List<DisplayBannerV2Dto>> bannersMap) {
      this.bannersMap = bannersMap;
      return this;
    }


    public DisplayExhibitionWithItemV2Dto build() {
      DisplayExhibitionWithItemV2Dto displayExhibitionWithItemV2Dto = new DisplayExhibitionWithItemV2Dto();
      displayExhibitionWithItemV2Dto.setTitle(this.title);
      displayExhibitionWithItemV2Dto.setSearchKeywords(this.searchKeywords);
      displayExhibitionWithItemV2Dto.setOrdering(this.ordering);
      displayExhibitionWithItemV2Dto.setListId(this.listId);
      displayExhibitionWithItemV2Dto.setLightExhibition(this.lightExhibition);
      displayExhibitionWithItemV2Dto.setItems(this.items);
      displayExhibitionWithItemV2Dto.setImageMap(this.imageMap);
      displayExhibitionWithItemV2Dto.setExtraDataMap(this.extraDataMap);
      displayExhibitionWithItemV2Dto.setDescription(this.description);
      displayExhibitionWithItemV2Dto.setBenefitTypes(this.benefitTypes);
      displayExhibitionWithItemV2Dto.setBannersMap(this.bannersMap);
      return displayExhibitionWithItemV2Dto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayExhibitionWithItemV2DtoBuilder {\n");
      
      sb.append("    title: ").append(toIndentedString(title)).append("\n");
      sb.append("    searchKeywords: ").append(toIndentedString(searchKeywords)).append("\n");
      sb.append("    ordering: ").append(toIndentedString(ordering)).append("\n");
      sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
      sb.append("    lightExhibition: ").append(toIndentedString(lightExhibition)).append("\n");
      sb.append("    items: ").append(toIndentedString(items)).append("\n");
      sb.append("    imageMap: ").append(toIndentedString(imageMap)).append("\n");
      sb.append("    extraDataMap: ").append(toIndentedString(extraDataMap)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
      sb.append("    benefitTypes: ").append(toIndentedString(benefitTypes)).append("\n");
      sb.append("    bannersMap: ").append(toIndentedString(bannersMap)).append("\n");
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

