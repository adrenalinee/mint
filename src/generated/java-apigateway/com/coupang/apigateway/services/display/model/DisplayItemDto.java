package com.coupang.apigateway.services.display.model;

import java.util.Objects;
import com.coupang.apigateway.services.display.model.DisplayItemImageDto;
import java.util.*;
import java.util.Map;





@javax.annotation.Generated(value = "class com.coupang.apigateway.pylon.VitaminClientCodegen", date = "2017-05-02T13:05:21.991+09:00")
public class DisplayItemDto   {
  
  private Long productId = null;
  private String linkUrl = null;


  public enum ItemTypeEnum {
    VITAMIN_PRODUCT("VITAMIN_PRODUCT"),
    VITAMIN_ITEM("VITAMIN_ITEM"),
    LINK("LINK"),
    PRODUCT("PRODUCT"),
    VENDOR_ITEM_PACKAGE("VENDOR_ITEM_PACKAGE");

    private String value;

    ItemTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @org.codehaus.jackson.annotate.JsonValue
    @com.fasterxml.jackson.annotation.JsonValue
    public String toString() {
      return value;
    }
  }

  private ItemTypeEnum itemType = null;
  private Map<String, DisplayItemImageDto> itemImagesMap = new HashMap<String, DisplayItemImageDto>();
  private List<DisplayItemImageDto> itemImages = new ArrayList<DisplayItemImageDto>();
  private Long itemId = null;
  private String description = null;
  private String benefitType = null;
  private Map<String, String> assetMap = new HashMap<String, String>();

  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("productId")
  @com.fasterxml.jackson.annotation.JsonProperty("productId")
  public Long getProductId() {
    return productId;
  }
  
