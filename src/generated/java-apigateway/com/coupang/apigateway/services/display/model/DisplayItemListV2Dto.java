package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import com.coupang.apigateway.services.display.model.DisplayItemDto;
import com.coupang.apigateway.services.display.model.DisplayItemListImageDto;
import java.util.*;
import java.util.Date;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayItemListV2Dto   {
  
  private String title = null;
  private Date startAt = null;
  private Map<String, DisplayItemListImageDto> listImagesMap = new HashMap<String, DisplayItemListImageDto>();
  private List<DisplayItemListImageDto> listImages = new ArrayList<DisplayItemListImageDto>();
  private Long listId = null;
  private List<DisplayItemDto> items = new ArrayList<DisplayItemDto>();
  private Map<String, String> extraDataMap = new HashMap<String, String>();
  private Date endAt = null;
  private String description = null;
  private Long dateGroupId = null;

  
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
  @org.codehaus.jackson.annotate.JsonProperty("startAt")
  @com.fasterxml.jackson.annotation.JsonProperty("startAt")
  public Date getStartAt() {
    return startAt;
  }
  
  /**
   **/
  public void setStartAt(Date startAt) {
    this.startAt = startAt;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("listImagesMap")
  @com.fasterxml.jackson.annotation.JsonProperty("listImagesMap")
  public Map<String, DisplayItemListImageDto> getListImagesMap() {
    return listImagesMap;
  }
  
  /**
   **/
  public void setListImagesMap(Map<String, DisplayItemListImageDto> listImagesMap) {
    this.listImagesMap = listImagesMap;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("listImages")
  @com.fasterxml.jackson.annotation.JsonProperty("listImages")
  public List<DisplayItemListImageDto> getListImages() {
    return listImages;
  }
  
  /**
   **/
  public void setListImages(List<DisplayItemListImageDto> listImages) {
    this.listImages = listImages;
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
  @org.codehaus.jackson.annotate.JsonProperty("endAt")
  @com.fasterxml.jackson.annotation.JsonProperty("endAt")
  public Date getEndAt() {
    return endAt;
  }
  
  /**
   **/
  public void setEndAt(Date endAt) {
    this.endAt = endAt;
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
  @org.codehaus.jackson.annotate.JsonProperty("dateGroupId")
  @com.fasterxml.jackson.annotation.JsonProperty("dateGroupId")
  public Long getDateGroupId() {
    return dateGroupId;
  }
  
  /**
   **/
  public void setDateGroupId(Long dateGroupId) {
    this.dateGroupId = dateGroupId;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayItemListV2Dto displayItemListV2Dto = (DisplayItemListV2Dto) o;
    return Objects.equals(this.title, displayItemListV2Dto.title) &&
        Objects.equals(this.startAt, displayItemListV2Dto.startAt) &&
        Objects.equals(this.listImagesMap, displayItemListV2Dto.listImagesMap) &&
        Objects.equals(this.listImages, displayItemListV2Dto.listImages) &&
        Objects.equals(this.listId, displayItemListV2Dto.listId) &&
        Objects.equals(this.items, displayItemListV2Dto.items) &&
        Objects.equals(this.extraDataMap, displayItemListV2Dto.extraDataMap) &&
        Objects.equals(this.endAt, displayItemListV2Dto.endAt) &&
        Objects.equals(this.description, displayItemListV2Dto.description) &&
        Objects.equals(this.dateGroupId, displayItemListV2Dto.dateGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, startAt, listImagesMap, listImages, listId, items, extraDataMap, endAt, description, dateGroupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayItemListV2Dto {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    listImagesMap: ").append(toIndentedString(listImagesMap)).append("\n");
    sb.append("    listImages: ").append(toIndentedString(listImages)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    extraDataMap: ").append(toIndentedString(extraDataMap)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateGroupId: ").append(toIndentedString(dateGroupId)).append("\n");
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

  public static DisplayItemListV2DtoBuilder builder() {
    return new DisplayItemListV2DtoBuilder();
  }

  public static class DisplayItemListV2DtoBuilder {

    private String title = null;
    private Date startAt = null;
    private Map<String, DisplayItemListImageDto> listImagesMap = new HashMap<String, DisplayItemListImageDto>();
    private List<DisplayItemListImageDto> listImages = new ArrayList<DisplayItemListImageDto>();
    private Long listId = null;
    private List<DisplayItemDto> items = new ArrayList<DisplayItemDto>();
    private Map<String, String> extraDataMap = new HashMap<String, String>();
    private Date endAt = null;
    private String description = null;
    private Long dateGroupId = null;
    

    DisplayItemListV2DtoBuilder() {
    }

    /**
     **/
    public DisplayItemListV2DtoBuilder title(String title) {
      this.title = title;
      return this;
    }

    /**
     **/
    public DisplayItemListV2DtoBuilder startAt(Date startAt) {
      this.startAt = startAt;
      return this;
    }

    /**
     **/
    public DisplayItemListV2DtoBuilder listImagesMap(Map<String, DisplayItemListImageDto> listImagesMap) {
      this.listImagesMap = listImagesMap;
      return this;
    }

    /**
     **/
    public DisplayItemListV2DtoBuilder listImages(List<DisplayItemListImageDto> listImages) {
      this.listImages = listImages;
      return this;
    }

    /**
     **/
    public DisplayItemListV2DtoBuilder listId(Long listId) {
      this.listId = listId;
      return this;
    }

    /**
     **/
    public DisplayItemListV2DtoBuilder items(List<DisplayItemDto> items) {
      this.items = items;
      return this;
    }

    /**
     **/
    public DisplayItemListV2DtoBuilder extraDataMap(Map<String, String> extraDataMap) {
      this.extraDataMap = extraDataMap;
      return this;
    }

    /**
     **/
    public DisplayItemListV2DtoBuilder endAt(Date endAt) {
      this.endAt = endAt;
      return this;
    }

    /**
     **/
    public DisplayItemListV2DtoBuilder description(String description) {
      this.description = description;
      return this;
    }

    /**
     **/
    public DisplayItemListV2DtoBuilder dateGroupId(Long dateGroupId) {
      this.dateGroupId = dateGroupId;
      return this;
    }


    public DisplayItemListV2Dto build() {
      DisplayItemListV2Dto displayItemListV2Dto = new DisplayItemListV2Dto();
      displayItemListV2Dto.setTitle(this.title);
      displayItemListV2Dto.setStartAt(this.startAt);
      displayItemListV2Dto.setListImagesMap(this.listImagesMap);
      displayItemListV2Dto.setListImages(this.listImages);
      displayItemListV2Dto.setListId(this.listId);
      displayItemListV2Dto.setItems(this.items);
      displayItemListV2Dto.setExtraDataMap(this.extraDataMap);
      displayItemListV2Dto.setEndAt(this.endAt);
      displayItemListV2Dto.setDescription(this.description);
      displayItemListV2Dto.setDateGroupId(this.dateGroupId);
      return displayItemListV2Dto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayItemListV2DtoBuilder {\n");
      
      sb.append("    title: ").append(toIndentedString(title)).append("\n");
      sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
      sb.append("    listImagesMap: ").append(toIndentedString(listImagesMap)).append("\n");
      sb.append("    listImages: ").append(toIndentedString(listImages)).append("\n");
      sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
      sb.append("    items: ").append(toIndentedString(items)).append("\n");
      sb.append("    extraDataMap: ").append(toIndentedString(extraDataMap)).append("\n");
      sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
      sb.append("    dateGroupId: ").append(toIndentedString(dateGroupId)).append("\n");
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