  /**
   **/
  public void setProductId(Long productId) {
    this.productId = productId;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("linkUrl")
  @com.fasterxml.jackson.annotation.JsonProperty("linkUrl")
  public String getLinkUrl() {
    return linkUrl;
  }
  
  /**
   **/
  public void setLinkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemType")
  @com.fasterxml.jackson.annotation.JsonProperty("itemType")
  public ItemTypeEnum getItemType() {
    return itemType;
  }
  
  /**
   **/
  public void setItemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemImagesMap")
  @com.fasterxml.jackson.annotation.JsonProperty("itemImagesMap")
  public Map<String, DisplayItemImageDto> getItemImagesMap() {
    return itemImagesMap;
  }
  
  /**
   **/
  public void setItemImagesMap(Map<String, DisplayItemImageDto> itemImagesMap) {
    this.itemImagesMap = itemImagesMap;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemImages")
  @com.fasterxml.jackson.annotation.JsonProperty("itemImages")
  public List<DisplayItemImageDto> getItemImages() {
    return itemImages;
  }
  
  /**
   **/
  public void setItemImages(List<DisplayItemImageDto> itemImages) {
    this.itemImages = itemImages;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("itemId")
  @com.fasterxml.jackson.annotation.JsonProperty("itemId")
  public Long getItemId() {
    return itemId;
  }
  
  /**
   **/
  public void setItemId(Long itemId) {
    this.itemId = itemId;
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
  @org.codehaus.jackson.annotate.JsonProperty("benefitType")
  @com.fasterxml.jackson.annotation.JsonProperty("benefitType")
  public String getBenefitType() {
    return benefitType;
  }
  
  /**
   **/
  public void setBenefitType(String benefitType) {
    this.benefitType = benefitType;
  }
  
  @io.swagger.annotations.ApiModelProperty(value = "")
  @org.codehaus.jackson.annotate.JsonProperty("assetMap")
  @com.fasterxml.jackson.annotation.JsonProperty("assetMap")
  public Map<String, String> getAssetMap() {
    return assetMap;
  }
  
  /**
   **/
  public void setAssetMap(Map<String, String> assetMap) {
    this.assetMap = assetMap;
  }
  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayItemDto displayItemDto = (DisplayItemDto) o;
    return Objects.equals(this.productId, displayItemDto.productId) &&
        Objects.equals(this.linkUrl, displayItemDto.linkUrl) &&
        Objects.equals(this.itemType, displayItemDto.itemType) &&
        Objects.equals(this.itemImagesMap, displayItemDto.itemImagesMap) &&
        Objects.equals(this.itemImages, displayItemDto.itemImages) &&
        Objects.equals(this.itemId, displayItemDto.itemId) &&
        Objects.equals(this.description, displayItemDto.description) &&
        Objects.equals(this.benefitType, displayItemDto.benefitType) &&
        Objects.equals(this.assetMap, displayItemDto.assetMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, linkUrl, itemType, itemImagesMap, itemImages, itemId, description, benefitType, assetMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplayItemDto {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    itemImagesMap: ").append(toIndentedString(itemImagesMap)).append("\n");
    sb.append("    itemImages: ").append(toIndentedString(itemImages)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    benefitType: ").append(toIndentedString(benefitType)).append("\n");
    sb.append("    assetMap: ").append(toIndentedString(assetMap)).append("\n");
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

  public static DisplayItemDtoBuilder builder() {
    return new DisplayItemDtoBuilder();
  }

  public static class DisplayItemDtoBuilder {

    private Long productId = null;
    private String linkUrl = null;
    private ItemTypeEnum itemType = null;
    private Map<String, DisplayItemImageDto> itemImagesMap = new HashMap<String, DisplayItemImageDto>();
    private List<DisplayItemImageDto> itemImages = new ArrayList<DisplayItemImageDto>();
    private Long itemId = null;
    private String description = null;
    private String benefitType = null;
    private Map<String, String> assetMap = new HashMap<String, String>();
    

    DisplayItemDtoBuilder() {
    }

    /**
     **/
    public DisplayItemDtoBuilder productId(Long productId) {
      this.productId = productId;
      return this;
    }

    /**
     **/
    public DisplayItemDtoBuilder linkUrl(String linkUrl) {
      this.linkUrl = linkUrl;
      return this;
    }

    /**
     **/
    public DisplayItemDtoBuilder itemType(ItemTypeEnum itemType) {
      this.itemType = itemType;
      return this;
    }

    /**
     **/
    public DisplayItemDtoBuilder itemImagesMap(Map<String, DisplayItemImageDto> itemImagesMap) {
      this.itemImagesMap = itemImagesMap;
      return this;
    }

    /**
     **/
    public DisplayItemDtoBuilder itemImages(List<DisplayItemImageDto> itemImages) {
      this.itemImages = itemImages;
      return this;
    }

    /**
     **/
    public DisplayItemDtoBuilder itemId(Long itemId) {
      this.itemId = itemId;
      return this;
    }

    /**
     **/
    public DisplayItemDtoBuilder description(String description) {
      this.description = description;
      return this;
    }

    /**
     **/
    public DisplayItemDtoBuilder benefitType(String benefitType) {
      this.benefitType = benefitType;
      return this;
    }

    /**
     **/
    public DisplayItemDtoBuilder assetMap(Map<String, String> assetMap) {
      this.assetMap = assetMap;
      return this;
    }


    public DisplayItemDto build() {
      DisplayItemDto displayItemDto = new DisplayItemDto();
      displayItemDto.setProductId(this.productId);
      displayItemDto.setLinkUrl(this.linkUrl);
      displayItemDto.setItemType(this.itemType);
      displayItemDto.setItemImagesMap(this.itemImagesMap);
      displayItemDto.setItemImages(this.itemImages);
      displayItemDto.setItemId(this.itemId);
      displayItemDto.setDescription(this.description);
      displayItemDto.setBenefitType(this.benefitType);
      displayItemDto.setAssetMap(this.assetMap);
      return displayItemDto;
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DisplayItemDtoBuilder {\n");
      
      sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
      sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
      sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
      sb.append("    itemImagesMap: ").append(toIndentedString(itemImagesMap)).append("\n");
      sb.append("    itemImages: ").append(toIndentedString(itemImages)).append("\n");
      sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
      sb.append("    benefitType: ").append(toIndentedString(benefitType)).append("\n");
      sb.append("    assetMap: ").append(toIndentedString(assetMap)).append("\n");
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

